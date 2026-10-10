package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB64Fixed_RGB96Float.
 */
public final class F0166_RGB64Fixed_RGB96Float {

    private F0166_RGB64Fixed_RGB96Float() {
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
                        throw new IllegalStateException("Invalid block in RGB64Fixed_RGB96Float");
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
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = Heap.s(v[11], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[10] != 0 ? 3 : 5;
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
        long phi15 = (previous == 4 ? v[16] : v[7]);
        v[15] = phi15;
        v[16] = ((v[15] + 4294967295L)) & 4294967295L;
        v[17] = ((v[16] << 2L)) & 4294967295L;
        v[18] = (v[14] + (Heap.s(v[17], 32) * 2L)) & 4294967295L;
        v[19] = m.load(v[18], 2);
        v[20] = Heap.fb(Heap.s(v[19], 16));
        v[21] = Heap.fb((Heap.f(v[20]) * Heap.f(956301312L)));
        v[22] = ((v[16] * 3L)) & 4294967295L;
        v[23] = (v[14] + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        m.store(v[23], v[21], 4);
        v[24] = ((v[17] | 1L)) & 4294967295L;
        v[25] = (v[14] + (Heap.s(v[24], 32) * 2L)) & 4294967295L;
        v[26] = m.load(v[25], 2);
        v[27] = Heap.fb(Heap.s(v[26], 16));
        v[28] = Heap.fb((Heap.f(v[27]) * Heap.f(956301312L)));
        v[29] = (v[23] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[29], v[28], 4);
        v[30] = ((v[17] | 2L)) & 4294967295L;
        v[31] = (v[14] + (Heap.s(v[30], 32) * 2L)) & 4294967295L;
        v[32] = m.load(v[31], 2);
        v[33] = Heap.fb(Heap.s(v[32], 16));
        v[34] = Heap.fb((Heap.f(v[33]) * Heap.f(956301312L)));
        v[35] = (v[23] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[35], v[34], 4);
        v[36] = v[15] > 1L ? 1L : 0L;
        return v[36] != 0 ? 4 : 2;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[37] = 0L;
        return -1;
    }
}
