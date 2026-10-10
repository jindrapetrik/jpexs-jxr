package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: StreamCalcIFDSize.
 */
public final class F0237_StreamCalcIFDSize {

    private F0237_StreamCalcIFDSize() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[188];
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
                    default:
                        throw new IllegalStateException("Invalid block in StreamCalcIFDSize");
                }
                previous = old;
                if (pc < 0) {
                    return v[187];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(1L * 1L, 1);
        v[4] = m.stack(1L * 1L, 1);
        v[5] = m.stack(1L * 1L, 1);
        v[6] = m.stack(1L * 1L, 1);
        v[7] = m.stack(1L * 1L, 1);
        v[8] = m.stack(4L * 1L, 4);
        v[9] = m.stack(4L * 1L, 4);
        v[10] = m.stack(4L * 1L, 4);
        v[11] = m.stack(4L * 1L, 4);
        m.store(v[8], 0L, 4);
        m.store(v[9], 0L, 4);
        m.store(v[10], 0L, 4);
        m.store(v[11], 0L, 4);
        m.store(v[2], 0L, 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = Dispatch.call(m, v[13], new long[]{v[0], v[8]});
        v[15] = Heap.s(v[14], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[15] != 0 ? 39 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[16] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = Dispatch.call(m, v[17], new long[]{v[0], v[1]});
        v[19] = Heap.s(v[18], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[19] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[20] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = Dispatch.call(m, v[21], new long[]{v[0], v[7], 1L});
        v[23] = Heap.s(v[22], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[23] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[24] = m.load(v[7], 1);
        v[25] = m.load(v[20], 4);
        v[26] = Dispatch.call(m, v[25], new long[]{v[0], v[7], 1L});
        v[27] = Heap.s(v[26], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[27] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return 37;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[28] = (v[24]) & 4294967295L;
        v[29] = m.load(v[7], 1);
        v[30] = (v[29]) & 4294967295L;
        v[31] = ((v[30] << 8L)) & 4294967295L;
        v[32] = ((v[31] | v[28])) & 4294967295L;
        v[33] = m.load(10048L, 4);
        v[34] = ((v[32] * v[33])) & 4294967295L;
        v[35] = ((v[34] + 6L)) & 4294967295L;
        v[36] = v[32] == 0L ? 1L : 0L;
        return v[36] != 0 ? 35 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[37] = ((v[1] + 2L)) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi38 = (previous == 6 ? v[35] : v[152]);
        long phi39 = (previous == 6 ? v[37] : v[153]);
        long phi40 = (previous == 6 ? 0L : v[154]);
        v[38] = phi38;
        v[39] = phi39;
        v[40] = phi40;
        v[41] = m.load(v[16], 4);
        v[42] = Dispatch.call(m, v[41], new long[]{v[0], v[39]});
        v[43] = Heap.s(v[42], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[43] != 0 ? 10 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[44] = m.load(v[20], 4);
        v[45] = Dispatch.call(m, v[44], new long[]{v[0], v[6], 1L});
        v[46] = Heap.s(v[45], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[46] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[47] = m.load(v[6], 1);
        v[48] = m.load(v[20], 4);
        v[49] = Dispatch.call(m, v[48], new long[]{v[0], v[6], 1L});
        v[50] = Heap.s(v[49], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[50] != 0 ? 10 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi51 = (previous == 9 ? v[49] : (previous == 8 ? v[45] : v[42]));
        v[51] = phi51;
        return 36;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[52] = (v[47]) & 65535L;
        v[53] = m.load(v[6], 1);
        v[54] = (v[53]) & 65535L;
        v[55] = ((v[54] << 8L)) & 65535L;
        v[56] = ((v[55] | v[52])) & 65535L;
        v[57] = ((v[39] + 2L)) & 4294967295L;
        v[58] = m.load(v[16], 4);
        v[59] = Dispatch.call(m, v[58], new long[]{v[0], v[57]});
        v[60] = Heap.s(v[59], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[60] != 0 ? 14 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[61] = m.load(v[20], 4);
        v[62] = Dispatch.call(m, v[61], new long[]{v[0], v[5], 1L});
        v[63] = Heap.s(v[62], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[63] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[64] = m.load(v[5], 1);
        v[65] = m.load(v[20], 4);
        v[66] = Dispatch.call(m, v[65], new long[]{v[0], v[5], 1L});
        v[67] = Heap.s(v[66], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[67] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi68 = (previous == 13 ? v[66] : (previous == 12 ? v[62] : v[59]));
        v[68] = phi68;
        return 36;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[69] = (v[64]) & 65535L;
        v[70] = m.load(v[5], 1);
        v[71] = (v[70]) & 65535L;
        v[72] = ((v[71] << 8L)) & 65535L;
        v[73] = ((v[72] | v[69])) & 65535L;
        v[74] = ((v[39] + 4L)) & 4294967295L;
        v[75] = m.load(v[16], 4);
        v[76] = Dispatch.call(m, v[75], new long[]{v[0], v[74]});
        v[77] = Heap.s(v[76], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[77] != 0 ? 20 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[78] = m.load(v[20], 4);
        v[79] = Dispatch.call(m, v[78], new long[]{v[0], v[4], 1L});
        v[80] = Heap.s(v[79], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[80] != 0 ? 20 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[81] = m.load(v[4], 1);
        v[82] = m.load(v[20], 4);
        v[83] = Dispatch.call(m, v[82], new long[]{v[0], v[4], 1L});
        v[84] = Heap.s(v[83], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[84] != 0 ? 20 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[85] = m.load(v[4], 1);
        v[86] = m.load(v[20], 4);
        v[87] = Dispatch.call(m, v[86], new long[]{v[0], v[4], 1L});
        v[88] = Heap.s(v[87], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[88] != 0 ? 20 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[89] = m.load(v[4], 1);
        v[90] = m.load(v[20], 4);
        v[91] = Dispatch.call(m, v[90], new long[]{v[0], v[4], 1L});
        v[92] = Heap.s(v[91], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[92] != 0 ? 20 : 21;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi93 = (previous == 19 ? v[91] : (previous == 18 ? v[87] : (previous == 17 ? v[83] : (previous == 16 ? v[79] : v[76]))));
        v[93] = phi93;
        return 36;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[94] = (v[89]) & 4294967295L;
        v[95] = ((v[94] << 16L)) & 4294967295L;
        v[96] = (v[85]) & 4294967295L;
        v[97] = ((v[96] << 8L)) & 4294967295L;
        v[98] = (v[81]) & 4294967295L;
        v[99] = ((v[97] | v[98])) & 4294967295L;
        v[100] = ((v[99] | v[95])) & 4294967295L;
        v[101] = m.load(v[4], 1);
        v[102] = (v[101]) & 4294967295L;
        v[103] = ((v[102] << 24L)) & 4294967295L;
        v[104] = ((v[100] | v[103])) & 4294967295L;
        v[105] = ((v[39] + 8L)) & 4294967295L;
        v[106] = m.load(v[16], 4);
        v[107] = Dispatch.call(m, v[106], new long[]{v[0], v[105]});
        v[108] = Heap.s(v[107], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[108] != 0 ? 26 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[109] = m.load(v[20], 4);
        v[110] = Dispatch.call(m, v[109], new long[]{v[0], v[3], 1L});
        v[111] = Heap.s(v[110], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[111] != 0 ? 26 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[112] = m.load(v[3], 1);
        v[113] = m.load(v[20], 4);
        v[114] = Dispatch.call(m, v[113], new long[]{v[0], v[3], 1L});
        v[115] = Heap.s(v[114], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[115] != 0 ? 26 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[116] = m.load(v[3], 1);
        v[117] = m.load(v[20], 4);
        v[118] = Dispatch.call(m, v[117], new long[]{v[0], v[3], 1L});
        v[119] = Heap.s(v[118], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[119] != 0 ? 26 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[120] = m.load(v[3], 1);
        v[121] = m.load(v[20], 4);
        v[122] = Dispatch.call(m, v[121], new long[]{v[0], v[3], 1L});
        v[123] = Heap.s(v[122], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[123] != 0 ? 26 : 27;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi124 = (previous == 25 ? v[122] : (previous == 24 ? v[118] : (previous == 23 ? v[114] : (previous == 22 ? v[110] : v[107]))));
        v[124] = phi124;
        return 36;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[125] = (v[120]) & 4294967295L;
        v[126] = ((v[125] << 16L)) & 4294967295L;
        v[127] = (v[116]) & 4294967295L;
        v[128] = ((v[127] << 8L)) & 4294967295L;
        v[129] = (v[112]) & 4294967295L;
        v[130] = ((v[128] | v[129])) & 4294967295L;
        v[131] = ((v[130] | v[126])) & 4294967295L;
        v[132] = m.load(v[3], 1);
        v[133] = (v[132]) & 4294967295L;
        v[134] = ((v[133] << 24L)) & 4294967295L;
        v[135] = ((v[131] | v[134])) & 4294967295L;
        v[136] = (v[73]) & 4294967295L;
        v[137] = ((v[73] + 65523L)) & 65535L;
        v[138] = v[137] < 65524L ? 1L : 0L;
        return v[138] != 0 ? 36 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        switch ((int) v[56]) {
            case 34665:
                return 29;
            case 34853:
                return 30;
            case 40965:
                return 31;
            default:
                return 32;
        }
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[139] = F0237_StreamCalcIFDSize.run(m, v[0], v[135], v[9]);
        v[140] = Heap.s(v[139], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[140] != 0 ? 36 : 33;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[141] = F0237_StreamCalcIFDSize.run(m, v[0], v[135], v[10]);
        v[142] = Heap.s(v[141], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[142] != 0 ? 36 : 33;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[143] = F0237_StreamCalcIFDSize.run(m, v[0], v[135], v[11]);
        v[144] = Heap.s(v[143], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[144] != 0 ? 36 : 33;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[145] = (10064L + (Heap.s(0L, 32) * 52L) + (Heap.s(v[136], 32) * 4L)) & 4294967295L;
        v[146] = m.load(v[145], 4);
        v[147] = ((v[146] * v[104])) & 4294967295L;
        v[148] = v[147] > 4L ? 1L : 0L;
        v[149] = v[148] != 0 ? v[147] : 0L;
        v[150] = ((v[149] + v[38])) & 4294967295L;
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi151 = (previous == 29 ? v[139] : (previous == 30 ? v[141] : (previous == 31 ? v[143] : 0L)));
        long phi152 = (previous == 29 ? v[38] : (previous == 30 ? v[38] : (previous == 31 ? v[38] : v[150])));
        v[151] = phi151;
        v[152] = phi152;
        v[153] = ((v[39] + v[33])) & 4294967295L;
        v[154] = ((v[40] + 1L)) & 4294967295L;
        v[155] = v[154] == v[32] ? 1L : 0L;
        return v[155] != 0 ? 34 : 7;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[156] = m.load(v[9], 4);
        v[157] = (v[156]) & 4294967295L;
        v[158] = m.load(v[10], 4);
        v[159] = (v[158]) & 4294967295L;
        v[160] = m.load(v[11], 4);
        v[161] = (v[160]) & 4294967295L;
        v[162] = v[157] == 0L ? 1L : 0L;
        v[163] = ((v[152] & 1L)) & 4294967295L;
        v[164] = ((v[157] + v[163])) & 4294967295L;
        v[165] = v[162] != 0 ? 0L : v[164];
        v[166] = ((v[165] + v[152])) & 4294967295L;
        v[167] = v[159] == 0L ? 1L : 0L;
        v[168] = ((v[166] & 1L)) & 4294967295L;
        v[169] = ((v[168] + v[159])) & 4294967295L;
        v[170] = v[167] != 0 ? 0L : v[169];
        v[171] = ((v[170] + v[166])) & 4294967295L;
        v[172] = v[161] == 0L ? 1L : 0L;
        v[173] = ((v[171] & 1L)) & 4294967295L;
        v[174] = ((v[173] + v[161])) & 4294967295L;
        v[175] = v[172] != 0 ? 0L : v[174];
        return 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        long phi176 = (previous == 5 ? v[35] : v[171]);
        long phi177 = (previous == 5 ? v[26] : v[151]);
        long phi178 = (previous == 5 ? 0L : v[175]);
        v[176] = phi176;
        v[177] = phi177;
        v[178] = phi178;
        v[179] = ((v[178] + v[176])) & 4294967295L;
        m.store(v[2], v[179], 4);
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        long phi180 = (previous == 35 ? v[177] : (previous == 10 ? v[51] : (previous == 14 ? v[68] : (previous == 20 ? v[93] : (previous == 26 ? v[124] : (previous == 31 ? v[143] : (previous == 30 ? v[141] : (previous == 29 ? v[139] : 4294967190L))))))));
        v[180] = phi180;
        return v[15] != 0 ? 39 : 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[181] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        return 38;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[182] = m.load(v[181], 4);
        v[183] = m.load(v[8], 4);
        v[184] = Dispatch.call(m, v[182], new long[]{v[0], v[183]});
        v[185] = Heap.s(v[184], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[185] != 0 ? 38 : 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        long phi186 = (previous == 36 ? v[180] : (previous == 0 ? v[14] : v[184]));
        v[186] = phi186;
        v[187] = v[186];
        return -1;
    }
}
