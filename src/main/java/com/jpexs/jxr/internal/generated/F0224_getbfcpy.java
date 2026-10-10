package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getbfcpy.
 */
public final class F0224_getbfcpy {

    private F0224_getbfcpy() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[11];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                        throw new IllegalStateException("Invalid block in getbfcpy");
                }
                previous = old;
                if (pc < 0) {
                    return v[10];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = ((v[4] + v[3])) & 4294967295L;
        v[6] = v[5] > v[2] ? 1L : 0L;
        return v[6] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(v[3], 32) * 1L)) & 4294967295L;
        v[8] = LibC.call(m, "memcpy", new long[]{v[0], v[7], v[4]});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi9 = (previous == 1 ? 0L : 4294967193L);
        v[9] = phi9;
        v[10] = v[9];
        return -1;
    }
}
