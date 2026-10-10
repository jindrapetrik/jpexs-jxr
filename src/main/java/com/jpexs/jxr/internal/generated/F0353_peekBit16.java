package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: peekBit16.
 */
public final class F0353_peekBit16 {

    private F0353_peekBit16() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[7];
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
                    default:
                        throw new IllegalStateException("Invalid block in peekBit16");
                }
                previous = old;
                if (pc < 0) {
                    return v[6];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = ((32L - v[1])) & 4294967295L;
        v[5] = ((v[3] >>> v[4])) & 4294967295L;
        v[6] = v[5];
        return -1;
    }
}
