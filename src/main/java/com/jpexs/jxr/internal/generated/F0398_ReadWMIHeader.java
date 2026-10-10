package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ReadWMIHeader.
 */
public final class F0398_ReadWMIHeader {

    private F0398_ReadWMIHeader() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[185];
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
                    default:
                        throw new IllegalStateException("Invalid block in ReadWMIHeader");
                }
                previous = old;
                if (pc < 0) {
                    return v[184];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(16L * 1L, 4);
        v[4] = m.stack(8L * 1L, 1);
        v[5] = (v[1] + (Heap.s(0L, 32) * 32860L) + 48L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[3], 0L, 16L, 0L});
        m.store(v[4], 0L, 8);
        v[7] = (v[6] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = Dispatch.call(m, v[8], new long[]{v[6], v[4], 8L});
        v[10] = Heap.s(v[9], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[10] != 0 ? 42 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = LibC.call(m, "strstr", new long[]{v[4], 12224L});
        v[12] = v[4] == v[11] ? 1L : 0L;
        return v[12] != 0 ? 2 : 42;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = F0335_attach_SB.run(m, v[3], v[6]);
        v[14] = Heap.s(v[13], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[14] != 0 ? 42 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[15] = F0336_getBit32_SB.run(m, v[3], 4L);
        v[16] = v[15] == 1L ? 1L : 0L;
        return v[16] != 0 ? 4 : 42;
    }

    private static int b4(Heap m, long[] v, int previous) {
        m.store(v[2], 1L, 4);
        v[17] = F0336_getBit32_SB.run(m, v[3], 4L);
        switch ((int) v[17]) {
            case 9:
                return 5;
            case 1:
                return 5;
            case 0:
                return 5;
            default:
                return 42;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[18] = (v[2] + (Heap.s(0L, 32) * 112L) + 4L) & 4294967295L;
        m.store(v[18], v[17], 4);
        v[19] = (v[2] + (Heap.s(0L, 32) * 112L) + 32L) & 4294967295L;
        v[20] = v[17] == 9L ? 1L : 0L;
        v[21] = (v[20]) & 4294967295L;
        m.store(v[19], v[21], 4);
        v[22] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32840L) & 4294967295L;
        m.store(v[22], v[21], 4);
        v[23] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[24] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[25] = (v[1] + (Heap.s(0L, 32) * 32860L) + 28L) & 4294967295L;
        m.store(v[25], v[24], 4);
        v[26] = F0336_getBit32_SB.run(m, v[3], 3L);
        v[27] = (v[0] + (Heap.s(0L, 32) * 72L) + 60L) & 4294967295L;
        m.store(v[27], v[26], 4);
        v[28] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[29] = (v[2] + (Heap.s(0L, 32) * 112L) + 24L) & 4294967295L;
        m.store(v[29], v[28], 4);
        v[30] = F0336_getBit32_SB.run(m, v[3], 2L);
        v[31] = v[30] == 3L ? 1L : 0L;
        return v[31] != 0 ? 42 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[32] = (v[1] + (Heap.s(0L, 32) * 32860L) + 24L) & 4294967295L;
        m.store(v[32], v[30], 4);
        v[33] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[34] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[35] = (v[1] + (Heap.s(0L, 32) * 32860L) + 20L) & 4294967295L;
        m.store(v[35], 1L, 4);
        v[36] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[37] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[38] = (v[2] + (Heap.s(0L, 32) * 112L) + 28L) & 4294967295L;
        m.store(v[38], v[37], 4);
        v[39] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[40] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[41] = (v[2] + (Heap.s(0L, 32) * 112L) + 12L) & 4294967295L;
        m.store(v[41], v[40], 4);
        v[42] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[43] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[44] = (v[2] + (Heap.s(0L, 32) * 112L) + 16L) & 4294967295L;
        m.store(v[44], v[43], 4);
        v[45] = F0336_getBit32_SB.run(m, v[3], 4L);
        v[46] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        m.store(v[46], v[45], 4);
        v[47] = F0336_getBit32_SB.run(m, v[3], 4L);
        v[48] = (v[0] + (Heap.s(0L, 32) * 72L) + 12L) & 4294967295L;
        m.store(v[48], v[47], 4);
        v[49] = v[47] == 15L ? 1L : 0L;
        return v[49] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        m.store(v[48], 0L, 4);
        v[50] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32836L) & 4294967295L;
        m.store(v[50], 1L, 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[51] = v[33] == 0L ? 1L : 0L;
        v[52] = v[51] != 0 ? 32L : 16L;
        v[53] = F0336_getBit32_SB.run(m, v[3], v[52]);
        v[54] = ((v[53] + 1L)) & 4294967295L;
        m.store(v[0], v[54], 4);
        v[55] = F0336_getBit32_SB.run(m, v[3], v[52]);
        v[56] = ((v[55] + 1L)) & 4294967295L;
        v[57] = (v[0] + (Heap.s(0L, 32) * 72L) + 4L) & 4294967295L;
        m.store(v[57], v[56], 4);
        v[58] = (v[2] + (Heap.s(0L, 32) * 112L) + 52L) & 4294967295L;
        m.store(v[58], 0L, 4);
        v[59] = (v[2] + (Heap.s(0L, 32) * 112L) + 48L) & 4294967295L;
        m.store(v[59], 0L, 4);
        v[60] = (v[2] + (Heap.s(0L, 32) * 112L) + 44L) & 4294967295L;
        m.store(v[60], 0L, 4);
        v[61] = (v[2] + (Heap.s(0L, 32) * 112L) + 40L) & 4294967295L;
        m.store(v[61], 0L, 4);
        v[62] = v[36] == 0L ? 1L : 0L;
        return v[62] != 0 ? 9 : 13;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[63] = m.load(v[0], 4);
        v[64] = ((v[63] & 15L)) & 4294967295L;
        v[65] = v[64] == 0L ? 1L : 0L;
        return v[65] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[66] = ((16L - v[64])) & 4294967295L;
        m.store(v[58], v[66], 4);
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[67] = ((v[56] & 15L)) & 4294967295L;
        v[68] = v[67] == 0L ? 1L : 0L;
        return v[68] != 0 ? 13 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[69] = ((16L - v[67])) & 4294967295L;
        m.store(v[59], v[69], 4);
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[70] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16444L) & 4294967295L;
        m.store(v[70], 0L, 4);
        v[71] = (v[1] + (Heap.s(0L, 32) * 32860L) + 56L) & 4294967295L;
        m.store(v[71], 0L, 4);
        v[72] = v[23] == 0L ? 1L : 0L;
        return v[72] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[73] = F0336_getBit32_SB.run(m, v[3], 12L);
        m.store(v[71], v[73], 4);
        v[74] = F0336_getBit32_SB.run(m, v[3], 12L);
        m.store(v[70], v[74], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi75 = (previous == 14 ? v[74] : 0L);
        v[75] = phi75;
        v[76] = m.load(v[29], 4);
        v[77] = v[76] == 0L ? 1L : 0L;
        return v[77] != 0 ? 17 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[78] = m.load(v[71], 4);
        return 19;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[79] = m.load(v[25], 4);
        v[80] = v[79] == 1L ? 1L : 0L;
        return v[80] != 0 ? 42 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[81] = m.load(v[71], 4);
        v[82] = ((0L - v[75])) & 4294967295L;
        v[83] = v[81] == v[82] ? 1L : 0L;
        return v[83] != 0 ? 19 : 42;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi84 = (previous == 16 ? v[78] : v[81]);
        v[84] = phi84;
        v[85] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16448L) & 4294967295L;
        m.store(v[85], 0L, 4);
        v[86] = (v[1] + (Heap.s(0L, 32) * 32860L) + 60L) & 4294967295L;
        m.store(v[86], 0L, 4);
        v[87] = v[84] == 0L ? 1L : 0L;
        return v[87] != 0 ? 22 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[88] = v[51] != 0 ? 16L : 8L;
        return 24;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[89] = m.load(v[70], 4);
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi90 = (previous == 21 ? v[89] : v[75]);
        v[90] = phi90;
        v[91] = v[90] == 0L ? 1L : 0L;
        return v[91] != 0 ? 27 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[92] = v[51] != 0 ? 16L : 8L;
        return 25;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi93 = (previous == 20 ? 0L : v[98]);
        v[93] = phi93;
        v[94] = F0336_getBit32_SB.run(m, v[3], v[88]);
        v[95] = (v[1] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        v[96] = m.load(v[95], 4);
        v[97] = ((v[96] + v[94])) & 4294967295L;
        v[98] = ((v[93] + 1L)) & 4294967295L;
        v[99] = (v[1] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[98], 32) * 4L)) & 4294967295L;
        m.store(v[99], v[97], 4);
        v[100] = m.load(v[71], 4);
        v[101] = v[98] < v[100] ? 1L : 0L;
        return v[101] != 0 ? 24 : 21;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi102 = (previous == 23 ? 0L : v[107]);
        v[102] = phi102;
        v[103] = F0336_getBit32_SB.run(m, v[3], v[92]);
        v[104] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[102], 32) * 4L)) & 4294967295L;
        v[105] = m.load(v[104], 4);
        v[106] = ((v[105] + v[103])) & 4294967295L;
        v[107] = ((v[102] + 1L)) & 4294967295L;
        v[108] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[107], 32) * 4L)) & 4294967295L;
        m.store(v[108], v[106], 4);
        v[109] = m.load(v[70], 4);
        v[110] = v[107] < v[109] ? 1L : 0L;
        return v[110] != 0 ? 25 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[111] = ((v[109] + 1L)) & 4294967295L;
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi112 = (previous == 26 ? v[111] : 1L);
        v[112] = phi112;
        v[113] = v[39] == 0L ? 1L : 0L;
        return v[113] != 0 ? 30 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[114] = m.load(v[71], 4);
        v[115] = ((v[114] + 1L)) & 4294967295L;
        v[116] = ((v[112] * v[115])) & 4294967295L;
        v[117] = v[116] == 0L ? 1L : 0L;
        return v[117] != 0 ? 30 : 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi118 = (previous == 29 ? v[120] : 0L);
        v[118] = phi118;
        v[119] = F0336_getBit32_SB.run(m, v[3], 8L);
        v[120] = ((v[118] + 1L)) & 4294967295L;
        v[121] = m.load(v[71], 4);
        v[122] = ((v[121] + 1L)) & 4294967295L;
        v[123] = m.load(v[70], 4);
        v[124] = ((v[123] + 1L)) & 4294967295L;
        v[125] = ((v[124] * v[122])) & 4294967295L;
        v[126] = v[120] < v[125] ? 1L : 0L;
        return v[126] != 0 ? 29 : 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        return v[62] != 0 ? 31 : 32;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[127] = m.load(v[58], 4);
        return 33;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[128] = F0336_getBit32_SB.run(m, v[3], 6L);
        v[129] = ((v[128] & 255L)) & 4294967295L;
        m.store(v[61], v[129], 4);
        v[130] = F0336_getBit32_SB.run(m, v[3], 6L);
        v[131] = ((v[130] & 255L)) & 4294967295L;
        m.store(v[60], v[131], 4);
        v[132] = F0336_getBit32_SB.run(m, v[3], 6L);
        v[133] = ((v[132] & 255L)) & 4294967295L;
        m.store(v[59], v[133], 4);
        v[134] = F0336_getBit32_SB.run(m, v[3], 6L);
        v[135] = ((v[134] & 255L)) & 4294967295L;
        m.store(v[58], v[135], 4);
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi136 = (previous == 31 ? v[127] : v[135]);
        v[136] = phi136;
        v[137] = m.load(v[0], 4);
        v[138] = m.load(v[60], 4);
        v[139] = ((v[138] + v[137])) & 4294967295L;
        v[140] = ((v[139] + v[136])) & 4294967295L;
        v[141] = ((v[140] & 15L)) & 4294967295L;
        v[142] = m.load(v[57], 4);
        v[143] = m.load(v[61], 4);
        v[144] = ((v[143] + v[142])) & 4294967295L;
        v[145] = m.load(v[59], 4);
        v[146] = ((v[144] + v[145])) & 4294967295L;
        v[147] = ((v[146] & 15L)) & 4294967295L;
        v[148] = ((0L - v[147])) & 4294967295L;
        v[149] = v[141] == v[148] ? 1L : 0L;
        return v[149] != 0 ? 37 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[150] = ((v[137] & 15L)) & 4294967295L;
        v[151] = ((v[142] & 15L)) & 4294967295L;
        v[152] = ((v[138] + v[150])) & 4294967295L;
        v[153] = ((v[152] + v[151])) & 4294967295L;
        v[154] = ((0L - v[143])) & 4294967295L;
        v[155] = v[153] == v[154] ? 1L : 0L;
        return v[155] != 0 ? 35 : 42;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[156] = v[137] <= v[136] ? 1L : 0L;
        v[157] = v[142] <= v[145] ? 1L : 0L;
        v[158] = ((v[156] | v[157])) & 1L;
        return v[158] != 0 ? 42 : 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[159] = ((v[137] - v[136])) & 4294967295L;
        m.store(v[0], v[159], 4);
        v[160] = ((v[142] - v[145])) & 4294967295L;
        m.store(v[57], v[160], 4);
        return 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        F0337_flushToByte_SB.run(m, v[3]);
        v[161] = F0397_ReadImagePlaneHeader.run(m, v[0], v[1], v[2], v[3]);
        v[162] = v[161] == 0L ? 1L : 0L;
        return v[162] != 0 ? 38 : 42;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[163] = F0339_detach_SB.run(m, v[3]);
        v[164] = F0338_getByteRead_SB.run(m, v[3]);
        v[165] = ((0L - v[164])) & 4294967295L;
        v[166] = (v[1] + (Heap.s(0L, 32) * 32860L) + 52L) & 4294967295L;
        m.store(v[166], v[165], 4);
        v[167] = m.load(v[44], 4);
        v[168] = v[167] == 0L ? 1L : 0L;
        return v[168] != 0 ? 40 : 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[169] = (v[1] + (Heap.s(0L, 32) * 32860L) + 36L) & 4294967295L;
        v[170] = m.load(v[169], 1);
        return 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        long phi171 = (previous == 39 ? v[170] : 0L);
        v[171] = phi171;
        v[172] = (v[1] + (Heap.s(0L, 32) * 32860L) + 36L) & 4294967295L;
        m.store(v[172], v[171], 1);
        v[173] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        v[174] = m.load(v[173], 4);
        v[175] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32L) & 4294967295L;
        m.store(v[175], v[174], 4);
        v[176] = m.load(v[48], 4);
        v[177] = ((v[176] + 4294967288L)) & 4294967295L;
        v[178] = v[177] < 3L ? 1L : 0L;
        return v[178] != 0 ? 41 : 42;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[179] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16L) & 4294967295L;
        v[180] = m.load(v[179], 4);
        v[181] = v[180] > 3L ? 1L : 0L;
        v[182] = (Heap.s(v[181], 1)) & 4294967295L;
        return 42;
    }

    private static int b42(Heap m, long[] v, int previous) {
        long phi183 = (previous == 0 ? 4294967295L : (previous == 1 ? 4294967295L : (previous == 2 ? 4294967295L : (previous == 3 ? 4294967295L : (previous == 4 ? 4294967295L : (previous == 5 ? 4294967295L : (previous == 18 ? 4294967295L : (previous == 34 ? 4294967295L : (previous == 35 ? 4294967295L : (previous == 37 ? 4294967295L : (previous == 40 ? 0L : (previous == 17 ? 4294967295L : v[182]))))))))))));
        v[183] = phi183;
        v[184] = v[183];
        return -1;
    }
}
