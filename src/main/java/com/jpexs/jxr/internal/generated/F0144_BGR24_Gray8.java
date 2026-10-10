package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: BGR24_Gray8.
 */
public final class F0144_BGR24_Gray8 {

    private F0144_BGR24_Gray8() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[65];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                    case 8:
                        pc = b8(m, v, previous);
                        break;
                    case 9:
                        pc = b9(m, v, previous);
                        break;
                    case 10:
                        pc = b10(m, v, previous);
                        break;
                    case 11:
                        pc = b11(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in BGR24_Gray8");
                }
                previous = old;
                if (pc < 0) {
                    return v[64];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[6] != 0 ? 1 : 11;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi9 = (previous == 1 ? v[5] : v[25]);
        long phi10 = (previous == 1 ? v[8] : v[26]);
        long phi11 = (previous == 1 ? v[2] : v[27]);
        long phi12 = (previous == 1 ? 0L : v[28]);
        v[9] = phi9;
        v[10] = phi10;
        v[11] = phi11;
        v[12] = phi12;
        v[13] = Heap.s(v[10], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[13] != 0 ? 3 : 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi14 = (previous == 3 ? v[20] : 0L);
        v[14] = phi14;
        v[15] = (v[11] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        v[16] = m.load(v[15], 1);
        v[17] = ((v[14] + 2L)) & 4294967295L;
        v[18] = (v[11] + (Heap.s(v[17], 32) * 1L)) & 4294967295L;
        v[19] = m.load(v[18], 1);
        m.store(v[15], v[19], 1);
        m.store(v[18], v[16], 1);
        v[20] = ((v[14] + 3L)) & 4294967295L;
        v[21] = m.load(v[7], 4);
        v[22] = ((v[21] * 3L)) & 4294967295L;
        v[23] = Heap.s(v[20], 32) < Heap.s(v[22], 32) ? 1L : 0L;
        return v[23] != 0 ? 3 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[24] = m.load(v[4], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi25 = (previous == 4 ? v[24] : v[9]);
        long phi26 = (previous == 4 ? v[21] : v[10]);
        v[25] = phi25;
        v[26] = phi26;
        v[27] = (v[11] + (Heap.s(v[3], 32) * 1L)) & 4294967295L;
        v[28] = ((v[12] + 1L)) & 4294967295L;
        v[29] = Heap.s(v[28], 32) < Heap.s(v[25], 32) ? 1L : 0L;
        return v[29] != 0 ? 2 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[30] = Heap.s(v[25], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[30] != 0 ? 7 : 11;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi31 = (previous == 10 ? v[59] : v[25]);
        long phi32 = (previous == 10 ? v[60] : v[26]);
        long phi33 = (previous == 10 ? v[61] : v[2]);
        long phi34 = (previous == 10 ? v[62] : 0L);
        v[31] = phi31;
        v[32] = phi32;
        v[33] = phi33;
        v[34] = phi34;
        v[35] = Heap.s(v[32], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[35] != 0 ? 8 : 10;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi36 = (previous == 8 ? v[53] : 0L);
        long phi37 = (previous == 8 ? v[54] : 0L);
        v[36] = phi36;
        v[37] = phi37;
        v[38] = (v[33] + (Heap.s(v[36], 32) * 1L)) & 4294967295L;
        v[39] = m.load(v[38], 1);
        v[40] = ((v[36] + 1L)) & 4294967295L;
        v[41] = (v[33] + (Heap.s(v[40], 32) * 1L)) & 4294967295L;
        v[42] = m.load(v[41], 1);
        v[43] = ((v[36] + 2L)) & 4294967295L;
        v[44] = (v[33] + (Heap.s(v[43], 32) * 1L)) & 4294967295L;
        v[45] = m.load(v[44], 1);
        v[46] = ((v[39] >>> 2L)) & 255L;
        v[47] = ((v[42] >>> 1L)) & 255L;
        v[48] = ((v[45] >>> 3L)) & 255L;
        v[49] = ((v[46] + 16L)) & 255L;
        v[50] = ((v[49] + v[47])) & 255L;
        v[51] = ((v[50] + v[48])) & 255L;
        v[52] = (v[33] + (Heap.s(v[37], 32) * 1L)) & 4294967295L;
        m.store(v[52], v[51], 1);
        v[53] = ((v[36] + 3L)) & 4294967295L;
        v[54] = ((v[37] + 1L)) & 4294967295L;
        v[55] = m.load(v[7], 4);
        v[56] = ((v[55] * 3L)) & 4294967295L;
        v[57] = Heap.s(v[53], 32) < Heap.s(v[56], 32) ? 1L : 0L;
        return v[57] != 0 ? 8 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[58] = m.load(v[4], 4);
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi59 = (previous == 9 ? v[58] : v[31]);
        long phi60 = (previous == 9 ? v[55] : v[32]);
        v[59] = phi59;
        v[60] = phi60;
        v[61] = (v[33] + (Heap.s(v[3], 32) * 1L)) & 4294967295L;
        v[62] = ((v[34] + 1L)) & 4294967295L;
        v[63] = Heap.s(v[62], 32) < Heap.s(v[59], 32) ? 1L : 0L;
        return v[63] != 0 ? 7 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[64] = 0L;
        return -1;
    }
}
