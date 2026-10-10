package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKFreeAligned.
 */
public final class F0034_PKFreeAligned {

    private F0034_PKFreeAligned() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[7];
        v[0] = a0;
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
                    case 3:
                        pc = b3(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKFreeAligned");
                }
                previous = old;
                if (pc < 0) {
                    return v[6];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = v[0] == 0L ? 1L : 0L;
        return v[1] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[2] = m.load(v[0], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[4] = (v[2] + (Heap.s(4294967292L, 32) * 1L)) & 4294967295L;
        v[5] = m.load(v[4], 4);
        LibC.call(m, "free", new long[]{v[5]});
        m.store(v[0], 0L, 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[6] = 0L;
        return -1;
    }
}
