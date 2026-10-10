package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: encodeMB.
 */
public final class F0410_encodeMB {

    private F0410_encodeMB() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[154];
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
                    default:
                        throw new IllegalStateException("Invalid block in encodeMB");
                }
                previous = old;
                if (pc < 0) {
                    return v[153];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(4L * 1L, 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34308L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = (v[5] + (Heap.s(v[7], 32) * 592L)) & 4294967295L;
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34276L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 13 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34280L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 13 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 3 : 13;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 56L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = v[19] == 0L ? 1L : 0L;
        return v[20] != 0 ? 4 : 13;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = ((v[24] + 1L)) & 4294967295L;
        v[26] = ((v[25] * v[22])) & 4294967295L;
        v[27] = ((v[26] + v[7])) & 4294967295L;
        v[28] = (v[27]) & 255L;
        v[29] = ((v[28] & 31L)) & 255L;
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = v[31] == 0L ? 1L : 0L;
        v[33] = m.load(v[8], 4);
        F0297_putBit16.run(m, v[33], 0L, 8L);
        F0297_putBit16.run(m, v[33], 0L, 8L);
        F0297_putBit16.run(m, v[33], 1L, 8L);
        v[34] = ((v[27] << 3L)) & 4294967295L;
        v[35] = ((v[34] & 248L)) & 4294967295L;
        return v[32] != 0 ? 5 : 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        F0297_putBit16.run(m, v[33], v[35], 8L);
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 28L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = v[37] == 0L ? 1L : 0L;
        return v[38] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[39] = m.load(v[8], 4);
        v[40] = (v[5] + (Heap.s(v[7], 32) * 592L) + 584L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        F0297_putBit16.run(m, v[39], v[41], 4L);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[42] = m.load(v[8], 4);
        v[43] = F0407_writeTileHeaderDC.run(m, v[0], v[42]);
        v[44] = m.load(v[8], 4);
        v[45] = F0408_writeTileHeaderLP.run(m, v[0], v[44]);
        v[46] = m.load(v[8], 4);
        v[47] = F0409_writeTileHeaderHP.run(m, v[0], v[46]);
        return 13;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[48] = ((v[35] | 1L)) & 4294967295L;
        F0297_putBit16.run(m, v[33], v[48], 8L);
        v[49] = m.load(v[8], 4);
        v[50] = F0407_writeTileHeaderDC.run(m, v[0], v[49]);
        v[51] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34236L) & 4294967295L;
        v[52] = m.load(v[51], 1);
        v[53] = v[52] > 1L ? 1L : 0L;
        return v[53] != 0 ? 9 : 13;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[54] = (v[5] + (Heap.s(v[7], 32) * 592L) + 4L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        F0406_writePacketHeader.run(m, v[55], 2L, v[29]);
        v[56] = m.load(v[54], 4);
        v[57] = F0408_writeTileHeaderLP.run(m, v[0], v[56]);
        v[58] = m.load(v[51], 1);
        v[59] = v[58] > 2L ? 1L : 0L;
        return v[59] != 0 ? 10 : 13;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[60] = (v[5] + (Heap.s(v[7], 32) * 592L) + 8L) & 4294967295L;
        v[61] = m.load(v[60], 4);
        F0406_writePacketHeader.run(m, v[61], 3L, v[29]);
        v[62] = m.load(v[60], 4);
        v[63] = F0409_writeTileHeaderHP.run(m, v[0], v[62]);
        v[64] = m.load(v[51], 1);
        v[65] = v[64] > 3L ? 1L : 0L;
        return v[65] != 0 ? 11 : 13;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[66] = (v[5] + (Heap.s(v[7], 32) * 592L) + 12L) & 4294967295L;
        v[67] = m.load(v[66], 4);
        F0406_writePacketHeader.run(m, v[67], 4L, v[29]);
        v[68] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 28L) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = v[69] == 0L ? 1L : 0L;
        return v[70] != 0 ? 13 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[71] = m.load(v[66], 4);
        v[72] = (v[5] + (Heap.s(v[7], 32) * 592L) + 584L) & 4294967295L;
        v[73] = m.load(v[72], 4);
        F0297_putBit16.run(m, v[71], v[73], 4L);
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[74] = F0285_EncodeMacroblockDC.run(m, v[0], v[8], v[1], v[2]);
        v[75] = v[74] == 0L ? 1L : 0L;
        return v[75] != 0 ? 14 : 32;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[76] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = v[77] == 3L ? 1L : 0L;
        return v[78] != 0 ? 18 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[79] = F0288_EncodeMacroblockLowpass.run(m, v[0], v[8], v[1], v[2]);
        v[80] = v[79] == 0L ? 1L : 0L;
        return v[80] != 0 ? 16 : 32;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[81] = m.load(v[76], 4);
        v[82] = ((v[81] & 4294967294L)) & 4294967295L;
        v[83] = v[82] == 2L ? 1L : 0L;
        return v[83] != 0 ? 18 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[84] = F0293_EncodeMacroblockHighpass.run(m, v[0], v[8], v[1], v[2]);
        v[85] = v[84] == 0L ? 1L : 0L;
        return v[85] != 0 ? 18 : 32;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[86] = ((v[1] + 1L)) & 4294967295L;
        v[87] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[88] = m.load(v[87], 4);
        v[89] = v[86] == v[88] ? 1L : 0L;
        return v[89] != 0 ? 19 : 32;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[90] = ((v[2] + 1L)) & 4294967295L;
        v[91] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        v[92] = m.load(v[91], 4);
        v[93] = v[90] == v[92] ? 1L : 0L;
        return v[93] != 0 ? 22 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[94] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = v[95] < v[97] ? 1L : 0L;
        return v[98] != 0 ? 21 : 32;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[99] = ((v[95] + 1L)) & 4294967295L;
        v[100] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L + (Heap.s(v[99], 32) * 4L)) & 4294967295L;
        v[101] = m.load(v[100], 4);
        v[102] = ((v[101] + 4294967295L)) & 4294967295L;
        v[103] = v[102] == v[2] ? 1L : 0L;
        return v[103] != 0 ? 22 : 32;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[104] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[105] = m.load(v[104], 4);
        v[106] = v[105] == 0L ? 1L : 0L;
        return v[106] != 0 ? 24 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[107] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        v[108] = m.load(v[107], 4);
        v[109] = v[108] == 0L ? 1L : 0L;
        return v[109] != 0 ? 28 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[110] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        v[111] = m.load(v[110], 4);
        v[112] = v[111] == 0L ? 1L : 0L;
        return v[112] != 0 ? 28 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[113] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34296L) & 4294967295L;
        v[114] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34920L) & 4294967295L;
        v[115] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34264L) & 4294967295L;
        v[116] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi117 = (previous == 25 ? 0L : v[139]);
        v[117] = phi117;
        v[118] = m.load(v[113], 4);
        v[119] = (v[118] + (Heap.s(v[117], 32) * 4L)) & 4294967295L;
        v[120] = m.load(v[119], 4);
        F0361_fillToByte.run(m, v[120]);
        v[121] = m.load(v[114], 4);
        v[122] = (v[121] + (Heap.s(v[117], 32) * 4L)) & 4294967295L;
        v[123] = m.load(v[122], 4);
        v[124] = (v[123] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[125] = m.load(v[124], 4);
        v[126] = Dispatch.call(m, v[125], new long[]{v[123], v[3]});
        v[127] = m.load(v[3], 4);
        v[128] = m.load(v[113], 4);
        v[129] = (v[128] + (Heap.s(v[117], 32) * 4L)) & 4294967295L;
        v[130] = m.load(v[129], 4);
        v[131] = F0367_getSizeWrite.run(m, v[130]);
        v[132] = ((v[131] + v[127])) & 4294967295L;
        v[133] = m.load(v[115], 4);
        v[134] = m.load(v[110], 4);
        v[135] = m.load(v[116], 4);
        v[136] = ((v[135] * v[134])) & 4294967295L;
        v[137] = (v[133] + (Heap.s(v[136], 32) * 4L)) & 4294967295L;
        v[138] = (v[137] + (Heap.s(v[117], 32) * 4L)) & 4294967295L;
        m.store(v[138], v[132], 4);
        v[139] = ((v[117] + 1L)) & 4294967295L;
        v[140] = m.load(v[110], 4);
        v[141] = v[139] < v[140] ? 1L : 0L;
        return v[141] != 0 ? 26 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[142] = m.load(v[91], 4);
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi143 = (previous == 27 ? v[142] : (previous == 24 ? v[92] : v[92]));
        v[143] = phi143;
        v[144] = v[90] == v[143] ? 1L : 0L;
        return v[144] != 0 ? 31 : 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[145] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        return 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi146 = (previous == 29 ? 0L : v[149]);
        v[146] = phi146;
        v[147] = m.load(v[4], 4);
        v[148] = (v[147] + (Heap.s(v[146], 32) * 592L)) & 4294967295L;
        F0025_ResetCodingContextEnc.run(m, v[148]);
        v[149] = ((v[146] + 1L)) & 4294967295L;
        v[150] = m.load(v[145], 4);
        v[151] = v[149] > v[150] ? 1L : 0L;
        return v[151] != 0 ? 31 : 30;
    }

    private static int b31(Heap m, long[] v, int previous) {
        return 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        long phi152 = (previous == 13 ? 4294967295L : (previous == 15 ? 4294967295L : (previous == 17 ? 4294967295L : (previous == 31 ? 0L : (previous == 21 ? 0L : (previous == 20 ? 0L : 0L))))));
        v[152] = phi152;
        v[153] = v[152];
        return -1;
    }
}
