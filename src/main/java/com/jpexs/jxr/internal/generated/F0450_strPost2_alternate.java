package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: strPost2_alternate.
 */
public final class F0450_strPost2_alternate {

    private F0450_strPost2_alternate() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[20];
        v[0] = a0;
        v[1] = a1;
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
                        throw new IllegalStateException("Invalid block in strPost2_alternate");
                }
                previous = old;
                if (pc < 0) {
                    return v[19];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.load(v[0], 4);
        v[3] = m.load(v[1], 4);
        v[4] = ((v[2] + 2L)) & 4294967295L;
        v[5] = ((Heap.s(v[4], 32) >> 2L)) & 4294967295L;
        v[6] = ((v[5] + v[3])) & 4294967295L;
        v[7] = ((v[6] + 1L)) & 4294967295L;
        v[8] = ((Heap.s(v[7], 32) >> 1L)) & 4294967295L;
        v[9] = ((Heap.s(v[6], 32) >> 5L)) & 4294967295L;
        v[10] = ((Heap.s(v[6], 32) >> 9L)) & 4294967295L;
        v[11] = ((Heap.s(v[6], 32) >> 13L)) & 4294967295L;
        v[12] = ((v[9] + v[2])) & 4294967295L;
        v[13] = ((v[12] + v[10])) & 4294967295L;
        v[14] = ((v[13] + v[11])) & 4294967295L;
        v[15] = ((v[14] + v[8])) & 4294967295L;
        v[16] = ((v[15] + 2L)) & 4294967295L;
        v[17] = ((Heap.s(v[16], 32) >> 2L)) & 4294967295L;
        v[18] = ((v[17] + v[6])) & 4294967295L;
        m.store(v[0], v[15], 4);
        m.store(v[1], v[18], 4);
        return -1;
    }
}
