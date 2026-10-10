package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKFormatConverter_GetSourcePixelFormat.
 */
public final class F0218_PKFormatConverter_GetSourcePixelFormat {

    private F0218_PKFormatConverter_GetSourcePixelFormat() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[8];
        v[0] = a0;
        v[1] = a1;
        int frame = m.stackPosition();
        int pc = 0, previous = -1;
        try {
            while (true) {
                int old = pc;
                switch (pc) {
                    case 0:
                        pc = b0(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKFormatConverter_GetSourcePixelFormat");
                }
                previous = old;
                if (pc < 0) {
                    return v[7];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 56L) + 36L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[3] + (Heap.s(0L, 32) * 66224L) + 4L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Dispatch.call(m, v[5], new long[]{v[3], v[1]});
        v[7] = v[6];
        return -1;
    }
}
