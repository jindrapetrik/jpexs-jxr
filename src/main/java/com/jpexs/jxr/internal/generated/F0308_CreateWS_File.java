package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: CreateWS_File.
 */
public final class F0308_CreateWS_File {

    private F0308_CreateWS_File() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[16];
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
                        throw new IllegalStateException("Invalid block in CreateWS_File");
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
        v[3] = LibC.call(m, "calloc", new long[]{1L, 44L});
        m.store(v[0], v[3], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[3] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        m.store(v[5], 1879048501L, 4);
        v[6] = (v[3] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[6], 1879048502L, 4);
        v[7] = (v[3] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        m.store(v[7], 1879048503L, 4);
        v[8] = (v[3] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        m.store(v[8], 1879048504L, 4);
        v[9] = (v[3] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        m.store(v[9], 1879048505L, 4);
        v[10] = (v[3] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        m.store(v[10], 1879048506L, 4);
        v[11] = LibC.call(m, "fopen", new long[]{v[1], v[2]});
        m.store(v[3], v[11], 4);
        v[12] = v[11] == 0L ? 1L : 0L;
        v[13] = v[12] != 0 ? 4294967194L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi14 = (previous == 0 ? 4294967195L : v[13]);
        v[14] = phi14;
        v[15] = v[14];
        return -1;
    }
}
