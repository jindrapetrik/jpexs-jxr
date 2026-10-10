package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGBE_RGB96Float.
 */
public final class F0170_RGBE_RGB96Float {

    private F0170_RGBE_RGB96Float() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[60];
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
                    case 12:
                        pc = b12(m, v, previous);
                        break;
                    case 13:
                        pc = b13(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in RGBE_RGB96Float");
                }
                previous = old;
                if (pc < 0) {
                    return v[59];
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
        return v[6] != 0 ? 1 : 13;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = Heap.s(v[8], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = Heap.s(v[11], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[10] != 0 ? 3 : 13;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi11 = (previous == 1 ? v[5] : v[12]);
        v[11] = phi11;
        v[12] = ((v[11] + 4294967295L)) & 4294967295L;
        v[13] = ((v[12] * v[3])) & 4294967295L;
        v[14] = (v[2] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 4 : 2;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[15] = (v[14] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi16 = (previous == 12 ? v[17] : v[8]);
        v[16] = phi16;
        v[17] = ((v[16] + 4294967295L)) & 4294967295L;
        v[18] = ((v[17] << 2L)) & 4294967295L;
        v[19] = ((v[18] | 3L)) & 4294967295L;
        v[20] = (v[14] + (Heap.s(v[19], 32) * 1L)) & 4294967295L;
        v[21] = m.load(v[20], 1);
        v[22] = v[21] == 0L ? 1L : 0L;
        return v[22] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[23] = ((v[17] * 3L)) & 4294967295L;
        v[24] = (v[14] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        m.store(v[24], 0L, 4);
        v[25] = (v[24] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[25], 0L, 4);
        return 12;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[26] = (v[21]) & 4294967295L;
        v[27] = ((v[26] + 4294967160L)) & 4294967295L;
        v[28] = ((v[21] + 151L)) & 255L;
        v[29] = v[28] < 63L ? 1L : 0L;
        return v[29] != 0 ? 8 : 10;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[30] = LibC.call(m, "abs", new long[]{v[27]});
        v[31] = ((1L << v[30])) & 4294967295L;
        v[32] = Heap.fb(v[31]);
        v[33] = v[21] < 136L ? 1L : 0L;
        return v[33] != 0 ? 9 : 11;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[34] = Heap.fb((Heap.f(1065353216L) / Heap.f(v[32])));
        return 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[35] = LibC.call(m, "ldexp", new long[]{4607182418800017408L, v[27]});
        v[36] = Heap.fb(Heap.d(v[35]));
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi37 = (previous == 9 ? v[34] : (previous == 8 ? v[32] : v[36]));
        v[37] = phi37;
        v[38] = (v[14] + (Heap.s(v[18], 32) * 1L)) & 4294967295L;
        v[39] = m.load(v[38], 1);
        v[40] = Heap.fb(v[39]);
        v[41] = Heap.fb((Heap.f(v[37]) * Heap.f(v[40])));
        v[42] = ((v[17] * 3L)) & 4294967295L;
        v[43] = (v[14] + (Heap.s(v[42], 32) * 4L)) & 4294967295L;
        m.store(v[43], v[41], 4);
        v[44] = ((v[18] | 1L)) & 4294967295L;
        v[45] = (v[14] + (Heap.s(v[44], 32) * 1L)) & 4294967295L;
        v[46] = m.load(v[45], 1);
        v[47] = Heap.fb(v[46]);
        v[48] = Heap.fb((Heap.f(v[37]) * Heap.f(v[47])));
        v[49] = (v[43] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[49], v[48], 4);
        v[50] = ((v[18] | 2L)) & 4294967295L;
        v[51] = (v[14] + (Heap.s(v[50], 32) * 1L)) & 4294967295L;
        v[52] = m.load(v[51], 1);
        v[53] = Heap.fb(v[52]);
        v[54] = Heap.fb((Heap.f(v[37]) * Heap.f(v[53])));
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi55 = (previous == 11 ? v[42] : v[23]);
        long phi56 = (previous == 11 ? v[54] : 0L);
        v[55] = phi55;
        v[56] = phi56;
        v[57] = (v[15] + (Heap.s(v[55], 32) * 4L)) & 4294967295L;
        m.store(v[57], v[56], 4);
        v[58] = v[16] > 1L ? 1L : 0L;
        return v[58] != 0 ? 5 : 2;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[59] = 0L;
        return -1;
    }
}
