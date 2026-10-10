package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: initLookupTables.
 */
public final class F0393_initLookupTables {

    private F0393_initLookupTables() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[167];
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
                    default:
                        throw new IllegalStateException("Invalid block in initLookupTables");
                }
                previous = old;
                if (pc < 0) {
                    return v[166];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[2] + (Heap.s(0L, 32) * 48L) + 12L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = v[4] > 1L ? 1L : 0L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 52L) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 56L) & 4294967295L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 4L) & 4294967295L;
        v[10] = v[5] != 0 ? v[6] : v[8];
        v[11] = v[5] != 0 ? v[7] : v[9];
        v[12] = m.load(v[11], 4);
        v[13] = m.load(v[10], 4);
        v[14] = (v[2] + (Heap.s(0L, 32) * 48L) + 24L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = ((v[4] + 4294967295L)) & 4294967295L;
        v[17] = ((v[16] + v[15])) & 4294967295L;
        v[18] = ((v[17] / v[4])) & 4294967295L;
        v[19] = ((v[18] + v[13])) & 4294967295L;
        v[20] = (v[2] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((v[16] + v[21])) & 4294967295L;
        v[23] = ((v[22] / v[4])) & 4294967295L;
        v[24] = ((v[23] + v[12])) & 4294967295L;
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 12L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        switch ((int) v[26]) {
            case 2:
                return 1;
            case 3:
                return 1;
            case 8:
                return 1;
            case 10:
                return 1;
            case 4:
                return 1;
            case 5:
                return 2;
            case 6:
                return 2;
            case 7:
                return 2;
            case 9:
                return 2;
            default:
                return 3;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[27] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 8L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[28] >>> 1L)) & 4294967295L;
        return 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 8L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = ((v[31] >>> 2L)) & 4294967295L;
        return 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[33] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 8L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi35 = (previous == 3 ? v[34] : (previous == 2 ? v[32] : v[29]));
        v[35] = phi35;
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        switch ((int) v[37]) {
            case 1:
                return 5;
            case 2:
                return 6;
            default:
                return 7;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[38] = ((v[19] >>> 1L)) & 4294967295L;
        v[39] = ((v[24] >>> 1L)) & 4294967295L;
        return 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[40] = ((v[19] >>> 1L)) & 4294967295L;
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[41] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 16L) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = ((v[42] >>> 3L)) & 4294967295L;
        v[44] = (12208L + (Heap.s(0L, 32) * 11L) + (Heap.s(v[26], 32) * 1L)) & 4294967295L;
        v[45] = m.load(v[44], 1);
        v[46] = (v[45]) & 4294967295L;
        v[47] = ((v[43] / v[46])) & 4294967295L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi48 = (previous == 7 ? v[47] : (previous == 6 ? 4L : 6L));
        long phi49 = (previous == 7 ? v[19] : (previous == 6 ? v[40] : v[38]));
        long phi50 = (previous == 7 ? v[24] : (previous == 6 ? v[24] : v[39]));
        v[48] = phi48;
        v[49] = phi49;
        v[50] = phi50;
        switch ((int) v[26]) {
            case 0:
                return 9;
            case 8:
                return 9;
            case 9:
                return 9;
            case 10:
                return 9;
            default:
                return 10;
        }
    }

    private static int b9(Heap m, long[] v, int previous) {
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi51 = (previous == 9 ? 1L : v[48]);
        v[51] = phi51;
        v[52] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 60L) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = v[53] > 3L ? 1L : 0L;
        v[55] = v[54] != 0 ? v[35] : v[51];
        v[56] = v[54] != 0 ? v[51] : v[35];
        v[57] = ((v[49] << 2L)) & 4294967295L;
        v[58] = LibC.call(m, "malloc", new long[]{v[57]});
        v[59] = m.load(v[1], 4);
        v[60] = (v[59] + (Heap.s(0L, 32) * 48L) + 40L) & 4294967295L;
        m.store(v[60], v[58], 4);
        v[61] = v[58] == 0L ? 1L : 0L;
        v[62] = v[57] < v[49] ? 1L : 0L;
        v[63] = v[61] != 0 ? 1L : v[62];
        return v[63] != 0 ? 30 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[64] = m.load(v[52], 4);
        v[65] = v[64] < 8L ? 1L : 0L;
        v[66] = (v[64]) & 255L;
        v[67] = ((172L >>> v[66])) & 255L;
        v[68] = ((v[67] & 1L)) & 255L;
        v[69] = v[68] != 0L ? 1L : 0L;
        v[70] = v[65] != 0 ? v[69] : 0L;
        v[71] = m.load(v[59], 4);
        v[72] = v[71] == 0L ? 1L : 0L;
        return v[72] != 0 ? 12 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[73] = (v[59] + (Heap.s(0L, 32) * 48L) + 24L) & 4294967295L;
        v[74] = m.load(v[73], 4);
        v[75] = (v[59] + (Heap.s(0L, 32) * 48L) + 12L) & 4294967295L;
        v[76] = m.load(v[75], 4);
        v[77] = ((v[74] + 4294967295L)) & 4294967295L;
        v[78] = ((v[77] + v[76])) & 4294967295L;
        v[79] = ((v[78] / v[76])) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi80 = (previous == 11 ? 0L : v[79]);
        v[80] = phi80;
        v[81] = v[80] < v[49] ? 1L : 0L;
        return v[81] != 0 ? 14 : 20;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[82] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 20L) & 4294967295L;
        v[83] = (v[59] + (Heap.s(0L, 32) * 48L) + 28L) & 4294967295L;
        v[84] = (v[59] + (Heap.s(0L, 32) * 48L) + 24L) & 4294967295L;
        v[85] = (v[59] + (Heap.s(0L, 32) * 48L) + 12L) & 4294967295L;
        v[86] = ((v[49] - v[80])) & 4294967295L;
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi87 = (previous == 14 ? v[80] : v[111]);
        long phi88 = (previous == 14 ? 0L : v[110]);
        v[87] = phi87;
        v[88] = phi88;
        v[89] = m.load(v[82], 4);
        return v[70] != 0 ? 16 : 19;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[90] = m.load(v[59], 4);
        v[91] = v[90] == 0L ? 1L : 0L;
        return v[91] != 0 ? 17 : 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[92] = m.load(v[83], 4);
        v[93] = m.load(v[84], 4);
        v[94] = ((v[92] - v[93])) & 4294967295L;
        v[95] = m.load(v[85], 4);
        v[96] = ((v[94] + v[95])) & 4294967295L;
        v[97] = ((v[96] / v[95])) & 4294967295L;
        v[98] = m.load(v[36], 4);
        v[99] = ((v[98] + 4294967295L)) & 4294967295L;
        v[100] = v[99] < 2L ? 1L : 0L;
        v[101] = (v[100]) & 4294967295L;
        v[102] = ((v[97] >>> v[101])) & 4294967295L;
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi103 = (previous == 17 ? v[102] : v[49]);
        v[103] = phi103;
        v[104] = ((v[88] ^ 4294967295L)) & 4294967295L;
        v[105] = ((v[103] + v[104])) & 4294967295L;
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi106 = (previous == 18 ? v[105] : v[88]);
        v[106] = phi106;
        v[107] = ((v[106] * v[55])) & 4294967295L;
        v[108] = ((v[107] + v[89])) & 4294967295L;
        v[109] = (v[58] + (Heap.s(v[87], 32) * 4L)) & 4294967295L;
        m.store(v[109], v[108], 4);
        v[110] = ((v[88] + 1L)) & 4294967295L;
        v[111] = ((v[110] + v[80])) & 4294967295L;
        v[112] = v[110] == v[86] ? 1L : 0L;
        return v[112] != 0 ? 20 : 15;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[113] = ((v[50] << 2L)) & 4294967295L;
        v[114] = LibC.call(m, "malloc", new long[]{v[113]});
        v[115] = m.load(v[1], 4);
        v[116] = (v[115] + (Heap.s(0L, 32) * 48L) + 44L) & 4294967295L;
        m.store(v[116], v[114], 4);
        v[117] = v[114] == 0L ? 1L : 0L;
        v[118] = v[113] < v[50] ? 1L : 0L;
        v[119] = v[117] != 0 ? 1L : v[118];
        return v[119] != 0 ? 30 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[120] = m.load(v[52], 4);
        v[121] = v[120] < 6L ? 1L : 0L;
        v[122] = (v[120]) & 63L;
        v[123] = ((58L >>> v[122])) & 63L;
        v[124] = ((v[123] & 1L)) & 63L;
        v[125] = v[124] != 0L ? 1L : 0L;
        v[126] = v[121] != 0 ? v[125] : 0L;
        v[127] = m.load(v[115], 4);
        v[128] = v[127] == 0L ? 1L : 0L;
        return v[128] != 0 ? 22 : 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[129] = (v[115] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        v[130] = m.load(v[129], 4);
        v[131] = (v[115] + (Heap.s(0L, 32) * 48L) + 12L) & 4294967295L;
        v[132] = m.load(v[131], 4);
        v[133] = ((v[130] + 4294967295L)) & 4294967295L;
        v[134] = ((v[133] + v[132])) & 4294967295L;
        v[135] = ((v[134] / v[132])) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi136 = (previous == 21 ? v[80] : v[135]);
        v[136] = phi136;
        v[137] = v[136] < v[50] ? 1L : 0L;
        return v[137] != 0 ? 24 : 30;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[138] = (v[115] + (Heap.s(0L, 32) * 48L) + 36L) & 4294967295L;
        v[139] = (v[115] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        v[140] = (v[115] + (Heap.s(0L, 32) * 48L) + 12L) & 4294967295L;
        v[141] = ((v[50] - v[136])) & 4294967295L;
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi142 = (previous == 24 ? v[136] : v[163]);
        long phi143 = (previous == 24 ? 0L : v[162]);
        v[142] = phi142;
        v[143] = phi143;
        return v[126] != 0 ? 26 : 29;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[144] = m.load(v[115], 4);
        v[145] = v[144] == 0L ? 1L : 0L;
        return v[145] != 0 ? 27 : 28;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[146] = m.load(v[138], 4);
        v[147] = m.load(v[139], 4);
        v[148] = ((v[146] - v[147])) & 4294967295L;
        v[149] = m.load(v[140], 4);
        v[150] = ((v[148] + v[149])) & 4294967295L;
        v[151] = ((v[150] / v[149])) & 4294967295L;
        v[152] = m.load(v[36], 4);
        v[153] = v[152] == 1L ? 1L : 0L;
        v[154] = (v[153]) & 4294967295L;
        v[155] = ((v[151] >>> v[154])) & 4294967295L;
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi156 = (previous == 27 ? v[155] : v[50]);
        v[156] = phi156;
        v[157] = ((v[143] ^ 4294967295L)) & 4294967295L;
        v[158] = ((v[156] + v[157])) & 4294967295L;
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi159 = (previous == 28 ? v[158] : v[143]);
        v[159] = phi159;
        v[160] = ((v[159] * v[56])) & 4294967295L;
        v[161] = (v[114] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        m.store(v[161], v[160], 4);
        v[162] = ((v[143] + 1L)) & 4294967295L;
        v[163] = ((v[162] + v[136])) & 4294967295L;
        v[164] = v[162] == v[141] ? 1L : 0L;
        return v[164] != 0 ? 30 : 25;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi165 = (previous == 10 ? 4294967295L : (previous == 20 ? 4294967295L : (previous == 23 ? 0L : 0L)));
        v[165] = phi165;
        v[166] = v[165];
        return -1;
    }
}
