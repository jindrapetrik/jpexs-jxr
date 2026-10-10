package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: dequantizeBlock2x2.
 */
public final class F0473_dequantizeBlock2x2 {

    private F0473_dequantizeBlock2x2() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[16];
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
                        throw new IllegalStateException("Invalid block in dequantizeBlock2x2");
                }
                previous = old;
                if (pc < 0) {
                    return v[15];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[1] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = ((v[4] * v[2])) & 4294967295L;
        v[6] = (v[0] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        m.store(v[6], v[5], 4);
        v[7] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] * v[2])) & 4294967295L;
        v[10] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        m.store(v[10], v[9], 4);
        v[11] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[12] * v[2])) & 4294967295L;
        v[14] = (v[0] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        m.store(v[14], v[13], 4);
        return -1;
    }
}
