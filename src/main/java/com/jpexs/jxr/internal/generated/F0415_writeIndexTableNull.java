package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writeIndexTableNull.
 */
public final class F0415_writeIndexTableNull {

    private F0415_writeIndexTableNull() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[7];
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
                        throw new IllegalStateException("Invalid block in writeIndexTableNull");
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
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        F0361_fillToByte.run(m, v[5]);
        F0297_putBit16.run(m, v[5], 4L, 16L);
        F0297_putBit16.run(m, v[5], 111L, 8L);
        F0297_putBit16.run(m, v[5], 255L, 8L);
        F0297_putBit16.run(m, v[5], 1L, 16L);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[6] = 0L;
        return -1;
    }
}
