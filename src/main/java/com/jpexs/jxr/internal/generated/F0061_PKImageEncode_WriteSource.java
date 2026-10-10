package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_WriteSource.
 */
public final class F0061_PKImageEncode_WriteSource {

    private F0061_PKImageEncode_WriteSource() {
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
                    case 16:
                        pc = b16(m, v, previous);
                        break;
                    case 17:
                        pc = b17(m, v, previous);
                        break;
                    case 18:
                        pc = b18(m, v, previous);
                        break;
                    case 19:
                        pc = b19(m, v, previous);
                        break;
                    case 20:
                        pc = b20(m, v, previous);
                        break;
                    case 21:
                        pc = b21(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_WriteSource");
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
        v[3] = m.stack(16L * 1L, 4);
        v[4] = m.stack(16L * 1L, 4);
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[3], 9616L, 16L, 0L});
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[4], 9616L, 16L, 0L});
        v[5] = (v[1] + (Heap.s(0L, 32) * 56L) + 12L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = Dispatch.call(m, v[6], new long[]{v[1], v[3]});
        v[8] = Heap.s(v[7], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 21 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = (v[1] + (Heap.s(0L, 32) * 56L) + 8L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = Dispatch.call(m, v[10], new long[]{v[1], v[4]});
        v[12] = Heap.s(v[11], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[12] != 0 ? 21 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = (v[0] + (Heap.s(0L, 32) * 66276L) + 68L) & 4294967295L;
        v[14] = LibC.call(m, "memcmp", new long[]{v[13], v[4], 16L});
        v[15] = v[14] == 0L ? 1L : 0L;
        return v[15] != 0 ? 3 : 21;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi16 = (previous == 4 ? v[21] : 0L);
        v[16] = phi16;
        v[17] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[16], 32) * 40L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = LibC.call(m, "memcmp", new long[]{v[3], v[18], 16L});
        v[20] = v[19] == 0L ? 1L : 0L;
        return v[20] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = ((v[16] + 1L)) & 4294967295L;
        v[22] = v[21] == 68L ? 1L : 0L;
        return v[22] != 0 ? 6 : 3;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[23] = (v[17] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = (v[17] + (Heap.s(16L, 32) * 1L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = v[24] == 0L ? 1L : 0L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi28 = (previous == 5 ? v[26] : 0L);
        long phi29 = (previous == 5 ? v[27] : 0L);
        long phi30 = (previous == 5 ? v[18] : v[3]);
        v[28] = phi28;
        v[29] = phi29;
        v[30] = phi30;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi31 = (previous == 6 ? 0L : v[36]);
        v[31] = phi31;
        v[32] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[31], 32) * 40L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = LibC.call(m, "memcmp", new long[]{v[4], v[33], 16L});
        v[35] = v[34] == 0L ? 1L : 0L;
        return v[35] != 0 ? 9 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[36] = ((v[31] + 1L)) & 4294967295L;
        v[37] = v[36] == 68L ? 1L : 0L;
        return v[37] != 0 ? 10 : 7;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[38] = (v[32] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = (v[32] + (Heap.s(16L, 32) * 1L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = v[39] == 0L ? 1L : 0L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi43 = (previous == 9 ? v[41] : 0L);
        long phi44 = (previous == 9 ? v[42] : 0L);
        long phi45 = (previous == 9 ? v[33] : v[4]);
        v[43] = phi43;
        v[44] = phi44;
        v[45] = phi45;
        return v[29] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[46] = (v[2] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = ((v[47] * v[28])) & 4294967295L;
        v[49] = ((v[48] + 7L)) & 4294967295L;
        v[50] = ((v[49] >>> 3L)) & 4294967295L;
        return 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[51] = ((v[28] + 7L)) & 4294967295L;
        v[52] = ((v[51] >>> 3L)) & 4294967295L;
        v[53] = (v[2] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = ((v[54] * v[52])) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi56 = (previous == 11 ? v[50] : v[55]);
        v[56] = phi56;
        v[57] = v[30] == 4768L ? 1L : 0L;
        v[58] = v[30] == 4784L ? 1L : 0L;
        v[59] = ((v[57] | v[58])) & 1L;
        v[60] = (v[59]) & 4294967295L;
        v[61] = ((v[56] >>> v[60])) & 4294967295L;
        return v[44] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[62] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = ((v[63] * v[43])) & 4294967295L;
        v[65] = ((v[64] + 7L)) & 4294967295L;
        v[66] = ((v[65] >>> 3L)) & 4294967295L;
        return 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[67] = ((v[43] + 7L)) & 4294967295L;
        v[68] = ((v[67] >>> 3L)) & 4294967295L;
        v[69] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[70] = m.load(v[69], 4);
        v[71] = ((v[70] * v[68])) & 4294967295L;
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi72 = (previous == 14 ? v[66] : v[71]);
        v[72] = phi72;
        v[73] = v[45] == 4768L ? 1L : 0L;
        v[74] = v[45] == 4784L ? 1L : 0L;
        v[75] = ((v[73] | v[74])) & 1L;
        v[76] = (v[75]) & 4294967295L;
        v[77] = ((v[72] >>> v[76])) & 4294967295L;
        v[78] = LibC.call(m, "llvm.umax.i32", new long[]{v[61], v[77]});
        v[79] = (v[2] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[80] = m.load(v[79], 4);
        v[81] = ((v[78] * v[80])) & 4294967295L;
        v[82] = ((v[81] + 131L)) & 4294967295L;
        v[83] = LibC.call(m, "calloc", new long[]{1L, v[82]});
        v[84] = v[83] == 0L ? 1L : 0L;
        return v[84] != 0 ? 21 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[85] = (v[83]) & 4294967295L;
        v[86] = ((v[85] & 127L)) & 4294967295L;
        v[87] = ((128L - v[86])) & 4294967295L;
        v[88] = v[86] > 124L ? 1L : 0L;
        v[89] = v[88] != 0 ? 128L : 0L;
        v[90] = (v[83] + (Heap.s(v[87], 32) * 1L)) & 4294967295L;
        v[91] = (v[90] + (Heap.s(v[89], 32) * 1L)) & 4294967295L;
        v[92] = (v[91] + (Heap.s(4294967292L, 32) * 1L)) & 4294967295L;
        m.store(v[92], v[83], 4);
        v[93] = (v[1] + (Heap.s(0L, 32) * 56L) + 24L) & 4294967295L;
        v[94] = m.load(v[93], 4);
        v[95] = Dispatch.call(m, v[94], new long[]{v[1], v[2], v[91], v[78]});
        v[96] = Heap.s(v[95], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[96] != 0 ? 19 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[97] = (v[0] + (Heap.s(0L, 32) * 66276L) + 28L) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = m.load(v[79], 4);
        v[100] = Dispatch.call(m, v[98], new long[]{v[0], v[99], v[91], v[78]});
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi101 = (previous == 17 ? v[95] : v[100]);
        v[101] = phi101;
        v[102] = v[91] == 0L ? 1L : 0L;
        return v[102] != 0 ? 21 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[103] = m.load(v[92], 4);
        LibC.call(m, "free", new long[]{v[103]});
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi104 = (previous == 19 ? v[101] : (previous == 20 ? v[101] : (previous == 2 ? 4294967190L : (previous == 1 ? v[11] : (previous == 0 ? v[7] : 4294967195L)))));
        v[104] = phi104;
        v[105] = v[104];
        return -1;
    }
}
