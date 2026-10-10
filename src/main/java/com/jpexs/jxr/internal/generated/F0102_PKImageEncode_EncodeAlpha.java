package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_EncodeAlpha.
 */
public final class F0102_PKImageEncode_EncodeAlpha {

    private F0102_PKImageEncode_EncodeAlpha() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[99];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_EncodeAlpha");
                }
                previous = old;
                if (pc < 0) {
                    return v[98];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = m.stack(24L * 1L, 4);
        v[6] = m.stack(4L * 1L, 4);
        v[7] = m.stack(1L * 1L, 1);
        m.store(v[6], 0L, 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[9] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = Dispatch.call(m, v[11], new long[]{v[9], v[6]});
        v[13] = Heap.s(v[12], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[13] != 0 ? 15 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[14] = m.load(v[6], 4);
        v[15] = ((v[14] & 1L)) & 4294967295L;
        v[16] = v[15] == 0L ? 1L : 0L;
        return v[16] != 0 ? 5 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        m.store(v[7], 0L, 1);
        v[17] = m.load(v[8], 4);
        v[18] = (v[17] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = Dispatch.call(m, v[19], new long[]{v[17], v[7], 1L});
        v[21] = Heap.s(v[20], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[21] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[22] = m.load(v[6], 4);
        v[23] = ((v[22] + 1L)) & 4294967295L;
        m.store(v[6], v[23], 4);
        return 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return 15;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi24 = (previous == 3 ? v[23] : v[14]);
        v[24] = phi24;
        v[25] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65972L) & 4294967295L;
        m.store(v[25], v[24], 4);
        v[26] = (v[1] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = (v[1] + (Heap.s(16L, 32) * 1L)) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = (v[1] + (Heap.s(20L, 32) * 1L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L) & 4294967295L;
        v[33] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[32], v[33], 72L, 0L});
        v[34] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[35] = m.load(v[34], 4);
        m.store(v[32], v[35], 4);
        v[36] = (v[0] + (Heap.s(0L, 32) * 66276L) + 88L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 4L) & 4294967295L;
        m.store(v[38], v[37], 4);
        v[39] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 12L) & 4294967295L;
        m.store(v[39], v[27], 4);
        v[40] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 16L) & 4294967295L;
        m.store(v[40], v[29], 4);
        v[41] = ((v[31] >>> 6L)) & 4294967295L;
        v[42] = ((v[41] & 1L)) & 4294967295L;
        v[43] = ((v[42] ^ 1L)) & 4294967295L;
        v[44] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 24L) & 4294967295L;
        m.store(v[44], v[43], 4);
        v[45] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65980L) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 60L) & 4294967295L;
        m.store(v[47], v[46], 4);
        v[48] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 12L) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = ((v[49] + 4294967295L)) & 4294967295L;
        v[51] = v[50] < 7L ? 1L : 0L;
        return v[51] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[52] = (8528L + (Heap.s(0L, 32) * 28L) + (Heap.s(v[50], 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 16L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = ((v[55] >>> v[53])) & 4294967295L;
        v[57] = ((v[56] + 4294967295L)) & 4294967295L;
        v[58] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 20L) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = ((v[57] + v[59])) & 4294967295L;
        m.store(v[58], v[60], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[61] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 8L) & 4294967295L;
        m.store(v[61], 0L, 4);
        v[62] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L) & 4294967295L;
        v[63] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L + 16L) & 4294967295L;
        m.store(v[63], 0L, 4);
        v[64] = (v[0] + (Heap.s(0L, 32) * 66276L) + 92L) & 4294967295L;
        m.store(v[64], 0L, 4);
        v[65] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L + 32856L) & 4294967295L;
        m.store(v[65], 1L, 4);
        v[66] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65956L) & 4294967295L;
        v[67] = F0426_ImageStrEncInit.run(m, v[32], v[62], v[66]);
        v[68] = v[67] == 0L ? 1L : 0L;
        return v[68] != 0 ? 8 : 15;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[69] = v[2] == 0L ? 1L : 0L;
        return v[69] != 0 ? 12 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[70] = (v[5] + (Heap.s(0L, 32) * 24L) + 4L) & 4294967295L;
        v[71] = (v[5] + (Heap.s(0L, 32) * 24L) + 8L) & 4294967295L;
        v[72] = (v[5] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        return 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[73] = ((v[75] + 16L)) & 4294967295L;
        v[74] = v[73] < v[2] ? 1L : 0L;
        return v[74] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi75 = (previous == 9 ? 0L : v[73]);
        v[75] = phi75;
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[72], 0L, 12L, 0L});
        v[76] = ((v[75] * v[4])) & 4294967295L;
        v[77] = (v[3] + (Heap.s(v[76], 32) * 1L)) & 4294967295L;
        m.store(v[5], v[77], 4);
        v[78] = ((v[2] - v[75])) & 4294967295L;
        v[79] = LibC.call(m, "llvm.umin.i32", new long[]{v[78], 16L});
        m.store(v[70], v[79], 4);
        m.store(v[71], v[4], 4);
        v[80] = m.load(v[66], 4);
        v[81] = F0432_ImageStrEncEncode.run(m, v[80], v[5]);
        v[82] = v[81] == 0L ? 1L : 0L;
        return v[82] != 0 ? 10 : 15;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[83] = m.load(v[64], 4);
        v[84] = ((v[83] + v[2])) & 4294967295L;
        m.store(v[64], v[84], 4);
        v[85] = m.load(v[66], 4);
        v[86] = F0433_ImageStrEncTerm.run(m, v[85]);
        v[87] = v[86] == 0L ? 1L : 0L;
        return v[87] != 0 ? 13 : 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[88] = m.load(v[8], 4);
        v[89] = (v[88] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[90] = m.load(v[89], 4);
        v[91] = Dispatch.call(m, v[90], new long[]{v[88], v[6]});
        v[92] = Heap.s(v[91], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[92] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[93] = m.load(v[6], 4);
        v[94] = m.load(v[25], 4);
        v[95] = ((v[93] - v[94])) & 4294967295L;
        v[96] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65976L) & 4294967295L;
        m.store(v[96], v[95], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi97 = (previous == 4 ? v[20] : (previous == 14 ? v[91] : (previous == 0 ? v[12] : (previous == 7 ? 4294967295L : (previous == 12 ? 4294967295L : (previous == 13 ? v[91] : 4294967295L))))));
        v[97] = phi97;
        v[98] = v[97];
        return -1;
    }
}
