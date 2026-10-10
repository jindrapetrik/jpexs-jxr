package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_Create_WMP.
 */
public final class F0138_PKImageDecode_Create_WMP {

    private F0138_PKImageDecode_Create_WMP() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[11];
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
                        throw new IllegalStateException("Invalid block in PKImageDecode_Create_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[10];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = F0080_PKImageDecode_Create.run(m, v[0]);
        v[2] = Heap.s(v[1], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[2] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = m.load(v[0], 4);
        m.store(v[3], 1879048317L, 4);
        v[4] = (v[3] + (Heap.s(0L, 32) * 66224L) + 8L) & 4294967295L;
        m.store(v[4], 1879048318L, 4);
        v[5] = (v[3] + (Heap.s(0L, 32) * 66224L) + 24L) & 4294967295L;
        m.store(v[5], 1879048319L, 4);
        v[6] = (v[3] + (Heap.s(0L, 32) * 66224L) + 28L) & 4294967295L;
        m.store(v[6], 1879048320L, 4);
        v[7] = (v[3] + (Heap.s(0L, 32) * 66224L) + 16L) & 4294967295L;
        m.store(v[7], 1879048322L, 4);
        v[8] = (v[3] + (Heap.s(0L, 32) * 66224L) + 20L) & 4294967295L;
        m.store(v[8], 1879048328L, 4);
        v[9] = (v[3] + (Heap.s(0L, 32) * 66224L) + 40L) & 4294967295L;
        m.store(v[9], 1879048329L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = v[1];
        return -1;
    }
}
