package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB24_Gray8.
 */
public final class F0143_RGB24_Gray8 {

    private F0143_RGB24_Gray8() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[43];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB24_Gray8");
                }
                previous = old;
                if (pc < 0) {
                    return v[42];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[6] != 0 ? 1 : 6;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi9 = (previous == 1 ? v[5] : v[37]);
        long phi10 = (previous == 1 ? v[8] : v[38]);
        long phi11 = (previous == 1 ? v[2] : v[39]);
        long phi12 = (previous == 1 ? 0L : v[40]);
        v[9] = phi9;
        v[10] = phi10;
        v[11] = phi11;
        v[12] = phi12;
        v[13] = Heap.s(v[10], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[13] != 0 ? 3 : 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi14 = (previous == 3 ? v[31] : 0L);
        long phi15 = (previous == 3 ? v[32] : 0L);
        v[14] = phi14;
        v[15] = phi15;
        v[16] = (v[11] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        v[17] = m.load(v[16], 1);
        v[18] = ((v[14] + 1L)) & 4294967295L;
        v[19] = (v[11] + (Heap.s(v[18], 32) * 1L)) & 4294967295L;
        v[20] = m.load(v[19], 1);
        v[21] = ((v[14] + 2L)) & 4294967295L;
        v[22] = (v[11] + (Heap.s(v[21], 32) * 1L)) & 4294967295L;
        v[23] = m.load(v[22], 1);
        v[24] = ((v[17] >>> 2L)) & 255L;
        v[25] = ((v[20] >>> 1L)) & 255L;
        v[26] = ((v[23] >>> 3L)) & 255L;
        v[27] = ((v[24] + 16L)) & 255L;
        v[28] = ((v[27] + v[25])) & 255L;
        v[29] = ((v[28] + v[26])) & 255L;
        v[30] = (v[11] + (Heap.s(v[15], 32) * 1L)) & 4294967295L;
        m.store(v[30], v[29], 1);
        v[31] = ((v[14] + 3L)) & 4294967295L;
        v[32] = ((v[15] + 1L)) & 4294967295L;
        v[33] = m.load(v[7], 4);
        v[34] = ((v[33] * 3L)) & 4294967295L;
        v[35] = Heap.s(v[31], 32) < Heap.s(v[34], 32) ? 1L : 0L;
        return v[35] != 0 ? 3 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[36] = m.load(v[4], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi37 = (previous == 4 ? v[36] : v[9]);
        long phi38 = (previous == 4 ? v[33] : v[10]);
        v[37] = phi37;
        v[38] = phi38;
        v[39] = (v[11] + (Heap.s(v[3], 32) * 1L)) & 4294967295L;
        v[40] = ((v[12] + 1L)) & 4294967295L;
        v[41] = Heap.s(v[40], 32) < Heap.s(v[37], 32) ? 1L : 0L;
        return v[41] != 0 ? 2 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[42] = 0L;
        return -1;
    }
}
