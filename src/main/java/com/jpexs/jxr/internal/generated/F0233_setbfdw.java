package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: setbfdw.
 */
public final class F0233_setbfdw {

    private F0233_setbfdw() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[19];
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
                    default:
                        throw new IllegalStateException("Invalid block in setbfdw");
                }
                previous = old;
                if (pc < 0) {
                    return v[18];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = ((v[2] + 4L)) & 4294967295L;
        v[5] = v[4] > v[1] ? 1L : 0L;
        return v[5] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[3]) & 255L;
        v[7] = (v[0] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        m.store(v[7], v[6], 1);
        v[8] = ((v[3] >>> 8L)) & 4294967295L;
        v[9] = (v[8]) & 255L;
        v[10] = (v[7] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[10], v[9], 1);
        v[11] = ((v[3] >>> 16L)) & 4294967295L;
        v[12] = (v[11]) & 255L;
        v[13] = (v[7] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[13], v[12], 1);
        v[14] = ((v[3] >>> 24L)) & 4294967295L;
        v[15] = (v[14]) & 255L;
        v[16] = (v[7] + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[16], v[15], 1);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi17 = (previous == 1 ? 0L : 4294967193L);
        v[17] = phi17;
        v[18] = v[17];
        return -1;
    }
}
