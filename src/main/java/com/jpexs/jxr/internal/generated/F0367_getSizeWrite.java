package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getSizeWrite.
 */
public final class F0367_getSizeWrite {

    private F0367_getSizeWrite() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[16];
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
                        throw new IllegalStateException("Invalid block in getSizeWrite");
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
        v[1] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 32L) + 16L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = v[4] > v[2] ? 1L : 0L;
        v[6] = v[5] != 0 ? 8192L : 0L;
        v[7] = (v[2] + (Heap.s(v[6], 32) * 1L)) & 4294967295L;
        v[8] = (v[7]) & 4294967295L;
        v[9] = (v[4]) & 4294967295L;
        v[10] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = ((v[11] >>> 3L)) & 4294967295L;
        v[13] = ((v[12] - v[9])) & 4294967295L;
        v[14] = ((v[13] + v[8])) & 4294967295L;
        v[15] = v[14];
        return -1;
    }
}
