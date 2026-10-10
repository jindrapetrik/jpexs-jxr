package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: MUL32HR.
 */
public final class F0482_MUL32HR {

    private F0482_MUL32HR() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[10];
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
                        throw new IllegalStateException("Invalid block in MUL32HR");
                }
                previous = old;
                if (pc < 0) {
                    return v[9];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = v[0];
        v[4] = v[1];
        v[5] = (v[4] * v[3]);
        v[6] = (v[5] >>> 32L);
        v[7] = (v[6]) & 4294967295L;
        v[8] = ((v[7] >>> v[2])) & 4294967295L;
        v[9] = v[8];
        return -1;
    }
}
