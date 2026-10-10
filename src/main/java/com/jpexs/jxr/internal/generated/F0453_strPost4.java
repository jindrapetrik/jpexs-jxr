package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: strPost4.
 */
public final class F0453_strPost4 {

    private F0453_strPost4() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[50];
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
                        throw new IllegalStateException("Invalid block in strPost4");
                }
                previous = old;
                if (pc < 0) {
                    return v[49];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.load(v[0], 4);
        v[5] = m.load(v[1], 4);
        v[6] = m.load(v[2], 4);
        v[7] = m.load(v[3], 4);
        v[8] = ((v[7] + v[4])) & 4294967295L;
        v[9] = ((v[6] + v[5])) & 4294967295L;
        v[10] = ((v[8] + 1L)) & 4294967295L;
        v[11] = ((Heap.s(v[10], 32) >> 1L)) & 4294967295L;
        v[12] = ((v[9] + 1L)) & 4294967295L;
        v[13] = ((Heap.s(v[12], 32) >> 1L)) & 4294967295L;
        v[14] = ((v[7] + 1L)) & 4294967295L;
        v[15] = ((v[14] - v[11])) & 4294967295L;
        v[16] = ((Heap.s(v[15], 32) >> 1L)) & 4294967295L;
        v[17] = ((v[13] + v[16])) & 4294967295L;
        v[18] = ((v[6] - v[17])) & 4294967295L;
        v[19] = ((v[18] + 1L)) & 4294967295L;
        v[20] = ((Heap.s(v[19], 32) >> 1L)) & 4294967295L;
        v[21] = ((v[20] + v[7])) & 4294967295L;
        v[22] = ((v[18] + v[13])) & 4294967295L;
        v[23] = ((v[21] * 3L)) & 4294967295L;
        v[24] = ((v[23] + 16L)) & 4294967295L;
        v[25] = ((Heap.s(v[24], 32) >> 5L)) & 4294967295L;
        v[26] = ((v[25] - v[21])) & 4294967295L;
        v[27] = ((v[26] + v[8])) & 4294967295L;
        v[28] = ((v[22] * 3L)) & 4294967295L;
        v[29] = ((v[28] + 16L)) & 4294967295L;
        v[30] = ((Heap.s(v[29], 32) >> 5L)) & 4294967295L;
        v[31] = ((v[30] - v[22])) & 4294967295L;
        v[32] = ((v[31] + v[9])) & 4294967295L;
        v[33] = ((v[27] * 3L)) & 4294967295L;
        v[34] = ((v[33] + 8L)) & 4294967295L;
        v[35] = ((Heap.s(v[34], 32) >> 4L)) & 4294967295L;
        v[36] = ((v[35] + v[21])) & 4294967295L;
        v[37] = ((v[32] * 3L)) & 4294967295L;
        v[38] = ((v[37] + 8L)) & 4294967295L;
        v[39] = ((Heap.s(v[38], 32) >> 4L)) & 4294967295L;
        v[40] = ((v[39] + v[22])) & 4294967295L;
        v[41] = ((v[36] * 3L)) & 4294967295L;
        v[42] = ((v[41] + 16L)) & 4294967295L;
        v[43] = ((Heap.s(v[42], 32) >> 5L)) & 4294967295L;
        v[44] = ((v[43] + v[27])) & 4294967295L;
        v[45] = ((v[40] * 3L)) & 4294967295L;
        v[46] = ((v[45] + 16L)) & 4294967295L;
        v[47] = ((Heap.s(v[46], 32) >> 5L)) & 4294967295L;
        v[48] = ((v[47] + v[32])) & 4294967295L;
        m.store(v[0], v[44], 4);
        m.store(v[1], v[48], 4);
        m.store(v[2], v[40], 4);
        m.store(v[3], v[36], 4);
        return -1;
    }
}
