package com.jpexs.jxr.internal;

import java.io.IOException;
import com.jpexs.jxr.internal.generated.Entry;

/**
 * Entry points into the Java-translated Microsoft reference implementation.
 */
public final class PureCodec {

    private PureCodec() {
    }

    private static long input(Heap m, byte[] data) {
        long p = m.malloc(data.length + 8192L);
        m.put(p, data);
        m.fill(p + data.length, 0, 8192);
        return p;
    }

    private static IOException error(Heap m) {
        return new IOException("JPEG XR codec error: " + (int) Entry.port_error(m));
    }

    public static int[] probe(byte[] data) throws IOException {
        try {
            Heap m = new Heap();
            long p = input(m, data), info = m.malloc(16);
            if (Entry.port_probe(m, p, data.length, info) != 0) {
                throw error(m);
            }
            return new int[]{(int) m.load(info, 4), (int) m.load(info + 4, 4), (int) m.load(info + 8, 4), (int) m.load(info + 12, 4)};
        } catch (RuntimeException e) {
            throw new IOException("Invalid JPEG XR header", e);
        }
    }

    public static byte[] decode(byte[] data) throws IOException {
        try {
            Heap m = new Heap();
            long p = input(m, data), info = m.malloc(16);
            if (Entry.port_probe(m, p, data.length, info) != 0) {
                throw error(m);
            }
            int w = (int) m.load(info, 4), h = (int) m.load(info + 4, 4), kind = (int) m.load(info + 8, 4);
            long result = Entry.port_decode(m, p, data.length);
            if (result == 0) {
                throw error(m);
            }
            return m.bytes(result, w * h * (kind == 1 ? 4 : kind == 0 ? 3 : 1));
        } catch (RuntimeException e) {
            throw new IOException("Invalid or unsupported JPEG XR image", e);
        }
    }

    public static byte[] encode(byte[] pixels, int w, int h, int kind, float quality, float alpha, int chroma, int overlap) throws IOException {
        try {
            Heap m = new Heap();
            long p = m.malloc(pixels.length), size = m.malloc(4);
            m.put(p, pixels);
            long result = Entry.port_encode(m, p, w, h, kind, Math.round(quality * 100), Math.round(alpha * 100), chroma, overlap, size);
            if (result == 0) {
                throw error(m);
            }
            return m.bytes(result, (int) m.load(size, 4));
        } catch (RuntimeException e) {
            throw new IOException("JPEG XR encoding failed", e);
        }
    }
}
