package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_Copy_WMP.
 */
public final class F0128_PKImageDecode_Copy_WMP {

    private F0128_PKImageDecode_Copy_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[259];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_Copy_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[258];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.stack(24L * 1L, 4);
        v[5] = m.stack(4L * 1L, 4);
        v[6] = m.stack(4L * 1L, 4);
        v[7] = (v[4] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[7], 0L, 12L, 0L});
        v[8] = (v[0] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        m.store(v[4], v[2], 4);
        v[10] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[4] + (Heap.s(0L, 32) * 24L) + 4L) & 4294967295L;
        m.store(v[12], v[11], 4);
        v[13] = (v[4] + (Heap.s(0L, 32) * 24L) + 8L) & 4294967295L;
        m.store(v[13], v[3], 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L) & 4294967295L;
        v[15] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 52L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[18] = (v[0] + (Heap.s(0L, 32) * 66224L) + 72L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi20 = (previous == 2 ? v[23] : 1L);
        v[20] = phi20;
        v[21] = ((v[20] * v[16])) & 4294967295L;
        v[22] = v[21] < v[19] ? 1L : 0L;
        v[23] = ((v[20] << 1L)) & 4294967295L;
        return v[22] != 0 ? 2 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi24 = (previous == 0 ? 1L : v[20]);
        v[24] = phi24;
        v[25] = ((16L / v[24])) & 4294967295L;
        v[26] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65984L) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = v[27] == 0L ? 1L : 0L;
        v[29] = (v[2]) & 4294967295L;
        v[30] = ((v[29] & 127L)) & 4294967295L;
        v[31] = ((v[27] | v[30])) & 4294967295L;
        v[32] = v[31] == 0L ? 1L : 0L;
        v[33] = ((v[11] & 15L)) & 4294967295L;
        v[34] = v[33] == 0L ? 1L : 0L;
        v[35] = v[32] != 0 ? v[34] : 0L;
        return v[35] != 0 ? 4 : 6;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[36] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = ((v[37] & 15L)) & 4294967295L;
        v[39] = ((v[3] & 127L)) & 4294967295L;
        v[40] = ((v[38] | v[39])) & 4294967295L;
        v[41] = v[40] == 0L ? 1L : 0L;
        return v[41] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[42] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 68L) & 4294967295L;
        m.store(v[42], 1L, 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[43] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65960L) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = v[44] == 0L ? 1L : 0L;
        return v[45] != 0 ? 9 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[46] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 36L) & 4294967295L;
        v[47] = m.load(v[46], 1);
        v[48] = v[47] == 1L ? 1L : 0L;
        return v[48] != 0 ? 34 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        m.store(v[46], 0L, 1);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi49 = (previous == 8 ? v[47] : 0L);
        v[49] = phi49;
        v[50] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L) & 4294967295L;
        v[51] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 32856L) & 4294967295L;
        m.store(v[51], 1L, 4);
        return v[28] != 0 ? 10 : 13;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[52] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 48L) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = (v[53] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65992L) & 4294967295L;
        v[57] = Dispatch.call(m, v[55], new long[]{v[53], v[56]});
        v[58] = Heap.s(v[57], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[58] != 0 ? 52 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[59] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33020L) & 4294967295L;
        v[60] = F0401_ImageStrDecInit.run(m, v[14], v[50], v[59]);
        v[61] = v[60] == 0L ? 1L : 0L;
        return v[61] != 0 ? 12 : 52;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[62] = m.load(v[10], 4);
        v[63] = m.load(v[26], 4);
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi64 = (previous == 12 ? v[63] : v[27]);
        long phi65 = (previous == 12 ? v[62] : v[11]);
        v[64] = phi64;
        v[65] = phi65;
        v[66] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66000L) & 4294967295L;
        v[67] = m.load(v[66], 4);
        v[68] = (v[1] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = ((v[69] + v[67])) & 4294967295L;
        v[71] = ((v[70] + v[65])) & 4294967295L;
        v[72] = ((v[65] + v[69])) & 4294967295L;
        v[73] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 44L) & 4294967295L;
        v[74] = m.load(v[73], 4);
        v[75] = Heap.s(v[72], 32) < Heap.s(v[74], 32) ? 1L : 0L;
        v[76] = ((v[25] + 4294967295L)) & 4294967295L;
        v[77] = v[75] != 0 ? 0L : v[76];
        v[78] = ((v[71] + v[77])) & 4294967295L;
        v[79] = ((v[78] / v[25])) & 4294967295L;
        v[80] = ((v[79] + 1L)) & 4294967295L;
        v[81] = ((v[70] / v[25])) & 4294967295L;
        v[82] = ((v[81] + 1L)) & 4294967295L;
        v[83] = v[82] < v[64] ? 1L : 0L;
        return v[83] != 0 ? 14 : 17;
    }

    private static int b14(Heap m, long[] v, int previous) {
        m.store(v[26], 0L, 4);
        v[84] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65996L) & 4294967295L;
        m.store(v[84], 0L, 4);
        m.store(v[66], 0L, 4);
        v[85] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66004L) & 4294967295L;
        m.store(v[85], 0L, 4);
        v[86] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33020L) & 4294967295L;
        v[87] = m.load(v[86], 4);
        v[88] = F0404_ImageStrDecTerm.run(m, v[87]);
        v[89] = v[88] == 0L ? 1L : 0L;
        return v[89] != 0 ? 15 : 52;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[90] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 48L) & 4294967295L;
        v[91] = m.load(v[90], 4);
        v[92] = (v[91] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65992L) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = Dispatch.call(m, v[93], new long[]{v[91], v[95]});
        v[97] = Heap.s(v[96], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[97] != 0 ? 52 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[98] = F0401_ImageStrDecInit.run(m, v[14], v[50], v[86]);
        v[99] = v[98] == 0L ? 1L : 0L;
        return v[99] != 0 ? 17 : 52;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[100] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 60L) & 4294967295L;
        v[101] = m.load(v[100], 4);
        v[102] = v[101] > 3L ? 1L : 0L;
        return v[102] != 0 ? 52 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        switch ((int) v[101]) {
            case 1:
                return 19;
            case 3:
                return 19;
            default:
                return 20;
        }
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[103] = m.load(v[68], 4);
        v[104] = m.load(v[10], 4);
        v[105] = m.load(v[73], 4);
        v[106] = m.load(v[66], 4);
        v[107] = ((v[104] + v[103])) & 4294967295L;
        v[108] = ((v[105] + v[106])) & 4294967295L;
        v[109] = ((v[107] - v[108])) & 4294967295L;
        v[110] = ((v[109] * v[3])) & 4294967295L;
        return 21;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[111] = m.load(v[68], 4);
        v[112] = ((v[111] * v[3])) & 4294967295L;
        v[113] = ((0L - v[112])) & 4294967295L;
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi114 = (previous == 19 ? v[110] : v[113]);
        v[114] = phi114;
        v[115] = (v[2] + (Heap.s(v[114], 32) * 1L)) & 4294967295L;
        m.store(v[4], v[115], 4);
        v[116] = m.load(v[26], 4);
        v[117] = v[116] < v[80] ? 1L : 0L;
        return v[117] != 0 ? 22 : 30;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[118] = (v[4] + (Heap.s(0L, 32) * 24L) + 12L) & 4294967295L;
        v[119] = (v[4] + (Heap.s(0L, 32) * 24L) + 16L) & 4294967295L;
        v[120] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33020L) & 4294967295L;
        v[121] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65996L) & 4294967295L;
        v[122] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66004L) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi123 = (previous == 22 ? v[80] : v[152]);
        long phi124 = (previous == 22 ? v[116] : v[153]);
        v[123] = phi123;
        v[124] = phi124;
        m.store(v[118], v[124], 4);
        m.store(v[119], v[124], 4);
        v[125] = m.load(v[120], 4);
        v[126] = F0403_ImageStrDecDecode.run(m, v[125], v[4], v[5]);
        v[127] = v[126] == 0L ? 1L : 0L;
        return v[127] != 0 ? 24 : 28;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[128] = m.load(v[5], 4);
        m.store(v[121], v[128], 4);
        v[129] = m.load(v[122], 4);
        v[130] = v[129] == 0L ? 1L : 0L;
        v[131] = v[128] != 0L ? 1L : 0L;
        v[132] = v[130] != 0 ? v[131] : 0L;
        return v[132] != 0 ? 25 : 26;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[133] = ((v[25] - v[128])) & 4294967295L;
        v[134] = m.load(v[66], 4);
        v[135] = ((v[134] + v[133])) & 4294967295L;
        m.store(v[66], v[135], 4);
        m.store(v[122], 1L, 4);
        v[136] = m.load(v[68], 4);
        v[137] = m.load(v[10], 4);
        v[138] = ((v[137] + v[136])) & 4294967295L;
        v[139] = m.load(v[73], 4);
        v[140] = Heap.s(v[138], 32) < Heap.s(v[139], 32) ? 1L : 0L;
        v[141] = v[140] != 0 ? 0L : v[76];
        v[142] = ((v[138] + v[135])) & 4294967295L;
        v[143] = ((v[142] + v[141])) & 4294967295L;
        v[144] = ((v[143] / v[25])) & 4294967295L;
        v[145] = ((v[144] + 1L)) & 4294967295L;
        return 29;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[146] = v[128] == 0L ? 1L : 0L;
        v[147] = v[124] != 0L ? 1L : 0L;
        v[148] = ((v[147] & v[146])) & 1L;
        return v[148] != 0 ? 27 : 29;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[149] = m.load(v[66], 4);
        v[150] = ((v[149] + v[25])) & 4294967295L;
        m.store(v[66], v[150], 4);
        v[151] = ((v[123] + 1L)) & 4294967295L;
        return 29;
    }

    private static int b28(Heap m, long[] v, int previous) {
        return 52;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi152 = (previous == 25 ? v[145] : (previous == 26 ? v[123] : v[151]));
        v[152] = phi152;
        v[153] = ((v[124] + 1L)) & 4294967295L;
        v[154] = v[153] < v[152] ? 1L : 0L;
        return v[154] != 0 ? 23 : 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi155 = (previous == 21 ? v[80] : v[152]);
        v[155] = phi155;
        m.store(v[4], v[115], 4);
        v[156] = ((v[155] + 4294967295L)) & 4294967295L;
        v[157] = ((v[156] * v[25])) & 4294967295L;
        v[158] = m.load(v[66], 4);
        v[159] = m.load(v[73], 4);
        v[160] = ((v[159] + v[158])) & 4294967295L;
        v[161] = v[157] < v[160] ? 1L : 0L;
        return v[161] != 0 ? 32 : 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[162] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33020L) & 4294967295L;
        v[163] = m.load(v[162], 4);
        v[164] = F0404_ImageStrDecTerm.run(m, v[163]);
        v[165] = v[164] == 0L ? 1L : 0L;
        return v[165] != 0 ? 32 : 52;
    }

    private static int b32(Heap m, long[] v, int previous) {
        m.store(v[26], v[155], 4);
        v[166] = m.load(v[43], 4);
        v[167] = v[166] == 0L ? 1L : 0L;
        return v[167] != 0 ? 51 : 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[168] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 36L) & 4294967295L;
        m.store(v[168], v[49], 1);
        v[169] = v[49] == 0L ? 1L : 0L;
        return v[169] != 0 ? 51 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[170] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L) & 4294967295L;
        v[171] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33024L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[171], v[14], 72L, 0L});
        v[172] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33096L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[172], v[170], 32856L, 0L});
        v[173] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33024L + 8L) & 4294967295L;
        m.store(v[173], 0L, 4);
        v[174] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 12L) & 4294967295L;
        v[175] = m.load(v[174], 4);
        v[176] = ((v[175] + 4294967295L)) & 4294967295L;
        v[177] = v[176] < 7L ? 1L : 0L;
        return v[177] != 0 ? 35 : 36;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[178] = (8528L + (Heap.s(0L, 32) * 28L) + (Heap.s(v[176], 32) * 4L)) & 4294967295L;
        v[179] = m.load(v[178], 4);
        v[180] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 16L) & 4294967295L;
        v[181] = m.load(v[180], 4);
        v[182] = ((v[181] >>> v[179])) & 4294967295L;
        v[183] = ((v[182] + 4294967295L)) & 4294967295L;
        v[184] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33024L + 20L) & 4294967295L;
        v[185] = m.load(v[184], 4);
        v[186] = ((v[183] + v[185])) & 4294967295L;
        m.store(v[184], v[186], 4);
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[187] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 33096L + 32856L) & 4294967295L;
        m.store(v[187], 1L, 4);
        v[188] = (v[9] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[189] = m.load(v[188], 4);
        v[190] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 8L) & 4294967295L;
        v[191] = m.load(v[190], 4);
        v[192] = Dispatch.call(m, v[189], new long[]{v[9], v[191]});
        v[193] = Heap.s(v[192], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[193] != 0 ? 52 : 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[194] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65988L) & 4294967295L;
        v[195] = m.load(v[194], 4);
        v[196] = v[195] == 0L ? 1L : 0L;
        return v[196] != 0 ? 38 : 40;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[197] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65956L) & 4294967295L;
        v[198] = F0401_ImageStrDecInit.run(m, v[171], v[172], v[197]);
        v[199] = v[198] == 0L ? 1L : 0L;
        return v[199] != 0 ? 39 : 52;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[200] = m.load(v[194], 4);
        return 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        long phi201 = (previous == 37 ? v[195] : v[200]);
        long phi202 = (previous == 37 ? v[192] : 0L);
        v[201] = phi201;
        v[202] = phi202;
        v[203] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66000L) & 4294967295L;
        v[204] = m.load(v[203], 4);
        v[205] = (v[1] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        v[206] = m.load(v[205], 4);
        v[207] = ((v[206] + v[204])) & 4294967295L;
        v[208] = m.load(v[10], 4);
        v[209] = ((v[207] + v[208])) & 4294967295L;
        v[210] = ((v[208] + v[206])) & 4294967295L;
        v[211] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 44L) & 4294967295L;
        v[212] = m.load(v[211], 4);
        v[213] = Heap.s(v[210], 32) < Heap.s(v[212], 32) ? 1L : 0L;
        v[214] = ((v[25] + 4294967295L)) & 4294967295L;
        v[215] = v[213] != 0 ? 0L : v[214];
        v[216] = ((v[209] + v[215])) & 4294967295L;
        v[217] = ((v[216] / v[25])) & 4294967295L;
        v[218] = ((v[217] + 1L)) & 4294967295L;
        v[219] = ((v[207] / v[25])) & 4294967295L;
        v[220] = ((v[219] + 1L)) & 4294967295L;
        v[221] = v[220] < v[201] ? 1L : 0L;
        return v[221] != 0 ? 41 : 44;
    }

    private static int b41(Heap m, long[] v, int previous) {
        m.store(v[194], 0L, 4);
        v[222] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65956L) & 4294967295L;
        v[223] = m.load(v[222], 4);
        v[224] = F0404_ImageStrDecTerm.run(m, v[223]);
        v[225] = v[224] == 0L ? 1L : 0L;
        return v[225] != 0 ? 42 : 52;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[226] = F0401_ImageStrDecInit.run(m, v[171], v[172], v[222]);
        v[227] = v[226] == 0L ? 1L : 0L;
        return v[227] != 0 ? 43 : 52;
    }

    private static int b43(Heap m, long[] v, int previous) {
        v[228] = m.load(v[194], 4);
        return 44;
    }

    private static int b44(Heap m, long[] v, int previous) {
        long phi229 = (previous == 40 ? v[201] : v[228]);
        long phi230 = (previous == 40 ? v[202] : 0L);
        v[229] = phi229;
        v[230] = phi230;
        v[231] = v[229] < v[218] ? 1L : 0L;
        return v[231] != 0 ? 45 : 48;
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[232] = (v[4] + (Heap.s(0L, 32) * 24L) + 12L) & 4294967295L;
        v[233] = (v[4] + (Heap.s(0L, 32) * 24L) + 16L) & 4294967295L;
        v[234] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65956L) & 4294967295L;
        return 47;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[235] = ((v[237] + 1L)) & 4294967295L;
        v[236] = v[235] < v[218] ? 1L : 0L;
        return v[236] != 0 ? 47 : 48;
    }

    private static int b47(Heap m, long[] v, int previous) {
        long phi237 = (previous == 45 ? v[229] : v[235]);
        v[237] = phi237;
        m.store(v[232], v[237], 4);
        m.store(v[233], v[237], 4);
        v[238] = m.load(v[234], 4);
        v[239] = F0403_ImageStrDecDecode.run(m, v[238], v[4], v[6]);
        v[240] = v[239] == 0L ? 1L : 0L;
        return v[240] != 0 ? 46 : 52;
    }

    private static int b48(Heap m, long[] v, int previous) {
        long phi241 = (previous == 44 ? v[230] : 0L);
        v[241] = phi241;
        v[242] = ((v[217] * v[25])) & 4294967295L;
        v[243] = m.load(v[203], 4);
        v[244] = m.load(v[211], 4);
        v[245] = ((v[244] + v[243])) & 4294967295L;
        v[246] = v[242] < v[245] ? 1L : 0L;
        return v[246] != 0 ? 50 : 49;
    }

    private static int b49(Heap m, long[] v, int previous) {
        v[247] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65956L) & 4294967295L;
        v[248] = m.load(v[247], 4);
        v[249] = F0404_ImageStrDecTerm.run(m, v[248]);
        v[250] = v[249] == 0L ? 1L : 0L;
        return v[250] != 0 ? 50 : 52;
    }

    private static int b50(Heap m, long[] v, int previous) {
        long phi251 = (previous == 48 ? v[241] : 0L);
        v[251] = phi251;
        m.store(v[194], v[218], 4);
        return 51;
    }

    private static int b51(Heap m, long[] v, int previous) {
        long phi252 = (previous == 50 ? v[251] : (previous == 33 ? 0L : 0L));
        v[252] = phi252;
        v[253] = m.load(v[10], 4);
        v[254] = (v[0] + (Heap.s(0L, 32) * 66224L) + 80L) & 4294967295L;
        v[255] = m.load(v[254], 4);
        v[256] = ((v[255] + v[253])) & 4294967295L;
        m.store(v[254], v[256], 4);
        return 52;
    }

    private static int b52(Heap m, long[] v, int previous) {
        long phi257 = (previous == 28 ? 4294967295L : (previous == 51 ? v[252] : (previous == 10 ? v[57] : (previous == 11 ? 4294967295L : (previous == 14 ? 4294967295L : (previous == 15 ? v[96] : (previous == 16 ? 4294967295L : (previous == 17 ? 4294967295L : (previous == 31 ? 4294967295L : (previous == 36 ? v[192] : (previous == 38 ? 4294967295L : (previous == 41 ? 4294967295L : (previous == 42 ? 4294967295L : (previous == 49 ? 4294967295L : 4294967295L))))))))))))));
        v[257] = phi257;
        v[258] = v[257];
        return -1;
    }
}
