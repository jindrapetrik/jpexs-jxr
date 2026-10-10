package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: decodeThumbnailAlpha.
 */
public final class F0387_decodeThumbnailAlpha {

    private F0387_decodeThumbnailAlpha() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[309];
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
                    case 36:
                        pc = b36(m, v, previous);
                        break;
                    case 37:
                        pc = b37(m, v, previous);
                        break;
                    case 38:
                        pc = b38(m, v, previous);
                        break;
                    case 39:
                        pc = b39(m, v, previous);
                        break;
                    case 40:
                        pc = b40(m, v, previous);
                        break;
                    case 41:
                        pc = b41(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in decodeThumbnailAlpha");
                }
                previous = old;
                if (pc < 0) {
                    return v[308];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 1 : 41;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 41 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = ((1L << v[1])) & 4294967295L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = (v[12] + (Heap.s(0L, 32) * 48L) + 36L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[16] << 4L)) & 4294967295L;
        v[18] = ((v[14] + 17L)) & 4294967295L;
        v[19] = ((v[18] - v[17])) & 4294967295L;
        v[20] = LibC.call(m, "llvm.umin.i32", new long[]{v[19], 16L});
        v[21] = (v[12] + (Heap.s(0L, 32) * 48L) + 28L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = ((v[22] + 1L)) & 4294967295L;
        v[24] = ((v[17] + 4294967280L)) & 4294967295L;
        v[25] = (v[12] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = v[24] > v[26] ? 1L : 0L;
        v[28] = ((v[26] & 15L)) & 4294967295L;
        v[29] = v[27] != 0 ? 0L : v[28];
        v[30] = ((v[10] + 4294967295L)) & 4294967295L;
        v[31] = ((v[30] + v[29])) & 4294967295L;
        v[32] = ((4294967295L << v[1])) & 4294967295L;
        v[33] = ((v[31] & v[32])) & 4294967295L;
        v[34] = (v[12] + (Heap.s(0L, 32) * 48L) + 24L) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = ((v[30] + v[35])) & 4294967295L;
        v[37] = ((v[36] & v[32])) & 4294967295L;
        v[38] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 20L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = v[41] == 4L ? 1L : 0L;
        v[43] = v[42] != 0 ? 4L : 3L;
        v[44] = ((v[43] + v[39])) & 4294967295L;
        v[45] = (v[8] + (Heap.s(0L, 32) * 35064L) + 34524L) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = (v[8] + (Heap.s(0L, 32) * 35064L) + 76L + 32832L) & 4294967295L;
        v[48] = m.load(v[47], 1);
        v[49] = (v[8] + (Heap.s(0L, 32) * 35064L) + 76L + 32833L) & 4294967295L;
        v[50] = m.load(v[49], 1);
        v[51] = (v[12] + (Heap.s(0L, 32) * 48L) + 40L) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = (v[12] + (Heap.s(0L, 32) * 48L) + 44L) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = ((v[24] >>> v[1])) & 4294967295L;
        v[56] = (v[54] + (Heap.s(v[55], 32) * 4L)) & 4294967295L;
        switch ((int) v[41]) {
            case 7:
                return 3;
            case 4:
                return 3;
            default:
                return 41;
        }
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[57] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 12L) & 4294967295L;
        v[58] = m.load(v[57], 4);
        switch ((int) v[58]) {
            case 1:
                return 12;
            case 2:
                return 17;
            case 3:
                return 10;
            case 4:
                return 8;
            case 6:
                return 6;
            case 7:
                return 4;
            default:
                return 41;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[59] = v[33] < v[20] ? 1L : 0L;
        return v[59] != 0 ? 5 : 41;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[60] = v[37] < v[23] ? 1L : 0L;
        v[61] = (v[48]) & 4294967295L;
        v[62] = ((1L << v[61])) & 4294967295L;
        v[63] = ((v[62] + 4294967295L)) & 4294967295L;
        v[64] = (Heap.s(v[50], 8)) & 4294967295L;
        v[65] = ((23L - v[61])) & 4294967295L;
        v[66] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 35;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[67] = v[33] < v[20] ? 1L : 0L;
        return v[67] != 0 ? 7 : 41;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[68] = v[37] < v[23] ? 1L : 0L;
        v[69] = (v[48]) & 4294967295L;
        v[70] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 31;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[71] = v[33] < v[20] ? 1L : 0L;
        return v[71] != 0 ? 9 : 41;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[72] = v[37] < v[23] ? 1L : 0L;
        v[73] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 27;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[74] = v[33] < v[20] ? 1L : 0L;
        return v[74] != 0 ? 11 : 41;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[75] = v[37] < v[23] ? 1L : 0L;
        v[76] = (v[48]) & 4294967295L;
        v[77] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 23;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[78] = ((128L << v[3])) & 4294967295L;
        v[79] = ((Heap.s(v[78], 32) / Heap.s(v[2], 32))) & 4294967295L;
        v[80] = v[33] < v[20] ? 1L : 0L;
        return v[80] != 0 ? 13 : 41;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[81] = v[37] < v[23] ? 1L : 0L;
        v[82] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi83 = (previous == 13 ? v[33] : v[112]);
        v[83] = phi83;
        v[84] = ((v[83] >>> v[1])) & 4294967295L;
        v[85] = (v[56] + (Heap.s(v[84], 32) * 4L)) & 4294967295L;
        v[86] = m.load(v[85], 4);
        return v[81] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi87 = (previous == 15 ? v[110] : v[37]);
        v[87] = phi87;
        v[88] = ((v[87] << 4L)) & 4294967295L;
        v[89] = ((v[88] & 4294967040L)) & 4294967295L;
        v[90] = ((v[87] & 15L)) & 4294967295L;
        v[91] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[83], 32) * 16L) + (Heap.s(v[90], 32) * 1L)) & 4294967295L;
        v[92] = m.load(v[91], 1);
        v[93] = (v[92]) & 4294967295L;
        v[94] = ((v[89] | v[93])) & 4294967295L;
        v[95] = (v[46] + (Heap.s(v[94], 32) * 4L)) & 4294967295L;
        v[96] = m.load(v[95], 4);
        v[97] = ((v[96] + v[79])) & 4294967295L;
        v[98] = ((v[97] * v[2])) & 4294967295L;
        v[99] = ((Heap.s(v[98], 32) >> v[3])) & 4294967295L;
        v[100] = LibC.call(m, "llvm.smin.i32", new long[]{v[99], 255L});
        v[101] = LibC.call(m, "llvm.smax.i32", new long[]{v[100], 0L});
        v[102] = (v[101]) & 255L;
        v[103] = m.load(v[82], 4);
        v[104] = ((v[87] >>> v[1])) & 4294967295L;
        v[105] = (v[52] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[106] = m.load(v[105], 4);
        v[107] = (v[103] + (Heap.s(v[106], 32) * 1L)) & 4294967295L;
        v[108] = (v[107] + (Heap.s(v[86], 32) * 1L)) & 4294967295L;
        v[109] = (v[108] + (Heap.s(v[44], 32) * 1L)) & 4294967295L;
        m.store(v[109], v[102], 1);
        v[110] = ((v[87] + v[10])) & 4294967295L;
        v[111] = v[110] < v[23] ? 1L : 0L;
        return v[111] != 0 ? 15 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[112] = ((v[83] + v[10])) & 4294967295L;
        v[113] = v[112] < v[20] ? 1L : 0L;
        return v[113] != 0 ? 14 : 41;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[114] = ((32768L << v[3])) & 4294967295L;
        v[115] = ((Heap.s(v[114], 32) / Heap.s(v[2], 32))) & 4294967295L;
        v[116] = v[33] < v[20] ? 1L : 0L;
        return v[116] != 0 ? 18 : 41;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[117] = v[37] < v[23] ? 1L : 0L;
        v[118] = (v[48]) & 4294967295L;
        v[119] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi120 = (previous == 18 ? v[33] : v[150]);
        v[120] = phi120;
        return v[117] != 0 ? 20 : 22;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[121] = ((v[120] >>> v[1])) & 4294967295L;
        v[122] = (v[56] + (Heap.s(v[121], 32) * 4L)) & 4294967295L;
        v[123] = m.load(v[122], 4);
        v[124] = m.load(v[119], 4);
        v[125] = (v[124] + (Heap.s(v[123], 32) * 2L)) & 4294967295L;
        v[126] = (v[125] + (Heap.s(v[44], 32) * 2L)) & 4294967295L;
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi127 = (previous == 20 ? v[37] : v[148]);
        v[127] = phi127;
        v[128] = ((v[127] << 4L)) & 4294967295L;
        v[129] = ((v[128] & 4294967040L)) & 4294967295L;
        v[130] = ((v[127] & 15L)) & 4294967295L;
        v[131] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[120], 32) * 16L) + (Heap.s(v[130], 32) * 1L)) & 4294967295L;
        v[132] = m.load(v[131], 1);
        v[133] = (v[132]) & 4294967295L;
        v[134] = ((v[129] | v[133])) & 4294967295L;
        v[135] = (v[46] + (Heap.s(v[134], 32) * 4L)) & 4294967295L;
        v[136] = m.load(v[135], 4);
        v[137] = ((v[136] + v[115])) & 4294967295L;
        v[138] = ((v[137] * v[2])) & 4294967295L;
        v[139] = ((Heap.s(v[138], 32) >> v[3])) & 4294967295L;
        v[140] = ((v[139] << v[118])) & 4294967295L;
        v[141] = LibC.call(m, "llvm.smin.i32", new long[]{v[140], 65535L});
        v[142] = LibC.call(m, "llvm.smax.i32", new long[]{v[141], 0L});
        v[143] = (v[142]) & 65535L;
        v[144] = ((v[127] >>> v[1])) & 4294967295L;
        v[145] = (v[52] + (Heap.s(v[144], 32) * 4L)) & 4294967295L;
        v[146] = m.load(v[145], 4);
        v[147] = (v[126] + (Heap.s(v[146], 32) * 2L)) & 4294967295L;
        m.store(v[147], v[143], 2);
        v[148] = ((v[127] + v[10])) & 4294967295L;
        v[149] = v[148] < v[23] ? 1L : 0L;
        return v[149] != 0 ? 21 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[150] = ((v[120] + v[10])) & 4294967295L;
        v[151] = v[150] < v[20] ? 1L : 0L;
        return v[151] != 0 ? 19 : 41;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi152 = (previous == 11 ? v[33] : v[181]);
        v[152] = phi152;
        return v[75] != 0 ? 24 : 26;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[153] = ((v[152] >>> v[1])) & 4294967295L;
        v[154] = (v[56] + (Heap.s(v[153], 32) * 4L)) & 4294967295L;
        v[155] = m.load(v[154], 4);
        v[156] = m.load(v[77], 4);
        v[157] = (v[156] + (Heap.s(v[155], 32) * 2L)) & 4294967295L;
        v[158] = (v[157] + (Heap.s(v[44], 32) * 2L)) & 4294967295L;
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi159 = (previous == 24 ? v[37] : v[179]);
        v[159] = phi159;
        v[160] = ((v[159] << 4L)) & 4294967295L;
        v[161] = ((v[160] & 4294967040L)) & 4294967295L;
        v[162] = ((v[159] & 15L)) & 4294967295L;
        v[163] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[152], 32) * 16L) + (Heap.s(v[162], 32) * 1L)) & 4294967295L;
        v[164] = m.load(v[163], 1);
        v[165] = (v[164]) & 4294967295L;
        v[166] = ((v[161] | v[165])) & 4294967295L;
        v[167] = (v[46] + (Heap.s(v[166], 32) * 4L)) & 4294967295L;
        v[168] = m.load(v[167], 4);
        v[169] = ((v[168] * v[2])) & 4294967295L;
        v[170] = ((Heap.s(v[169], 32) >> v[3])) & 4294967295L;
        v[171] = ((v[170] << v[76])) & 4294967295L;
        v[172] = LibC.call(m, "llvm.smin.i32", new long[]{v[171], 32767L});
        v[173] = LibC.call(m, "llvm.smax.i32", new long[]{v[172], 4294934528L});
        v[174] = (v[173]) & 65535L;
        v[175] = ((v[159] >>> v[1])) & 4294967295L;
        v[176] = (v[52] + (Heap.s(v[175], 32) * 4L)) & 4294967295L;
        v[177] = m.load(v[176], 4);
        v[178] = (v[158] + (Heap.s(v[177], 32) * 2L)) & 4294967295L;
        m.store(v[178], v[174], 2);
        v[179] = ((v[159] + v[10])) & 4294967295L;
        v[180] = v[179] < v[23] ? 1L : 0L;
        return v[180] != 0 ? 25 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[181] = ((v[152] + v[10])) & 4294967295L;
        v[182] = v[181] < v[20] ? 1L : 0L;
        return v[182] != 0 ? 23 : 41;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi183 = (previous == 9 ? v[33] : v[213]);
        v[183] = phi183;
        return v[72] != 0 ? 28 : 30;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[184] = ((v[183] >>> v[1])) & 4294967295L;
        v[185] = (v[56] + (Heap.s(v[184], 32) * 4L)) & 4294967295L;
        v[186] = m.load(v[185], 4);
        v[187] = m.load(v[73], 4);
        v[188] = (v[187] + (Heap.s(v[186], 32) * 2L)) & 4294967295L;
        v[189] = (v[188] + (Heap.s(v[44], 32) * 2L)) & 4294967295L;
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi190 = (previous == 28 ? v[37] : v[211]);
        v[190] = phi190;
        v[191] = ((v[190] << 4L)) & 4294967295L;
        v[192] = ((v[191] & 4294967040L)) & 4294967295L;
        v[193] = ((v[190] & 15L)) & 4294967295L;
        v[194] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[183], 32) * 16L) + (Heap.s(v[193], 32) * 1L)) & 4294967295L;
        v[195] = m.load(v[194], 1);
        v[196] = (v[195]) & 4294967295L;
        v[197] = ((v[192] | v[196])) & 4294967295L;
        v[198] = (v[46] + (Heap.s(v[197], 32) * 4L)) & 4294967295L;
        v[199] = m.load(v[198], 4);
        v[200] = ((v[199] * v[2])) & 4294967295L;
        v[201] = ((Heap.s(v[200], 32) >> v[3])) & 4294967295L;
        v[202] = ((Heap.s(v[201], 32) >> 31L)) & 4294967295L;
        v[203] = ((v[201] & 32767L)) & 4294967295L;
        v[204] = ((v[203] ^ v[202])) & 4294967295L;
        v[205] = ((v[204] - v[202])) & 4294967295L;
        v[206] = (v[205]) & 65535L;
        v[207] = ((v[190] >>> v[1])) & 4294967295L;
        v[208] = (v[52] + (Heap.s(v[207], 32) * 4L)) & 4294967295L;
        v[209] = m.load(v[208], 4);
        v[210] = (v[189] + (Heap.s(v[209], 32) * 2L)) & 4294967295L;
        m.store(v[210], v[206], 2);
        v[211] = ((v[190] + v[10])) & 4294967295L;
        v[212] = v[211] < v[23] ? 1L : 0L;
        return v[212] != 0 ? 29 : 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[213] = ((v[183] + v[10])) & 4294967295L;
        v[214] = v[213] < v[20] ? 1L : 0L;
        return v[214] != 0 ? 27 : 41;
    }

    private static int b31(Heap m, long[] v, int previous) {
        long phi215 = (previous == 7 ? v[33] : v[241]);
        v[215] = phi215;
        return v[68] != 0 ? 32 : 34;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[216] = ((v[215] >>> v[1])) & 4294967295L;
        v[217] = (v[56] + (Heap.s(v[216], 32) * 4L)) & 4294967295L;
        v[218] = m.load(v[217], 4);
        v[219] = m.load(v[70], 4);
        v[220] = (v[219] + (Heap.s(v[218], 32) * 4L)) & 4294967295L;
        v[221] = (v[220] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi222 = (previous == 32 ? v[37] : v[239]);
        v[222] = phi222;
        v[223] = ((v[222] << 4L)) & 4294967295L;
        v[224] = ((v[223] & 4294967040L)) & 4294967295L;
        v[225] = ((v[222] & 15L)) & 4294967295L;
        v[226] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[215], 32) * 16L) + (Heap.s(v[225], 32) * 1L)) & 4294967295L;
        v[227] = m.load(v[226], 1);
        v[228] = (v[227]) & 4294967295L;
        v[229] = ((v[224] | v[228])) & 4294967295L;
        v[230] = (v[46] + (Heap.s(v[229], 32) * 4L)) & 4294967295L;
        v[231] = m.load(v[230], 4);
        v[232] = ((v[231] * v[2])) & 4294967295L;
        v[233] = ((Heap.s(v[232], 32) >> v[3])) & 4294967295L;
        v[234] = ((v[233] << v[69])) & 4294967295L;
        v[235] = ((v[222] >>> v[1])) & 4294967295L;
        v[236] = (v[52] + (Heap.s(v[235], 32) * 4L)) & 4294967295L;
        v[237] = m.load(v[236], 4);
        v[238] = (v[221] + (Heap.s(v[237], 32) * 4L)) & 4294967295L;
        m.store(v[238], v[234], 4);
        v[239] = ((v[222] + v[10])) & 4294967295L;
        v[240] = v[239] < v[23] ? 1L : 0L;
        return v[240] != 0 ? 33 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[241] = ((v[215] + v[10])) & 4294967295L;
        v[242] = v[241] < v[20] ? 1L : 0L;
        return v[242] != 0 ? 31 : 41;
    }

    private static int b35(Heap m, long[] v, int previous) {
        long phi243 = (previous == 5 ? v[33] : v[305]);
        v[243] = phi243;
        return v[60] != 0 ? 36 : 40;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[244] = ((v[243] >>> v[1])) & 4294967295L;
        v[245] = (v[56] + (Heap.s(v[244], 32) * 4L)) & 4294967295L;
        v[246] = m.load(v[245], 4);
        v[247] = m.load(v[66], 4);
        v[248] = (v[247] + (Heap.s(v[246], 32) * 4L)) & 4294967295L;
        v[249] = (v[248] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        return 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        long phi250 = (previous == 36 ? v[37] : v[303]);
        v[250] = phi250;
        v[251] = ((v[250] << 4L)) & 4294967295L;
        v[252] = ((v[251] & 4294967040L)) & 4294967295L;
        v[253] = ((v[250] & 15L)) & 4294967295L;
        v[254] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[243], 32) * 16L) + (Heap.s(v[253], 32) * 1L)) & 4294967295L;
        v[255] = m.load(v[254], 1);
        v[256] = (v[255]) & 4294967295L;
        v[257] = ((v[252] | v[256])) & 4294967295L;
        v[258] = (v[46] + (Heap.s(v[257], 32) * 4L)) & 4294967295L;
        v[259] = m.load(v[258], 4);
        v[260] = ((v[259] * v[2])) & 4294967295L;
        v[261] = ((Heap.s(v[260], 32) >> v[3])) & 4294967295L;
        v[262] = ((Heap.s(v[261], 32) >> 31L)) & 4294967295L;
        v[263] = ((v[262] ^ v[261])) & 4294967295L;
        v[264] = ((v[263] - v[262])) & 4294967295L;
        v[265] = ((v[264] >>> v[61])) & 4294967295L;
        v[266] = ((v[264] & v[63])) & 4294967295L;
        v[267] = ((v[266] | v[62])) & 4294967295L;
        v[268] = v[265] == 0L ? 1L : 0L;
        v[269] = LibC.call(m, "llvm.umax.i32", new long[]{v[265], 1L});
        v[270] = v[268] != 0 ? v[62] : 0L;
        v[271] = ((v[270] ^ v[267])) & 4294967295L;
        v[272] = ((v[269] - v[64])) & 4294967295L;
        v[273] = ((v[272] + 127L)) & 4294967295L;
        v[274] = Heap.s(v[271], 32) < Heap.s(v[62], 32) ? 1L : 0L;
        v[275] = Heap.s(v[273], 32) > Heap.s(1L, 32) ? 1L : 0L;
        v[276] = Heap.s(v[271], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[277] = ((v[275] & v[276])) & 1L;
        v[278] = ((v[274] & v[277])) & 1L;
        return v[278] != 0 ? 38 : 39;
    }

    private static int b38(Heap m, long[] v, int previous) {
        long phi279 = (previous == 38 ? v[282] : v[271]);
        long phi280 = (previous == 38 ? v[281] : v[273]);
        v[279] = phi279;
        v[280] = phi280;
        v[281] = ((v[280] + 4294967295L)) & 4294967295L;
        v[282] = ((v[279] << 1L)) & 4294967295L;
        v[283] = Heap.s(v[282], 32) < Heap.s(v[62], 32) ? 1L : 0L;
        v[284] = v[280] > 2L ? 1L : 0L;
        v[285] = v[283] != 0 ? v[284] : 0L;
        v[286] = Heap.s(v[282], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[287] = ((v[286] & v[285])) & 1L;
        return v[287] != 0 ? 38 : 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        long phi288 = (previous == 37 ? v[273] : v[281]);
        long phi289 = (previous == 37 ? v[271] : v[282]);
        long phi290 = (previous == 37 ? v[274] : v[283]);
        v[288] = phi288;
        v[289] = phi289;
        v[290] = phi290;
        v[291] = ((v[288] << 23L)) & 4294967295L;
        v[292] = v[290] != 0 ? 0L : v[291];
        v[293] = v[290] != 0 ? 0L : v[62];
        v[294] = ((v[293] ^ v[289])) & 4294967295L;
        v[295] = ((v[294] << v[65])) & 4294967295L;
        v[296] = ((v[262] & 2147483648L)) & 4294967295L;
        v[297] = ((v[292] | v[296])) & 4294967295L;
        v[298] = ((v[297] | v[295])) & 4294967295L;
        v[299] = ((v[250] >>> v[1])) & 4294967295L;
        v[300] = (v[52] + (Heap.s(v[299], 32) * 4L)) & 4294967295L;
        v[301] = m.load(v[300], 4);
        v[302] = (v[249] + (Heap.s(v[301], 32) * 4L)) & 4294967295L;
        m.store(v[302], v[298], 4);
        v[303] = ((v[250] + v[10])) & 4294967295L;
        v[304] = v[303] < v[23] ? 1L : 0L;
        return v[304] != 0 ? 37 : 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[305] = ((v[243] + v[10])) & 4294967295L;
        v[306] = v[305] < v[20] ? 1L : 0L;
        return v[306] != 0 ? 35 : 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        long phi307 = (previous == 3 ? 4294967295L : (previous == 2 ? 4294967295L : (previous == 1 ? 0L : (previous == 0 ? 0L : (previous == 12 ? 0L : (previous == 17 ? 0L : (previous == 10 ? 0L : (previous == 8 ? 0L : (previous == 6 ? 0L : (previous == 4 ? 0L : (previous == 16 ? 0L : (previous == 22 ? 0L : (previous == 26 ? 0L : (previous == 30 ? 0L : (previous == 34 ? 0L : 0L)))))))))))))));
        v[307] = phi307;
        v[308] = v[307];
        return -1;
    }
}
