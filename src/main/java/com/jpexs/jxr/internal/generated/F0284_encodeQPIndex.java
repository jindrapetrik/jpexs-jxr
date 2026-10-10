package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: encodeQPIndex.
 */
public final class F0284_encodeQPIndex {

    private F0284_encodeQPIndex() {
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    case 3:
                        pc = b3(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in encodeQPIndex");
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
        v[3] = v[1] == 0L ? 1L : 0L;
        return v[3] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[0], 0L, 1L);
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[4] = (v[1]) & 4294967295L;
        F0359_putBit16z.run(m, v[0], 1L, 1L);
        v[5] = ((v[4] + 4294967295L)) & 4294967295L;
        v[6] = (v[2]) & 4294967295L;
        F0359_putBit16z.run(m, v[0], v[5], v[6]);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return -1;
    }
}
