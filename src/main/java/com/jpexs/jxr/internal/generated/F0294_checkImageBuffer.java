package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: checkImageBuffer.
 */
public final class F0294_checkImageBuffer {

    private F0294_checkImageBuffer() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[48];
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
                    default:
                        throw new IllegalStateException("Invalid block in checkImageBuffer");
                }
                previous = old;
                if (pc < 0) {
                    return v[47];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32848L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 12L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = v[7] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi9 = (previous == 1 ? v[8] : 0L);
        v[9] = phi9;
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[12] = v[5] != 0 ? v[11] : v[10];
        v[13] = m.load(v[12], 4);
        v[14] = v[13] == 1L ? 1L : 0L;
        v[15] = ((v[2] + 1L)) & 4294967295L;
        v[16] = ((v[15] >>> 1L)) & 4294967295L;
        v[17] = v[14] != 0 ? v[16] : v[2];
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 4L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = v[17] > v[19] ? 1L : 0L;
        return v[20] != 0 ? 10 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[21] = ((v[13] + 4294967295L)) & 4294967295L;
        v[22] = v[21] < 2L ? 1L : 0L;
        v[23] = ((v[1] + 1L)) & 4294967295L;
        v[24] = ((v[23] >>> 1L)) & 4294967295L;
        v[25] = v[22] != 0 ? v[24] : v[1];
        v[26] = v[25] < 134217728L ? 1L : 0L;
        return v[26] != 0 ? 4 : 10;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[5] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[27] = ((v[25] << 2L)) & 4294967295L;
        v[28] = v[14] != 0 ? 6L : 4L;
        v[29] = v[13] == 3L ? 1L : 0L;
        v[30] = v[29] != 0 ? 3L : 1L;
        v[31] = v[22] != 0 ? v[28] : v[30];
        v[32] = ((v[27] * v[31])) & 4294967295L;
        return 9;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[33] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 16L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        return v[9] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[35] = ((v[34] * v[25])) & 4294967295L;
        v[36] = ((v[35] + 7L)) & 4294967295L;
        v[37] = ((v[36] >>> 3L)) & 4294967295L;
        return 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[38] = ((v[34] + 7L)) & 4294967295L;
        v[39] = ((v[38] >>> 3L)) & 4294967295L;
        v[40] = ((v[39] * v[25])) & 4294967295L;
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi41 = (previous == 5 ? v[32] : (previous == 7 ? v[37] : v[40]));
        v[41] = phi41;
        v[42] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 8L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = v[41] > v[43] ? 1L : 0L;
        v[45] = (Heap.s(v[44], 1)) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi46 = (previous == 9 ? v[45] : (previous == 2 ? 4294967295L : 4294967295L));
        v[46] = phi46;
        v[47] = v[46];
        return -1;
    }
}
