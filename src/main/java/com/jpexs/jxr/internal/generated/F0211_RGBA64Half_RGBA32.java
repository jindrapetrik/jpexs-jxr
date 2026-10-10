package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGBA64Half_RGBA32.
 */
public final class F0211_RGBA64Half_RGBA32 {

    private F0211_RGBA64Half_RGBA32() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[143];
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
                    case 30:
                        pc = b30(m, v, previous);
                        break;
                    case 31:
                        pc = b31(m, v, previous);
                        break;
                    case 32:
                        pc = b32(m, v, previous);
                        break;
                    case 33:
                        pc = b33(m, v, previous);
                        break;
                    case 34:
                        pc = b34(m, v, previous);
                        break;
                    case 35:
                        pc = b35(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in RGBA64Half_RGBA32");
                }
                previous = old;
                if (pc < 0) {
                    return v[142];
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
        return v[8] != 0 ? 1 : 35;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[140]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 34;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 33 ? v[138] : 0L);
        v[13] = phi13;
        v[14] = ((v[13] << 2L)) & 4294967295L;
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
        v[32] = ((v[14] | 1L)) & 4294967295L;
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
        v[50] = ((v[14] | 2L)) & 4294967295L;
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
        v[68] = ((v[14] | 3L)) & 4294967295L;
        v[69] = (v[12] + (Heap.s(v[68], 32) * 2L)) & 4294967295L;
        v[70] = m.load(v[69], 2);
        v[71] = (v[70]) & 4294967295L;
        v[72] = ((v[71] >>> 10L)) & 4294967295L;
        v[73] = ((v[72] & 31L)) & 4294967295L;
        v[74] = (Heap.s(v[70], 16)) & 4294967295L;
        v[75] = ((v[74] & 2147483648L)) & 4294967295L;
        switch ((int) v[73]) {
            case 0:
                return 15;
            case 31:
                return 13;
            default:
                return 14;
        }
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[76] = ((v[71] << 13L)) & 4294967295L;
        v[77] = ((v[75] | v[76])) & 4294967295L;
        v[78] = ((v[77] | 2139095040L)) & 4294967295L;
        return 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[79] = ((v[73] << 23L)) & 4294967295L;
        v[80] = ((v[79] + 939524096L)) & 4294967295L;
        v[81] = ((v[71] << 13L)) & 4294967295L;
        v[82] = ((v[81] & 8380416L)) & 4294967295L;
        v[83] = ((v[80] | v[82])) & 4294967295L;
        v[84] = ((v[83] | v[75])) & 4294967295L;
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi85 = (previous == 13 ? v[78] : (previous == 14 ? v[84] : v[75]));
        v[85] = phi85;
        v[86] = (v[31]) & 4294967295L;
        v[87] = Heap.fcmp("ugt", Heap.f(v[86]), Heap.f(0L));
        return v[87] != 0 ? 16 : 20;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[88] = Heap.fcmp("ugt", Heap.f(v[86]), Heap.f(994913820L));
        return v[88] != 0 ? 18 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[89] = Heap.fb((Heap.f(v[86]) * Heap.f(1132396544L)));
        v[90] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[89], 1095678034L, 1056964608L});
        v[91] = ((long) Heap.f(v[90])) & 255L;
        return 20;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[92] = Heap.fcmp("olt", Heap.f(v[86]), Heap.f(1065353216L));
        return v[92] != 0 ? 19 : 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[93] = Heap.db(Heap.f(v[86]));
        v[94] = LibC.call(m, "pow", new long[]{v[93], 4601177619296856747L});
        v[95] = Heap.fb(Heap.d(v[94]));
        v[96] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[95], 1065814589L, 3177269166L});
        v[97] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[96], 1132396544L, 1056964608L});
        v[98] = ((long) Heap.f(v[97])) & 255L;
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi99 = (previous == 17 ? v[91] : (previous == 19 ? v[98] : (previous == 15 ? 0L : 255L)));
        v[99] = phi99;
        v[100] = (v[12] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        m.store(v[100], v[99], 1);
        v[101] = (v[49]) & 4294967295L;
        v[102] = Heap.fcmp("ugt", Heap.f(v[101]), Heap.f(0L));
        return v[102] != 0 ? 21 : 25;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[103] = Heap.fcmp("ugt", Heap.f(v[101]), Heap.f(994913820L));
        return v[103] != 0 ? 23 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[104] = Heap.fb((Heap.f(v[101]) * Heap.f(1132396544L)));
        v[105] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[104], 1095678034L, 1056964608L});
        v[106] = ((long) Heap.f(v[105])) & 255L;
        return 25;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[107] = Heap.fcmp("olt", Heap.f(v[101]), Heap.f(1065353216L));
        return v[107] != 0 ? 24 : 25;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[108] = Heap.db(Heap.f(v[101]));
        v[109] = LibC.call(m, "pow", new long[]{v[108], 4601177619296856747L});
        v[110] = Heap.fb(Heap.d(v[109]));
        v[111] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[110], 1065814589L, 3177269166L});
        v[112] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[111], 1132396544L, 1056964608L});
        v[113] = ((long) Heap.f(v[112])) & 255L;
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi114 = (previous == 22 ? v[106] : (previous == 24 ? v[113] : (previous == 20 ? 0L : 255L)));
        v[114] = phi114;
        v[115] = (v[12] + (Heap.s(v[32], 32) * 1L)) & 4294967295L;
        m.store(v[115], v[114], 1);
        v[116] = (v[67]) & 4294967295L;
        v[117] = Heap.fcmp("ugt", Heap.f(v[116]), Heap.f(0L));
        return v[117] != 0 ? 26 : 30;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[118] = Heap.fcmp("ugt", Heap.f(v[116]), Heap.f(994913820L));
        return v[118] != 0 ? 28 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[119] = Heap.fb((Heap.f(v[116]) * Heap.f(1132396544L)));
        v[120] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[119], 1095678034L, 1056964608L});
        v[121] = ((long) Heap.f(v[120])) & 255L;
        return 30;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[122] = Heap.fcmp("olt", Heap.f(v[116]), Heap.f(1065353216L));
        return v[122] != 0 ? 29 : 30;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[123] = Heap.db(Heap.f(v[116]));
        v[124] = LibC.call(m, "pow", new long[]{v[123], 4601177619296856747L});
        v[125] = Heap.fb(Heap.d(v[124]));
        v[126] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[125], 1065814589L, 3177269166L});
        v[127] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[126], 1132396544L, 1056964608L});
        v[128] = ((long) Heap.f(v[127])) & 255L;
        return 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi129 = (previous == 27 ? v[121] : (previous == 29 ? v[128] : (previous == 25 ? 0L : 255L)));
        v[129] = phi129;
        v[130] = (v[12] + (Heap.s(v[50], 32) * 1L)) & 4294967295L;
        m.store(v[130], v[129], 1);
        v[131] = (v[85]) & 4294967295L;
        v[132] = Heap.fcmp("ugt", Heap.f(v[131]), Heap.f(0L));
        return v[132] != 0 ? 31 : 33;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[133] = Heap.fcmp("olt", Heap.f(v[131]), Heap.f(1065353216L));
        return v[133] != 0 ? 32 : 33;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[134] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[131], 1132396544L, 1056964608L});
        v[135] = ((long) Heap.f(v[134])) & 255L;
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi136 = (previous == 32 ? v[135] : (previous == 30 ? 0L : 255L));
        v[136] = phi136;
        v[137] = (v[12] + (Heap.s(v[68], 32) * 1L)) & 4294967295L;
        m.store(v[137], v[136], 1);
        v[138] = ((v[13] + 1L)) & 4294967295L;
        v[139] = v[138] == v[7] ? 1L : 0L;
        return v[139] != 0 ? 34 : 3;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[140] = ((v[10] + 1L)) & 4294967295L;
        v[141] = v[140] == v[5] ? 1L : 0L;
        return v[141] != 0 ? 35 : 2;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[142] = 0L;
        return -1;
    }
}
