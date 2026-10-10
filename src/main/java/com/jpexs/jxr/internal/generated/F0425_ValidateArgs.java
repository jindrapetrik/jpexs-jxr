package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ValidateArgs.
 */
public final class F0425_ValidateArgs {

    private F0425_ValidateArgs() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[151];
        v[0] = a0;
        v[1] = a1;
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
                    case 56:
                        pc = b56(m, v, previous);
                        break;
                    case 57:
                        pc = b57(m, v, previous);
                        break;
                    case 58:
                        pc = b58(m, v, previous);
                        break;
                    case 59:
                        pc = b59(m, v, previous);
                        break;
                    case 60:
                        pc = b60(m, v, previous);
                        break;
                    case 61:
                        pc = b61(m, v, previous);
                        break;
                    case 62:
                        pc = b62(m, v, previous);
                        break;
                    case 63:
                        pc = b63(m, v, previous);
                        break;
                    case 64:
                        pc = b64(m, v, previous);
                        break;
                    case 65:
                        pc = b65(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in ValidateArgs");
                }
                previous = old;
                if (pc < 0) {
                    return v[150];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.load(v[0], 4);
        v[3] = v[2] > 268435456L ? 1L : 0L;
        return v[3] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 72L) + 4L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[2] == 0L ? 1L : 0L;
        v[7] = ((v[5] + 4026531839L)) & 4294967295L;
        v[8] = v[7] < 4026531840L ? 1L : 0L;
        v[9] = ((v[6] | v[8])) & 1L;
        return v[9] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = LibC.call(m, "printf", new long[]{12704L});
        return 65;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[11] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[12] + 4294967295L)) & 4294967295L;
        v[14] = v[13] < 2L ? 1L : 0L;
        return v[14] != 0 ? 4 : 6;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[15] = (v[1] + (Heap.s(0L, 32) * 32860L) + 24L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = v[16] == 2L ? 1L : 0L;
        v[18] = v[2] < 17L ? 1L : 0L;
        v[19] = ((v[18] & v[17])) & 1L;
        return v[19] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[20] = LibC.call(m, "printf", new long[]{12736L});
        return 65;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[21] = (v[1] + (Heap.s(0L, 32) * 32860L) + 40L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = v[22] > 3L ? 1L : 0L;
        return v[23] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        m.store(v[21], 0L, 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[24] = (v[0] + (Heap.s(0L, 32) * 72L) + 12L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        switch ((int) v[25]) {
            case 8:
                return 9;
            case 10:
                return 13;
            case 9:
                return 17;
            default:
                return 21;
        }
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[26] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = v[27] == 7L ? 1L : 0L;
        return v[28] != 0 ? 10 : 12;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[29] = (v[0] + (Heap.s(0L, 32) * 72L) + 16L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = v[30] == 16L ? 1L : 0L;
        return v[31] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[32] = (v[0] + (Heap.s(0L, 32) * 72L) + 20L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = v[33] == 0L ? 1L : 0L;
        return v[34] != 0 ? 22 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[35] = LibC.call(m, "printf", new long[]{12832L});
        return 65;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[36] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = v[37] == 7L ? 1L : 0L;
        return v[38] != 0 ? 14 : 16;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[39] = (v[0] + (Heap.s(0L, 32) * 72L) + 16L) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = v[40] == 16L ? 1L : 0L;
        return v[41] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[42] = (v[0] + (Heap.s(0L, 32) * 72L) + 20L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = v[43] == 0L ? 1L : 0L;
        return v[44] != 0 ? 22 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[45] = LibC.call(m, "printf", new long[]{12864L});
        return 65;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[46] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = v[47] == 7L ? 1L : 0L;
        return v[48] != 0 ? 18 : 20;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[49] = (v[0] + (Heap.s(0L, 32) * 72L) + 16L) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = v[50] == 32L ? 1L : 0L;
        return v[51] != 0 ? 19 : 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[52] = (v[0] + (Heap.s(0L, 32) * 72L) + 20L) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = v[53] == 0L ? 1L : 0L;
        return v[54] != 0 ? 22 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[55] = LibC.call(m, "printf", new long[]{12912L});
        return 65;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[56] = ((v[25] + 4294967288L)) & 4294967295L;
        v[57] = v[56] < 3L ? 1L : 0L;
        return v[57] != 0 ? 22 : 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[58] = v[12] < 3L ? 1L : 0L;
        return v[58] != 0 ? 27 : 26;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[59] = v[25] == 0L ? 1L : 0L;
        return v[59] != 0 ? 24 : 27;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[60] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = v[61] == 0L ? 1L : 0L;
        return v[62] != 0 ? 26 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[63] = LibC.call(m, "printf", new long[]{12960L});
        return 65;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi64 = (previous == 22 ? 3L : 0L);
        v[64] = phi64;
        m.store(v[11], v[64], 4);
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi65 = (previous == 22 ? v[12] : (previous == 23 ? v[12] : v[64]));
        v[65] = phi65;
        v[66] = (v[1] + (Heap.s(0L, 32) * 32860L) + 20L) & 4294967295L;
        v[67] = m.load(v[66], 4);
        v[68] = v[67] == 1L ? 1L : 0L;
        return v[68] != 0 ? 29 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        m.store(v[66], 1L, 4);
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[69] = (v[1] + (Heap.s(0L, 32) * 32860L) + 36L) & 4294967295L;
        v[70] = m.load(v[69], 1);
        v[71] = v[70] > 1L ? 1L : 0L;
        return v[71] != 0 ? 30 : 33;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[72] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = ((v[73] + 4294967295L)) & 4294967295L;
        v[75] = v[74] < 2L ? 1L : 0L;
        return v[75] != 0 ? 32 : 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        switch ((int) v[25]) {
            case 8:
                return 32;
            case 9:
                return 32;
            case 0:
                return 32;
            default:
                return 33;
        }
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[76] = LibC.call(m, "printf", new long[]{13008L});
        return 65;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[77] = ((v[65] + 4294967295L)) & 4294967295L;
        v[78] = v[77] < 2L ? 1L : 0L;
        return v[78] != 0 ? 34 : 37;
    }

    private static int b34(Heap m, long[] v, int previous) {
        switch ((int) v[25]) {
            case 4:
                return 36;
            case 7:
                return 36;
            default:
                return 35;
        }
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[79] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[80] = m.load(v[79], 4);
        v[81] = v[80] == 8L ? 1L : 0L;
        return v[81] != 0 ? 36 : 37;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[82] = LibC.call(m, "printf", new long[]{13056L});
        return 65;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[83] = (v[1] + (Heap.s(0L, 32) * 32860L) + 60L) & 4294967295L;
        v[84] = (v[1] + (Heap.s(0L, 32) * 32860L) + 56L) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = ((v[85] + 1L)) & 4294967295L;
        v[87] = ((v[2] + 15L)) & 4294967295L;
        v[88] = ((v[87] >>> 4L)) & 4294967295L;
        v[89] = F0424_validateTiling.run(m, v[83], v[86], v[88]);
        v[90] = ((v[89] + 4294967295L)) & 4294967295L;
        m.store(v[84], v[90], 4);
        v[91] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16448L) & 4294967295L;
        v[92] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16444L) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = ((v[93] + 1L)) & 4294967295L;
        v[95] = m.load(v[4], 4);
        v[96] = ((v[95] + 15L)) & 4294967295L;
        v[97] = ((v[96] >>> 4L)) & 4294967295L;
        v[98] = F0424_validateTiling.run(m, v[91], v[94], v[97]);
        v[99] = ((v[98] + 4294967295L)) & 4294967295L;
        m.store(v[92], v[99], 4);
        v[100] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32840L) & 4294967295L;
        v[101] = m.load(v[100], 4);
        v[102] = v[101] == 0L ? 1L : 0L;
        return v[102] != 0 ? 47 : 38;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[103] = m.load(v[11], 4);
        v[104] = ((v[103] + 4294967295L)) & 4294967295L;
        v[105] = v[104] < 2L ? 1L : 0L;
        return v[105] != 0 ? 39 : 47;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[106] = (v[1] + (Heap.s(0L, 32) * 32860L) + 24L) & 4294967295L;
        v[107] = m.load(v[106], 4);
        v[108] = v[107] == 2L ? 1L : 0L;
        return v[108] != 0 ? 40 : 47;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[109] = Heap.s(v[98], 32) < Heap.s(2L, 32) ? 1L : 0L;
        return v[109] != 0 ? 45 : 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[110] = m.load(v[91], 4);
        v[111] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[112] = m.load(v[111], 4);
        v[113] = ((v[112] - v[110])) & 4294967295L;
        v[114] = Heap.s(v[113], 32) < Heap.s(2L, 32) ? 1L : 0L;
        return v[114] != 0 ? 45 : 42;
    }

    private static int b42(Heap m, long[] v, int previous) {
        long phi115 = (previous == 43 ? v[120] : v[112]);
        long phi116 = (previous == 43 ? v[117] : 1L);
        v[115] = phi115;
        v[116] = phi116;
        v[117] = ((v[116] + 1L)) & 4294967295L;
        v[118] = v[117] == v[98] ? 1L : 0L;
        return v[118] != 0 ? 44 : 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        v[119] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[117], 32) * 4L)) & 4294967295L;
        v[120] = m.load(v[119], 4);
        v[121] = ((v[120] - v[115])) & 4294967295L;
        v[122] = Heap.s(v[121], 32) < Heap.s(2L, 32) ? 1L : 0L;
        return v[122] != 0 ? 44 : 42;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[123] = Heap.s(v[117], 32) >= Heap.s(v[98], 32) ? 1L : 0L;
        return 45;
    }

    private static int b45(Heap m, long[] v, int previous) {
        long phi124 = (previous == 40 ? 1L : (previous == 41 ? 0L : v[123]));
        v[124] = phi124;
        v[125] = m.load(v[0], 4);
        v[126] = ((v[125] + 15L)) & 4294967295L;
        v[127] = ((v[126] >>> 4L)) & 4294967295L;
        v[128] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[99], 32) * 4L)) & 4294967295L;
        v[129] = m.load(v[128], 4);
        v[130] = ((v[127] - v[129])) & 4294967295L;
        v[131] = Heap.s(v[130], 32) > Heap.s(1L, 32) ? 1L : 0L;
        v[132] = ((v[124] & v[131])) & 1L;
        return v[132] != 0 ? 47 : 46;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[133] = LibC.call(m, "printf", new long[]{13120L});
        return 65;
    }

    private static int b47(Heap m, long[] v, int previous) {
        v[134] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32L) & 4294967295L;
        v[135] = m.load(v[134], 4);
        v[136] = v[135] > 16L ? 1L : 0L;
        return v[136] != 0 ? 65 : 48;
    }

    private static int b48(Heap m, long[] v, int previous) {
        v[137] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[138] = m.load(v[137], 4);
        v[139] = v[138] == 0L ? 1L : 0L;
        v[140] = m.load(v[11], 4);
        return v[139] != 0 ? 49 : 50;
    }

    private static int b49(Heap m, long[] v, int previous) {
        v[141] = v[140] == 0L ? 1L : 0L;
        return v[141] != 0 ? 59 : 53;
    }

    private static int b50(Heap m, long[] v, int previous) {
        switch ((int) v[140]) {
            case 2:
                return 51;
            case 3:
                return 52;
            default:
                return 54;
        }
    }

    private static int b51(Heap m, long[] v, int previous) {
        switch ((int) v[138]) {
            case 1:
                return 53;
            case 6:
                return 55;
            default:
                return 61;
        }
    }

    private static int b52(Heap m, long[] v, int previous) {
        v[142] = v[138] < 3L ? 1L : 0L;
        return v[142] != 0 ? 53 : 54;
    }

    private static int b53(Heap m, long[] v, int previous) {
        m.store(v[11], v[138], 4);
        return 58;
    }

    private static int b54(Heap m, long[] v, int previous) {
        switch ((int) v[138]) {
            case 6:
                return 55;
            case 4:
                return 56;
            default:
                return 58;
        }
    }

    private static int b55(Heap m, long[] v, int previous) {
        m.store(v[11], 6L, 4);
        return 62;
    }

    private static int b56(Heap m, long[] v, int previous) {
        v[143] = v[140] == 6L ? 1L : 0L;
        return v[143] != 0 ? 57 : 58;
    }

    private static int b57(Heap m, long[] v, int previous) {
        m.store(v[11], 4L, 4);
        return 60;
    }

    private static int b58(Heap m, long[] v, int previous) {
        long phi144 = (previous == 56 ? v[140] : (previous == 54 ? v[140] : v[138]));
        v[144] = phi144;
        switch ((int) v[144]) {
            case 6:
                return 62;
            case 0:
                return 59;
            case 4:
                return 60;
            default:
                return 61;
        }
    }

    private static int b59(Heap m, long[] v, int previous) {
        m.store(v[134], 1L, 4);
        return 62;
    }

    private static int b60(Heap m, long[] v, int previous) {
        m.store(v[134], 4L, 4);
        return 62;
    }

    private static int b61(Heap m, long[] v, int previous) {
        m.store(v[134], 3L, 4);
        return 62;
    }

    private static int b62(Heap m, long[] v, int previous) {
        v[145] = m.load(v[21], 4);
        v[146] = v[145] > 4L ? 1L : 0L;
        return v[146] != 0 ? 63 : 64;
    }

    private static int b63(Heap m, long[] v, int previous) {
        m.store(v[21], 0L, 4);
        return 64;
    }

    private static int b64(Heap m, long[] v, int previous) {
        v[147] = (v[0] + (Heap.s(0L, 32) * 72L) + 28L) & 4294967295L;
        m.store(v[147], 0L, 1);
        v[148] = (v[0] + (Heap.s(0L, 32) * 72L) + 29L) & 4294967295L;
        m.store(v[148], 0L, 1);
        return 65;
    }

    private static int b65(Heap m, long[] v, int previous) {
        long phi149 = (previous == 2 ? 4294967295L : (previous == 5 ? 4294967295L : (previous == 12 ? 4294967295L : (previous == 16 ? 4294967295L : (previous == 20 ? 4294967295L : (previous == 25 ? 4294967295L : (previous == 32 ? 4294967295L : (previous == 36 ? 4294967295L : (previous == 46 ? 4294967295L : (previous == 64 ? 0L : 4294967295L))))))))));
        v[149] = phi149;
        v[150] = v[149];
        return -1;
    }
}
