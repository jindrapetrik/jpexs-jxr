package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: dquantBits.
 */
public final class F0352_dquantBits {

    private F0352_dquantBits() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[8];
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
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in dquantBits");
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
        v[1] = v[0] < 2L ? 1L : 0L;
        return v[1] != 0 ? 4 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[2] = v[0] < 4L ? 1L : 0L;
        return v[2] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[3] = v[0] < 6L ? 1L : 0L;
        return v[3] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[4] = v[0] < 10L ? 1L : 0L;
        v[5] = v[4] != 0 ? 3L : 4L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi6 = (previous == 0 ? 0L : (previous == 1 ? 1L : (previous == 3 ? v[5] : 2L)));
        v[6] = phi6;
        v[7] = v[6];
        return -1;
    }
}
