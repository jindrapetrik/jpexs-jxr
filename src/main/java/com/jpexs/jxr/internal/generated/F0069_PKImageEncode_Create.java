package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_Create.
 */
public final class F0069_PKImageEncode_Create {

    private F0069_PKImageEncode_Create() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[18];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_Create");
                }
                previous = old;
                if (pc < 0) {
                    return v[17];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = LibC.call(m, "calloc", new long[]{1L, 66276L});
        m.store(v[0], v[1], 4);
        v[2] = v[1] == 0L ? 1L : 0L;
        return v[2] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[1], 1879048245L, 4);
        v[3] = (v[1] + (Heap.s(0L, 32) * 66276L) + 4L) & 4294967295L;
        m.store(v[3], 1879048246L, 4);
        v[4] = (v[1] + (Heap.s(0L, 32) * 66276L) + 8L) & 4294967295L;
        m.store(v[4], 1879048247L, 4);
        v[5] = (v[1] + (Heap.s(0L, 32) * 66276L) + 12L) & 4294967295L;
        m.store(v[5], 1879048248L, 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 66276L) + 16L) & 4294967295L;
        m.store(v[6], 1879048249L, 4);
        v[7] = (v[1] + (Heap.s(0L, 32) * 66276L) + 20L) & 4294967295L;
        m.store(v[7], 1879048250L, 4);
        v[8] = (v[1] + (Heap.s(0L, 32) * 66276L) + 24L) & 4294967295L;
        m.store(v[8], 1879048251L, 4);
        v[9] = (v[1] + (Heap.s(0L, 32) * 66276L) + 28L) & 4294967295L;
        m.store(v[9], 1879048252L, 4);
        v[10] = (v[1] + (Heap.s(0L, 32) * 66276L) + 36L) & 4294967295L;
        m.store(v[10], 1879048255L, 4);
        v[11] = (v[1] + (Heap.s(0L, 32) * 66276L) + 40L) & 4294967295L;
        m.store(v[11], 1879048256L, 4);
        v[12] = (v[1] + (Heap.s(0L, 32) * 66276L) + 44L) & 4294967295L;
        m.store(v[12], 1879048257L, 4);
        v[13] = (v[1] + (Heap.s(0L, 32) * 66276L) + 52L) & 4294967295L;
        m.store(v[13], 1879048259L, 4);
        v[14] = (v[1] + (Heap.s(0L, 32) * 66276L) + 56L) & 4294967295L;
        m.store(v[14], 1879048260L, 4);
        v[15] = (v[1] + (Heap.s(0L, 32) * 66276L) + 280L) & 4294967295L;
        m.store(v[15], 0L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi16 = (previous == 0 ? 4294967195L : 0L);
        v[16] = phi16;
        v[17] = v[16];
        return -1;
    }
}
