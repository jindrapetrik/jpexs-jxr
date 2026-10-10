package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: WriteImagePlaneHeader.
 */
public final class F0420_WriteImagePlaneHeader {

    private F0420_WriteImagePlaneHeader() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[148];
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
                        throw new IllegalStateException("Invalid block in WriteImagePlaneHeader");
                }
                previous = old;
                if (pc < 0) {
                    return v[147];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        F0297_putBit16.run(m, v[2], v[4], 3L);
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        F0297_putBit16.run(m, v[2], v[6], 1L);
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        F0297_putBit16.run(m, v[2], v[8], 4L);
        v[9] = m.load(v[3], 4);
        switch ((int) v[9]) {
            case 1:
                return 2;
            case 2:
                return 2;
            case 3:
                return 2;
            case 6:
                return 1;
            default:
                return 3;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = ((v[11] + 4294967295L)) & 4294967295L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi13 = (previous == 1 ? v[12] : (previous == 0 ? 0L : (previous == 0 ? 0L : 0L)));
        v[13] = phi13;
        F0297_putBit16.run(m, v[2], v[13], 4L);
        F0297_putBit16.run(m, v[2], 0L, 4L);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 12L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        switch ((int) v[15]) {
            case 2:
                return 4;
            case 3:
                return 4;
            case 5:
                return 5;
            case 6:
                return 5;
            case 7:
                return 8;
            default:
                return 12;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32832L) & 4294967295L;
        v[17] = m.load(v[16], 1);
        v[18] = (v[17]) & 4294967295L;
        return 11;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32832L) & 4294967295L;
        v[20] = m.load(v[19], 1);
        v[21] = v[20] == 0L ? 1L : 0L;
        return v[21] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        m.store(v[19], 10L, 1);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi22 = (previous == 6 ? 10L : v[20]);
        v[22] = phi22;
        v[23] = (v[22]) & 4294967295L;
        return 11;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[24] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32832L) & 4294967295L;
        v[25] = m.load(v[24], 1);
        v[26] = v[25] == 0L ? 1L : 0L;
        return v[26] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        m.store(v[24], 13L, 1);
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi27 = (previous == 9 ? 13L : v[25]);
        v[27] = phi27;
        v[28] = (v[27]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[28], 8L);
        v[29] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32833L) & 4294967295L;
        v[30] = m.load(v[29], 1);
        v[31] = (Heap.s(v[30], 8)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi32 = (previous == 10 ? v[31] : (previous == 7 ? v[23] : v[18]));
        v[32] = phi32;
        F0297_putBit16.run(m, v[2], v[32], 8L);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[33] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = ((v[34] & 1L)) & 4294967295L;
        v[36] = ((v[35] ^ 1L)) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[36], 1L);
        v[37] = m.load(v[33], 4);
        v[38] = ((v[37] & 1L)) & 4294967295L;
        v[39] = v[38] == 0L ? 1L : 0L;
        return v[39] != 0 ? 13 : 18;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[40] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = v[43] > 1L ? 1L : 0L;
        return v[44] != 0 ? 14 : 17;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[45] = (v[37]) & 255L;
        v[46] = ((v[45] >>> 3L)) & 255L;
        v[47] = ((v[46] & 3L)) & 255L;
        v[48] = LibC.call(m, "llvm.umin.i8", new long[]{v[47], 2L});
        v[49] = (v[48]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[49], 2L);
        v[50] = m.load(v[41], 4);
        v[51] = m.load(v[50], 1);
        v[52] = (v[51]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[52], 8L);
        switch ((int) v[48]) {
            case 1:
                return 15;
            case 0:
                return 18;
            default:
                return 16;
        }
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[53] = (v[41] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi54 = (previous == 16 ? v[59] : 1L);
        v[54] = phi54;
        v[55] = (v[41] + (Heap.s(v[54], 32) * 4L)) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = m.load(v[56], 1);
        v[58] = (v[57]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[58], 8L);
        v[59] = ((v[54] + 1L)) & 4294967295L;
        v[60] = v[59] == v[43] ? 1L : 0L;
        return v[60] != 0 ? 18 : 16;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi61 = (previous == 15 ? v[53] : v[41]);
        v[61] = phi61;
        v[62] = m.load(v[61], 4);
        v[63] = m.load(v[62], 1);
        v[64] = (v[63]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[64], 8L);
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[65] = m.load(v[7], 4);
        v[66] = v[65] == 3L ? 1L : 0L;
        return v[66] != 0 ? 34 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[67] = m.load(v[33], 4);
        v[68] = ((v[67] >>> 9L)) & 4294967295L;
        v[69] = ((v[68] & 1L)) & 4294967295L;
        v[70] = ((v[69] ^ 1L)) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[70], 1L);
        v[71] = m.load(v[33], 4);
        v[72] = ((v[71] & 512L)) & 4294967295L;
        v[73] = v[72] == 0L ? 1L : 0L;
        return v[73] != 0 ? 26 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[74] = ((v[71] >>> 1L)) & 4294967295L;
        v[75] = ((v[74] & 1L)) & 4294967295L;
        v[76] = ((v[75] ^ 1L)) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[76], 1L);
        v[77] = m.load(v[33], 4);
        v[78] = ((v[77] & 2L)) & 4294967295L;
        v[79] = v[78] == 0L ? 1L : 0L;
        return v[79] != 0 ? 21 : 26;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[80] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = (v[81] + (Heap.s(0L, 32) * 240L) + 64L) & 4294967295L;
        v[83] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = v[84] > 1L ? 1L : 0L;
        return v[85] != 0 ? 22 : 25;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[86] = (v[77]) & 255L;
        v[87] = ((v[86] >>> 5L)) & 255L;
        v[88] = ((v[87] & 3L)) & 255L;
        v[89] = LibC.call(m, "llvm.umin.i8", new long[]{v[88], 2L});
        v[90] = (v[89]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[90], 2L);
        v[91] = m.load(v[82], 4);
        v[92] = m.load(v[91], 1);
        v[93] = (v[92]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[93], 8L);
        switch ((int) v[89]) {
            case 1:
                return 23;
            case 0:
                return 26;
            default:
                return 24;
        }
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[94] = (v[81] + (Heap.s(0L, 32) * 240L) + 64L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 25;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi95 = (previous == 24 ? v[100] : 1L);
        v[95] = phi95;
        v[96] = (v[82] + (Heap.s(v[95], 32) * 4L)) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = m.load(v[97], 1);
        v[99] = (v[98]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[99], 8L);
        v[100] = ((v[95] + 1L)) & 4294967295L;
        v[101] = v[100] == v[84] ? 1L : 0L;
        return v[101] != 0 ? 26 : 24;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi102 = (previous == 23 ? v[94] : v[82]);
        v[102] = phi102;
        v[103] = m.load(v[102], 4);
        v[104] = m.load(v[103], 1);
        v[105] = (v[104]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[105], 8L);
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[106] = m.load(v[7], 4);
        v[107] = v[106] == 2L ? 1L : 0L;
        return v[107] != 0 ? 34 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[108] = m.load(v[33], 4);
        v[109] = ((v[108] >>> 10L)) & 4294967295L;
        v[110] = ((v[109] & 1L)) & 4294967295L;
        v[111] = ((v[110] ^ 1L)) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[111], 1L);
        v[112] = m.load(v[33], 4);
        v[113] = ((v[112] & 1024L)) & 4294967295L;
        v[114] = v[113] == 0L ? 1L : 0L;
        return v[114] != 0 ? 34 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[115] = ((v[112] >>> 2L)) & 4294967295L;
        v[116] = ((v[115] & 1L)) & 4294967295L;
        v[117] = ((v[116] ^ 1L)) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[117], 1L);
        v[118] = m.load(v[33], 4);
        v[119] = ((v[118] & 4L)) & 4294967295L;
        v[120] = v[119] == 0L ? 1L : 0L;
        return v[120] != 0 ? 29 : 34;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[121] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[122] = m.load(v[121], 4);
        v[123] = (v[122] + (Heap.s(0L, 32) * 240L) + 128L) & 4294967295L;
        v[124] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[125] = m.load(v[124], 4);
        v[126] = v[125] > 1L ? 1L : 0L;
        return v[126] != 0 ? 30 : 33;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[127] = ((v[118] >>> 7L)) & 4294967295L;
        v[128] = (v[127]) & 255L;
        v[129] = ((v[128] & 3L)) & 255L;
        v[130] = LibC.call(m, "llvm.umin.i8", new long[]{v[129], 2L});
        v[131] = (v[130]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[131], 2L);
        v[132] = m.load(v[123], 4);
        v[133] = m.load(v[132], 1);
        v[134] = (v[133]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[134], 8L);
        switch ((int) v[130]) {
            case 1:
                return 31;
            case 0:
                return 34;
            default:
                return 32;
        }
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[135] = (v[122] + (Heap.s(0L, 32) * 240L) + 128L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 33;
    }

    private static int b32(Heap m, long[] v, int previous) {
        long phi136 = (previous == 32 ? v[141] : 1L);
        v[136] = phi136;
        v[137] = (v[123] + (Heap.s(v[136], 32) * 4L)) & 4294967295L;
        v[138] = m.load(v[137], 4);
        v[139] = m.load(v[138], 1);
        v[140] = (v[139]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[140], 8L);
        v[141] = ((v[136] + 1L)) & 4294967295L;
        v[142] = v[141] == v[125] ? 1L : 0L;
        return v[142] != 0 ? 34 : 32;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi143 = (previous == 31 ? v[135] : v[123]);
        v[143] = phi143;
        v[144] = m.load(v[143], 4);
        v[145] = m.load(v[144], 1);
        v[146] = (v[145]) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[146], 8L);
        return 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        F0361_fillToByte.run(m, v[2]);
        v[147] = 0L;
        return -1;
    }
}
