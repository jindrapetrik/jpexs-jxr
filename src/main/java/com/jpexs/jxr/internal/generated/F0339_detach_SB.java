package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: detach_SB.
 */
public final class F0339_detach_SB {

    private F0339_detach_SB() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[2];
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
                        throw new IllegalStateException("Invalid block in detach_SB");
                }
                previous = old;
                if (pc < 0) {
                    return v[1];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        m.store(v[0], 0L, 4);
        v[1] = 0L;
        return -1;
    }
}
