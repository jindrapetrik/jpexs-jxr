package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: WriteWMIHeader.
 */
public final class F0421_WriteWMIHeader {

    private F0421_WriteWMIHeader() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[142];
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
                    default:
                        throw new IllegalStateException("Invalid block in WriteWMIHeader");
                }
                previous = old;
                if (pc < 0) {
                    return v[141];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = m.load(v[1], 4);
        v[5] = ((v[4] + 4294963215L)) & 4294967295L;
        v[6] = v[5] < 4294963200L ? 1L : 0L;
        return v[6] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 4L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] + 15L)) & 4294967295L;
        v[10] = v[9] < 4096L ? 1L : 0L;
        v[11] = (v[10]) & 4294967295L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi12 = (previous == 0 ? 0L : v[11]);
        v[12] = phi12;
        v[13] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 56L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = v[14] == 0L ? 1L : 0L;
        return v[15] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 48L) & 4294967295L;
        m.store(v[16], 0L, 4);
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 52L) & 4294967295L;
        m.store(v[17], 0L, 4);
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 44L) & 4294967295L;
        m.store(v[18], 0L, 4);
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 40L) & 4294967295L;
        m.store(v[19], 0L, 4);
        v[20] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 40L) & 4294967295L;
        return 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 40L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = v[22] == 0L ? 1L : 0L;
        v[24] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 40L) & 4294967295L;
        return v[23] != 0 ? 5 : 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi25 = (previous == 3 ? v[20] : v[24]);
        v[25] = phi25;
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 44L) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = v[27] == 0L ? 1L : 0L;
        return v[28] != 0 ? 6 : 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[29] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 48L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = v[30] == 0L ? 1L : 0L;
        return v[31] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[32] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 52L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = v[33] != 0L ? 1L : 0L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi35 = (previous == 6 ? v[25] : (previous == 5 ? v[25] : (previous == 4 ? v[24] : v[25])));
        long phi36 = (previous == 6 ? 1L : (previous == 5 ? 1L : (previous == 4 ? 1L : v[34])));
        v[35] = phi35;
        v[36] = phi36;
        v[37] = m.load(12688L, 1);
        v[38] = (Heap.s(v[37], 8)) & 4294967295L;
        F0297_putBit16.run(m, v[3], v[38], 8L);
        v[39] = m.load(v[2], 4);
        v[40] = m.load(12689L, 1);
        v[41] = (Heap.s(v[40], 8)) & 4294967295L;
        F0297_putBit16.run(m, v[39], v[41], 8L);
        v[42] = m.load(v[2], 4);
        v[43] = m.load(12690L, 1);
        v[44] = (Heap.s(v[43], 8)) & 4294967295L;
        F0297_putBit16.run(m, v[42], v[44], 8L);
        v[45] = m.load(v[2], 4);
        v[46] = m.load(12691L, 1);
        v[47] = (Heap.s(v[46], 8)) & 4294967295L;
        F0297_putBit16.run(m, v[45], v[47], 8L);
        v[48] = m.load(v[2], 4);
        v[49] = m.load(12692L, 1);
        v[50] = (Heap.s(v[49], 8)) & 4294967295L;
        F0297_putBit16.run(m, v[48], v[50], 8L);
        v[51] = m.load(v[2], 4);
        v[52] = m.load(12693L, 1);
        v[53] = (Heap.s(v[52], 8)) & 4294967295L;
        F0297_putBit16.run(m, v[51], v[53], 8L);
        v[54] = m.load(v[2], 4);
        v[55] = m.load(12694L, 1);
        v[56] = (Heap.s(v[55], 8)) & 4294967295L;
        F0297_putBit16.run(m, v[54], v[56], 8L);
        v[57] = m.load(v[2], 4);
        v[58] = m.load(12695L, 1);
        v[59] = (Heap.s(v[58], 8)) & 4294967295L;
        F0297_putBit16.run(m, v[57], v[59], 8L);
        v[60] = (v[36]) & 4294967295L;
        F0297_putBit16.run(m, v[3], 1L, 4L);
        v[61] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32840L) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = v[62] == 0L ? 1L : 0L;
        v[64] = v[63] != 0 ? 1L : 9L;
        F0297_putBit16.run(m, v[3], v[64], 4L);
        v[65] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = v[66] == 0L ? 1L : 0L;
        return v[67] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[68] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = v[69] != 0L ? 1L : 0L;
        v[71] = (v[70]) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi72 = (previous == 8 ? 1L : v[71]);
        v[72] = phi72;
        F0297_putBit16.run(m, v[3], v[72], 1L);
        v[73] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[74] = m.load(v[73], 4);
        F0297_putBit16.run(m, v[3], v[74], 1L);
        v[75] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 60L) & 4294967295L;
        v[76] = m.load(v[75], 4);
        F0297_putBit16.run(m, v[3], v[76], 3L);
        v[77] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 24L) & 4294967295L;
        v[78] = m.load(v[77], 4);
        F0297_putBit16.run(m, v[3], v[78], 1L);
        v[79] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 24L) & 4294967295L;
        v[80] = m.load(v[79], 4);
        F0297_putBit16.run(m, v[3], v[80], 2L);
        F0297_putBit16.run(m, v[3], v[12], 1L);
        F0297_putBit16.run(m, v[3], 1L, 1L);
        F0297_putBit16.run(m, v[3], v[60], 1L);
        v[81] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 28L) & 4294967295L;
        v[82] = m.load(v[81], 4);
        F0297_putBit16.run(m, v[3], v[82], 1L);
        F0297_putBit16.run(m, v[3], 0L, 1L);
        F0297_putBit16.run(m, v[3], 0L, 2L);
        v[83] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 16L) & 4294967295L;
        v[84] = m.load(v[83], 4);
        F0297_putBit16.run(m, v[3], v[84], 1L);
        v[85] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[86] = m.load(v[85], 4);
        F0297_putBit16.run(m, v[3], v[86], 4L);
        v[87] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 12L) & 4294967295L;
        v[88] = m.load(v[87], 4);
        v[89] = v[88] == 0L ? 1L : 0L;
        return v[89] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[90] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32836L) & 4294967295L;
        v[91] = m.load(v[90], 4);
        v[92] = v[91] == 0L ? 1L : 0L;
        return v[92] != 0 ? 12 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi93 = (previous == 12 ? v[88] : 15L);
        v[93] = phi93;
        F0297_putBit16.run(m, v[3], v[93], 4L);
        v[94] = m.load(v[1], 4);
        v[95] = ((v[94] + 4294967295L)) & 4294967295L;
        v[96] = v[12] == 0L ? 1L : 0L;
        v[97] = v[96] != 0 ? 32L : 16L;
        F0360_putBit32.run(m, v[3], v[95], v[97]);
        v[98] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 4L) & 4294967295L;
        v[99] = m.load(v[98], 4);
        v[100] = ((v[99] + 4294967295L)) & 4294967295L;
        F0360_putBit32.run(m, v[3], v[100], v[97]);
        v[101] = m.load(v[65], 4);
        v[102] = v[101] == 0L ? 1L : 0L;
        return v[102] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[103] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[104] = m.load(v[103], 4);
        v[105] = v[104] == 0L ? 1L : 0L;
        return v[105] != 0 ? 17 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        F0297_putBit16.run(m, v[3], v[101], 12L);
        v[106] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[107] = m.load(v[106], 4);
        F0297_putBit16.run(m, v[3], v[107], 12L);
        v[108] = m.load(v[65], 4);
        v[109] = v[108] == 0L ? 1L : 0L;
        return v[109] != 0 ? 17 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[110] = v[96] != 0 ? 16L : 8L;
        return 19;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[111] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[112] = m.load(v[111], 4);
        v[113] = v[112] == 0L ? 1L : 0L;
        return v[113] != 0 ? 21 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[114] = v[96] != 0 ? 16L : 8L;
        return 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi115 = (previous == 16 ? 0L : v[116]);
        v[115] = phi115;
        v[116] = ((v[115] + 1L)) & 4294967295L;
        v[117] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 60L + (Heap.s(v[116], 32) * 4L)) & 4294967295L;
        v[118] = m.load(v[117], 4);
        v[119] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 60L + (Heap.s(v[115], 32) * 4L)) & 4294967295L;
        v[120] = m.load(v[119], 4);
        v[121] = ((v[118] - v[120])) & 4294967295L;
        F0297_putBit16.run(m, v[3], v[121], v[110]);
        v[122] = m.load(v[65], 4);
        v[123] = v[116] < v[122] ? 1L : 0L;
        return v[123] != 0 ? 19 : 17;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi124 = (previous == 18 ? 0L : v[125]);
        v[124] = phi124;
        v[125] = ((v[124] + 1L)) & 4294967295L;
        v[126] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L + (Heap.s(v[125], 32) * 4L)) & 4294967295L;
        v[127] = m.load(v[126], 4);
        v[128] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L + (Heap.s(v[124], 32) * 4L)) & 4294967295L;
        v[129] = m.load(v[128], 4);
        v[130] = ((v[127] - v[129])) & 4294967295L;
        F0297_putBit16.run(m, v[3], v[130], v[114]);
        v[131] = m.load(v[111], 4);
        v[132] = v[125] < v[131] ? 1L : 0L;
        return v[132] != 0 ? 20 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        return v[36] != 0 ? 22 : 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[133] = m.load(v[35], 4);
        F0297_putBit16.run(m, v[3], v[133], 6L);
        v[134] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 44L) & 4294967295L;
        v[135] = m.load(v[134], 4);
        F0297_putBit16.run(m, v[3], v[135], 6L);
        v[136] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 48L) & 4294967295L;
        v[137] = m.load(v[136], 4);
        F0297_putBit16.run(m, v[3], v[137], 6L);
        v[138] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 52L) & 4294967295L;
        v[139] = m.load(v[138], 4);
        F0297_putBit16.run(m, v[3], v[139], 6L);
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        F0361_fillToByte.run(m, v[3]);
        v[140] = F0420_WriteImagePlaneHeader.run(m, v[0]);
        v[141] = 0L;
        return -1;
    }
}
