package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib:
 * PKImageEncode_WritePixelsBandedBegin_WMP.
 */
public final class F0114_PKImageEncode_WritePixelsBandedBegin_WMP {

    private F0114_PKImageEncode_WritePixelsBandedBegin_WMP() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[5];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_WritePixelsBandedBegin_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[4];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65984L) & 4294967295L;
        m.store(v[2], 1L, 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65988L) & 4294967295L;
        m.store(v[3], v[1], 4);
        v[4] = 0L;
        return -1;
    }
}
