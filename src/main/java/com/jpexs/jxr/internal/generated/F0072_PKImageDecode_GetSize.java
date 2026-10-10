package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_GetSize.
 */
public final class F0072_PKImageDecode_GetSize {

    private F0072_PKImageDecode_GetSize() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[8];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_GetSize");
                }
                previous = old;
                if (pc < 0) {
                    return v[7];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 66224L) + 72L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        m.store(v[1], v[4], 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 66224L) + 76L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        m.store(v[2], v[6], 4);
        v[7] = 0L;
        return -1;
    }
}
