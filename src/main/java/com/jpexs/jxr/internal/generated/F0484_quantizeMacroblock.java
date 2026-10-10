package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: quantizeMacroblock.
 */
public final class F0484_quantizeMacroblock {

    private F0484_quantizeMacroblock() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[300];
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
                    default:
                        throw new IllegalStateException("Invalid block in quantizeMacroblock");
                }
                previous = old;
                if (pc < 0) {
                    return v[299];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[2] + (Heap.s(v[4], 32) * 240L)) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[8]) & 4294967295L;
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 56L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = v[11] == 0L ? 1L : 0L;
        v[13] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        return v[12] != 0 ? 1 : 26;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[15] = Heap.s(v[14], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[15] != 0 ? 2 : 34;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[16] = v[9] == 1L ? 1L : 0L;
        v[17] = v[16] != 0 ? 4L : 16L;
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1156L) & 4294967295L;
        v[19] = m.load(v[18], 1);
        v[20] = (v[19]) & 4294967295L;
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1157L) & 4294967295L;
        v[22] = m.load(v[21], 1);
        v[23] = (v[22]) & 4294967295L;
        v[24] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[25] = v[16] != 0 ? 13952L : 14000L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi26 = (previous == 2 ? 0L : v[125]);
        v[26] = phi26;
        v[27] = v[26] == 0L ? 1L : 0L;
        return v[27] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        switch ((int) v[9]) {
            case 2:
                return 7;
            case 1:
                return 6;
            case 3:
                return 6;
            default:
                return 5;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi28 = (previous == 5 ? 16L : (previous == 4 ? 8L : v[17]));
        long phi29 = (previous == 5 ? 14000L : (previous == 4 ? 13968L : v[25]));
        v[28] = phi28;
        v[29] = phi29;
        v[30] = (v[5] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[2] + (Heap.s(v[4], 32) * 240L) + 64L + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = (v[2] + (Heap.s(v[4], 32) * 240L) + 128L + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = (v[33] + (Heap.s(v[20], 32) * 20L) + 12L) & 4294967295L;
        v[39] = (v[33] + (Heap.s(v[20], 32) * 20L) + 8L) & 4294967295L;
        v[40] = (v[33] + (Heap.s(v[20], 32) * 20L) + 16L) & 4294967295L;
        v[41] = (v[31] + (Heap.s(0L, 32) * 20L) + 12L) & 4294967295L;
        v[42] = (v[31] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        v[43] = (v[31] + (Heap.s(0L, 32) * 20L) + 16L) & 4294967295L;
        v[44] = (v[35] + (Heap.s(v[23], 32) * 20L) + 12L) & 4294967295L;
        v[45] = (v[35] + (Heap.s(v[23], 32) * 20L) + 8L) & 4294967295L;
        v[46] = (v[35] + (Heap.s(v[23], 32) * 20L) + 16L) & 4294967295L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi47 = (previous == 7 ? 0L : v[123]);
        v[47] = phi47;
        v[48] = (v[29] + (Heap.s(v[47], 32) * 4L)) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = (v[37] + (Heap.s(v[49], 32) * 4L)) & 4294967295L;
        v[51] = v[47] == 0L ? 1L : 0L;
        return v[51] != 0 ? 9 : 13;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[52] = m.load(v[41], 4);
        v[53] = v[52] == 0L ? 1L : 0L;
        v[54] = m.load(v[50], 4);
        v[55] = m.load(v[42], 4);
        v[56] = m.load(v[43], 4);
        v[57] = ((v[54] >>> 31L)) & 4294967295L;
        v[58] = ((Heap.s(v[54], 32) >> 31L)) & 4294967295L;
        v[59] = ((v[58] ^ v[54])) & 4294967295L;
        v[60] = ((v[57] + v[55])) & 4294967295L;
        v[61] = ((v[60] + v[59])) & 4294967295L;
        return v[53] != 0 ? 10 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[62] = ((Heap.s(v[61], 32) >> v[56])) & 4294967295L;
        return 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[63] = v[61];
        v[64] = v[52];
        v[65] = (v[63] * v[64]);
        v[66] = (v[65] >>> 32L);
        v[67] = (v[66]) & 4294967295L;
        v[68] = ((v[67] >>> v[56])) & 4294967295L;
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi69 = (previous == 11 ? v[68] : v[62]);
        v[69] = phi69;
        v[70] = ((v[69] ^ v[58])) & 4294967295L;
        v[71] = ((v[70] - v[58])) & 4294967295L;
        return 18;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[72] = m.load(v[24], 4);
        v[73] = v[72] == 3L ? 1L : 0L;
        return v[73] != 0 ? 19 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[74] = m.load(v[38], 4);
        v[75] = v[74] == 0L ? 1L : 0L;
        v[76] = m.load(v[50], 4);
        v[77] = m.load(v[39], 4);
        v[78] = m.load(v[40], 4);
        v[79] = ((v[76] >>> 31L)) & 4294967295L;
        v[80] = ((Heap.s(v[76], 32) >> 31L)) & 4294967295L;
        v[81] = ((v[80] ^ v[76])) & 4294967295L;
        v[82] = ((v[79] + v[77])) & 4294967295L;
        v[83] = ((v[82] + v[81])) & 4294967295L;
        return v[75] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[84] = ((Heap.s(v[83], 32) >> v[78])) & 4294967295L;
        return 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[85] = v[83];
        v[86] = v[74];
        v[87] = (v[85] * v[86]);
        v[88] = (v[87] >>> 32L);
        v[89] = (v[88]) & 4294967295L;
        v[90] = ((v[89] >>> v[78])) & 4294967295L;
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi91 = (previous == 16 ? v[90] : v[84]);
        v[91] = phi91;
        v[92] = ((v[91] ^ v[80])) & 4294967295L;
        v[93] = ((v[92] - v[80])) & 4294967295L;
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi94 = (previous == 17 ? v[93] : v[71]);
        v[94] = phi94;
        m.store(v[50], v[94], 4);
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[95] = m.load(v[24], 4);
        v[96] = ((v[95] & 4294967294L)) & 4294967295L;
        v[97] = v[96] == 2L ? 1L : 0L;
        return v[97] != 0 ? 24 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi98 = (previous == 23 ? v[121] : 1L);
        v[98] = phi98;
        v[99] = m.load(v[44], 4);
        v[100] = v[99] == 0L ? 1L : 0L;
        v[101] = (v[50] + (Heap.s(v[98], 32) * 4L)) & 4294967295L;
        v[102] = m.load(v[101], 4);
        v[103] = m.load(v[45], 4);
        v[104] = m.load(v[46], 4);
        v[105] = ((v[102] >>> 31L)) & 4294967295L;
        v[106] = ((Heap.s(v[102], 32) >> 31L)) & 4294967295L;
        v[107] = ((v[106] ^ v[102])) & 4294967295L;
        v[108] = ((v[105] + v[103])) & 4294967295L;
        v[109] = ((v[108] + v[107])) & 4294967295L;
        return v[100] != 0 ? 21 : 22;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[110] = ((Heap.s(v[109], 32) >> v[104])) & 4294967295L;
        return 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[111] = v[109];
        v[112] = v[99];
        v[113] = (v[111] * v[112]);
        v[114] = (v[113] >>> 32L);
        v[115] = (v[114]) & 4294967295L;
        v[116] = ((v[115] >>> v[104])) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi117 = (previous == 22 ? v[116] : v[110]);
        v[117] = phi117;
        v[118] = ((v[117] ^ v[106])) & 4294967295L;
        v[119] = ((v[118] - v[106])) & 4294967295L;
        v[120] = (v[50] + (Heap.s(v[98], 32) * 4L)) & 4294967295L;
        m.store(v[120], v[119], 4);
        v[121] = ((v[98] + 1L)) & 4294967295L;
        v[122] = v[121] == 16L ? 1L : 0L;
        return v[122] != 0 ? 24 : 20;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[123] = ((v[47] + 1L)) & 4294967295L;
        v[124] = v[123] == v[28] ? 1L : 0L;
        return v[124] != 0 ? 25 : 8;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[125] = ((v[26] + 1L)) & 4294967295L;
        v[126] = m.load(v[13], 4);
        v[127] = Heap.s(v[125], 32) < Heap.s(v[126], 32) ? 1L : 0L;
        return v[127] != 0 ? 3 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi128 = (previous == 0 ? v[14] : v[126]);
        v[128] = phi128;
        v[129] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[130] = Heap.s(v[128], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[130] != 0 ? 27 : 34;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[131] = v[9] == 2L ? 1L : 0L;
        v[132] = v[9] == 1L ? 1L : 0L;
        v[133] = m.load(14192L, 4);
        v[134] = m.load(14196L, 4);
        v[135] = m.load(14200L, 4);
        v[136] = m.load(14204L, 4);
        v[137] = m.load(14208L, 4);
        v[138] = m.load(14212L, 4);
        v[139] = m.load(14216L, 4);
        v[140] = m.load(14220L, 4);
        v[141] = m.load(14224L, 4);
        v[142] = m.load(14228L, 4);
        v[143] = m.load(14232L, 4);
        v[144] = m.load(14236L, 4);
        v[145] = m.load(14240L, 4);
        v[146] = m.load(14244L, 4);
        v[147] = m.load(14248L, 4);
        v[148] = m.load(14252L, 4);
        v[149] = m.load(13952L, 4);
        v[150] = m.load(13956L, 4);
        v[151] = m.load(13960L, 4);
        v[152] = m.load(13964L, 4);
        v[153] = m.load(13968L, 4);
        v[154] = m.load(13972L, 4);
        v[155] = m.load(13976L, 4);
        v[156] = m.load(13980L, 4);
        v[157] = m.load(13984L, 4);
        v[158] = m.load(13988L, 4);
        v[159] = m.load(13992L, 4);
        v[160] = m.load(13996L, 4);
        v[161] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[162] = m.load(v[161], 4);
        v[163] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[164] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[165] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[166] = (v[162] + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        v[167] = m.load(v[166], 4);
        m.store(v[6], v[167], 4);
        v[168] = (v[162] + (Heap.s(v[134], 32) * 4L)) & 4294967295L;
        v[169] = m.load(v[168], 4);
        m.store(v[163], v[169], 4);
        v[170] = (v[162] + (Heap.s(v[135], 32) * 4L)) & 4294967295L;
        v[171] = m.load(v[170], 4);
        m.store(v[164], v[171], 4);
        v[172] = (v[162] + (Heap.s(v[136], 32) * 4L)) & 4294967295L;
        v[173] = m.load(v[172], 4);
        m.store(v[165], v[173], 4);
        v[174] = (v[162] + (Heap.s(v[137], 32) * 4L)) & 4294967295L;
        v[175] = m.load(v[174], 4);
        v[176] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[176], v[175], 4);
        v[177] = (v[162] + (Heap.s(v[138], 32) * 4L)) & 4294967295L;
        v[178] = m.load(v[177], 4);
        v[179] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        m.store(v[179], v[178], 4);
        v[180] = (v[162] + (Heap.s(v[139], 32) * 4L)) & 4294967295L;
        v[181] = m.load(v[180], 4);
        v[182] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        m.store(v[182], v[181], 4);
        v[183] = (v[162] + (Heap.s(v[140], 32) * 4L)) & 4294967295L;
        v[184] = m.load(v[183], 4);
        v[185] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        m.store(v[185], v[184], 4);
        v[186] = (v[162] + (Heap.s(v[141], 32) * 4L)) & 4294967295L;
        v[187] = m.load(v[186], 4);
        v[188] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        m.store(v[188], v[187], 4);
        v[189] = (v[162] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        v[190] = m.load(v[189], 4);
        v[191] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        m.store(v[191], v[190], 4);
        v[192] = (v[162] + (Heap.s(v[143], 32) * 4L)) & 4294967295L;
        v[193] = m.load(v[192], 4);
        v[194] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        m.store(v[194], v[193], 4);
        v[195] = (v[162] + (Heap.s(v[144], 32) * 4L)) & 4294967295L;
        v[196] = m.load(v[195], 4);
        v[197] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        m.store(v[197], v[196], 4);
        v[198] = (v[162] + (Heap.s(v[145], 32) * 4L)) & 4294967295L;
        v[199] = m.load(v[198], 4);
        v[200] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        m.store(v[200], v[199], 4);
        v[201] = (v[162] + (Heap.s(v[146], 32) * 4L)) & 4294967295L;
        v[202] = m.load(v[201], 4);
        v[203] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        m.store(v[203], v[202], 4);
        v[204] = (v[162] + (Heap.s(v[147], 32) * 4L)) & 4294967295L;
        v[205] = m.load(v[204], 4);
        v[206] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        m.store(v[206], v[205], 4);
        v[207] = (v[162] + (Heap.s(v[148], 32) * 4L)) & 4294967295L;
        v[208] = m.load(v[207], 4);
        v[209] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(0L, 32) * 64L) + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        m.store(v[209], v[208], 4);
        v[210] = m.load(v[129], 4);
        v[211] = Heap.s(v[210], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[211] != 0 ? 28 : 34;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi212 = (previous == 33 ? v[296] : v[210]);
        long phi213 = (previous == 33 ? v[297] : 1L);
        v[212] = phi212;
        v[213] = phi213;
        v[214] = (v[6] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[213], 32) * 64L)) & 4294967295L;
        v[215] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[213], 32) * 4L)) & 4294967295L;
        v[216] = m.load(v[215], 4);
        return v[131] != 0 ? 29 : 30;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[217] = (v[216] + (Heap.s(v[153], 32) * 4L)) & 4294967295L;
        v[218] = m.load(v[217], 4);
        m.store(v[214], v[218], 4);
        v[219] = (v[216] + (Heap.s(v[154], 32) * 4L)) & 4294967295L;
        v[220] = m.load(v[219], 4);
        v[221] = (v[214] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[221], v[220], 4);
        v[222] = (v[216] + (Heap.s(v[155], 32) * 4L)) & 4294967295L;
        v[223] = m.load(v[222], 4);
        v[224] = (v[214] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[224], v[223], 4);
        v[225] = (v[216] + (Heap.s(v[156], 32) * 4L)) & 4294967295L;
        v[226] = m.load(v[225], 4);
        v[227] = (v[214] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[227], v[226], 4);
        v[228] = (v[216] + (Heap.s(v[157], 32) * 4L)) & 4294967295L;
        v[229] = m.load(v[228], 4);
        v[230] = (v[214] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[230], v[229], 4);
        v[231] = (v[216] + (Heap.s(v[158], 32) * 4L)) & 4294967295L;
        v[232] = m.load(v[231], 4);
        v[233] = (v[214] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        m.store(v[233], v[232], 4);
        v[234] = (v[216] + (Heap.s(v[159], 32) * 4L)) & 4294967295L;
        v[235] = m.load(v[234], 4);
        v[236] = (v[214] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        m.store(v[236], v[235], 4);
        v[237] = (v[216] + (Heap.s(v[160], 32) * 4L)) & 4294967295L;
        v[238] = m.load(v[237], 4);
        v[239] = (v[214] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        m.store(v[239], v[238], 4);
        return 33;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[240] = (v[214] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[241] = (v[214] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[242] = (v[214] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        return v[132] != 0 ? 32 : 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[243] = (v[216] + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        v[244] = m.load(v[243], 4);
        m.store(v[214], v[244], 4);
        v[245] = (v[216] + (Heap.s(v[134], 32) * 4L)) & 4294967295L;
        v[246] = m.load(v[245], 4);
        m.store(v[240], v[246], 4);
        v[247] = (v[216] + (Heap.s(v[135], 32) * 4L)) & 4294967295L;
        v[248] = m.load(v[247], 4);
        m.store(v[241], v[248], 4);
        v[249] = (v[216] + (Heap.s(v[136], 32) * 4L)) & 4294967295L;
        v[250] = m.load(v[249], 4);
        m.store(v[242], v[250], 4);
        v[251] = (v[216] + (Heap.s(v[137], 32) * 4L)) & 4294967295L;
        v[252] = m.load(v[251], 4);
        v[253] = (v[214] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[253], v[252], 4);
        v[254] = (v[216] + (Heap.s(v[138], 32) * 4L)) & 4294967295L;
        v[255] = m.load(v[254], 4);
        v[256] = (v[214] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        m.store(v[256], v[255], 4);
        v[257] = (v[216] + (Heap.s(v[139], 32) * 4L)) & 4294967295L;
        v[258] = m.load(v[257], 4);
        v[259] = (v[214] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        m.store(v[259], v[258], 4);
        v[260] = (v[216] + (Heap.s(v[140], 32) * 4L)) & 4294967295L;
        v[261] = m.load(v[260], 4);
        v[262] = (v[214] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        m.store(v[262], v[261], 4);
        v[263] = (v[216] + (Heap.s(v[141], 32) * 4L)) & 4294967295L;
        v[264] = m.load(v[263], 4);
        v[265] = (v[214] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        m.store(v[265], v[264], 4);
        v[266] = (v[216] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        v[267] = m.load(v[266], 4);
        v[268] = (v[214] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        m.store(v[268], v[267], 4);
        v[269] = (v[216] + (Heap.s(v[143], 32) * 4L)) & 4294967295L;
        v[270] = m.load(v[269], 4);
        v[271] = (v[214] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        m.store(v[271], v[270], 4);
        v[272] = (v[216] + (Heap.s(v[144], 32) * 4L)) & 4294967295L;
        v[273] = m.load(v[272], 4);
        v[274] = (v[214] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        m.store(v[274], v[273], 4);
        v[275] = (v[216] + (Heap.s(v[145], 32) * 4L)) & 4294967295L;
        v[276] = m.load(v[275], 4);
        v[277] = (v[214] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        m.store(v[277], v[276], 4);
        v[278] = (v[216] + (Heap.s(v[146], 32) * 4L)) & 4294967295L;
        v[279] = m.load(v[278], 4);
        v[280] = (v[214] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        m.store(v[280], v[279], 4);
        v[281] = (v[216] + (Heap.s(v[147], 32) * 4L)) & 4294967295L;
        v[282] = m.load(v[281], 4);
        v[283] = (v[214] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        m.store(v[283], v[282], 4);
        v[284] = (v[216] + (Heap.s(v[148], 32) * 4L)) & 4294967295L;
        v[285] = m.load(v[284], 4);
        v[286] = (v[214] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        m.store(v[286], v[285], 4);
        v[287] = m.load(v[129], 4);
        return 33;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[288] = (v[216] + (Heap.s(v[149], 32) * 4L)) & 4294967295L;
        v[289] = m.load(v[288], 4);
        m.store(v[214], v[289], 4);
        v[290] = (v[216] + (Heap.s(v[150], 32) * 4L)) & 4294967295L;
        v[291] = m.load(v[290], 4);
        m.store(v[240], v[291], 4);
        v[292] = (v[216] + (Heap.s(v[151], 32) * 4L)) & 4294967295L;
        v[293] = m.load(v[292], 4);
        m.store(v[241], v[293], 4);
        v[294] = (v[216] + (Heap.s(v[152], 32) * 4L)) & 4294967295L;
        v[295] = m.load(v[294], 4);
        m.store(v[242], v[295], 4);
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi296 = (previous == 31 ? v[287] : (previous == 32 ? v[212] : v[212]));
        v[296] = phi296;
        v[297] = ((v[213] + 1L)) & 4294967295L;
        v[298] = Heap.s(v[297], 32) < Heap.s(v[296], 32) ? 1L : 0L;
        return v[298] != 0 ? 28 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[299] = 0L;
        return -1;
    }
}
