package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: inputMBRowAlpha.
 */
public final class F0431_inputMBRowAlpha {

    private F0431_inputMBRowAlpha() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[370];
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
                    default:
                        throw new IllegalStateException("Invalid block in inputMBRowAlpha");
                }
                previous = old;
                if (pc < 0) {
                    return v[369];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 1 : 40;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 40 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[7] = (v[5] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        v[10] = v[9] != 0 ? 0L : 3L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 12L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 20L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = v[17] == 4L ? 1L : 0L;
        v[19] = v[18] != 0 ? 4L : 3L;
        v[20] = ((v[19] + v[15])) & 4294967295L;
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 4L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = m.load(v[11], 4);
        v[24] = (v[5] + (Heap.s(0L, 32) * 35064L) + 34716L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 16L) & 4294967295L;
        v[27] = (v[5] + (Heap.s(0L, 32) * 35064L) + 76L + 32832L) & 4294967295L;
        v[28] = (v[5] + (Heap.s(0L, 32) * 35064L) + 76L + 32833L) & 4294967295L;
        v[29] = v[23] == 0L ? 1L : 0L;
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 8L) & 4294967295L;
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[32] = ((v[23] + 4294967295L)) & 4294967295L;
        v[33] = ((v[32] << 4L)) & 4294967295L;
        v[34] = ((v[33] & 4294967040L)) & 4294967295L;
        v[35] = ((v[32] & 15L)) & 4294967295L;
        switch ((int) v[13]) {
            case 1:
                return 3;
            case 2:
                return 3;
            case 3:
                return 3;
            case 4:
                return 3;
            case 6:
                return 3;
            case 7:
                return 3;
            default:
                return 40;
        }
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = ((v[23] + 4294967295L)) & 4294967295L;
        v[39] = ((v[23] & 1L)) & 4294967295L;
        v[40] = v[38] == 0L ? 1L : 0L;
        v[41] = ((v[23] & 4294967294L)) & 4294967295L;
        v[42] = v[39] == 0L ? 1L : 0L;
        v[43] = ((v[23] & 1L)) & 4294967295L;
        v[44] = v[38] == 0L ? 1L : 0L;
        v[45] = ((v[23] & 4294967294L)) & 4294967295L;
        v[46] = v[43] == 0L ? 1L : 0L;
        v[47] = ((v[23] & 1L)) & 4294967295L;
        v[48] = v[38] == 0L ? 1L : 0L;
        v[49] = ((v[23] & 4294967294L)) & 4294967295L;
        v[50] = v[47] == 0L ? 1L : 0L;
        v[51] = ((v[23] & 1L)) & 4294967295L;
        v[52] = v[38] == 0L ? 1L : 0L;
        v[53] = ((v[23] & 4294967294L)) & 4294967295L;
        v[54] = v[51] == 0L ? 1L : 0L;
        return 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[55] = v[341] == 16L ? 1L : 0L;
        return v[55] != 0 ? 40 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi56 = (previous == 3 ? v[37] : v[345]);
        long phi57 = (previous == 3 ? 0L : v[341]);
        v[56] = phi56;
        v[57] = phi57;
        v[58] = m.load(v[26], 4);
        switch ((int) v[13]) {
            case 1:
                return 6;
            case 2:
                return 9;
            case 3:
                return 12;
            case 4:
                return 15;
            case 6:
                return 17;
            default:
                return 20;
        }
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[59] = ((v[58] >>> 3L)) & 4294967295L;
        return v[29] != 0 ? 35 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        return v[52] != 0 ? 27 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi60 = (previous == 8 ? v[91] : 0L);
        long phi61 = (previous == 8 ? v[92] : v[56]);
        long phi62 = (previous == 8 ? v[93] : 0L);
        v[60] = phi60;
        v[61] = phi61;
        v[62] = phi62;
        v[63] = (v[61] + (Heap.s(v[20], 32) * 1L)) & 4294967295L;
        v[64] = m.load(v[63], 1);
        v[65] = (v[64]) & 4294967295L;
        v[66] = ((v[65] + 4294967168L)) & 4294967295L;
        v[67] = ((v[66] << v[10])) & 4294967295L;
        v[68] = ((v[60] << 4L)) & 4294967295L;
        v[69] = ((v[68] & 4294967040L)) & 4294967295L;
        v[70] = ((v[60] & 14L)) & 4294967295L;
        v[71] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[70], 32) * 1L)) & 4294967295L;
        v[72] = m.load(v[71], 1);
        v[73] = (v[72]) & 4294967295L;
        v[74] = ((v[69] | v[73])) & 4294967295L;
        v[75] = (v[25] + (Heap.s(v[74], 32) * 4L)) & 4294967295L;
        m.store(v[75], v[67], 4);
        v[76] = (v[61] + (Heap.s(v[59], 32) * 1L)) & 4294967295L;
        v[77] = (v[76] + (Heap.s(v[20], 32) * 1L)) & 4294967295L;
        v[78] = m.load(v[77], 1);
        v[79] = (v[78]) & 4294967295L;
        v[80] = ((v[79] + 4294967168L)) & 4294967295L;
        v[81] = ((v[80] << v[10])) & 4294967295L;
        v[82] = ((v[60] << 4L)) & 4294967295L;
        v[83] = ((v[82] & 4294967040L)) & 4294967295L;
        v[84] = ((v[60] & 14L)) & 4294967295L;
        v[85] = ((v[84] | 1L)) & 4294967295L;
        v[86] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[85], 32) * 1L)) & 4294967295L;
        v[87] = m.load(v[86], 1);
        v[88] = (v[87]) & 4294967295L;
        v[89] = ((v[83] | v[88])) & 4294967295L;
        v[90] = (v[25] + (Heap.s(v[89], 32) * 4L)) & 4294967295L;
        m.store(v[90], v[81], 4);
        v[91] = ((v[60] + 2L)) & 4294967295L;
        v[92] = (v[76] + (Heap.s(v[59], 32) * 1L)) & 4294967295L;
        v[93] = ((v[62] + 2L)) & 4294967295L;
        v[94] = v[93] == v[53] ? 1L : 0L;
        return v[94] != 0 ? 27 : 8;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[95] = ((v[58] >>> 4L)) & 4294967295L;
        return v[29] != 0 ? 35 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[96] = m.load(v[27], 1);
        v[97] = (v[96]) & 4294967295L;
        return v[48] != 0 ? 29 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi98 = (previous == 11 ? v[131] : 0L);
        long phi99 = (previous == 11 ? v[132] : v[56]);
        long phi100 = (previous == 11 ? v[133] : 0L);
        v[98] = phi98;
        v[99] = phi99;
        v[100] = phi100;
        v[101] = (v[99] + (Heap.s(v[20], 32) * 2L)) & 4294967295L;
        v[102] = m.load(v[101], 2);
        v[103] = (v[102]) & 4294967295L;
        v[104] = ((v[103] + 4294934528L)) & 4294967295L;
        v[105] = ((Heap.s(v[104], 32) >> v[97])) & 4294967295L;
        v[106] = ((v[105] << v[10])) & 4294967295L;
        v[107] = ((v[98] << 4L)) & 4294967295L;
        v[108] = ((v[107] & 4294967040L)) & 4294967295L;
        v[109] = ((v[98] & 14L)) & 4294967295L;
        v[110] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[109], 32) * 1L)) & 4294967295L;
        v[111] = m.load(v[110], 1);
        v[112] = (v[111]) & 4294967295L;
        v[113] = ((v[108] | v[112])) & 4294967295L;
        v[114] = (v[25] + (Heap.s(v[113], 32) * 4L)) & 4294967295L;
        m.store(v[114], v[106], 4);
        v[115] = (v[99] + (Heap.s(v[95], 32) * 2L)) & 4294967295L;
        v[116] = (v[115] + (Heap.s(v[20], 32) * 2L)) & 4294967295L;
        v[117] = m.load(v[116], 2);
        v[118] = (v[117]) & 4294967295L;
        v[119] = ((v[118] + 4294934528L)) & 4294967295L;
        v[120] = ((Heap.s(v[119], 32) >> v[97])) & 4294967295L;
        v[121] = ((v[120] << v[10])) & 4294967295L;
        v[122] = ((v[98] << 4L)) & 4294967295L;
        v[123] = ((v[122] & 4294967040L)) & 4294967295L;
        v[124] = ((v[98] & 14L)) & 4294967295L;
        v[125] = ((v[124] | 1L)) & 4294967295L;
        v[126] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[125], 32) * 1L)) & 4294967295L;
        v[127] = m.load(v[126], 1);
        v[128] = (v[127]) & 4294967295L;
        v[129] = ((v[123] | v[128])) & 4294967295L;
        v[130] = (v[25] + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        m.store(v[130], v[121], 4);
        v[131] = ((v[98] + 2L)) & 4294967295L;
        v[132] = (v[115] + (Heap.s(v[95], 32) * 2L)) & 4294967295L;
        v[133] = ((v[100] + 2L)) & 4294967295L;
        v[134] = v[133] == v[49] ? 1L : 0L;
        return v[134] != 0 ? 29 : 11;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[135] = ((v[58] >>> 4L)) & 4294967295L;
        return v[29] != 0 ? 35 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[136] = m.load(v[27], 1);
        v[137] = (v[136]) & 4294967295L;
        return v[44] != 0 ? 31 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi138 = (previous == 14 ? v[169] : 0L);
        long phi139 = (previous == 14 ? v[170] : v[56]);
        long phi140 = (previous == 14 ? v[171] : 0L);
        v[138] = phi138;
        v[139] = phi139;
        v[140] = phi140;
        v[141] = (v[139] + (Heap.s(v[20], 32) * 2L)) & 4294967295L;
        v[142] = m.load(v[141], 2);
        v[143] = (Heap.s(v[142], 16)) & 4294967295L;
        v[144] = ((Heap.s(v[143], 32) >> v[137])) & 4294967295L;
        v[145] = ((v[144] << v[10])) & 4294967295L;
        v[146] = ((v[138] << 4L)) & 4294967295L;
        v[147] = ((v[146] & 4294967040L)) & 4294967295L;
        v[148] = ((v[138] & 14L)) & 4294967295L;
        v[149] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[148], 32) * 1L)) & 4294967295L;
        v[150] = m.load(v[149], 1);
        v[151] = (v[150]) & 4294967295L;
        v[152] = ((v[147] | v[151])) & 4294967295L;
        v[153] = (v[25] + (Heap.s(v[152], 32) * 4L)) & 4294967295L;
        m.store(v[153], v[145], 4);
        v[154] = (v[139] + (Heap.s(v[135], 32) * 2L)) & 4294967295L;
        v[155] = (v[154] + (Heap.s(v[20], 32) * 2L)) & 4294967295L;
        v[156] = m.load(v[155], 2);
        v[157] = (Heap.s(v[156], 16)) & 4294967295L;
        v[158] = ((Heap.s(v[157], 32) >> v[137])) & 4294967295L;
        v[159] = ((v[158] << v[10])) & 4294967295L;
        v[160] = ((v[138] << 4L)) & 4294967295L;
        v[161] = ((v[160] & 4294967040L)) & 4294967295L;
        v[162] = ((v[138] & 14L)) & 4294967295L;
        v[163] = ((v[162] | 1L)) & 4294967295L;
        v[164] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[163], 32) * 1L)) & 4294967295L;
        v[165] = m.load(v[164], 1);
        v[166] = (v[165]) & 4294967295L;
        v[167] = ((v[161] | v[166])) & 4294967295L;
        v[168] = (v[25] + (Heap.s(v[167], 32) * 4L)) & 4294967295L;
        m.store(v[168], v[159], 4);
        v[169] = ((v[138] + 2L)) & 4294967295L;
        v[170] = (v[154] + (Heap.s(v[135], 32) * 2L)) & 4294967295L;
        v[171] = ((v[140] + 2L)) & 4294967295L;
        v[172] = v[171] == v[45] ? 1L : 0L;
        return v[172] != 0 ? 31 : 14;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[173] = ((v[58] >>> 4L)) & 4294967295L;
        return v[29] != 0 ? 35 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi174 = (previous == 16 ? v[192] : 0L);
        long phi175 = (previous == 16 ? v[193] : v[56]);
        v[174] = phi174;
        v[175] = phi175;
        v[176] = (v[175] + (Heap.s(v[20], 32) * 2L)) & 4294967295L;
        v[177] = m.load(v[176], 2);
        v[178] = (Heap.s(v[177], 16)) & 4294967295L;
        v[179] = ((Heap.s(v[178], 32) >> 31L)) & 4294967295L;
        v[180] = ((v[178] & 32767L)) & 4294967295L;
        v[181] = ((v[180] ^ v[179])) & 4294967295L;
        v[182] = ((v[181] - v[179])) & 4294967295L;
        v[183] = ((v[182] << v[10])) & 4294967295L;
        v[184] = ((v[174] << 4L)) & 4294967295L;
        v[185] = ((v[184] & 4294967040L)) & 4294967295L;
        v[186] = ((v[174] & 15L)) & 4294967295L;
        v[187] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[186], 32) * 1L)) & 4294967295L;
        v[188] = m.load(v[187], 1);
        v[189] = (v[188]) & 4294967295L;
        v[190] = ((v[185] | v[189])) & 4294967295L;
        v[191] = (v[25] + (Heap.s(v[190], 32) * 4L)) & 4294967295L;
        m.store(v[191], v[183], 4);
        v[192] = ((v[174] + 1L)) & 4294967295L;
        v[193] = (v[175] + (Heap.s(v[173], 32) * 2L)) & 4294967295L;
        v[194] = v[192] == v[23] ? 1L : 0L;
        return v[194] != 0 ? 35 : 16;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[195] = ((v[58] >>> 5L)) & 4294967295L;
        return v[29] != 0 ? 35 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[196] = m.load(v[27], 1);
        v[197] = (v[196]) & 4294967295L;
        return v[40] != 0 ? 33 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi198 = (previous == 19 ? v[228] : v[56]);
        long phi199 = (previous == 19 ? v[227] : 0L);
        long phi200 = (previous == 19 ? v[229] : 0L);
        v[198] = phi198;
        v[199] = phi199;
        v[200] = phi200;
        v[201] = (v[198] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[202] = m.load(v[201], 4);
        v[203] = ((Heap.s(v[202], 32) >> v[197])) & 4294967295L;
        v[204] = ((v[203] << v[10])) & 4294967295L;
        v[205] = ((v[199] << 4L)) & 4294967295L;
        v[206] = ((v[205] & 4294967040L)) & 4294967295L;
        v[207] = ((v[199] & 14L)) & 4294967295L;
        v[208] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[207], 32) * 1L)) & 4294967295L;
        v[209] = m.load(v[208], 1);
        v[210] = (v[209]) & 4294967295L;
        v[211] = ((v[206] | v[210])) & 4294967295L;
        v[212] = (v[25] + (Heap.s(v[211], 32) * 4L)) & 4294967295L;
        m.store(v[212], v[204], 4);
        v[213] = (v[198] + (Heap.s(v[195], 32) * 4L)) & 4294967295L;
        v[214] = (v[213] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[215] = m.load(v[214], 4);
        v[216] = ((Heap.s(v[215], 32) >> v[197])) & 4294967295L;
        v[217] = ((v[216] << v[10])) & 4294967295L;
        v[218] = ((v[199] << 4L)) & 4294967295L;
        v[219] = ((v[218] & 4294967040L)) & 4294967295L;
        v[220] = ((v[199] & 14L)) & 4294967295L;
        v[221] = ((v[220] | 1L)) & 4294967295L;
        v[222] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[221], 32) * 1L)) & 4294967295L;
        v[223] = m.load(v[222], 1);
        v[224] = (v[223]) & 4294967295L;
        v[225] = ((v[219] | v[224])) & 4294967295L;
        v[226] = (v[25] + (Heap.s(v[225], 32) * 4L)) & 4294967295L;
        m.store(v[226], v[217], 4);
        v[227] = ((v[199] + 2L)) & 4294967295L;
        v[228] = (v[213] + (Heap.s(v[195], 32) * 4L)) & 4294967295L;
        v[229] = ((v[200] + 2L)) & 4294967295L;
        v[230] = v[229] == v[41] ? 1L : 0L;
        return v[230] != 0 ? 33 : 19;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[231] = ((v[58] >>> 5L)) & 4294967295L;
        return v[29] != 0 ? 35 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[232] = m.load(v[28], 1);
        v[233] = m.load(v[27], 1);
        v[234] = (Heap.s(v[232], 8)) & 4294967295L;
        v[235] = ((v[234] + 4294967169L)) & 4294967295L;
        v[236] = (v[233]) & 4294967295L;
        v[237] = ((23L - v[236])) & 4294967295L;
        v[238] = ((22L - v[236])) & 4294967295L;
        v[239] = ((1L << v[238])) & 4294967295L;
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi240 = (previous == 21 ? v[56] : v[279]);
        long phi241 = (previous == 21 ? 0L : v[278]);
        v[240] = phi240;
        v[241] = phi241;
        v[242] = (v[240] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[243] = m.load(v[242], 4);
        v[244] = Heap.fcmp("oeq", Heap.f(v[243]), Heap.f(0L));
        return v[244] != 0 ? 26 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[245] = (v[243]) & 4294967295L;
        v[246] = ((v[245] >>> 23L)) & 4294967295L;
        v[247] = ((v[246] & 255L)) & 4294967295L;
        v[248] = ((v[245] & 8388607L)) & 4294967295L;
        v[249] = LibC.call(m, "llvm.umax.i32", new long[]{v[247], 1L});
        v[250] = ((v[235] + v[249])) & 4294967295L;
        v[251] = Heap.s(v[250], 32) < Heap.s(2L, 32) ? 1L : 0L;
        return v[251] != 0 ? 24 : 25;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[252] = v[247] == 0L ? 1L : 0L;
        v[253] = ((v[248] | 8388608L)) & 4294967295L;
        v[254] = v[252] != 0 ? v[248] : v[253];
        v[255] = ((1L - v[250])) & 4294967295L;
        v[256] = ((v[254] >>> v[255])) & 4294967295L;
        v[257] = ((v[256] >>> 23L)) & 4294967295L;
        v[258] = ((v[256] & 8388607L)) & 4294967295L;
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi259 = (previous == 24 ? v[257] : v[250]);
        long phi260 = (previous == 24 ? v[258] : v[248]);
        v[259] = phi259;
        v[260] = phi260;
        v[261] = ((v[259] << v[236])) & 4294967295L;
        v[262] = ((v[260] + v[239])) & 4294967295L;
        v[263] = ((v[262] >>> v[237])) & 4294967295L;
        v[264] = ((v[263] + v[261])) & 4294967295L;
        v[265] = ((Heap.s(v[245], 32) >> 31L)) & 4294967295L;
        v[266] = ((v[264] ^ v[265])) & 4294967295L;
        v[267] = ((v[266] - v[265])) & 4294967295L;
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi268 = (previous == 25 ? v[267] : 0L);
        v[268] = phi268;
        v[269] = ((v[268] << v[10])) & 4294967295L;
        v[270] = ((v[241] << 4L)) & 4294967295L;
        v[271] = ((v[270] & 4294967040L)) & 4294967295L;
        v[272] = ((v[241] & 15L)) & 4294967295L;
        v[273] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[272], 32) * 1L)) & 4294967295L;
        v[274] = m.load(v[273], 1);
        v[275] = (v[274]) & 4294967295L;
        v[276] = ((v[271] | v[275])) & 4294967295L;
        v[277] = (v[25] + (Heap.s(v[276], 32) * 4L)) & 4294967295L;
        m.store(v[277], v[269], 4);
        v[278] = ((v[241] + 1L)) & 4294967295L;
        v[279] = (v[240] + (Heap.s(v[231], 32) * 4L)) & 4294967295L;
        v[280] = v[278] == v[23] ? 1L : 0L;
        return v[280] != 0 ? 35 : 22;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi281 = (previous == 7 ? 0L : v[91]);
        long phi282 = (previous == 7 ? v[56] : v[92]);
        v[281] = phi281;
        v[282] = phi282;
        return v[54] != 0 ? 35 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[283] = (v[282] + (Heap.s(v[20], 32) * 1L)) & 4294967295L;
        v[284] = m.load(v[283], 1);
        v[285] = (v[284]) & 4294967295L;
        v[286] = ((v[285] + 4294967168L)) & 4294967295L;
        v[287] = ((v[286] << v[10])) & 4294967295L;
        v[288] = ((v[281] << 4L)) & 4294967295L;
        v[289] = ((v[288] & 4294967040L)) & 4294967295L;
        v[290] = ((v[281] & 15L)) & 4294967295L;
        v[291] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[290], 32) * 1L)) & 4294967295L;
        v[292] = m.load(v[291], 1);
        v[293] = (v[292]) & 4294967295L;
        v[294] = ((v[289] | v[293])) & 4294967295L;
        v[295] = (v[25] + (Heap.s(v[294], 32) * 4L)) & 4294967295L;
        m.store(v[295], v[287], 4);
        return 35;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi296 = (previous == 10 ? 0L : v[131]);
        long phi297 = (previous == 10 ? v[56] : v[132]);
        v[296] = phi296;
        v[297] = phi297;
        return v[50] != 0 ? 35 : 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[298] = (v[297] + (Heap.s(v[20], 32) * 2L)) & 4294967295L;
        v[299] = m.load(v[298], 2);
        v[300] = (v[299]) & 4294967295L;
        v[301] = ((v[300] + 4294934528L)) & 4294967295L;
        v[302] = ((Heap.s(v[301], 32) >> v[97])) & 4294967295L;
        v[303] = ((v[302] << v[10])) & 4294967295L;
        v[304] = ((v[296] << 4L)) & 4294967295L;
        v[305] = ((v[304] & 4294967040L)) & 4294967295L;
        v[306] = ((v[296] & 15L)) & 4294967295L;
        v[307] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[306], 32) * 1L)) & 4294967295L;
        v[308] = m.load(v[307], 1);
        v[309] = (v[308]) & 4294967295L;
        v[310] = ((v[305] | v[309])) & 4294967295L;
        v[311] = (v[25] + (Heap.s(v[310], 32) * 4L)) & 4294967295L;
        m.store(v[311], v[303], 4);
        return 35;
    }

    private static int b31(Heap m, long[] v, int previous) {
        long phi312 = (previous == 13 ? 0L : v[169]);
        long phi313 = (previous == 13 ? v[56] : v[170]);
        v[312] = phi312;
        v[313] = phi313;
        return v[46] != 0 ? 35 : 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[314] = (v[313] + (Heap.s(v[20], 32) * 2L)) & 4294967295L;
        v[315] = m.load(v[314], 2);
        v[316] = (Heap.s(v[315], 16)) & 4294967295L;
        v[317] = ((Heap.s(v[316], 32) >> v[137])) & 4294967295L;
        v[318] = ((v[317] << v[10])) & 4294967295L;
        v[319] = ((v[312] << 4L)) & 4294967295L;
        v[320] = ((v[319] & 4294967040L)) & 4294967295L;
        v[321] = ((v[312] & 15L)) & 4294967295L;
        v[322] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[321], 32) * 1L)) & 4294967295L;
        v[323] = m.load(v[322], 1);
        v[324] = (v[323]) & 4294967295L;
        v[325] = ((v[320] | v[324])) & 4294967295L;
        v[326] = (v[25] + (Heap.s(v[325], 32) * 4L)) & 4294967295L;
        m.store(v[326], v[318], 4);
        return 35;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi327 = (previous == 18 ? v[56] : v[228]);
        long phi328 = (previous == 18 ? 0L : v[227]);
        v[327] = phi327;
        v[328] = phi328;
        return v[42] != 0 ? 35 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[329] = (v[327] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[330] = m.load(v[329], 4);
        v[331] = ((Heap.s(v[330], 32) >> v[197])) & 4294967295L;
        v[332] = ((v[331] << v[10])) & 4294967295L;
        v[333] = ((v[328] << 4L)) & 4294967295L;
        v[334] = ((v[333] & 4294967040L)) & 4294967295L;
        v[335] = ((v[328] & 15L)) & 4294967295L;
        v[336] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[335], 32) * 1L)) & 4294967295L;
        v[337] = m.load(v[336], 1);
        v[338] = (v[337]) & 4294967295L;
        v[339] = ((v[334] | v[338])) & 4294967295L;
        v[340] = (v[25] + (Heap.s(v[339], 32) * 4L)) & 4294967295L;
        m.store(v[340], v[332], 4);
        return 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[341] = ((v[57] + 1L)) & 4294967295L;
        v[342] = v[341] < v[22] ? 1L : 0L;
        return v[342] != 0 ? 36 : 37;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[343] = m.load(v[30], 4);
        v[344] = (v[56] + (Heap.s(v[343], 32) * 1L)) & 4294967295L;
        return 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        long phi345 = (previous == 36 ? v[344] : v[56]);
        v[345] = phi345;
        v[346] = m.load(v[31], 4);
        v[347] = ((v[346] << 4L)) & 4294967295L;
        v[348] = v[23] < v[347] ? 1L : 0L;
        return v[348] != 0 ? 38 : 4;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[349] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[35], 32) * 1L)) & 4294967295L;
        v[350] = m.load(v[349], 1);
        v[351] = (v[350]) & 4294967295L;
        v[352] = ((v[34] | v[351])) & 4294967295L;
        v[353] = (v[25] + (Heap.s(v[352], 32) * 4L)) & 4294967295L;
        v[354] = m.load(v[353], 4);
        return 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        long phi355 = (previous == 38 ? v[23] : v[364]);
        v[355] = phi355;
        v[356] = ((v[355] << 4L)) & 4294967295L;
        v[357] = ((v[356] & 4294967040L)) & 4294967295L;
        v[358] = ((v[355] & 15L)) & 4294967295L;
        v[359] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[57], 32) * 16L) + (Heap.s(v[358], 32) * 1L)) & 4294967295L;
        v[360] = m.load(v[359], 1);
        v[361] = (v[360]) & 4294967295L;
        v[362] = ((v[357] | v[361])) & 4294967295L;
        v[363] = (v[25] + (Heap.s(v[362], 32) * 4L)) & 4294967295L;
        m.store(v[363], v[354], 4);
        v[364] = ((v[355] + 1L)) & 4294967295L;
        v[365] = m.load(v[31], 4);
        v[366] = ((v[365] << 4L)) & 4294967295L;
        v[367] = v[364] < v[366] ? 1L : 0L;
        return v[367] != 0 ? 39 : 4;
    }

    private static int b40(Heap m, long[] v, int previous) {
        long phi368 = (previous == 1 ? 0L : (previous == 0 ? 0L : (previous == 2 ? 4294967295L : 0L)));
        v[368] = phi368;
        v[369] = v[368];
        return -1;
    }
}
