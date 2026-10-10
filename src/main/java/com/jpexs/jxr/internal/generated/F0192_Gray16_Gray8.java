package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray16_Gray8.
 */
public final class F0192_Gray16_Gray8 {

    private F0192_Gray16_Gray8() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[30];
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
                        throw new IllegalStateException("Invalid block in Gray16_Gray8");
                }
                previous = old;
                if (pc < 0) {
                    return v[29];
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
        long phi9 = (previous == 1 ? v[5] : v[24]);
        long phi10 = (previous == 1 ? v[8] : v[25]);
        long phi11 = (previous == 1 ? v[2] : v[26]);
        long phi12 = (previous == 1 ? 0L : v[27]);
        v[9] = phi9;
        v[10] = phi10;
        v[11] = phi11;
        v[12] = phi12;
        v[13] = Heap.s(v[10], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[13] != 0 ? 3 : 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi14 = (previous == 3 ? v[20] : 0L);
        v[14] = phi14;
        v[15] = (v[11] + (Heap.s(v[14], 32) * 2L)) & 4294967295L;
        v[16] = m.load(v[15], 2);
        v[17] = ((v[16] >>> 8L)) & 65535L;
        v[18] = (v[17]) & 255L;
        v[19] = (v[11] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        m.store(v[19], v[18], 1);
        v[20] = ((v[14] + 1L)) & 4294967295L;
        v[21] = m.load(v[7], 4);
        v[22] = Heap.s(v[20], 32) < Heap.s(v[21], 32) ? 1L : 0L;
        return v[22] != 0 ? 3 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = m.load(v[4], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi24 = (previous == 4 ? v[23] : v[9]);
        long phi25 = (previous == 4 ? v[21] : v[10]);
        v[24] = phi24;
        v[25] = phi25;
        v[26] = (v[11] + (Heap.s(v[3], 32) * 1L)) & 4294967295L;
        v[27] = ((v[12] + 1L)) & 4294967295L;
        v[28] = Heap.s(v[27], 32) < Heap.s(v[24], 32) ? 1L : 0L;
        return v[28] != 0 ? 2 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[29] = 0L;
        return -1;
    }
}
