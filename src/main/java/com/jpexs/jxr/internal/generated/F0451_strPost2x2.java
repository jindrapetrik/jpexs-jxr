package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: strPost2x2.
 */
public final class F0451_strPost2x2 {

    private F0451_strPost2x2() {
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
                    default:
                        throw new IllegalStateException("Invalid block in strPost2x2");
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
        v[21] = ((v[20] + v[8])) & 4294967295L;
        v[22] = ((v[21] + 2L)) & 4294967295L;
        v[23] = ((Heap.s(v[22], 32) >> 2L)) & 4294967295L;
        v[24] = ((v[23] + v[18])) & 4294967295L;
        v[25] = ((v[21] + 1L)) & 4294967295L;
        v[26] = ((Heap.s(v[25], 32) >> 1L)) & 4294967295L;
        v[27] = ((v[26] + v[12])) & 4294967295L;
        v[28] = ((v[24] + 1L)) & 4294967295L;
        v[29] = ((Heap.s(v[28], 32) >> 1L)) & 4294967295L;
        v[30] = ((v[29] + v[15])) & 4294967295L;
        v[31] = ((v[21] - v[27])) & 4294967295L;
        v[32] = ((v[24] - v[30])) & 4294967295L;
        m.store(v[0], v[31], 4);
        m.store(v[1], v[32], 4);
        m.store(v[2], v[30], 4);
        m.store(v[3], v[27], 4);
        return -1;
    }
}
