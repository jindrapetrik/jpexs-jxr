package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: smoothMB.
 */
public final class F0263_smoothMB {

    private F0263_smoothMB() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[17];
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
                        throw new IllegalStateException("Invalid block in smoothMB");
                }
                previous = old;
                if (pc < 0) {
                    return v[16];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.load(v[2], 4);
        v[5] = m.load(v[1], 4);
        v[6] = ((v[4] - v[5])) & 4294967295L;
        v[7] = ((v[6] << 2L)) & 4294967295L;
        v[8] = m.load(v[0], 4);
        v[9] = m.load(v[3], 4);
        v[10] = ((v[8] - v[9])) & 4294967295L;
        v[11] = ((v[10] + v[7])) & 4294967295L;
        v[12] = ((Heap.s(v[11], 32) >> 3L)) & 4294967295L;
        v[13] = ((v[4] - v[12])) & 4294967295L;
        m.store(v[2], v[13], 4);
        v[14] = m.load(v[1], 4);
        v[15] = ((v[12] + v[14])) & 4294967295L;
        m.store(v[1], v[15], 4);
        return -1;
    }
}
