package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: BGRA32_RGBA32.
 */
public final class F0190_BGRA32_RGBA32 {

    private F0190_BGRA32_RGBA32() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[25];
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
                        throw new IllegalStateException("Invalid block in BGRA32_RGBA32");
                }
                previous = old;
                if (pc < 0) {
                    return v[24];
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
        v[8] = ((v[7] << 2L)) & 4294967295L;
        v[9] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 1 : 5;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi11 = (previous == 1 ? 0L : v[22]);
        v[11] = phi11;
        v[12] = ((v[11] * v[3])) & 4294967295L;
        v[13] = (v[2] + (Heap.s(v[12], 32) * 1L)) & 4294967295L;
        return v[10] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi14 = (previous == 3 ? v[20] : 0L);
        v[14] = phi14;
        v[15] = (v[13] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        v[16] = m.load(v[15], 1);
        v[17] = ((v[14] | 2L)) & 4294967295L;
        v[18] = (v[13] + (Heap.s(v[17], 32) * 1L)) & 4294967295L;
        v[19] = m.load(v[18], 1);
        m.store(v[15], v[19], 1);
        m.store(v[18], v[16], 1);
        v[20] = ((v[14] + 4L)) & 4294967295L;
        v[21] = Heap.s(v[20], 32) < Heap.s(v[8], 32) ? 1L : 0L;
        return v[21] != 0 ? 3 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[22] = ((v[11] + 1L)) & 4294967295L;
        v[23] = v[22] == v[5] ? 1L : 0L;
        return v[23] != 0 ? 5 : 2;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[24] = 0L;
        return -1;
    }
}
