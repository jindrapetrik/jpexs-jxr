package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB48Half_RGB24.
 */
public final class F0209_RGB48Half_RGB24 {

    private F0209_RGB48Half_RGB24() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[118];
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
                    case 28:
                        pc = b28(m, v, previous);
                        break;
                    case 29:
                        pc = b29(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in RGB48Half_RGB24");
                }
                previous = old;
                if (pc < 0) {
                    return v[117];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 1 : 29;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[115]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 28;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 27 ? v[113] : 0L);
        v[13] = phi13;
        v[14] = ((v[13] * 3L)) & 4294967295L;
        v[15] = (v[12] + (Heap.s(v[14], 32) * 2L)) & 4294967295L;
        v[16] = m.load(v[15], 2);
        v[17] = (v[16]) & 4294967295L;
        v[18] = ((v[17] >>> 10L)) & 4294967295L;
        v[19] = ((v[18] & 31L)) & 4294967295L;
        v[20] = (Heap.s(v[16], 16)) & 4294967295L;
        v[21] = ((v[20] & 2147483648L)) & 4294967295L;
        switch ((int) v[19]) {
            case 0:
                return 6;
            case 31:
                return 4;
            default:
                return 5;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[22] = ((v[17] << 13L)) & 4294967295L;
        v[23] = ((v[21] | v[22])) & 4294967295L;
        v[24] = ((v[23] | 2139095040L)) & 4294967295L;
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = ((v[19] << 23L)) & 4294967295L;
        v[26] = ((v[25] + 939524096L)) & 4294967295L;
        v[27] = ((v[17] << 13L)) & 4294967295L;
        v[28] = ((v[27] & 8380416L)) & 4294967295L;
        v[29] = ((v[26] | v[28])) & 4294967295L;
        v[30] = ((v[29] | v[21])) & 4294967295L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi31 = (previous == 4 ? v[24] : (previous == 5 ? v[30] : v[21]));
        v[31] = phi31;
        v[32] = ((v[14] + 1L)) & 4294967295L;
        v[33] = (v[12] + (Heap.s(v[32], 32) * 2L)) & 4294967295L;
        v[34] = m.load(v[33], 2);
        v[35] = (v[34]) & 4294967295L;
        v[36] = ((v[35] >>> 10L)) & 4294967295L;
        v[37] = ((v[36] & 31L)) & 4294967295L;
        v[38] = (Heap.s(v[34], 16)) & 4294967295L;
        v[39] = ((v[38] & 2147483648L)) & 4294967295L;
        switch ((int) v[37]) {
            case 0:
                return 9;
            case 31:
                return 7;
            default:
                return 8;
        }
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[40] = ((v[35] << 13L)) & 4294967295L;
        v[41] = ((v[39] | v[40])) & 4294967295L;
        v[42] = ((v[41] | 2139095040L)) & 4294967295L;
        return 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[43] = ((v[37] << 23L)) & 4294967295L;
        v[44] = ((v[43] + 939524096L)) & 4294967295L;
        v[45] = ((v[35] << 13L)) & 4294967295L;
        v[46] = ((v[45] & 8380416L)) & 4294967295L;
        v[47] = ((v[44] | v[46])) & 4294967295L;
        v[48] = ((v[47] | v[39])) & 4294967295L;
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi49 = (previous == 7 ? v[42] : (previous == 8 ? v[48] : v[39]));
        v[49] = phi49;
        v[50] = ((v[14] + 2L)) & 4294967295L;
        v[51] = (v[12] + (Heap.s(v[50], 32) * 2L)) & 4294967295L;
        v[52] = m.load(v[51], 2);
        v[53] = (v[52]) & 4294967295L;
        v[54] = ((v[53] >>> 10L)) & 4294967295L;
        v[55] = ((v[54] & 31L)) & 4294967295L;
        v[56] = (Heap.s(v[52], 16)) & 4294967295L;
        v[57] = ((v[56] & 2147483648L)) & 4294967295L;
        switch ((int) v[55]) {
            case 0:
                return 12;
            case 31:
                return 10;
            default:
                return 11;
        }
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[58] = ((v[53] << 13L)) & 4294967295L;
        v[59] = ((v[57] | v[58])) & 4294967295L;
        v[60] = ((v[59] | 2139095040L)) & 4294967295L;
        return 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[61] = ((v[55] << 23L)) & 4294967295L;
        v[62] = ((v[61] + 939524096L)) & 4294967295L;
        v[63] = ((v[53] << 13L)) & 4294967295L;
        v[64] = ((v[63] & 8380416L)) & 4294967295L;
        v[65] = ((v[62] | v[64])) & 4294967295L;
        v[66] = ((v[65] | v[57])) & 4294967295L;
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi67 = (previous == 10 ? v[60] : (previous == 11 ? v[66] : v[57]));
        v[67] = phi67;
        v[68] = (v[31]) & 4294967295L;
        v[69] = Heap.fcmp("ugt", Heap.f(v[68]), Heap.f(0L));
        return v[69] != 0 ? 13 : 17;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[70] = Heap.fcmp("ugt", Heap.f(v[68]), Heap.f(994913820L));
        return v[70] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[71] = Heap.fb((Heap.f(v[68]) * Heap.f(1132396544L)));
        v[72] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[71], 1095678034L, 1056964608L});
        v[73] = ((long) Heap.f(v[72])) & 255L;
        return 17;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[74] = Heap.fcmp("olt", Heap.f(v[68]), Heap.f(1065353216L));
        return v[74] != 0 ? 16 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[75] = Heap.db(Heap.f(v[68]));
        v[76] = LibC.call(m, "pow", new long[]{v[75], 4601177619296856747L});
        v[77] = Heap.fb(Heap.d(v[76]));
        v[78] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[77], 1065814589L, 3177269166L});
        v[79] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[78], 1132396544L, 1056964608L});
        v[80] = ((long) Heap.f(v[79])) & 255L;
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi81 = (previous == 14 ? v[73] : (previous == 16 ? v[80] : (previous == 12 ? 0L : 255L)));
        v[81] = phi81;
        v[82] = (v[12] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        m.store(v[82], v[81], 1);
        v[83] = (v[49]) & 4294967295L;
        v[84] = Heap.fcmp("ugt", Heap.f(v[83]), Heap.f(0L));
        return v[84] != 0 ? 18 : 22;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[85] = Heap.fcmp("ugt", Heap.f(v[83]), Heap.f(994913820L));
        return v[85] != 0 ? 20 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[86] = Heap.fb((Heap.f(v[83]) * Heap.f(1132396544L)));
        v[87] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[86], 1095678034L, 1056964608L});
        v[88] = ((long) Heap.f(v[87])) & 255L;
        return 22;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[89] = Heap.fcmp("olt", Heap.f(v[83]), Heap.f(1065353216L));
        return v[89] != 0 ? 21 : 22;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[90] = Heap.db(Heap.f(v[83]));
        v[91] = LibC.call(m, "pow", new long[]{v[90], 4601177619296856747L});
        v[92] = Heap.fb(Heap.d(v[91]));
        v[93] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[92], 1065814589L, 3177269166L});
        v[94] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[93], 1132396544L, 1056964608L});
        v[95] = ((long) Heap.f(v[94])) & 255L;
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi96 = (previous == 19 ? v[88] : (previous == 21 ? v[95] : (previous == 17 ? 0L : 255L)));
        v[96] = phi96;
        v[97] = (v[12] + (Heap.s(v[32], 32) * 1L)) & 4294967295L;
        m.store(v[97], v[96], 1);
        v[98] = (v[67]) & 4294967295L;
        v[99] = Heap.fcmp("ugt", Heap.f(v[98]), Heap.f(0L));
        return v[99] != 0 ? 23 : 27;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[100] = Heap.fcmp("ugt", Heap.f(v[98]), Heap.f(994913820L));
        return v[100] != 0 ? 25 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[101] = Heap.fb((Heap.f(v[98]) * Heap.f(1132396544L)));
        v[102] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[101], 1095678034L, 1056964608L});
        v[103] = ((long) Heap.f(v[102])) & 255L;
        return 27;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[104] = Heap.fcmp("olt", Heap.f(v[98]), Heap.f(1065353216L));
        return v[104] != 0 ? 26 : 27;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[105] = Heap.db(Heap.f(v[98]));
        v[106] = LibC.call(m, "pow", new long[]{v[105], 4601177619296856747L});
        v[107] = Heap.fb(Heap.d(v[106]));
        v[108] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[107], 1065814589L, 3177269166L});
        v[109] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[108], 1132396544L, 1056964608L});
        v[110] = ((long) Heap.f(v[109])) & 255L;
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi111 = (previous == 24 ? v[103] : (previous == 26 ? v[110] : (previous == 22 ? 0L : 255L)));
        v[111] = phi111;
        v[112] = (v[12] + (Heap.s(v[50], 32) * 1L)) & 4294967295L;
        m.store(v[112], v[111], 1);
        v[113] = ((v[13] + 1L)) & 4294967295L;
        v[114] = v[113] == v[7] ? 1L : 0L;
        return v[114] != 0 ? 28 : 3;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[115] = ((v[10] + 1L)) & 4294967295L;
        v[116] = v[115] == v[5] ? 1L : 0L;
        return v[116] != 0 ? 29 : 2;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[117] = 0L;
        return -1;
    }
}
