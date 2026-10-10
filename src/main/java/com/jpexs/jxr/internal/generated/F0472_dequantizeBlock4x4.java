package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: dequantizeBlock4x4.
 */
public final class F0472_dequantizeBlock4x4 {

    private F0472_dequantizeBlock4x4() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[95];
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
                        throw new IllegalStateException("Invalid block in dequantizeBlock4x4");
                }
                previous = old;
                if (pc < 0) {
                    return v[94];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((v[5] * v[3])) & 4294967295L;
        v[7] = (v[2] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[0] + (Heap.s(v[8], 32) * 4L)) & 4294967295L;
        m.store(v[9], v[6], 4);
        v[10] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = ((v[11] * v[3])) & 4294967295L;
        v[13] = (v[2] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[0] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        m.store(v[15], v[12], 4);
        v[16] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = ((v[17] * v[3])) & 4294967295L;
        v[19] = (v[2] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = (v[0] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        m.store(v[21], v[18], 4);
        v[22] = (v[1] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = ((v[23] * v[3])) & 4294967295L;
        v[25] = (v[2] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[0] + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        m.store(v[27], v[24], 4);
        v[28] = (v[1] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = ((v[29] * v[3])) & 4294967295L;
        v[31] = (v[2] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = (v[0] + (Heap.s(v[32], 32) * 4L)) & 4294967295L;
        m.store(v[33], v[30], 4);
        v[34] = (v[1] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = ((v[35] * v[3])) & 4294967295L;
        v[37] = (v[2] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = (v[0] + (Heap.s(v[38], 32) * 4L)) & 4294967295L;
        m.store(v[39], v[36], 4);
        v[40] = (v[1] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = ((v[41] * v[3])) & 4294967295L;
        v[43] = (v[2] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = (v[0] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        m.store(v[45], v[42], 4);
        v[46] = (v[1] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = ((v[47] * v[3])) & 4294967295L;
        v[49] = (v[2] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = (v[0] + (Heap.s(v[50], 32) * 4L)) & 4294967295L;
        m.store(v[51], v[48], 4);
        v[52] = (v[1] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = ((v[53] * v[3])) & 4294967295L;
        v[55] = (v[2] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = (v[0] + (Heap.s(v[56], 32) * 4L)) & 4294967295L;
        m.store(v[57], v[54], 4);
        v[58] = (v[1] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = ((v[59] * v[3])) & 4294967295L;
        v[61] = (v[2] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = (v[0] + (Heap.s(v[62], 32) * 4L)) & 4294967295L;
        m.store(v[63], v[60], 4);
        v[64] = (v[1] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[65] = m.load(v[64], 4);
        v[66] = ((v[65] * v[3])) & 4294967295L;
        v[67] = (v[2] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[68] = m.load(v[67], 4);
        v[69] = (v[0] + (Heap.s(v[68], 32) * 4L)) & 4294967295L;
        m.store(v[69], v[66], 4);
        v[70] = (v[1] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = ((v[71] * v[3])) & 4294967295L;
        v[73] = (v[2] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[74] = m.load(v[73], 4);
        v[75] = (v[0] + (Heap.s(v[74], 32) * 4L)) & 4294967295L;
        m.store(v[75], v[72], 4);
        v[76] = (v[1] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = ((v[77] * v[3])) & 4294967295L;
        v[79] = (v[2] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[80] = m.load(v[79], 4);
        v[81] = (v[0] + (Heap.s(v[80], 32) * 4L)) & 4294967295L;
        m.store(v[81], v[78], 4);
        v[82] = (v[1] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = ((v[83] * v[3])) & 4294967295L;
        v[85] = (v[2] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[86] = m.load(v[85], 4);
        v[87] = (v[0] + (Heap.s(v[86], 32) * 4L)) & 4294967295L;
        m.store(v[87], v[84], 4);
        v[88] = (v[1] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[89] = m.load(v[88], 4);
        v[90] = ((v[89] * v[3])) & 4294967295L;
        v[91] = (v[2] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[92] = m.load(v[91], 4);
        v[93] = (v[0] + (Heap.s(v[92], 32) * 4L)) & 4294967295L;
        m.store(v[93], v[90], 4);
        return -1;
    }
}
