package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transcodeTileHeader.
 */
public final class F0251_transcodeTileHeader {

    private F0251_transcodeTileHeader() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[235];
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
                    default:
                        throw new IllegalStateException("Invalid block in transcodeTileHeader");
                }
                previous = old;
                if (pc < 0) {
                    return v[234];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34276L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 55 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34280L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = v[6] == 0L ? 1L : 0L;
        return v[7] != 0 ? 55 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = v[9] == 0L ? 1L : 0L;
        return v[10] != 0 ? 3 : 55;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34308L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[12] + (Heap.s(v[14], 32) * 592L)) & 4294967295L;
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((v[21] + 1L)) & 4294967295L;
        v[23] = ((v[22] * v[19])) & 4294967295L;
        v[24] = ((v[23] + v[14])) & 4294967295L;
        v[25] = (v[24]) & 255L;
        v[26] = ((v[25] & 31L)) & 255L;
        v[27] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 16L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = v[28] == 0L ? 1L : 0L;
        return v[29] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi32 = (previous == 4 ? v[31] : 0L);
        v[32] = phi32;
        v[33] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = m.load(v[15], 4);
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = v[37] != 0L ? 1L : 0L;
        v[39] = (v[38]) & 255L;
        F0406_writePacketHeader.run(m, v[35], v[39], v[26]);
        v[40] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 28L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = v[41] == 0L ? 1L : 0L;
        return v[42] != 0 ? 8 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[43] = m.load(v[36], 4);
        v[44] = v[43] == 0L ? 1L : 0L;
        return v[44] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[45] = m.load(v[15], 4);
        v[46] = (v[12] + (Heap.s(v[14], 32) * 592L) + 584L) & 4294967295L;
        v[47] = m.load(v[46], 4);
        F0297_putBit16.run(m, v[45], v[47], 4L);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[48] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = ((v[49] & 1L)) & 4294967295L;
        v[51] = v[50] == 0L ? 1L : 0L;
        return v[51] != 0 ? 14 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[52] = m.load(v[15], 4);
        v[53] = (v[1] + (Heap.s(0L, 32) * 596L) + 1L) & 4294967295L;
        v[54] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = v[55] > 1L ? 1L : 0L;
        return v[56] != 0 ? 10 : 13;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[57] = m.load(v[1], 1);
        v[58] = LibC.call(m, "llvm.umin.i8", new long[]{v[57], 2L});
        v[59] = (v[58]) & 4294967295L;
        F0297_putBit16.run(m, v[52], v[59], 2L);
        v[60] = m.load(v[53], 1);
        v[61] = (v[60]) & 4294967295L;
        F0297_putBit16.run(m, v[52], v[61], 8L);
        switch ((int) v[58]) {
            case 1:
                return 11;
            case 0:
                return 14;
            default:
                return 12;
        }
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[62] = (v[1] + (Heap.s(0L, 32) * 596L) + 1L + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        return 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi63 = (previous == 12 ? v[67] : 1L);
        v[63] = phi63;
        v[64] = (v[53] + (Heap.s(v[63], 32) * 1L)) & 4294967295L;
        v[65] = m.load(v[64], 1);
        v[66] = (v[65]) & 4294967295L;
        F0297_putBit16.run(m, v[52], v[66], 8L);
        v[67] = ((v[63] + 1L)) & 4294967295L;
        v[68] = v[67] == v[55] ? 1L : 0L;
        return v[68] != 0 ? 14 : 12;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi69 = (previous == 11 ? v[62] : v[53]);
        v[69] = phi69;
        v[70] = m.load(v[69], 1);
        v[71] = (v[70]) & 4294967295L;
        F0297_putBit16.run(m, v[52], v[71], 8L);
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[72] = v[32] == 0L ? 1L : 0L;
        return v[72] != 0 ? 17 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[73] = (v[32] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[74] = m.load(v[73], 4);
        v[75] = ((v[74] & 1L)) & 4294967295L;
        v[76] = v[75] == 0L ? 1L : 0L;
        return v[76] != 0 ? 17 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[77] = m.load(v[15], 4);
        v[78] = (v[1] + (Heap.s(0L, 32) * 596L) + 1L + (Heap.s(v[34], 32) * 1L)) & 4294967295L;
        v[79] = m.load(v[78], 1);
        v[80] = (v[79]) & 4294967295L;
        F0297_putBit16.run(m, v[77], v[80], 8L);
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[81] = m.load(v[36], 4);
        v[82] = v[81] == 0L ? 1L : 0L;
        v[83] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = v[84] == 3L ? 1L : 0L;
        return v[82] != 0 ? 18 : 30;
    }

    private static int b18(Heap m, long[] v, int previous) {
        return v[85] != 0 ? 45 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[86] = m.load(v[48], 4);
        v[87] = ((v[86] & 2L)) & 4294967295L;
        v[88] = v[87] == 0L ? 1L : 0L;
        return v[88] != 0 ? 21 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[89] = m.load(v[15], 4);
        v[90] = (v[1] + (Heap.s(0L, 32) * 596L) + 49L) & 4294967295L;
        v[91] = (v[1] + (Heap.s(0L, 32) * 596L) + 33L) & 4294967295L;
        v[92] = (v[1] + (Heap.s(0L, 32) * 596L) + 24L) & 4294967295L;
        v[93] = m.load(v[92], 1);
        v[94] = (v[93]) & 4294967295L;
        v[95] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32L) & 4294967295L;
        v[96] = m.load(v[95], 4);
        v[97] = (v[1] + (Heap.s(0L, 32) * 596L) + 20L) & 4294967295L;
        v[98] = m.load(v[97], 4);
        F0249_transcodeQuantizers.run(m, v[89], v[90], v[91], v[94], v[96], v[98]);
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        return v[72] != 0 ? 24 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[99] = (v[32] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[100] = m.load(v[99], 4);
        v[101] = ((v[100] & 2L)) & 4294967295L;
        v[102] = v[101] == 0L ? 1L : 0L;
        return v[102] != 0 ? 24 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[103] = m.load(v[15], 4);
        v[104] = (v[1] + (Heap.s(0L, 32) * 596L) + 49L) & 4294967295L;
        v[105] = (v[1] + (Heap.s(0L, 32) * 596L) + 32L) & 4294967295L;
        v[106] = m.load(v[105], 1);
        v[107] = (v[106]) & 4294967295L;
        v[108] = (v[1] + (Heap.s(0L, 32) * 596L) + 28L) & 4294967295L;
        v[109] = m.load(v[108], 4);
        F0250_transcodeQuantizersAlpha.run(m, v[103], v[104], v[107], v[34], v[109]);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[110] = m.load(v[83], 4);
        v[111] = v[110] == 2L ? 1L : 0L;
        return v[111] != 0 ? 45 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[112] = m.load(v[48], 4);
        v[113] = ((v[112] & 4L)) & 4294967295L;
        v[114] = v[113] == 0L ? 1L : 0L;
        return v[114] != 0 ? 27 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[115] = m.load(v[15], 4);
        v[116] = (v[1] + (Heap.s(0L, 32) * 596L) + 337L) & 4294967295L;
        v[117] = (v[1] + (Heap.s(0L, 32) * 596L) + 321L) & 4294967295L;
        v[118] = (v[1] + (Heap.s(0L, 32) * 596L) + 312L) & 4294967295L;
        v[119] = m.load(v[118], 1);
        v[120] = (v[119]) & 4294967295L;
        v[121] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32L) & 4294967295L;
        v[122] = m.load(v[121], 4);
        v[123] = (v[1] + (Heap.s(0L, 32) * 596L) + 308L) & 4294967295L;
        v[124] = m.load(v[123], 4);
        F0249_transcodeQuantizers.run(m, v[115], v[116], v[117], v[120], v[122], v[124]);
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        return v[72] != 0 ? 45 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[125] = (v[32] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[126] = m.load(v[125], 4);
        v[127] = ((v[126] & 4L)) & 4294967295L;
        v[128] = v[127] == 0L ? 1L : 0L;
        return v[128] != 0 ? 45 : 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[129] = m.load(v[15], 4);
        v[130] = (v[1] + (Heap.s(0L, 32) * 596L) + 337L) & 4294967295L;
        v[131] = (v[1] + (Heap.s(0L, 32) * 596L) + 320L) & 4294967295L;
        v[132] = m.load(v[131], 1);
        v[133] = (v[132]) & 4294967295L;
        v[134] = (v[1] + (Heap.s(0L, 32) * 596L) + 316L) & 4294967295L;
        v[135] = m.load(v[134], 4);
        F0250_transcodeQuantizersAlpha.run(m, v[129], v[130], v[133], v[34], v[135]);
        return 45;
    }

    private static int b30(Heap m, long[] v, int previous) {
        return v[85] != 0 ? 45 : 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[136] = (v[12] + (Heap.s(v[14], 32) * 592L) + 4L) & 4294967295L;
        v[137] = m.load(v[136], 4);
        F0406_writePacketHeader.run(m, v[137], 2L, v[26]);
        v[138] = m.load(v[48], 4);
        v[139] = ((v[138] & 2L)) & 4294967295L;
        v[140] = v[139] == 0L ? 1L : 0L;
        return v[140] != 0 ? 33 : 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[141] = m.load(v[136], 4);
        v[142] = (v[1] + (Heap.s(0L, 32) * 596L) + 49L) & 4294967295L;
        v[143] = (v[1] + (Heap.s(0L, 32) * 596L) + 33L) & 4294967295L;
        v[144] = (v[1] + (Heap.s(0L, 32) * 596L) + 24L) & 4294967295L;
        v[145] = m.load(v[144], 1);
        v[146] = (v[145]) & 4294967295L;
        v[147] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32L) & 4294967295L;
        v[148] = m.load(v[147], 4);
        v[149] = (v[1] + (Heap.s(0L, 32) * 596L) + 20L) & 4294967295L;
        v[150] = m.load(v[149], 4);
        F0249_transcodeQuantizers.run(m, v[141], v[142], v[143], v[146], v[148], v[150]);
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        return v[72] != 0 ? 36 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[151] = (v[32] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[152] = m.load(v[151], 4);
        v[153] = ((v[152] & 2L)) & 4294967295L;
        v[154] = v[153] == 0L ? 1L : 0L;
        return v[154] != 0 ? 36 : 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[155] = m.load(v[136], 4);
        v[156] = (v[1] + (Heap.s(0L, 32) * 596L) + 49L) & 4294967295L;
        v[157] = (v[1] + (Heap.s(0L, 32) * 596L) + 32L) & 4294967295L;
        v[158] = m.load(v[157], 1);
        v[159] = (v[158]) & 4294967295L;
        v[160] = (v[1] + (Heap.s(0L, 32) * 596L) + 28L) & 4294967295L;
        v[161] = m.load(v[160], 4);
        F0250_transcodeQuantizersAlpha.run(m, v[155], v[156], v[159], v[34], v[161]);
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[162] = m.load(v[83], 4);
        v[163] = v[162] == 2L ? 1L : 0L;
        return v[163] != 0 ? 45 : 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[164] = (v[12] + (Heap.s(v[14], 32) * 592L) + 8L) & 4294967295L;
        v[165] = m.load(v[164], 4);
        F0406_writePacketHeader.run(m, v[165], 3L, v[26]);
        v[166] = m.load(v[48], 4);
        v[167] = ((v[166] & 4L)) & 4294967295L;
        v[168] = v[167] == 0L ? 1L : 0L;
        return v[168] != 0 ? 39 : 38;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[169] = m.load(v[164], 4);
        v[170] = (v[1] + (Heap.s(0L, 32) * 596L) + 337L) & 4294967295L;
        v[171] = (v[1] + (Heap.s(0L, 32) * 596L) + 321L) & 4294967295L;
        v[172] = (v[1] + (Heap.s(0L, 32) * 596L) + 312L) & 4294967295L;
        v[173] = m.load(v[172], 1);
        v[174] = (v[173]) & 4294967295L;
        v[175] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32L) & 4294967295L;
        v[176] = m.load(v[175], 4);
        v[177] = (v[1] + (Heap.s(0L, 32) * 596L) + 308L) & 4294967295L;
        v[178] = m.load(v[177], 4);
        F0249_transcodeQuantizers.run(m, v[169], v[170], v[171], v[174], v[176], v[178]);
        return 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        return v[72] != 0 ? 42 : 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[179] = (v[32] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[180] = m.load(v[179], 4);
        v[181] = ((v[180] & 4L)) & 4294967295L;
        v[182] = v[181] == 0L ? 1L : 0L;
        return v[182] != 0 ? 42 : 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[183] = m.load(v[164], 4);
        v[184] = (v[1] + (Heap.s(0L, 32) * 596L) + 337L) & 4294967295L;
        v[185] = (v[1] + (Heap.s(0L, 32) * 596L) + 320L) & 4294967295L;
        v[186] = m.load(v[185], 1);
        v[187] = (v[186]) & 4294967295L;
        v[188] = (v[1] + (Heap.s(0L, 32) * 596L) + 316L) & 4294967295L;
        v[189] = m.load(v[188], 4);
        F0250_transcodeQuantizersAlpha.run(m, v[183], v[184], v[187], v[34], v[189]);
        return 42;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[190] = m.load(v[83], 4);
        v[191] = v[190] == 1L ? 1L : 0L;
        return v[191] != 0 ? 45 : 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        v[192] = (v[12] + (Heap.s(v[14], 32) * 592L) + 12L) & 4294967295L;
        v[193] = m.load(v[192], 4);
        F0406_writePacketHeader.run(m, v[193], 4L, v[26]);
        v[194] = m.load(v[40], 4);
        v[195] = v[194] == 0L ? 1L : 0L;
        return v[195] != 0 ? 45 : 44;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[196] = m.load(v[192], 4);
        v[197] = (v[12] + (Heap.s(v[14], 32) * 592L) + 584L) & 4294967295L;
        v[198] = m.load(v[197], 4);
        F0297_putBit16.run(m, v[196], v[198], 4L);
        return 45;
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[199] = (v[1] + (Heap.s(0L, 32) * 596L) + 20L) & 4294967295L;
        v[200] = m.load(v[199], 4);
        v[201] = v[200] == 0L ? 1L : 0L;
        return v[201] != 0 ? 46 : 47;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[202] = (v[1] + (Heap.s(0L, 32) * 596L) + 24L) & 4294967295L;
        v[203] = m.load(v[202], 1);
        v[204] = F0352_dquantBits.run(m, v[203]);
        return 47;
    }

    private static int b47(Heap m, long[] v, int previous) {
        long phi205 = (previous == 46 ? v[204] : 0L);
        v[205] = phi205;
        v[206] = (v[17] + (Heap.s(v[14], 32) * 240L) + 194L) & 4294967295L;
        m.store(v[206], v[205], 1);
        v[207] = (v[1] + (Heap.s(0L, 32) * 596L) + 308L) & 4294967295L;
        v[208] = m.load(v[207], 4);
        v[209] = v[208] == 0L ? 1L : 0L;
        return v[209] != 0 ? 48 : 49;
    }

    private static int b48(Heap m, long[] v, int previous) {
        v[210] = (v[1] + (Heap.s(0L, 32) * 596L) + 312L) & 4294967295L;
        v[211] = m.load(v[210], 1);
        v[212] = F0352_dquantBits.run(m, v[211]);
        return 49;
    }

    private static int b49(Heap m, long[] v, int previous) {
        long phi213 = (previous == 48 ? v[212] : 0L);
        v[213] = phi213;
        v[214] = (v[17] + (Heap.s(v[14], 32) * 240L) + 195L) & 4294967295L;
        m.store(v[214], v[213], 1);
        return v[72] != 0 ? 55 : 50;
    }

    private static int b50(Heap m, long[] v, int previous) {
        v[215] = (v[32] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[216] = m.load(v[215], 4);
        v[217] = m.load(v[13], 4);
        v[218] = (v[1] + (Heap.s(0L, 32) * 596L) + 28L) & 4294967295L;
        v[219] = m.load(v[218], 4);
        v[220] = v[219] == 0L ? 1L : 0L;
        return v[220] != 0 ? 51 : 52;
    }

    private static int b51(Heap m, long[] v, int previous) {
        v[221] = (v[1] + (Heap.s(0L, 32) * 596L) + 32L) & 4294967295L;
        v[222] = m.load(v[221], 1);
        v[223] = F0352_dquantBits.run(m, v[222]);
        return 52;
    }

    private static int b52(Heap m, long[] v, int previous) {
        long phi224 = (previous == 51 ? v[223] : 0L);
        v[224] = phi224;
        v[225] = (v[216] + (Heap.s(v[217], 32) * 240L) + 194L) & 4294967295L;
        m.store(v[225], v[224], 1);
        v[226] = (v[1] + (Heap.s(0L, 32) * 596L) + 316L) & 4294967295L;
        v[227] = m.load(v[226], 4);
        v[228] = v[227] == 0L ? 1L : 0L;
        return v[228] != 0 ? 53 : 54;
    }

    private static int b53(Heap m, long[] v, int previous) {
        v[229] = (v[1] + (Heap.s(0L, 32) * 596L) + 320L) & 4294967295L;
        v[230] = m.load(v[229], 1);
        v[231] = F0352_dquantBits.run(m, v[230]);
        return 54;
    }

    private static int b54(Heap m, long[] v, int previous) {
        long phi232 = (previous == 53 ? v[231] : 0L);
        v[232] = phi232;
        v[233] = (v[216] + (Heap.s(v[217], 32) * 240L) + 195L) & 4294967295L;
        m.store(v[233], v[232], 1);
        return 55;
    }

    private static int b55(Heap m, long[] v, int previous) {
        return -1;
    }
}
