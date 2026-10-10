package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB64Half_RGB96Float.
 */
public final class F0177_RGB64Half_RGB96Float {

    private F0177_RGB64Half_RGB96Float() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[77];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB64Half_RGB96Float");
                }
                previous = old;
                if (pc < 0) {
                    return v[76];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 1 : 14;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = Heap.s(v[11], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[10] != 0 ? 3 : 14;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi11 = (previous == 1 ? v[5] : v[12]);
        v[11] = phi11;
        v[12] = ((v[11] + 4294967295L)) & 4294967295L;
        v[13] = ((v[12] * v[3])) & 4294967295L;
        v[14] = (v[2] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 4 : 2;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi15 = (previous == 13 ? v[16] : v[7]);
        v[15] = phi15;
        v[16] = ((v[15] + 4294967295L)) & 4294967295L;
        v[17] = ((v[16] << 2L)) & 4294967295L;
        v[18] = (v[14] + (Heap.s(v[17], 32) * 2L)) & 4294967295L;
        v[19] = m.load(v[18], 2);
        v[20] = (v[19]) & 4294967295L;
        v[21] = ((v[20] >>> 10L)) & 4294967295L;
        v[22] = ((v[21] & 31L)) & 4294967295L;
        v[23] = (Heap.s(v[19], 16)) & 4294967295L;
        v[24] = ((v[23] & 2147483648L)) & 4294967295L;
        switch ((int) v[22]) {
            case 0:
                return 7;
            case 31:
                return 5;
            default:
                return 6;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = ((v[20] << 13L)) & 4294967295L;
        v[26] = ((v[24] | v[25])) & 4294967295L;
        v[27] = ((v[26] | 2139095040L)) & 4294967295L;
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[28] = ((v[22] << 23L)) & 4294967295L;
        v[29] = ((v[28] + 939524096L)) & 4294967295L;
        v[30] = ((v[20] << 13L)) & 4294967295L;
        v[31] = ((v[30] & 8380416L)) & 4294967295L;
        v[32] = ((v[29] | v[31])) & 4294967295L;
        v[33] = ((v[32] | v[24])) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi34 = (previous == 5 ? v[27] : (previous == 6 ? v[33] : v[24]));
        v[34] = phi34;
        v[35] = ((v[16] * 3L)) & 4294967295L;
        v[36] = (v[14] + (Heap.s(v[35], 32) * 4L)) & 4294967295L;
        m.store(v[36], v[34], 4);
        v[37] = ((v[17] | 1L)) & 4294967295L;
        v[38] = (v[14] + (Heap.s(v[37], 32) * 2L)) & 4294967295L;
        v[39] = m.load(v[38], 2);
        v[40] = (v[39]) & 4294967295L;
        v[41] = ((v[40] >>> 10L)) & 4294967295L;
        v[42] = ((v[41] & 31L)) & 4294967295L;
        v[43] = (Heap.s(v[39], 16)) & 4294967295L;
        v[44] = ((v[43] & 2147483648L)) & 4294967295L;
        switch ((int) v[42]) {
            case 0:
                return 10;
            case 31:
                return 8;
            default:
                return 9;
        }
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[45] = ((v[40] << 13L)) & 4294967295L;
        v[46] = ((v[44] | v[45])) & 4294967295L;
        v[47] = ((v[46] | 2139095040L)) & 4294967295L;
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[48] = ((v[42] << 23L)) & 4294967295L;
        v[49] = ((v[48] + 939524096L)) & 4294967295L;
        v[50] = ((v[40] << 13L)) & 4294967295L;
        v[51] = ((v[50] & 8380416L)) & 4294967295L;
        v[52] = ((v[49] | v[51])) & 4294967295L;
        v[53] = ((v[52] | v[44])) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi54 = (previous == 8 ? v[47] : (previous == 9 ? v[53] : v[44]));
        v[54] = phi54;
        v[55] = (v[36] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[55], v[54], 4);
        v[56] = ((v[17] | 2L)) & 4294967295L;
        v[57] = (v[14] + (Heap.s(v[56], 32) * 2L)) & 4294967295L;
        v[58] = m.load(v[57], 2);
        v[59] = (v[58]) & 4294967295L;
        v[60] = ((v[59] >>> 10L)) & 4294967295L;
        v[61] = ((v[60] & 31L)) & 4294967295L;
        v[62] = (Heap.s(v[58], 16)) & 4294967295L;
        v[63] = ((v[62] & 2147483648L)) & 4294967295L;
        switch ((int) v[61]) {
            case 0:
                return 13;
            case 31:
                return 11;
            default:
                return 12;
        }
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[64] = ((v[59] << 13L)) & 4294967295L;
        v[65] = ((v[63] | v[64])) & 4294967295L;
        v[66] = ((v[65] | 2139095040L)) & 4294967295L;
        return 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[67] = ((v[61] << 23L)) & 4294967295L;
        v[68] = ((v[67] + 939524096L)) & 4294967295L;
        v[69] = ((v[59] << 13L)) & 4294967295L;
        v[70] = ((v[69] & 8380416L)) & 4294967295L;
        v[71] = ((v[68] | v[70])) & 4294967295L;
        v[72] = ((v[71] | v[63])) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi73 = (previous == 11 ? v[66] : (previous == 12 ? v[72] : v[63]));
        v[73] = phi73;
        v[74] = (v[36] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[74], v[73], 4);
        v[75] = v[15] > 1L ? 1L : 0L;
        return v[75] != 0 ? 4 : 2;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[76] = 0L;
        return -1;
    }
}
