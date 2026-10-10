package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transformDCBlock420.
 */
public final class F0254_transformDCBlock420 {

    private F0254_transformDCBlock420() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[35];
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
                    default:
                        throw new IllegalStateException("Invalid block in transformDCBlock420");
                }
                previous = old;
                if (pc < 0) {
                    return v[34];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((197L >>> v[2])) & 4294967295L;
        v[4] = ((v[3] & 1L)) & 4294967295L;
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = ((0L - v[7])) & 4294967295L;
        m.store(v[6], v[8], 4);
        v[9] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((0L - v[10])) & 4294967295L;
        m.store(v[9], v[11], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = ((83L >>> v[2])) & 4294967295L;
        v[13] = ((v[12] & 1L)) & 4294967295L;
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[15] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((0L - v[16])) & 4294967295L;
        m.store(v[15], v[17], 4);
        v[18] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = ((0L - v[19])) & 4294967295L;
        m.store(v[18], v[20], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = m.load(v[0], 4);
        m.store(v[1], v[21], 4);
        v[22] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[24], v[23], 4);
        v[25] = v[2] < 4L ? 1L : 0L;
        v[26] = (v[1] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[27] = v[25] != 0 ? 1L : 2L;
        v[28] = v[25] != 0 ? 2L : 1L;
        v[29] = (v[0] + (Heap.s(v[27], 32) * 4L)) & 4294967295L;
        v[30] = m.load(v[29], 4);
        m.store(v[26], v[30], 4);
        v[31] = (v[0] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[33], v[32], 4);
        return -1;
    }
}
