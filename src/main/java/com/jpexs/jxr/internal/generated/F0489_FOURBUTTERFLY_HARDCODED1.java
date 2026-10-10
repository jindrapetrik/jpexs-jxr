package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: FOURBUTTERFLY_HARDCODED1.
 */
public final class F0489_FOURBUTTERFLY_HARDCODED1 {

    private F0489_FOURBUTTERFLY_HARDCODED1() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[65];
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
                        throw new IllegalStateException("Invalid block in FOURBUTTERFLY_HARDCODED1");
                }
                previous = old;
                if (pc < 0) {
                    return v[64];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[2] = (v[0] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[3] = (v[0] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[4] = m.load(v[0], 4);
        v[5] = m.load(v[1], 4);
        v[6] = m.load(v[2], 4);
        v[7] = m.load(v[3], 4);
        v[8] = ((v[7] + v[4])) & 4294967295L;
        v[9] = ((v[5] - v[6])) & 4294967295L;
        v[10] = ((v[8] - v[9])) & 4294967295L;
        v[11] = ((Heap.s(v[10], 32) >> 1L)) & 4294967295L;
        v[12] = ((v[11] - v[7])) & 4294967295L;
        v[13] = ((v[11] - v[6])) & 4294967295L;
        v[14] = ((v[8] - v[13])) & 4294967295L;
        v[15] = ((v[12] + v[9])) & 4294967295L;
        m.store(v[0], v[14], 4);
        m.store(v[1], v[15], 4);
        m.store(v[2], v[12], 4);
        m.store(v[3], v[13], 4);
        v[16] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[17] = (v[0] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[18] = (v[0] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[19] = (v[0] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[16], 4);
        v[21] = m.load(v[17], 4);
        v[22] = m.load(v[18], 4);
        v[23] = m.load(v[19], 4);
        v[24] = ((v[23] + v[20])) & 4294967295L;
        v[25] = ((v[21] - v[22])) & 4294967295L;
        v[26] = ((v[24] - v[25])) & 4294967295L;
        v[27] = ((Heap.s(v[26], 32) >> 1L)) & 4294967295L;
        v[28] = ((v[27] - v[23])) & 4294967295L;
        v[29] = ((v[27] - v[22])) & 4294967295L;
        v[30] = ((v[24] - v[29])) & 4294967295L;
        v[31] = ((v[28] + v[25])) & 4294967295L;
        m.store(v[16], v[30], 4);
        m.store(v[17], v[31], 4);
        m.store(v[18], v[28], 4);
        m.store(v[19], v[29], 4);
        v[32] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[33] = (v[0] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[34] = (v[0] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[35] = (v[0] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[32], 4);
        v[37] = m.load(v[33], 4);
        v[38] = m.load(v[34], 4);
        v[39] = m.load(v[35], 4);
        v[40] = ((v[39] + v[36])) & 4294967295L;
        v[41] = ((v[37] - v[38])) & 4294967295L;
        v[42] = ((v[40] - v[41])) & 4294967295L;
        v[43] = ((Heap.s(v[42], 32) >> 1L)) & 4294967295L;
        v[44] = ((v[43] - v[39])) & 4294967295L;
        v[45] = ((v[43] - v[38])) & 4294967295L;
        v[46] = ((v[40] - v[45])) & 4294967295L;
        v[47] = ((v[44] + v[41])) & 4294967295L;
        m.store(v[32], v[46], 4);
        m.store(v[33], v[47], 4);
        m.store(v[34], v[44], 4);
        m.store(v[35], v[45], 4);
        v[48] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[49] = (v[0] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[50] = (v[0] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[51] = (v[0] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[52] = m.load(v[48], 4);
        v[53] = m.load(v[49], 4);
        v[54] = m.load(v[50], 4);
        v[55] = m.load(v[51], 4);
        v[56] = ((v[55] + v[52])) & 4294967295L;
        v[57] = ((v[53] - v[54])) & 4294967295L;
        v[58] = ((v[56] - v[57])) & 4294967295L;
        v[59] = ((Heap.s(v[58], 32) >> 1L)) & 4294967295L;
        v[60] = ((v[59] - v[55])) & 4294967295L;
        v[61] = ((v[59] - v[54])) & 4294967295L;
        v[62] = ((v[56] - v[61])) & 4294967295L;
        v[63] = ((v[60] + v[57])) & 4294967295L;
        m.store(v[48], v[62], 4);
        m.store(v[49], v[63], 4);
        m.store(v[50], v[60], 4);
        m.store(v[51], v[61], 4);
        return -1;
    }
}
