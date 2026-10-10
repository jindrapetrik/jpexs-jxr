package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB128Fixed_RGB96Float.
 */
public final class F0151_RGB128Fixed_RGB96Float {

    private F0151_RGB128Fixed_RGB96Float() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[38];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB128Fixed_RGB96Float");
                }
                previous = old;
                if (pc < 0) {
                    return v[37];
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
        return v[8] != 0 ? 1 : 5;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[35]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 3 ? v[33] : 0L);
        v[13] = phi13;
        v[14] = ((v[13] << 2L)) & 4294967295L;
        v[15] = (v[12] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = Heap.fb(Heap.s(v[16], 32));
        v[18] = Heap.fb((Heap.f(v[17]) * Heap.f(864026624L)));
        v[19] = ((v[13] * 3L)) & 4294967295L;
        v[20] = (v[12] + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        m.store(v[20], v[18], 4);
        v[21] = ((v[14] | 1L)) & 4294967295L;
        v[22] = (v[12] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = Heap.fb(Heap.s(v[23], 32));
        v[25] = Heap.fb((Heap.f(v[24]) * Heap.f(864026624L)));
        v[26] = (v[20] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[26], v[25], 4);
        v[27] = ((v[14] | 2L)) & 4294967295L;
        v[28] = (v[12] + (Heap.s(v[27], 32) * 4L)) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = Heap.fb(Heap.s(v[29], 32));
        v[31] = Heap.fb((Heap.f(v[30]) * Heap.f(864026624L)));
        v[32] = (v[20] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[32], v[31], 4);
        v[33] = ((v[13] + 1L)) & 4294967295L;
        v[34] = v[33] == v[7] ? 1L : 0L;
        return v[34] != 0 ? 4 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[35] = ((v[10] + 1L)) & 4294967295L;
        v[36] = v[35] == v[5] ? 1L : 0L;
        return v[36] != 0 ? 5 : 2;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[37] = 0L;
        return -1;
    }
}
