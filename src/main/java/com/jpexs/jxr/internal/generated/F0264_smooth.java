package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: smooth.
 */
public final class F0264_smooth {

    private F0264_smooth() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4, long a5) {
        long[] v = new long[32];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
        v[5] = a5;
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
                        throw new IllegalStateException("Invalid block in smooth");
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
        v[6] = m.load(v[3], 4);
        v[7] = m.load(v[2], 4);
        v[8] = ((v[6] - v[7])) & 4294967295L;
        v[9] = ((v[8] << 2L)) & 4294967295L;
        v[10] = m.load(v[1], 4);
        v[11] = m.load(v[4], 4);
        v[12] = ((v[10] - v[11])) & 4294967295L;
        v[13] = ((v[12] + v[9])) & 4294967295L;
        v[14] = ((Heap.s(v[13], 32) >> 3L)) & 4294967295L;
        v[15] = ((v[6] - v[14])) & 4294967295L;
        m.store(v[3], v[15], 4);
        v[16] = m.load(v[2], 4);
        v[17] = ((v[14] + v[16])) & 4294967295L;
        m.store(v[2], v[17], 4);
        v[18] = m.load(v[1], 4);
        v[19] = ((Heap.s(v[18], 32) >> 1L)) & 4294967295L;
        v[20] = m.load(v[0], 4);
        v[21] = ((v[20] + v[17])) & 4294967295L;
        v[22] = ((Heap.s(v[21], 32) >> 2L)) & 4294967295L;
        v[23] = ((v[22] + v[19])) & 4294967295L;
        m.store(v[1], v[23], 4);
        v[24] = m.load(v[4], 4);
        v[25] = ((Heap.s(v[24], 32) >> 1L)) & 4294967295L;
        v[26] = m.load(v[3], 4);
        v[27] = m.load(v[5], 4);
        v[28] = ((v[27] + v[26])) & 4294967295L;
        v[29] = ((Heap.s(v[28], 32) >> 2L)) & 4294967295L;
        v[30] = ((v[29] + v[25])) & 4294967295L;
        m.store(v[4], v[30], 4);
        return -1;
    }
}
