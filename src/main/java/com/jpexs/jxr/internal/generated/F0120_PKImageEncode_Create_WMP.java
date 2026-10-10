package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_Create_WMP.
 */
public final class F0120_PKImageEncode_Create_WMP {

    private F0120_PKImageEncode_Create_WMP() {
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_Create_WMP");
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
        v[1] = F0069_PKImageEncode_Create.run(m, v[0]);
        v[2] = Heap.s(v[1], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[2] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = m.load(v[0], 4);
        m.store(v[3], 1879048285L, 4);
        v[4] = (v[3] + (Heap.s(0L, 32) * 66276L) + 4L) & 4294967295L;
        m.store(v[4], 1879048286L, 4);
        v[5] = (v[3] + (Heap.s(0L, 32) * 66276L) + 20L) & 4294967295L;
        m.store(v[5], 1879048295L, 4);
        v[6] = (v[3] + (Heap.s(0L, 32) * 66276L) + 24L) & 4294967295L;
        m.store(v[6], 1879048304L, 4);
        v[7] = (v[3] + (Heap.s(0L, 32) * 66276L) + 28L) & 4294967295L;
        m.store(v[7], 1879048305L, 4);
        v[8] = (v[3] + (Heap.s(0L, 32) * 66276L) + 36L) & 4294967295L;
        m.store(v[8], 1879048306L, 4);
        v[9] = (v[3] + (Heap.s(0L, 32) * 66276L) + 40L) & 4294967295L;
        m.store(v[9], 1879048307L, 4);
        v[10] = (v[3] + (Heap.s(0L, 32) * 66276L) + 44L) & 4294967295L;
        m.store(v[10], 1879048308L, 4);
        v[11] = (v[3] + (Heap.s(0L, 32) * 66276L) + 48L) & 4294967295L;
        m.store(v[11], 1879048309L, 4);
        v[12] = (v[3] + (Heap.s(0L, 32) * 66276L) + 52L) & 4294967295L;
        m.store(v[12], 1879048310L, 4);
        v[13] = (v[3] + (Heap.s(0L, 32) * 66276L) + 56L) & 4294967295L;
        m.store(v[13], 1879048311L, 4);
        v[14] = (v[3] + (Heap.s(0L, 32) * 66276L) + 280L) & 4294967295L;
        m.store(v[14], 1L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = v[1];
        return -1;
    }
}
