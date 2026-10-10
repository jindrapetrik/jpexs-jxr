package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKAllocAligned.
 */
public final class F0033_PKAllocAligned {

    private F0033_PKAllocAligned() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[17];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
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
                        throw new IllegalStateException("Invalid block in PKAllocAligned");
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
        v[3] = ((v[1] + 3L)) & 4294967295L;
        v[4] = ((v[3] + v[2])) & 4294967295L;
        m.store(v[0], 0L, 4);
        v[5] = LibC.call(m, "calloc", new long[]{1L, v[4]});
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[5]) & 4294967295L;
        v[8] = ((v[7] % v[2])) & 4294967295L;
        v[9] = ((v[2] - v[8])) & 4294967295L;
        v[10] = v[9] < 4L ? 1L : 0L;
        v[11] = v[10] != 0 ? v[2] : 0L;
        v[12] = (v[5] + (Heap.s(v[9], 32) * 1L)) & 4294967295L;
        v[13] = (v[12] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        v[14] = (v[13] + (Heap.s(4294967292L, 32) * 1L)) & 4294967295L;
        m.store(v[14], v[5], 4);
        m.store(v[0], v[13], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi15 = (previous == 1 ? 0L : 4294967195L);
        v[15] = phi15;
        v[16] = v[15];
        return -1;
    }
}
