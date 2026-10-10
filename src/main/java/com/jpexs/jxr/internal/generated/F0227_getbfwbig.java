package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getbfwbig.
 */
public final class F0227_getbfwbig {

    private F0227_getbfwbig() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[16];
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
                        throw new IllegalStateException("Invalid block in getbfwbig");
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
        v[4] = ((v[2] + 2L)) & 4294967295L;
        v[5] = v[4] > v[1] ? 1L : 0L;
        return v[5] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        v[7] = (v[6] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[8] = m.load(v[7], 1);
        v[9] = (v[8]) & 65535L;
        v[10] = m.load(v[6], 1);
        v[11] = (v[10]) & 65535L;
        v[12] = ((v[11] << 8L)) & 65535L;
        v[13] = ((v[12] | v[9])) & 65535L;
        m.store(v[3], v[13], 2);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi14 = (previous == 1 ? 0L : 4294967193L);
        v[14] = phi14;
        v[15] = v[14];
        return -1;
    }
}
