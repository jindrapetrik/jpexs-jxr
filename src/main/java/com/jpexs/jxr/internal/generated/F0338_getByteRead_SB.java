package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getByteRead_SB.
 */
public final class F0338_getByteRead_SB {

    private F0338_getByteRead_SB() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[4];
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
                    default:
                        throw new IllegalStateException("Invalid block in getByteRead_SB");
                }
                previous = old;
                if (pc < 0) {
                    return v[3];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2];
        return -1;
    }
}
