package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: padHorizontally.
 */
public final class F0429_padHorizontally {

    private F0429_padHorizontally() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[228];
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
                    default:
                        throw new IllegalStateException("Invalid block in padHorizontally");
                }
                previous = old;
                if (pc < 0) {
                    return v[227];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.stack(64L * 1L, 4);
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((v[5] << 4L)) & 4294967295L;
        v[7] = v[3] == v[6] ? 1L : 0L;
        return v[7] != 0 ? 31 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32848L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = v[9] == 0L ? 1L : 0L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[13] = v[10] != 0 ? v[12] : v[11];
        v[14] = m.load(v[13], 4);
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[3] + 4294967295L)) & 4294967295L;
        v[18] = v[14] < 3L ? 1L : 0L;
        v[19] = v[18] != 0 ? 1L : v[16];
        v[20] = v[16] == 0L ? 1L : 0L;
        return v[20] != 0 ? 7 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[21] = ((v[16] & 3L)) & 4294967295L;
        v[22] = v[16] < 4L ? 1L : 0L;
        return v[22] != 0 ? 5 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[23] = ((v[16] & 4294967292L)) & 4294967295L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi24 = (previous == 3 ? 0L : v[45]);
        long phi25 = (previous == 3 ? 0L : v[46]);
        v[24] = phi24;
        v[25] = phi25;
        v[26] = ((v[24] & 12L)) & 4294967295L;
        v[27] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        m.store(v[29], v[28], 4);
        v[30] = ((v[24] & 12L)) & 4294967295L;
        v[31] = ((v[30] | 1L)) & 4294967295L;
        v[32] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[31], 32) * 4L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[31], 32) * 4L)) & 4294967295L;
        m.store(v[34], v[33], 4);
        v[35] = ((v[24] & 12L)) & 4294967295L;
        v[36] = ((v[35] | 2L)) & 4294967295L;
        v[37] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[36], 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[36], 32) * 4L)) & 4294967295L;
        m.store(v[39], v[38], 4);
        v[40] = ((v[24] & 12L)) & 4294967295L;
        v[41] = ((v[40] | 3L)) & 4294967295L;
        v[42] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[41], 32) * 4L)) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[41], 32) * 4L)) & 4294967295L;
        m.store(v[44], v[43], 4);
        v[45] = ((v[24] + 4L)) & 4294967295L;
        v[46] = ((v[25] + 4L)) & 4294967295L;
        v[47] = v[46] == v[23] ? 1L : 0L;
        return v[47] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi48 = (previous == 2 ? 0L : v[45]);
        v[48] = phi48;
        v[49] = v[21] == 0L ? 1L : 0L;
        return v[49] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi50 = (previous == 6 ? v[56] : v[48]);
        long phi51 = (previous == 6 ? v[57] : 0L);
        v[50] = phi50;
        v[51] = phi51;
        v[52] = ((v[50] & 15L)) & 4294967295L;
        v[53] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[52], 32) * 4L)) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[52], 32) * 4L)) & 4294967295L;
        m.store(v[55], v[54], 4);
        v[56] = ((v[50] + 1L)) & 4294967295L;
        v[57] = ((v[51] + 1L)) & 4294967295L;
        v[58] = v[57] == v[21] ? 1L : 0L;
        return v[58] != 0 ? 7 : 6;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[59] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34240L) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = v[60] == 0L ? 1L : 0L;
        return v[61] != 0 ? 9 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[62] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34780L) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[64], v[63], 4);
        v[65] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34784L) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[67], v[66], 4);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[68] = ((v[17] << 4L)) & 4294967295L;
        v[69] = ((v[68] & 4294967040L)) & 4294967295L;
        v[70] = ((v[17] & 15L)) & 4294967295L;
        v[71] = v[19] == 0L ? 1L : 0L;
        v[72] = ((v[19] & 3L)) & 4294967295L;
        v[73] = v[19] < 4L ? 1L : 0L;
        v[74] = ((v[19] & 4294967292L)) & 4294967295L;
        v[75] = v[72] == 0L ? 1L : 0L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi76 = (previous == 9 ? v[5] : v[143]);
        long phi77 = (previous == 9 ? v[5] : v[144]);
        long phi78 = (previous == 9 ? 0L : v[145]);
        v[76] = phi76;
        v[77] = phi77;
        v[78] = phi78;
        v[79] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[78], 32) * 16L) + (Heap.s(v[70], 32) * 1L)) & 4294967295L;
        v[80] = m.load(v[79], 1);
        v[81] = (v[80]) & 4294967295L;
        v[82] = ((v[69] | v[81])) & 4294967295L;
        v[83] = ((v[77] << 4L)) & 4294967295L;
        v[84] = v[3] < v[83] ? 1L : 0L;
        return v[84] != 0 ? 11 : 18;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi85 = (previous == 17 ? v[139] : v[76]);
        long phi86 = (previous == 17 ? v[140] : v[3]);
        v[85] = phi85;
        v[86] = phi86;
        v[87] = ((v[86] << 4L)) & 4294967295L;
        v[88] = ((v[87] & 4294967040L)) & 4294967295L;
        v[89] = ((v[86] & 15L)) & 4294967295L;
        v[90] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[78], 32) * 16L) + (Heap.s(v[89], 32) * 1L)) & 4294967295L;
        v[91] = m.load(v[90], 1);
        v[92] = (v[91]) & 4294967295L;
        v[93] = ((v[88] | v[92])) & 4294967295L;
        return v[71] != 0 ? 17 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        return v[73] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi94 = (previous == 13 ? v[123] : 0L);
        long phi95 = (previous == 13 ? v[124] : 0L);
        v[94] = phi94;
        v[95] = phi95;
        v[96] = ((v[94] & 12L)) & 4294967295L;
        v[97] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[96], 32) * 4L)) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = (v[98] + (Heap.s(v[82], 32) * 4L)) & 4294967295L;
        v[100] = m.load(v[99], 4);
        v[101] = (v[98] + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        m.store(v[101], v[100], 4);
        v[102] = ((v[94] & 12L)) & 4294967295L;
        v[103] = ((v[102] | 1L)) & 4294967295L;
        v[104] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[103], 32) * 4L)) & 4294967295L;
        v[105] = m.load(v[104], 4);
        v[106] = (v[105] + (Heap.s(v[82], 32) * 4L)) & 4294967295L;
        v[107] = m.load(v[106], 4);
        v[108] = (v[105] + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        m.store(v[108], v[107], 4);
        v[109] = ((v[94] & 12L)) & 4294967295L;
        v[110] = ((v[109] | 2L)) & 4294967295L;
        v[111] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[110], 32) * 4L)) & 4294967295L;
        v[112] = m.load(v[111], 4);
        v[113] = (v[112] + (Heap.s(v[82], 32) * 4L)) & 4294967295L;
        v[114] = m.load(v[113], 4);
        v[115] = (v[112] + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        m.store(v[115], v[114], 4);
        v[116] = ((v[94] & 12L)) & 4294967295L;
        v[117] = ((v[116] | 3L)) & 4294967295L;
        v[118] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[117], 32) * 4L)) & 4294967295L;
        v[119] = m.load(v[118], 4);
        v[120] = (v[119] + (Heap.s(v[82], 32) * 4L)) & 4294967295L;
        v[121] = m.load(v[120], 4);
        v[122] = (v[119] + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        m.store(v[122], v[121], 4);
        v[123] = ((v[94] + 4L)) & 4294967295L;
        v[124] = ((v[95] + 4L)) & 4294967295L;
        v[125] = v[124] == v[74] ? 1L : 0L;
        return v[125] != 0 ? 14 : 13;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi126 = (previous == 12 ? 0L : v[123]);
        v[126] = phi126;
        return v[75] != 0 ? 16 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi127 = (previous == 15 ? v[135] : v[126]);
        long phi128 = (previous == 15 ? v[136] : 0L);
        v[127] = phi127;
        v[128] = phi128;
        v[129] = ((v[127] & 15L)) & 4294967295L;
        v[130] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        v[131] = m.load(v[130], 4);
        v[132] = (v[131] + (Heap.s(v[82], 32) * 4L)) & 4294967295L;
        v[133] = m.load(v[132], 4);
        v[134] = (v[131] + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        m.store(v[134], v[133], 4);
        v[135] = ((v[127] + 1L)) & 4294967295L;
        v[136] = ((v[128] + 1L)) & 4294967295L;
        v[137] = v[136] == v[72] ? 1L : 0L;
        return v[137] != 0 ? 16 : 15;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[138] = m.load(v[4], 4);
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi139 = (previous == 16 ? v[138] : v[85]);
        v[139] = phi139;
        v[140] = ((v[86] + 1L)) & 4294967295L;
        v[141] = ((v[139] << 4L)) & 4294967295L;
        v[142] = v[140] < v[141] ? 1L : 0L;
        return v[142] != 0 ? 11 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi143 = (previous == 10 ? v[76] : v[139]);
        long phi144 = (previous == 10 ? v[77] : v[139]);
        v[143] = phi143;
        v[144] = phi144;
        v[145] = ((v[78] + 1L)) & 4294967295L;
        v[146] = v[145] == 16L ? 1L : 0L;
        return v[146] != 0 ? 19 : 10;
    }

    private static int b19(Heap m, long[] v, int previous) {
        switch ((int) v[14]) {
            case 2:
                return 20;
            case 1:
                return 25;
            default:
                return 30;
        }
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[147] = ((v[17] >>> 1L)) & 4294967295L;
        v[148] = ((v[17] << 3L)) & 4294967295L;
        v[149] = ((v[148] & 4294967168L)) & 4294967295L;
        v[150] = ((v[147] & 7L)) & 4294967295L;
        v[151] = ((v[147] + 1L)) & 4294967295L;
        v[152] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[153] = m.load(v[152], 4);
        v[154] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[155] = m.load(v[154], 4);
        v[156] = (v[153] + (Heap.s(v[149], 32) * 4L)) & 4294967295L;
        v[157] = (v[155] + (Heap.s(v[149], 32) * 4L)) & 4294967295L;
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi158 = (previous == 20 ? v[143] : v[184]);
        long phi159 = (previous == 20 ? 0L : v[185]);
        v[158] = phi158;
        v[159] = phi159;
        v[160] = ((v[158] << 3L)) & 4294967295L;
        v[161] = v[151] < v[160] ? 1L : 0L;
        return v[161] != 0 ? 22 : 24;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[162] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[159], 32) * 16L) + (Heap.s(v[150], 32) * 1L)) & 4294967295L;
        v[163] = m.load(v[162], 1);
        v[164] = (v[163]) & 4294967295L;
        v[165] = (v[156] + (Heap.s(v[164], 32) * 4L)) & 4294967295L;
        v[166] = (v[157] + (Heap.s(v[164], 32) * 4L)) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi167 = (previous == 23 ? v[180] : v[151]);
        v[167] = phi167;
        v[168] = ((v[167] << 4L)) & 4294967295L;
        v[169] = ((v[168] & 4294967168L)) & 4294967295L;
        v[170] = ((v[167] & 7L)) & 4294967295L;
        v[171] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[159], 32) * 16L) + (Heap.s(v[170], 32) * 1L)) & 4294967295L;
        v[172] = m.load(v[171], 1);
        v[173] = (v[172]) & 4294967295L;
        v[174] = m.load(v[165], 4);
        v[175] = (v[153] + (Heap.s(v[169], 32) * 4L)) & 4294967295L;
        v[176] = (v[175] + (Heap.s(v[173], 32) * 4L)) & 4294967295L;
        m.store(v[176], v[174], 4);
        v[177] = m.load(v[166], 4);
        v[178] = (v[155] + (Heap.s(v[169], 32) * 4L)) & 4294967295L;
        v[179] = (v[178] + (Heap.s(v[173], 32) * 4L)) & 4294967295L;
        m.store(v[179], v[177], 4);
        v[180] = ((v[167] + 1L)) & 4294967295L;
        v[181] = m.load(v[4], 4);
        v[182] = ((v[181] << 3L)) & 4294967295L;
        v[183] = v[180] < v[182] ? 1L : 0L;
        return v[183] != 0 ? 23 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi184 = (previous == 21 ? v[158] : v[181]);
        v[184] = phi184;
        v[185] = ((v[159] + 1L)) & 4294967295L;
        v[186] = v[185] == 16L ? 1L : 0L;
        return v[186] != 0 ? 30 : 21;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[187] = ((v[17] >>> 1L)) & 4294967295L;
        v[188] = ((v[17] << 2L)) & 4294967295L;
        v[189] = ((v[188] & 4294967232L)) & 4294967295L;
        v[190] = ((v[187] & 7L)) & 4294967295L;
        v[191] = ((v[187] + 1L)) & 4294967295L;
        v[192] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[193] = m.load(v[192], 4);
        v[194] = (v[1] + (Heap.s(0L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[195] = m.load(v[194], 4);
        v[196] = (v[193] + (Heap.s(v[189], 32) * 4L)) & 4294967295L;
        v[197] = (v[195] + (Heap.s(v[189], 32) * 4L)) & 4294967295L;
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi198 = (previous == 25 ? v[143] : v[224]);
        long phi199 = (previous == 25 ? 0L : v[225]);
        v[198] = phi198;
        v[199] = phi199;
        v[200] = ((v[198] << 3L)) & 4294967295L;
        v[201] = v[191] < v[200] ? 1L : 0L;
        return v[201] != 0 ? 27 : 29;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[202] = (13552L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[199], 32) * 8L) + (Heap.s(v[190], 32) * 1L)) & 4294967295L;
        v[203] = m.load(v[202], 1);
        v[204] = (v[203]) & 4294967295L;
        v[205] = (v[196] + (Heap.s(v[204], 32) * 4L)) & 4294967295L;
        v[206] = (v[197] + (Heap.s(v[204], 32) * 4L)) & 4294967295L;
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi207 = (previous == 28 ? v[220] : v[191]);
        v[207] = phi207;
        v[208] = ((v[207] << 3L)) & 4294967295L;
        v[209] = ((v[208] & 4294967232L)) & 4294967295L;
        v[210] = ((v[207] & 7L)) & 4294967295L;
        v[211] = (13552L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[199], 32) * 8L) + (Heap.s(v[210], 32) * 1L)) & 4294967295L;
        v[212] = m.load(v[211], 1);
        v[213] = (v[212]) & 4294967295L;
        v[214] = m.load(v[205], 4);
        v[215] = (v[193] + (Heap.s(v[209], 32) * 4L)) & 4294967295L;
        v[216] = (v[215] + (Heap.s(v[213], 32) * 4L)) & 4294967295L;
        m.store(v[216], v[214], 4);
        v[217] = m.load(v[206], 4);
        v[218] = (v[195] + (Heap.s(v[209], 32) * 4L)) & 4294967295L;
        v[219] = (v[218] + (Heap.s(v[213], 32) * 4L)) & 4294967295L;
        m.store(v[219], v[217], 4);
        v[220] = ((v[207] + 1L)) & 4294967295L;
        v[221] = m.load(v[4], 4);
        v[222] = ((v[221] << 3L)) & 4294967295L;
        v[223] = v[220] < v[222] ? 1L : 0L;
        return v[223] != 0 ? 28 : 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi224 = (previous == 26 ? v[198] : v[221]);
        v[224] = phi224;
        v[225] = ((v[199] + 1L)) & 4294967295L;
        v[226] = v[225] == 8L ? 1L : 0L;
        return v[226] != 0 ? 30 : 26;
    }

    private static int b30(Heap m, long[] v, int previous) {
        return 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        return -1;
    }
}
