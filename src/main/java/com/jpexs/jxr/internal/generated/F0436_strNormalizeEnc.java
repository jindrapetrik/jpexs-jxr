package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: strNormalizeEnc.
 */
public final class F0436_strNormalizeEnc {

    private F0436_strNormalizeEnc() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[51];
        v[0] = a0;
        v[1] = a1;
        int frame = m.stackPosition();
        int pc = 0, previous = -1;
        try {
            while (true) {
                int old = pc;
                switch (pc) {
                    case 0:
                        pc = b0(m, v, previous);
                        break;
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in strNormalizeEnc");
                }
                previous = old;
                if (pc < 0) {
                    return v[50];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = v[1] == 0L ? 1L : 0L;
        return v[2] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = m.load(v[0], 4);
        v[4] = ((Heap.s(v[3], 32) >> 1L)) & 4294967295L;
        m.store(v[0], v[4], 4);
        v[5] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = ((Heap.s(v[6], 32) >> 1L)) & 4294967295L;
        m.store(v[5], v[7], 4);
        v[8] = (v[0] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((Heap.s(v[9], 32) >> 1L)) & 4294967295L;
        m.store(v[8], v[10], 4);
        v[11] = (v[0] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((Heap.s(v[12], 32) >> 1L)) & 4294967295L;
        m.store(v[11], v[13], 4);
        v[14] = (v[0] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = ((Heap.s(v[15], 32) >> 1L)) & 4294967295L;
        m.store(v[14], v[16], 4);
        v[17] = (v[0] + (Heap.s(80L, 32) * 4L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = ((Heap.s(v[18], 32) >> 1L)) & 4294967295L;
        m.store(v[17], v[19], 4);
        v[20] = (v[0] + (Heap.s(96L, 32) * 4L)) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((Heap.s(v[21], 32) >> 1L)) & 4294967295L;
        m.store(v[20], v[22], 4);
        v[23] = (v[0] + (Heap.s(112L, 32) * 4L)) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = ((Heap.s(v[24], 32) >> 1L)) & 4294967295L;
        m.store(v[23], v[25], 4);
        v[26] = (v[0] + (Heap.s(128L, 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = ((Heap.s(v[27], 32) >> 1L)) & 4294967295L;
        m.store(v[26], v[28], 4);
        v[29] = (v[0] + (Heap.s(144L, 32) * 4L)) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = ((Heap.s(v[30], 32) >> 1L)) & 4294967295L;
        m.store(v[29], v[31], 4);
        v[32] = (v[0] + (Heap.s(160L, 32) * 4L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((Heap.s(v[33], 32) >> 1L)) & 4294967295L;
        m.store(v[32], v[34], 4);
        v[35] = (v[0] + (Heap.s(176L, 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = ((Heap.s(v[36], 32) >> 1L)) & 4294967295L;
        m.store(v[35], v[37], 4);
        v[38] = (v[0] + (Heap.s(192L, 32) * 4L)) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = ((Heap.s(v[39], 32) >> 1L)) & 4294967295L;
        m.store(v[38], v[40], 4);
        v[41] = (v[0] + (Heap.s(208L, 32) * 4L)) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = ((Heap.s(v[42], 32) >> 1L)) & 4294967295L;
        m.store(v[41], v[43], 4);
        v[44] = (v[0] + (Heap.s(224L, 32) * 4L)) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = ((Heap.s(v[45], 32) >> 1L)) & 4294967295L;
        m.store(v[44], v[46], 4);
        v[47] = (v[0] + (Heap.s(240L, 32) * 4L)) & 4294967295L;
        v[48] = m.load(v[47], 4);
        v[49] = ((Heap.s(v[48], 32) >> 1L)) & 4294967295L;
        m.store(v[47], v[49], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return -1;
    }
}
