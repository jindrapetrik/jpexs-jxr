package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: copyAC.
 */
public final class F0470_copyAC {

    private F0470_copyAC() {
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
                        throw new IllegalStateException("Invalid block in copyAC");
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
        v[2] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[3] = m.load(v[2], 4);
        m.store(v[1], v[3], 4);
        v[4] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[1] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[6], v[5], 4);
        v[7] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[9], v[8], 4);
        v[10] = (v[0] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[12], v[11], 4);
        v[13] = (v[0] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[1] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[15], v[14], 4);
        v[16] = (v[0] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[1] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        m.store(v[18], v[17], 4);
        return -1;
    }
}
