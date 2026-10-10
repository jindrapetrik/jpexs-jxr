package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getROI.
 */
public final class F0258_getROI {

    private F0258_getROI() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[359];
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
                    default:
                        throw new IllegalStateException("Invalid block in getROI");
                }
                previous = old;
                if (pc < 0) {
                    return v[358];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[3] + (Heap.s(0L, 32) * 36L) + 28L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = LibC.call(m, "malloc", new long[]{16384L});
        v[7] = v[6] == 0L ? 1L : 0L;
        return v[7] != 0 ? 61 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = m.load(v[3], 4);
        v[9] = (v[3] + (Heap.s(0L, 32) * 36L) + 4L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((v[10] + v[8])) & 4294967295L;
        v[12] = m.load(v[0], 4);
        v[13] = v[11] > v[12] ? 1L : 0L;
        return v[13] != 0 ? 61 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[14] = (v[3] + (Heap.s(0L, 32) * 36L) + 8L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[3] + (Heap.s(0L, 32) * 36L) + 12L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = ((v[17] + v[15])) & 4294967295L;
        v[19] = (v[0] + (Heap.s(0L, 32) * 72L) + 4L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = v[18] > v[20] ? 1L : 0L;
        return v[21] != 0 ? 61 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[22] = (v[1] + (Heap.s(0L, 32) * 112L) + 44L) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = ((v[23] + v[8])) & 4294967295L;
        v[25] = (v[1] + (Heap.s(0L, 32) * 112L) + 40L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = ((v[26] + v[15])) & 4294967295L;
        v[28] = (v[2] + (Heap.s(0L, 32) * 32860L) + 24L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = v[29] == 0L ? 1L : 0L;
        return v[30] != 0 ? 6 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[31] = (v[3] + (Heap.s(0L, 32) * 36L) + 32L) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = v[32] == 0L ? 1L : 0L;
        return v[33] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[34] = v[29] == 2L ? 1L : 0L;
        v[35] = v[34] != 0 ? 10L : 2L;
        v[36] = LibC.call(m, "llvm.umin.i32", new long[]{v[24], v[35]});
        v[37] = LibC.call(m, "llvm.usub.sat.i32", new long[]{v[24], v[35]});
        v[38] = LibC.call(m, "llvm.umin.i32", new long[]{v[27], v[35]});
        v[39] = LibC.call(m, "llvm.usub.sat.i32", new long[]{v[27], v[35]});
        v[40] = ((v[35] + v[10])) & 4294967295L;
        v[41] = ((v[40] + v[36])) & 4294967295L;
        v[42] = ((v[35] + v[17])) & 4294967295L;
        v[43] = ((v[42] + v[38])) & 4294967295L;
        v[44] = ((v[41] + v[37])) & 4294967295L;
        v[45] = ((v[23] + v[12])) & 4294967295L;
        v[46] = (v[1] + (Heap.s(0L, 32) * 112L) + 52L) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = ((v[45] + v[47])) & 4294967295L;
        v[49] = v[44] > v[48] ? 1L : 0L;
        v[50] = ((v[48] - v[37])) & 4294967295L;
        v[51] = v[49] != 0 ? v[50] : v[41];
        v[52] = ((v[43] + v[39])) & 4294967295L;
        v[53] = ((v[26] + v[20])) & 4294967295L;
        v[54] = (v[1] + (Heap.s(0L, 32) * 112L) + 48L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = ((v[53] + v[55])) & 4294967295L;
        v[57] = v[52] > v[56] ? 1L : 0L;
        v[58] = ((v[56] - v[39])) & 4294967295L;
        v[59] = v[57] != 0 ? v[58] : v[43];
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi60 = (previous == 5 ? v[59] : (previous == 4 ? v[17] : v[17]));
        long phi61 = (previous == 5 ? v[51] : (previous == 4 ? v[10] : v[10]));
        long phi62 = (previous == 5 ? v[39] : (previous == 4 ? v[27] : v[27]));
        long phi63 = (previous == 5 ? v[37] : (previous == 4 ? v[24] : v[24]));
        v[60] = phi60;
        v[61] = phi61;
        v[62] = phi62;
        v[63] = phi63;
        v[64] = ((v[62] >>> 4L)) & 4294967295L;
        v[65] = ((v[63] >>> 4L)) & 4294967295L;
        v[66] = ((v[60] + 15L)) & 4294967295L;
        v[67] = ((v[66] + v[62])) & 4294967295L;
        v[68] = ((v[67] >>> 4L)) & 4294967295L;
        v[69] = ((v[61] + 15L)) & 4294967295L;
        v[70] = ((v[69] + v[63])) & 4294967295L;
        v[71] = ((v[70] >>> 4L)) & 4294967295L;
        v[72] = ((v[63] & 4294967280L)) & 4294967295L;
        v[73] = ((v[8] - v[72])) & 4294967295L;
        v[74] = ((v[73] + v[23])) & 4294967295L;
        m.store(v[22], v[74], 4);
        v[75] = ((v[71] - v[65])) & 4294967295L;
        v[76] = ((v[75] << 4L)) & 4294967295L;
        v[77] = ((v[74] + v[10])) & 4294967295L;
        v[78] = ((v[76] - v[77])) & 4294967295L;
        v[79] = (v[1] + (Heap.s(0L, 32) * 112L) + 52L) & 4294967295L;
        m.store(v[79], v[78], 4);
        v[80] = ((v[62] & 4294967280L)) & 4294967295L;
        v[81] = ((v[15] - v[80])) & 4294967295L;
        v[82] = ((v[81] + v[26])) & 4294967295L;
        m.store(v[25], v[82], 4);
        v[83] = ((v[68] - v[64])) & 4294967295L;
        v[84] = ((v[83] << 4L)) & 4294967295L;
        v[85] = ((v[82] + v[17])) & 4294967295L;
        v[86] = ((v[84] - v[85])) & 4294967295L;
        v[87] = (v[1] + (Heap.s(0L, 32) * 112L) + 48L) & 4294967295L;
        m.store(v[87], v[86], 4);
        m.store(v[0], v[10], 4);
        m.store(v[19], v[17], 4);
        m.store(v[3], v[63], 4);
        m.store(v[14], v[62], 4);
        m.store(v[9], v[61], 4);
        m.store(v[16], v[60], 4);
        switch ((int) v[5]) {
            case 7:
                return 7;
            case 5:
                return 7;
            case 3:
                return 7;
            case 2:
                return 7;
            case 4:
                return 8;
            case 1:
                return 8;
            default:
                return 9;
        }
    }

    private static int b7(Heap m, long[] v, int previous) {
        m.store(v[22], v[78], 4);
        m.store(v[79], v[74], 4);
        v[88] = ((v[5] + 4294967293L)) & 4294967295L;
        v[89] = v[88] < 3L ? 1L : 0L;
        return v[89] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi90 = (previous == 7 ? v[74] : (previous == 6 ? v[78] : v[78]));
        long phi91 = (previous == 7 ? v[78] : (previous == 6 ? v[74] : v[74]));
        v[90] = phi90;
        v[91] = phi91;
        m.store(v[25], v[86], 4);
        m.store(v[87], v[82], 4);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi92 = (previous == 7 ? v[86] : (previous == 6 ? v[86] : v[82]));
        long phi93 = (previous == 7 ? v[74] : (previous == 6 ? v[78] : v[90]));
        long phi94 = (previous == 7 ? v[82] : (previous == 6 ? v[82] : v[86]));
        long phi95 = (previous == 7 ? v[78] : (previous == 6 ? v[74] : v[91]));
        v[92] = phi92;
        v[93] = phi93;
        v[94] = phi94;
        v[95] = phi95;
        v[96] = v[5] > 3L ? 1L : 0L;
        return v[96] != 0 ? 10 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        m.store(v[22], v[94], 4);
        m.store(v[25], v[95], 4);
        m.store(v[79], v[92], 4);
        m.store(v[87], v[93], 4);
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        m.store(v[6], 0L, 4);
        v[97] = (v[2] + (Heap.s(0L, 32) * 32860L) + 56L) & 4294967295L;
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi98 = (previous == 11 ? 0L : v[110]);
        long phi99 = (previous == 11 ? 0L : v[109]);
        v[98] = phi98;
        v[99] = phi99;
        v[100] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[98], 32) * 4L)) & 4294967295L;
        v[101] = m.load(v[100], 4);
        v[102] = v[101] >= v[65] ? 1L : 0L;
        v[103] = v[101] < v[71] ? 1L : 0L;
        v[104] = v[102] != 0 ? v[103] : 0L;
        return v[104] != 0 ? 13 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[105] = LibC.call(m, "llvm.umin.i32", new long[]{v[99], 4095L});
        v[106] = ((v[101] - v[65])) & 4294967295L;
        v[107] = (v[6] + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        m.store(v[107], v[106], 4);
        v[108] = ((v[105] + 1L)) & 4294967295L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi109 = (previous == 13 ? v[108] : v[99]);
        v[109] = phi109;
        v[110] = ((v[98] + 1L)) & 4294967295L;
        v[111] = m.load(v[97], 4);
        v[112] = v[110] > v[111] ? 1L : 0L;
        return v[112] != 0 ? 15 : 12;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[113] = m.load(v[6], 4);
        v[114] = v[113] == 0L ? 1L : 0L;
        return v[114] != 0 ? 16 : 20;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[115] = LibC.call(m, "llvm.usub.sat.i32", new long[]{v[109], 1L});
        m.store(v[97], v[115], 4);
        v[116] = v[109] == 0L ? 1L : 0L;
        return v[116] != 0 ? 28 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[117] = ((v[109] & 3L)) & 4294967295L;
        v[118] = v[109] < 4L ? 1L : 0L;
        return v[118] != 0 ? 24 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[119] = ((v[109] & 4294967292L)) & 4294967295L;
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi120 = (previous == 18 ? 0L : v[137]);
        long phi121 = (previous == 18 ? 0L : v[138]);
        v[120] = phi120;
        v[121] = phi121;
        v[122] = (v[6] + (Heap.s(v[120], 32) * 4L)) & 4294967295L;
        v[123] = m.load(v[122], 4);
        v[124] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[120], 32) * 4L)) & 4294967295L;
        m.store(v[124], v[123], 4);
        v[125] = ((v[120] | 1L)) & 4294967295L;
        v[126] = (v[6] + (Heap.s(v[125], 32) * 4L)) & 4294967295L;
        v[127] = m.load(v[126], 4);
        v[128] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[125], 32) * 4L)) & 4294967295L;
        m.store(v[128], v[127], 4);
        v[129] = ((v[120] | 2L)) & 4294967295L;
        v[130] = (v[6] + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        v[131] = m.load(v[130], 4);
        v[132] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        m.store(v[132], v[131], 4);
        v[133] = ((v[120] | 3L)) & 4294967295L;
        v[134] = (v[6] + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        v[135] = m.load(v[134], 4);
        v[136] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        m.store(v[136], v[135], 4);
        v[137] = ((v[120] + 4L)) & 4294967295L;
        v[138] = ((v[121] + 4L)) & 4294967295L;
        v[139] = v[138] == v[119] ? 1L : 0L;
        return v[139] != 0 ? 24 : 19;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[140] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L) & 4294967295L;
        m.store(v[140], 0L, 4);
        m.store(v[97], v[109], 4);
        v[141] = (v[6] + (Heap.s(4294967295L, 32) * 4L)) & 4294967295L;
        v[142] = v[109] == 0L ? 1L : 0L;
        return v[142] != 0 ? 28 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[143] = ((v[109] + 1L)) & 4294967295L;
        v[144] = LibC.call(m, "llvm.umax.i32", new long[]{v[143], 2L});
        v[145] = ((v[144] + 4294967295L)) & 4294967295L;
        v[146] = ((v[144] + 4294967294L)) & 4294967295L;
        v[147] = ((v[145] & 3L)) & 4294967295L;
        v[148] = v[146] < 3L ? 1L : 0L;
        return v[148] != 0 ? 26 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[149] = ((v[145] & 4294967292L)) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi150 = (previous == 22 ? 1L : v[167]);
        long phi151 = (previous == 22 ? 0L : v[168]);
        v[150] = phi150;
        v[151] = phi151;
        v[152] = (v[141] + (Heap.s(v[150], 32) * 4L)) & 4294967295L;
        v[153] = m.load(v[152], 4);
        v[154] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[150], 32) * 4L)) & 4294967295L;
        m.store(v[154], v[153], 4);
        v[155] = ((v[150] + 1L)) & 4294967295L;
        v[156] = (v[6] + (Heap.s(v[150], 32) * 4L)) & 4294967295L;
        v[157] = m.load(v[156], 4);
        v[158] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[155], 32) * 4L)) & 4294967295L;
        m.store(v[158], v[157], 4);
        v[159] = ((v[150] + 2L)) & 4294967295L;
        v[160] = (v[141] + (Heap.s(v[159], 32) * 4L)) & 4294967295L;
        v[161] = m.load(v[160], 4);
        v[162] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[159], 32) * 4L)) & 4294967295L;
        m.store(v[162], v[161], 4);
        v[163] = ((v[150] + 3L)) & 4294967295L;
        v[164] = (v[141] + (Heap.s(v[163], 32) * 4L)) & 4294967295L;
        v[165] = m.load(v[164], 4);
        v[166] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[163], 32) * 4L)) & 4294967295L;
        m.store(v[166], v[165], 4);
        v[167] = ((v[150] + 4L)) & 4294967295L;
        v[168] = ((v[151] + 4L)) & 4294967295L;
        v[169] = v[168] == v[149] ? 1L : 0L;
        return v[169] != 0 ? 26 : 23;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi170 = (previous == 17 ? 0L : v[137]);
        v[170] = phi170;
        v[171] = v[117] == 0L ? 1L : 0L;
        return v[171] != 0 ? 28 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi172 = (previous == 25 ? v[177] : v[170]);
        long phi173 = (previous == 25 ? v[178] : 0L);
        v[172] = phi172;
        v[173] = phi173;
        v[174] = (v[6] + (Heap.s(v[172], 32) * 4L)) & 4294967295L;
        v[175] = m.load(v[174], 4);
        v[176] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[172], 32) * 4L)) & 4294967295L;
        m.store(v[176], v[175], 4);
        v[177] = ((v[172] + 1L)) & 4294967295L;
        v[178] = ((v[173] + 1L)) & 4294967295L;
        v[179] = v[178] == v[117] ? 1L : 0L;
        return v[179] != 0 ? 28 : 25;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi180 = (previous == 21 ? 1L : v[167]);
        v[180] = phi180;
        v[181] = v[147] == 0L ? 1L : 0L;
        return v[181] != 0 ? 28 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi182 = (previous == 27 ? v[187] : v[180]);
        long phi183 = (previous == 27 ? v[188] : 0L);
        v[182] = phi182;
        v[183] = phi183;
        v[184] = (v[141] + (Heap.s(v[182], 32) * 4L)) & 4294967295L;
        v[185] = m.load(v[184], 4);
        v[186] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[182], 32) * 4L)) & 4294967295L;
        m.store(v[186], v[185], 4);
        v[187] = ((v[182] + 1L)) & 4294967295L;
        v[188] = ((v[183] + 1L)) & 4294967295L;
        v[189] = v[188] == v[147] ? 1L : 0L;
        return v[189] != 0 ? 28 : 27;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[190] = ((v[5] + 4294967294L)) & 4294967295L;
        v[191] = v[190] < 6L ? 1L : 0L;
        return v[191] != 0 ? 29 : 33;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[192] = (v[190]) & 255L;
        v[193] = ((43L >>> v[192])) & 255L;
        v[194] = ((v[193] & 1L)) & 255L;
        v[195] = v[194] == 0L ? 1L : 0L;
        return v[195] != 0 ? 33 : 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi196 = (previous == 30 ? v[201] : 0L);
        v[196] = phi196;
        v[197] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[196], 32) * 4L)) & 4294967295L;
        v[198] = m.load(v[197], 4);
        v[199] = ((v[75] - v[198])) & 4294967295L;
        v[200] = (v[6] + (Heap.s(v[196], 32) * 4L)) & 4294967295L;
        m.store(v[200], v[199], 4);
        v[201] = ((v[196] + 1L)) & 4294967295L;
        v[202] = m.load(v[97], 4);
        v[203] = v[201] > v[202] ? 1L : 0L;
        return v[203] != 0 ? 31 : 30;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[204] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L) & 4294967295L;
        m.store(v[204], 0L, 4);
        v[205] = (v[6] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[206] = v[202] == 0L ? 1L : 0L;
        return v[206] != 0 ? 33 : 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        long phi207 = (previous == 32 ? v[214] : v[202]);
        long phi208 = (previous == 32 ? v[213] : 1L);
        v[207] = phi207;
        v[208] = phi208;
        v[209] = ((v[207] - v[208])) & 4294967295L;
        v[210] = (v[205] + (Heap.s(v[209], 32) * 4L)) & 4294967295L;
        v[211] = m.load(v[210], 4);
        v[212] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[208], 32) * 4L)) & 4294967295L;
        m.store(v[212], v[211], 4);
        v[213] = ((v[208] + 1L)) & 4294967295L;
        v[214] = m.load(v[97], 4);
        v[215] = v[213] > v[214] ? 1L : 0L;
        return v[215] != 0 ? 33 : 32;
    }

    private static int b33(Heap m, long[] v, int previous) {
        m.store(v[6], 0L, 4);
        v[216] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16444L) & 4294967295L;
        return 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        long phi217 = (previous == 33 ? 0L : v[229]);
        long phi218 = (previous == 33 ? 0L : v[228]);
        v[217] = phi217;
        v[218] = phi218;
        v[219] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[217], 32) * 4L)) & 4294967295L;
        v[220] = m.load(v[219], 4);
        v[221] = v[220] >= v[64] ? 1L : 0L;
        v[222] = v[220] < v[68] ? 1L : 0L;
        v[223] = v[221] != 0 ? v[222] : 0L;
        return v[223] != 0 ? 35 : 36;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[224] = LibC.call(m, "llvm.umin.i32", new long[]{v[218], 4095L});
        v[225] = ((v[220] - v[64])) & 4294967295L;
        v[226] = (v[6] + (Heap.s(v[224], 32) * 4L)) & 4294967295L;
        m.store(v[226], v[225], 4);
        v[227] = ((v[224] + 1L)) & 4294967295L;
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        long phi228 = (previous == 35 ? v[227] : v[218]);
        v[228] = phi228;
        v[229] = ((v[217] + 1L)) & 4294967295L;
        v[230] = m.load(v[216], 4);
        v[231] = v[229] > v[230] ? 1L : 0L;
        return v[231] != 0 ? 37 : 34;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[232] = m.load(v[6], 4);
        v[233] = v[232] == 0L ? 1L : 0L;
        return v[233] != 0 ? 38 : 42;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[234] = LibC.call(m, "llvm.usub.sat.i32", new long[]{v[228], 1L});
        m.store(v[216], v[234], 4);
        v[235] = v[228] == 0L ? 1L : 0L;
        return v[235] != 0 ? 50 : 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[236] = ((v[228] & 3L)) & 4294967295L;
        v[237] = v[228] < 4L ? 1L : 0L;
        return v[237] != 0 ? 46 : 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[238] = ((v[228] & 4294967292L)) & 4294967295L;
        return 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        long phi239 = (previous == 40 ? 0L : v[256]);
        long phi240 = (previous == 40 ? 0L : v[257]);
        v[239] = phi239;
        v[240] = phi240;
        v[241] = (v[6] + (Heap.s(v[239], 32) * 4L)) & 4294967295L;
        v[242] = m.load(v[241], 4);
        v[243] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[239], 32) * 4L)) & 4294967295L;
        m.store(v[243], v[242], 4);
        v[244] = ((v[239] | 1L)) & 4294967295L;
        v[245] = (v[6] + (Heap.s(v[244], 32) * 4L)) & 4294967295L;
        v[246] = m.load(v[245], 4);
        v[247] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[244], 32) * 4L)) & 4294967295L;
        m.store(v[247], v[246], 4);
        v[248] = ((v[239] | 2L)) & 4294967295L;
        v[249] = (v[6] + (Heap.s(v[248], 32) * 4L)) & 4294967295L;
        v[250] = m.load(v[249], 4);
        v[251] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[248], 32) * 4L)) & 4294967295L;
        m.store(v[251], v[250], 4);
        v[252] = ((v[239] | 3L)) & 4294967295L;
        v[253] = (v[6] + (Heap.s(v[252], 32) * 4L)) & 4294967295L;
        v[254] = m.load(v[253], 4);
        v[255] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[252], 32) * 4L)) & 4294967295L;
        m.store(v[255], v[254], 4);
        v[256] = ((v[239] + 4L)) & 4294967295L;
        v[257] = ((v[240] + 4L)) & 4294967295L;
        v[258] = v[257] == v[238] ? 1L : 0L;
        return v[258] != 0 ? 46 : 41;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[259] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L) & 4294967295L;
        m.store(v[259], 0L, 4);
        m.store(v[216], v[228], 4);
        v[260] = (v[6] + (Heap.s(4294967295L, 32) * 4L)) & 4294967295L;
        v[261] = v[228] == 0L ? 1L : 0L;
        return v[261] != 0 ? 50 : 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        v[262] = ((v[228] + 1L)) & 4294967295L;
        v[263] = LibC.call(m, "llvm.umax.i32", new long[]{v[262], 2L});
        v[264] = ((v[263] + 4294967295L)) & 4294967295L;
        v[265] = ((v[263] + 4294967294L)) & 4294967295L;
        v[266] = ((v[264] & 3L)) & 4294967295L;
        v[267] = v[265] < 3L ? 1L : 0L;
        return v[267] != 0 ? 48 : 44;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[268] = ((v[264] & 4294967292L)) & 4294967295L;
        return 45;
    }

    private static int b45(Heap m, long[] v, int previous) {
        long phi269 = (previous == 44 ? 1L : v[286]);
        long phi270 = (previous == 44 ? 0L : v[287]);
        v[269] = phi269;
        v[270] = phi270;
        v[271] = (v[260] + (Heap.s(v[269], 32) * 4L)) & 4294967295L;
        v[272] = m.load(v[271], 4);
        v[273] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[269], 32) * 4L)) & 4294967295L;
        m.store(v[273], v[272], 4);
        v[274] = ((v[269] + 1L)) & 4294967295L;
        v[275] = (v[6] + (Heap.s(v[269], 32) * 4L)) & 4294967295L;
        v[276] = m.load(v[275], 4);
        v[277] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[274], 32) * 4L)) & 4294967295L;
        m.store(v[277], v[276], 4);
        v[278] = ((v[269] + 2L)) & 4294967295L;
        v[279] = (v[260] + (Heap.s(v[278], 32) * 4L)) & 4294967295L;
        v[280] = m.load(v[279], 4);
        v[281] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[278], 32) * 4L)) & 4294967295L;
        m.store(v[281], v[280], 4);
        v[282] = ((v[269] + 3L)) & 4294967295L;
        v[283] = (v[260] + (Heap.s(v[282], 32) * 4L)) & 4294967295L;
        v[284] = m.load(v[283], 4);
        v[285] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[282], 32) * 4L)) & 4294967295L;
        m.store(v[285], v[284], 4);
        v[286] = ((v[269] + 4L)) & 4294967295L;
        v[287] = ((v[270] + 4L)) & 4294967295L;
        v[288] = v[287] == v[268] ? 1L : 0L;
        return v[288] != 0 ? 48 : 45;
    }

    private static int b46(Heap m, long[] v, int previous) {
        long phi289 = (previous == 39 ? 0L : v[256]);
        v[289] = phi289;
        v[290] = v[236] == 0L ? 1L : 0L;
        return v[290] != 0 ? 50 : 47;
    }

    private static int b47(Heap m, long[] v, int previous) {
        long phi291 = (previous == 47 ? v[296] : v[289]);
        long phi292 = (previous == 47 ? v[297] : 0L);
        v[291] = phi291;
        v[292] = phi292;
        v[293] = (v[6] + (Heap.s(v[291], 32) * 4L)) & 4294967295L;
        v[294] = m.load(v[293], 4);
        v[295] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[291], 32) * 4L)) & 4294967295L;
        m.store(v[295], v[294], 4);
        v[296] = ((v[291] + 1L)) & 4294967295L;
        v[297] = ((v[292] + 1L)) & 4294967295L;
        v[298] = v[297] == v[236] ? 1L : 0L;
        return v[298] != 0 ? 50 : 47;
    }

    private static int b48(Heap m, long[] v, int previous) {
        long phi299 = (previous == 43 ? 1L : v[286]);
        v[299] = phi299;
        v[300] = v[266] == 0L ? 1L : 0L;
        return v[300] != 0 ? 50 : 49;
    }

    private static int b49(Heap m, long[] v, int previous) {
        long phi301 = (previous == 49 ? v[306] : v[299]);
        long phi302 = (previous == 49 ? v[307] : 0L);
        v[301] = phi301;
        v[302] = phi302;
        v[303] = (v[260] + (Heap.s(v[301], 32) * 4L)) & 4294967295L;
        v[304] = m.load(v[303], 4);
        v[305] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[301], 32) * 4L)) & 4294967295L;
        m.store(v[305], v[304], 4);
        v[306] = ((v[301] + 1L)) & 4294967295L;
        v[307] = ((v[302] + 1L)) & 4294967295L;
        v[308] = v[307] == v[266] ? 1L : 0L;
        return v[308] != 0 ? 50 : 49;
    }

    private static int b50(Heap m, long[] v, int previous) {
        v[309] = ((v[5] + 4294967295L)) & 4294967295L;
        v[310] = v[309] < 5L ? 1L : 0L;
        return v[310] != 0 ? 51 : 55;
    }

    private static int b51(Heap m, long[] v, int previous) {
        v[311] = (v[309]) & 255L;
        v[312] = ((29L >>> v[311])) & 255L;
        v[313] = ((v[312] & 1L)) & 255L;
        v[314] = v[313] == 0L ? 1L : 0L;
        return v[314] != 0 ? 55 : 52;
    }

    private static int b52(Heap m, long[] v, int previous) {
        long phi315 = (previous == 52 ? v[320] : 0L);
        v[315] = phi315;
        v[316] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[315], 32) * 4L)) & 4294967295L;
        v[317] = m.load(v[316], 4);
        v[318] = ((v[83] - v[317])) & 4294967295L;
        v[319] = (v[6] + (Heap.s(v[315], 32) * 4L)) & 4294967295L;
        m.store(v[319], v[318], 4);
        v[320] = ((v[315] + 1L)) & 4294967295L;
        v[321] = m.load(v[216], 4);
        v[322] = v[320] > v[321] ? 1L : 0L;
        return v[322] != 0 ? 53 : 52;
    }

    private static int b53(Heap m, long[] v, int previous) {
        v[323] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L) & 4294967295L;
        m.store(v[323], 0L, 4);
        v[324] = (v[6] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[325] = v[321] == 0L ? 1L : 0L;
        return v[325] != 0 ? 55 : 54;
    }

    private static int b54(Heap m, long[] v, int previous) {
        long phi326 = (previous == 54 ? v[333] : v[321]);
        long phi327 = (previous == 54 ? v[332] : 1L);
        v[326] = phi326;
        v[327] = phi327;
        v[328] = ((v[326] - v[327])) & 4294967295L;
        v[329] = (v[324] + (Heap.s(v[328], 32) * 4L)) & 4294967295L;
        v[330] = m.load(v[329], 4);
        v[331] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[327], 32) * 4L)) & 4294967295L;
        m.store(v[331], v[330], 4);
        v[332] = ((v[327] + 1L)) & 4294967295L;
        v[333] = m.load(v[216], 4);
        v[334] = v[332] > v[333] ? 1L : 0L;
        return v[334] != 0 ? 55 : 54;
    }

    private static int b55(Heap m, long[] v, int previous) {
        return v[96] != 0 ? 56 : 60;
    }

    private static int b56(Heap m, long[] v, int previous) {
        long phi335 = (previous == 56 ? v[339] : 0L);
        v[335] = phi335;
        v[336] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[335], 32) * 4L)) & 4294967295L;
        v[337] = m.load(v[336], 4);
        v[338] = (v[6] + (Heap.s(v[335], 32) * 4L)) & 4294967295L;
        m.store(v[338], v[337], 4);
        v[339] = ((v[335] + 1L)) & 4294967295L;
        v[340] = m.load(v[97], 4);
        v[341] = v[339] > v[340] ? 1L : 0L;
        return v[341] != 0 ? 57 : 56;
    }

    private static int b57(Heap m, long[] v, int previous) {
        long phi342 = (previous == 57 ? v[346] : 0L);
        v[342] = phi342;
        v[343] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[342], 32) * 4L)) & 4294967295L;
        v[344] = m.load(v[343], 4);
        v[345] = (v[2] + (Heap.s(0L, 32) * 32860L) + 60L + (Heap.s(v[342], 32) * 4L)) & 4294967295L;
        m.store(v[345], v[344], 4);
        v[346] = ((v[342] + 1L)) & 4294967295L;
        v[347] = m.load(v[216], 4);
        v[348] = v[346] > v[347] ? 1L : 0L;
        return v[348] != 0 ? 58 : 57;
    }

    private static int b58(Heap m, long[] v, int previous) {
        long phi349 = (previous == 58 ? v[353] : 0L);
        v[349] = phi349;
        v[350] = (v[6] + (Heap.s(v[349], 32) * 4L)) & 4294967295L;
        v[351] = m.load(v[350], 4);
        v[352] = (v[2] + (Heap.s(0L, 32) * 32860L) + 16448L + (Heap.s(v[349], 32) * 4L)) & 4294967295L;
        m.store(v[352], v[351], 4);
        v[353] = ((v[349] + 1L)) & 4294967295L;
        v[354] = m.load(v[97], 4);
        v[355] = v[353] > v[354] ? 1L : 0L;
        return v[355] != 0 ? 59 : 58;
    }

    private static int b59(Heap m, long[] v, int previous) {
        v[356] = m.load(v[216], 4);
        m.store(v[216], v[354], 4);
        m.store(v[97], v[356], 4);
        return 60;
    }

    private static int b60(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[6]});
        return 61;
    }

    private static int b61(Heap m, long[] v, int previous) {
        long phi357 = (previous == 60 ? 0L : (previous == 0 ? 4294967295L : (previous == 2 ? 4294967295L : 4294967295L)));
        v[357] = phi357;
        v[358] = v[357];
        return -1;
    }
}
