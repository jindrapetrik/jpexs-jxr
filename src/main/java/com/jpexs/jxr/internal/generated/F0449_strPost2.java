package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: strPost2.
 */
public final class F0449_strPost2 {

    private F0449_strPost2() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[16];
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
                        throw new IllegalStateException("Invalid block in strPost2");
                }
                previous = old;
                if (pc < 0) {
                    return v[15];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.load(v[0], 4);
        v[3] = ((v[2] + 4L)) & 4294967295L;
        v[4] = ((Heap.s(v[3], 32) >> 3L)) & 4294967295L;
        v[5] = m.load(v[1], 4);
        v[6] = ((v[4] + v[5])) & 4294967295L;
        m.store(v[1], v[6], 4);
        v[7] = ((v[6] + 2L)) & 4294967295L;
        v[8] = ((Heap.s(v[7], 32) >> 2L)) & 4294967295L;
        v[9] = m.load(v[0], 4);
        v[10] = ((v[8] + v[9])) & 4294967295L;
        m.store(v[0], v[10], 4);
        v[11] = ((v[10] + 4L)) & 4294967295L;
        v[12] = ((Heap.s(v[11], 32) >> 3L)) & 4294967295L;
        v[13] = m.load(v[1], 4);
        v[14] = ((v[12] + v[13])) & 4294967295L;
        m.store(v[1], v[14], 4);
        return -1;
    }
}
