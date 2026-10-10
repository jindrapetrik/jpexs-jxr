package com.jpexs.jxr;

import java.io.IOException;
import com.jpexs.jxr.internal.PureCodec;

/**
 * Pure Java 8 codec boundary.
 */
final class JxrCodec {

    static final int MAX_ENCODED_BYTES = 256 * 1024 * 1024;
    static final long MAX_PIXELS = 64L * 1024 * 1024;

    private JxrCodec() {
    }

    static void checkSize(int width, int height) throws IOException {
        if (width <= 0 || height <= 0 || (long) width * height > MAX_PIXELS) {
            throw new IOException("Invalid or oversized JXR image (limit: " + MAX_PIXELS + " pixels)");
        }
    }

    static int[] probe(byte[] data) throws IOException {
        return PureCodec.probe(data);
    }

    static byte[] decode(byte[] data) throws IOException {
        return PureCodec.decode(data);
    }

    static byte[] encode(byte[] pixels, int w, int h, int kind, float quality, float alpha, int chroma, int overlap) throws IOException {
        return PureCodec.encode(pixels, w, h, kind, quality, alpha, chroma, overlap);
    }
}
