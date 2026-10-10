package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: AdaptiveScan.
 */
public final class F0289_AdaptiveScan {

    private F0289_AdaptiveScan() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4, long a5) {
        long[] v = new long[248];
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
                        throw new IllegalStateException("Invalid block in AdaptiveScan");
                }
                previous = old;
                if (pc < 0) {
                    return v[247];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[6] = v[3] == 0L ? 1L : 0L;
        return v[6] != 0 ? 1 : 9;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[2] + (Heap.s(1L, 32) * 8L) + 4L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[0] + (Heap.s(v[8], 32) * 4L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = (v[2] + (Heap.s(1L, 32) * 8L)) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[13] + 1L)) & 4294967295L;
        m.store(v[12], v[14], 4);
        m.store(v[5], 0L, 4);
        v[15] = (v[5] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[15], v[10], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi16 = (previous == 1 ? 0L : 1L);
        long phi17 = (previous == 1 ? 1L : 0L);
        v[16] = phi16;
        v[17] = phi17;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi18 = (previous == 8 ? v[41] : v[16]);
        long phi19 = (previous == 8 ? v[40] : v[17]);
        long phi20 = (previous == 8 ? v[42] : 2L);
        v[18] = phi18;
        v[19] = phi19;
        v[20] = phi20;
        v[21] = (v[2] + (Heap.s(v[20], 32) * 8L)) & 4294967295L;
        v[22] = (v[2] + (Heap.s(v[20], 32) * 8L) + 4L) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = (v[0] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = ((v[19] + 1L)) & 4294967295L;
        v[27] = v[25] == 0L ? 1L : 0L;
        return v[27] != 0 ? 8 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[28] = m.load(v[21], 4);
        v[29] = ((v[28] + 1L)) & 4294967295L;
        m.store(v[21], v[29], 4);
        v[30] = (v[21] + (Heap.s(4294967295L, 32) * 8L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = v[29] > v[31] ? 1L : 0L;
        return v[32] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[33] = m.load(v[21], 8);
        v[34] = m.load(v[30], 8);
        m.store(v[21], v[34], 8);
        m.store(v[30], v[33], 8);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[35] = ((v[18] << 1L)) & 4294967295L;
        v[36] = (v[5] + (Heap.s(v[35], 32) * 4L)) & 4294967295L;
        m.store(v[36], v[19], 4);
        v[37] = ((v[35] | 1L)) & 4294967295L;
        v[38] = (v[5] + (Heap.s(v[37], 32) * 4L)) & 4294967295L;
        m.store(v[38], v[25], 4);
        v[39] = ((v[18] + 1L)) & 4294967295L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi40 = (previous == 7 ? 0L : v[26]);
        long phi41 = (previous == 7 ? v[39] : v[18]);
        v[40] = phi40;
        v[41] = phi41;
        v[42] = ((v[20] + 1L)) & 4294967295L;
        v[43] = v[42] == 16L ? 1L : 0L;
        return v[43] != 0 ? 39 : 4;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[44] = Heap.s(v[3], 32) > Heap.s(v[4], 32) ? 1L : 0L;
        return v[44] != 0 ? 18 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[45] = ((4294967295L << v[3])) & 4294967295L;
        v[46] = ((v[45] ^ 4294967295L)) & 4294967295L;
        v[47] = ((v[46] << 1L)) & 4294967295L;
        v[48] = (v[2] + (Heap.s(1L, 32) * 8L) + 4L) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = (v[0] + (Heap.s(v[49], 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = ((v[51] + v[46])) & 4294967295L;
        v[53] = v[52] > v[47] ? 1L : 0L;
        return v[53] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[54] = (v[2] + (Heap.s(1L, 32) * 8L)) & 4294967295L;
        v[55] = LibC.call(m, "abs", new long[]{v[51]});
        v[56] = ((Heap.s(v[55], 32) >> v[3])) & 4294967295L;
        v[57] = m.load(v[54], 4);
        v[58] = ((v[57] + 1L)) & 4294967295L;
        m.store(v[54], v[58], 4);
        m.store(v[5], 0L, 4);
        v[59] = Heap.s(v[51], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[60] = ((0L - v[56])) & 4294967295L;
        v[61] = v[59] != 0 ? v[60] : v[56];
        v[62] = (v[5] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[62], v[61], 4);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi63 = (previous == 10 ? 1L : 0L);
        long phi64 = (previous == 10 ? 0L : 1L);
        v[63] = phi63;
        v[64] = phi64;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi65 = (previous == 17 ? v[95] : 2L);
        long phi66 = (previous == 17 ? v[94] : v[63]);
        long phi67 = (previous == 17 ? v[93] : v[64]);
        v[65] = phi65;
        v[66] = phi66;
        v[67] = phi67;
        v[68] = ((v[66] + 1L)) & 4294967295L;
        v[69] = (v[2] + (Heap.s(v[65], 32) * 8L)) & 4294967295L;
        v[70] = (v[2] + (Heap.s(v[65], 32) * 8L) + 4L) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = (v[0] + (Heap.s(v[71], 32) * 4L)) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = ((v[73] + v[46])) & 4294967295L;
        v[75] = v[74] > v[47] ? 1L : 0L;
        return v[75] != 0 ? 14 : 17;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[76] = LibC.call(m, "abs", new long[]{v[73]});
        v[77] = ((Heap.s(v[76], 32) >> v[3])) & 4294967295L;
        v[78] = m.load(v[69], 4);
        v[79] = ((v[78] + 1L)) & 4294967295L;
        m.store(v[69], v[79], 4);
        v[80] = (v[69] + (Heap.s(4294967295L, 32) * 8L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = v[79] > v[81] ? 1L : 0L;
        return v[82] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[83] = m.load(v[69], 8);
        v[84] = m.load(v[80], 8);
        m.store(v[69], v[84], 8);
        m.store(v[80], v[83], 8);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[85] = ((v[67] << 1L)) & 4294967295L;
        v[86] = (v[5] + (Heap.s(v[85], 32) * 4L)) & 4294967295L;
        m.store(v[86], v[66], 4);
        v[87] = Heap.s(v[73], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[88] = ((0L - v[77])) & 4294967295L;
        v[89] = v[87] != 0 ? v[88] : v[77];
        v[90] = ((v[85] | 1L)) & 4294967295L;
        v[91] = (v[5] + (Heap.s(v[90], 32) * 4L)) & 4294967295L;
        m.store(v[91], v[89], 4);
        v[92] = ((v[67] + 1L)) & 4294967295L;
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi93 = (previous == 16 ? v[92] : v[67]);
        long phi94 = (previous == 16 ? 0L : v[68]);
        v[93] = phi93;
        v[94] = phi94;
        v[95] = ((v[65] + 1L)) & 4294967295L;
        v[96] = v[95] == 16L ? 1L : 0L;
        return v[96] != 0 ? 39 : 13;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[97] = v[4] == 0L ? 1L : 0L;
        v[98] = Heap.s(v[3], 32) < Heap.s(6L, 32) ? 1L : 0L;
        v[99] = ((v[98] & v[97])) & 1L;
        v[100] = ((4294967295L << v[3])) & 4294967295L;
        v[101] = ((v[100] ^ 4294967295L)) & 4294967295L;
        v[102] = ((v[101] << 1L)) & 4294967295L;
        v[103] = (v[2] + (Heap.s(1L, 32) * 8L) + 4L) & 4294967295L;
        v[104] = m.load(v[103], 4);
        v[105] = (v[0] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        v[106] = m.load(v[105], 4);
        v[107] = ((v[106] + v[101])) & 4294967295L;
        v[108] = v[107] > v[102] ? 1L : 0L;
        return v[99] != 0 ? 19 : 29;
    }

    private static int b19(Heap m, long[] v, int previous) {
        return v[108] != 0 ? 20 : 21;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[109] = (v[2] + (Heap.s(1L, 32) * 8L)) & 4294967295L;
        v[110] = LibC.call(m, "abs", new long[]{v[106]});
        v[111] = ((Heap.s(v[110], 32) >> v[3])) & 4294967295L;
        v[112] = ((v[110] & v[101])) & 4294967295L;
        v[113] = ((v[112] << 1L)) & 4294967295L;
        v[114] = m.load(v[103], 4);
        v[115] = (v[1] + (Heap.s(v[114], 32) * 4L)) & 4294967295L;
        m.store(v[115], v[113], 4);
        v[116] = m.load(v[109], 4);
        v[117] = ((v[116] + 1L)) & 4294967295L;
        m.store(v[109], v[117], 4);
        m.store(v[5], 0L, 4);
        v[118] = Heap.s(v[106], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[119] = ((0L - v[111])) & 4294967295L;
        v[120] = v[118] != 0 ? v[119] : v[111];
        v[121] = (v[5] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[121], v[120], 4);
        return 22;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[122] = ((v[106] + 32L)) & 4294967295L;
        v[123] = (10576L + (Heap.s(0L, 32) * 260L) + (Heap.s(v[122], 32) * 4L)) & 4294967295L;
        v[124] = m.load(v[123], 4);
        v[125] = (v[1] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        m.store(v[125], v[124], 4);
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi126 = (previous == 20 ? 0L : 1L);
        long phi127 = (previous == 20 ? 1L : 0L);
        v[126] = phi126;
        v[127] = phi127;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi128 = (previous == 28 ? v[166] : 2L);
        long phi129 = (previous == 28 ? v[165] : v[126]);
        long phi130 = (previous == 28 ? v[164] : v[127]);
        v[128] = phi128;
        v[129] = phi129;
        v[130] = phi130;
        v[131] = (v[2] + (Heap.s(v[128], 32) * 8L)) & 4294967295L;
        v[132] = (v[2] + (Heap.s(v[128], 32) * 8L) + 4L) & 4294967295L;
        v[133] = m.load(v[132], 4);
        v[134] = (v[0] + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        v[135] = m.load(v[134], 4);
        v[136] = ((v[135] + v[101])) & 4294967295L;
        v[137] = v[136] > v[102] ? 1L : 0L;
        return v[137] != 0 ? 24 : 27;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[138] = ((Heap.s(v[135], 32) >> 31L)) & 4294967295L;
        v[139] = ((v[138] ^ v[135])) & 4294967295L;
        v[140] = ((v[139] - v[138])) & 4294967295L;
        v[141] = ((Heap.s(v[140], 32) >> v[3])) & 4294967295L;
        v[142] = ((v[140] & v[101])) & 4294967295L;
        v[143] = ((v[142] << 1L)) & 4294967295L;
        v[144] = (v[1] + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        m.store(v[144], v[143], 4);
        v[145] = m.load(v[131], 4);
        v[146] = ((v[145] + 1L)) & 4294967295L;
        m.store(v[131], v[146], 4);
        v[147] = (v[131] + (Heap.s(4294967295L, 32) * 8L)) & 4294967295L;
        v[148] = m.load(v[147], 4);
        v[149] = v[146] > v[148] ? 1L : 0L;
        return v[149] != 0 ? 25 : 26;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[150] = m.load(v[131], 8);
        v[151] = m.load(v[147], 8);
        m.store(v[131], v[151], 8);
        m.store(v[147], v[150], 8);
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[152] = ((v[130] << 1L)) & 4294967295L;
        v[153] = (v[5] + (Heap.s(v[152], 32) * 4L)) & 4294967295L;
        m.store(v[153], v[129], 4);
        v[154] = ((v[141] ^ v[138])) & 4294967295L;
        v[155] = ((v[154] - v[138])) & 4294967295L;
        v[156] = ((v[152] | 1L)) & 4294967295L;
        v[157] = (v[5] + (Heap.s(v[156], 32) * 4L)) & 4294967295L;
        m.store(v[157], v[155], 4);
        v[158] = ((v[130] + 1L)) & 4294967295L;
        return 28;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[159] = ((v[129] + 1L)) & 4294967295L;
        v[160] = ((v[135] + 32L)) & 4294967295L;
        v[161] = (10576L + (Heap.s(0L, 32) * 260L) + (Heap.s(v[160], 32) * 4L)) & 4294967295L;
        v[162] = m.load(v[161], 4);
        v[163] = (v[1] + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        m.store(v[163], v[162], 4);
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi164 = (previous == 26 ? v[158] : v[130]);
        long phi165 = (previous == 26 ? 0L : v[159]);
        v[164] = phi164;
        v[165] = phi165;
        v[166] = ((v[128] + 1L)) & 4294967295L;
        v[167] = v[166] == 16L ? 1L : 0L;
        return v[167] != 0 ? 39 : 23;
    }

    private static int b29(Heap m, long[] v, int previous) {
        return v[108] != 0 ? 30 : 31;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[168] = (v[2] + (Heap.s(1L, 32) * 8L)) & 4294967295L;
        v[169] = LibC.call(m, "abs", new long[]{v[106]});
        v[170] = ((Heap.s(v[169], 32) >> v[3])) & 4294967295L;
        v[171] = ((v[169] & v[101])) & 4294967295L;
        v[172] = ((v[171] >>> v[4])) & 4294967295L;
        v[173] = ((v[172] << 1L)) & 4294967295L;
        v[174] = m.load(v[103], 4);
        v[175] = (v[1] + (Heap.s(v[174], 32) * 4L)) & 4294967295L;
        m.store(v[175], v[173], 4);
        v[176] = m.load(v[168], 4);
        v[177] = ((v[176] + 1L)) & 4294967295L;
        m.store(v[168], v[177], 4);
        m.store(v[5], 0L, 4);
        v[178] = Heap.s(v[106], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[179] = ((0L - v[170])) & 4294967295L;
        v[180] = v[178] != 0 ? v[179] : v[170];
        v[181] = (v[5] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[181], v[180], 4);
        return 32;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[182] = ((Heap.s(v[106], 32) >> 31L)) & 4294967295L;
        v[183] = ((v[182] + v[106])) & 4294967295L;
        v[184] = ((Heap.s(v[183], 32) >> v[4])) & 4294967295L;
        v[185] = ((v[184] - v[182])) & 4294967295L;
        v[186] = ((Heap.s(v[185], 32) >> 31L)) & 4294967295L;
        v[187] = ((v[186] ^ v[185])) & 4294967295L;
        v[188] = ((v[187] << 2L)) & 4294967295L;
        v[189] = ((v[186] & 6L)) & 4294967295L;
        v[190] = ((v[188] + v[189])) & 4294967295L;
        v[191] = v[184] != v[182] ? 1L : 0L;
        v[192] = (v[191]) & 4294967295L;
        v[193] = ((v[190] | v[192])) & 4294967295L;
        v[194] = (v[1] + (Heap.s(v[104], 32) * 4L)) & 4294967295L;
        m.store(v[194], v[193], 4);
        return 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        long phi195 = (previous == 31 ? 0L : 1L);
        long phi196 = (previous == 31 ? 1L : 0L);
        v[195] = phi195;
        v[196] = phi196;
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi197 = (previous == 38 ? v[243] : v[195]);
        long phi198 = (previous == 38 ? v[242] : v[196]);
        long phi199 = (previous == 38 ? v[244] : 2L);
        v[197] = phi197;
        v[198] = phi198;
        v[199] = phi199;
        v[200] = (v[2] + (Heap.s(v[199], 32) * 8L)) & 4294967295L;
        v[201] = (v[2] + (Heap.s(v[199], 32) * 8L) + 4L) & 4294967295L;
        v[202] = m.load(v[201], 4);
        v[203] = (v[0] + (Heap.s(v[202], 32) * 4L)) & 4294967295L;
        v[204] = m.load(v[203], 4);
        v[205] = ((v[204] + v[101])) & 4294967295L;
        v[206] = v[205] > v[102] ? 1L : 0L;
        return v[206] != 0 ? 34 : 37;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[207] = LibC.call(m, "abs", new long[]{v[204]});
        v[208] = ((Heap.s(v[207], 32) >> v[3])) & 4294967295L;
        v[209] = ((v[207] & v[101])) & 4294967295L;
        v[210] = ((v[209] >>> v[4])) & 4294967295L;
        v[211] = ((v[210] << 1L)) & 4294967295L;
        v[212] = (v[1] + (Heap.s(v[202], 32) * 4L)) & 4294967295L;
        m.store(v[212], v[211], 4);
        v[213] = m.load(v[200], 4);
        v[214] = ((v[213] + 1L)) & 4294967295L;
        m.store(v[200], v[214], 4);
        v[215] = (v[200] + (Heap.s(4294967295L, 32) * 8L)) & 4294967295L;
        v[216] = m.load(v[215], 4);
        v[217] = v[214] > v[216] ? 1L : 0L;
        return v[217] != 0 ? 35 : 36;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[218] = m.load(v[200], 8);
        v[219] = m.load(v[215], 8);
        m.store(v[200], v[219], 8);
        m.store(v[215], v[218], 8);
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[220] = ((v[197] << 1L)) & 4294967295L;
        v[221] = (v[5] + (Heap.s(v[220], 32) * 4L)) & 4294967295L;
        m.store(v[221], v[198], 4);
        v[222] = Heap.s(v[204], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[223] = ((0L - v[208])) & 4294967295L;
        v[224] = v[222] != 0 ? v[223] : v[208];
        v[225] = ((v[220] | 1L)) & 4294967295L;
        v[226] = (v[5] + (Heap.s(v[225], 32) * 4L)) & 4294967295L;
        m.store(v[226], v[224], 4);
        v[227] = ((v[197] + 1L)) & 4294967295L;
        return 38;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[228] = ((v[198] + 1L)) & 4294967295L;
        v[229] = ((Heap.s(v[204], 32) >> 31L)) & 4294967295L;
        v[230] = ((v[229] + v[204])) & 4294967295L;
        v[231] = ((Heap.s(v[230], 32) >> v[4])) & 4294967295L;
        v[232] = ((v[231] - v[229])) & 4294967295L;
        v[233] = ((Heap.s(v[232], 32) >> 31L)) & 4294967295L;
        v[234] = ((v[233] ^ v[232])) & 4294967295L;
        v[235] = ((v[234] << 2L)) & 4294967295L;
        v[236] = ((v[233] & 6L)) & 4294967295L;
        v[237] = ((v[235] + v[236])) & 4294967295L;
        v[238] = v[231] != v[229] ? 1L : 0L;
        v[239] = (v[238]) & 4294967295L;
        v[240] = ((v[237] | v[239])) & 4294967295L;
        v[241] = (v[1] + (Heap.s(v[202], 32) * 4L)) & 4294967295L;
        m.store(v[241], v[240], 4);
        return 38;
    }

    private static int b38(Heap m, long[] v, int previous) {
        long phi242 = (previous == 36 ? 0L : v[228]);
        long phi243 = (previous == 36 ? v[227] : v[197]);
        v[242] = phi242;
        v[243] = phi243;
        v[244] = ((v[199] + 1L)) & 4294967295L;
        v[245] = v[244] == 16L ? 1L : 0L;
        return v[245] != 0 ? 39 : 33;
    }

    private static int b39(Heap m, long[] v, int previous) {
        long phi246 = (previous == 8 ? v[41] : (previous == 28 ? v[164] : (previous == 38 ? v[243] : v[93])));
        v[246] = phi246;
        v[247] = v[246];
        return -1;
    }
}
