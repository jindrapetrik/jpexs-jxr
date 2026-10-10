package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ResetCodingContextDec.
 */
public final class F0021_ResetCodingContextDec {

    private F0021_ResetCodingContextDec() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[73];
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
                        throw new IllegalStateException("Invalid block in ResetCodingContextDec");
                }
                previous = old;
                if (pc < 0) {
                    return v[72];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 592L) + 16L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[2] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[3], 0L, 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 592L) + 20L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[5] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[6], 0L, 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[8] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[9], 0L, 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[11] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[12], 0L, 4);
        v[13] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[14] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[15], 0L, 4);
        v[16] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[17] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[18], 0L, 4);
        v[19] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = (v[20] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[21], 0L, 4);
        v[22] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = (v[23] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[24], 0L, 4);
        v[25] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[26] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[27], 0L, 4);
        v[28] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = (v[29] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[30], 0L, 4);
        v[31] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = (v[32] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[33], 0L, 4);
        v[34] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = (v[35] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[36], 0L, 4);
        v[37] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = (v[38] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[39], 0L, 4);
        v[40] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = (v[41] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[42], 0L, 4);
        v[43] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = (v[44] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[45], 0L, 4);
        v[46] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = (v[47] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[48], 0L, 4);
        v[49] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = (v[50] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[51], 0L, 4);
        v[52] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = (v[53] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[54], 0L, 4);
        v[55] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = (v[56] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[57], 0L, 4);
        v[58] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(17L, 32) * 4L)) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = (v[59] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[60], 0L, 4);
        v[61] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(18L, 32) * 4L)) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = (v[62] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[63], 0L, 4);
        v[64] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(19L, 32) * 4L)) & 4294967295L;
        v[65] = m.load(v[64], 4);
        v[66] = (v[65] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[66], 0L, 4);
        v[67] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(20L, 32) * 4L)) & 4294967295L;
        v[68] = m.load(v[67], 4);
        v[69] = (v[68] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[69], 0L, 4);
        v[70] = F0280_AdaptLowpassDec.run(m, v[0]);
        v[71] = F0283_AdaptHighpassDec.run(m, v[0]);
        F0029_InitZigzagScan.run(m, v[0]);
        F0028_ResetCodingContext.run(m, v[0]);
        return -1;
    }
}
