package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Clean.
 */
public final class F0000_Clean {

    private F0000_Clean() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[3];
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
                        throw new IllegalStateException("Invalid block in Clean");
                }
                previous = old;
                if (pc < 0) {
                    return v[2];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = v[0] == 0L ? 1L : 0L;
        return v[1] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[0]});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return -1;
    }
}
