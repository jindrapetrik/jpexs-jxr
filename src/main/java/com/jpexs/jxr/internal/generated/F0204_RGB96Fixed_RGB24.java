package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB96Fixed_RGB24.
 */
public final class F0204_RGB96Fixed_RGB24 {

    private F0204_RGB96Fixed_RGB24() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[76];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB96Fixed_RGB24");
                }
                previous = old;
                if (pc < 0) {
                    return v[75];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 1 : 20;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[73]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 19;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 18 ? v[71] : 0L);
        v[13] = phi13;
        v[14] = ((v[13] * 3L)) & 4294967295L;
        v[15] = (v[12] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = Heap.fb(Heap.s(v[16], 32));
        v[18] = Heap.fb((Heap.f(v[17]) * Heap.f(864026624L)));
        v[19] = Heap.fcmp("ugt", Heap.f(v[18]), Heap.f(0L));
        return v[19] != 0 ? 4 : 8;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[20] = Heap.fcmp("ugt", Heap.f(v[18]), Heap.f(994913820L));
        return v[20] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[21] = Heap.fb((Heap.f(v[18]) * Heap.f(1132396544L)));
        v[22] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[21], 1095678034L, 1056964608L});
        v[23] = ((long) Heap.f(v[22])) & 255L;
        return 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[24] = Heap.fcmp("olt", Heap.f(v[18]), Heap.f(1065353216L));
        return v[24] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[25] = Heap.db(Heap.f(v[18]));
        v[26] = LibC.call(m, "pow", new long[]{v[25], 4601177619296856747L});
        v[27] = Heap.fb(Heap.d(v[26]));
        v[28] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[27], 1065814589L, 3177269166L});
        v[29] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[28], 1132396544L, 1056964608L});
        v[30] = ((long) Heap.f(v[29])) & 255L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi31 = (previous == 5 ? v[23] : (previous == 7 ? v[30] : (previous == 3 ? 0L : 255L)));
        v[31] = phi31;
        v[32] = (v[12] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        m.store(v[32], v[31], 1);
        v[33] = ((v[14] + 1L)) & 4294967295L;
        v[34] = (v[12] + (Heap.s(v[33], 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = Heap.fb(Heap.s(v[35], 32));
        v[37] = Heap.fb((Heap.f(v[36]) * Heap.f(864026624L)));
        v[38] = Heap.fcmp("ugt", Heap.f(v[37]), Heap.f(0L));
        return v[38] != 0 ? 9 : 13;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[39] = Heap.fcmp("ugt", Heap.f(v[37]), Heap.f(994913820L));
        return v[39] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[40] = Heap.fb((Heap.f(v[37]) * Heap.f(1132396544L)));
        v[41] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[40], 1095678034L, 1056964608L});
        v[42] = ((long) Heap.f(v[41])) & 255L;
        return 13;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[43] = Heap.fcmp("olt", Heap.f(v[37]), Heap.f(1065353216L));
        return v[43] != 0 ? 12 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[44] = Heap.db(Heap.f(v[37]));
        v[45] = LibC.call(m, "pow", new long[]{v[44], 4601177619296856747L});
        v[46] = Heap.fb(Heap.d(v[45]));
        v[47] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[46], 1065814589L, 3177269166L});
        v[48] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[47], 1132396544L, 1056964608L});
        v[49] = ((long) Heap.f(v[48])) & 255L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi50 = (previous == 10 ? v[42] : (previous == 12 ? v[49] : (previous == 8 ? 0L : 255L)));
        v[50] = phi50;
        v[51] = (v[12] + (Heap.s(v[33], 32) * 1L)) & 4294967295L;
        m.store(v[51], v[50], 1);
        v[52] = ((v[14] + 2L)) & 4294967295L;
        v[53] = (v[12] + (Heap.s(v[52], 32) * 4L)) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = Heap.fb(Heap.s(v[54], 32));
        v[56] = Heap.fb((Heap.f(v[55]) * Heap.f(864026624L)));
        v[57] = Heap.fcmp("ugt", Heap.f(v[56]), Heap.f(0L));
        return v[57] != 0 ? 14 : 18;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[58] = Heap.fcmp("ugt", Heap.f(v[56]), Heap.f(994913820L));
        return v[58] != 0 ? 16 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[59] = Heap.fb((Heap.f(v[56]) * Heap.f(1132396544L)));
        v[60] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[59], 1095678034L, 1056964608L});
        v[61] = ((long) Heap.f(v[60])) & 255L;
        return 18;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[62] = Heap.fcmp("olt", Heap.f(v[56]), Heap.f(1065353216L));
        return v[62] != 0 ? 17 : 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[63] = Heap.db(Heap.f(v[56]));
        v[64] = LibC.call(m, "pow", new long[]{v[63], 4601177619296856747L});
        v[65] = Heap.fb(Heap.d(v[64]));
        v[66] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[65], 1065814589L, 3177269166L});
        v[67] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[66], 1132396544L, 1056964608L});
        v[68] = ((long) Heap.f(v[67])) & 255L;
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi69 = (previous == 15 ? v[61] : (previous == 17 ? v[68] : (previous == 13 ? 0L : 255L)));
        v[69] = phi69;
        v[70] = (v[12] + (Heap.s(v[52], 32) * 1L)) & 4294967295L;
        m.store(v[70], v[69], 1);
        v[71] = ((v[13] + 1L)) & 4294967295L;
        v[72] = v[71] == v[7] ? 1L : 0L;
        return v[72] != 0 ? 19 : 3;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[73] = ((v[10] + 1L)) & 4294967295L;
        v[74] = v[73] == v[5] ? 1L : 0L;
        return v[74] != 0 ? 20 : 2;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[75] = 0L;
        return -1;
    }
}
