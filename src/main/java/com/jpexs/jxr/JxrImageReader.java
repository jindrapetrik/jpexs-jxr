package com.jpexs.jxr;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public final class JxrImageReader extends ImageReader {

    private byte[] encoded;
    private int[] info;

    public JxrImageReader(ImageReaderSpi provider) {
        super(provider);
    }

    @Override
    public void setInput(Object input, boolean forwardOnly, boolean ignoreMetadata) {
        super.setInput(input, forwardOnly, ignoreMetadata);
        encoded = null;
        info = null;
    }

    private void header(int index) throws IOException {
        if (index != 0) {
            throw new IndexOutOfBoundsException("JXR contains one image");
        }
        if (input == null) {
            throw new IllegalStateException("Input is not set");
        }
        if (info != null) {
            return;
        }
        ImageInputStream in = (ImageInputStream) input;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buffer = new byte[8192];
        int n;
        while ((n = in.read(buffer)) != -1) {
            if (n == 0) {
                int b = in.read();
                if (b == -1) {
                    break;
                }
                buffer[0] = (byte) b;
                n = 1;
            }
            if (out.size() > JxrCodec.MAX_ENCODED_BYTES - n) {
                throw new IIOException("JXR file exceeds 256 MiB");
            }
            out.write(buffer, 0, n);
        }
        byte[] data = out.toByteArray();
        int[] parsed = JxrCodec.probe(data);
        JxrCodec.checkSize(parsed[0], parsed[1]);
        encoded = data;
        info = parsed;
    }

    @Override
    public int getNumImages(boolean allowSearch) {
        if (input == null) {
            throw new IllegalStateException("Input is not set");
        }
        if (allowSearch && seekForwardOnly) {
            throw new IllegalStateException("Forward-only input");
        }
        return 1;
    }

    @Override
    public int getWidth(int index) throws IOException {
        header(index);
        return info[0];
    }

    @Override
    public int getHeight(int index) throws IOException {
        header(index);
        return info[1];
    }

    private int imageType() {
        return info[2] == 1 ? BufferedImage.TYPE_INT_ARGB : info[2] == 2 ? BufferedImage.TYPE_BYTE_GRAY
                : info[2] == 3 ? BufferedImage.TYPE_BYTE_BINARY : BufferedImage.TYPE_INT_RGB;
    }

    @Override
    public Iterator<ImageTypeSpecifier> getImageTypes(int index) throws IOException {
        header(index);
        return Collections.singletonList(ImageTypeSpecifier.createFromBufferedImageType(imageType())).iterator();
    }

    @Override
    public IIOMetadata getStreamMetadata() {
        return null;
    }

    @Override
    public IIOMetadata getImageMetadata(int index) throws IOException {
        header(index);
        return null;
    }

    @Override
    public BufferedImage read(int index, ImageReadParam param) throws IOException {
        header(index);
        clearAbortRequest();
        if (param != null && (param.getSourceBands() != null || param.getDestinationBands() != null)) {
            throw new IIOException("JXR band selection is not supported");
        }
        BufferedImage dst = getDestination(param, getImageTypes(index), info[0], info[1]);
        Rectangle srcRegion = new Rectangle(), dstRegion = new Rectangle();
        computeRegions(param, info[0], info[1], dst, srcRegion, dstRegion);
        processImageStarted(index);
        if (info[3] > (info[2] == 1 ? 32 : info[2] == 2 ? 8 : info[2] == 3 ? 1 : 24)) {
            processWarningOccurred("JXR high bit depth / HDR pixels are converted to 8 bits per channel");
        }
        byte[] pixels = JxrCodec.decode(encoded);
        int sx = param == null ? 1 : param.getSourceXSubsampling();
        int sy = param == null ? 1 : param.getSourceYSubsampling();
        int channels = info[2] == 0 ? 3 : info[2] == 1 ? 4 : 1;
        for (int y = 0; y < dstRegion.height; y++) {
            if (abortRequested()) {
                processReadAborted();
                return dst;
            }
            int p = ((srcRegion.y + y * sy) * info[0] + srcRegion.x) * channels;
            for (int x = 0; x < dstRegion.width; x++, p += sx * channels) {
                int dx = dstRegion.x + x, dy = dstRegion.y + y;
                if (info[2] >= 2 && dst.getType() == imageType()) {
                    dst.getRaster().setSample(dx, dy, 0, info[2] == 3 ? (pixels[p] & 255) / 255 : pixels[p] & 255);
                } else {
                    int r = pixels[p] & 255;
                    int g = channels > 1 ? pixels[p + 1] & 255 : r;
                    int b = channels > 1 ? pixels[p + 2] & 255 : r;
                    int a = channels == 4 ? pixels[p + 3] & 255 : 255;
                    dst.setRGB(dx, dy, a << 24 | r << 16 | g << 8 | b);
                }
            }
            processImageProgress(100f * (y + 1) / dstRegion.height);
        }
        processImageComplete();
        return dst;
    }

    @Override
    public void dispose() {
        encoded = null;
        info = null;
        super.dispose();
    }
}
