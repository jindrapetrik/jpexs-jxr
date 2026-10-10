package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writeTileHeaderDC.
 */
public final class F0407_writeTileHeaderDC {

    private F0407_writeTileHeaderDC() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[129];
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
                    default:
                        throw new IllegalStateException("Invalid block in writeTileHeaderDC");
                }
                previous = old;
                if (pc < 0) {
                    return v[128];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        v[5] = v[4] != 0 ? 1L : 2L;
        return 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi6 = (previous == 0 ? v[5] : v[125]);
        long phi7 = (previous == 0 ? v[0] : v[124]);
        v[6] = phi6;
        v[7] = phi7;
        v[8] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[9] & 1L)) & 4294967295L;
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 19 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[13] + (Heap.s(v[15], 32) * 240L)) & 4294967295L;
        v[17] = LibC.call(m, "rand", new long[]{});
        v[18] = (v[17]) & 255L;
        v[19] = ((v[18] & 3L)) & 255L;
        v[20] = (v[13] + (Heap.s(v[15], 32) * 240L) + 204L) & 4294967295L;
        m.store(v[20], v[19], 1);
        v[21] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = m.load(v[14], 4);
        v[24] = ((0L - v[23])) & 4294967295L;
        v[25] = v[22] == v[24] ? 1L : 0L;
        return v[25] != 0 ? 3 : 6;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[26] = (v[7] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[27] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        return 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[28] = ((v[31] + 1L)) & 4294967295L;
        v[29] = m.load(v[26], 4);
        v[30] = v[28] > v[29] ? 1L : 0L;
        return v[30] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi31 = (previous == 3 ? 0L : v[28]);
        v[31] = phi31;
        v[32] = m.load(v[12], 4);
        v[33] = (v[32] + (Heap.s(v[31], 32) * 240L)) & 4294967295L;
        v[34] = m.load(v[27], 4);
        v[35] = F0347_allocateQuantizer.run(m, v[33], v[34], 1L);
        v[36] = v[35] == 0L ? 1L : 0L;
        return v[36] != 0 ? 4 : 20;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[37] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = v[38] == 0L ? 1L : 0L;
        return v[39] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi40 = (previous == 7 ? v[47] : 0L);
        v[40] = phi40;
        v[41] = LibC.call(m, "rand", new long[]{});
        v[42] = (v[41]) & 255L;
        v[43] = ((v[42] & 47L)) & 255L;
        v[44] = ((v[43] + 1L)) & 255L;
        v[45] = (v[16] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[40], 32) * 4L)) & 4294967295L;
        v[46] = m.load(v[45], 4);
        m.store(v[46], v[44], 1);
        v[47] = ((v[40] + 1L)) & 4294967295L;
        v[48] = m.load(v[37], 4);
        v[49] = v[47] < v[48] ? 1L : 0L;
        return v[49] != 0 ? 7 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi50 = (previous == 6 ? 0L : v[48]);
        v[50] = phi50;
        v[51] = m.load(v[20], 1);
        v[52] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        v[53] = m.load(v[52], 4);
        F0348_formatQuantizer.run(m, v[16], v[51], v[50], 0L, 1L, v[53]);
        v[54] = m.load(v[37], 4);
        v[55] = v[54] == 0L ? 1L : 0L;
        return v[55] != 0 ? 18 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[56] = ((v[54] & 3L)) & 4294967295L;
        v[57] = v[54] < 4L ? 1L : 0L;
        return v[57] != 0 ? 12 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[58] = ((v[54] & 4294967292L)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi59 = (previous == 10 ? 0L : v[88]);
        long phi60 = (previous == 10 ? 0L : v[89]);
        v[59] = phi59;
        v[60] = phi60;
        v[61] = (v[16] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[59], 32) * 4L)) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = (v[62] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = ((Heap.s(v[64], 32) >> 1L)) & 4294967295L;
        v[66] = (v[62] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        m.store(v[66], v[65], 4);
        v[67] = ((v[59] | 1L)) & 4294967295L;
        v[68] = (v[16] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[67], 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = (v[69] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = ((Heap.s(v[71], 32) >> 1L)) & 4294967295L;
        v[73] = (v[69] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        m.store(v[73], v[72], 4);
        v[74] = ((v[59] | 2L)) & 4294967295L;
        v[75] = (v[16] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[74], 32) * 4L)) & 4294967295L;
        v[76] = m.load(v[75], 4);
        v[77] = (v[76] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        v[78] = m.load(v[77], 4);
        v[79] = ((Heap.s(v[78], 32) >> 1L)) & 4294967295L;
        v[80] = (v[76] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        m.store(v[80], v[79], 4);
        v[81] = ((v[59] | 3L)) & 4294967295L;
        v[82] = (v[16] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[81], 32) * 4L)) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = (v[83] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = ((Heap.s(v[85], 32) >> 1L)) & 4294967295L;
        v[87] = (v[83] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        m.store(v[87], v[86], 4);
        v[88] = ((v[59] + 4L)) & 4294967295L;
        v[89] = ((v[60] + 4L)) & 4294967295L;
        v[90] = v[89] == v[58] ? 1L : 0L;
        return v[90] != 0 ? 12 : 11;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi91 = (previous == 9 ? 0L : v[88]);
        v[91] = phi91;
        v[92] = v[56] == 0L ? 1L : 0L;
        return v[92] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi93 = (previous == 13 ? v[101] : v[91]);
        long phi94 = (previous == 13 ? v[102] : 0L);
        v[93] = phi93;
        v[94] = phi94;
        v[95] = (v[16] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        v[96] = m.load(v[95], 4);
        v[97] = (v[96] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = ((Heap.s(v[98], 32) >> 1L)) & 4294967295L;
        v[100] = (v[96] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        m.store(v[100], v[99], 4);
        v[101] = ((v[93] + 1L)) & 4294967295L;
        v[102] = ((v[94] + 1L)) & 4294967295L;
        v[103] = v[102] == v[56] ? 1L : 0L;
        return v[103] != 0 ? 14 : 13;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[104] = v[54] == 1L ? 1L : 0L;
        return v[104] != 0 ? 18 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[105] = m.load(v[20], 1);
        v[106] = LibC.call(m, "llvm.umin.i8", new long[]{v[105], 2L});
        v[107] = (v[106]) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[107], 2L);
        v[108] = m.load(v[16], 4);
        v[109] = m.load(v[108], 1);
        v[110] = (v[109]) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[110], 8L);
        switch ((int) v[106]) {
            case 1:
                return 16;
            case 0:
                return 19;
            default:
                return 17;
        }
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[111] = (v[16] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi112 = (previous == 17 ? v[117] : 1L);
        v[112] = phi112;
        v[113] = (v[16] + (Heap.s(v[112], 32) * 4L)) & 4294967295L;
        v[114] = m.load(v[113], 4);
        v[115] = m.load(v[114], 1);
        v[116] = (v[115]) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[116], 8L);
        v[117] = ((v[112] + 1L)) & 4294967295L;
        v[118] = v[117] == v[54] ? 1L : 0L;
        return v[118] != 0 ? 19 : 17;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi119 = (previous == 16 ? v[111] : (previous == 14 ? v[16] : v[16]));
        v[119] = phi119;
        v[120] = m.load(v[119], 4);
        v[121] = m.load(v[120], 1);
        v[122] = (v[121]) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[122], 8L);
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[123] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[124] = m.load(v[123], 4);
        v[125] = ((v[6] + 4294967295L)) & 4294967295L;
        v[126] = v[125] == 0L ? 1L : 0L;
        return v[126] != 0 ? 20 : 1;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi127 = (previous == 5 ? 4294967295L : 0L);
        v[127] = phi127;
        v[128] = v[127];
        return -1;
    }
}
