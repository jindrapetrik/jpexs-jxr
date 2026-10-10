package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transformDCBlock422.
 */
public final class F0253_transformDCBlock422 {

    private F0253_transformDCBlock422() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[60];
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
                    default:
                        throw new IllegalStateException("Invalid block in transformDCBlock422");
                }
                previous = old;
                if (pc < 0) {
                    return v[59];
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
        v[12] = (v[0] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((0L - v[13])) & 4294967295L;
        m.store(v[12], v[14], 4);
        v[15] = (v[0] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((0L - v[16])) & 4294967295L;
        m.store(v[15], v[17], 4);
        v[18] = (v[0] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = ((0L - v[19])) & 4294967295L;
        m.store(v[18], v[20], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[21] = ((83L >>> v[2])) & 4294967295L;
        v[22] = ((v[21] & 1L)) & 4294967295L;
        v[23] = v[22] == 0L ? 1L : 0L;
        return v[23] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[24] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = ((0L - v[25])) & 4294967295L;
        m.store(v[24], v[26], 4);
        v[27] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((0L - v[28])) & 4294967295L;
        m.store(v[27], v[29], 4);
        v[30] = (v[0] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = ((0L - v[31])) & 4294967295L;
        m.store(v[30], v[32], 4);
        v[33] = (v[0] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = ((0L - v[34])) & 4294967295L;
        m.store(v[33], v[35], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[5] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[36] = m.load(v[0], 4);
        m.store(v[1], v[36], 4);
        v[37] = (v[0] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = (v[1] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[39], v[38], 4);
        v[40] = (v[0] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[42], v[41], 4);
        v[43] = (v[0] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[45], v[44], 4);
        v[46] = (v[0] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = (v[1] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[48], v[47], 4);
        v[49] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = (v[1] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        m.store(v[51], v[50], 4);
        v[52] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = (v[1] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        m.store(v[54], v[53], 4);
        v[55] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = (v[1] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        m.store(v[57], v[56], 4);
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[58] = LibC.call(m, "memcpy", new long[]{v[1], v[0], 32L});
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        return -1;
    }
}
