package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: AdaptDiscriminant.
 */
public final class F0005_AdaptDiscriminant {

    private F0005_AdaptDiscriminant() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[91];
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
                        throw new IllegalStateException("Invalid block in AdaptDiscriminant");
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
        v[1] = m.load(v[0], 4);
        v[2] = (v[0] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        m.store(v[2], 1L, 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        m.store(v[7], 0L, 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        m.store(v[8], 0L, 4);
        v[9] = (80L + (Heap.s(0L, 32) * 52L) + (Heap.s(v[1], 32) * 4L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = (v[0] + (Heap.s(0L, 32) * 44L) + 16L) & 4294967295L;
        m.store(v[11], v[10], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi12 = (previous == 1 ? v[6] : 0L);
        v[12] = phi12;
        v[13] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        switch ((int) v[1]) {
            case 12:
                return 4;
            case 6:
                return 4;
            default:
                return 5;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[14] = (v[0] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi16 = (previous == 4 ? v[15] : v[12]);
        v[16] = phi16;
        v[17] = (v[0] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = Heap.s(v[12], 32) < Heap.s(v[18], 32) ? 1L : 0L;
        return v[19] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[20] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = Heap.s(v[16], 32) > Heap.s(v[21], 32) ? 1L : 0L;
        return v[22] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi23 = (previous == 5 ? 4294967295L : 1L);
        v[23] = phi23;
        v[24] = (v[0] + (Heap.s(0L, 32) * 44L) + 16L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = ((v[25] + v[23])) & 4294967295L;
        m.store(v[24], v[26], 4);
        m.store(v[13], 0L, 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        m.store(v[27], 0L, 4);
        return 12;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[28] = Heap.s(v[12], 32) < Heap.s(4294967232L, 32) ? 1L : 0L;
        return v[28] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        m.store(v[13], 4294967232L, 4);
        return 12;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[29] = Heap.s(v[12], 32) > Heap.s(64L, 32) ? 1L : 0L;
        return v[29] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        m.store(v[13], 64L, 4);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[30] = (v[0] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = Heap.s(v[31], 32) < Heap.s(4294967232L, 32) ? 1L : 0L;
        return v[32] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[33] = Heap.s(v[31], 32) > Heap.s(64L, 32) ? 1L : 0L;
        return v[33] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi34 = (previous == 12 ? 4294967232L : 64L);
        v[34] = phi34;
        m.store(v[30], v[34], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[35] = (v[0] + (Heap.s(0L, 32) * 44L) + 16L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = v[36] == 0L ? 1L : 0L;
        v[38] = v[37] != 0 ? 2147483648L : 4294967288L;
        m.store(v[17], v[38], 4);
        v[39] = (16L + (Heap.s(0L, 32) * 52L) + (Heap.s(v[1], 32) * 4L)) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = ((v[40] + 4294967295L)) & 4294967295L;
        v[42] = v[36] == v[41] ? 1L : 0L;
        v[43] = v[42] != 0 ? 1073741824L : 8L;
        v[44] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        m.store(v[44], v[43], 4);
        switch ((int) v[1]) {
            case 4:
                return 22;
            case 5:
                return 16;
            case 6:
                return 17;
            case 7:
                return 18;
            case 8:
                return 19;
            case 9:
                return 20;
            case 12:
                return 21;
            default:
                return 23;
        }
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[45] = ((v[36] * 11L)) & 4294967295L;
        v[46] = (192L + (Heap.s(v[45], 32) * 4L)) & 4294967295L;
        v[47] = (1904L + (Heap.s(0L, 32) * 168L) + (Heap.s(v[36], 32) * 84L)) & 4294967295L;
        return 22;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[48] = ((v[36] * 13L)) & 4294967295L;
        v[49] = (320L + (Heap.s(v[48], 32) * 4L)) & 4294967295L;
        v[50] = ((v[36] + 1L)) & 4294967295L;
        v[51] = v[50] == v[40] ? 1L : 0L;
        v[52] = (Heap.s(v[51], 1)) & 4294967295L;
        v[53] = ((v[36] + v[52])) & 4294967295L;
        v[54] = ((v[53] * 6L)) & 4294967295L;
        v[55] = (528L + (Heap.s(v[54], 32) * 4L)) & 4294967295L;
        v[56] = (v[0] + (Heap.s(0L, 32) * 44L) + 12L) & 4294967295L;
        m.store(v[56], v[55], 4);
        v[57] = ((v[36] + 4294967295L)) & 4294967295L;
        v[58] = (v[37]) & 4294967295L;
        v[59] = ((v[57] + v[58])) & 4294967295L;
        v[60] = ((v[59] * 6L)) & 4294967295L;
        v[61] = (528L + (Heap.s(v[60], 32) * 4L)) & 4294967295L;
        v[62] = (2080L + (Heap.s(0L, 32) * 352L) + (Heap.s(v[36], 32) * 88L)) & 4294967295L;
        return 22;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[63] = ((v[36] * 15L)) & 4294967295L;
        v[64] = (608L + (Heap.s(v[63], 32) * 4L)) & 4294967295L;
        v[65] = (2432L + (Heap.s(0L, 32) * 184L) + (Heap.s(v[36], 32) * 92L)) & 4294967295L;
        return 22;
    }

    private static int b19(Heap m, long[] v, int previous) {
        return 22;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[66] = ((v[36] * 19L)) & 4294967295L;
        v[67] = (912L + (Heap.s(v[66], 32) * 4L)) & 4294967295L;
        v[68] = (2816L + (Heap.s(0L, 32) * 200L) + (Heap.s(v[36], 32) * 100L)) & 4294967295L;
        return 22;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[69] = ((v[36] * 25L)) & 4294967295L;
        v[70] = (1120L + (Heap.s(v[69], 32) * 4L)) & 4294967295L;
        v[71] = ((v[36] + 1L)) & 4294967295L;
        v[72] = v[71] == v[40] ? 1L : 0L;
        v[73] = (Heap.s(v[72], 1)) & 4294967295L;
        v[74] = ((v[36] + v[73])) & 4294967295L;
        v[75] = ((v[74] * 12L)) & 4294967295L;
        v[76] = (1632L + (Heap.s(v[75], 32) * 4L)) & 4294967295L;
        v[77] = (v[0] + (Heap.s(0L, 32) * 44L) + 12L) & 4294967295L;
        m.store(v[77], v[76], 4);
        v[78] = ((v[36] + 4294967295L)) & 4294967295L;
        v[79] = (v[37]) & 4294967295L;
        v[80] = ((v[78] + v[79])) & 4294967295L;
        v[81] = ((v[80] * 12L)) & 4294967295L;
        v[82] = (1632L + (Heap.s(v[81], 32) * 4L)) & 4294967295L;
        v[83] = (3024L + (Heap.s(0L, 32) * 560L) + (Heap.s(v[36], 32) * 112L)) & 4294967295L;
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi84 = (previous == 21 ? v[83] : (previous == 20 ? v[68] : (previous == 19 ? 2624L : (previous == 18 ? v[65] : (previous == 17 ? v[62] : (previous == 16 ? v[47] : 1824L))))));
        long phi85 = (previous == 21 ? v[70] : (previous == 20 ? v[67] : (previous == 19 ? 768L : (previous == 18 ? v[64] : (previous == 17 ? v[49] : (previous == 16 ? v[46] : 144L))))));
        long phi86 = (previous == 21 ? v[82] : (previous == 20 ? 1072L : (previous == 19 ? 0L : (previous == 18 ? 736L : (previous == 17 ? v[61] : (previous == 16 ? 288L : 0L))))));
        v[84] = phi84;
        v[85] = phi85;
        v[86] = phi86;
        v[87] = (v[0] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        m.store(v[87], v[84], 4);
        v[88] = (v[0] + (Heap.s(0L, 32) * 44L) + 4L) & 4294967295L;
        m.store(v[88], v[85], 4);
        v[89] = (v[0] + (Heap.s(0L, 32) * 44L) + 8L) & 4294967295L;
        m.store(v[89], v[86], 4);
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        return -1;
    }
}
