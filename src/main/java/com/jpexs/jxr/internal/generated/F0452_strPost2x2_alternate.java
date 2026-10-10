package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: strPost2x2_alternate.
 */
public final class F0452_strPost2x2_alternate {

    private F0452_strPost2x2_alternate() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[40];
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
                    default:
                        throw new IllegalStateException("Invalid block in strPost2x2_alternate");
                }
                previous = old;
                if (pc < 0) {
                    return v[39];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.load(v[0], 4);
        v[5] = m.load(v[1], 4);
        v[6] = m.load(v[2], 4);
        v[7] = m.load(v[3], 4);
        v[8] = ((v[7] + v[4])) & 4294967295L;
        v[9] = ((v[6] + v[5])) & 4294967295L;
        v[10] = ((v[8] + 1L)) & 4294967295L;
        v[11] = ((Heap.s(v[10], 32) >> 1L)) & 4294967295L;
        v[12] = ((v[7] - v[11])) & 4294967295L;
        v[13] = ((v[9] + 1L)) & 4294967295L;
        v[14] = ((Heap.s(v[13], 32) >> 1L)) & 4294967295L;
        v[15] = ((v[6] - v[14])) & 4294967295L;
        v[16] = ((v[8] + 2L)) & 4294967295L;
        v[17] = ((Heap.s(v[16], 32) >> 2L)) & 4294967295L;
        v[18] = ((v[17] + v[9])) & 4294967295L;
        v[19] = ((v[18] + 1L)) & 4294967295L;
        v[20] = ((Heap.s(v[19], 32) >> 1L)) & 4294967295L;
        v[21] = ((Heap.s(v[18], 32) >> 5L)) & 4294967295L;
        v[22] = ((Heap.s(v[18], 32) >> 9L)) & 4294967295L;
        v[23] = ((Heap.s(v[18], 32) >> 13L)) & 4294967295L;
        v[24] = ((v[21] + v[8])) & 4294967295L;
        v[25] = ((v[24] + v[22])) & 4294967295L;
        v[26] = ((v[25] + v[23])) & 4294967295L;
        v[27] = ((v[26] + v[20])) & 4294967295L;
        v[28] = ((v[27] + 2L)) & 4294967295L;
        v[29] = ((Heap.s(v[28], 32) >> 2L)) & 4294967295L;
        v[30] = ((v[29] + v[18])) & 4294967295L;
        v[31] = ((v[27] + 1L)) & 4294967295L;
        v[32] = ((Heap.s(v[31], 32) >> 1L)) & 4294967295L;
        v[33] = ((v[32] + v[12])) & 4294967295L;
        v[34] = ((v[30] + 1L)) & 4294967295L;
        v[35] = ((Heap.s(v[34], 32) >> 1L)) & 4294967295L;
        v[36] = ((v[35] + v[15])) & 4294967295L;
        v[37] = ((v[27] - v[33])) & 4294967295L;
        v[38] = ((v[30] - v[36])) & 4294967295L;
        m.store(v[0], v[37], 4);
        m.store(v[1], v[38], 4);
        m.store(v[2], v[36], 4);
        m.store(v[3], v[33], 4);
        return -1;
    }
}
