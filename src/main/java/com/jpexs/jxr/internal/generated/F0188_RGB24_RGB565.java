package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB24_RGB565.
 */
public final class F0188_RGB24_RGB565 {

    private F0188_RGB24_RGB565() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[37];
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
                        throw new IllegalStateException("Invalid block in RGB24_RGB565");
                }
                previous = old;
                if (pc < 0) {
                    return v[36];
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
        long phi10 = (previous == 1 ? 0L : v[34]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 3 ? v[32] : 0L);
        v[13] = phi13;
        v[14] = ((v[13] * 3L)) & 4294967295L;
        v[15] = (v[12] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        v[16] = m.load(v[15], 1);
        v[17] = (v[15] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[18] = m.load(v[17], 1);
        v[19] = (v[15] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        v[20] = m.load(v[19], 1);
        v[21] = ((v[16] & 248L)) & 255L;
        v[22] = (v[21]) & 65535L;
        v[23] = ((v[22] << 8L)) & 65535L;
        v[24] = ((v[18] & 252L)) & 255L;
        v[25] = (v[24]) & 65535L;
        v[26] = ((v[25] << 3L)) & 65535L;
        v[27] = ((v[26] | v[23])) & 65535L;
        v[28] = ((v[20] >>> 3L)) & 255L;
        v[29] = (v[28]) & 65535L;
        v[30] = ((v[27] | v[29])) & 65535L;
        v[31] = (v[12] + (Heap.s(v[13], 32) * 2L)) & 4294967295L;
        m.store(v[31], v[30], 2);
        v[32] = ((v[13] + 1L)) & 4294967295L;
        v[33] = v[32] == v[7] ? 1L : 0L;
        return v[33] != 0 ? 4 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[34] = ((v[10] + 1L)) & 4294967295L;
        v[35] = v[34] == v[5] ? 1L : 0L;
        return v[35] != 0 ? 5 : 2;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[36] = 0L;
        return -1;
    }
}
