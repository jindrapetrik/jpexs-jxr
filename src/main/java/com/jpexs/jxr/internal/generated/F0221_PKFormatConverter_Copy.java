package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKFormatConverter_Copy.
 */
public final class F0221_PKFormatConverter_Copy {

    private F0221_PKFormatConverter_Copy() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[15];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                        throw new IllegalStateException("Invalid block in PKFormatConverter_Copy");
                }
                previous = old;
                if (pc < 0) {
                    return v[14];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 56L) + 36L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[5] + (Heap.s(0L, 32) * 66224L) + 28L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Dispatch.call(m, v[7], new long[]{v[5], v[1], v[2], v[3]});
        v[9] = Heap.s(v[8], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 56L) + 28L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = Dispatch.call(m, v[11], new long[]{v[0], v[1], v[2], v[3]});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi13 = (previous == 0 ? v[8] : v[12]);
        v[13] = phi13;
        v[14] = v[13];
        return -1;
    }
}
