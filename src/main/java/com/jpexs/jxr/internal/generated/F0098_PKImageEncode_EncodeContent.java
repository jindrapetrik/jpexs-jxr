package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_EncodeContent.
 */
public final class F0098_PKImageEncode_EncodeContent {

    private F0098_PKImageEncode_EncodeContent() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[104];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                    case 8:
                        pc = b8(m, v, previous);
                        break;
                    case 9:
                        pc = b9(m, v, previous);
                        break;
                    case 10:
                        pc = b10(m, v, previous);
                        break;
                    case 11:
                        pc = b11(m, v, previous);
                        break;
                    case 12:
                        pc = b12(m, v, previous);
                        break;
                    case 13:
                        pc = b13(m, v, previous);
                        break;
                    case 14:
                        pc = b14(m, v, previous);
                        break;
                    case 15:
                        pc = b15(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_EncodeContent");
                }
                previous = old;
                if (pc < 0) {
                    return v[103];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = m.stack(24L * 1L, 4);
        v[6] = m.stack(4L * 1L, 4);
        m.store(v[6], 0L, 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[8] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = Dispatch.call(m, v[10], new long[]{v[8], v[6]});
        v[12] = Heap.s(v[11], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[12] != 0 ? 15 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[13] = m.load(v[6], 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65964L) & 4294967295L;
        m.store(v[14], v[13], 4);
        v[15] = (v[1] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = (v[1] + (Heap.s(8L, 32) * 1L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[1] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = (v[1] + (Heap.s(16L, 32) * 1L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[1] + (Heap.s(20L, 32) * 1L)) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L) & 4294967295L;
        m.store(v[27], v[26], 4);
        v[28] = (v[0] + (Heap.s(0L, 32) * 66276L) + 88L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 4L) & 4294967295L;
        m.store(v[30], v[29], 4);
        v[31] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 12L) & 4294967295L;
        m.store(v[31], v[20], 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 16L) & 4294967295L;
        m.store(v[32], v[22], 4);
        v[33] = ((v[24] >>> 6L)) & 4294967295L;
        v[34] = ((v[33] & 1L)) & 4294967295L;
        v[35] = ((v[34] ^ 1L)) & 4294967295L;
        v[36] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 24L) & 4294967295L;
        m.store(v[36], v[35], 4);
        v[37] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 8L) & 4294967295L;
        m.store(v[37], v[18], 4);
        v[38] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65980L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 60L) & 4294967295L;
        m.store(v[40], v[39], 4);
        v[41] = (v[3]) & 4294967295L;
        v[42] = ((v[41] & 127L)) & 4294967295L;
        v[43] = v[42] == 0L ? 1L : 0L;
        return v[43] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[44] = ((v[26] | v[2])) & 4294967295L;
        v[45] = ((v[44] & 15L)) & 4294967295L;
        v[46] = ((v[4] & 127L)) & 4294967295L;
        v[47] = ((v[45] | v[46])) & 4294967295L;
        v[48] = v[47] == 0L ? 1L : 0L;
        return v[48] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[49] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 68L) & 4294967295L;
        m.store(v[49], 1L, 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[50] = v[18] != 6L ? 1L : 0L;
        v[51] = ((v[24] & 16L)) & 4294967295L;
        v[52] = v[51] != 0L ? 1L : 0L;
        v[53] = v[50] != 0 ? 1L : v[52];
        v[54] = (Heap.s(v[53], 1)) & 4294967295L;
        v[55] = ((v[16] + v[54])) & 4294967295L;
        v[56] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32L) & 4294967295L;
        m.store(v[56], v[55], 4);
        v[57] = (v[0] + (Heap.s(0L, 32) * 66276L) + 92L) & 4294967295L;
        m.store(v[57], 0L, 4);
        v[58] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L) & 4294967295L;
        v[59] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32856L) & 4294967295L;
        m.store(v[59], 1L, 4);
        v[60] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33020L) & 4294967295L;
        v[61] = F0426_ImageStrEncInit.run(m, v[27], v[58], v[60]);
        v[62] = v[61] == 0L ? 1L : 0L;
        return v[62] != 0 ? 5 : 15;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[63] = v[2] == 0L ? 1L : 0L;
        return v[63] != 0 ? 12 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[64] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32848L) & 4294967295L;
        v[65] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 16L) & 4294967295L;
        v[66] = (v[5] + (Heap.s(0L, 32) * 24L) + 4L) & 4294967295L;
        v[67] = (v[5] + (Heap.s(0L, 32) * 24L) + 8L) & 4294967295L;
        v[68] = (v[5] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[69] = ((v[71] + 16L)) & 4294967295L;
        v[70] = v[69] < v[2] ? 1L : 0L;
        return v[70] != 0 ? 8 : 12;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi71 = (previous == 6 ? 0L : v[69]);
        v[71] = phi71;
        v[72] = m.load(v[37], 4);
        v[73] = v[72] == 1L ? 1L : 0L;
        return v[73] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[74] = m.load(v[64], 4);
        v[75] = v[74] == 0L ? 1L : 0L;
        return v[75] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[76] = m.load(v[65], 4);
        v[77] = v[76] == 1L ? 1L : 0L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi78 = (previous == 8 ? 1L : (previous == 9 ? 0L : v[77]));
        v[78] = phi78;
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[68], 0L, 12L, 0L});
        v[79] = ((v[71] * v[4])) & 4294967295L;
        v[80] = (v[78]) & 4294967295L;
        v[81] = ((v[79] >>> v[80])) & 4294967295L;
        v[82] = (v[3] + (Heap.s(v[81], 32) * 1L)) & 4294967295L;
        m.store(v[5], v[82], 4);
        v[83] = ((v[2] - v[71])) & 4294967295L;
        v[84] = LibC.call(m, "llvm.umin.i32", new long[]{v[83], 16L});
        m.store(v[66], v[84], 4);
        m.store(v[67], v[4], 4);
        v[85] = m.load(v[60], 4);
        v[86] = F0432_ImageStrEncEncode.run(m, v[85], v[5]);
        v[87] = v[86] == 0L ? 1L : 0L;
        return v[87] != 0 ? 7 : 15;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[88] = m.load(v[57], 4);
        v[89] = ((v[88] + v[2])) & 4294967295L;
        m.store(v[57], v[89], 4);
        v[90] = m.load(v[60], 4);
        v[91] = F0433_ImageStrEncTerm.run(m, v[90]);
        v[92] = v[91] == 0L ? 1L : 0L;
        return v[92] != 0 ? 13 : 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[93] = m.load(v[7], 4);
        v[94] = (v[93] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = Dispatch.call(m, v[95], new long[]{v[93], v[6]});
        v[97] = Heap.s(v[96], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[97] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[98] = m.load(v[6], 4);
        v[99] = m.load(v[14], 4);
        v[100] = ((v[98] - v[99])) & 4294967295L;
        v[101] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65968L) & 4294967295L;
        m.store(v[101], v[100], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi102 = (previous == 14 ? v[96] : (previous == 0 ? v[11] : (previous == 4 ? 4294967295L : (previous == 12 ? 4294967295L : (previous == 13 ? v[96] : 4294967295L)))));
        v[102] = phi102;
        v[103] = v[102];
        return -1;
    }
}
