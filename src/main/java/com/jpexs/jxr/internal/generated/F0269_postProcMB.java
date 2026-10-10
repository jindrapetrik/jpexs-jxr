package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: postProcMB.
 */
public final class F0269_postProcMB {

    private F0269_postProcMB() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4, long a5) {
        long[] v = new long[233];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
        v[5] = a5;
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
                        throw new IllegalStateException("Invalid block in postProcMB");
                }
                previous = old;
                if (pc < 0) {
                    return v[232];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(v[4], 32) * 8L)) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = (v[7] + (Heap.s(v[3], 32) * 88L)) & 4294967295L;
        v[9] = (v[8] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        v[10] = (v[0] + (Heap.s(v[4], 32) * 8L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[11] + (Heap.s(v[3], 32) * 88L)) & 4294967295L;
        v[13] = (v[12] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        v[14] = (v[8] + (Heap.s(4294967295L, 32) * 88L) + 4L) & 4294967295L;
        v[15] = m.load(v[14], 1);
        v[16] = (v[15]) & 4294967295L;
        v[17] = (v[12] + (Heap.s(4294967295L, 32) * 88L) + 4L) & 4294967295L;
        v[18] = m.load(v[17], 1);
        v[19] = (v[18]) & 4294967295L;
        v[20] = ((0L - v[19])) & 4294967295L;
        v[21] = v[16] == v[20] ? 1L : 0L;
        return v[21] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[22] = m.load(v[9], 4);
        v[23] = m.load(v[13], 4);
        v[24] = ((v[22] - v[23])) & 4294967295L;
        v[25] = LibC.call(m, "abs", new long[]{v[24]});
        v[26] = Heap.s(v[25], 32) > Heap.s(v[5], 32) ? 1L : 0L;
        return v[26] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[27] = (v[1] + (Heap.s(4294967200L, 32) * 4L)) & 4294967295L;
        v[28] = (v[1] + (Heap.s(4294967216L, 32) * 4L)) & 4294967295L;
        v[29] = (v[2] + (Heap.s(4294967168L, 32) * 4L)) & 4294967295L;
        v[30] = (v[2] + (Heap.s(4294967184L, 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[29], 4);
        v[32] = m.load(v[28], 4);
        v[33] = ((v[31] - v[32])) & 4294967295L;
        v[34] = ((v[33] << 2L)) & 4294967295L;
        v[35] = m.load(v[27], 4);
        v[36] = m.load(v[30], 4);
        v[37] = ((v[35] - v[36])) & 4294967295L;
        v[38] = ((v[37] + v[34])) & 4294967295L;
        v[39] = ((Heap.s(v[38], 32) >> 3L)) & 4294967295L;
        v[40] = ((v[31] - v[39])) & 4294967295L;
        m.store(v[29], v[40], 4);
        v[41] = m.load(v[28], 4);
        v[42] = ((v[39] + v[41])) & 4294967295L;
        m.store(v[28], v[42], 4);
        v[43] = (v[1] + (Heap.s(4294967264L, 32) * 4L)) & 4294967295L;
        v[44] = (v[1] + (Heap.s(4294967280L, 32) * 4L)) & 4294967295L;
        v[45] = (v[2] + (Heap.s(4294967232L, 32) * 4L)) & 4294967295L;
        v[46] = (v[2] + (Heap.s(4294967248L, 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[45], 4);
        v[48] = m.load(v[44], 4);
        v[49] = ((v[47] - v[48])) & 4294967295L;
        v[50] = ((v[49] << 2L)) & 4294967295L;
        v[51] = m.load(v[43], 4);
        v[52] = m.load(v[46], 4);
        v[53] = ((v[51] - v[52])) & 4294967295L;
        v[54] = ((v[53] + v[50])) & 4294967295L;
        v[55] = ((Heap.s(v[54], 32) >> 3L)) & 4294967295L;
        v[56] = ((v[47] - v[55])) & 4294967295L;
        m.store(v[45], v[56], 4);
        v[57] = m.load(v[44], 4);
        v[58] = ((v[55] + v[57])) & 4294967295L;
        m.store(v[44], v[58], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[59] = (v[7] + (Heap.s(v[3], 32) * 88L) + 4L) & 4294967295L;
        v[60] = m.load(v[59], 1);
        v[61] = (v[60]) & 4294967295L;
        v[62] = (v[11] + (Heap.s(v[3], 32) * 88L) + 4L) & 4294967295L;
        v[63] = m.load(v[62], 1);
        v[64] = (v[63]) & 4294967295L;
        v[65] = ((0L - v[64])) & 4294967295L;
        v[66] = v[61] == v[65] ? 1L : 0L;
        return v[66] != 0 ? 4 : 6;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[67] = m.load(v[8], 4);
        v[68] = m.load(v[12], 4);
        v[69] = ((v[67] - v[68])) & 4294967295L;
        v[70] = LibC.call(m, "abs", new long[]{v[69]});
        v[71] = Heap.s(v[70], 32) > Heap.s(v[5], 32) ? 1L : 0L;
        return v[71] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[72] = (v[1] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[73] = (v[1] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[74] = (v[2] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[75] = m.load(v[2], 4);
        v[76] = m.load(v[73], 4);
        v[77] = ((v[75] - v[76])) & 4294967295L;
        v[78] = ((v[77] << 2L)) & 4294967295L;
        v[79] = m.load(v[72], 4);
        v[80] = m.load(v[74], 4);
        v[81] = ((v[79] - v[80])) & 4294967295L;
        v[82] = ((v[81] + v[78])) & 4294967295L;
        v[83] = ((Heap.s(v[82], 32) >> 3L)) & 4294967295L;
        v[84] = ((v[75] - v[83])) & 4294967295L;
        m.store(v[2], v[84], 4);
        v[85] = m.load(v[73], 4);
        v[86] = ((v[83] + v[85])) & 4294967295L;
        m.store(v[73], v[86], 4);
        v[87] = (v[1] + (Heap.s(96L, 32) * 4L)) & 4294967295L;
        v[88] = (v[1] + (Heap.s(112L, 32) * 4L)) & 4294967295L;
        v[89] = (v[2] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        v[90] = (v[2] + (Heap.s(80L, 32) * 4L)) & 4294967295L;
        v[91] = m.load(v[89], 4);
        v[92] = m.load(v[88], 4);
        v[93] = ((v[91] - v[92])) & 4294967295L;
        v[94] = ((v[93] << 2L)) & 4294967295L;
        v[95] = m.load(v[87], 4);
        v[96] = m.load(v[90], 4);
        v[97] = ((v[95] - v[96])) & 4294967295L;
        v[98] = ((v[97] + v[94])) & 4294967295L;
        v[99] = ((Heap.s(v[98], 32) >> 3L)) & 4294967295L;
        v[100] = ((v[91] - v[99])) & 4294967295L;
        m.store(v[89], v[100], 4);
        v[101] = m.load(v[88], 4);
        v[102] = ((v[99] + v[101])) & 4294967295L;
        m.store(v[88], v[102], 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[103] = m.load(v[14], 1);
        v[104] = (v[103]) & 4294967295L;
        v[105] = m.load(v[59], 1);
        v[106] = (v[105]) & 4294967295L;
        v[107] = ((0L - v[106])) & 4294967295L;
        v[108] = v[104] == v[107] ? 1L : 0L;
        return v[108] != 0 ? 7 : 9;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[109] = m.load(v[9], 4);
        v[110] = m.load(v[8], 4);
        v[111] = ((v[109] - v[110])) & 4294967295L;
        v[112] = LibC.call(m, "abs", new long[]{v[111]});
        v[113] = Heap.s(v[112], 32) > Heap.s(v[5], 32) ? 1L : 0L;
        return v[113] != 0 ? 9 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[114] = (v[1] + (Heap.s(4294967200L, 32) * 4L)) & 4294967295L;
        v[115] = (v[1] + (Heap.s(4294967264L, 32) * 4L)) & 4294967295L;
        v[116] = (v[1] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[117] = (v[1] + (Heap.s(96L, 32) * 4L)) & 4294967295L;
        v[118] = m.load(v[116], 4);
        v[119] = m.load(v[115], 4);
        v[120] = ((v[118] - v[119])) & 4294967295L;
        v[121] = ((v[120] << 2L)) & 4294967295L;
        v[122] = m.load(v[114], 4);
        v[123] = m.load(v[117], 4);
        v[124] = ((v[122] - v[123])) & 4294967295L;
        v[125] = ((v[124] + v[121])) & 4294967295L;
        v[126] = ((Heap.s(v[125], 32) >> 3L)) & 4294967295L;
        v[127] = ((v[118] - v[126])) & 4294967295L;
        m.store(v[116], v[127], 4);
        v[128] = ((v[126] + v[119])) & 4294967295L;
        m.store(v[115], v[128], 4);
        v[129] = (v[1] + (Heap.s(4294967216L, 32) * 4L)) & 4294967295L;
        v[130] = (v[1] + (Heap.s(4294967280L, 32) * 4L)) & 4294967295L;
        v[131] = (v[1] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[132] = (v[1] + (Heap.s(112L, 32) * 4L)) & 4294967295L;
        v[133] = m.load(v[131], 4);
        v[134] = m.load(v[130], 4);
        v[135] = ((v[133] - v[134])) & 4294967295L;
        v[136] = ((v[135] << 2L)) & 4294967295L;
        v[137] = m.load(v[129], 4);
        v[138] = m.load(v[132], 4);
        v[139] = ((v[137] - v[138])) & 4294967295L;
        v[140] = ((v[139] + v[136])) & 4294967295L;
        v[141] = ((Heap.s(v[140], 32) >> 3L)) & 4294967295L;
        v[142] = ((v[133] - v[141])) & 4294967295L;
        m.store(v[131], v[142], 4);
        v[143] = ((v[141] + v[134])) & 4294967295L;
        m.store(v[130], v[143], 4);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[144] = m.load(v[17], 1);
        v[145] = (v[144]) & 4294967295L;
        v[146] = m.load(v[62], 1);
        v[147] = (v[146]) & 4294967295L;
        v[148] = ((0L - v[147])) & 4294967295L;
        v[149] = v[145] == v[148] ? 1L : 0L;
        return v[149] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[150] = m.load(v[2], 4);
        return 13;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[151] = m.load(v[13], 4);
        v[152] = m.load(v[12], 4);
        v[153] = ((v[151] - v[152])) & 4294967295L;
        v[154] = LibC.call(m, "abs", new long[]{v[153]});
        v[155] = Heap.s(v[154], 32) > Heap.s(v[5], 32) ? 1L : 0L;
        v[156] = m.load(v[2], 4);
        return v[155] != 0 ? 13 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[157] = (v[2] + (Heap.s(4294967168L, 32) * 4L)) & 4294967295L;
        v[158] = (v[2] + (Heap.s(4294967232L, 32) * 4L)) & 4294967295L;
        v[159] = (v[2] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        v[160] = m.load(v[158], 4);
        v[161] = ((v[156] - v[160])) & 4294967295L;
        v[162] = ((v[161] << 2L)) & 4294967295L;
        v[163] = m.load(v[157], 4);
        v[164] = m.load(v[159], 4);
        v[165] = ((v[163] - v[164])) & 4294967295L;
        v[166] = ((v[165] + v[162])) & 4294967295L;
        v[167] = ((Heap.s(v[166], 32) >> 3L)) & 4294967295L;
        v[168] = ((v[156] - v[167])) & 4294967295L;
        m.store(v[2], v[168], 4);
        v[169] = ((v[167] + v[160])) & 4294967295L;
        m.store(v[158], v[169], 4);
        v[170] = (v[2] + (Heap.s(4294967184L, 32) * 4L)) & 4294967295L;
        v[171] = (v[2] + (Heap.s(4294967248L, 32) * 4L)) & 4294967295L;
        v[172] = (v[2] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[173] = (v[2] + (Heap.s(80L, 32) * 4L)) & 4294967295L;
        v[174] = m.load(v[172], 4);
        v[175] = m.load(v[171], 4);
        v[176] = ((v[174] - v[175])) & 4294967295L;
        v[177] = ((v[176] << 2L)) & 4294967295L;
        v[178] = m.load(v[170], 4);
        v[179] = m.load(v[173], 4);
        v[180] = ((v[178] - v[179])) & 4294967295L;
        v[181] = ((v[180] + v[177])) & 4294967295L;
        v[182] = ((Heap.s(v[181], 32) >> 3L)) & 4294967295L;
        v[183] = ((v[174] - v[182])) & 4294967295L;
        m.store(v[172], v[183], 4);
        v[184] = ((v[182] + v[175])) & 4294967295L;
        m.store(v[171], v[184], 4);
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi185 = (previous == 10 ? v[150] : (previous == 12 ? v[168] : v[156]));
        v[185] = phi185;
        v[186] = (v[11] + (Heap.s(v[3], 32) * 88L) + 8L) & 4294967295L;
        m.store(v[186], v[185], 4);
        v[187] = (v[2] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        v[188] = m.load(v[187], 4);
        v[189] = (v[186] + (Heap.s(0L, 32) * 16L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[189], v[188], 4);
        v[190] = (v[2] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[191] = m.load(v[190], 4);
        v[192] = (v[11] + (Heap.s(v[3], 32) * 88L) + 8L + (Heap.s(1L, 32) * 16L)) & 4294967295L;
        m.store(v[192], v[191], 4);
        v[193] = (v[2] + (Heap.s(80L, 32) * 4L)) & 4294967295L;
        v[194] = m.load(v[193], 4);
        v[195] = (v[11] + (Heap.s(v[3], 32) * 88L) + 8L + (Heap.s(1L, 32) * 16L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[195], v[194], 4);
        v[196] = (v[1] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[197] = m.load(v[196], 4);
        v[198] = (v[7] + (Heap.s(v[3], 32) * 88L) + 8L + (Heap.s(2L, 32) * 16L)) & 4294967295L;
        m.store(v[198], v[197], 4);
        v[199] = (v[1] + (Heap.s(96L, 32) * 4L)) & 4294967295L;
        v[200] = m.load(v[199], 4);
        v[201] = (v[7] + (Heap.s(v[3], 32) * 88L) + 8L + (Heap.s(2L, 32) * 16L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[201], v[200], 4);
        v[202] = (v[1] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[203] = m.load(v[202], 4);
        v[204] = (v[7] + (Heap.s(v[3], 32) * 88L) + 8L + (Heap.s(3L, 32) * 16L)) & 4294967295L;
        m.store(v[204], v[203], 4);
        v[205] = (v[1] + (Heap.s(112L, 32) * 4L)) & 4294967295L;
        v[206] = m.load(v[205], 4);
        v[207] = (v[7] + (Heap.s(v[3], 32) * 88L) + 8L + (Heap.s(3L, 32) * 16L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[207], v[206], 4);
        v[208] = (v[2] + (Heap.s(4294967168L, 32) * 4L)) & 4294967295L;
        v[209] = m.load(v[208], 4);
        v[210] = (v[12] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(0L, 32) * 16L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[210], v[209], 4);
        v[211] = (v[2] + (Heap.s(4294967232L, 32) * 4L)) & 4294967295L;
        v[212] = m.load(v[211], 4);
        v[213] = (v[12] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(0L, 32) * 16L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[213], v[212], 4);
        v[214] = (v[2] + (Heap.s(4294967184L, 32) * 4L)) & 4294967295L;
        v[215] = m.load(v[214], 4);
        v[216] = (v[12] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(1L, 32) * 16L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[216], v[215], 4);
        v[217] = (v[2] + (Heap.s(4294967248L, 32) * 4L)) & 4294967295L;
        v[218] = m.load(v[217], 4);
        v[219] = (v[12] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(1L, 32) * 16L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[219], v[218], 4);
        v[220] = (v[1] + (Heap.s(4294967200L, 32) * 4L)) & 4294967295L;
        v[221] = m.load(v[220], 4);
        v[222] = (v[8] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(2L, 32) * 16L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[222], v[221], 4);
        v[223] = (v[1] + (Heap.s(4294967264L, 32) * 4L)) & 4294967295L;
        v[224] = m.load(v[223], 4);
        v[225] = (v[8] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(2L, 32) * 16L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[225], v[224], 4);
        v[226] = (v[1] + (Heap.s(4294967216L, 32) * 4L)) & 4294967295L;
        v[227] = m.load(v[226], 4);
        v[228] = (v[8] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(3L, 32) * 16L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[228], v[227], 4);
        v[229] = (v[1] + (Heap.s(4294967280L, 32) * 4L)) & 4294967295L;
        v[230] = m.load(v[229], 4);
        v[231] = (v[8] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(3L, 32) * 16L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[231], v[230], 4);
        return -1;
    }
}
