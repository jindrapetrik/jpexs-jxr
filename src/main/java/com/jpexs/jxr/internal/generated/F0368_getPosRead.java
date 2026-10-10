package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getPosRead.
 */
public final class F0368_getPosRead {

    private F0368_getPosRead() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[17];
        v[0] = a0;
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
                        throw new IllegalStateException("Invalid block in getPosRead");
                }
                previous = old;
                if (pc < 0) {
                    return v[16];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 32L) + 16L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[2] + (Heap.s(8192L, 32) * 1L)) & 4294967295L;
        v[4] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[3]) & 4294967295L;
        v[7] = (v[5]) & 4294967295L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[9] >>> 3L)) & 4294967295L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 32L) + 28L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[7] - v[6])) & 4294967295L;
        v[14] = ((v[13] + v[10])) & 4294967295L;
        v[15] = ((v[14] + v[12])) & 4294967295L;
        v[16] = v[15];
        return -1;
    }
}
