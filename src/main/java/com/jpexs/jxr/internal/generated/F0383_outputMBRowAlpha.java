package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: outputMBRowAlpha.
 */
public final class F0383_outputMBRowAlpha {

    private F0383_outputMBRowAlpha() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[299];
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
                    case 42:
                        pc = b42(m, v, previous);
                        break;
                    case 43:
                        pc = b43(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in outputMBRowAlpha");
                }
                previous = old;
                if (pc < 0) {
                    return v[298];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 12L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] == 1L ? 1L : 0L;
        return v[3] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 7L ? 1L : 0L;
        return v[6] != 0 ? 43 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 3 : 43;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = v[11] == 0L ? 1L : 0L;
        return v[12] != 0 ? 43 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[13] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = v[14] == 0L ? 1L : 0L;
        v[16] = v[15] != 0 ? 0L : 3L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[18] + (Heap.s(0L, 32) * 48L) + 36L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = ((v[22] << 4L)) & 4294967295L;
        v[24] = ((v[20] + 17L)) & 4294967295L;
        v[25] = ((v[24] - v[23])) & 4294967295L;
        v[26] = LibC.call(m, "llvm.umin.i32", new long[]{v[25], 16L});
        v[27] = (v[18] + (Heap.s(0L, 32) * 48L) + 28L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[28] + 1L)) & 4294967295L;
        v[30] = ((v[23] + 4294967280L)) & 4294967295L;
        v[31] = (v[18] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = v[30] > v[32] ? 1L : 0L;
        v[34] = ((v[32] & 15L)) & 4294967295L;
        v[35] = v[33] != 0 ? 0L : v[34];
        v[36] = (v[18] + (Heap.s(0L, 32) * 48L) + 24L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 20L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = v[41] == 4L ? 1L : 0L;
        v[43] = v[42] != 0 ? 4L : 3L;
        v[44] = ((v[43] + v[39])) & 4294967295L;
        v[45] = (v[11] + (Heap.s(0L, 32) * 35064L) + 34524L) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32832L) & 4294967295L;
        v[48] = m.load(v[47], 1);
        v[49] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32833L) & 4294967295L;
        v[50] = m.load(v[49], 1);
        v[51] = (v[18] + (Heap.s(0L, 32) * 48L) + 40L) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = (v[18] + (Heap.s(0L, 32) * 48L) + 44L) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = (v[54] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[56] = (v[55] + (Heap.s(4294967280L, 32) * 4L)) & 4294967295L;
        switch ((int) v[41]) {
            case 7:
                return 5;
            case 4:
                return 5;
            default:
                return 43;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        switch ((int) v[2]) {
            case 1:
                return 6;
            case 2:
                return 11;
            case 3:
                return 17;
            case 4:
                return 23;
            case 6:
                return 29;
            case 7:
                return 35;
            default:
                return 43;
        }
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[57] = ((128L << v[16])) & 4294967295L;
        v[58] = v[15] != 0 ? 0L : 4L;
        v[59] = ((v[57] | v[58])) & 4294967295L;
        v[60] = v[25] > v[35] ? 1L : 0L;
        return v[60] != 0 ? 7 : 43;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[61] = v[37] < v[29] ? 1L : 0L;
        v[62] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi63 = (previous == 7 ? v[35] : v[89]);
        v[63] = phi63;
        v[64] = (v[56] + (Heap.s(v[63], 32) * 4L)) & 4294967295L;
        v[65] = m.load(v[64], 4);
        return v[61] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi66 = (previous == 9 ? v[87] : v[37]);
        v[66] = phi66;
        v[67] = ((v[66] << 4L)) & 4294967295L;
        v[68] = ((v[67] & 4294967040L)) & 4294967295L;
        v[69] = ((v[66] & 15L)) & 4294967295L;
        v[70] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[63], 32) * 16L) + (Heap.s(v[69], 32) * 1L)) & 4294967295L;
        v[71] = m.load(v[70], 1);
        v[72] = (v[71]) & 4294967295L;
        v[73] = ((v[68] | v[72])) & 4294967295L;
        v[74] = (v[46] + (Heap.s(v[73], 32) * 4L)) & 4294967295L;
        v[75] = m.load(v[74], 4);
        v[76] = ((v[59] + v[75])) & 4294967295L;
        v[77] = ((Heap.s(v[76], 32) >> v[16])) & 4294967295L;
        v[78] = LibC.call(m, "llvm.smin.i32", new long[]{v[77], 255L});
        v[79] = LibC.call(m, "llvm.smax.i32", new long[]{v[78], 0L});
        v[80] = (v[79]) & 255L;
        v[81] = m.load(v[62], 4);
        v[82] = (v[52] + (Heap.s(v[66], 32) * 4L)) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = (v[81] + (Heap.s(v[83], 32) * 1L)) & 4294967295L;
        v[85] = (v[84] + (Heap.s(v[65], 32) * 1L)) & 4294967295L;
        v[86] = (v[85] + (Heap.s(v[44], 32) * 1L)) & 4294967295L;
        m.store(v[86], v[80], 1);
        v[87] = ((v[66] + 1L)) & 4294967295L;
        v[88] = v[66] == v[28] ? 1L : 0L;
        return v[88] != 0 ? 10 : 9;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[89] = ((v[63] + 1L)) & 4294967295L;
        v[90] = v[89] < v[26] ? 1L : 0L;
        return v[90] != 0 ? 8 : 43;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[91] = ((32768L << v[16])) & 4294967295L;
        v[92] = v[15] != 0 ? 0L : 4L;
        v[93] = ((v[91] | v[92])) & 4294967295L;
        v[94] = v[25] > v[35] ? 1L : 0L;
        return v[94] != 0 ? 12 : 43;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[95] = v[37] < v[29] ? 1L : 0L;
        v[96] = (v[48]) & 4294967295L;
        v[97] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi98 = (previous == 12 ? v[35] : v[125]);
        v[98] = phi98;
        return v[95] != 0 ? 14 : 16;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[99] = (v[56] + (Heap.s(v[98], 32) * 4L)) & 4294967295L;
        v[100] = m.load(v[99], 4);
        v[101] = m.load(v[97], 4);
        v[102] = (v[101] + (Heap.s(v[100], 32) * 2L)) & 4294967295L;
        v[103] = (v[102] + (Heap.s(v[44], 32) * 2L)) & 4294967295L;
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi104 = (previous == 14 ? v[37] : v[123]);
        v[104] = phi104;
        v[105] = ((v[104] << 4L)) & 4294967295L;
        v[106] = ((v[105] & 4294967040L)) & 4294967295L;
        v[107] = ((v[104] & 15L)) & 4294967295L;
        v[108] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[98], 32) * 16L) + (Heap.s(v[107], 32) * 1L)) & 4294967295L;
        v[109] = m.load(v[108], 1);
        v[110] = (v[109]) & 4294967295L;
        v[111] = ((v[106] | v[110])) & 4294967295L;
        v[112] = (v[46] + (Heap.s(v[111], 32) * 4L)) & 4294967295L;
        v[113] = m.load(v[112], 4);
        v[114] = ((v[93] + v[113])) & 4294967295L;
        v[115] = ((Heap.s(v[114], 32) >> v[16])) & 4294967295L;
        v[116] = ((v[115] << v[96])) & 4294967295L;
        v[117] = LibC.call(m, "llvm.smin.i32", new long[]{v[116], 65535L});
        v[118] = LibC.call(m, "llvm.smax.i32", new long[]{v[117], 0L});
        v[119] = (v[118]) & 65535L;
        v[120] = (v[52] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[121] = m.load(v[120], 4);
        v[122] = (v[103] + (Heap.s(v[121], 32) * 2L)) & 4294967295L;
        m.store(v[122], v[119], 2);
        v[123] = ((v[104] + 1L)) & 4294967295L;
        v[124] = v[104] == v[28] ? 1L : 0L;
        return v[124] != 0 ? 16 : 15;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[125] = ((v[98] + 1L)) & 4294967295L;
        v[126] = v[125] < v[26] ? 1L : 0L;
        return v[126] != 0 ? 13 : 43;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[127] = v[15] != 0 ? 0L : 4L;
        v[128] = v[25] > v[35] ? 1L : 0L;
        return v[128] != 0 ? 18 : 43;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[129] = v[37] < v[29] ? 1L : 0L;
        v[130] = (v[48]) & 4294967295L;
        v[131] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi132 = (previous == 18 ? v[35] : v[159]);
        v[132] = phi132;
        return v[129] != 0 ? 20 : 22;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[133] = (v[56] + (Heap.s(v[132], 32) * 4L)) & 4294967295L;
        v[134] = m.load(v[133], 4);
        v[135] = m.load(v[131], 4);
        v[136] = (v[135] + (Heap.s(v[134], 32) * 2L)) & 4294967295L;
        v[137] = (v[136] + (Heap.s(v[44], 32) * 2L)) & 4294967295L;
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi138 = (previous == 20 ? v[37] : v[157]);
        v[138] = phi138;
        v[139] = ((v[138] << 4L)) & 4294967295L;
        v[140] = ((v[139] & 4294967040L)) & 4294967295L;
        v[141] = ((v[138] & 15L)) & 4294967295L;
        v[142] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[132], 32) * 16L) + (Heap.s(v[141], 32) * 1L)) & 4294967295L;
        v[143] = m.load(v[142], 1);
        v[144] = (v[143]) & 4294967295L;
        v[145] = ((v[140] | v[144])) & 4294967295L;
        v[146] = (v[46] + (Heap.s(v[145], 32) * 4L)) & 4294967295L;
        v[147] = m.load(v[146], 4);
        v[148] = ((v[147] + v[127])) & 4294967295L;
        v[149] = ((Heap.s(v[148], 32) >> v[16])) & 4294967295L;
        v[150] = ((v[149] << v[130])) & 4294967295L;
        v[151] = LibC.call(m, "llvm.smin.i32", new long[]{v[150], 32767L});
        v[152] = LibC.call(m, "llvm.smax.i32", new long[]{v[151], 4294934528L});
        v[153] = (v[152]) & 65535L;
        v[154] = (v[52] + (Heap.s(v[138], 32) * 4L)) & 4294967295L;
        v[155] = m.load(v[154], 4);
        v[156] = (v[137] + (Heap.s(v[155], 32) * 2L)) & 4294967295L;
        m.store(v[156], v[153], 2);
        v[157] = ((v[138] + 1L)) & 4294967295L;
        v[158] = v[138] == v[28] ? 1L : 0L;
        return v[158] != 0 ? 22 : 21;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[159] = ((v[132] + 1L)) & 4294967295L;
        v[160] = v[159] < v[26] ? 1L : 0L;
        return v[160] != 0 ? 19 : 43;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[161] = v[15] != 0 ? 0L : 4L;
        v[162] = v[25] > v[35] ? 1L : 0L;
        return v[162] != 0 ? 24 : 43;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[163] = v[37] < v[29] ? 1L : 0L;
        v[164] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi165 = (previous == 24 ? v[35] : v[193]);
        v[165] = phi165;
        return v[163] != 0 ? 26 : 28;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[166] = (v[56] + (Heap.s(v[165], 32) * 4L)) & 4294967295L;
        v[167] = m.load(v[166], 4);
        v[168] = m.load(v[164], 4);
        v[169] = (v[168] + (Heap.s(v[167], 32) * 2L)) & 4294967295L;
        v[170] = (v[169] + (Heap.s(v[44], 32) * 2L)) & 4294967295L;
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi171 = (previous == 26 ? v[37] : v[191]);
        v[171] = phi171;
        v[172] = ((v[171] << 4L)) & 4294967295L;
        v[173] = ((v[172] & 4294967040L)) & 4294967295L;
        v[174] = ((v[171] & 15L)) & 4294967295L;
        v[175] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[165], 32) * 16L) + (Heap.s(v[174], 32) * 1L)) & 4294967295L;
        v[176] = m.load(v[175], 1);
        v[177] = (v[176]) & 4294967295L;
        v[178] = ((v[173] | v[177])) & 4294967295L;
        v[179] = (v[46] + (Heap.s(v[178], 32) * 4L)) & 4294967295L;
        v[180] = m.load(v[179], 4);
        v[181] = ((v[180] + v[161])) & 4294967295L;
        v[182] = ((Heap.s(v[181], 32) >> v[16])) & 4294967295L;
        v[183] = ((Heap.s(v[182], 32) >> 31L)) & 4294967295L;
        v[184] = ((v[182] & 32767L)) & 4294967295L;
        v[185] = ((v[184] ^ v[183])) & 4294967295L;
        v[186] = ((v[185] - v[183])) & 4294967295L;
        v[187] = (v[186]) & 65535L;
        v[188] = (v[52] + (Heap.s(v[171], 32) * 4L)) & 4294967295L;
        v[189] = m.load(v[188], 4);
        v[190] = (v[170] + (Heap.s(v[189], 32) * 2L)) & 4294967295L;
        m.store(v[190], v[187], 2);
        v[191] = ((v[171] + 1L)) & 4294967295L;
        v[192] = v[171] == v[28] ? 1L : 0L;
        return v[192] != 0 ? 28 : 27;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[193] = ((v[165] + 1L)) & 4294967295L;
        v[194] = v[193] < v[26] ? 1L : 0L;
        return v[194] != 0 ? 25 : 43;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[195] = v[15] != 0 ? 0L : 4L;
        v[196] = v[25] > v[35] ? 1L : 0L;
        return v[196] != 0 ? 30 : 43;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[197] = v[37] < v[29] ? 1L : 0L;
        v[198] = (v[48]) & 4294967295L;
        v[199] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        long phi200 = (previous == 30 ? v[35] : v[224]);
        v[200] = phi200;
        return v[197] != 0 ? 32 : 34;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[201] = (v[56] + (Heap.s(v[200], 32) * 4L)) & 4294967295L;
        v[202] = m.load(v[201], 4);
        v[203] = m.load(v[199], 4);
        v[204] = (v[203] + (Heap.s(v[202], 32) * 4L)) & 4294967295L;
        v[205] = (v[204] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi206 = (previous == 32 ? v[37] : v[222]);
        v[206] = phi206;
        v[207] = ((v[206] << 4L)) & 4294967295L;
        v[208] = ((v[207] & 4294967040L)) & 4294967295L;
        v[209] = ((v[206] & 15L)) & 4294967295L;
        v[210] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[200], 32) * 16L) + (Heap.s(v[209], 32) * 1L)) & 4294967295L;
        v[211] = m.load(v[210], 1);
        v[212] = (v[211]) & 4294967295L;
        v[213] = ((v[208] | v[212])) & 4294967295L;
        v[214] = (v[46] + (Heap.s(v[213], 32) * 4L)) & 4294967295L;
        v[215] = m.load(v[214], 4);
        v[216] = ((v[215] + v[195])) & 4294967295L;
        v[217] = ((Heap.s(v[216], 32) >> v[16])) & 4294967295L;
        v[218] = ((v[217] << v[198])) & 4294967295L;
        v[219] = (v[52] + (Heap.s(v[206], 32) * 4L)) & 4294967295L;
        v[220] = m.load(v[219], 4);
        v[221] = (v[205] + (Heap.s(v[220], 32) * 4L)) & 4294967295L;
        m.store(v[221], v[218], 4);
        v[222] = ((v[206] + 1L)) & 4294967295L;
        v[223] = v[206] == v[28] ? 1L : 0L;
        return v[223] != 0 ? 34 : 33;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[224] = ((v[200] + 1L)) & 4294967295L;
        v[225] = v[224] < v[26] ? 1L : 0L;
        return v[225] != 0 ? 31 : 43;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[226] = v[15] != 0 ? 0L : 4L;
        v[227] = v[25] > v[35] ? 1L : 0L;
        return v[227] != 0 ? 36 : 43;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[228] = v[37] < v[29] ? 1L : 0L;
        v[229] = (v[48]) & 4294967295L;
        v[230] = ((1L << v[229])) & 4294967295L;
        v[231] = ((v[230] + 4294967295L)) & 4294967295L;
        v[232] = (Heap.s(v[50], 8)) & 4294967295L;
        v[233] = ((23L - v[229])) & 4294967295L;
        v[234] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        return 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        long phi235 = (previous == 36 ? v[35] : v[295]);
        v[235] = phi235;
        return v[228] != 0 ? 38 : 42;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[236] = (v[56] + (Heap.s(v[235], 32) * 4L)) & 4294967295L;
        v[237] = m.load(v[236], 4);
        v[238] = m.load(v[234], 4);
        v[239] = (v[238] + (Heap.s(v[237], 32) * 4L)) & 4294967295L;
        v[240] = (v[239] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        return 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        long phi241 = (previous == 38 ? v[37] : v[293]);
        v[241] = phi241;
        v[242] = ((v[241] << 4L)) & 4294967295L;
        v[243] = ((v[242] & 4294967040L)) & 4294967295L;
        v[244] = ((v[241] & 15L)) & 4294967295L;
        v[245] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[235], 32) * 16L) + (Heap.s(v[244], 32) * 1L)) & 4294967295L;
        v[246] = m.load(v[245], 1);
        v[247] = (v[246]) & 4294967295L;
        v[248] = ((v[243] | v[247])) & 4294967295L;
        v[249] = (v[46] + (Heap.s(v[248], 32) * 4L)) & 4294967295L;
        v[250] = m.load(v[249], 4);
        v[251] = ((v[250] + v[226])) & 4294967295L;
        v[252] = ((Heap.s(v[251], 32) >> v[16])) & 4294967295L;
        v[253] = ((Heap.s(v[252], 32) >> 31L)) & 4294967295L;
        v[254] = ((v[253] ^ v[252])) & 4294967295L;
        v[255] = ((v[254] - v[253])) & 4294967295L;
        v[256] = ((v[255] >>> v[229])) & 4294967295L;
        v[257] = ((v[255] & v[231])) & 4294967295L;
        v[258] = ((v[257] | v[230])) & 4294967295L;
        v[259] = v[256] == 0L ? 1L : 0L;
        v[260] = LibC.call(m, "llvm.umax.i32", new long[]{v[256], 1L});
        v[261] = v[259] != 0 ? v[230] : 0L;
        v[262] = ((v[261] ^ v[258])) & 4294967295L;
        v[263] = ((v[260] - v[232])) & 4294967295L;
        v[264] = ((v[263] + 127L)) & 4294967295L;
        v[265] = Heap.s(v[262], 32) < Heap.s(v[230], 32) ? 1L : 0L;
        v[266] = Heap.s(v[264], 32) > Heap.s(1L, 32) ? 1L : 0L;
        v[267] = Heap.s(v[262], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[268] = ((v[266] & v[267])) & 1L;
        v[269] = ((v[265] & v[268])) & 1L;
        return v[269] != 0 ? 40 : 41;
    }

    private static int b40(Heap m, long[] v, int previous) {
        long phi270 = (previous == 40 ? v[273] : v[262]);
        long phi271 = (previous == 40 ? v[272] : v[264]);
        v[270] = phi270;
        v[271] = phi271;
        v[272] = ((v[271] + 4294967295L)) & 4294967295L;
        v[273] = ((v[270] << 1L)) & 4294967295L;
        v[274] = Heap.s(v[273], 32) < Heap.s(v[230], 32) ? 1L : 0L;
        v[275] = v[271] > 2L ? 1L : 0L;
        v[276] = v[274] != 0 ? v[275] : 0L;
        v[277] = Heap.s(v[273], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[278] = ((v[277] & v[276])) & 1L;
        return v[278] != 0 ? 40 : 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        long phi279 = (previous == 39 ? v[264] : v[272]);
        long phi280 = (previous == 39 ? v[262] : v[273]);
        long phi281 = (previous == 39 ? v[265] : v[274]);
        v[279] = phi279;
        v[280] = phi280;
        v[281] = phi281;
        v[282] = ((v[279] << 23L)) & 4294967295L;
        v[283] = v[281] != 0 ? 0L : v[282];
        v[284] = v[281] != 0 ? 0L : v[230];
        v[285] = ((v[284] ^ v[280])) & 4294967295L;
        v[286] = ((v[285] << v[233])) & 4294967295L;
        v[287] = ((v[253] & 2147483648L)) & 4294967295L;
        v[288] = ((v[283] | v[287])) & 4294967295L;
        v[289] = ((v[288] | v[286])) & 4294967295L;
        v[290] = (v[52] + (Heap.s(v[241], 32) * 4L)) & 4294967295L;
        v[291] = m.load(v[290], 4);
        v[292] = (v[240] + (Heap.s(v[291], 32) * 4L)) & 4294967295L;
        m.store(v[292], v[289], 4);
        v[293] = ((v[241] + 1L)) & 4294967295L;
        v[294] = v[241] == v[28] ? 1L : 0L;
        return v[294] != 0 ? 42 : 39;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[295] = ((v[235] + 1L)) & 4294967295L;
        v[296] = v[295] < v[26] ? 1L : 0L;
        return v[296] != 0 ? 37 : 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        long phi297 = (previous == 1 ? 0L : (previous == 5 ? 4294967295L : (previous == 4 ? 4294967295L : (previous == 3 ? 0L : (previous == 2 ? 0L : (previous == 6 ? 0L : (previous == 11 ? 0L : (previous == 17 ? 0L : (previous == 23 ? 0L : (previous == 29 ? 0L : (previous == 35 ? 0L : (previous == 10 ? 0L : (previous == 16 ? 0L : (previous == 22 ? 0L : (previous == 28 ? 0L : (previous == 34 ? 0L : 0L))))))))))))))));
        v[297] = phi297;
        v[298] = v[297];
        return -1;
    }
}
