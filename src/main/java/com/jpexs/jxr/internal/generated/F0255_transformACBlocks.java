package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transformACBlocks.
 */
public final class F0255_transformACBlocks {

    private F0255_transformACBlocks() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[243];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
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
                    default:
                        throw new IllegalStateException("Invalid block in transformACBlocks");
                }
                previous = old;
                if (pc < 0) {
                    return v[242];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((197L >>> v[2])) & 4294967295L;
        v[4] = ((v[3] & 1L)) & 4294967295L;
        v[5] = v[4] == 0L ? 1L : 0L;
        v[6] = ((83L >>> v[2])) & 4294967295L;
        v[7] = ((v[6] & 1L)) & 4294967295L;
        v[8] = v[7] == 0L ? 1L : 0L;
        v[9] = m.load(14068L, 4);
        v[10] = m.load(14076L, 4);
        v[11] = m.load(14084L, 4);
        v[12] = m.load(14092L, 4);
        v[13] = m.load(14100L, 4);
        v[14] = m.load(14108L, 4);
        v[15] = m.load(14116L, 4);
        v[16] = m.load(14124L, 4);
        v[17] = m.load(14080L, 4);
        v[18] = m.load(14112L, 4);
        v[19] = m.load(14084L, 4);
        v[20] = m.load(14088L, 4);
        v[21] = m.load(14120L, 4);
        v[22] = m.load(14092L, 4);
        v[23] = m.load(14124L, 4);
        return 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[24] = v[2] < 4L ? 1L : 0L;
        v[25] = v[5] != 0 ? 3L : 0L;
        v[26] = ((v[25] << 6L)) & 4294967295L;
        v[27] = (v[1] + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        v[28] = v[5] != 0 ? 2L : 1L;
        v[29] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[30] = ((v[28] << 6L)) & 4294967295L;
        v[31] = (v[1] + (Heap.s(v[30], 32) * 4L)) & 4294967295L;
        v[32] = v[5] != 0 ? 1L : 2L;
        v[33] = (v[0] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[34] = ((v[32] << 6L)) & 4294967295L;
        v[35] = (v[1] + (Heap.s(v[34], 32) * 4L)) & 4294967295L;
        v[36] = v[5] != 0 ? 0L : 3L;
        v[37] = (v[0] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[38] = ((v[36] << 6L)) & 4294967295L;
        v[39] = (v[1] + (Heap.s(v[38], 32) * 4L)) & 4294967295L;
        v[40] = ((v[25] << 4L)) & 4294967295L;
        v[41] = (v[1] + (Heap.s(v[40], 32) * 4L)) & 4294967295L;
        v[42] = v[5] != 0 ? 2L : 1L;
        v[43] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[44] = v[5] != 0 ? 1L : 2L;
        v[45] = (v[0] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[46] = v[5] != 0 ? 0L : 3L;
        v[47] = (v[0] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        return 7;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi48 = (previous == 0 ? v[0] : v[99]);
        long phi49 = (previous == 0 ? 0L : v[98]);
        v[48] = phi48;
        v[49] = phi49;
        return v[5] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[50] = (v[48] + (Heap.s(v[9], 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = ((0L - v[51])) & 4294967295L;
        m.store(v[50], v[52], 4);
        v[53] = (v[48] + (Heap.s(v[10], 32) * 4L)) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = ((0L - v[54])) & 4294967295L;
        m.store(v[53], v[55], 4);
        v[56] = (v[48] + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        v[57] = m.load(v[56], 4);
        v[58] = ((0L - v[57])) & 4294967295L;
        m.store(v[56], v[58], 4);
        v[59] = (v[48] + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = ((0L - v[60])) & 4294967295L;
        m.store(v[59], v[61], 4);
        v[62] = (v[48] + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = ((0L - v[63])) & 4294967295L;
        m.store(v[62], v[64], 4);
        v[65] = (v[48] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = ((0L - v[66])) & 4294967295L;
        m.store(v[65], v[67], 4);
        v[68] = (v[48] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = ((0L - v[69])) & 4294967295L;
        m.store(v[68], v[70], 4);
        v[71] = (v[48] + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = ((0L - v[72])) & 4294967295L;
        m.store(v[71], v[73], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[8] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[74] = (v[48] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[75] = m.load(v[74], 4);
        v[76] = ((0L - v[75])) & 4294967295L;
        m.store(v[74], v[76], 4);
        v[77] = (v[48] + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        v[78] = m.load(v[77], 4);
        v[79] = ((0L - v[78])) & 4294967295L;
        m.store(v[77], v[79], 4);
        v[80] = (v[48] + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = ((0L - v[81])) & 4294967295L;
        m.store(v[80], v[82], 4);
        v[83] = (v[48] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = ((0L - v[84])) & 4294967295L;
        m.store(v[83], v[85], 4);
        v[86] = (v[48] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[87] = m.load(v[86], 4);
        v[88] = ((0L - v[87])) & 4294967295L;
        m.store(v[86], v[88], 4);
        v[89] = (v[48] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[90] = m.load(v[89], 4);
        v[91] = ((0L - v[90])) & 4294967295L;
        m.store(v[89], v[91], 4);
        v[92] = (v[48] + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = ((0L - v[93])) & 4294967295L;
        m.store(v[92], v[94], 4);
        v[95] = (v[48] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[96] = m.load(v[95], 4);
        v[97] = ((0L - v[96])) & 4294967295L;
        m.store(v[95], v[97], 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[98] = ((v[49] + 1L)) & 4294967295L;
        v[99] = (v[48] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[100] = v[98] == 16L ? 1L : 0L;
        return v[100] != 0 ? 1 : 2;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi101 = (previous == 1 ? 0L : v[240]);
        v[101] = phi101;
        v[102] = ((v[101] ^ 3L)) & 4294967295L;
        v[103] = v[8] != 0 ? v[102] : v[101];
        v[104] = ((v[101] << 6L)) & 4294967295L;
        v[105] = ((v[103] << 4L)) & 4294967295L;
        v[106] = ((v[103] << 6L)) & 4294967295L;
        return v[24] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[107] = (v[41] + (Heap.s(v[106], 32) * 4L)) & 4294967295L;
        v[108] = (v[0] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[109] = LibC.call(m, "memcpy", new long[]{v[107], v[108], 64L});
        return 16;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[110] = (v[0] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[111] = (v[27] + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi112 = (previous == 9 ? 1L : v[137]);
        v[112] = phi112;
        v[113] = ((v[112] >>> 2L)) & 4294967295L;
        v[114] = ((v[112] << 2L)) & 4294967295L;
        v[115] = ((v[114] & 12L)) & 4294967295L;
        v[116] = ((v[115] | v[113])) & 4294967295L;
        v[117] = (14064L + (Heap.s(v[116], 32) * 4L)) & 4294967295L;
        v[118] = m.load(v[117], 4);
        v[119] = (v[110] + (Heap.s(v[118], 32) * 4L)) & 4294967295L;
        v[120] = m.load(v[119], 4);
        v[121] = (14064L + (Heap.s(v[112], 32) * 4L)) & 4294967295L;
        v[122] = m.load(v[121], 4);
        v[123] = (v[111] + (Heap.s(v[122], 32) * 4L)) & 4294967295L;
        m.store(v[123], v[120], 4);
        v[124] = ((v[112] + 1L)) & 4294967295L;
        v[125] = v[124] == 16L ? 1L : 0L;
        return v[125] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[126] = ((v[124] >>> 2L)) & 4294967295L;
        v[127] = ((v[124] << 2L)) & 4294967295L;
        v[128] = ((v[127] & 12L)) & 4294967295L;
        v[129] = ((v[128] | v[126])) & 4294967295L;
        v[130] = (14064L + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        v[131] = m.load(v[130], 4);
        v[132] = (v[110] + (Heap.s(v[131], 32) * 4L)) & 4294967295L;
        v[133] = m.load(v[132], 4);
        v[134] = (14064L + (Heap.s(v[124], 32) * 4L)) & 4294967295L;
        v[135] = m.load(v[134], 4);
        v[136] = (v[111] + (Heap.s(v[135], 32) * 4L)) & 4294967295L;
        m.store(v[136], v[133], 4);
        v[137] = ((v[112] + 2L)) & 4294967295L;
        return 10;
    }

    private static int b12(Heap m, long[] v, int previous) {
        return v[24] != 0 ? 16 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[138] = (v[29] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[139] = (v[31] + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi140 = (previous == 13 ? 1L : v[165]);
        v[140] = phi140;
        v[141] = ((v[140] >>> 2L)) & 4294967295L;
        v[142] = ((v[140] << 2L)) & 4294967295L;
        v[143] = ((v[142] & 12L)) & 4294967295L;
        v[144] = ((v[143] | v[141])) & 4294967295L;
        v[145] = (14064L + (Heap.s(v[144], 32) * 4L)) & 4294967295L;
        v[146] = m.load(v[145], 4);
        v[147] = (v[138] + (Heap.s(v[146], 32) * 4L)) & 4294967295L;
        v[148] = m.load(v[147], 4);
        v[149] = (14064L + (Heap.s(v[140], 32) * 4L)) & 4294967295L;
        v[150] = m.load(v[149], 4);
        v[151] = (v[139] + (Heap.s(v[150], 32) * 4L)) & 4294967295L;
        m.store(v[151], v[148], 4);
        v[152] = ((v[140] + 1L)) & 4294967295L;
        v[153] = v[152] == 16L ? 1L : 0L;
        return v[153] != 0 ? 17 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[154] = ((v[152] >>> 2L)) & 4294967295L;
        v[155] = ((v[152] << 2L)) & 4294967295L;
        v[156] = ((v[155] & 12L)) & 4294967295L;
        v[157] = ((v[156] | v[154])) & 4294967295L;
        v[158] = (14064L + (Heap.s(v[157], 32) * 4L)) & 4294967295L;
        v[159] = m.load(v[158], 4);
        v[160] = (v[138] + (Heap.s(v[159], 32) * 4L)) & 4294967295L;
        v[161] = m.load(v[160], 4);
        v[162] = (14064L + (Heap.s(v[152], 32) * 4L)) & 4294967295L;
        v[163] = m.load(v[162], 4);
        v[164] = (v[139] + (Heap.s(v[163], 32) * 4L)) & 4294967295L;
        m.store(v[164], v[161], 4);
        v[165] = ((v[140] + 2L)) & 4294967295L;
        return 14;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi166 = (previous == 8 ? v[42] : v[28]);
        v[166] = phi166;
        v[167] = ((v[166] << 4L)) & 4294967295L;
        v[168] = (v[1] + (Heap.s(v[167], 32) * 4L)) & 4294967295L;
        v[169] = (v[168] + (Heap.s(v[106], 32) * 4L)) & 4294967295L;
        v[170] = (v[43] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[171] = LibC.call(m, "memcpy", new long[]{v[169], v[170], 64L});
        return 21;
    }

    private static int b17(Heap m, long[] v, int previous) {
        return v[24] != 0 ? 21 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[172] = (v[33] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[173] = (v[35] + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi174 = (previous == 18 ? 1L : v[199]);
        v[174] = phi174;
        v[175] = ((v[174] >>> 2L)) & 4294967295L;
        v[176] = ((v[174] << 2L)) & 4294967295L;
        v[177] = ((v[176] & 12L)) & 4294967295L;
        v[178] = ((v[177] | v[175])) & 4294967295L;
        v[179] = (14064L + (Heap.s(v[178], 32) * 4L)) & 4294967295L;
        v[180] = m.load(v[179], 4);
        v[181] = (v[172] + (Heap.s(v[180], 32) * 4L)) & 4294967295L;
        v[182] = m.load(v[181], 4);
        v[183] = (14064L + (Heap.s(v[174], 32) * 4L)) & 4294967295L;
        v[184] = m.load(v[183], 4);
        v[185] = (v[173] + (Heap.s(v[184], 32) * 4L)) & 4294967295L;
        m.store(v[185], v[182], 4);
        v[186] = ((v[174] + 1L)) & 4294967295L;
        v[187] = v[186] == 16L ? 1L : 0L;
        return v[187] != 0 ? 22 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[188] = ((v[186] >>> 2L)) & 4294967295L;
        v[189] = ((v[186] << 2L)) & 4294967295L;
        v[190] = ((v[189] & 12L)) & 4294967295L;
        v[191] = ((v[190] | v[188])) & 4294967295L;
        v[192] = (14064L + (Heap.s(v[191], 32) * 4L)) & 4294967295L;
        v[193] = m.load(v[192], 4);
        v[194] = (v[172] + (Heap.s(v[193], 32) * 4L)) & 4294967295L;
        v[195] = m.load(v[194], 4);
        v[196] = (14064L + (Heap.s(v[186], 32) * 4L)) & 4294967295L;
        v[197] = m.load(v[196], 4);
        v[198] = (v[173] + (Heap.s(v[197], 32) * 4L)) & 4294967295L;
        m.store(v[198], v[195], 4);
        v[199] = ((v[174] + 2L)) & 4294967295L;
        return 19;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi200 = (previous == 16 ? v[44] : v[32]);
        v[200] = phi200;
        v[201] = ((v[200] << 4L)) & 4294967295L;
        v[202] = (v[1] + (Heap.s(v[201], 32) * 4L)) & 4294967295L;
        v[203] = (v[202] + (Heap.s(v[106], 32) * 4L)) & 4294967295L;
        v[204] = (v[45] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[205] = LibC.call(m, "memcpy", new long[]{v[203], v[204], 64L});
        return 26;
    }

    private static int b22(Heap m, long[] v, int previous) {
        return v[24] != 0 ? 26 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[206] = (v[37] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[207] = (v[39] + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi208 = (previous == 23 ? 1L : v[233]);
        v[208] = phi208;
        v[209] = ((v[208] >>> 2L)) & 4294967295L;
        v[210] = ((v[208] << 2L)) & 4294967295L;
        v[211] = ((v[210] & 12L)) & 4294967295L;
        v[212] = ((v[211] | v[209])) & 4294967295L;
        v[213] = (14064L + (Heap.s(v[212], 32) * 4L)) & 4294967295L;
        v[214] = m.load(v[213], 4);
        v[215] = (v[206] + (Heap.s(v[214], 32) * 4L)) & 4294967295L;
        v[216] = m.load(v[215], 4);
        v[217] = (14064L + (Heap.s(v[208], 32) * 4L)) & 4294967295L;
        v[218] = m.load(v[217], 4);
        v[219] = (v[207] + (Heap.s(v[218], 32) * 4L)) & 4294967295L;
        m.store(v[219], v[216], 4);
        v[220] = ((v[208] + 1L)) & 4294967295L;
        v[221] = v[220] == 16L ? 1L : 0L;
        return v[221] != 0 ? 27 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[222] = ((v[220] >>> 2L)) & 4294967295L;
        v[223] = ((v[220] << 2L)) & 4294967295L;
        v[224] = ((v[223] & 12L)) & 4294967295L;
        v[225] = ((v[224] | v[222])) & 4294967295L;
        v[226] = (14064L + (Heap.s(v[225], 32) * 4L)) & 4294967295L;
        v[227] = m.load(v[226], 4);
        v[228] = (v[206] + (Heap.s(v[227], 32) * 4L)) & 4294967295L;
        v[229] = m.load(v[228], 4);
        v[230] = (14064L + (Heap.s(v[220], 32) * 4L)) & 4294967295L;
        v[231] = m.load(v[230], 4);
        v[232] = (v[207] + (Heap.s(v[231], 32) * 4L)) & 4294967295L;
        m.store(v[232], v[229], 4);
        v[233] = ((v[208] + 2L)) & 4294967295L;
        return 24;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi234 = (previous == 21 ? v[46] : v[36]);
        v[234] = phi234;
        v[235] = ((v[234] << 4L)) & 4294967295L;
        v[236] = (v[1] + (Heap.s(v[235], 32) * 4L)) & 4294967295L;
        v[237] = (v[236] + (Heap.s(v[106], 32) * 4L)) & 4294967295L;
        v[238] = (v[47] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[239] = LibC.call(m, "memcpy", new long[]{v[237], v[238], 64L});
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[240] = ((v[101] + 1L)) & 4294967295L;
        v[241] = v[240] == 4L ? 1L : 0L;
        return v[241] != 0 ? 28 : 7;
    }

    private static int b28(Heap m, long[] v, int previous) {
        return -1;
    }
}
