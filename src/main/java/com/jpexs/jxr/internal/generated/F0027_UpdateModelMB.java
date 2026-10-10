package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: UpdateModelMB.
 */
public final class F0027_UpdateModelMB {

    private F0027_UpdateModelMB() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[83];
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
                    case 22:
                        pc = b22(m, v, previous);
                        break;
                    case 23:
                        pc = b23(m, v, previous);
                        break;
                    case 24:
                        pc = b24(m, v, previous);
                        break;
                    case 25:
                        pc = b25(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in UpdateModelMB");
                }
                previous = old;
                if (pc < 0) {
                    return v[82];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[3] + (Heap.s(0L, 32) * 20L) + 16L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((v[5] + 4294967295L)) & 4294967295L;
        v[7] = (4032L + (Heap.s(0L, 32) * 12L) + (Heap.s(v[6], 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = m.load(v[2], 4);
        v[10] = ((v[9] * v[8])) & 4294967295L;
        m.store(v[2], v[10], 4);
        v[11] = m.load(v[4], 4);
        switch ((int) v[0]) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = ((v[11] + 4294967295L)) & 4294967295L;
        v[13] = (4240L + (Heap.s(0L, 32) * 24L) + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[2] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[16] * v[14])) & 4294967295L;
        m.store(v[15], v[17], 4);
        return 5;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[18] = ((v[11] + 2L)) & 4294967295L;
        v[19] = (4240L + (Heap.s(0L, 32) * 24L) + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = (v[2] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = ((v[22] * v[20])) & 4294967295L;
        m.store(v[21], v[23], 4);
        return 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[24] = ((v[11] + 4294967295L)) & 4294967295L;
        v[25] = ((v[1] + 4294967295L)) & 4294967295L;
        v[26] = (4048L + (Heap.s(0L, 32) * 192L) + (Heap.s(v[24], 32) * 64L) + (Heap.s(v[25], 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = (v[2] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = ((v[29] * v[27])) & 4294967295L;
        m.store(v[28], v[30], 4);
        v[31] = m.load(v[4], 4);
        v[32] = v[31] == 3L ? 1L : 0L;
        return v[32] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[33] = ((Heap.s(v[30], 32) >> 4L)) & 4294967295L;
        m.store(v[28], v[33], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[34] = v[0] == 0L ? 1L : 0L;
        v[35] = m.load(v[3], 4);
        v[36] = ((v[10] + 4294967226L)) & 4294967295L;
        v[37] = ((Heap.s(v[36], 32) >> 2L)) & 4294967295L;
        v[38] = Heap.s(v[37], 32) < Heap.s(4294967289L, 32) ? 1L : 0L;
        return v[38] != 0 ? 16 : 19;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[39] = (v[2] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = (v[3] + (Heap.s(0L, 32) * 8L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = ((v[40] + 4294967226L)) & 4294967295L;
        v[44] = ((Heap.s(v[43], 32) >> 2L)) & 4294967295L;
        v[45] = Heap.s(v[44], 32) < Heap.s(4294967289L, 32) ? 1L : 0L;
        return v[45] != 0 ? 12 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[46] = Heap.s(v[44], 32) > Heap.s(7L, 32) ? 1L : 0L;
        return v[46] != 0 ? 8 : 15;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[47] = LibC.call(m, "llvm.smin.i32", new long[]{v[44], 19L});
        v[48] = ((v[42] + 4294967292L)) & 4294967295L;
        v[49] = ((v[48] + v[47])) & 4294967295L;
        v[50] = Heap.s(v[49], 32) > Heap.s(8L, 32) ? 1L : 0L;
        return v[50] != 0 ? 9 : 15;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[51] = (v[3] + (Heap.s(0L, 32) * 20L) + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = Heap.s(v[52], 32) > Heap.s(14L, 32) ? 1L : 0L;
        return v[53] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[54] = ((v[52] + 1L)) & 4294967295L;
        m.store(v[51], v[54], 4);
        return 15;
    }

    private static int b11(Heap m, long[] v, int previous) {
        m.store(v[51], 15L, 4);
        return 15;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[55] = LibC.call(m, "llvm.smax.i32", new long[]{v[44], 4294967276L});
        v[56] = ((v[42] + 4L)) & 4294967295L;
        v[57] = ((v[56] + v[55])) & 4294967295L;
        v[58] = Heap.s(v[57], 32) < Heap.s(4294967288L, 32) ? 1L : 0L;
        return v[58] != 0 ? 13 : 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[59] = (v[3] + (Heap.s(0L, 32) * 20L) + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = v[60] == 0L ? 1L : 0L;
        return v[61] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[62] = ((v[60] + 4294967295L)) & 4294967295L;
        m.store(v[59], v[62], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi63 = (previous == 14 ? 0L : (previous == 12 ? v[57] : (previous == 11 ? 8L : (previous == 10 ? 0L : (previous == 8 ? v[49] : (previous == 7 ? v[42] : 4294967288L))))));
        v[63] = phi63;
        m.store(v[41], v[63], 4);
        return 25;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[64] = LibC.call(m, "llvm.smax.i32", new long[]{v[37], 4294967276L});
        v[65] = ((v[35] + 4L)) & 4294967295L;
        v[66] = ((v[65] + v[64])) & 4294967295L;
        v[67] = Heap.s(v[66], 32) < Heap.s(4294967288L, 32) ? 1L : 0L;
        return v[67] != 0 ? 17 : 24;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[68] = (v[3] + (Heap.s(0L, 32) * 20L) + 8L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = v[69] == 0L ? 1L : 0L;
        return v[70] != 0 ? 24 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[71] = ((v[69] + 4294967295L)) & 4294967295L;
        m.store(v[68], v[71], 4);
        return 24;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[72] = Heap.s(v[37], 32) > Heap.s(7L, 32) ? 1L : 0L;
        return v[72] != 0 ? 20 : 24;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[73] = LibC.call(m, "llvm.smin.i32", new long[]{v[37], 19L});
        v[74] = ((v[35] + 4294967292L)) & 4294967295L;
        v[75] = ((v[74] + v[73])) & 4294967295L;
        v[76] = Heap.s(v[75], 32) > Heap.s(8L, 32) ? 1L : 0L;
        return v[76] != 0 ? 21 : 24;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[77] = (v[3] + (Heap.s(0L, 32) * 20L) + 8L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[78] = m.load(v[77], 4);
        v[79] = Heap.s(v[78], 32) > Heap.s(14L, 32) ? 1L : 0L;
        return v[79] != 0 ? 22 : 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        m.store(v[77], 15L, 4);
        return 24;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[80] = ((v[78] + 1L)) & 4294967295L;
        m.store(v[77], v[80], 4);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi81 = (previous == 18 ? 0L : (previous == 16 ? v[66] : (previous == 22 ? 8L : (previous == 23 ? 0L : (previous == 20 ? v[75] : (previous == 19 ? v[35] : 4294967288L))))));
        v[81] = phi81;
        m.store(v[3], v[81], 4);
        return v[34] != 0 ? 25 : 6;
    }

    private static int b25(Heap m, long[] v, int previous) {
        return -1;
    }
}
