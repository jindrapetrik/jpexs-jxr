package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transformDCBlock.
 */
public final class F0252_transformDCBlock {

    private F0252_transformDCBlock() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[106];
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    case 3:
                        pc = b3(m, v, previous);
                        break;
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    case 5:
                        pc = b5(m, v, previous);
                        break;
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    case 7:
                        pc = b7(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in transformDCBlock");
                }
                previous = old;
                if (pc < 0) {
                    return v[105];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((197L >>> v[2])) & 4294967295L;
        v[4] = ((v[3] & 1L)) & 4294967295L;
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = ((0L - v[7])) & 4294967295L;
        m.store(v[6], v[8], 4);
        v[9] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((0L - v[10])) & 4294967295L;
        m.store(v[9], v[11], 4);
        v[12] = (v[0] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((0L - v[13])) & 4294967295L;
        m.store(v[12], v[14], 4);
        v[15] = (v[0] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((0L - v[16])) & 4294967295L;
        m.store(v[15], v[17], 4);
        v[18] = (v[0] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = ((0L - v[19])) & 4294967295L;
        m.store(v[18], v[20], 4);
        v[21] = (v[0] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = ((0L - v[22])) & 4294967295L;
        m.store(v[21], v[23], 4);
        v[24] = (v[0] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = ((0L - v[25])) & 4294967295L;
        m.store(v[24], v[26], 4);
        v[27] = (v[0] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((0L - v[28])) & 4294967295L;
        m.store(v[27], v[29], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[30] = ((83L >>> v[2])) & 4294967295L;
        v[31] = ((v[30] & 1L)) & 4294967295L;
        v[32] = v[31] == 0L ? 1L : 0L;
        return v[32] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[33] = (v[0] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = ((0L - v[34])) & 4294967295L;
        m.store(v[33], v[35], 4);
        v[36] = (v[0] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = ((0L - v[37])) & 4294967295L;
        m.store(v[36], v[38], 4);
        v[39] = (v[0] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = ((0L - v[40])) & 4294967295L;
        m.store(v[39], v[41], 4);
        v[42] = (v[0] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = ((0L - v[43])) & 4294967295L;
        m.store(v[42], v[44], 4);
        v[45] = (v[0] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = ((0L - v[46])) & 4294967295L;
        m.store(v[45], v[47], 4);
        v[48] = (v[0] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = ((0L - v[49])) & 4294967295L;
        m.store(v[48], v[50], 4);
        v[51] = (v[0] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = ((0L - v[52])) & 4294967295L;
        m.store(v[51], v[53], 4);
        v[54] = (v[0] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = ((0L - v[55])) & 4294967295L;
        m.store(v[54], v[56], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[57] = v[2] < 4L ? 1L : 0L;
        return v[57] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[58] = m.load(v[0], 4);
        m.store(v[1], v[58], 4);
        v[59] = (v[0] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = (v[1] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[61], v[60], 4);
        v[62] = (v[0] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[64], v[63], 4);
        v[65] = (v[0] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[67], v[66], 4);
        v[68] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = (v[1] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[70], v[69], 4);
        v[71] = (v[0] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = (v[1] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        m.store(v[73], v[72], 4);
        v[74] = (v[0] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[75] = m.load(v[74], 4);
        v[76] = (v[1] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        m.store(v[76], v[75], 4);
        v[77] = (v[0] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[78] = m.load(v[77], 4);
        v[79] = (v[1] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        m.store(v[79], v[78], 4);
        v[80] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = (v[1] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        m.store(v[82], v[81], 4);
        v[83] = (v[0] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = (v[1] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        m.store(v[85], v[84], 4);
        v[86] = (v[0] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[87] = m.load(v[86], 4);
        v[88] = (v[1] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        m.store(v[88], v[87], 4);
        v[89] = (v[0] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[90] = m.load(v[89], 4);
        v[91] = (v[1] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        m.store(v[91], v[90], 4);
        v[92] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = (v[1] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        m.store(v[94], v[93], 4);
        v[95] = (v[0] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[96] = m.load(v[95], 4);
        v[97] = (v[1] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        m.store(v[97], v[96], 4);
        v[98] = (v[0] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[99] = m.load(v[98], 4);
        v[100] = (v[1] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        m.store(v[100], v[99], 4);
        v[101] = (v[0] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[102] = m.load(v[101], 4);
        v[103] = (v[1] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        m.store(v[103], v[102], 4);
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[104] = LibC.call(m, "memcpy", new long[]{v[1], v[0], 64L});
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        return -1;
    }
}
