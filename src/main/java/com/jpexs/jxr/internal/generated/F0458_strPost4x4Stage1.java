package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: strPost4x4Stage1.
 */
public final class F0458_strPost4x4Stage1 {

    private F0458_strPost4x4Stage1() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[6];
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
                    default:
                        throw new IllegalStateException("Invalid block in strPost4x4Stage1");
                }
                previous = old;
                if (pc < 0) {
                    return v[5];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        F0457_strPost4x4Stage1Split.run(m, v[0], v[4], v[1], v[2], v[3]);
        return -1;
    }
}
