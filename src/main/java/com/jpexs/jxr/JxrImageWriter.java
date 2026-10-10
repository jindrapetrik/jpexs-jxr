package com.jpexs.jxr;

import java.awt.Rectangle;
import java.awt.color.ColorSpace;
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.*;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.ImageOutputStream;

public final class JxrImageWriter extends ImageWriter {

    public JxrImageWriter(ImageWriterSpi provider) {
        super(provider);
    }

    @Override
    public ImageWriteParam getDefaultWriteParam() {
        return new JxrImageWriteParam(getLocale());
    }

    @Override
    public IIOMetadata getDefaultStreamMetadata(ImageWriteParam param) {
        return null;
    }

    @Override
    public IIOMetadata getDefaultImageMetadata(ImageTypeSpecifier type, ImageWriteParam param) {
        return null;
    }

    @Override
    public IIOMetadata convertStreamMetadata(IIOMetadata data, ImageWriteParam param) {
        return null;
    }

    @Override
    public IIOMetadata convertImageMetadata(IIOMetadata data, ImageTypeSpecifier type, ImageWriteParam param) {
        return null;
    }

    @Override
    public void write(IIOMetadata streamMetadata, IIOImage image, ImageWriteParam param) throws IOException {
        if (output == null) {
            throw new IllegalStateException("Output is not set");
        }
        if (image == null || image.hasRaster()) {
            throw new IllegalArgumentException("A RenderedImage is required");
        }
        if (param == null) {
            param = getDefaultWriteParam();
        }
        if (param.getSourceBands() != null) {
            throw new IIOException("JXR band selection is not supported");
        }
        RenderedImage src = image.getRenderedImage();
        ColorModel cm = src.getColorModel();
        if (cm == null) {
            throw new IIOException("Source image has no color model");
        }
        Rectangle region = new Rectangle(src.getMinX(), src.getMinY(), src.getWidth(), src.getHeight());
        if (param.getSourceRegion() != null) {
            region = region.intersection(param.getSourceRegion());
        }
        region.x += param.getSubsamplingXOffset();
        region.y += param.getSubsamplingYOffset();
        region.width -= param.getSubsamplingXOffset();
        region.height -= param.getSubsamplingYOffset();
        int sx = param.getSourceXSubsampling(), sy = param.getSourceYSubsampling();
        if (region.isEmpty()) {
            throw new IIOException("Empty source region");
        }
        int w = (region.width - 1) / sx + 1, h = (region.height - 1) / sy + 1;
        JxrCodec.checkSize(w, h);
        int kind = cm.hasAlpha() ? 1 : 0;
        if (!cm.hasAlpha() && cm.getColorSpace().getType() == ColorSpace.TYPE_GRAY && cm.getPixelSize() == 8) {
            kind = 2;
        }
        if (cm instanceof IndexColorModel) {
            IndexColorModel icm = (IndexColorModel) cm;
            if (icm.getMapSize() == 2 && !icm.hasAlpha()
                    && ((icm.getRGB(0) == 0xff000000 && icm.getRGB(1) == 0xffffffff)
                    || (icm.getRGB(1) == 0xff000000 && icm.getRGB(0) == 0xffffffff))) {
                kind = 3;
            }
        }
        int channels = kind == 0 ? 3 : kind == 1 ? 4 : 1;
        byte[] pixels = new byte[w * h * channels];
        clearAbortRequest();
        processImageStarted(0);
        Raster raster = src instanceof BufferedImage ? ((BufferedImage) src).getRaster() : src.getData(region);
        Object element = null;
        int p = 0;
        for (int y = 0; y < h; y++) {
            if (abortRequested()) {
                processWriteAborted();
                return;
            }
            for (int x = 0; x < w; x++) {
                int rx = region.x + x * sx, ry = region.y + y * sy;
                if (kind == 2) {
                    pixels[p++] = (byte) raster.getSample(rx, ry, 0);
                } else {
                    element = raster.getDataElements(rx, ry, element);
                    int argb = cm.getRGB(element);
                    if (kind == 3) {
                        pixels[p++] = (byte) (argb & 255);
                    } else {
                        pixels[p++] = (byte) (argb >> 16);
                        pixels[p++] = (byte) (argb >> 8);
                        pixels[p++] = (byte) argb;
                        if (kind == 1) {
                            pixels[p++] = (byte) (argb >>> 24);
                        }
                    }
                }
            }
            processImageProgress(40f * (y + 1) / h);
        }
        float quality = 1f, alphaQuality = 1f;
        int chroma = 3, overlap = -1;
        if (param.canWriteCompressed()) {
            if (param.getCompressionMode() == ImageWriteParam.MODE_DISABLED) {
                throw new IIOException("JXR always uses compression; use quality 1.0 for lossless");
            }
            if (param.getCompressionMode() == ImageWriteParam.MODE_EXPLICIT) {
                quality = param.getCompressionQuality();
            }
        }
        if (Float.isNaN(quality) || quality < 0 || quality > 1) {
            throw new IIOException("Invalid quality");
        }
        if (param instanceof JxrImageWriteParam) {
            JxrImageWriteParam jp = (JxrImageWriteParam) param;
            alphaQuality = jp.getAlphaQuality();
            chroma = jp.getChroma() == JxrImageWriteParam.Chroma.YUV444 ? 3 : jp.getChroma() == JxrImageWriteParam.Chroma.YUV422 ? 2 : 1;
            overlap = jp.getOverlap().ordinal() - 1;
        }
        if (quality == 1f && kind < 2 && chroma != 3) {
            throw new IIOException("Lossless encoding requires YUV444");
        }
        if (streamMetadata != null || image.getMetadata() != null) {
            processWarningOccurred(0, "JXR metadata is not written");
        }
        byte[] encoded = JxrCodec.encode(pixels, w, h, kind, quality, alphaQuality, chroma, overlap);
        if (abortRequested()) {
            processWriteAborted();
            return;
        }
        ((ImageOutputStream) output).write(encoded);
        processImageProgress(100f);
        processImageComplete();
    }
}
