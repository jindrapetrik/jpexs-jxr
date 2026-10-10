package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKCreateCodecFactory.
 */
public final class F0052_PKCreateCodecFactory {

    private F0052_PKCreateCodecFactory() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[9];
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKCreateCodecFactory");
                }
                previous = old;
                if (pc < 0) {
                    return v[8];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = LibC.call(m, "calloc", new long[]{1L, 16L});
        m.store(v[0], v[2], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[2], 1879048239L, 4);
        v[4] = (v[2] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        m.store(v[4], 1879048240L, 4);
        v[5] = (v[2] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        m.store(v[5], 1879048242L, 4);
        v[6] = (v[2] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        m.store(v[6], 1879048243L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi7 = (previous == 0 ? 4294967195L : 0L);
        v[7] = phi7;
        v[8] = v[7];
        return -1;
    }
}
