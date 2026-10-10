package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: dequantizeBlock4x2.
 */
public final class F0474_dequantizeBlock4x2 {

    private F0474_dequantizeBlock4x2() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[32];
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
                        throw new IllegalStateException("Invalid block in dequantizeBlock4x2");
                }
                previous = old;
                if (pc < 0) {
                    return v[31];
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
        v[6] = (v[0] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        m.store(v[6], v[5], 4);
        v[7] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] * v[2])) & 4294967295L;
        v[10] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        m.store(v[10], v[9], 4);
        v[11] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[12] * v[2])) & 4294967295L;
        v[14] = (v[0] + (Heap.s(80L, 32) * 4L)) & 4294967295L;
        m.store(v[14], v[13], 4);
        v[15] = (v[1] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[16] * v[2])) & 4294967295L;
        v[18] = (v[0] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        m.store(v[18], v[17], 4);
        v[19] = (v[1] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = ((v[20] * v[2])) & 4294967295L;
        v[22] = (v[0] + (Heap.s(96L, 32) * 4L)) & 4294967295L;
        m.store(v[22], v[21], 4);
        v[23] = (v[1] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = ((v[24] * v[2])) & 4294967295L;
        v[26] = (v[0] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        m.store(v[26], v[25], 4);
        v[27] = (v[1] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[28] * v[2])) & 4294967295L;
        v[30] = (v[0] + (Heap.s(112L, 32) * 4L)) & 4294967295L;
        m.store(v[30], v[29], 4);
        return -1;
    }
}
