package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: DCCompensate.
 */
public final class F0455_DCCompensate {

    private F0455_DCCompensate() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[15];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                        throw new IllegalStateException("Invalid block in DCCompensate");
                }
                previous = old;
                if (pc < 0) {
                    return v[14];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = ((Heap.s(v[4], 32) >> 1L)) & 4294967295L;
        v[6] = m.load(v[0], 4);
        v[7] = ((v[6] - v[5])) & 4294967295L;
        m.store(v[0], v[7], 4);
        v[8] = m.load(v[3], 4);
        v[9] = ((v[8] - v[5])) & 4294967295L;
        m.store(v[3], v[9], 4);
        v[10] = m.load(v[1], 4);
        v[11] = ((v[10] + v[5])) & 4294967295L;
        m.store(v[1], v[11], 4);
        v[12] = m.load(v[2], 4);
        v[13] = ((v[12] + v[5])) & 4294967295L;
        m.store(v[2], v[13], 4);
        return -1;
    }
}
