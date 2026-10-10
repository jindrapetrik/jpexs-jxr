package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB96Float_RGBE.
 */
public final class F0173_RGB96Float_RGBE {

    private F0173_RGB96Float_RGBE() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[68];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB96Float_RGBE");
                }
                previous = old;
                if (pc < 0) {
                    return v[67];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.stack(4L * 1L, 4);
        v[5] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = Heap.s(v[6], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 1 : 8;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = Heap.s(v[8], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi11 = (previous == 1 ? 0L : v[65]);
        v[11] = phi11;
        v[12] = ((v[11] * v[3])) & 4294967295L;
        v[13] = (v[2] + (Heap.s(v[12], 32) * 1L)) & 4294967295L;
        return v[10] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi14 = (previous == 6 ? v[63] : 0L);
        v[14] = phi14;
        v[15] = ((v[14] * 3L)) & 4294967295L;
        v[16] = (v[13] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = Heap.fcmp("ogt", Heap.f(v[17]), Heap.f(0L));
        v[19] = v[18] != 0 ? v[17] : 0L;
        v[20] = (v[16] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = Heap.fcmp("ogt", Heap.f(v[21]), Heap.f(0L));
        v[23] = v[22] != 0 ? v[21] : 0L;
        v[24] = (v[16] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = Heap.fcmp("ogt", Heap.f(v[25]), Heap.f(0L));
        v[27] = v[26] != 0 ? v[25] : 0L;
        v[28] = Heap.fcmp("ogt", Heap.f(v[23]), Heap.f(v[19]));
        v[29] = v[28] != 0 ? v[23] : v[19];
        v[30] = Heap.fcmp("ogt", Heap.f(v[27]), Heap.f(v[29]));
        v[31] = v[30] != 0 ? v[27] : v[29];
        v[32] = Heap.db(Heap.f(v[31]));
        v[33] = Heap.fcmp("olt", Heap.d(v[32]), Heap.d(4128101167230658355L));
        return v[33] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[34] = ((v[14] << 2L)) & 4294967295L;
        v[35] = (v[13] + (Heap.s(v[34], 32) * 1L)) & 4294967295L;
        m.store(v[35], 0L, 1);
        v[36] = ((v[34] | 1L)) & 4294967295L;
        v[37] = (v[13] + (Heap.s(v[36], 32) * 1L)) & 4294967295L;
        m.store(v[37], 0L, 1);
        v[38] = ((v[34] | 2L)) & 4294967295L;
        v[39] = (v[13] + (Heap.s(v[38], 32) * 1L)) & 4294967295L;
        m.store(v[39], 0L, 1);
        v[40] = ((v[34] | 3L)) & 4294967295L;
        v[41] = (v[13] + (Heap.s(v[40], 32) * 1L)) & 4294967295L;
        m.store(v[41], 0L, 1);
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[42] = LibC.call(m, "frexp", new long[]{v[32], v[4]});
        v[43] = Heap.fb(Heap.d(v[42]));
        v[44] = Heap.fb((Heap.f(v[43]) * Heap.f(1132462080L)));
        v[45] = Heap.fb((Heap.f(v[44]) / Heap.f(v[31])));
        v[46] = Heap.fb((Heap.f(v[19]) * Heap.f(v[45])));
        v[47] = ((long) Heap.f(v[46])) & 255L;
        v[48] = ((v[14] << 2L)) & 4294967295L;
        v[49] = (v[13] + (Heap.s(v[48], 32) * 1L)) & 4294967295L;
        m.store(v[49], v[47], 1);
        v[50] = Heap.fb((Heap.f(v[23]) * Heap.f(v[45])));
        v[51] = ((long) Heap.f(v[50])) & 255L;
        v[52] = ((v[48] | 1L)) & 4294967295L;
        v[53] = (v[13] + (Heap.s(v[52], 32) * 1L)) & 4294967295L;
        m.store(v[53], v[51], 1);
        v[54] = Heap.fb((Heap.f(v[27]) * Heap.f(v[45])));
        v[55] = ((long) Heap.f(v[54])) & 255L;
        v[56] = ((v[48] | 2L)) & 4294967295L;
        v[57] = (v[13] + (Heap.s(v[56], 32) * 1L)) & 4294967295L;
        m.store(v[57], v[55], 1);
        v[58] = m.load(v[4], 4);
        v[59] = (v[58]) & 255L;
        v[60] = ((v[59] ^ 128L)) & 255L;
        v[61] = ((v[48] | 3L)) & 4294967295L;
        v[62] = (v[13] + (Heap.s(v[61], 32) * 1L)) & 4294967295L;
        m.store(v[62], v[60], 1);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[63] = ((v[14] + 1L)) & 4294967295L;
        v[64] = v[63] == v[8] ? 1L : 0L;
        return v[64] != 0 ? 7 : 3;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[65] = ((v[11] + 1L)) & 4294967295L;
        v[66] = v[65] == v[6] ? 1L : 0L;
        return v[66] != 0 ? 8 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[67] = 0L;
        return -1;
    }
}
