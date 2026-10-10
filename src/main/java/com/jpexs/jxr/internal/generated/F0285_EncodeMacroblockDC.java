package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: EncodeMacroblockDC.
 */
public final class F0285_EncodeMacroblockDC {

    private F0285_EncodeMacroblockDC() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[175];
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
                    default:
                        throw new IllegalStateException("Invalid block in EncodeMacroblockDC");
                }
                previous = old;
                if (pc < 0) {
                    return v[174];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.stack(8L * 1L, 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = m.load(v[1], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L) & 4294967295L;
        m.store(v[4], 0L, 8);
        v[11] = (v[1] + (Heap.s(0L, 32) * 592L) + 532L) & 4294967295L;
        v[12] = (v[1] + (Heap.s(0L, 32) * 592L) + 532L + 8L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = F0365_writeIS.run(m, v[0], v[9]);
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 56L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = v[20] == 0L ? 1L : 0L;
        return v[21] != 0 ? 1 : 6;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[22] = (v[6] + (Heap.s(v[8], 32) * 240L) + 192L) & 4294967295L;
        v[23] = m.load(v[22], 1);
        v[24] = v[23] > 1L ? 1L : 0L;
        return v[24] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[25] = LibC.call(m, "rand", new long[]{});
        v[26] = m.load(v[22], 1);
        v[27] = (v[26]) & 4294967295L;
        v[28] = ((Heap.s(v[25], 32) % Heap.s(v[27], 32))) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi29 = (previous == 2 ? v[28] : 0L);
        v[29] = phi29;
        v[30] = (v[29]) & 255L;
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1156L) & 4294967295L;
        m.store(v[31], v[30], 1);
        v[32] = (v[6] + (Heap.s(v[8], 32) * 240L) + 193L) & 4294967295L;
        v[33] = m.load(v[32], 1);
        v[34] = v[33] > 1L ? 1L : 0L;
        return v[34] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[35] = LibC.call(m, "rand", new long[]{});
        v[36] = m.load(v[32], 1);
        v[37] = (v[36]) & 4294967295L;
        v[38] = ((Heap.s(v[35], 32) % Heap.s(v[37], 32))) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi39 = (previous == 4 ? v[38] : 0L);
        v[39] = phi39;
        v[40] = (v[39]) & 255L;
        v[41] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1157L) & 4294967295L;
        m.store(v[41], v[40], 1);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[42] = (v[6] + (Heap.s(v[8], 32) * 240L) + 195L) & 4294967295L;
        v[43] = m.load(v[42], 1);
        v[44] = v[43] == 0L ? 1L : 0L;
        return v[44] != 0 ? 7 : 9;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[45] = (v[6] + (Heap.s(v[8], 32) * 240L) + 193L) & 4294967295L;
        v[46] = m.load(v[45], 1);
        v[47] = v[46] > 1L ? 1L : 0L;
        return v[47] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[48] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1156L) & 4294967295L;
        v[49] = m.load(v[48], 1);
        v[50] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1157L) & 4294967295L;
        m.store(v[50], v[49], 1);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[51] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = v[52] == 0L ? 1L : 0L;
        return v[53] != 0 ? 10 : 20;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[54] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = v[55] == 3L ? 1L : 0L;
        return v[56] != 0 ? 20 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[57] = (v[6] + (Heap.s(v[8], 32) * 240L) + 194L) & 4294967295L;
        v[58] = m.load(v[57], 1);
        v[59] = v[58] == 0L ? 1L : 0L;
        return v[59] != 0 ? 15 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[60] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1156L) & 4294967295L;
        v[61] = m.load(v[60], 1);
        v[62] = v[61] == 0L ? 1L : 0L;
        return v[62] != 0 ? 13 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[9], 0L, 1L);
        return 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[63] = (v[61]) & 4294967295L;
        F0359_putBit16z.run(m, v[9], 1L, 1L);
        v[64] = ((v[63] + 4294967295L)) & 4294967295L;
        v[65] = (v[58]) & 4294967295L;
        F0359_putBit16z.run(m, v[9], v[64], v[65]);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[66] = m.load(v[54], 4);
        v[67] = v[66] == 2L ? 1L : 0L;
        return v[67] != 0 ? 20 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[68] = m.load(v[42], 1);
        v[69] = v[68] == 0L ? 1L : 0L;
        return v[69] != 0 ? 20 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[70] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1157L) & 4294967295L;
        v[71] = m.load(v[70], 1);
        v[72] = v[71] == 0L ? 1L : 0L;
        return v[72] != 0 ? 18 : 19;
    }

    private static int b18(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[9], 0L, 1L);
        return 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[73] = (v[71]) & 4294967295L;
        F0359_putBit16z.run(m, v[9], 1L, 1L);
        v[74] = ((v[73] + 4294967295L)) & 4294967295L;
        v[75] = (v[68]) & 4294967295L;
        F0359_putBit16z.run(m, v[9], v[74], v[75]);
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[76] = m.load(v[19], 4);
        v[77] = v[76] == 0L ? 1L : 0L;
        return v[77] != 0 ? 21 : 22;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[78] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34420L) & 4294967295L;
        v[79] = m.load(v[78], 4);
        v[80] = Dispatch.call(m, v[79], new long[]{v[0]});
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        F0485_predMacroblockEnc.run(m, v[0]);
        switch ((int) v[15]) {
            case 6:
                return 23;
            case 4:
                return 23;
            case 0:
                return 23;
            default:
                return 37;
        }
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[81] = Heap.s(v[17], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[81] != 0 ? 24 : 50;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[82] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[83] = (v[4] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[84] = (v[1] + (Heap.s(0L, 32) * 592L) + 532L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[85] = m.load(v[10], 4);
        v[86] = ((v[85] >>> 31L)) & 4294967295L;
        v[87] = LibC.call(m, "abs", new long[]{v[85]});
        v[88] = ((Heap.s(v[87], 32) >> v[13])) & 4294967295L;
        v[89] = v[88] == 0L ? 1L : 0L;
        return v[89] != 0 ? 26 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[9], 1L, 1L);
        v[90] = m.load(v[82], 4);
        F0287_EncodeSignificantAbsLevel.run(m, v[88], v[90], v[9]);
        m.store(v[4], 1L, 4);
        return 27;
    }

    private static int b26(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[9], 0L, 1L);
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        F0297_putBit16.run(m, v[9], v[87], v[13]);
        v[91] = v[87] == 0L ? 1L : 0L;
        return v[91] != 0 ? 29 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[9], v[86], 1L);
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[92] = v[17] == 1L ? 1L : 0L;
        return v[92] != 0 ? 50 : 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[93] = m.load(v[83], 4);
        return 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        long phi94 = (previous == 30 ? v[93] : v[106]);
        long phi95 = (previous == 30 ? 0L : v[107]);
        long phi96 = (previous == 30 ? 1L : v[109]);
        v[94] = phi94;
        v[95] = phi95;
        v[96] = phi96;
        v[97] = m.load(v[84], 4);
        v[98] = (v[10] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[96], 32) * 64L)) & 4294967295L;
        v[99] = m.load(v[98], 4);
        v[100] = ((v[99] >>> 31L)) & 4294967295L;
        v[101] = LibC.call(m, "abs", new long[]{v[99]});
        v[102] = ((Heap.s(v[101], 32) >> v[97])) & 4294967295L;
        v[103] = v[102] == 0L ? 1L : 0L;
        return v[103] != 0 ? 33 : 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[9], 1L, 1L);
        v[104] = m.load(v[82], 4);
        F0287_EncodeSignificantAbsLevel.run(m, v[102], v[104], v[9]);
        v[105] = ((v[95] + 1L)) & 4294967295L;
        return 34;
    }

    private static int b33(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[9], 0L, 1L);
        return 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        long phi106 = (previous == 33 ? v[94] : v[105]);
        long phi107 = (previous == 33 ? v[95] : v[105]);
        v[106] = phi106;
        v[107] = phi107;
        F0297_putBit16.run(m, v[9], v[101], v[97]);
        v[108] = v[101] == 0L ? 1L : 0L;
        return v[108] != 0 ? 36 : 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[9], v[100], 1L);
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[109] = ((v[96] + 1L)) & 4294967295L;
        v[110] = v[109] == v[17] ? 1L : 0L;
        return v[110] != 0 ? 49 : 31;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[111] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[112] = m.load(v[111], 4);
        v[113] = m.load(v[10], 4);
        v[114] = LibC.call(m, "abs", new long[]{v[113]});
        v[115] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(1L, 32) * 64L)) & 4294967295L;
        v[116] = m.load(v[115], 4);
        v[117] = LibC.call(m, "abs", new long[]{v[116]});
        v[118] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 0L + (Heap.s(2L, 32) * 64L)) & 4294967295L;
        v[119] = m.load(v[118], 4);
        v[120] = LibC.call(m, "abs", new long[]{v[119]});
        v[121] = ((Heap.s(v[114], 32) >> v[13])) & 4294967295L;
        v[122] = (v[1] + (Heap.s(0L, 32) * 592L) + 532L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[123] = m.load(v[122], 4);
        v[124] = ((Heap.s(v[117], 32) >> v[123])) & 4294967295L;
        v[125] = ((Heap.s(v[120], 32) >> v[123])) & 4294967295L;
        v[126] = m.load(v[12], 4);
        v[127] = v[121] == 0L ? 1L : 0L;
        v[128] = v[127] != 0 ? 0L : 4L;
        v[129] = v[124] == 0L ? 1L : 0L;
        v[130] = v[129] != 0 ? 0L : 2L;
        v[131] = ((v[130] | v[128])) & 4294967295L;
        v[132] = v[125] != 0L ? 1L : 0L;
        v[133] = (v[132]) & 4294967295L;
        v[134] = ((v[131] | v[133])) & 4294967295L;
        v[135] = (v[112] + (Heap.s(0L, 32) * 44L) + 4L) & 4294967295L;
        v[136] = m.load(v[135], 4);
        v[137] = ((v[134] << 1L)) & 4294967295L;
        v[138] = ((v[137] | 1L)) & 4294967295L;
        v[139] = (v[136] + (Heap.s(v[138], 32) * 4L)) & 4294967295L;
        v[140] = m.load(v[139], 4);
        v[141] = (v[136] + (Heap.s(v[137], 32) * 4L)) & 4294967295L;
        v[142] = (v[141] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[143] = m.load(v[142], 4);
        F0359_putBit16z.run(m, v[9], v[140], v[143]);
        return v[127] != 0 ? 39 : 38;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[144] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[145] = m.load(v[144], 4);
        F0287_EncodeSignificantAbsLevel.run(m, v[121], v[145], v[9]);
        m.store(v[4], 1L, 4);
        return 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[146] = LibC.call(m, "abs", new long[]{v[113]});
        F0297_putBit16.run(m, v[9], v[146], v[126]);
        v[147] = v[113] == 0L ? 1L : 0L;
        return v[147] != 0 ? 41 : 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[148] = ((v[113] >>> 31L)) & 4294967295L;
        F0359_putBit16z.run(m, v[9], v[148], 1L);
        return 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[149] = (v[4] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[150] = m.load(v[122], 4);
        return v[129] != 0 ? 43 : 42;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[151] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[152] = m.load(v[151], 4);
        F0287_EncodeSignificantAbsLevel.run(m, v[124], v[152], v[9]);
        m.store(v[149], 1L, 4);
        return 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        long phi153 = (previous == 42 ? 2L : 1L);
        v[153] = phi153;
        v[154] = LibC.call(m, "abs", new long[]{v[116]});
        F0297_putBit16.run(m, v[9], v[154], v[150]);
        v[155] = v[116] == 0L ? 1L : 0L;
        return v[155] != 0 ? 45 : 44;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[156] = ((v[116] >>> 31L)) & 4294967295L;
        F0359_putBit16z.run(m, v[9], v[156], 1L);
        return 45;
    }

    private static int b45(Heap m, long[] v, int previous) {
        return v[132] != 0 ? 46 : 47;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[157] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[158] = m.load(v[157], 4);
        F0287_EncodeSignificantAbsLevel.run(m, v[125], v[158], v[9]);
        m.store(v[149], v[153], 4);
        return 47;
    }

    private static int b47(Heap m, long[] v, int previous) {
        v[159] = LibC.call(m, "abs", new long[]{v[119]});
        F0297_putBit16.run(m, v[9], v[159], v[150]);
        v[160] = v[119] == 0L ? 1L : 0L;
        return v[160] != 0 ? 50 : 48;
    }

    private static int b48(Heap m, long[] v, int previous) {
        v[161] = ((v[119] >>> 31L)) & 4294967295L;
        F0359_putBit16z.run(m, v[9], v[161], 1L);
        return 50;
    }

    private static int b49(Heap m, long[] v, int previous) {
        m.store(v[83], v[106], 4);
        return 50;
    }

    private static int b50(Heap m, long[] v, int previous) {
        F0027_UpdateModelMB.run(m, v[15], v[17], v[4], v[11]);
        v[162] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34288L) & 4294967295L;
        v[163] = m.load(v[162], 4);
        v[164] = v[163] == 0L ? 1L : 0L;
        return v[164] != 0 ? 53 : 51;
    }

    private static int b51(Heap m, long[] v, int previous) {
        v[165] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[166] = m.load(v[165], 4);
        v[167] = v[166] == 3L ? 1L : 0L;
        return v[167] != 0 ? 52 : 53;
    }

    private static int b52(Heap m, long[] v, int previous) {
        v[168] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[169] = m.load(v[168], 4);
        F0005_AdaptDiscriminant.run(m, v[169]);
        v[170] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[171] = m.load(v[170], 4);
        F0005_AdaptDiscriminant.run(m, v[171]);
        v[172] = (v[1] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[173] = m.load(v[172], 4);
        F0005_AdaptDiscriminant.run(m, v[173]);
        return 53;
    }

    private static int b53(Heap m, long[] v, int previous) {
        v[174] = 0L;
        return -1;
    }
}
