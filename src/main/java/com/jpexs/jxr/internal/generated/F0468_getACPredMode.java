package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getACPredMode.
 */
public final class F0468_getACPredMode {

    private F0468_getACPredMode() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[81];
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
                    default:
                        throw new IllegalStateException("Invalid block in getACPredMode");
                }
                previous = old;
                if (pc < 0) {
                    return v[80];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = LibC.call(m, "abs", new long[]{v[3]});
        v[5] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = LibC.call(m, "abs", new long[]{v[6]});
        v[8] = ((v[7] + v[4])) & 4294967295L;
        v[9] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = LibC.call(m, "abs", new long[]{v[10]});
        v[12] = ((v[8] + v[11])) & 4294967295L;
        v[13] = (v[0] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = LibC.call(m, "abs", new long[]{v[14]});
        v[16] = (v[0] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = LibC.call(m, "abs", new long[]{v[17]});
        v[19] = ((v[18] + v[15])) & 4294967295L;
        v[20] = (v[0] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = LibC.call(m, "abs", new long[]{v[21]});
        v[23] = ((v[19] + v[22])) & 4294967295L;
        switch ((int) v[1]) {
            case 6:
                return 6;
            case 0:
                return 6;
            default:
                return 1;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[24] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = LibC.call(m, "abs", new long[]{v[25]});
        v[27] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = LibC.call(m, "abs", new long[]{v[28]});
        v[30] = ((v[26] + v[12])) & 4294967295L;
        v[31] = ((v[30] + v[29])) & 4294967295L;
        switch ((int) v[1]) {
            case 1:
                return 2;
            case 2:
                return 3;
            default:
                return 4;
        }
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[32] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = LibC.call(m, "abs", new long[]{v[33]});
        v[35] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = LibC.call(m, "abs", new long[]{v[36]});
        v[38] = ((v[37] + v[34])) & 4294967295L;
        return 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[39] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = LibC.call(m, "abs", new long[]{v[40]});
        v[42] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = LibC.call(m, "abs", new long[]{v[43]});
        v[45] = ((v[44] + v[41])) & 4294967295L;
        v[46] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = LibC.call(m, "abs", new long[]{v[47]});
        v[49] = ((v[45] + v[48])) & 4294967295L;
        v[50] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = LibC.call(m, "abs", new long[]{v[51]});
        v[53] = ((v[49] + v[52])) & 4294967295L;
        v[54] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = LibC.call(m, "abs", new long[]{v[55]});
        v[57] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[58] = m.load(v[57], 4);
        v[59] = LibC.call(m, "abs", new long[]{v[58]});
        v[60] = ((v[56] + v[31])) & 4294967295L;
        v[61] = ((v[60] + v[59])) & 4294967295L;
        return 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[62] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = LibC.call(m, "abs", new long[]{v[63]});
        v[65] = (v[0] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = LibC.call(m, "abs", new long[]{v[66]});
        v[68] = ((v[67] + v[64])) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi69 = (previous == 2 ? v[38] : (previous == 3 ? v[53] : v[68]));
        long phi70 = (previous == 2 ? v[31] : (previous == 3 ? v[61] : v[31]));
        v[69] = phi69;
        v[70] = phi70;
        v[71] = ((v[69] + v[23])) & 4294967295L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi72 = (previous == 5 ? v[71] : (previous == 0 ? v[23] : v[23]));
        long phi73 = (previous == 5 ? v[70] : (previous == 0 ? v[12] : v[12]));
        v[72] = phi72;
        v[73] = phi73;
        v[74] = ((v[73] << 2L)) & 4294967295L;
        v[75] = Heap.s(v[74], 32) < Heap.s(v[72], 32) ? 1L : 0L;
        v[76] = ((v[72] << 2L)) & 4294967295L;
        v[77] = Heap.s(v[76], 32) < Heap.s(v[73], 32) ? 1L : 0L;
        v[78] = v[77] != 0 ? 0L : 2L;
        v[79] = v[75] != 0 ? 1L : v[78];
        v[80] = v[79];
        return -1;
    }
}
