package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_Create.
 */
public final class F0080_PKImageDecode_Create {

    private F0080_PKImageDecode_Create() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[14];
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
                        throw new IllegalStateException("Invalid block in PKImageDecode_Create");
                }
                previous = old;
                if (pc < 0) {
                    return v[13];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = LibC.call(m, "calloc", new long[]{1L, 66224L});
        m.store(v[0], v[1], 4);
        v[2] = v[1] == 0L ? 1L : 0L;
        return v[2] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[1], 1879048262L, 4);
        v[3] = (v[1] + (Heap.s(0L, 32) * 66224L) + 4L) & 4294967295L;
        m.store(v[3], 1879048263L, 4);
        v[4] = (v[1] + (Heap.s(0L, 32) * 66224L) + 8L) & 4294967295L;
        m.store(v[4], 1879048264L, 4);
        v[5] = (v[1] + (Heap.s(0L, 32) * 66224L) + 12L) & 4294967295L;
        m.store(v[5], 1879048265L, 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 66224L) + 16L) & 4294967295L;
        m.store(v[6], 1879048266L, 4);
        v[7] = (v[1] + (Heap.s(0L, 32) * 66224L) + 20L) & 4294967295L;
        m.store(v[7], 1879048267L, 4);
        v[8] = (v[1] + (Heap.s(0L, 32) * 66224L) + 28L) & 4294967295L;
        m.store(v[8], 1879048268L, 4);
        v[9] = (v[1] + (Heap.s(0L, 32) * 66224L) + 32L) & 4294967295L;
        m.store(v[9], 1879048269L, 4);
        v[10] = (v[1] + (Heap.s(0L, 32) * 66224L) + 36L) & 4294967295L;
        m.store(v[10], 1879048270L, 4);
        v[11] = (v[1] + (Heap.s(0L, 32) * 66224L) + 40L) & 4294967295L;
        m.store(v[11], 1879048271L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi12 = (previous == 0 ? 4294967195L : 0L);
        v[12] = phi12;
        v[13] = v[12];
        return -1;
    }
}
