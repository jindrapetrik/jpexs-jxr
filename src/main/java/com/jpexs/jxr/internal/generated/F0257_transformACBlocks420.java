package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transformACBlocks420.
 */
public final class F0257_transformACBlocks420 {

    private F0257_transformACBlocks420() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[226];
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
                    default:
                        throw new IllegalStateException("Invalid block in transformACBlocks420");
                }
                previous = old;
                if (pc < 0) {
                    return v[225];
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
        v[25] = ((v[7] ^ 1L)) & 4294967295L;
        v[26] = ((v[25] << 4L)) & 4294967295L;
        v[27] = ((v[25] << 5L)) & 4294967295L;
        v[28] = ((v[4] ^ 1L)) & 4294967295L;
        return v[24] != 0 ? 7 : 8;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi29 = (previous == 0 ? v[0] : v[80]);
        long phi30 = (previous == 0 ? 0L : v[79]);
        v[29] = phi29;
        v[30] = phi30;
        return v[5] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[31] = (v[29] + (Heap.s(v[9], 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = ((0L - v[32])) & 4294967295L;
        m.store(v[31], v[33], 4);
        v[34] = (v[29] + (Heap.s(v[10], 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = ((0L - v[35])) & 4294967295L;
        m.store(v[34], v[36], 4);
        v[37] = (v[29] + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = ((0L - v[38])) & 4294967295L;
        m.store(v[37], v[39], 4);
        v[40] = (v[29] + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = ((0L - v[41])) & 4294967295L;
        m.store(v[40], v[42], 4);
        v[43] = (v[29] + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = ((0L - v[44])) & 4294967295L;
        m.store(v[43], v[45], 4);
        v[46] = (v[29] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = ((0L - v[47])) & 4294967295L;
        m.store(v[46], v[48], 4);
        v[49] = (v[29] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = ((0L - v[50])) & 4294967295L;
        m.store(v[49], v[51], 4);
        v[52] = (v[29] + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = ((0L - v[53])) & 4294967295L;
        m.store(v[52], v[54], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[8] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[55] = (v[29] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = ((0L - v[56])) & 4294967295L;
        m.store(v[55], v[57], 4);
        v[58] = (v[29] + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = ((0L - v[59])) & 4294967295L;
        m.store(v[58], v[60], 4);
        v[61] = (v[29] + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = ((0L - v[62])) & 4294967295L;
        m.store(v[61], v[63], 4);
        v[64] = (v[29] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[65] = m.load(v[64], 4);
        v[66] = ((0L - v[65])) & 4294967295L;
        m.store(v[64], v[66], 4);
        v[67] = (v[29] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[68] = m.load(v[67], 4);
        v[69] = ((0L - v[68])) & 4294967295L;
        m.store(v[67], v[69], 4);
        v[70] = (v[29] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = ((0L - v[71])) & 4294967295L;
        m.store(v[70], v[72], 4);
        v[73] = (v[29] + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[74] = m.load(v[73], 4);
        v[75] = ((0L - v[74])) & 4294967295L;
        m.store(v[73], v[75], 4);
        v[76] = (v[29] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = ((0L - v[77])) & 4294967295L;
        m.store(v[76], v[78], 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[79] = ((v[30] + 1L)) & 4294967295L;
        v[80] = (v[29] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[81] = v[79] == 4L ? 1L : 0L;
        return v[81] != 0 ? 1 : 2;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[82] = ((v[28] << 4L)) & 4294967295L;
        v[83] = (v[1] + (Heap.s(v[82], 32) * 4L)) & 4294967295L;
        v[84] = (v[83] + (Heap.s(v[27], 32) * 4L)) & 4294967295L;
        v[85] = LibC.call(m, "memcpy", new long[]{v[84], v[0], 64L});
        return 15;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[86] = ((v[28] << 5L)) & 4294967295L;
        v[87] = (v[1] + (Heap.s(v[86], 32) * 4L)) & 4294967295L;
        v[88] = (v[87] + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi89 = (previous == 8 ? 1L : v[114]);
        v[89] = phi89;
        v[90] = ((v[89] >>> 2L)) & 4294967295L;
        v[91] = ((v[89] << 2L)) & 4294967295L;
        v[92] = ((v[91] & 12L)) & 4294967295L;
        v[93] = ((v[92] | v[90])) & 4294967295L;
        v[94] = (14064L + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = (v[0] + (Heap.s(v[95], 32) * 4L)) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = (14064L + (Heap.s(v[89], 32) * 4L)) & 4294967295L;
        v[99] = m.load(v[98], 4);
        v[100] = (v[88] + (Heap.s(v[99], 32) * 4L)) & 4294967295L;
        m.store(v[100], v[97], 4);
        v[101] = ((v[89] + 1L)) & 4294967295L;
        v[102] = v[101] == 16L ? 1L : 0L;
        return v[102] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[103] = ((v[101] >>> 2L)) & 4294967295L;
        v[104] = ((v[101] << 2L)) & 4294967295L;
        v[105] = ((v[104] & 12L)) & 4294967295L;
        v[106] = ((v[105] | v[103])) & 4294967295L;
        v[107] = (14064L + (Heap.s(v[106], 32) * 4L)) & 4294967295L;
        v[108] = m.load(v[107], 4);
        v[109] = (v[0] + (Heap.s(v[108], 32) * 4L)) & 4294967295L;
        v[110] = m.load(v[109], 4);
        v[111] = (14064L + (Heap.s(v[101], 32) * 4L)) & 4294967295L;
        v[112] = m.load(v[111], 4);
        v[113] = (v[88] + (Heap.s(v[112], 32) * 4L)) & 4294967295L;
        m.store(v[113], v[110], 4);
        v[114] = ((v[89] + 2L)) & 4294967295L;
        return 9;
    }

    private static int b11(Heap m, long[] v, int previous) {
        return v[24] != 0 ? 15 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[115] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[116] = ((v[4] << 5L)) & 4294967295L;
        v[117] = (v[1] + (Heap.s(v[116], 32) * 4L)) & 4294967295L;
        v[118] = (v[117] + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi119 = (previous == 12 ? 1L : v[144]);
        v[119] = phi119;
        v[120] = ((v[119] >>> 2L)) & 4294967295L;
        v[121] = ((v[119] << 2L)) & 4294967295L;
        v[122] = ((v[121] & 12L)) & 4294967295L;
        v[123] = ((v[122] | v[120])) & 4294967295L;
        v[124] = (14064L + (Heap.s(v[123], 32) * 4L)) & 4294967295L;
        v[125] = m.load(v[124], 4);
        v[126] = (v[115] + (Heap.s(v[125], 32) * 4L)) & 4294967295L;
        v[127] = m.load(v[126], 4);
        v[128] = (14064L + (Heap.s(v[119], 32) * 4L)) & 4294967295L;
        v[129] = m.load(v[128], 4);
        v[130] = (v[118] + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        m.store(v[130], v[127], 4);
        v[131] = ((v[119] + 1L)) & 4294967295L;
        v[132] = v[131] == 16L ? 1L : 0L;
        return v[132] != 0 ? 16 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[133] = ((v[131] >>> 2L)) & 4294967295L;
        v[134] = ((v[131] << 2L)) & 4294967295L;
        v[135] = ((v[134] & 12L)) & 4294967295L;
        v[136] = ((v[135] | v[133])) & 4294967295L;
        v[137] = (14064L + (Heap.s(v[136], 32) * 4L)) & 4294967295L;
        v[138] = m.load(v[137], 4);
        v[139] = (v[115] + (Heap.s(v[138], 32) * 4L)) & 4294967295L;
        v[140] = m.load(v[139], 4);
        v[141] = (14064L + (Heap.s(v[131], 32) * 4L)) & 4294967295L;
        v[142] = m.load(v[141], 4);
        v[143] = (v[118] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        m.store(v[143], v[140], 4);
        v[144] = ((v[119] + 2L)) & 4294967295L;
        return 13;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[145] = ((v[4] << 4L)) & 4294967295L;
        v[146] = (v[1] + (Heap.s(v[145], 32) * 4L)) & 4294967295L;
        v[147] = (v[146] + (Heap.s(v[27], 32) * 4L)) & 4294967295L;
        v[148] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[149] = LibC.call(m, "memcpy", new long[]{v[147], v[148], 64L});
        v[150] = ((v[7] << 5L)) & 4294967295L;
        return 20;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[151] = ((v[7] << 4L)) & 4294967295L;
        v[152] = ((v[7] << 5L)) & 4294967295L;
        return v[24] != 0 ? 20 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[153] = (v[0] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[154] = ((v[28] << 5L)) & 4294967295L;
        v[155] = (v[1] + (Heap.s(v[154], 32) * 4L)) & 4294967295L;
        v[156] = (v[155] + (Heap.s(v[151], 32) * 4L)) & 4294967295L;
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi157 = (previous == 17 ? 1L : v[182]);
        v[157] = phi157;
        v[158] = ((v[157] >>> 2L)) & 4294967295L;
        v[159] = ((v[157] << 2L)) & 4294967295L;
        v[160] = ((v[159] & 12L)) & 4294967295L;
        v[161] = ((v[160] | v[158])) & 4294967295L;
        v[162] = (14064L + (Heap.s(v[161], 32) * 4L)) & 4294967295L;
        v[163] = m.load(v[162], 4);
        v[164] = (v[153] + (Heap.s(v[163], 32) * 4L)) & 4294967295L;
        v[165] = m.load(v[164], 4);
        v[166] = (14064L + (Heap.s(v[157], 32) * 4L)) & 4294967295L;
        v[167] = m.load(v[166], 4);
        v[168] = (v[156] + (Heap.s(v[167], 32) * 4L)) & 4294967295L;
        m.store(v[168], v[165], 4);
        v[169] = ((v[157] + 1L)) & 4294967295L;
        v[170] = v[169] == 16L ? 1L : 0L;
        return v[170] != 0 ? 21 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[171] = ((v[169] >>> 2L)) & 4294967295L;
        v[172] = ((v[169] << 2L)) & 4294967295L;
        v[173] = ((v[172] & 12L)) & 4294967295L;
        v[174] = ((v[173] | v[171])) & 4294967295L;
        v[175] = (14064L + (Heap.s(v[174], 32) * 4L)) & 4294967295L;
        v[176] = m.load(v[175], 4);
        v[177] = (v[153] + (Heap.s(v[176], 32) * 4L)) & 4294967295L;
        v[178] = m.load(v[177], 4);
        v[179] = (14064L + (Heap.s(v[169], 32) * 4L)) & 4294967295L;
        v[180] = m.load(v[179], 4);
        v[181] = (v[156] + (Heap.s(v[180], 32) * 4L)) & 4294967295L;
        m.store(v[181], v[178], 4);
        v[182] = ((v[157] + 2L)) & 4294967295L;
        return 18;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi183 = (previous == 15 ? v[150] : v[152]);
        v[183] = phi183;
        v[184] = ((v[28] << 4L)) & 4294967295L;
        v[185] = (v[1] + (Heap.s(v[184], 32) * 4L)) & 4294967295L;
        v[186] = (v[185] + (Heap.s(v[183], 32) * 4L)) & 4294967295L;
        v[187] = (v[0] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[188] = LibC.call(m, "memcpy", new long[]{v[186], v[187], 64L});
        return 25;
    }

    private static int b21(Heap m, long[] v, int previous) {
        return v[24] != 0 ? 25 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[189] = (v[0] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[190] = ((v[4] << 5L)) & 4294967295L;
        v[191] = (v[1] + (Heap.s(v[190], 32) * 4L)) & 4294967295L;
        v[192] = (v[191] + (Heap.s(v[151], 32) * 4L)) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi193 = (previous == 22 ? 1L : v[218]);
        v[193] = phi193;
        v[194] = ((v[193] >>> 2L)) & 4294967295L;
        v[195] = ((v[193] << 2L)) & 4294967295L;
        v[196] = ((v[195] & 12L)) & 4294967295L;
        v[197] = ((v[196] | v[194])) & 4294967295L;
        v[198] = (14064L + (Heap.s(v[197], 32) * 4L)) & 4294967295L;
        v[199] = m.load(v[198], 4);
        v[200] = (v[189] + (Heap.s(v[199], 32) * 4L)) & 4294967295L;
        v[201] = m.load(v[200], 4);
        v[202] = (14064L + (Heap.s(v[193], 32) * 4L)) & 4294967295L;
        v[203] = m.load(v[202], 4);
        v[204] = (v[192] + (Heap.s(v[203], 32) * 4L)) & 4294967295L;
        m.store(v[204], v[201], 4);
        v[205] = ((v[193] + 1L)) & 4294967295L;
        v[206] = v[205] == 16L ? 1L : 0L;
        return v[206] != 0 ? 26 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[207] = ((v[205] >>> 2L)) & 4294967295L;
        v[208] = ((v[205] << 2L)) & 4294967295L;
        v[209] = ((v[208] & 12L)) & 4294967295L;
        v[210] = ((v[209] | v[207])) & 4294967295L;
        v[211] = (14064L + (Heap.s(v[210], 32) * 4L)) & 4294967295L;
        v[212] = m.load(v[211], 4);
        v[213] = (v[189] + (Heap.s(v[212], 32) * 4L)) & 4294967295L;
        v[214] = m.load(v[213], 4);
        v[215] = (14064L + (Heap.s(v[205], 32) * 4L)) & 4294967295L;
        v[216] = m.load(v[215], 4);
        v[217] = (v[192] + (Heap.s(v[216], 32) * 4L)) & 4294967295L;
        m.store(v[217], v[214], 4);
        v[218] = ((v[193] + 2L)) & 4294967295L;
        return 23;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi219 = (previous == 20 ? v[183] : v[152]);
        v[219] = phi219;
        v[220] = ((v[4] << 4L)) & 4294967295L;
        v[221] = (v[1] + (Heap.s(v[220], 32) * 4L)) & 4294967295L;
        v[222] = (v[221] + (Heap.s(v[219], 32) * 4L)) & 4294967295L;
        v[223] = (v[0] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[224] = LibC.call(m, "memcpy", new long[]{v[222], v[223], 64L});
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        return -1;
    }
}
