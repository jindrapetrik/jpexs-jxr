package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: EncodeMacroblockLowpass.
 */
public final class F0288_EncodeMacroblockLowpass {

    private F0288_EncodeMacroblockLowpass() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[262];
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
                    default:
                        throw new IllegalStateException("Invalid block in EncodeMacroblockLowpass");
                }
                previous = old;
                if (pc < 0) {
                    return v[261];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.stack(64L * 1L, 4);
        v[5] = m.stack(8L * 1L, 4);
        v[6] = m.stack(2048L * 1L, 4);
        v[7] = m.stack(64L * 1L, 4);
        v[8] = m.stack(64L * 1L, 4);
        v[9] = m.stack(1024L * 1L, 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = v[11] == 1L ? 1L : 0L;
        v[15] = v[11] == 2L ? 1L : 0L;
        v[16] = ((v[11] + 4294967295L)) & 4294967295L;
        v[17] = v[16] < 2L ? 1L : 0L;
        v[18] = v[17] != 0 ? 1L : v[13];
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L) & 4294967295L;
        v[20] = (v[1] + (Heap.s(0L, 32) * 592L) + 4L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L) & 4294967295L;
        v[23] = (v[1] + (Heap.s(0L, 32) * 592L) + 512L) & 4294967295L;
        v[24] = (v[1] + (Heap.s(0L, 32) * 592L) + 512L + 8L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        m.store(v[5], 0L, 8);
        v[26] = Heap.s(v[13], 32) > Heap.s(16L, 32) ? 1L : 0L;
        return v[26] != 0 ? 54 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[27] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = v[28] == 0L ? 1L : 0L;
        return v[29] != 0 ? 6 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = (v[31] + (Heap.s(v[33], 32) * 240L) + 194L) & 4294967295L;
        v[35] = m.load(v[34], 1);
        v[36] = v[35] == 0L ? 1L : 0L;
        return v[36] != 0 ? 6 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[37] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1156L) & 4294967295L;
        v[38] = m.load(v[37], 1);
        v[39] = v[38] == 0L ? 1L : 0L;
        return v[39] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[21], 0L, 1L);
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[40] = (v[38]) & 4294967295L;
        F0359_putBit16z.run(m, v[21], 1L, 1L);
        v[41] = ((v[40] + 4294967295L)) & 4294967295L;
        v[42] = (v[35]) & 4294967295L;
        F0359_putBit16z.run(m, v[21], v[41], v[42]);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[43] = Heap.s(v[13], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[43] != 0 ? 7 : 12;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[44] = ((v[13] & 3L)) & 4294967295L;
        v[45] = v[13] < 4L ? 1L : 0L;
        return v[45] != 0 ? 10 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[46] = ((v[13] & 2147483644L)) & 4294967295L;
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi47 = (previous == 8 ? 0L : v[60]);
        long phi48 = (previous == 8 ? 0L : v[61]);
        v[47] = phi47;
        v[48] = phi48;
        v[49] = (v[19] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[47], 32) * 64L)) & 4294967295L;
        v[50] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[47], 32) * 4L)) & 4294967295L;
        m.store(v[50], v[49], 4);
        v[51] = ((v[47] | 1L)) & 4294967295L;
        v[52] = (v[19] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[51], 32) * 64L)) & 4294967295L;
        v[53] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        m.store(v[53], v[52], 4);
        v[54] = ((v[47] | 2L)) & 4294967295L;
        v[55] = (v[19] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[54], 32) * 64L)) & 4294967295L;
        v[56] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[54], 32) * 4L)) & 4294967295L;
        m.store(v[56], v[55], 4);
        v[57] = ((v[47] | 3L)) & 4294967295L;
        v[58] = (v[19] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[57], 32) * 64L)) & 4294967295L;
        v[59] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[57], 32) * 4L)) & 4294967295L;
        m.store(v[59], v[58], 4);
        v[60] = ((v[47] + 4L)) & 4294967295L;
        v[61] = ((v[48] + 4L)) & 4294967295L;
        v[62] = v[61] == v[46] ? 1L : 0L;
        return v[62] != 0 ? 10 : 9;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi63 = (previous == 7 ? 0L : v[60]);
        v[63] = phi63;
        v[64] = v[44] == 0L ? 1L : 0L;
        return v[64] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi65 = (previous == 11 ? v[69] : v[63]);
        long phi66 = (previous == 11 ? v[70] : 0L);
        v[65] = phi65;
        v[66] = phi66;
        v[67] = (v[19] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[65], 32) * 64L)) & 4294967295L;
        v[68] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[65], 32) * 4L)) & 4294967295L;
        m.store(v[68], v[67], 4);
        v[69] = ((v[65] + 1L)) & 4294967295L;
        v[70] = ((v[66] + 1L)) & 4294967295L;
        v[71] = v[70] == v[44] ? 1L : 0L;
        return v[71] != 0 ? 12 : 11;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[72] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34284L) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = v[73] == 0L ? 1L : 0L;
        return v[74] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        m.store(v[22], 32767L, 4);
        v[75] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(1L, 32) * 8L)) & 4294967295L;
        m.store(v[75], 32L, 4);
        v[76] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(2L, 32) * 8L)) & 4294967295L;
        m.store(v[76], 30L, 4);
        v[77] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(3L, 32) * 8L)) & 4294967295L;
        m.store(v[77], 28L, 4);
        v[78] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(4L, 32) * 8L)) & 4294967295L;
        m.store(v[78], 26L, 4);
        v[79] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(5L, 32) * 8L)) & 4294967295L;
        m.store(v[79], 24L, 4);
        v[80] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(6L, 32) * 8L)) & 4294967295L;
        m.store(v[80], 22L, 4);
        v[81] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(7L, 32) * 8L)) & 4294967295L;
        m.store(v[81], 20L, 4);
        v[82] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(8L, 32) * 8L)) & 4294967295L;
        m.store(v[82], 18L, 4);
        v[83] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(9L, 32) * 8L)) & 4294967295L;
        m.store(v[83], 16L, 4);
        v[84] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(10L, 32) * 8L)) & 4294967295L;
        m.store(v[84], 14L, 4);
        v[85] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(11L, 32) * 8L)) & 4294967295L;
        m.store(v[85], 12L, 4);
        v[86] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(12L, 32) * 8L)) & 4294967295L;
        m.store(v[86], 10L, 4);
        v[87] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(13L, 32) * 8L)) & 4294967295L;
        m.store(v[87], 8L, 4);
        v[88] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(14L, 32) * 8L)) & 4294967295L;
        m.store(v[88], 6L, 4);
        v[89] = (v[1] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(15L, 32) * 8L)) & 4294967295L;
        m.store(v[89], 4L, 4);
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[90] = Heap.s(v[18], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[90] != 0 ? 15 : 17;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[91] = (v[1] + (Heap.s(0L, 32) * 592L) + 512L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi92 = (previous == 15 ? v[25] : v[100]);
        long phi93 = (previous == 15 ? 0L : v[101]);
        v[92] = phi92;
        v[93] = phi93;
        v[94] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = (v[9] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[93], 32) * 64L)) & 4294967295L;
        v[97] = (v[6] + (Heap.s(0L, 32) * 2048L) + (Heap.s(v[93], 32) * 128L)) & 4294967295L;
        v[98] = F0289_AdaptiveScan.run(m, v[95], v[96], v[22], v[92], 0L, v[97]);
        v[99] = (v[7] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        m.store(v[99], v[98], 4);
        v[100] = m.load(v[91], 4);
        v[101] = ((v[93] + 1L)) & 4294967295L;
        v[102] = v[101] == v[18] ? 1L : 0L;
        return v[102] != 0 ? 17 : 16;
    }

    private static int b17(Heap m, long[] v, int previous) {
        return v[17] != 0 ? 18 : 24;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[103] = (v[14]) & 4294967295L;
        v[104] = (10448L + (Heap.s(v[103], 32) * 4L)) & 4294967295L;
        v[105] = v[14] != 0 ? 6L : 14L;
        v[106] = (v[1] + (Heap.s(0L, 32) * 592L) + 512L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[107] = m.load(v[106], 4);
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi108 = (previous == 18 ? 0L : v[135]);
        long phi109 = (previous == 18 ? 0L : v[134]);
        long phi110 = (previous == 18 ? 0L : v[133]);
        v[108] = phi108;
        v[109] = phi109;
        v[110] = phi110;
        v[111] = ((v[108] >>> 1L)) & 4294967295L;
        v[112] = (v[104] + (Heap.s(v[111], 32) * 4L)) & 4294967295L;
        v[113] = m.load(v[112], 4);
        v[114] = ((v[108] & 1L)) & 4294967295L;
        v[115] = ((v[114] + 1L)) & 4294967295L;
        v[116] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[115], 32) * 4L)) & 4294967295L;
        v[117] = m.load(v[116], 4);
        v[118] = (v[117] + (Heap.s(v[113], 32) * 4L)) & 4294967295L;
        v[119] = m.load(v[118], 4);
        v[120] = LibC.call(m, "abs", new long[]{v[119]});
        v[121] = ((Heap.s(v[120], 32) >> v[107])) & 4294967295L;
        v[122] = (v[4] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[114], 32) * 32L) + (Heap.s(v[113], 32) * 4L)) & 4294967295L;
        m.store(v[122], v[121], 4);
        v[123] = v[121] == 0L ? 1L : 0L;
        return v[123] != 0 ? 21 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[124] = ((v[110] << 1L)) & 4294967295L;
        v[125] = (v[6] + (Heap.s(0L, 32) * 2048L) + (Heap.s(1L, 32) * 128L) + (Heap.s(v[124], 32) * 4L)) & 4294967295L;
        m.store(v[125], v[109], 4);
        v[126] = Heap.s(v[119], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[127] = ((0L - v[121])) & 4294967295L;
        v[128] = v[126] != 0 ? v[127] : v[121];
        v[129] = ((v[124] | 1L)) & 4294967295L;
        v[130] = (v[6] + (Heap.s(0L, 32) * 2048L) + (Heap.s(1L, 32) * 128L) + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        m.store(v[130], v[128], 4);
        v[131] = ((v[110] + 1L)) & 4294967295L;
        return 22;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[132] = ((v[109] + 1L)) & 4294967295L;
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi133 = (previous == 20 ? v[131] : v[110]);
        long phi134 = (previous == 20 ? 0L : v[132]);
        v[133] = phi133;
        v[134] = phi134;
        v[135] = ((v[108] + 1L)) & 4294967295L;
        v[136] = v[135] == v[105] ? 1L : 0L;
        return v[136] != 0 ? 23 : 19;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[137] = (v[7] + (Heap.s(0L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[137], v[133], 4);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi138 = (previous == 17 ? v[13] : 2L);
        v[138] = phi138;
        v[139] = v[16] < 3L ? 1L : 0L;
        return v[139] != 0 ? 26 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        return v[43] != 0 ? 33 : 34;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[140] = ((v[138] << 2L)) & 4294967295L;
        v[141] = ((v[140] + 4294967291L)) & 4294967295L;
        v[142] = (v[1] + (Heap.s(0L, 32) * 592L) + 556L) & 4294967295L;
        v[143] = m.load(v[142], 4);
        v[144] = (v[1] + (Heap.s(0L, 32) * 592L) + 552L) & 4294967295L;
        v[145] = m.load(v[144], 4);
        v[146] = m.load(v[7], 4);
        v[147] = Heap.s(v[146], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[148] = (v[147]) & 4294967295L;
        v[149] = (v[7] + (Heap.s(0L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[150] = m.load(v[149], 4);
        v[151] = Heap.s(v[150], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[152] = v[151] != 0 ? 2L : 0L;
        v[153] = ((v[152] | v[148])) & 4294967295L;
        v[154] = v[138] == 3L ? 1L : 0L;
        v[155] = (v[7] + (Heap.s(0L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[156] = m.load(v[155], 4);
        v[157] = Heap.s(v[156], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[158] = v[154] != 0 ? v[157] : 0L;
        v[159] = v[158] != 0 ? 4L : 0L;
        v[160] = ((v[153] | v[159])) & 4294967295L;
        v[161] = Heap.s(v[145], 32) < Heap.s(1L, 32) ? 1L : 0L;
        v[162] = Heap.s(v[143], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[163] = v[161] != 0 ? 1L : v[162];
        return v[163] != 0 ? 27 : 31;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[164] = Heap.s(v[143], 32) < Heap.s(v[145], 32) ? 1L : 0L;
        v[165] = ((v[141] - v[160])) & 4294967295L;
        v[166] = v[164] != 0 ? v[165] : v[160];
        switch ((int) v[166]) {
            case 0:
                return 28;
            case 1:
                return 29;
            default:
                return 30;
        }
    }

    private static int b28(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[21], 0L, 1L);
        return 32;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[167] = ((v[138] + 1L)) & 4294967295L;
        v[168] = ((v[167] & 6L)) & 4294967295L;
        F0359_putBit16z.run(m, v[21], v[168], v[138]);
        return 32;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[169] = ((v[140] + 4294967292L)) & 4294967295L;
        v[170] = ((v[169] + v[166])) & 4294967295L;
        v[171] = ((v[138] + 1L)) & 4294967295L;
        F0359_putBit16z.run(m, v[21], v[170], v[171]);
        return 32;
    }

    private static int b31(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[21], v[160], v[138]);
        return 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[172] = v[160] == v[141] ? 1L : 0L;
        v[173] = v[172] != 0 ? 4294967293L : 1L;
        v[174] = ((v[173] + v[143])) & 4294967295L;
        v[175] = v[160] == 0L ? 1L : 0L;
        v[176] = v[175] != 0 ? 4294967293L : 1L;
        v[177] = ((v[176] + v[145])) & 4294967295L;
        v[178] = LibC.call(m, "llvm.smin.i32", new long[]{v[174], 7L});
        v[179] = LibC.call(m, "llvm.smax.i32", new long[]{v[178], 4294967288L});
        m.store(v[142], v[179], 4);
        v[180] = LibC.call(m, "llvm.smin.i32", new long[]{v[177], 7L});
        v[181] = LibC.call(m, "llvm.smax.i32", new long[]{v[180], 4294967288L});
        m.store(v[144], v[181], 4);
        return 34;
    }

    private static int b33(Heap m, long[] v, int previous) {
        long phi182 = (previous == 33 ? v[187] : 0L);
        v[182] = phi182;
        v[183] = (v[7] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[182], 32) * 4L)) & 4294967295L;
        v[184] = m.load(v[183], 4);
        v[185] = Heap.s(v[184], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[186] = (v[185]) & 4294967295L;
        F0359_putBit16z.run(m, v[21], v[186], 1L);
        v[187] = ((v[182] + 1L)) & 4294967295L;
        v[188] = v[187] == v[13] ? 1L : 0L;
        return v[188] != 0 ? 34 : 33;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[189] = m.load(v[24], 4);
        v[190] = Heap.s(v[189], 32) > Heap.s(14L, 32) ? 1L : 0L;
        return v[190] != 0 ? 36 : 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[191] = (v[1] + (Heap.s(0L, 32) * 592L) + 512L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[192] = m.load(v[191], 4);
        v[193] = Heap.s(v[192], 32) > Heap.s(14L, 32) ? 1L : 0L;
        return v[193] != 0 ? 36 : 37;
    }

    private static int b36(Heap m, long[] v, int previous) {
        return 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        long phi194 = (previous == 36 ? 1879048552L : 1879048489L);
        v[194] = phi194;
        v[195] = Heap.s(v[138], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[195] != 0 ? 38 : 52;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[196] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L) & 4294967295L;
        v[197] = v[14] != 0 ? 4L : 8L;
        v[198] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[199] = m.load(v[198], 4);
        v[200] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[201] = m.load(v[200], 4);
        v[202] = (v[5] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[203] = (v[1] + (Heap.s(0L, 32) * 592L) + 512L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        long phi204 = (previous == 38 ? v[189] : v[253]);
        long phi205 = (previous == 38 ? v[5] : v[202]);
        long phi206 = (previous == 38 ? 0L : v[254]);
        v[204] = phi204;
        v[205] = phi205;
        v[206] = phi206;
        v[207] = (v[7] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[206], 32) * 4L)) & 4294967295L;
        v[208] = m.load(v[207], 4);
        v[209] = v[208] == 0L ? 1L : 0L;
        return v[209] != 0 ? 41 : 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[210] = (v[6] + (Heap.s(0L, 32) * 2048L) + (Heap.s(v[206], 32) * 128L)) & 4294967295L;
        v[211] = m.load(v[205], 4);
        v[212] = ((v[211] + v[208])) & 4294967295L;
        m.store(v[205], v[212], 4);
        v[213] = v[206] != 0L ? 1L : 0L;
        v[214] = (v[213]) & 4294967295L;
        v[215] = v[206] == 1L ? 1L : 0L;
        v[216] = ((v[14] & v[215])) & 1L;
        v[217] = v[216] != 0 ? 10L : 1L;
        v[218] = ((v[15] & v[215])) & 1L;
        v[219] = (v[218]) & 4294967295L;
        v[220] = ((v[217] + v[219])) & 4294967295L;
        F0290_EncodeBlock.run(m, v[214], v[210], v[208], v[196], 5L, v[21], v[220]);
        return 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[221] = v[204] == 0L ? 1L : 0L;
        return v[221] != 0 ? 51 : 42;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[222] = v[206] != 0L ? 1L : 0L;
        v[223] = ((v[17] & v[222])) & 1L;
        return v[223] != 0 ? 43 : 50;
    }

    private static int b43(Heap m, long[] v, int previous) {
        long phi224 = (previous == 49 ? v[243] : 1L);
        v[224] = phi224;
        v[225] = (v[199] + (Heap.s(v[224], 32) * 4L)) & 4294967295L;
        v[226] = m.load(v[225], 4);
        v[227] = LibC.call(m, "abs", new long[]{v[226]});
        Dispatch.call(m, v[194], new long[]{v[21], v[227], v[204]});
        v[228] = (v[4] + (Heap.s(0L, 32) * 32L) + (Heap.s(v[224], 32) * 4L)) & 4294967295L;
        v[229] = m.load(v[228], 4);
        v[230] = v[229] == 0L ? 1L : 0L;
        return v[230] != 0 ? 44 : 46;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[231] = m.load(v[225], 4);
        v[232] = v[231] == 0L ? 1L : 0L;
        return v[232] != 0 ? 46 : 45;
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[233] = ((v[231] >>> 31L)) & 4294967295L;
        F0359_putBit16z.run(m, v[21], v[233], 1L);
        return 46;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[234] = (v[201] + (Heap.s(v[224], 32) * 4L)) & 4294967295L;
        v[235] = m.load(v[234], 4);
        v[236] = LibC.call(m, "abs", new long[]{v[235]});
        Dispatch.call(m, v[194], new long[]{v[21], v[236], v[204]});
        v[237] = (v[4] + (Heap.s(0L, 32) * 64L) + (Heap.s(1L, 32) * 32L) + (Heap.s(v[224], 32) * 4L)) & 4294967295L;
        v[238] = m.load(v[237], 4);
        v[239] = v[238] == 0L ? 1L : 0L;
        return v[239] != 0 ? 47 : 49;
    }

    private static int b47(Heap m, long[] v, int previous) {
        v[240] = m.load(v[234], 4);
        v[241] = v[240] == 0L ? 1L : 0L;
        return v[241] != 0 ? 49 : 48;
    }

    private static int b48(Heap m, long[] v, int previous) {
        v[242] = ((v[240] >>> 31L)) & 4294967295L;
        F0359_putBit16z.run(m, v[21], v[242], 1L);
        return 49;
    }

    private static int b49(Heap m, long[] v, int previous) {
        v[243] = ((v[224] + 1L)) & 4294967295L;
        v[244] = v[243] == v[197] ? 1L : 0L;
        return v[244] != 0 ? 51 : 43;
    }

    private static int b50(Heap m, long[] v, int previous) {
        long phi245 = (previous == 50 ? v[251] : 1L);
        v[245] = phi245;
        v[246] = (v[9] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[206], 32) * 64L) + (Heap.s(v[245], 32) * 4L)) & 4294967295L;
        v[247] = m.load(v[246], 4);
        v[248] = ((Heap.s(v[247], 32) >> 1L)) & 4294967295L;
        v[249] = ((v[247] & 1L)) & 4294967295L;
        v[250] = ((v[249] + v[204])) & 4294967295L;
        F0359_putBit16z.run(m, v[21], v[248], v[250]);
        v[251] = ((v[245] + 1L)) & 4294967295L;
        v[252] = v[251] == 16L ? 1L : 0L;
        return v[252] != 0 ? 51 : 50;
    }

    private static int b51(Heap m, long[] v, int previous) {
        v[253] = m.load(v[203], 4);
        v[254] = ((v[206] + 1L)) & 4294967295L;
        v[255] = v[254] == v[138] ? 1L : 0L;
        return v[255] != 0 ? 52 : 39;
    }

    private static int b52(Heap m, long[] v, int previous) {
        v[256] = F0365_writeIS.run(m, v[0], v[21]);
        F0027_UpdateModelMB.run(m, v[11], v[13], v[5], v[23]);
        v[257] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34288L) & 4294967295L;
        v[258] = m.load(v[257], 4);
        v[259] = v[258] == 0L ? 1L : 0L;
        return v[259] != 0 ? 54 : 53;
    }

    private static int b53(Heap m, long[] v, int previous) {
        F0291_AdaptLowpassEnc.run(m, v[1]);
        return 54;
    }

    private static int b54(Heap m, long[] v, int previous) {
        long phi260 = (previous == 0 ? 4294967295L : (previous == 53 ? 0L : 0L));
        v[260] = phi260;
        v[261] = v[260];
        return -1;
    }
}
