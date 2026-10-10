package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: initPostProc.
 */
public final class F0265_initPostProc {

    private F0265_initPostProc() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[96];
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
                    default:
                        throw new IllegalStateException("Invalid block in initPostProc");
                }
                previous = old;
                if (pc < 0) {
                    return v[95];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((v[1] + 4246142978L)) & 4294967295L;
        v[4] = v[3] < 4246142976L ? 1L : 0L;
        v[5] = ((v[1] * 88L)) & 4294967295L;
        v[6] = ((v[5] + 176L)) & 4294967295L;
        v[7] = v[2] == 0L ? 1L : 0L;
        v[8] = ((v[7] | v[4])) & 1L;
        return v[8] != 0 ? 4 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi9 = (previous == 3 ? v[88] : 0L);
        v[9] = phi9;
        v[10] = LibC.call(m, "malloc", new long[]{v[6]});
        v[11] = (v[0] + (Heap.s(v[9], 32) * 8L) + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        m.store(v[11], v[10], 4);
        v[12] = v[10] == 0L ? 1L : 0L;
        return v[12] != 0 ? 5 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = (v[10] + (Heap.s(1L, 32) * 88L)) & 4294967295L;
        m.store(v[11], v[13], 4);
        v[14] = (v[10] + (Heap.s(0L, 32) * 88L) + 4L) & 4294967295L;
        m.store(v[14], 3L, 1);
        v[15] = (v[10] + (Heap.s(0L, 32) * 88L) + 72L) & 4294967295L;
        m.store(v[15], 3L, 1);
        v[16] = m.load(v[11], 4);
        v[17] = (v[16] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(0L, 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[17], 3L, 1);
        v[18] = m.load(v[11], 4);
        v[19] = (v[18] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(0L, 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[19], 3L, 1);
        v[20] = m.load(v[11], 4);
        v[21] = (v[20] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(0L, 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[21], 3L, 1);
        v[22] = m.load(v[11], 4);
        v[23] = (v[22] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(1L, 32) * 4L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        m.store(v[23], 3L, 1);
        v[24] = m.load(v[11], 4);
        v[25] = (v[24] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(1L, 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[25], 3L, 1);
        v[26] = m.load(v[11], 4);
        v[27] = (v[26] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(1L, 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[27], 3L, 1);
        v[28] = m.load(v[11], 4);
        v[29] = (v[28] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(1L, 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[29], 3L, 1);
        v[30] = m.load(v[11], 4);
        v[31] = (v[30] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(2L, 32) * 4L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        m.store(v[31], 3L, 1);
        v[32] = m.load(v[11], 4);
        v[33] = (v[32] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(2L, 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[33], 3L, 1);
        v[34] = m.load(v[11], 4);
        v[35] = (v[34] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(2L, 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[35], 3L, 1);
        v[36] = m.load(v[11], 4);
        v[37] = (v[36] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(2L, 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[37], 3L, 1);
        v[38] = m.load(v[11], 4);
        v[39] = (v[38] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(3L, 32) * 4L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        m.store(v[39], 3L, 1);
        v[40] = m.load(v[11], 4);
        v[41] = (v[40] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(3L, 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[41], 3L, 1);
        v[42] = m.load(v[11], 4);
        v[43] = (v[42] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(3L, 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[43], 3L, 1);
        v[44] = m.load(v[11], 4);
        v[45] = (v[44] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(3L, 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[45], 3L, 1);
        v[46] = m.load(v[11], 4);
        v[47] = (v[46] + (Heap.s(v[1], 32) * 88L)) & 4294967295L;
        v[48] = (v[46] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[47], v[48], 88L, 0L});
        v[49] = LibC.call(m, "malloc", new long[]{v[6]});
        v[50] = (v[0] + (Heap.s(v[9], 32) * 8L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[50], v[49], 4);
        v[51] = v[49] == 0L ? 1L : 0L;
        return v[51] != 0 ? 5 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[52] = (v[49] + (Heap.s(1L, 32) * 88L)) & 4294967295L;
        m.store(v[50], v[52], 4);
        v[53] = (v[49] + (Heap.s(0L, 32) * 88L) + 4L) & 4294967295L;
        m.store(v[53], 3L, 1);
        v[54] = (v[49] + (Heap.s(0L, 32) * 88L) + 72L) & 4294967295L;
        m.store(v[54], 3L, 1);
        v[55] = m.load(v[50], 4);
        v[56] = (v[55] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(0L, 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[56], 3L, 1);
        v[57] = m.load(v[50], 4);
        v[58] = (v[57] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(0L, 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[58], 3L, 1);
        v[59] = m.load(v[50], 4);
        v[60] = (v[59] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(0L, 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[60], 3L, 1);
        v[61] = m.load(v[50], 4);
        v[62] = (v[61] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(1L, 32) * 4L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        m.store(v[62], 3L, 1);
        v[63] = m.load(v[50], 4);
        v[64] = (v[63] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(1L, 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[64], 3L, 1);
        v[65] = m.load(v[50], 4);
        v[66] = (v[65] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(1L, 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[66], 3L, 1);
        v[67] = m.load(v[50], 4);
        v[68] = (v[67] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(1L, 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[68], 3L, 1);
        v[69] = m.load(v[50], 4);
        v[70] = (v[69] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(2L, 32) * 4L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        m.store(v[70], 3L, 1);
        v[71] = m.load(v[50], 4);
        v[72] = (v[71] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(2L, 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[72], 3L, 1);
        v[73] = m.load(v[50], 4);
        v[74] = (v[73] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(2L, 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[74], 3L, 1);
        v[75] = m.load(v[50], 4);
        v[76] = (v[75] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(2L, 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[76], 3L, 1);
        v[77] = m.load(v[50], 4);
        v[78] = (v[77] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(3L, 32) * 4L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        m.store(v[78], 3L, 1);
        v[79] = m.load(v[50], 4);
        v[80] = (v[79] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(3L, 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[80], 3L, 1);
        v[81] = m.load(v[50], 4);
        v[82] = (v[81] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(3L, 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[82], 3L, 1);
        v[83] = m.load(v[50], 4);
        v[84] = (v[83] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(3L, 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[84], 3L, 1);
        v[85] = m.load(v[50], 4);
        v[86] = (v[85] + (Heap.s(v[1], 32) * 88L)) & 4294967295L;
        v[87] = (v[85] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[86], v[87], 88L, 0L});
        v[88] = ((v[9] + 1L)) & 4294967295L;
        v[89] = v[88] >= v[2] ? 1L : 0L;
        v[90] = ((v[89] | v[4])) & 1L;
        return v[90] != 0 ? 4 : 1;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi91 = (previous == 0 ? v[7] : v[89]);
        v[91] = phi91;
        v[92] = ((v[91] ^ 1L)) & 1L;
        v[93] = (Heap.s(v[92], 1)) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi94 = (previous == 4 ? v[93] : (previous == 2 ? 4294967295L : 4294967295L));
        v[94] = phi94;
        v[95] = v[94];
        return -1;
    }
}
