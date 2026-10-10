package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: predDCACDec.
 */
public final class F0476_predDCACDec {

    private F0476_predDCACDec() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[304];
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
                    case 49:
                        pc = b49(m, v, previous);
                        break;
                    case 50:
                        pc = b50(m, v, previous);
                        break;
                    case 51:
                        pc = b51(m, v, previous);
                        break;
                    case 52:
                        pc = b52(m, v, previous);
                        break;
                    case 53:
                        pc = b53(m, v, previous);
                        break;
                    case 54:
                        pc = b54(m, v, previous);
                        break;
                    case 55:
                        pc = b55(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in predDCACDec");
                }
                previous = old;
                if (pc < 0) {
                    return v[303];
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
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L) & 4294967295L;
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = F0469_getDCACPredMode.run(m, v[0], v[10]);
        v[12] = ((v[11] & 3L)) & 4294967295L;
        v[13] = ((v[11] & 12L)) & 4294967295L;
        v[14] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[14] != 0 ? 3 : 13;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi15 = (previous == 12 ? v[77] : 0L);
        v[15] = phi15;
        v[16] = (v[8] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[15], 32) * 64L)) & 4294967295L;
        switch ((int) v[12]) {
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
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[18] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[20] = m.load(v[16], 4);
        return 7;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[22] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[24] = (v[23] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[25] = m.load(v[16], 4);
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = (v[27] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[29] = (v[28] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = (v[32] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = ((v[34] + v[30])) & 4294967295L;
        v[36] = ((Heap.s(v[35], 32) >> 1L)) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi37 = (previous == 5 ? v[24] : (previous == 6 ? v[16] : v[19]));
        long phi38 = (previous == 5 ? v[25] : (previous == 6 ? v[36] : v[20]));
        v[37] = phi37;
        v[38] = phi38;
        v[39] = m.load(v[37], 4);
        v[40] = ((v[38] + v[39])) & 4294967295L;
        m.store(v[16], v[40], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        switch ((int) v[13]) {
            case 4:
                return 9;
            case 0:
                return 10;
            default:
                return 12;
        }
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[41] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = (v[42] + (Heap.s(v[10], 32) * 40L) + 36L) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = (v[44] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = (v[16] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[48] = m.load(v[47], 4);
        v[49] = ((v[48] + v[46])) & 4294967295L;
        m.store(v[47], v[49], 4);
        v[50] = (v[44] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = (v[16] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = ((v[53] + v[51])) & 4294967295L;
        m.store(v[52], v[54], 4);
        v[55] = (v[44] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        return 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[56] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[57] = m.load(v[56], 4);
        v[58] = (v[57] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[59] = (v[58] + (Heap.s(4294967295L, 32) * 40L) + 36L) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = m.load(v[60], 4);
        v[62] = (v[16] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = ((v[63] + v[61])) & 4294967295L;
        m.store(v[62], v[64], 4);
        v[65] = (v[60] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = (v[16] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[68] = m.load(v[67], 4);
        v[69] = ((v[68] + v[66])) & 4294967295L;
        m.store(v[67], v[69], 4);
        v[70] = (v[60] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi71 = (previous == 10 ? v[70] : v[55]);
        long phi72 = (previous == 10 ? 3L : 12L);
        v[71] = phi71;
        v[72] = phi72;
        v[73] = m.load(v[71], 4);
        v[74] = (v[16] + (Heap.s(v[72], 32) * 4L)) & 4294967295L;
        v[75] = m.load(v[74], 4);
        v[76] = ((v[75] + v[73])) & 4294967295L;
        m.store(v[74], v[76], 4);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[77] = ((v[15] + 1L)) & 4294967295L;
        v[78] = v[77] == v[7] ? 1L : 0L;
        return v[78] != 0 ? 13 : 3;
    }

    private static int b13(Heap m, long[] v, int previous) {
        switch ((int) v[2]) {
            case 1:
                return 14;
            case 2:
                return 15;
            default:
                return 55;
        }
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[79] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L)) & 4294967295L;
        switch ((int) v[12]) {
            case 1:
                return 16;
            case 0:
                return 17;
            case 2:
                return 18;
            default:
                return 20;
        }
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[80] = v[12] == 1L ? 1L : 0L;
        v[81] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L)) & 4294967295L;
        return v[80] != 0 ? 32 : 33;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[82] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = (v[83] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[85] = m.load(v[79], 4);
        return 19;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[86] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[87] = m.load(v[86], 4);
        v[88] = (v[87] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[89] = (v[88] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[90] = m.load(v[79], 4);
        return 19;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[91] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[92] = m.load(v[91], 4);
        v[93] = (v[92] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[94] = (v[93] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = (v[97] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[99] = m.load(v[98], 4);
        v[100] = ((v[95] + 1L)) & 4294967295L;
        v[101] = ((v[100] + v[99])) & 4294967295L;
        v[102] = ((Heap.s(v[101], 32) >> 1L)) & 4294967295L;
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi103 = (previous == 17 ? v[89] : (previous == 18 ? v[79] : v[84]));
        long phi104 = (previous == 17 ? v[90] : (previous == 18 ? v[102] : v[85]));
        v[103] = phi103;
        v[104] = phi104;
        v[105] = m.load(v[103], 4);
        v[106] = ((v[104] + v[105])) & 4294967295L;
        m.store(v[79], v[106], 4);
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        switch ((int) v[13]) {
            case 4:
                return 21;
            case 0:
                return 22;
            default:
                return 24;
        }
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[107] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[108] = m.load(v[107], 4);
        v[109] = (v[108] + (Heap.s(v[10], 32) * 40L) + 36L) & 4294967295L;
        v[110] = m.load(v[109], 4);
        v[111] = (v[110] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[112] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        return 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[113] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[114] = m.load(v[113], 4);
        v[115] = (v[114] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[116] = (v[115] + (Heap.s(4294967295L, 32) * 40L) + 36L) & 4294967295L;
        v[117] = m.load(v[116], 4);
        v[118] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi119 = (previous == 21 ? v[112] : v[118]);
        long phi120 = (previous == 21 ? v[111] : v[117]);
        v[119] = phi119;
        v[120] = phi120;
        v[121] = m.load(v[120], 4);
        v[122] = m.load(v[119], 4);
        v[123] = ((v[122] + v[121])) & 4294967295L;
        m.store(v[119], v[123], 4);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[124] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L)) & 4294967295L;
        switch ((int) v[12]) {
            case 1:
                return 27;
            case 0:
                return 26;
            case 2:
                return 25;
            default:
                return 29;
        }
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[125] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[126] = m.load(v[125], 4);
        v[127] = (v[126] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[128] = (v[127] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[129] = m.load(v[128], 4);
        v[130] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[131] = m.load(v[130], 4);
        v[132] = (v[131] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[133] = m.load(v[132], 4);
        v[134] = ((v[129] + 1L)) & 4294967295L;
        v[135] = ((v[134] + v[133])) & 4294967295L;
        v[136] = ((Heap.s(v[135], 32) >> 1L)) & 4294967295L;
        return 28;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[137] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[138] = m.load(v[137], 4);
        v[139] = (v[138] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[140] = (v[139] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[141] = m.load(v[124], 4);
        return 28;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[142] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[143] = m.load(v[142], 4);
        v[144] = (v[143] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[145] = m.load(v[124], 4);
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi146 = (previous == 27 ? v[144] : (previous == 26 ? v[140] : v[124]));
        long phi147 = (previous == 27 ? v[145] : (previous == 26 ? v[141] : v[136]));
        v[146] = phi146;
        v[147] = phi147;
        v[148] = m.load(v[146], 4);
        v[149] = ((v[147] + v[148])) & 4294967295L;
        m.store(v[124], v[149], 4);
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        switch ((int) v[13]) {
            case 4:
                return 31;
            case 0:
                return 30;
            default:
                return 55;
        }
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[150] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[151] = m.load(v[150], 4);
        v[152] = (v[151] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[153] = (v[152] + (Heap.s(4294967295L, 32) * 40L) + 36L) & 4294967295L;
        v[154] = m.load(v[153], 4);
        v[155] = m.load(v[154], 4);
        v[156] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 54;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[157] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[158] = m.load(v[157], 4);
        v[159] = (v[158] + (Heap.s(v[10], 32) * 40L) + 36L) & 4294967295L;
        v[160] = m.load(v[159], 4);
        v[161] = (v[160] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[162] = m.load(v[161], 4);
        v[163] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        return 54;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[164] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[165] = m.load(v[164], 4);
        v[166] = (v[165] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[167] = m.load(v[81], 4);
        return 36;
    }

    private static int b33(Heap m, long[] v, int previous) {
        switch ((int) v[12]) {
            case 0:
                return 34;
            case 2:
                return 35;
            default:
                return 37;
        }
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[168] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[169] = m.load(v[168], 4);
        v[170] = (v[169] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[171] = (v[170] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[172] = m.load(v[81], 4);
        return 36;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[173] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[174] = m.load(v[173], 4);
        v[175] = (v[174] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[176] = (v[175] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[177] = m.load(v[176], 4);
        v[178] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[179] = m.load(v[178], 4);
        v[180] = (v[179] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[181] = m.load(v[180], 4);
        v[182] = ((v[177] + 1L)) & 4294967295L;
        v[183] = ((v[182] + v[181])) & 4294967295L;
        v[184] = ((Heap.s(v[183], 32) >> 1L)) & 4294967295L;
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        long phi185 = (previous == 34 ? v[171] : (previous == 35 ? v[81] : v[166]));
        long phi186 = (previous == 34 ? v[172] : (previous == 35 ? v[184] : v[167]));
        v[185] = phi185;
        v[186] = phi186;
        v[187] = m.load(v[185], 4);
        v[188] = ((v[186] + v[187])) & 4294967295L;
        m.store(v[81], v[188], 4);
        return 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        switch ((int) v[13]) {
            case 4:
                return 38;
            case 0:
                return 39;
            default:
                return 40;
        }
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[189] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[190] = m.load(v[189], 4);
        v[191] = (v[190] + (Heap.s(v[10], 32) * 40L) + 36L) & 4294967295L;
        v[192] = m.load(v[191], 4);
        v[193] = (v[192] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[194] = m.load(v[193], 4);
        v[195] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[196] = m.load(v[195], 4);
        v[197] = ((v[196] + v[194])) & 4294967295L;
        m.store(v[195], v[197], 4);
        v[198] = (v[192] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[199] = m.load(v[198], 4);
        v[200] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[201] = m.load(v[200], 4);
        v[202] = ((v[201] + v[199])) & 4294967295L;
        m.store(v[200], v[202], 4);
        v[203] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        return 43;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[204] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[205] = m.load(v[204], 4);
        v[206] = (v[205] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[207] = (v[206] + (Heap.s(4294967295L, 32) * 40L) + 36L) & 4294967295L;
        v[208] = m.load(v[207], 4);
        v[209] = (v[208] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[210] = m.load(v[209], 4);
        v[211] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[212] = m.load(v[211], 4);
        v[213] = ((v[212] + v[210])) & 4294967295L;
        m.store(v[211], v[213], 4);
        v[214] = m.load(v[208], 4);
        v[215] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[216] = m.load(v[215], 4);
        v[217] = ((v[216] + v[214])) & 4294967295L;
        m.store(v[215], v[217], 4);
        v[218] = (v[208] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[219] = m.load(v[218], 4);
        v[220] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        return 43;
    }

    private static int b40(Heap m, long[] v, int previous) {
        return v[80] != 0 ? 42 : 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[221] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L)) & 4294967295L;
        return 44;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[222] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[223] = m.load(v[222], 4);
        v[224] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[225] = m.load(v[224], 4);
        v[226] = ((v[225] + v[223])) & 4294967295L;
        m.store(v[224], v[226], 4);
        v[227] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L)) & 4294967295L;
        return 47;
    }

    private static int b43(Heap m, long[] v, int previous) {
        long phi228 = (previous == 38 ? v[203] : v[220]);
        long phi229 = (previous == 38 ? v[202] : v[219]);
        v[228] = phi228;
        v[229] = phi229;
        v[230] = m.load(v[228], 4);
        v[231] = ((v[230] + v[229])) & 4294967295L;
        m.store(v[228], v[231], 4);
        v[232] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L)) & 4294967295L;
        return v[80] != 0 ? 47 : 44;
    }

    private static int b44(Heap m, long[] v, int previous) {
        long phi233 = (previous == 41 ? v[221] : v[232]);
        v[233] = phi233;
        switch ((int) v[12]) {
            case 0:
                return 46;
            case 2:
                return 45;
            default:
                return 49;
        }
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[234] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[235] = m.load(v[234], 4);
        v[236] = (v[235] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[237] = (v[236] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[238] = m.load(v[237], 4);
        v[239] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[240] = m.load(v[239], 4);
        v[241] = (v[240] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[242] = m.load(v[241], 4);
        v[243] = ((v[238] + 1L)) & 4294967295L;
        v[244] = ((v[243] + v[242])) & 4294967295L;
        v[245] = ((Heap.s(v[244], 32) >> 1L)) & 4294967295L;
        return 48;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[246] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[247] = m.load(v[246], 4);
        v[248] = (v[247] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[249] = (v[248] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[250] = m.load(v[233], 4);
        return 48;
    }

    private static int b47(Heap m, long[] v, int previous) {
        long phi251 = (previous == 42 ? v[227] : v[232]);
        v[251] = phi251;
        v[252] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[253] = m.load(v[252], 4);
        v[254] = (v[253] + (Heap.s(v[10], 32) * 40L) + 8L) & 4294967295L;
        v[255] = m.load(v[251], 4);
        return 48;
    }

    private static int b48(Heap m, long[] v, int previous) {
        long phi256 = (previous == 47 ? v[254] : (previous == 46 ? v[249] : v[233]));
        long phi257 = (previous == 47 ? v[255] : (previous == 46 ? v[250] : v[245]));
        long phi258 = (previous == 47 ? v[251] : (previous == 46 ? v[233] : v[233]));
        v[256] = phi256;
        v[257] = phi257;
        v[258] = phi258;
        v[259] = m.load(v[256], 4);
        v[260] = ((v[257] + v[259])) & 4294967295L;
        m.store(v[258], v[260], 4);
        return 49;
    }

    private static int b49(Heap m, long[] v, int previous) {
        switch ((int) v[13]) {
            case 4:
                return 51;
            case 0:
                return 50;
            default:
                return 52;
        }
    }

    private static int b50(Heap m, long[] v, int previous) {
        v[261] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[262] = m.load(v[261], 4);
        v[263] = (v[262] + (Heap.s(v[10], 32) * 40L)) & 4294967295L;
        v[264] = (v[263] + (Heap.s(4294967295L, 32) * 40L) + 36L) & 4294967295L;
        v[265] = m.load(v[264], 4);
        v[266] = (v[265] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[267] = m.load(v[266], 4);
        v[268] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[269] = m.load(v[268], 4);
        v[270] = ((v[269] + v[267])) & 4294967295L;
        m.store(v[268], v[270], 4);
        v[271] = m.load(v[265], 4);
        v[272] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[273] = m.load(v[272], 4);
        v[274] = ((v[273] + v[271])) & 4294967295L;
        m.store(v[272], v[274], 4);
        v[275] = (v[265] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[276] = m.load(v[275], 4);
        v[277] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        return 54;
    }

    private static int b51(Heap m, long[] v, int previous) {
        v[278] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[279] = m.load(v[278], 4);
        v[280] = (v[279] + (Heap.s(v[10], 32) * 40L) + 36L) & 4294967295L;
        v[281] = m.load(v[280], 4);
        v[282] = (v[281] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[283] = m.load(v[282], 4);
        v[284] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[285] = m.load(v[284], 4);
        v[286] = ((v[285] + v[283])) & 4294967295L;
        m.store(v[284], v[286], 4);
        v[287] = (v[281] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[288] = m.load(v[287], 4);
        v[289] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[290] = m.load(v[289], 4);
        v[291] = ((v[290] + v[288])) & 4294967295L;
        m.store(v[289], v[291], 4);
        v[292] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        return 54;
    }

    private static int b52(Heap m, long[] v, int previous) {
        return v[80] != 0 ? 53 : 55;
    }

    private static int b53(Heap m, long[] v, int previous) {
        v[293] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[294] = m.load(v[293], 4);
        v[295] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        return 54;
    }

    private static int b54(Heap m, long[] v, int previous) {
        long phi296 = (previous == 50 ? v[277] : (previous == 51 ? v[292] : (previous == 53 ? v[295] : (previous == 30 ? v[156] : v[163]))));
        long phi297 = (previous == 50 ? v[276] : (previous == 51 ? v[291] : (previous == 53 ? v[294] : (previous == 30 ? v[155] : v[162]))));
        v[296] = phi296;
        v[297] = phi297;
        v[298] = m.load(v[296], 4);
        v[299] = ((v[298] + v[297])) & 4294967295L;
        m.store(v[296], v[299], 4);
        return 55;
    }

    private static int b55(Heap m, long[] v, int previous) {
        v[300] = F0468_getACPredMode.run(m, v[8], v[2]);
        v[301] = ((2L - v[300])) & 4294967295L;
        v[302] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1024L) & 4294967295L;
        m.store(v[302], v[301], 4);
        return -1;
    }
}
