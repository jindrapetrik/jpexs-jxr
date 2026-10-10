package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getbfdwbig.
 */
public final class F0228_getbfdwbig {

    private F0228_getbfdwbig() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[26];
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
                        throw new IllegalStateException("Invalid block in getbfdwbig");
                }
                previous = old;
                if (pc < 0) {
                    return v[25];
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
        v[6] = (v[0] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        v[7] = (v[6] + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        v[8] = m.load(v[7], 1);
        v[9] = (v[8]) & 4294967295L;
        v[10] = (v[6] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        v[11] = m.load(v[10], 1);
        v[12] = (v[11]) & 4294967295L;
        v[13] = ((v[12] << 8L)) & 4294967295L;
        v[14] = ((v[13] | v[9])) & 4294967295L;
        v[15] = (v[6] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[16] = m.load(v[15], 1);
        v[17] = (v[16]) & 4294967295L;
        v[18] = ((v[17] << 16L)) & 4294967295L;
        v[19] = ((v[14] | v[18])) & 4294967295L;
        v[20] = m.load(v[6], 1);
        v[21] = (v[20]) & 4294967295L;
        v[22] = ((v[21] << 24L)) & 4294967295L;
        v[23] = ((v[19] | v[22])) & 4294967295L;
        m.store(v[3], v[23], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi24 = (previous == 1 ? 0L : 4294967193L);
        v[24] = phi24;
        v[25] = v[24];
        return -1;
    }
}
