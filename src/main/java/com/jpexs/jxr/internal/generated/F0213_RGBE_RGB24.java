package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGBE_RGB24.
 */
public final class F0213_RGBE_RGB24 {

    private F0213_RGBE_RGB24() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[106];
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
                    case 14:
                        pc = b14(m, v, previous);
                        break;
                    case 15:
                        pc = b15(m, v, previous);
                        break;
                    case 16:
                        pc = b16(m, v, previous);
                        break;
                    case 17:
                        pc = b17(m, v, previous);
                        break;
                    case 18:
                        pc = b18(m, v, previous);
                        break;
                    case 19:
                        pc = b19(m, v, previous);
                        break;
                    case 20:
                        pc = b20(m, v, previous);
                        break;
                    case 21:
                        pc = b21(m, v, previous);
                        break;
                    case 22:
                        pc = b22(m, v, previous);
                        break;
                    case 23:
                        pc = b23(m, v, previous);
                        break;
                    case 24:
                        pc = b24(m, v, previous);
                        break;
                    case 25:
                        pc = b25(m, v, previous);
                        break;
                    case 26:
                        pc = b26(m, v, previous);
                        break;
                    case 27:
                        pc = b27(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in RGBE_RGB24");
                }
                previous = old;
                if (pc < 0) {
                    return v[105];
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
        return v[6] != 0 ? 1 : 27;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi9 = (previous == 1 ? v[5] : v[100]);
        long phi10 = (previous == 1 ? v[8] : v[101]);
        long phi11 = (previous == 1 ? v[2] : v[102]);
        long phi12 = (previous == 1 ? 0L : v[103]);
        v[9] = phi9;
        v[10] = phi10;
        v[11] = phi11;
        v[12] = phi12;
        v[13] = Heap.s(v[10], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[13] != 0 ? 3 : 26;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi14 = (previous == 24 ? v[96] : 0L);
        v[14] = phi14;
        v[15] = ((v[14] << 2L)) & 4294967295L;
        v[16] = ((v[15] | 3L)) & 4294967295L;
        v[17] = (v[11] + (Heap.s(v[16], 32) * 1L)) & 4294967295L;
        v[18] = m.load(v[17], 1);
        v[19] = v[18] == 0L ? 1L : 0L;
        return v[19] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[20] = ((v[14] * 3L)) & 4294967295L;
        v[21] = (v[11] + (Heap.s(v[20], 32) * 1L)) & 4294967295L;
        m.store(v[21], 0L, 1);
        v[22] = ((v[20] + 1L)) & 4294967295L;
        v[23] = (v[11] + (Heap.s(v[22], 32) * 1L)) & 4294967295L;
        m.store(v[23], 0L, 1);
        return 24;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[24] = (v[18]) & 4294967295L;
        v[25] = ((v[24] + 4294967160L)) & 4294967295L;
        v[26] = ((v[18] + 151L)) & 255L;
        v[27] = v[26] < 63L ? 1L : 0L;
        return v[27] != 0 ? 6 : 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[28] = LibC.call(m, "abs", new long[]{v[25]});
        v[29] = ((1L << v[28])) & 4294967295L;
        v[30] = Heap.fb(v[29]);
        v[31] = v[18] < 136L ? 1L : 0L;
        return v[31] != 0 ? 7 : 9;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[32] = Heap.fb((Heap.f(1065353216L) / Heap.f(v[30])));
        return 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[33] = LibC.call(m, "ldexp", new long[]{4607182418800017408L, v[25]});
        v[34] = Heap.fb(Heap.d(v[33]));
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi35 = (previous == 7 ? v[32] : (previous == 6 ? v[30] : v[34]));
        v[35] = phi35;
        v[36] = (v[11] + (Heap.s(v[15], 32) * 1L)) & 4294967295L;
        v[37] = m.load(v[36], 1);
        v[38] = Heap.fb(v[37]);
        v[39] = Heap.fb((Heap.f(v[35]) * Heap.f(v[38])));
        v[40] = Heap.fcmp("ugt", Heap.f(v[39]), Heap.f(0L));
        return v[40] != 0 ? 10 : 14;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[41] = Heap.fcmp("ugt", Heap.f(v[39]), Heap.f(994913820L));
        return v[41] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[42] = Heap.fb((Heap.f(v[39]) * Heap.f(1132396544L)));
        v[43] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[42], 1095678034L, 1056964608L});
        v[44] = ((long) Heap.f(v[43])) & 255L;
        return 14;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[45] = Heap.fcmp("olt", Heap.f(v[39]), Heap.f(1065353216L));
        return v[45] != 0 ? 13 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[46] = Heap.db(Heap.f(v[39]));
        v[47] = LibC.call(m, "pow", new long[]{v[46], 4601177619296856747L});
        v[48] = Heap.fb(Heap.d(v[47]));
        v[49] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[48], 1065814589L, 3177269166L});
        v[50] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[49], 1132396544L, 1056964608L});
        v[51] = ((long) Heap.f(v[50])) & 255L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi52 = (previous == 11 ? v[44] : (previous == 13 ? v[51] : (previous == 9 ? 0L : 255L)));
        v[52] = phi52;
        v[53] = ((v[14] * 3L)) & 4294967295L;
        v[54] = (v[11] + (Heap.s(v[53], 32) * 1L)) & 4294967295L;
        m.store(v[54], v[52], 1);
        v[55] = ((v[15] | 1L)) & 4294967295L;
        v[56] = (v[11] + (Heap.s(v[55], 32) * 1L)) & 4294967295L;
        v[57] = m.load(v[56], 1);
        v[58] = Heap.fb(v[57]);
        v[59] = Heap.fb((Heap.f(v[35]) * Heap.f(v[58])));
        v[60] = Heap.fcmp("ugt", Heap.f(v[59]), Heap.f(0L));
        return v[60] != 0 ? 15 : 19;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[61] = Heap.fcmp("ugt", Heap.f(v[59]), Heap.f(994913820L));
        return v[61] != 0 ? 17 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[62] = Heap.fb((Heap.f(v[59]) * Heap.f(1132396544L)));
        v[63] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[62], 1095678034L, 1056964608L});
        v[64] = ((long) Heap.f(v[63])) & 255L;
        return 19;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[65] = Heap.fcmp("olt", Heap.f(v[59]), Heap.f(1065353216L));
        return v[65] != 0 ? 18 : 19;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[66] = Heap.db(Heap.f(v[59]));
        v[67] = LibC.call(m, "pow", new long[]{v[66], 4601177619296856747L});
        v[68] = Heap.fb(Heap.d(v[67]));
        v[69] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[68], 1065814589L, 3177269166L});
        v[70] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[69], 1132396544L, 1056964608L});
        v[71] = ((long) Heap.f(v[70])) & 255L;
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi72 = (previous == 16 ? v[64] : (previous == 18 ? v[71] : (previous == 14 ? 0L : 255L)));
        v[72] = phi72;
        v[73] = ((v[53] + 1L)) & 4294967295L;
        v[74] = (v[11] + (Heap.s(v[73], 32) * 1L)) & 4294967295L;
        m.store(v[74], v[72], 1);
        v[75] = ((v[15] | 2L)) & 4294967295L;
        v[76] = (v[11] + (Heap.s(v[75], 32) * 1L)) & 4294967295L;
        v[77] = m.load(v[76], 1);
        v[78] = Heap.fb(v[77]);
        v[79] = Heap.fb((Heap.f(v[35]) * Heap.f(v[78])));
        v[80] = Heap.fcmp("ugt", Heap.f(v[79]), Heap.f(0L));
        return v[80] != 0 ? 20 : 24;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[81] = Heap.fcmp("ugt", Heap.f(v[79]), Heap.f(994913820L));
        return v[81] != 0 ? 22 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[82] = Heap.fb((Heap.f(v[79]) * Heap.f(1132396544L)));
        v[83] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[82], 1095678034L, 1056964608L});
        v[84] = ((long) Heap.f(v[83])) & 255L;
        return 24;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[85] = Heap.fcmp("olt", Heap.f(v[79]), Heap.f(1065353216L));
        return v[85] != 0 ? 23 : 24;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[86] = Heap.db(Heap.f(v[79]));
        v[87] = LibC.call(m, "pow", new long[]{v[86], 4601177619296856747L});
        v[88] = Heap.fb(Heap.d(v[87]));
        v[89] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[88], 1065814589L, 3177269166L});
        v[90] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[89], 1132396544L, 1056964608L});
        v[91] = ((long) Heap.f(v[90])) & 255L;
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi92 = (previous == 4 ? v[20] : (previous == 19 ? v[53] : (previous == 21 ? v[53] : (previous == 22 ? v[53] : v[53]))));
        long phi93 = (previous == 4 ? 0L : (previous == 19 ? 0L : (previous == 21 ? v[84] : (previous == 22 ? 255L : v[91]))));
        v[92] = phi92;
        v[93] = phi93;
        v[94] = ((v[92] + 2L)) & 4294967295L;
        v[95] = (v[11] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        m.store(v[95], v[93], 1);
        v[96] = ((v[14] + 1L)) & 4294967295L;
        v[97] = m.load(v[7], 4);
        v[98] = Heap.s(v[96], 32) < Heap.s(v[97], 32) ? 1L : 0L;
        return v[98] != 0 ? 3 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[99] = m.load(v[4], 4);
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi100 = (previous == 25 ? v[99] : v[9]);
        long phi101 = (previous == 25 ? v[97] : v[10]);
        v[100] = phi100;
        v[101] = phi101;
        v[102] = (v[11] + (Heap.s(v[3], 32) * 1L)) & 4294967295L;
        v[103] = ((v[12] + 1L)) & 4294967295L;
        v[104] = Heap.s(v[103], 32) < Heap.s(v[100], 32) ? 1L : 0L;
        return v[104] != 0 ? 2 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[105] = 0L;
        return -1;
    }
}
