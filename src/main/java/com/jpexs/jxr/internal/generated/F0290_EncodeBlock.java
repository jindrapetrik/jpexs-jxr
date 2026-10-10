package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: EncodeBlock.
 */
public final class F0290_EncodeBlock {

    private F0290_EncodeBlock() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4, long a5, long a6) {
        long[] v = new long[206];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
        v[5] = a5;
        v[6] = a6;
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
                        throw new IllegalStateException("Invalid block in EncodeBlock");
                }
                previous = old;
                if (pc < 0) {
                    return v[205];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = m.load(v[1], 4);
        v[10] = v[9] == 0L ? 1L : 0L;
        v[11] = (v[10]) & 4294967295L;
        v[12] = ((v[8] + 4294967294L)) & 4294967295L;
        v[13] = v[12] < 4294967293L ? 1L : 0L;
        v[14] = v[2] == 1L ? 1L : 0L;
        return v[14] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[15] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = Heap.s(v[16], 32) < Heap.s(1L, 32) ? 1L : 0L;
        v[18] = v[17] != 0 ? 1L : 2L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi19 = (previous == 0 ? 0L : v[18]);
        v[19] = phi19;
        v[20] = ((v[19] << 2L)) & 4294967295L;
        v[21] = v[13] != 0 ? 2L : 0L;
        v[22] = ((v[20] | v[21])) & 4294967295L;
        v[23] = ((v[22] | v[11])) & 4294967295L;
        v[24] = (v[3] + (Heap.s(v[4], 32) * 4L)) & 4294967295L;
        v[25] = ((v[0] * 3L)) & 4294967295L;
        v[26] = (v[24] + (Heap.s(v[25], 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = (v[27] + (Heap.s(0L, 32) * 44L) + 8L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = (v[29] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[27] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((v[33] + v[31])) & 4294967295L;
        m.store(v[32], v[34], 4);
        v[35] = (v[27] + (Heap.s(0L, 32) * 44L) + 12L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[36] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = (v[27] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = ((v[40] + v[38])) & 4294967295L;
        m.store(v[39], v[41], 4);
        v[42] = (v[27] + (Heap.s(0L, 32) * 44L) + 4L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = ((v[23] << 1L)) & 4294967295L;
        v[45] = ((v[44] | 1L)) & 4294967295L;
        v[46] = (v[43] + (Heap.s(v[45], 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = LibC.call(m, "llvm.fshl.i32", new long[]{v[47], v[8], 1L});
        v[49] = (v[43] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        v[50] = (v[49] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = ((v[51] + 1L)) & 4294967295L;
        F0359_putBit16z.run(m, v[5], v[48], v[52]);
        v[53] = ((v[19] & v[11])) & 4294967295L;
        return v[13] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[54] = LibC.call(m, "abs", new long[]{v[8]});
        v[55] = ((v[54] + 4294967295L)) & 4294967295L;
        v[56] = (v[24] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[57] = (v[56] + (Heap.s(v[53], 32) * 4L)) & 4294967295L;
        v[58] = m.load(v[57], 4);
        F0287_EncodeSignificantAbsLevel.run(m, v[55], v[58], v[5]);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[10] != 0 ? 9 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[59] = m.load(v[1], 4);
        v[60] = ((15L - v[6])) & 4294967295L;
        v[61] = v[6] > 10L ? 1L : 0L;
        return v[61] != 0 ? 6 : 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[62] = v[6] < 14L ? 1L : 0L;
        return v[62] != 0 ? 7 : 9;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[63] = v[60] != v[59] ? 1L : 0L;
        v[64] = (v[63]) & 4294967295L;
        v[65] = ((v[60] - v[59])) & 4294967295L;
        v[66] = (10992L + (Heap.s(0L, 32) * 16L) + (Heap.s(v[65], 32) * 4L)) & 4294967295L;
        v[67] = m.load(v[66], 4);
        v[68] = ((v[67] - v[6])) & 4294967295L;
        v[69] = ((v[68] + 11L)) & 4294967295L;
        F0359_putBit16z.run(m, v[5], v[64], v[69]);
        return 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[70] = m.load(v[3], 4);
        v[71] = (11008L + (Heap.s(0L, 32) * 0L) + (Heap.s(v[60], 32) * 4L)) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = ((v[72] * 14L)) & 4294967295L;
        v[74] = ((v[59] + 4294967295L)) & 4294967295L;
        v[75] = ((v[74] + v[73])) & 4294967295L;
        v[76] = (10848L + (Heap.s(0L, 32) * 136L) + (Heap.s(v[75], 32) * 4L)) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = ((v[72] * 5L)) & 4294967295L;
        v[79] = ((v[77] + v[78])) & 4294967295L;
        v[80] = (11072L + (Heap.s(0L, 32) * 0L) + (Heap.s(v[79], 32) * 4L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = (v[70] + (Heap.s(0L, 32) * 44L) + 4L) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = ((v[77] << 1L)) & 4294967295L;
        v[85] = ((v[84] | 1L)) & 4294967295L;
        v[86] = (v[83] + (Heap.s(v[85], 32) * 4L)) & 4294967295L;
        v[87] = m.load(v[86], 4);
        v[88] = (v[83] + (Heap.s(v[84], 32) * 4L)) & 4294967295L;
        v[89] = (v[88] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[90] = m.load(v[89], 4);
        F0359_putBit16z.run(m, v[5], v[87], v[90]);
        v[91] = ((v[59] + 1L)) & 4294967295L;
        F0297_putBit16.run(m, v[5], v[91], v[81]);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[92] = (v[24] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[93] = (v[92] + (Heap.s(v[25], 32) * 4L)) & 4294967295L;
        v[94] = Heap.s(v[2], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[94] != 0 ? 10 : 26;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[95] = ((v[6] + 1L)) & 4294967295L;
        v[96] = m.load(v[1], 4);
        v[97] = ((v[95] + v[96])) & 4294967295L;
        v[98] = ((v[2] + 4294967295L)) & 4294967295L;
        v[99] = (v[24] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi100 = (previous == 10 ? v[53] : v[198]);
        long phi101 = (previous == 10 ? 1L : v[203]);
        long phi102 = (previous == 10 ? v[19] : v[149]);
        long phi103 = (previous == 10 ? v[97] : v[143]);
        v[100] = phi100;
        v[101] = phi101;
        v[102] = phi102;
        v[103] = phi103;
        v[104] = v[102] == 2L ? 1L : 0L;
        v[105] = ((v[101] << 1L)) & 4294967295L;
        return v[104] != 0 ? 12 : 16;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[106] = (v[1] + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        v[107] = m.load(v[106], 4);
        v[108] = ((15L - v[103])) & 4294967295L;
        v[109] = Heap.s(v[108], 32) < Heap.s(5L, 32) ? 1L : 0L;
        return v[109] != 0 ? 13 : 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[110] = Heap.s(v[108], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[110] != 0 ? 14 : 16;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[111] = v[108] != v[107] ? 1L : 0L;
        v[112] = (v[111]) & 4294967295L;
        v[113] = ((v[108] - v[107])) & 4294967295L;
        v[114] = (10992L + (Heap.s(0L, 32) * 16L) + (Heap.s(v[113], 32) * 4L)) & 4294967295L;
        v[115] = m.load(v[114], 4);
        v[116] = ((v[115] - v[103])) & 4294967295L;
        v[117] = ((v[116] + 11L)) & 4294967295L;
        F0359_putBit16z.run(m, v[5], v[112], v[117]);
        return 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[118] = m.load(v[3], 4);
        v[119] = (11008L + (Heap.s(0L, 32) * 0L) + (Heap.s(v[108], 32) * 4L)) & 4294967295L;
        v[120] = m.load(v[119], 4);
        v[121] = ((v[120] * 14L)) & 4294967295L;
        v[122] = ((v[107] + 4294967295L)) & 4294967295L;
        v[123] = ((v[122] + v[121])) & 4294967295L;
        v[124] = (10848L + (Heap.s(0L, 32) * 136L) + (Heap.s(v[123], 32) * 4L)) & 4294967295L;
        v[125] = m.load(v[124], 4);
        v[126] = ((v[120] * 5L)) & 4294967295L;
        v[127] = ((v[125] + v[126])) & 4294967295L;
        v[128] = (11072L + (Heap.s(0L, 32) * 0L) + (Heap.s(v[127], 32) * 4L)) & 4294967295L;
        v[129] = m.load(v[128], 4);
        v[130] = (v[118] + (Heap.s(0L, 32) * 44L) + 4L) & 4294967295L;
        v[131] = m.load(v[130], 4);
        v[132] = ((v[125] << 1L)) & 4294967295L;
        v[133] = ((v[132] | 1L)) & 4294967295L;
        v[134] = (v[131] + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        v[135] = m.load(v[134], 4);
        v[136] = (v[131] + (Heap.s(v[132], 32) * 4L)) & 4294967295L;
        v[137] = (v[136] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[138] = m.load(v[137], 4);
        F0359_putBit16z.run(m, v[5], v[135], v[138]);
        v[139] = ((v[107] + 1L)) & 4294967295L;
        F0297_putBit16.run(m, v[5], v[139], v[129]);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[140] = (v[1] + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        v[141] = m.load(v[140], 4);
        v[142] = ((v[103] + 1L)) & 4294967295L;
        v[143] = ((v[142] + v[141])) & 4294967295L;
        v[144] = v[101] == v[98] ? 1L : 0L;
        return v[144] != 0 ? 18 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[145] = (v[140] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[146] = m.load(v[145], 4);
        v[147] = Heap.s(v[146], 32) < Heap.s(1L, 32) ? 1L : 0L;
        v[148] = v[147] != 0 ? 1L : 2L;
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi149 = (previous == 16 ? 0L : v[148]);
        v[149] = phi149;
        v[150] = ((v[105] | 1L)) & 4294967295L;
        v[151] = (v[1] + (Heap.s(v[150], 32) * 4L)) & 4294967295L;
        v[152] = m.load(v[151], 4);
        v[153] = ((v[152] + 4294967294L)) & 4294967295L;
        v[154] = v[153] < 4294967293L ? 1L : 0L;
        v[155] = (v[154]) & 4294967295L;
        v[156] = ((v[149] << 1L)) & 4294967295L;
        v[157] = ((v[156] | v[155])) & 4294967295L;
        v[158] = ((v[152] >>> 31L)) & 4294967295L;
        v[159] = Heap.s(v[143], 32) < Heap.s(15L, 32) ? 1L : 0L;
        return v[159] != 0 ? 19 : 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[160] = (v[93] + (Heap.s(v[100], 32) * 4L)) & 4294967295L;
        v[161] = m.load(v[160], 4);
        v[162] = (v[161] + (Heap.s(0L, 32) * 44L) + 8L) & 4294967295L;
        v[163] = m.load(v[162], 4);
        v[164] = (v[163] + (Heap.s(v[157], 32) * 4L)) & 4294967295L;
        v[165] = m.load(v[164], 4);
        v[166] = (v[161] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[167] = m.load(v[166], 4);
        v[168] = ((v[167] + v[165])) & 4294967295L;
        m.store(v[166], v[168], 4);
        v[169] = (v[161] + (Heap.s(0L, 32) * 44L) + 12L) & 4294967295L;
        v[170] = m.load(v[169], 4);
        v[171] = (v[170] + (Heap.s(v[157], 32) * 4L)) & 4294967295L;
        v[172] = m.load(v[171], 4);
        v[173] = (v[161] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[174] = m.load(v[173], 4);
        v[175] = ((v[174] + v[172])) & 4294967295L;
        m.store(v[173], v[175], 4);
        v[176] = (v[161] + (Heap.s(0L, 32) * 44L) + 4L) & 4294967295L;
        v[177] = m.load(v[176], 4);
        v[178] = ((v[157] << 1L)) & 4294967295L;
        v[179] = ((v[178] | 1L)) & 4294967295L;
        v[180] = (v[177] + (Heap.s(v[179], 32) * 4L)) & 4294967295L;
        v[181] = m.load(v[180], 4);
        v[182] = ((v[181] << 1L)) & 4294967295L;
        v[183] = ((v[182] | v[158])) & 4294967295L;
        v[184] = (v[177] + (Heap.s(v[178], 32) * 4L)) & 4294967295L;
        v[185] = (v[184] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[186] = m.load(v[185], 4);
        v[187] = ((v[186] + 1L)) & 4294967295L;
        F0359_putBit16z.run(m, v[5], v[183], v[187]);
        return 23;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[188] = v[143] == 15L ? 1L : 0L;
        return v[188] != 0 ? 21 : 22;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[189] = (11136L + (Heap.s(0L, 32) * 16L) + (Heap.s(v[157], 32) * 4L)) & 4294967295L;
        v[190] = m.load(v[189], 4);
        v[191] = ((v[190] << 1L)) & 4294967295L;
        v[192] = ((v[191] | v[158])) & 4294967295L;
        v[193] = (11152L + (Heap.s(0L, 32) * 16L) + (Heap.s(v[157], 32) * 4L)) & 4294967295L;
        v[194] = m.load(v[193], 4);
        v[195] = ((v[194] + 1L)) & 4294967295L;
        F0359_putBit16z.run(m, v[5], v[192], v[195]);
        return 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[196] = ((v[157] << 1L)) & 4294967295L;
        v[197] = ((v[196] | v[158])) & 4294967295L;
        F0359_putBit16z.run(m, v[5], v[197], 2L);
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[198] = ((v[149] & v[100])) & 4294967295L;
        return v[154] != 0 ? 24 : 25;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[199] = LibC.call(m, "abs", new long[]{v[152]});
        v[200] = ((v[199] + 4294967295L)) & 4294967295L;
        v[201] = (v[99] + (Heap.s(v[198], 32) * 4L)) & 4294967295L;
        v[202] = m.load(v[201], 4);
        F0287_EncodeSignificantAbsLevel.run(m, v[200], v[202], v[5]);
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[203] = ((v[101] + 1L)) & 4294967295L;
        v[204] = v[203] == v[2] ? 1L : 0L;
        return v[204] != 0 ? 26 : 11;
    }

    private static int b26(Heap m, long[] v, int previous) {
        return -1;
    }
}
