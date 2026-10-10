package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: CalcMetadataOffsetSize.
 */
public final class F0086_CalcMetadataOffsetSize {

    private F0086_CalcMetadataOffsetSize() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[152];
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
                    default:
                        throw new IllegalStateException("Invalid block in CalcMetadataOffsetSize");
                }
                previous = old;
                if (pc < 0) {
                    return v[151];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 0L + 4L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = LibC.call(m, "strlen", new long[]{v[7]});
        v[9] = ((v[8] + 1L)) & 4294967295L;
        v[10] = v[9] > 4L ? 1L : 0L;
        return v[10] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = m.load(v[2], 4);
        v[12] = ((v[11] + v[9])) & 4294967295L;
        m.store(v[2], v[12], 4);
        return 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[13] = m.load(v[1], 2);
        v[14] = ((v[13] + 1L)) & 65535L;
        m.store(v[1], v[14], 2);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[15] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 8L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 7 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[18] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 8L + 4L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = LibC.call(m, "strlen", new long[]{v[19]});
        v[21] = ((v[20] + 1L)) & 4294967295L;
        v[22] = v[21] > 4L ? 1L : 0L;
        return v[22] != 0 ? 6 : 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[23] = m.load(v[2], 4);
        v[24] = ((v[23] + v[21])) & 4294967295L;
        m.store(v[2], v[24], 4);
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[25] = m.load(v[1], 2);
        v[26] = ((v[25] + 1L)) & 65535L;
        m.store(v[1], v[26], 2);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[27] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 16L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = v[28] == 0L ? 1L : 0L;
        return v[29] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[30] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 16L + 4L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = LibC.call(m, "strlen", new long[]{v[31]});
        v[33] = ((v[32] + 1L)) & 4294967295L;
        v[34] = v[33] > 4L ? 1L : 0L;
        return v[34] != 0 ? 10 : 12;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[35] = m.load(v[2], 4);
        v[36] = ((v[35] + v[33])) & 4294967295L;
        m.store(v[2], v[36], 4);
        return 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[37] = m.load(v[1], 2);
        v[38] = ((v[37] + 1L)) & 65535L;
        m.store(v[1], v[38], 2);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[39] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 24L) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = v[40] == 0L ? 1L : 0L;
        return v[41] != 0 ? 15 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[42] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 24L + 4L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = LibC.call(m, "strlen", new long[]{v[43]});
        v[45] = ((v[44] + 1L)) & 4294967295L;
        v[46] = v[45] > 4L ? 1L : 0L;
        return v[46] != 0 ? 14 : 16;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[47] = m.load(v[2], 4);
        v[48] = ((v[47] + v[45])) & 4294967295L;
        m.store(v[2], v[48], 4);
        return 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[49] = m.load(v[1], 2);
        v[50] = ((v[49] + 1L)) & 65535L;
        m.store(v[1], v[50], 2);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[51] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 32L) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = v[52] == 0L ? 1L : 0L;
        return v[53] != 0 ? 19 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[54] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 32L + 4L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = LibC.call(m, "strlen", new long[]{v[55]});
        v[57] = ((v[56] + 1L)) & 4294967295L;
        v[58] = v[57] > 4L ? 1L : 0L;
        return v[58] != 0 ? 18 : 20;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[59] = m.load(v[2], 4);
        v[60] = ((v[59] + v[57])) & 4294967295L;
        m.store(v[2], v[60], 4);
        return 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[61] = m.load(v[1], 2);
        v[62] = ((v[61] + 1L)) & 65535L;
        m.store(v[1], v[62], 2);
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[63] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 40L) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = v[64] == 0L ? 1L : 0L;
        return v[65] != 0 ? 23 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[66] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 40L + 4L) & 4294967295L;
        v[67] = m.load(v[66], 4);
        v[68] = LibC.call(m, "strlen", new long[]{v[67]});
        v[69] = ((v[68] + 1L)) & 4294967295L;
        v[70] = v[69] > 4L ? 1L : 0L;
        return v[70] != 0 ? 22 : 24;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[71] = m.load(v[2], 4);
        v[72] = ((v[71] + v[69])) & 4294967295L;
        m.store(v[2], v[72], 4);
        return 24;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[73] = m.load(v[1], 2);
        v[74] = ((v[73] + 1L)) & 65535L;
        m.store(v[1], v[74], 2);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[75] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 48L) & 4294967295L;
        v[76] = m.load(v[75], 4);
        v[77] = v[76] == 0L ? 1L : 0L;
        return v[77] != 0 ? 27 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[78] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 48L + 4L) & 4294967295L;
        v[79] = m.load(v[78], 4);
        v[80] = LibC.call(m, "strlen", new long[]{v[79]});
        v[81] = ((v[80] + 1L)) & 4294967295L;
        v[82] = v[81] > 4L ? 1L : 0L;
        return v[82] != 0 ? 26 : 28;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[83] = m.load(v[2], 4);
        v[84] = ((v[83] + v[81])) & 4294967295L;
        m.store(v[2], v[84], 4);
        return 28;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[85] = m.load(v[1], 2);
        v[86] = ((v[85] + 1L)) & 65535L;
        m.store(v[1], v[86], 2);
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[87] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 56L) & 4294967295L;
        v[88] = m.load(v[87], 4);
        v[89] = v[88] == 0L ? 1L : 0L;
        return v[89] != 0 ? 29 : 30;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[90] = m.load(v[1], 2);
        v[91] = ((v[90] + 1L)) & 65535L;
        m.store(v[1], v[91], 2);
        return 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[92] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 64L) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = v[93] == 0L ? 1L : 0L;
        return v[94] != 0 ? 31 : 32;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[95] = m.load(v[1], 2);
        v[96] = ((v[95] + 1L)) & 65535L;
        m.store(v[1], v[96], 2);
        return 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[97] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 72L) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = v[98] == 0L ? 1L : 0L;
        return v[99] != 0 ? 35 : 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[100] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 72L + 4L) & 4294967295L;
        v[101] = m.load(v[100], 4);
        v[102] = LibC.call(m, "wcslen", new long[]{v[101]});
        v[103] = ((v[102] << 1L)) & 4294967295L;
        v[104] = ((v[103] + 2L)) & 4294967295L;
        v[105] = v[104] > 4L ? 1L : 0L;
        return v[105] != 0 ? 34 : 36;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[106] = m.load(v[2], 4);
        v[107] = ((v[106] + v[104])) & 4294967295L;
        m.store(v[2], v[107], 4);
        return 36;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[108] = m.load(v[1], 2);
        v[109] = ((v[108] + 1L)) & 65535L;
        m.store(v[1], v[109], 2);
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[110] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 80L) & 4294967295L;
        v[111] = m.load(v[110], 4);
        v[112] = v[111] == 0L ? 1L : 0L;
        return v[112] != 0 ? 39 : 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[113] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 80L + 4L) & 4294967295L;
        v[114] = m.load(v[113], 4);
        v[115] = LibC.call(m, "strlen", new long[]{v[114]});
        v[116] = ((v[115] + 1L)) & 4294967295L;
        v[117] = v[116] > 4L ? 1L : 0L;
        return v[117] != 0 ? 38 : 40;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[118] = m.load(v[2], 4);
        v[119] = ((v[118] + v[116])) & 4294967295L;
        m.store(v[2], v[119], 4);
        return 40;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[120] = m.load(v[1], 2);
        v[121] = ((v[120] + 1L)) & 65535L;
        m.store(v[1], v[121], 2);
        return 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[122] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 88L) & 4294967295L;
        v[123] = m.load(v[122], 4);
        v[124] = v[123] == 0L ? 1L : 0L;
        return v[124] != 0 ? 43 : 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[125] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 88L + 4L) & 4294967295L;
        v[126] = m.load(v[125], 4);
        v[127] = LibC.call(m, "strlen", new long[]{v[126]});
        v[128] = ((v[127] + 1L)) & 4294967295L;
        v[129] = v[128] > 4L ? 1L : 0L;
        return v[129] != 0 ? 42 : 44;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[130] = m.load(v[2], 4);
        v[131] = ((v[130] + v[128])) & 4294967295L;
        m.store(v[2], v[131], 4);
        return 44;
    }

    private static int b43(Heap m, long[] v, int previous) {
        v[132] = m.load(v[1], 2);
        v[133] = ((v[132] + 1L)) & 65535L;
        m.store(v[1], v[133], 2);
        return 44;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[134] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 96L) & 4294967295L;
        v[135] = m.load(v[134], 4);
        v[136] = v[135] == 0L ? 1L : 0L;
        return v[136] != 0 ? 45 : 46;
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[137] = m.load(v[1], 2);
        v[138] = ((v[137] + 1L)) & 65535L;
        m.store(v[1], v[138], 2);
        return 46;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[139] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 104L) & 4294967295L;
        v[140] = m.load(v[139], 4);
        v[141] = v[140] == 0L ? 1L : 0L;
        return v[141] != 0 ? 49 : 47;
    }

    private static int b47(Heap m, long[] v, int previous) {
        v[142] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 104L + 4L) & 4294967295L;
        v[143] = m.load(v[142], 4);
        v[144] = LibC.call(m, "strlen", new long[]{v[143]});
        v[145] = ((v[144] + 1L)) & 4294967295L;
        v[146] = v[145] > 4L ? 1L : 0L;
        return v[146] != 0 ? 48 : 50;
    }

    private static int b48(Heap m, long[] v, int previous) {
        v[147] = m.load(v[2], 4);
        v[148] = ((v[147] + v[145])) & 4294967295L;
        m.store(v[2], v[148], 4);
        return 50;
    }

    private static int b49(Heap m, long[] v, int previous) {
        v[149] = m.load(v[1], 2);
        v[150] = ((v[149] + 1L)) & 65535L;
        m.store(v[1], v[150], 2);
        return 50;
    }

    private static int b50(Heap m, long[] v, int previous) {
        v[151] = 0L;
        return -1;
    }
}
