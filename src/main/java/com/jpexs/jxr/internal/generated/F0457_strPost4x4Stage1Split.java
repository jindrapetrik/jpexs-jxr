package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: strPost4x4Stage1Split.
 */
public final class F0457_strPost4x4Stage1Split {

    private F0457_strPost4x4Stage1Split() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[348];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                        throw new IllegalStateException("Invalid block in strPost4x4Stage1Split");
                }
                previous = old;
                if (pc < 0) {
                    return v[347];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(72L, 32) * 4L)) & 4294967295L;
        v[6] = ((0L - v[2])) & 4294967295L;
        v[7] = (v[5] + (Heap.s(v[6], 32) * 4L)) & 4294967295L;
        v[8] = (v[1] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        v[9] = (v[8] + (Heap.s(v[6], 32) * 4L)) & 4294967295L;
        v[10] = (v[0] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[11] = (v[1] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        F0487_strDCT2x2dn.run(m, v[10], v[7], v[11], v[9]);
        v[12] = (v[0] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[13] = (v[7] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[14] = (v[1] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[15] = (v[9] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        F0487_strDCT2x2dn.run(m, v[12], v[13], v[14], v[15]);
        v[16] = (v[0] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[17] = (v[7] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[18] = (v[1] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[19] = (v[9] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        F0487_strDCT2x2dn.run(m, v[16], v[17], v[18], v[19]);
        v[20] = (v[0] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[21] = (v[7] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[22] = (v[1] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[23] = (v[9] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        F0487_strDCT2x2dn.run(m, v[20], v[21], v[22], v[23]);
        v[24] = m.load(v[9], 4);
        v[25] = m.load(v[15], 4);
        v[26] = m.load(v[19], 4);
        v[27] = m.load(v[23], 4);
        v[28] = ((v[27] + v[24])) & 4294967295L;
        v[29] = ((v[26] - v[25])) & 4294967295L;
        v[30] = ((Heap.s(v[28], 32) >> 1L)) & 4294967295L;
        v[31] = ((Heap.s(v[29], 32) >> 1L)) & 4294967295L;
        v[32] = ((v[31] + v[25])) & 4294967295L;
        v[33] = ((v[32] * 3L)) & 4294967295L;
        v[34] = ((v[33] + 6L)) & 4294967295L;
        v[35] = ((Heap.s(v[34], 32) >> 3L)) & 4294967295L;
        v[36] = ((v[30] + v[35])) & 4294967295L;
        v[37] = ((v[24] - v[36])) & 4294967295L;
        v[38] = ((v[37] * 3L)) & 4294967295L;
        v[39] = ((v[38] + 2L)) & 4294967295L;
        v[40] = ((Heap.s(v[39], 32) >> 2L)) & 4294967295L;
        v[41] = ((v[40] + v[32])) & 4294967295L;
        v[42] = ((v[41] * 3L)) & 4294967295L;
        v[43] = ((v[42] + 4L)) & 4294967295L;
        v[44] = ((Heap.s(v[43], 32) >> 3L)) & 4294967295L;
        v[45] = ((v[37] - v[44])) & 4294967295L;
        v[46] = ((v[41] - v[31])) & 4294967295L;
        v[47] = ((v[45] + v[30])) & 4294967295L;
        v[48] = ((v[46] + v[29])) & 4294967295L;
        v[49] = ((v[28] - v[47])) & 4294967295L;
        m.store(v[9], v[47], 4);
        m.store(v[15], v[46], 4);
        m.store(v[19], v[48], 4);
        m.store(v[23], v[49], 4);
        v[50] = m.load(v[22], 4);
        v[51] = ((v[50] + 1L)) & 4294967295L;
        v[52] = ((Heap.s(v[51], 32) >> 1L)) & 4294967295L;
        v[53] = m.load(v[18], 4);
        v[54] = ((v[53] - v[52])) & 4294967295L;
        m.store(v[18], v[54], 4);
        v[55] = ((v[54] + 1L)) & 4294967295L;
        v[56] = ((Heap.s(v[55], 32) >> 1L)) & 4294967295L;
        v[57] = ((v[56] + v[50])) & 4294967295L;
        m.store(v[22], v[57], 4);
        v[58] = m.load(v[14], 4);
        v[59] = ((v[58] + 1L)) & 4294967295L;
        v[60] = ((Heap.s(v[59], 32) >> 1L)) & 4294967295L;
        v[61] = m.load(v[11], 4);
        v[62] = ((v[61] - v[60])) & 4294967295L;
        m.store(v[11], v[62], 4);
        v[63] = ((v[62] + 1L)) & 4294967295L;
        v[64] = ((Heap.s(v[63], 32) >> 1L)) & 4294967295L;
        v[65] = ((v[64] + v[58])) & 4294967295L;
        m.store(v[14], v[65], 4);
        v[66] = m.load(v[21], 4);
        v[67] = ((v[66] + 1L)) & 4294967295L;
        v[68] = ((Heap.s(v[67], 32) >> 1L)) & 4294967295L;
        v[69] = m.load(v[13], 4);
        v[70] = ((v[69] - v[68])) & 4294967295L;
        m.store(v[13], v[70], 4);
        v[71] = ((v[70] + 1L)) & 4294967295L;
        v[72] = ((Heap.s(v[71], 32) >> 1L)) & 4294967295L;
        v[73] = ((v[72] + v[66])) & 4294967295L;
        m.store(v[21], v[73], 4);
        v[74] = m.load(v[17], 4);
        v[75] = ((v[74] + 1L)) & 4294967295L;
        v[76] = ((Heap.s(v[75], 32) >> 1L)) & 4294967295L;
        v[77] = m.load(v[7], 4);
        v[78] = ((v[77] - v[76])) & 4294967295L;
        m.store(v[7], v[78], 4);
        v[79] = ((v[78] + 1L)) & 4294967295L;
        v[80] = ((Heap.s(v[79], 32) >> 1L)) & 4294967295L;
        v[81] = ((v[80] + v[74])) & 4294967295L;
        m.store(v[17], v[81], 4);
        v[82] = m.load(v[10], 4);
        v[83] = m.load(v[9], 4);
        v[84] = ((v[83] + v[82])) & 4294967295L;
        v[85] = ((Heap.s(v[84], 32) >> 1L)) & 4294967295L;
        v[86] = ((v[85] - v[83])) & 4294967295L;
        v[87] = ((v[86] * 3L)) & 4294967295L;
        v[88] = ((Heap.s(v[87], 32) >> 3L)) & 4294967295L;
        v[89] = ((v[88] + v[84])) & 4294967295L;
        v[90] = ((v[89] * 3L)) & 4294967295L;
        v[91] = ((Heap.s(v[90], 32) >> 4L)) & 4294967295L;
        v[92] = ((v[91] + v[86])) & 4294967295L;
        m.store(v[10], v[89], 4);
        m.store(v[9], v[92], 4);
        v[93] = m.load(v[12], 4);
        v[94] = m.load(v[15], 4);
        v[95] = ((v[94] + v[93])) & 4294967295L;
        v[96] = ((Heap.s(v[95], 32) >> 1L)) & 4294967295L;
        v[97] = ((v[96] - v[94])) & 4294967295L;
        v[98] = ((v[97] * 3L)) & 4294967295L;
        v[99] = ((Heap.s(v[98], 32) >> 3L)) & 4294967295L;
        v[100] = ((v[99] + v[95])) & 4294967295L;
        v[101] = ((v[100] * 3L)) & 4294967295L;
        v[102] = ((Heap.s(v[101], 32) >> 4L)) & 4294967295L;
        v[103] = ((v[102] + v[97])) & 4294967295L;
        m.store(v[12], v[100], 4);
        m.store(v[15], v[103], 4);
        v[104] = m.load(v[16], 4);
        v[105] = m.load(v[19], 4);
        v[106] = ((v[105] + v[104])) & 4294967295L;
        v[107] = ((Heap.s(v[106], 32) >> 1L)) & 4294967295L;
        v[108] = ((v[107] - v[105])) & 4294967295L;
        v[109] = ((v[108] * 3L)) & 4294967295L;
        v[110] = ((Heap.s(v[109], 32) >> 3L)) & 4294967295L;
        v[111] = ((v[110] + v[106])) & 4294967295L;
        v[112] = ((v[111] * 3L)) & 4294967295L;
        v[113] = ((Heap.s(v[112], 32) >> 4L)) & 4294967295L;
        v[114] = ((v[113] + v[108])) & 4294967295L;
        m.store(v[16], v[111], 4);
        m.store(v[19], v[114], 4);
        v[115] = m.load(v[20], 4);
        v[116] = m.load(v[23], 4);
        v[117] = ((v[116] + v[115])) & 4294967295L;
        v[118] = ((Heap.s(v[117], 32) >> 1L)) & 4294967295L;
        v[119] = ((v[118] - v[116])) & 4294967295L;
        v[120] = ((v[119] * 3L)) & 4294967295L;
        v[121] = ((Heap.s(v[120], 32) >> 3L)) & 4294967295L;
        v[122] = ((v[121] + v[117])) & 4294967295L;
        v[123] = ((v[122] * 3L)) & 4294967295L;
        v[124] = ((Heap.s(v[123], 32) >> 4L)) & 4294967295L;
        v[125] = ((v[124] + v[119])) & 4294967295L;
        m.store(v[20], v[122], 4);
        m.store(v[23], v[125], 4);
        v[126] = m.load(v[10], 4);
        v[127] = m.load(v[7], 4);
        v[128] = m.load(v[11], 4);
        v[129] = m.load(v[9], 4);
        v[130] = ((v[127] - v[128])) & 4294967295L;
        v[131] = ((v[129] * 3L)) & 4294967295L;
        v[132] = ((v[131] + 4L)) & 4294967295L;
        v[133] = ((Heap.s(v[132], 32) >> 3L)) & 4294967295L;
        v[134] = ((v[133] + v[126])) & 4294967295L;
        v[135] = ((Heap.s(v[130], 32) >> 1L)) & 4294967295L;
        v[136] = ((v[129] - v[135])) & 4294967295L;
        v[137] = ((v[134] - v[130])) & 4294967295L;
        v[138] = ((Heap.s(v[137], 32) >> 1L)) & 4294967295L;
        v[139] = ((v[138] - v[128])) & 4294967295L;
        m.store(v[11], v[136], 4);
        m.store(v[9], v[139], 4);
        v[140] = ((v[134] - v[139])) & 4294967295L;
        m.store(v[10], v[140], 4);
        v[141] = ((v[136] + v[130])) & 4294967295L;
        m.store(v[7], v[141], 4);
        v[142] = m.load(v[12], 4);
        v[143] = m.load(v[13], 4);
        v[144] = m.load(v[14], 4);
        v[145] = m.load(v[15], 4);
        v[146] = ((v[143] - v[144])) & 4294967295L;
        v[147] = ((v[145] * 3L)) & 4294967295L;
        v[148] = ((v[147] + 4L)) & 4294967295L;
        v[149] = ((Heap.s(v[148], 32) >> 3L)) & 4294967295L;
        v[150] = ((v[149] + v[142])) & 4294967295L;
        v[151] = ((Heap.s(v[146], 32) >> 1L)) & 4294967295L;
        v[152] = ((v[145] - v[151])) & 4294967295L;
        v[153] = ((v[150] - v[146])) & 4294967295L;
        v[154] = ((Heap.s(v[153], 32) >> 1L)) & 4294967295L;
        v[155] = ((v[154] - v[144])) & 4294967295L;
        m.store(v[14], v[152], 4);
        m.store(v[15], v[155], 4);
        v[156] = ((v[150] - v[155])) & 4294967295L;
        m.store(v[12], v[156], 4);
        v[157] = ((v[152] + v[146])) & 4294967295L;
        m.store(v[13], v[157], 4);
        v[158] = m.load(v[16], 4);
        v[159] = m.load(v[17], 4);
        v[160] = m.load(v[18], 4);
        v[161] = m.load(v[19], 4);
        v[162] = ((v[159] - v[160])) & 4294967295L;
        v[163] = ((v[161] * 3L)) & 4294967295L;
        v[164] = ((v[163] + 4L)) & 4294967295L;
        v[165] = ((Heap.s(v[164], 32) >> 3L)) & 4294967295L;
        v[166] = ((v[165] + v[158])) & 4294967295L;
        v[167] = ((Heap.s(v[162], 32) >> 1L)) & 4294967295L;
        v[168] = ((v[161] - v[167])) & 4294967295L;
        v[169] = ((v[166] - v[162])) & 4294967295L;
        v[170] = ((Heap.s(v[169], 32) >> 1L)) & 4294967295L;
        v[171] = ((v[170] - v[160])) & 4294967295L;
        m.store(v[18], v[168], 4);
        m.store(v[19], v[171], 4);
        v[172] = ((v[166] - v[171])) & 4294967295L;
        m.store(v[16], v[172], 4);
        v[173] = ((v[168] + v[162])) & 4294967295L;
        m.store(v[17], v[173], 4);
        v[174] = m.load(v[20], 4);
        v[175] = m.load(v[21], 4);
        v[176] = m.load(v[22], 4);
        v[177] = m.load(v[23], 4);
        v[178] = ((v[175] - v[176])) & 4294967295L;
        v[179] = ((v[177] * 3L)) & 4294967295L;
        v[180] = ((v[179] + 4L)) & 4294967295L;
        v[181] = ((Heap.s(v[180], 32) >> 3L)) & 4294967295L;
        v[182] = ((v[181] + v[174])) & 4294967295L;
        v[183] = ((Heap.s(v[178], 32) >> 1L)) & 4294967295L;
        v[184] = ((v[177] - v[183])) & 4294967295L;
        v[185] = ((v[182] - v[178])) & 4294967295L;
        v[186] = ((Heap.s(v[185], 32) >> 1L)) & 4294967295L;
        v[187] = ((v[186] - v[176])) & 4294967295L;
        m.store(v[22], v[184], 4);
        m.store(v[23], v[187], 4);
        v[188] = ((v[182] - v[187])) & 4294967295L;
        m.store(v[20], v[188], 4);
        v[189] = ((v[184] + v[178])) & 4294967295L;
        m.store(v[21], v[189], 4);
        v[190] = m.load(v[10], 4);
        v[191] = m.load(v[11], 4);
        v[192] = ((v[191] + v[190])) & 4294967295L;
        v[193] = m.load(v[7], 4);
        v[194] = ((v[192] + v[193])) & 4294967295L;
        v[195] = m.load(v[9], 4);
        v[196] = ((v[194] + v[195])) & 4294967295L;
        v[197] = ((Heap.s(v[196], 32) >> 1L)) & 4294967295L;
        v[198] = m.load(v[12], 4);
        v[199] = m.load(v[14], 4);
        v[200] = ((v[199] + v[198])) & 4294967295L;
        v[201] = m.load(v[13], 4);
        v[202] = ((v[200] + v[201])) & 4294967295L;
        v[203] = m.load(v[15], 4);
        v[204] = ((v[202] + v[203])) & 4294967295L;
        v[205] = ((Heap.s(v[204], 32) >> 1L)) & 4294967295L;
        v[206] = m.load(v[16], 4);
        v[207] = m.load(v[18], 4);
        v[208] = ((v[207] + v[206])) & 4294967295L;
        v[209] = m.load(v[17], 4);
        v[210] = ((v[208] + v[209])) & 4294967295L;
        v[211] = m.load(v[19], 4);
        v[212] = ((v[210] + v[211])) & 4294967295L;
        v[213] = ((Heap.s(v[212], 32) >> 1L)) & 4294967295L;
        v[214] = m.load(v[20], 4);
        v[215] = m.load(v[22], 4);
        v[216] = m.load(v[23], 4);
        v[217] = ((v[214] + v[189])) & 4294967295L;
        v[218] = ((v[217] + v[215])) & 4294967295L;
        v[219] = ((v[218] + v[216])) & 4294967295L;
        v[220] = ((Heap.s(v[219], 32) >> 1L)) & 4294967295L;
        v[221] = ((v[197] * 595L)) & 4294967295L;
        v[222] = ((v[221] + 65536L)) & 4294967295L;
        v[223] = ((Heap.s(v[222], 32) >> 17L)) & 4294967295L;
        v[224] = ((v[205] * 595L)) & 4294967295L;
        v[225] = ((v[224] + 65536L)) & 4294967295L;
        v[226] = ((Heap.s(v[225], 32) >> 17L)) & 4294967295L;
        v[227] = ((v[213] * 595L)) & 4294967295L;
        v[228] = ((v[227] + 65536L)) & 4294967295L;
        v[229] = ((Heap.s(v[228], 32) >> 17L)) & 4294967295L;
        v[230] = ((v[220] * 595L)) & 4294967295L;
        v[231] = ((v[230] + 65536L)) & 4294967295L;
        v[232] = ((Heap.s(v[231], 32) >> 17L)) & 4294967295L;
        v[233] = LibC.call(m, "abs", new long[]{v[223]});
        v[234] = Heap.s(v[233], 32) < Heap.s(v[3], 32) ? 1L : 0L;
        v[235] = Heap.s(v[3], 32) > Heap.s(20L, 32) ? 1L : 0L;
        v[236] = ((v[235] & v[234])) & 1L;
        v[237] = v[4] != 0L ? 1L : 0L;
        v[238] = ((v[237] | v[236])) & 1L;
        return v[238] != 0 ? 1 : 7;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[239] = m.load(v[10], 4);
        v[240] = m.load(v[11], 4);
        v[241] = m.load(v[7], 4);
        v[242] = m.load(v[9], 4);
        v[243] = ((v[240] + v[241])) & 4294967295L;
        v[244] = ((v[239] - v[243])) & 4294967295L;
        v[245] = ((v[244] + v[242])) & 4294967295L;
        v[246] = ((Heap.s(v[245], 32) >> 1L)) & 4294967295L;
        v[247] = Heap.s(v[223], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[247] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[248] = Heap.s(v[246], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[248] != 0 ? 3 : 6;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[249] = LibC.call(m, "llvm.smin.i32", new long[]{v[223], v[246]});
        return 6;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[250] = v[222] > 131071L ? 1L : 0L;
        v[251] = Heap.s(v[246], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[252] = ((v[250] & v[251])) & 1L;
        return v[252] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[253] = LibC.call(m, "llvm.smax.i32", new long[]{v[223], v[246]});
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi254 = (previous == 3 ? v[249] : (previous == 5 ? v[253] : (previous == 4 ? 0L : 0L)));
        v[254] = phi254;
        v[255] = ((Heap.s(v[254], 32) >> 1L)) & 4294967295L;
        v[256] = ((v[239] - v[255])) & 4294967295L;
        m.store(v[10], v[256], 4);
        v[257] = m.load(v[9], 4);
        v[258] = ((v[257] - v[255])) & 4294967295L;
        m.store(v[9], v[258], 4);
        v[259] = m.load(v[7], 4);
        v[260] = ((v[259] + v[255])) & 4294967295L;
        m.store(v[7], v[260], 4);
        v[261] = m.load(v[11], 4);
        v[262] = ((v[261] + v[255])) & 4294967295L;
        m.store(v[11], v[262], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[263] = LibC.call(m, "abs", new long[]{v[226]});
        v[264] = Heap.s(v[263], 32) < Heap.s(v[3], 32) ? 1L : 0L;
        v[265] = ((v[235] & v[264])) & 1L;
        v[266] = ((v[237] | v[265])) & 1L;
        return v[266] != 0 ? 8 : 14;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[267] = m.load(v[12], 4);
        v[268] = m.load(v[14], 4);
        v[269] = m.load(v[13], 4);
        v[270] = m.load(v[15], 4);
        v[271] = ((v[268] + v[269])) & 4294967295L;
        v[272] = ((v[267] - v[271])) & 4294967295L;
        v[273] = ((v[272] + v[270])) & 4294967295L;
        v[274] = ((Heap.s(v[273], 32) >> 1L)) & 4294967295L;
        v[275] = Heap.s(v[226], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[275] != 0 ? 9 : 11;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[276] = Heap.s(v[274], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[276] != 0 ? 10 : 13;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[277] = LibC.call(m, "llvm.smin.i32", new long[]{v[226], v[274]});
        return 13;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[278] = v[225] > 131071L ? 1L : 0L;
        v[279] = Heap.s(v[274], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[280] = ((v[278] & v[279])) & 1L;
        return v[280] != 0 ? 12 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[281] = LibC.call(m, "llvm.smax.i32", new long[]{v[226], v[274]});
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi282 = (previous == 10 ? v[277] : (previous == 12 ? v[281] : (previous == 11 ? 0L : 0L)));
        v[282] = phi282;
        v[283] = ((Heap.s(v[282], 32) >> 1L)) & 4294967295L;
        v[284] = ((v[267] - v[283])) & 4294967295L;
        m.store(v[12], v[284], 4);
        v[285] = m.load(v[15], 4);
        v[286] = ((v[285] - v[283])) & 4294967295L;
        m.store(v[15], v[286], 4);
        v[287] = m.load(v[13], 4);
        v[288] = ((v[287] + v[283])) & 4294967295L;
        m.store(v[13], v[288], 4);
        v[289] = m.load(v[14], 4);
        v[290] = ((v[289] + v[283])) & 4294967295L;
        m.store(v[14], v[290], 4);
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[291] = LibC.call(m, "abs", new long[]{v[229]});
        v[292] = Heap.s(v[291], 32) < Heap.s(v[3], 32) ? 1L : 0L;
        v[293] = ((v[235] & v[292])) & 1L;
        v[294] = ((v[237] | v[293])) & 1L;
        return v[294] != 0 ? 15 : 21;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[295] = m.load(v[16], 4);
        v[296] = m.load(v[18], 4);
        v[297] = m.load(v[17], 4);
        v[298] = m.load(v[19], 4);
        v[299] = ((v[296] + v[297])) & 4294967295L;
        v[300] = ((v[295] - v[299])) & 4294967295L;
        v[301] = ((v[300] + v[298])) & 4294967295L;
        v[302] = ((Heap.s(v[301], 32) >> 1L)) & 4294967295L;
        v[303] = Heap.s(v[229], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[303] != 0 ? 16 : 18;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[304] = Heap.s(v[302], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[304] != 0 ? 17 : 20;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[305] = LibC.call(m, "llvm.smin.i32", new long[]{v[229], v[302]});
        return 20;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[306] = v[228] > 131071L ? 1L : 0L;
        v[307] = Heap.s(v[302], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[308] = ((v[306] & v[307])) & 1L;
        return v[308] != 0 ? 19 : 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[309] = LibC.call(m, "llvm.smax.i32", new long[]{v[229], v[302]});
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi310 = (previous == 17 ? v[305] : (previous == 19 ? v[309] : (previous == 18 ? 0L : 0L)));
        v[310] = phi310;
        v[311] = ((Heap.s(v[310], 32) >> 1L)) & 4294967295L;
        v[312] = ((v[295] - v[311])) & 4294967295L;
        m.store(v[16], v[312], 4);
        v[313] = m.load(v[19], 4);
        v[314] = ((v[313] - v[311])) & 4294967295L;
        m.store(v[19], v[314], 4);
        v[315] = m.load(v[17], 4);
        v[316] = ((v[315] + v[311])) & 4294967295L;
        m.store(v[17], v[316], 4);
        v[317] = m.load(v[18], 4);
        v[318] = ((v[317] + v[311])) & 4294967295L;
        m.store(v[18], v[318], 4);
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[319] = LibC.call(m, "abs", new long[]{v[232]});
        v[320] = Heap.s(v[319], 32) < Heap.s(v[3], 32) ? 1L : 0L;
        v[321] = ((v[235] & v[320])) & 1L;
        v[322] = ((v[237] | v[321])) & 1L;
        return v[322] != 0 ? 22 : 28;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[323] = m.load(v[20], 4);
        v[324] = m.load(v[22], 4);
        v[325] = m.load(v[21], 4);
        v[326] = m.load(v[23], 4);
        v[327] = ((v[324] + v[325])) & 4294967295L;
        v[328] = ((v[323] - v[327])) & 4294967295L;
        v[329] = ((v[328] + v[326])) & 4294967295L;
        v[330] = ((Heap.s(v[329], 32) >> 1L)) & 4294967295L;
        v[331] = Heap.s(v[232], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[331] != 0 ? 23 : 25;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[332] = Heap.s(v[330], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[332] != 0 ? 24 : 27;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[333] = LibC.call(m, "llvm.smin.i32", new long[]{v[232], v[330]});
        return 27;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[334] = v[231] > 131071L ? 1L : 0L;
        v[335] = Heap.s(v[330], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[336] = ((v[334] & v[335])) & 1L;
        return v[336] != 0 ? 26 : 27;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[337] = LibC.call(m, "llvm.smax.i32", new long[]{v[232], v[330]});
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi338 = (previous == 24 ? v[333] : (previous == 26 ? v[337] : (previous == 25 ? 0L : 0L)));
        v[338] = phi338;
        v[339] = ((Heap.s(v[338], 32) >> 1L)) & 4294967295L;
        v[340] = ((v[323] - v[339])) & 4294967295L;
        m.store(v[20], v[340], 4);
        v[341] = m.load(v[23], 4);
        v[342] = ((v[341] - v[339])) & 4294967295L;
        m.store(v[23], v[342], 4);
        v[343] = m.load(v[21], 4);
        v[344] = ((v[343] + v[339])) & 4294967295L;
        m.store(v[21], v[344], 4);
        v[345] = m.load(v[22], 4);
        v[346] = ((v[345] + v[339])) & 4294967295L;
        m.store(v[22], v[346], 4);
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        return -1;
    }
}
