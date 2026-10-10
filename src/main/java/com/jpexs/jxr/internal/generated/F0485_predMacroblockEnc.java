package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: predMacroblockEnc.
 */
public final class F0485_predMacroblockEnc {

    private F0485_predMacroblockEnc() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[691];
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
                    case 44:
                        pc = b44(m, v, previous);
                        break;
                    case 45:
                        pc = b45(m, v, previous);
                        break;
                    case 46:
                        pc = b46(m, v, previous);
                        break;
                    case 47:
                        pc = b47(m, v, previous);
                        break;
                    case 48:
                        pc = b48(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in predMacroblockEnc");
                }
                previous = old;
                if (pc < 0) {
                    return v[690];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = ((v[2] + 4294967295L)) & 4294967295L;
        v[4] = v[3] < 2L ? 1L : 0L;
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi7 = (previous == 1 ? v[6] : 1L);
        v[7] = phi7;
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[9] + 4294967295L)) & 4294967295L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L) & 4294967295L;
        v[12] = F0469_getDCACPredMode.run(m, v[0], v[10]);
        v[13] = ((v[12] & 3L)) & 4294967295L;
        v[14] = ((v[12] & 12L)) & 4294967295L;
        v[15] = F0468_getACPredMode.run(m, v[11], v[2]);
        v[16] = ((2L - v[15])) & 4294967295L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1024L) & 4294967295L;
        m.store(v[17], v[16], 4);
        F0471_updatePredInfo.run(m, v[0], v[11], v[10], v[2]);
        v[18] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[18] != 0 ? 3 : 17;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi19 = (previous == 16 ? v[391] : 0L);
        v[19] = phi19;
        v[20] = (v[11] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[19], 32) * 64L)) & 4294967295L;
        switch ((int) v[13]) {
            case 1:
                return 4;
            case 0:
                return 5;
            case 2:
                return 6;
            default:
                return 8;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[22] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        return 7;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[26] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[28] = (v[27] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[31] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[33] = (v[32] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[36] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = ((v[38] + v[34])) & 4294967295L;
        v[40] = ((Heap.s(v[39], 32) >> 1L)) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi41 = (previous == 5 ? v[29] : (previous == 6 ? v[40] : v[24]));
        v[41] = phi41;
        v[42] = m.load(v[20], 4);
        v[43] = ((v[42] - v[41])) & 4294967295L;
        m.store(v[20], v[43], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        switch ((int) v[14]) {
            case 4:
                return 9;
            case 0:
                return 10;
            default:
                return 12;
        }
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[44] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = (v[45] + (Heap.s(v[10], 32) * 40L) + 36L) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = (v[47] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = (v[20] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = ((v[51] - v[49])) & 4294967295L;
        m.store(v[50], v[52], 4);
        v[53] = (v[47] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = (v[20] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = ((v[56] - v[54])) & 4294967295L;
        m.store(v[55], v[57], 4);
        v[58] = (v[47] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        return 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[59] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = (v[60] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[62] = (v[61] + (Heap.s(4294967295L, 32) * 40L) + 36L) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = m.load(v[63], 4);
        v[65] = (v[20] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = ((v[66] - v[64])) & 4294967295L;
        m.store(v[65], v[67], 4);
        v[68] = (v[63] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = (v[20] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = ((v[71] - v[69])) & 4294967295L;
        m.store(v[70], v[72], 4);
        v[73] = (v[63] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi74 = (previous == 9 ? v[58] : v[73]);
        long phi75 = (previous == 9 ? 12L : 3L);
        v[74] = phi74;
        v[75] = phi75;
        v[76] = m.load(v[74], 4);
        v[77] = (v[20] + (Heap.s(v[75], 32) * 4L)) & 4294967295L;
        v[78] = m.load(v[77], 4);
        v[79] = ((v[78] - v[76])) & 4294967295L;
        m.store(v[77], v[79], 4);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[80] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        switch ((int) v[15]) {
            case 1:
                return 14;
            case 0:
                return 13;
            default:
                return 16;
        }
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[82] = (v[81] + (Heap.s(133L, 32) * 4L)) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = (v[81] + (Heap.s(197L, 32) * 4L)) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = ((v[85] - v[83])) & 4294967295L;
        m.store(v[84], v[86], 4);
        v[87] = (v[81] + (Heap.s(129L, 32) * 4L)) & 4294967295L;
        v[88] = m.load(v[87], 4);
        v[89] = (v[81] + (Heap.s(193L, 32) * 4L)) & 4294967295L;
        v[90] = m.load(v[89], 4);
        v[91] = ((v[90] - v[88])) & 4294967295L;
        m.store(v[89], v[91], 4);
        v[92] = (v[81] + (Heap.s(134L, 32) * 4L)) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = (v[81] + (Heap.s(198L, 32) * 4L)) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = ((v[95] - v[93])) & 4294967295L;
        m.store(v[94], v[96], 4);
        v[97] = (v[81] + (Heap.s(69L, 32) * 4L)) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = (v[81] + (Heap.s(133L, 32) * 4L)) & 4294967295L;
        v[100] = ((v[83] - v[98])) & 4294967295L;
        m.store(v[99], v[100], 4);
        v[101] = (v[81] + (Heap.s(65L, 32) * 4L)) & 4294967295L;
        v[102] = m.load(v[101], 4);
        v[103] = (v[81] + (Heap.s(129L, 32) * 4L)) & 4294967295L;
        v[104] = ((v[88] - v[102])) & 4294967295L;
        m.store(v[103], v[104], 4);
        v[105] = (v[81] + (Heap.s(70L, 32) * 4L)) & 4294967295L;
        v[106] = m.load(v[105], 4);
        v[107] = (v[81] + (Heap.s(134L, 32) * 4L)) & 4294967295L;
        v[108] = ((v[93] - v[106])) & 4294967295L;
        m.store(v[107], v[108], 4);
        v[109] = (v[81] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[110] = m.load(v[109], 4);
        v[111] = (v[81] + (Heap.s(69L, 32) * 4L)) & 4294967295L;
        v[112] = ((v[98] - v[110])) & 4294967295L;
        m.store(v[111], v[112], 4);
        v[113] = (v[81] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[114] = m.load(v[113], 4);
        v[115] = (v[81] + (Heap.s(65L, 32) * 4L)) & 4294967295L;
        v[116] = ((v[102] - v[114])) & 4294967295L;
        m.store(v[115], v[116], 4);
        v[117] = (v[81] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[118] = m.load(v[117], 4);
        v[119] = (v[81] + (Heap.s(70L, 32) * 4L)) & 4294967295L;
        v[120] = ((v[106] - v[118])) & 4294967295L;
        m.store(v[119], v[120], 4);
        v[121] = (v[81] + (Heap.s(149L, 32) * 4L)) & 4294967295L;
        v[122] = m.load(v[121], 4);
        v[123] = (v[81] + (Heap.s(213L, 32) * 4L)) & 4294967295L;
        v[124] = m.load(v[123], 4);
        v[125] = ((v[124] - v[122])) & 4294967295L;
        m.store(v[123], v[125], 4);
        v[126] = (v[81] + (Heap.s(145L, 32) * 4L)) & 4294967295L;
        v[127] = m.load(v[126], 4);
        v[128] = (v[81] + (Heap.s(209L, 32) * 4L)) & 4294967295L;
        v[129] = m.load(v[128], 4);
        v[130] = ((v[129] - v[127])) & 4294967295L;
        m.store(v[128], v[130], 4);
        v[131] = (v[81] + (Heap.s(150L, 32) * 4L)) & 4294967295L;
        v[132] = m.load(v[131], 4);
        v[133] = (v[81] + (Heap.s(214L, 32) * 4L)) & 4294967295L;
        v[134] = m.load(v[133], 4);
        v[135] = ((v[134] - v[132])) & 4294967295L;
        m.store(v[133], v[135], 4);
        v[136] = (v[81] + (Heap.s(85L, 32) * 4L)) & 4294967295L;
        v[137] = m.load(v[136], 4);
        v[138] = (v[81] + (Heap.s(149L, 32) * 4L)) & 4294967295L;
        v[139] = ((v[122] - v[137])) & 4294967295L;
        m.store(v[138], v[139], 4);
        v[140] = (v[81] + (Heap.s(81L, 32) * 4L)) & 4294967295L;
        v[141] = m.load(v[140], 4);
        v[142] = (v[81] + (Heap.s(145L, 32) * 4L)) & 4294967295L;
        v[143] = ((v[127] - v[141])) & 4294967295L;
        m.store(v[142], v[143], 4);
        v[144] = (v[81] + (Heap.s(86L, 32) * 4L)) & 4294967295L;
        v[145] = m.load(v[144], 4);
        v[146] = (v[81] + (Heap.s(150L, 32) * 4L)) & 4294967295L;
        v[147] = ((v[132] - v[145])) & 4294967295L;
        m.store(v[146], v[147], 4);
        v[148] = (v[81] + (Heap.s(21L, 32) * 4L)) & 4294967295L;
        v[149] = m.load(v[148], 4);
        v[150] = (v[81] + (Heap.s(85L, 32) * 4L)) & 4294967295L;
        v[151] = ((v[137] - v[149])) & 4294967295L;
        m.store(v[150], v[151], 4);
        v[152] = (v[81] + (Heap.s(17L, 32) * 4L)) & 4294967295L;
        v[153] = m.load(v[152], 4);
        v[154] = (v[81] + (Heap.s(81L, 32) * 4L)) & 4294967295L;
        v[155] = ((v[141] - v[153])) & 4294967295L;
        m.store(v[154], v[155], 4);
        v[156] = (v[81] + (Heap.s(22L, 32) * 4L)) & 4294967295L;
        v[157] = m.load(v[156], 4);
        v[158] = (v[81] + (Heap.s(86L, 32) * 4L)) & 4294967295L;
        v[159] = ((v[145] - v[157])) & 4294967295L;
        m.store(v[158], v[159], 4);
        v[160] = (v[81] + (Heap.s(165L, 32) * 4L)) & 4294967295L;
        v[161] = m.load(v[160], 4);
        v[162] = (v[81] + (Heap.s(229L, 32) * 4L)) & 4294967295L;
        v[163] = m.load(v[162], 4);
        v[164] = ((v[163] - v[161])) & 4294967295L;
        m.store(v[162], v[164], 4);
        v[165] = (v[81] + (Heap.s(161L, 32) * 4L)) & 4294967295L;
        v[166] = m.load(v[165], 4);
        v[167] = (v[81] + (Heap.s(225L, 32) * 4L)) & 4294967295L;
        v[168] = m.load(v[167], 4);
        v[169] = ((v[168] - v[166])) & 4294967295L;
        m.store(v[167], v[169], 4);
        v[170] = (v[81] + (Heap.s(166L, 32) * 4L)) & 4294967295L;
        v[171] = m.load(v[170], 4);
        v[172] = (v[81] + (Heap.s(230L, 32) * 4L)) & 4294967295L;
        v[173] = m.load(v[172], 4);
        v[174] = ((v[173] - v[171])) & 4294967295L;
        m.store(v[172], v[174], 4);
        v[175] = (v[81] + (Heap.s(101L, 32) * 4L)) & 4294967295L;
        v[176] = m.load(v[175], 4);
        v[177] = (v[81] + (Heap.s(165L, 32) * 4L)) & 4294967295L;
        v[178] = ((v[161] - v[176])) & 4294967295L;
        m.store(v[177], v[178], 4);
        v[179] = (v[81] + (Heap.s(97L, 32) * 4L)) & 4294967295L;
        v[180] = m.load(v[179], 4);
        v[181] = (v[81] + (Heap.s(161L, 32) * 4L)) & 4294967295L;
        v[182] = ((v[166] - v[180])) & 4294967295L;
        m.store(v[181], v[182], 4);
        v[183] = (v[81] + (Heap.s(102L, 32) * 4L)) & 4294967295L;
        v[184] = m.load(v[183], 4);
        v[185] = (v[81] + (Heap.s(166L, 32) * 4L)) & 4294967295L;
        v[186] = ((v[171] - v[184])) & 4294967295L;
        m.store(v[185], v[186], 4);
        v[187] = (v[81] + (Heap.s(37L, 32) * 4L)) & 4294967295L;
        v[188] = m.load(v[187], 4);
        v[189] = (v[81] + (Heap.s(101L, 32) * 4L)) & 4294967295L;
        v[190] = ((v[176] - v[188])) & 4294967295L;
        m.store(v[189], v[190], 4);
        v[191] = (v[81] + (Heap.s(33L, 32) * 4L)) & 4294967295L;
        v[192] = m.load(v[191], 4);
        v[193] = (v[81] + (Heap.s(97L, 32) * 4L)) & 4294967295L;
        v[194] = ((v[180] - v[192])) & 4294967295L;
        m.store(v[193], v[194], 4);
        v[195] = (v[81] + (Heap.s(38L, 32) * 4L)) & 4294967295L;
        v[196] = m.load(v[195], 4);
        v[197] = (v[81] + (Heap.s(102L, 32) * 4L)) & 4294967295L;
        v[198] = ((v[184] - v[196])) & 4294967295L;
        m.store(v[197], v[198], 4);
        v[199] = (v[81] + (Heap.s(181L, 32) * 4L)) & 4294967295L;
        v[200] = m.load(v[199], 4);
        v[201] = (v[81] + (Heap.s(245L, 32) * 4L)) & 4294967295L;
        v[202] = m.load(v[201], 4);
        v[203] = ((v[202] - v[200])) & 4294967295L;
        m.store(v[201], v[203], 4);
        v[204] = (v[81] + (Heap.s(177L, 32) * 4L)) & 4294967295L;
        v[205] = m.load(v[204], 4);
        v[206] = (v[81] + (Heap.s(241L, 32) * 4L)) & 4294967295L;
        v[207] = m.load(v[206], 4);
        v[208] = ((v[207] - v[205])) & 4294967295L;
        m.store(v[206], v[208], 4);
        v[209] = (v[81] + (Heap.s(182L, 32) * 4L)) & 4294967295L;
        v[210] = m.load(v[209], 4);
        v[211] = (v[81] + (Heap.s(246L, 32) * 4L)) & 4294967295L;
        v[212] = m.load(v[211], 4);
        v[213] = ((v[212] - v[210])) & 4294967295L;
        m.store(v[211], v[213], 4);
        v[214] = (v[81] + (Heap.s(117L, 32) * 4L)) & 4294967295L;
        v[215] = m.load(v[214], 4);
        v[216] = (v[81] + (Heap.s(181L, 32) * 4L)) & 4294967295L;
        v[217] = ((v[200] - v[215])) & 4294967295L;
        m.store(v[216], v[217], 4);
        v[218] = (v[81] + (Heap.s(113L, 32) * 4L)) & 4294967295L;
        v[219] = m.load(v[218], 4);
        v[220] = (v[81] + (Heap.s(177L, 32) * 4L)) & 4294967295L;
        v[221] = ((v[205] - v[219])) & 4294967295L;
        m.store(v[220], v[221], 4);
        v[222] = (v[81] + (Heap.s(118L, 32) * 4L)) & 4294967295L;
        v[223] = m.load(v[222], 4);
        v[224] = (v[81] + (Heap.s(182L, 32) * 4L)) & 4294967295L;
        v[225] = ((v[210] - v[223])) & 4294967295L;
        m.store(v[224], v[225], 4);
        return 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[226] = (v[81] + (Heap.s(42L, 32) * 4L)) & 4294967295L;
        v[227] = m.load(v[226], 4);
        v[228] = (v[81] + (Heap.s(58L, 32) * 4L)) & 4294967295L;
        v[229] = m.load(v[228], 4);
        v[230] = ((v[229] - v[227])) & 4294967295L;
        m.store(v[228], v[230], 4);
        v[231] = (v[81] + (Heap.s(34L, 32) * 4L)) & 4294967295L;
        v[232] = m.load(v[231], 4);
        v[233] = (v[81] + (Heap.s(50L, 32) * 4L)) & 4294967295L;
        v[234] = m.load(v[233], 4);
        v[235] = ((v[234] - v[232])) & 4294967295L;
        m.store(v[233], v[235], 4);
        v[236] = (v[81] + (Heap.s(41L, 32) * 4L)) & 4294967295L;
        v[237] = m.load(v[236], 4);
        v[238] = (v[81] + (Heap.s(57L, 32) * 4L)) & 4294967295L;
        v[239] = m.load(v[238], 4);
        v[240] = ((v[239] - v[237])) & 4294967295L;
        m.store(v[238], v[240], 4);
        v[241] = (v[81] + (Heap.s(26L, 32) * 4L)) & 4294967295L;
        v[242] = m.load(v[241], 4);
        v[243] = (v[81] + (Heap.s(42L, 32) * 4L)) & 4294967295L;
        v[244] = ((v[227] - v[242])) & 4294967295L;
        m.store(v[243], v[244], 4);
        v[245] = (v[81] + (Heap.s(18L, 32) * 4L)) & 4294967295L;
        v[246] = m.load(v[245], 4);
        v[247] = (v[81] + (Heap.s(34L, 32) * 4L)) & 4294967295L;
        v[248] = ((v[232] - v[246])) & 4294967295L;
        m.store(v[247], v[248], 4);
        v[249] = (v[81] + (Heap.s(25L, 32) * 4L)) & 4294967295L;
        v[250] = m.load(v[249], 4);
        v[251] = (v[81] + (Heap.s(41L, 32) * 4L)) & 4294967295L;
        v[252] = ((v[237] - v[250])) & 4294967295L;
        m.store(v[251], v[252], 4);
        v[253] = (v[81] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[254] = m.load(v[253], 4);
        v[255] = (v[81] + (Heap.s(26L, 32) * 4L)) & 4294967295L;
        v[256] = ((v[242] - v[254])) & 4294967295L;
        m.store(v[255], v[256], 4);
        v[257] = (v[81] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[258] = m.load(v[257], 4);
        v[259] = (v[81] + (Heap.s(18L, 32) * 4L)) & 4294967295L;
        v[260] = ((v[246] - v[258])) & 4294967295L;
        m.store(v[259], v[260], 4);
        v[261] = (v[81] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[262] = m.load(v[261], 4);
        v[263] = (v[81] + (Heap.s(25L, 32) * 4L)) & 4294967295L;
        v[264] = ((v[250] - v[262])) & 4294967295L;
        m.store(v[263], v[264], 4);
        v[265] = (v[81] + (Heap.s(106L, 32) * 4L)) & 4294967295L;
        v[266] = m.load(v[265], 4);
        v[267] = (v[81] + (Heap.s(122L, 32) * 4L)) & 4294967295L;
        v[268] = m.load(v[267], 4);
        v[269] = ((v[268] - v[266])) & 4294967295L;
        m.store(v[267], v[269], 4);
        v[270] = (v[81] + (Heap.s(98L, 32) * 4L)) & 4294967295L;
        v[271] = m.load(v[270], 4);
        v[272] = (v[81] + (Heap.s(114L, 32) * 4L)) & 4294967295L;
        v[273] = m.load(v[272], 4);
        v[274] = ((v[273] - v[271])) & 4294967295L;
        m.store(v[272], v[274], 4);
        v[275] = (v[81] + (Heap.s(105L, 32) * 4L)) & 4294967295L;
        v[276] = m.load(v[275], 4);
        v[277] = (v[81] + (Heap.s(121L, 32) * 4L)) & 4294967295L;
        v[278] = m.load(v[277], 4);
        v[279] = ((v[278] - v[276])) & 4294967295L;
        m.store(v[277], v[279], 4);
        v[280] = (v[81] + (Heap.s(90L, 32) * 4L)) & 4294967295L;
        v[281] = m.load(v[280], 4);
        v[282] = (v[81] + (Heap.s(106L, 32) * 4L)) & 4294967295L;
        v[283] = ((v[266] - v[281])) & 4294967295L;
        m.store(v[282], v[283], 4);
        v[284] = (v[81] + (Heap.s(82L, 32) * 4L)) & 4294967295L;
        v[285] = m.load(v[284], 4);
        v[286] = (v[81] + (Heap.s(98L, 32) * 4L)) & 4294967295L;
        v[287] = ((v[271] - v[285])) & 4294967295L;
        m.store(v[286], v[287], 4);
        v[288] = (v[81] + (Heap.s(89L, 32) * 4L)) & 4294967295L;
        v[289] = m.load(v[288], 4);
        v[290] = (v[81] + (Heap.s(105L, 32) * 4L)) & 4294967295L;
        v[291] = ((v[276] - v[289])) & 4294967295L;
        m.store(v[290], v[291], 4);
        v[292] = (v[81] + (Heap.s(74L, 32) * 4L)) & 4294967295L;
        v[293] = m.load(v[292], 4);
        v[294] = (v[81] + (Heap.s(90L, 32) * 4L)) & 4294967295L;
        v[295] = ((v[281] - v[293])) & 4294967295L;
        m.store(v[294], v[295], 4);
        v[296] = (v[81] + (Heap.s(66L, 32) * 4L)) & 4294967295L;
        v[297] = m.load(v[296], 4);
        v[298] = (v[81] + (Heap.s(82L, 32) * 4L)) & 4294967295L;
        v[299] = ((v[285] - v[297])) & 4294967295L;
        m.store(v[298], v[299], 4);
        v[300] = (v[81] + (Heap.s(73L, 32) * 4L)) & 4294967295L;
        v[301] = m.load(v[300], 4);
        v[302] = (v[81] + (Heap.s(89L, 32) * 4L)) & 4294967295L;
        v[303] = ((v[289] - v[301])) & 4294967295L;
        m.store(v[302], v[303], 4);
        v[304] = (v[81] + (Heap.s(170L, 32) * 4L)) & 4294967295L;
        v[305] = m.load(v[304], 4);
        v[306] = (v[81] + (Heap.s(186L, 32) * 4L)) & 4294967295L;
        v[307] = m.load(v[306], 4);
        v[308] = ((v[307] - v[305])) & 4294967295L;
        m.store(v[306], v[308], 4);
        v[309] = (v[81] + (Heap.s(162L, 32) * 4L)) & 4294967295L;
        v[310] = m.load(v[309], 4);
        v[311] = (v[81] + (Heap.s(178L, 32) * 4L)) & 4294967295L;
        v[312] = m.load(v[311], 4);
        v[313] = ((v[312] - v[310])) & 4294967295L;
        m.store(v[311], v[313], 4);
        v[314] = (v[81] + (Heap.s(169L, 32) * 4L)) & 4294967295L;
        v[315] = m.load(v[314], 4);
        v[316] = (v[81] + (Heap.s(185L, 32) * 4L)) & 4294967295L;
        v[317] = m.load(v[316], 4);
        v[318] = ((v[317] - v[315])) & 4294967295L;
        m.store(v[316], v[318], 4);
        v[319] = (v[81] + (Heap.s(154L, 32) * 4L)) & 4294967295L;
        v[320] = m.load(v[319], 4);
        v[321] = (v[81] + (Heap.s(170L, 32) * 4L)) & 4294967295L;
        v[322] = ((v[305] - v[320])) & 4294967295L;
        m.store(v[321], v[322], 4);
        v[323] = (v[81] + (Heap.s(146L, 32) * 4L)) & 4294967295L;
        v[324] = m.load(v[323], 4);
        v[325] = (v[81] + (Heap.s(162L, 32) * 4L)) & 4294967295L;
        v[326] = ((v[310] - v[324])) & 4294967295L;
        m.store(v[325], v[326], 4);
        v[327] = (v[81] + (Heap.s(153L, 32) * 4L)) & 4294967295L;
        v[328] = m.load(v[327], 4);
        v[329] = (v[81] + (Heap.s(169L, 32) * 4L)) & 4294967295L;
        v[330] = ((v[315] - v[328])) & 4294967295L;
        m.store(v[329], v[330], 4);
        v[331] = (v[81] + (Heap.s(138L, 32) * 4L)) & 4294967295L;
        v[332] = m.load(v[331], 4);
        v[333] = (v[81] + (Heap.s(154L, 32) * 4L)) & 4294967295L;
        v[334] = ((v[320] - v[332])) & 4294967295L;
        m.store(v[333], v[334], 4);
        v[335] = (v[81] + (Heap.s(130L, 32) * 4L)) & 4294967295L;
        v[336] = m.load(v[335], 4);
        v[337] = (v[81] + (Heap.s(146L, 32) * 4L)) & 4294967295L;
        v[338] = ((v[324] - v[336])) & 4294967295L;
        m.store(v[337], v[338], 4);
        v[339] = (v[81] + (Heap.s(137L, 32) * 4L)) & 4294967295L;
        v[340] = m.load(v[339], 4);
        v[341] = (v[81] + (Heap.s(153L, 32) * 4L)) & 4294967295L;
        v[342] = ((v[328] - v[340])) & 4294967295L;
        m.store(v[341], v[342], 4);
        v[343] = (v[81] + (Heap.s(234L, 32) * 4L)) & 4294967295L;
        v[344] = m.load(v[343], 4);
        v[345] = (v[81] + (Heap.s(250L, 32) * 4L)) & 4294967295L;
        v[346] = m.load(v[345], 4);
        v[347] = ((v[346] - v[344])) & 4294967295L;
        m.store(v[345], v[347], 4);
        v[348] = (v[81] + (Heap.s(226L, 32) * 4L)) & 4294967295L;
        v[349] = m.load(v[348], 4);
        v[350] = (v[81] + (Heap.s(242L, 32) * 4L)) & 4294967295L;
        v[351] = m.load(v[350], 4);
        v[352] = ((v[351] - v[349])) & 4294967295L;
        m.store(v[350], v[352], 4);
        v[353] = (v[81] + (Heap.s(233L, 32) * 4L)) & 4294967295L;
        v[354] = m.load(v[353], 4);
        v[355] = (v[81] + (Heap.s(249L, 32) * 4L)) & 4294967295L;
        v[356] = m.load(v[355], 4);
        v[357] = ((v[356] - v[354])) & 4294967295L;
        m.store(v[355], v[357], 4);
        v[358] = (v[81] + (Heap.s(218L, 32) * 4L)) & 4294967295L;
        v[359] = m.load(v[358], 4);
        v[360] = (v[81] + (Heap.s(234L, 32) * 4L)) & 4294967295L;
        v[361] = ((v[344] - v[359])) & 4294967295L;
        m.store(v[360], v[361], 4);
        v[362] = (v[81] + (Heap.s(210L, 32) * 4L)) & 4294967295L;
        v[363] = m.load(v[362], 4);
        v[364] = (v[81] + (Heap.s(226L, 32) * 4L)) & 4294967295L;
        v[365] = ((v[349] - v[363])) & 4294967295L;
        m.store(v[364], v[365], 4);
        v[366] = (v[81] + (Heap.s(217L, 32) * 4L)) & 4294967295L;
        v[367] = m.load(v[366], 4);
        v[368] = (v[81] + (Heap.s(233L, 32) * 4L)) & 4294967295L;
        v[369] = ((v[354] - v[367])) & 4294967295L;
        m.store(v[368], v[369], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi370 = (previous == 13 ? 53L : 202L);
        long phi371 = (previous == 13 ? 117L : 218L);
        long phi372 = (previous == 13 ? v[215] : v[359]);
        long phi373 = (previous == 13 ? 49L : 194L);
        long phi374 = (previous == 13 ? 113L : 210L);
        long phi375 = (previous == 13 ? v[219] : v[363]);
        long phi376 = (previous == 13 ? 54L : 201L);
        long phi377 = (previous == 13 ? 118L : 217L);
        long phi378 = (previous == 13 ? v[223] : v[367]);
        v[370] = phi370;
        v[371] = phi371;
        v[372] = phi372;
        v[373] = phi373;
        v[374] = phi374;
        v[375] = phi375;
        v[376] = phi376;
        v[377] = phi377;
        v[378] = phi378;
        v[379] = (v[81] + (Heap.s(v[370], 32) * 4L)) & 4294967295L;
        v[380] = m.load(v[379], 4);
        v[381] = (v[81] + (Heap.s(v[371], 32) * 4L)) & 4294967295L;
        v[382] = ((v[372] - v[380])) & 4294967295L;
        m.store(v[381], v[382], 4);
        v[383] = (v[81] + (Heap.s(v[373], 32) * 4L)) & 4294967295L;
        v[384] = m.load(v[383], 4);
        v[385] = (v[81] + (Heap.s(v[374], 32) * 4L)) & 4294967295L;
        v[386] = ((v[375] - v[384])) & 4294967295L;
        m.store(v[385], v[386], 4);
        v[387] = (v[81] + (Heap.s(v[376], 32) * 4L)) & 4294967295L;
        v[388] = m.load(v[387], 4);
        v[389] = (v[81] + (Heap.s(v[377], 32) * 4L)) & 4294967295L;
        v[390] = ((v[378] - v[388])) & 4294967295L;
        m.store(v[389], v[390], 4);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[391] = ((v[19] + 1L)) & 4294967295L;
        v[392] = v[391] == v[7] ? 1L : 0L;
        return v[392] != 0 ? 17 : 3;
    }

    private static int b17(Heap m, long[] v, int previous) {
        switch ((int) v[2]) {
            case 1:
                return 19;
            case 2:
                return 18;
            default:
                return 48;
        }
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[393] = v[13] == 1L ? 1L : 0L;
        return 32;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi394 = (previous == 31 ? v[480] : v[2]);
        v[394] = phi394;
        v[395] = (v[11] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[394], 32) * 64L)) & 4294967295L;
        switch ((int) v[13]) {
            case 1:
                return 20;
            case 0:
                return 21;
            case 2:
                return 22;
            default:
                return 24;
        }
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[396] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[394], 32) * 4L)) & 4294967295L;
        v[397] = m.load(v[396], 4);
        v[398] = (v[397] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[399] = m.load(v[398], 4);
        return 23;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[400] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[394], 32) * 4L)) & 4294967295L;
        v[401] = m.load(v[400], 4);
        v[402] = (v[401] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[403] = (v[402] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[404] = m.load(v[403], 4);
        return 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[405] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[394], 32) * 4L)) & 4294967295L;
        v[406] = m.load(v[405], 4);
        v[407] = (v[406] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[408] = (v[407] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[409] = m.load(v[408], 4);
        v[410] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[394], 32) * 4L)) & 4294967295L;
        v[411] = m.load(v[410], 4);
        v[412] = (v[411] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[413] = m.load(v[412], 4);
        v[414] = ((v[409] + 1L)) & 4294967295L;
        v[415] = ((v[414] + v[413])) & 4294967295L;
        v[416] = ((Heap.s(v[415], 32) >> 1L)) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi417 = (previous == 21 ? v[404] : (previous == 22 ? v[416] : v[399]));
        v[417] = phi417;
        v[418] = m.load(v[395], 4);
        v[419] = ((v[418] - v[417])) & 4294967295L;
        m.store(v[395], v[419], 4);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        switch ((int) v[14]) {
            case 4:
                return 25;
            case 0:
                return 26;
            default:
                return 28;
        }
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[420] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[394], 32) * 4L)) & 4294967295L;
        v[421] = m.load(v[420], 4);
        v[422] = (v[421] + (Heap.s(v[10], 32) * 40L) + 36L) & 4294967295L;
        v[423] = m.load(v[422], 4);
        v[424] = (v[423] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 27;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[425] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[394], 32) * 4L)) & 4294967295L;
        v[426] = m.load(v[425], 4);
        v[427] = (v[426] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[428] = (v[427] + (Heap.s(4294967295L, 32) * 40L) + 36L) & 4294967295L;
        v[429] = m.load(v[428], 4);
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi430 = (previous == 25 ? v[424] : v[429]);
        long phi431 = (previous == 25 ? 2L : 1L);
        v[430] = phi430;
        v[431] = phi431;
        v[432] = m.load(v[430], 4);
        v[433] = (v[395] + (Heap.s(v[431], 32) * 4L)) & 4294967295L;
        v[434] = m.load(v[433], 4);
        v[435] = ((v[434] - v[432])) & 4294967295L;
        m.store(v[433], v[435], 4);
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[436] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[394], 32) * 4L)) & 4294967295L;
        v[437] = m.load(v[436], 4);
        switch ((int) v[15]) {
            case 1:
                return 29;
            case 0:
                return 30;
            default:
                return 31;
        }
    }

    private static int b29(Heap m, long[] v, int previous) {
        return 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi438 = (previous == 29 ? 10L : 5L);
        long phi439 = (previous == 29 ? 26L : 37L);
        long phi440 = (previous == 29 ? 2L : 1L);
        long phi441 = (previous == 29 ? 18L : 33L);
        long phi442 = (previous == 29 ? 9L : 6L);
        long phi443 = (previous == 29 ? 25L : 38L);
        long phi444 = (previous == 29 ? 42L : 21L);
        long phi445 = (previous == 29 ? 58L : 53L);
        long phi446 = (previous == 29 ? 34L : 17L);
        long phi447 = (previous == 29 ? 50L : 49L);
        long phi448 = (previous == 29 ? 41L : 22L);
        long phi449 = (previous == 29 ? 57L : 54L);
        v[438] = phi438;
        v[439] = phi439;
        v[440] = phi440;
        v[441] = phi441;
        v[442] = phi442;
        v[443] = phi443;
        v[444] = phi444;
        v[445] = phi445;
        v[446] = phi446;
        v[447] = phi447;
        v[448] = phi448;
        v[449] = phi449;
        v[450] = (v[437] + (Heap.s(v[438], 32) * 4L)) & 4294967295L;
        v[451] = m.load(v[450], 4);
        v[452] = (v[437] + (Heap.s(v[439], 32) * 4L)) & 4294967295L;
        v[453] = m.load(v[452], 4);
        v[454] = ((v[453] - v[451])) & 4294967295L;
        m.store(v[452], v[454], 4);
        v[455] = (v[437] + (Heap.s(v[440], 32) * 4L)) & 4294967295L;
        v[456] = m.load(v[455], 4);
        v[457] = (v[437] + (Heap.s(v[441], 32) * 4L)) & 4294967295L;
        v[458] = m.load(v[457], 4);
        v[459] = ((v[458] - v[456])) & 4294967295L;
        m.store(v[457], v[459], 4);
        v[460] = (v[437] + (Heap.s(v[442], 32) * 4L)) & 4294967295L;
        v[461] = m.load(v[460], 4);
        v[462] = (v[437] + (Heap.s(v[443], 32) * 4L)) & 4294967295L;
        v[463] = m.load(v[462], 4);
        v[464] = ((v[463] - v[461])) & 4294967295L;
        m.store(v[462], v[464], 4);
        v[465] = (v[437] + (Heap.s(v[444], 32) * 4L)) & 4294967295L;
        v[466] = m.load(v[465], 4);
        v[467] = (v[437] + (Heap.s(v[445], 32) * 4L)) & 4294967295L;
        v[468] = m.load(v[467], 4);
        v[469] = ((v[468] - v[466])) & 4294967295L;
        m.store(v[467], v[469], 4);
        v[470] = (v[437] + (Heap.s(v[446], 32) * 4L)) & 4294967295L;
        v[471] = m.load(v[470], 4);
        v[472] = (v[437] + (Heap.s(v[447], 32) * 4L)) & 4294967295L;
        v[473] = m.load(v[472], 4);
        v[474] = ((v[473] - v[471])) & 4294967295L;
        m.store(v[472], v[474], 4);
        v[475] = (v[437] + (Heap.s(v[448], 32) * 4L)) & 4294967295L;
        v[476] = m.load(v[475], 4);
        v[477] = (v[437] + (Heap.s(v[449], 32) * 4L)) & 4294967295L;
        v[478] = m.load(v[477], 4);
        v[479] = ((v[478] - v[476])) & 4294967295L;
        m.store(v[477], v[479], 4);
        return 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[480] = ((v[394] + 1L)) & 4294967295L;
        v[481] = v[480] == 3L ? 1L : 0L;
        return v[481] != 0 ? 48 : 19;
    }

    private static int b32(Heap m, long[] v, int previous) {
        long phi482 = (previous == 18 ? 1L : v[688]);
        v[482] = phi482;
        v[483] = (v[11] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[482], 32) * 64L)) & 4294967295L;
        return v[393] != 0 ? 33 : 34;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[484] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[482], 32) * 4L)) & 4294967295L;
        v[485] = m.load(v[484], 4);
        v[486] = (v[485] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[487] = m.load(v[486], 4);
        return 37;
    }

    private static int b34(Heap m, long[] v, int previous) {
        switch ((int) v[13]) {
            case 0:
                return 35;
            case 2:
                return 36;
            default:
                return 38;
        }
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[488] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[482], 32) * 4L)) & 4294967295L;
        v[489] = m.load(v[488], 4);
        v[490] = (v[489] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[491] = (v[490] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[492] = m.load(v[491], 4);
        return 37;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[493] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[482], 32) * 4L)) & 4294967295L;
        v[494] = m.load(v[493], 4);
        v[495] = (v[494] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[496] = (v[495] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[497] = m.load(v[496], 4);
        v[498] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[482], 32) * 4L)) & 4294967295L;
        v[499] = m.load(v[498], 4);
        v[500] = (v[499] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[501] = m.load(v[500], 4);
        v[502] = ((v[497] + 1L)) & 4294967295L;
        v[503] = ((v[502] + v[501])) & 4294967295L;
        v[504] = ((Heap.s(v[503], 32) >> 1L)) & 4294967295L;
        return 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        long phi505 = (previous == 35 ? v[492] : (previous == 36 ? v[504] : v[487]));
        v[505] = phi505;
        v[506] = m.load(v[483], 4);
        v[507] = ((v[506] - v[505])) & 4294967295L;
        m.store(v[483], v[507], 4);
        return 38;
    }

    private static int b38(Heap m, long[] v, int previous) {
        switch ((int) v[14]) {
            case 4:
                return 39;
            case 0:
                return 40;
            default:
                return 41;
        }
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[508] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[482], 32) * 4L)) & 4294967295L;
        v[509] = m.load(v[508], 4);
        v[510] = (v[509] + (Heap.s(v[10], 32) * 40L) + 36L) & 4294967295L;
        v[511] = m.load(v[510], 4);
        v[512] = (v[511] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[513] = m.load(v[512], 4);
        v[514] = (v[483] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[515] = m.load(v[514], 4);
        v[516] = ((v[515] - v[513])) & 4294967295L;
        m.store(v[514], v[516], 4);
        v[517] = (v[483] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[518] = m.load(v[517], 4);
        v[519] = (v[483] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[520] = m.load(v[519], 4);
        v[521] = ((v[520] - v[518])) & 4294967295L;
        m.store(v[519], v[521], 4);
        v[522] = (v[511] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        return 43;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[523] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[482], 32) * 4L)) & 4294967295L;
        v[524] = m.load(v[523], 4);
        v[525] = (v[524] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[526] = (v[525] + (Heap.s(4294967295L, 32) * 40L) + 36L) & 4294967295L;
        v[527] = m.load(v[526], 4);
        v[528] = (v[527] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[529] = m.load(v[528], 4);
        v[530] = (v[483] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[531] = m.load(v[530], 4);
        v[532] = ((v[531] - v[529])) & 4294967295L;
        m.store(v[530], v[532], 4);
        v[533] = m.load(v[527], 4);
        v[534] = (v[483] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[535] = m.load(v[534], 4);
        v[536] = ((v[535] - v[533])) & 4294967295L;
        m.store(v[534], v[536], 4);
        v[537] = (v[527] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[538] = (v[483] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[539] = m.load(v[538], 4);
        return 43;
    }

    private static int b41(Heap m, long[] v, int previous) {
        return v[393] != 0 ? 42 : 44;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[540] = (v[483] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[541] = (v[483] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[542] = m.load(v[541], 4);
        return 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        long phi543 = (previous == 40 ? v[537] : (previous == 42 ? v[540] : v[522]));
        long phi544 = (previous == 40 ? v[539] : (previous == 42 ? v[542] : v[518]));
        long phi545 = (previous == 40 ? v[538] : (previous == 42 ? v[541] : v[517]));
        v[543] = phi543;
        v[544] = phi544;
        v[545] = phi545;
        v[546] = m.load(v[543], 4);
        v[547] = ((v[544] - v[546])) & 4294967295L;
        m.store(v[545], v[547], 4);
        return 44;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[548] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[482], 32) * 4L)) & 4294967295L;
        v[549] = m.load(v[548], 4);
        switch ((int) v[15]) {
            case 1:
                return 46;
            case 0:
                return 45;
            default:
                return 47;
        }
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[550] = (v[549] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[551] = m.load(v[550], 4);
        v[552] = (v[549] + (Heap.s(69L, 32) * 4L)) & 4294967295L;
        v[553] = m.load(v[552], 4);
        v[554] = ((v[553] - v[551])) & 4294967295L;
        m.store(v[552], v[554], 4);
        v[555] = (v[549] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[556] = m.load(v[555], 4);
        v[557] = (v[549] + (Heap.s(65L, 32) * 4L)) & 4294967295L;
        v[558] = m.load(v[557], 4);
        v[559] = ((v[558] - v[556])) & 4294967295L;
        m.store(v[557], v[559], 4);
        v[560] = (v[549] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[561] = m.load(v[560], 4);
        v[562] = (v[549] + (Heap.s(70L, 32) * 4L)) & 4294967295L;
        v[563] = m.load(v[562], 4);
        v[564] = ((v[563] - v[561])) & 4294967295L;
        m.store(v[562], v[564], 4);
        v[565] = (v[549] + (Heap.s(21L, 32) * 4L)) & 4294967295L;
        v[566] = m.load(v[565], 4);
        v[567] = (v[549] + (Heap.s(85L, 32) * 4L)) & 4294967295L;
        v[568] = m.load(v[567], 4);
        v[569] = ((v[568] - v[566])) & 4294967295L;
        m.store(v[567], v[569], 4);
        v[570] = (v[549] + (Heap.s(17L, 32) * 4L)) & 4294967295L;
        v[571] = m.load(v[570], 4);
        v[572] = (v[549] + (Heap.s(81L, 32) * 4L)) & 4294967295L;
        v[573] = m.load(v[572], 4);
        v[574] = ((v[573] - v[571])) & 4294967295L;
        m.store(v[572], v[574], 4);
        v[575] = (v[549] + (Heap.s(22L, 32) * 4L)) & 4294967295L;
        v[576] = m.load(v[575], 4);
        v[577] = (v[549] + (Heap.s(86L, 32) * 4L)) & 4294967295L;
        v[578] = m.load(v[577], 4);
        v[579] = ((v[578] - v[576])) & 4294967295L;
        m.store(v[577], v[579], 4);
        v[580] = (v[549] + (Heap.s(37L, 32) * 4L)) & 4294967295L;
        v[581] = m.load(v[580], 4);
        v[582] = (v[549] + (Heap.s(101L, 32) * 4L)) & 4294967295L;
        v[583] = m.load(v[582], 4);
        v[584] = ((v[583] - v[581])) & 4294967295L;
        m.store(v[582], v[584], 4);
        v[585] = (v[549] + (Heap.s(33L, 32) * 4L)) & 4294967295L;
        v[586] = m.load(v[585], 4);
        v[587] = (v[549] + (Heap.s(97L, 32) * 4L)) & 4294967295L;
        v[588] = m.load(v[587], 4);
        v[589] = ((v[588] - v[586])) & 4294967295L;
        m.store(v[587], v[589], 4);
        v[590] = (v[549] + (Heap.s(38L, 32) * 4L)) & 4294967295L;
        v[591] = m.load(v[590], 4);
        v[592] = (v[549] + (Heap.s(102L, 32) * 4L)) & 4294967295L;
        v[593] = m.load(v[592], 4);
        v[594] = ((v[593] - v[591])) & 4294967295L;
        m.store(v[592], v[594], 4);
        v[595] = (v[549] + (Heap.s(53L, 32) * 4L)) & 4294967295L;
        v[596] = m.load(v[595], 4);
        v[597] = (v[549] + (Heap.s(117L, 32) * 4L)) & 4294967295L;
        v[598] = m.load(v[597], 4);
        v[599] = ((v[598] - v[596])) & 4294967295L;
        m.store(v[597], v[599], 4);
        v[600] = (v[549] + (Heap.s(49L, 32) * 4L)) & 4294967295L;
        v[601] = m.load(v[600], 4);
        v[602] = (v[549] + (Heap.s(113L, 32) * 4L)) & 4294967295L;
        v[603] = m.load(v[602], 4);
        v[604] = ((v[603] - v[601])) & 4294967295L;
        m.store(v[602], v[604], 4);
        v[605] = (v[549] + (Heap.s(54L, 32) * 4L)) & 4294967295L;
        v[606] = m.load(v[605], 4);
        v[607] = (v[549] + (Heap.s(118L, 32) * 4L)) & 4294967295L;
        v[608] = m.load(v[607], 4);
        v[609] = ((v[608] - v[606])) & 4294967295L;
        m.store(v[607], v[609], 4);
        return 47;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[610] = (v[549] + (Heap.s(42L, 32) * 4L)) & 4294967295L;
        v[611] = m.load(v[610], 4);
        v[612] = (v[549] + (Heap.s(58L, 32) * 4L)) & 4294967295L;
        v[613] = m.load(v[612], 4);
        v[614] = ((v[613] - v[611])) & 4294967295L;
        m.store(v[612], v[614], 4);
        v[615] = (v[549] + (Heap.s(34L, 32) * 4L)) & 4294967295L;
        v[616] = m.load(v[615], 4);
        v[617] = (v[549] + (Heap.s(50L, 32) * 4L)) & 4294967295L;
        v[618] = m.load(v[617], 4);
        v[619] = ((v[618] - v[616])) & 4294967295L;
        m.store(v[617], v[619], 4);
        v[620] = (v[549] + (Heap.s(41L, 32) * 4L)) & 4294967295L;
        v[621] = m.load(v[620], 4);
        v[622] = (v[549] + (Heap.s(57L, 32) * 4L)) & 4294967295L;
        v[623] = m.load(v[622], 4);
        v[624] = ((v[623] - v[621])) & 4294967295L;
        m.store(v[622], v[624], 4);
        v[625] = (v[549] + (Heap.s(106L, 32) * 4L)) & 4294967295L;
        v[626] = m.load(v[625], 4);
        v[627] = (v[549] + (Heap.s(122L, 32) * 4L)) & 4294967295L;
        v[628] = m.load(v[627], 4);
        v[629] = ((v[628] - v[626])) & 4294967295L;
        m.store(v[627], v[629], 4);
        v[630] = (v[549] + (Heap.s(98L, 32) * 4L)) & 4294967295L;
        v[631] = m.load(v[630], 4);
        v[632] = (v[549] + (Heap.s(114L, 32) * 4L)) & 4294967295L;
        v[633] = m.load(v[632], 4);
        v[634] = ((v[633] - v[631])) & 4294967295L;
        m.store(v[632], v[634], 4);
        v[635] = (v[549] + (Heap.s(105L, 32) * 4L)) & 4294967295L;
        v[636] = m.load(v[635], 4);
        v[637] = (v[549] + (Heap.s(121L, 32) * 4L)) & 4294967295L;
        v[638] = m.load(v[637], 4);
        v[639] = ((v[638] - v[636])) & 4294967295L;
        m.store(v[637], v[639], 4);
        v[640] = (v[549] + (Heap.s(26L, 32) * 4L)) & 4294967295L;
        v[641] = m.load(v[640], 4);
        v[642] = (v[549] + (Heap.s(42L, 32) * 4L)) & 4294967295L;
        v[643] = ((v[611] - v[641])) & 4294967295L;
        m.store(v[642], v[643], 4);
        v[644] = (v[549] + (Heap.s(18L, 32) * 4L)) & 4294967295L;
        v[645] = m.load(v[644], 4);
        v[646] = (v[549] + (Heap.s(34L, 32) * 4L)) & 4294967295L;
        v[647] = ((v[616] - v[645])) & 4294967295L;
        m.store(v[646], v[647], 4);
        v[648] = (v[549] + (Heap.s(25L, 32) * 4L)) & 4294967295L;
        v[649] = m.load(v[648], 4);
        v[650] = (v[549] + (Heap.s(41L, 32) * 4L)) & 4294967295L;
        v[651] = ((v[621] - v[649])) & 4294967295L;
        m.store(v[650], v[651], 4);
        v[652] = (v[549] + (Heap.s(90L, 32) * 4L)) & 4294967295L;
        v[653] = m.load(v[652], 4);
        v[654] = (v[549] + (Heap.s(106L, 32) * 4L)) & 4294967295L;
        v[655] = ((v[626] - v[653])) & 4294967295L;
        m.store(v[654], v[655], 4);
        v[656] = (v[549] + (Heap.s(82L, 32) * 4L)) & 4294967295L;
        v[657] = m.load(v[656], 4);
        v[658] = (v[549] + (Heap.s(98L, 32) * 4L)) & 4294967295L;
        v[659] = ((v[631] - v[657])) & 4294967295L;
        m.store(v[658], v[659], 4);
        v[660] = (v[549] + (Heap.s(89L, 32) * 4L)) & 4294967295L;
        v[661] = m.load(v[660], 4);
        v[662] = (v[549] + (Heap.s(105L, 32) * 4L)) & 4294967295L;
        v[663] = ((v[636] - v[661])) & 4294967295L;
        m.store(v[662], v[663], 4);
        v[664] = (v[549] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[665] = m.load(v[664], 4);
        v[666] = (v[549] + (Heap.s(26L, 32) * 4L)) & 4294967295L;
        v[667] = ((v[641] - v[665])) & 4294967295L;
        m.store(v[666], v[667], 4);
        v[668] = (v[549] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[669] = m.load(v[668], 4);
        v[670] = (v[549] + (Heap.s(18L, 32) * 4L)) & 4294967295L;
        v[671] = ((v[645] - v[669])) & 4294967295L;
        m.store(v[670], v[671], 4);
        v[672] = (v[549] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[673] = m.load(v[672], 4);
        v[674] = (v[549] + (Heap.s(25L, 32) * 4L)) & 4294967295L;
        v[675] = ((v[649] - v[673])) & 4294967295L;
        m.store(v[674], v[675], 4);
        v[676] = (v[549] + (Heap.s(74L, 32) * 4L)) & 4294967295L;
        v[677] = m.load(v[676], 4);
        v[678] = (v[549] + (Heap.s(90L, 32) * 4L)) & 4294967295L;
        v[679] = ((v[653] - v[677])) & 4294967295L;
        m.store(v[678], v[679], 4);
        v[680] = (v[549] + (Heap.s(66L, 32) * 4L)) & 4294967295L;
        v[681] = m.load(v[680], 4);
        v[682] = (v[549] + (Heap.s(82L, 32) * 4L)) & 4294967295L;
        v[683] = ((v[657] - v[681])) & 4294967295L;
        m.store(v[682], v[683], 4);
        v[684] = (v[549] + (Heap.s(73L, 32) * 4L)) & 4294967295L;
        v[685] = m.load(v[684], 4);
        v[686] = (v[549] + (Heap.s(89L, 32) * 4L)) & 4294967295L;
        v[687] = ((v[661] - v[685])) & 4294967295L;
        m.store(v[686], v[687], 4);
        return 47;
    }

    private static int b47(Heap m, long[] v, int previous) {
        v[688] = ((v[482] + 1L)) & 4294967295L;
        v[689] = v[688] == 3L ? 1L : 0L;
        return v[689] != 0 ? 48 : 32;
    }

    private static int b48(Heap m, long[] v, int previous) {
        return -1;
    }
}
