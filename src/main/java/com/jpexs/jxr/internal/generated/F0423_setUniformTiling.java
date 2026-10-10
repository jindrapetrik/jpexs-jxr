package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: setUniformTiling.
 */
public final class F0423_setUniformTiling {

    private F0423_setUniformTiling() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[40];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
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
                    case 5:
                        pc = b5(m, v, previous);
                        break;
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    case 7:
                        pc = b7(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in setUniformTiling");
                }
                previous = old;
                if (pc < 0) {
                    return v[39];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((v[2] + 4294967295L)) & 4294967295L;
        return 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi4 = (previous == 1 ? v[10] : 0L);
        long phi5 = (previous == 1 ? v[9] : v[1]);
        v[4] = phi4;
        v[5] = phi5;
        v[6] = ((v[3] + v[5])) & 4294967295L;
        v[7] = ((v[6] / v[5])) & 4294967295L;
        v[8] = v[7] > 65535L ? 1L : 0L;
        v[9] = ((v[5] + 1L)) & 4294967295L;
        v[10] = ((v[4] + 1L)) & 4294967295L;
        return v[8] != 0 ? 1 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = v[5] > 1L ? 1L : 0L;
        return v[11] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[12] = ((v[1] ^ 4294967295L)) & 4294967295L;
        v[13] = ((v[4] + v[12])) & 4294967295L;
        v[14] = ((v[13] & 1L)) & 4294967295L;
        v[15] = v[14] == 0L ? 1L : 0L;
        return v[15] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[16] = ((v[5] + 4294967295L)) & 4294967295L;
        v[17] = ((v[16] + v[2])) & 4294967295L;
        v[18] = ((v[17] / v[5])) & 4294967295L;
        m.store(v[0], v[18], 4);
        v[19] = ((v[2] - v[18])) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi20 = (previous == 3 ? v[2] : v[19]);
        long phi21 = (previous == 3 ? v[5] : v[16]);
        v[20] = phi20;
        v[21] = phi21;
        v[22] = ((2L - v[1])) & 4294967295L;
        v[23] = v[4] == v[22] ? 1L : 0L;
        return v[23] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi24 = (previous == 6 ? v[37] : v[20]);
        long phi25 = (previous == 6 ? v[32] : v[21]);
        v[24] = phi24;
        v[25] = phi25;
        v[26] = ((v[25] + 4294967295L)) & 4294967295L;
        v[27] = ((v[26] + v[24])) & 4294967295L;
        v[28] = ((v[27] / v[25])) & 4294967295L;
        v[29] = ((v[5] - v[25])) & 4294967295L;
        v[30] = (v[0] + (Heap.s(v[29], 32) * 4L)) & 4294967295L;
        m.store(v[30], v[28], 4);
        v[31] = ((v[24] - v[28])) & 4294967295L;
        v[32] = ((v[25] + 4294967294L)) & 4294967295L;
        v[33] = ((v[32] + v[31])) & 4294967295L;
        v[34] = ((v[33] / v[26])) & 4294967295L;
        v[35] = ((v[5] - v[26])) & 4294967295L;
        v[36] = (v[0] + (Heap.s(v[35], 32) * 4L)) & 4294967295L;
        m.store(v[36], v[34], 4);
        v[37] = ((v[31] - v[34])) & 4294967295L;
        v[38] = v[32] > 1L ? 1L : 0L;
        return v[38] != 0 ? 6 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[39] = v[5];
        return -1;
    }
}
