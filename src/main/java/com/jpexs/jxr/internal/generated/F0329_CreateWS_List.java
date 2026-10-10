package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: CreateWS_List.
 */
public final class F0329_CreateWS_List {

    private F0329_CreateWS_List() {
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in CreateWS_List");
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
        v[1] = LibC.call(m, "calloc", new long[]{1L, 4144L});
        m.store(v[0], v[1], 4);
        v[2] = v[1] == 0L ? 1L : 0L;
        return v[2] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = (v[1] + (Heap.s(48L, 32) * 1L)) & 4294967295L;
        m.store(v[1], v[3], 4);
        v[4] = (v[1] + (Heap.s(44L, 32) * 1L)) & 4294967295L;
        v[5] = LibC.call(m, "memset", new long[]{v[4], 0L, 4L});
        v[6] = (v[1] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        m.store(v[6], 4096L, 4);
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        m.store(v[7], 0L, 4);
        v[8] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        m.store(v[8], 0L, 4);
        v[9] = (v[1] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        m.store(v[9], 1879048522L, 4);
        v[10] = (v[1] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[10], 0L, 4);
        v[11] = (v[1] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        m.store(v[11], 1879048523L, 4);
        v[12] = (v[1] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        m.store(v[12], 1879048524L, 4);
        v[13] = (v[1] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        m.store(v[13], 1879048525L, 4);
        v[14] = (v[1] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        m.store(v[14], 1879048526L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi15 = (previous == 0 ? 4294967195L : 0L);
        v[15] = phi15;
        v[16] = v[15];
        return -1;
    }
}
