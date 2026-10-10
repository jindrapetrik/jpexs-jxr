package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB96Float_RGB128Float.
 */
public final class F0154_RGB96Float_RGB128Float {

    private F0154_RGB96Float_RGB128Float() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[34];
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
                        throw new IllegalStateException("Invalid block in RGB96Float_RGB128Float");
                }
                previous = old;
                if (pc < 0) {
                    return v[33];
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
        v[17] = ((v[16] * 3L)) & 4294967295L;
        v[18] = (v[14] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = ((v[16] << 2L)) & 4294967295L;
        v[21] = (v[14] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        m.store(v[21], v[19], 4);
        v[22] = (v[18] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = ((v[20] | 1L)) & 4294967295L;
        v[25] = (v[14] + (Heap.s(v[24], 32) * 4L)) & 4294967295L;
        m.store(v[25], v[23], 4);
        v[26] = (v[18] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = ((v[20] | 2L)) & 4294967295L;
        v[29] = (v[14] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        m.store(v[29], v[27], 4);
        v[30] = ((v[20] | 3L)) & 4294967295L;
        v[31] = (v[14] + (Heap.s(v[30], 32) * 4L)) & 4294967295L;
        m.store(v[31], 0L, 4);
        v[32] = v[15] > 1L ? 1L : 0L;
        return v[32] != 0 ? 4 : 2;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[33] = 0L;
        return -1;
    }
}
