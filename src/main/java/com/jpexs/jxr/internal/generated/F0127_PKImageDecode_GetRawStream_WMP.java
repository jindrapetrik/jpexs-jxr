package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_GetRawStream_WMP.
 */
public final class F0127_PKImageDecode_GetRawStream_WMP {

    private F0127_PKImageDecode_GetRawStream_WMP() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[11];
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_GetRawStream_WMP");
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
        v[2] = (v[0] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        m.store(v[1], 0L, 4);
        v[4] = (v[3] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Dispatch.call(m, v[5], new long[]{v[3], v[7]});
        v[9] = Heap.s(v[8], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[1], v[3], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = v[8];
        return -1;
    }
}
