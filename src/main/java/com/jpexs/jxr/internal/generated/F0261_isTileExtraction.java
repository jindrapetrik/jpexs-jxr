package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: isTileExtraction.
 */
public final class F0261_isTileExtraction {

    private F0261_isTileExtraction() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[91];
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
                    default:
                        throw new IllegalStateException("Invalid block in isTileExtraction");
                }
                previous = old;
                if (pc < 0) {
                    return v[90];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[1] + (Heap.s(0L, 32) * 36L) + 32L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        switch ((int) v[3]) {
            case 0:
                return 1;
            case 1:
                return 3;
            default:
                return 23;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 24L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 2 : 23;
    }

    private static int b2(Heap m, long[] v, int previous) {
        m.store(v[2], 1L, 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 36L) + 28L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 4 : 23;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[10] = (v[1] + (Heap.s(0L, 32) * 36L) + 16L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = v[11] == v[13] ? 1L : 0L;
        return v[14] != 0 ? 5 : 23;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[15] = v[11] == 0L ? 1L : 0L;
        return v[15] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[16] = (v[1] + (Heap.s(0L, 32) * 36L) + 24L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = v[17] == v[19] ? 1L : 0L;
        return v[20] != 0 ? 7 : 23;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 60L) & 4294967295L;
        v[22] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = m.load(v[1], 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 44L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[28] + v[26])) & 4294967295L;
        v[30] = v[23] == 4294967295L ? 1L : 0L;
        return v[30] != 0 ? 10 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[31] = ((v[33] + 1L)) & 4294967295L;
        v[32] = v[33] == v[23] ? 1L : 0L;
        return v[32] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi33 = (previous == 8 ? v[31] : 0L);
        v[33] = phi33;
        v[34] = (v[21] + (Heap.s(v[33], 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = ((v[35] << 4L)) & 4294967295L;
        v[37] = v[36] == v[29] ? 1L : 0L;
        return v[37] != 0 ? 11 : 8;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[38] = ((v[29] + 15L)) & 4294967295L;
        v[39] = ((v[38] >>> 4L)) & 4294967295L;
        v[40] = v[39] < v[25] ? 1L : 0L;
        return v[40] != 0 ? 23 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[41] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L) & 4294967295L;
        v[42] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = (v[1] + (Heap.s(0L, 32) * 36L) + 8L) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 40L) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = ((v[49] + v[47])) & 4294967295L;
        v[51] = v[43] == 4294967295L ? 1L : 0L;
        return v[51] != 0 ? 14 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[52] = ((v[54] + 1L)) & 4294967295L;
        v[53] = v[54] == v[43] ? 1L : 0L;
        return v[53] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi54 = (previous == 12 ? v[52] : 0L);
        v[54] = phi54;
        v[55] = (v[41] + (Heap.s(v[54], 32) * 4L)) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = ((v[56] << 4L)) & 4294967295L;
        v[58] = v[57] == v[50] ? 1L : 0L;
        return v[58] != 0 ? 15 : 12;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[59] = ((v[50] + 15L)) & 4294967295L;
        v[60] = ((v[59] >>> 4L)) & 4294967295L;
        v[61] = v[60] < v[45] ? 1L : 0L;
        return v[61] != 0 ? 23 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[62] = (v[1] + (Heap.s(0L, 32) * 36L) + 4L) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = ((v[29] + v[63])) & 4294967295L;
        return v[30] != 0 ? 18 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[65] = ((v[67] + 1L)) & 4294967295L;
        v[66] = v[67] == v[23] ? 1L : 0L;
        return v[66] != 0 ? 18 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi67 = (previous == 16 ? v[65] : 0L);
        v[67] = phi67;
        v[68] = (v[21] + (Heap.s(v[67], 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = ((v[69] << 4L)) & 4294967295L;
        v[71] = v[70] == v[64] ? 1L : 0L;
        return v[71] != 0 ? 19 : 16;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[72] = ((v[64] + 15L)) & 4294967295L;
        v[73] = ((v[72] >>> 4L)) & 4294967295L;
        v[74] = v[73] < v[25] ? 1L : 0L;
        return v[74] != 0 ? 23 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[75] = (v[1] + (Heap.s(0L, 32) * 36L) + 12L) & 4294967295L;
        v[76] = m.load(v[75], 4);
        v[77] = ((v[50] + v[76])) & 4294967295L;
        return v[51] != 0 ? 22 : 21;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[78] = ((v[80] + 1L)) & 4294967295L;
        v[79] = v[80] == v[43] ? 1L : 0L;
        return v[79] != 0 ? 22 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi80 = (previous == 20 ? v[78] : 0L);
        v[80] = phi80;
        v[81] = (v[41] + (Heap.s(v[80], 32) * 4L)) & 4294967295L;
        v[82] = m.load(v[81], 4);
        v[83] = ((v[82] << 4L)) & 4294967295L;
        v[84] = v[83] == v[77] ? 1L : 0L;
        return v[84] != 0 ? 23 : 20;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[85] = ((v[77] + 15L)) & 4294967295L;
        v[86] = ((v[85] >>> 4L)) & 4294967295L;
        v[87] = v[86] >= v[45] ? 1L : 0L;
        v[88] = (v[87]) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi89 = (previous == 6 ? 0L : (previous == 18 ? 0L : (previous == 14 ? 0L : (previous == 10 ? 0L : (previous == 4 ? 0L : (previous == 3 ? 0L : (previous == 22 ? v[88] : (previous == 1 ? 0L : (previous == 0 ? 0L : 1L)))))))));
        v[89] = phi89;
        v[90] = v[89];
        return -1;
    }
}
