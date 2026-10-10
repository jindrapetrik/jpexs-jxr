package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGBA128Float_RGBA32.
 */
public final class F0199_RGBA128Float_RGBA32 {

    private F0199_RGBA128Float_RGBA32() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[79];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGBA128Float_RGBA32");
                }
                previous = old;
                if (pc < 0) {
                    return v[78];
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
        return v[8] != 0 ? 1 : 23;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[76]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 22;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 21 ? v[74] : 0L);
        v[13] = phi13;
        v[14] = ((v[13] << 2L)) & 4294967295L;
        v[15] = (v[12] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[14] | 1L)) & 4294967295L;
        v[18] = (v[12] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = ((v[14] | 2L)) & 4294967295L;
        v[21] = (v[12] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = ((v[14] | 3L)) & 4294967295L;
        v[24] = (v[12] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = Heap.fcmp("ugt", Heap.f(v[16]), Heap.f(0L));
        return v[26] != 0 ? 4 : 8;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[27] = Heap.fcmp("ugt", Heap.f(v[16]), Heap.f(994913820L));
        return v[27] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[28] = Heap.fb((Heap.f(v[16]) * Heap.f(1132396544L)));
        v[29] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[28], 1095678034L, 1056964608L});
        v[30] = ((long) Heap.f(v[29])) & 255L;
        return 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[31] = Heap.fcmp("olt", Heap.f(v[16]), Heap.f(1065353216L));
        return v[31] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[32] = Heap.db(Heap.f(v[16]));
        v[33] = LibC.call(m, "pow", new long[]{v[32], 4601177619296856747L});
        v[34] = Heap.fb(Heap.d(v[33]));
        v[35] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[34], 1065814589L, 3177269166L});
        v[36] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[35], 1132396544L, 1056964608L});
        v[37] = ((long) Heap.f(v[36])) & 255L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi38 = (previous == 5 ? v[30] : (previous == 7 ? v[37] : (previous == 3 ? 0L : 255L)));
        v[38] = phi38;
        v[39] = (v[12] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        m.store(v[39], v[38], 1);
        v[40] = Heap.fcmp("ugt", Heap.f(v[19]), Heap.f(0L));
        return v[40] != 0 ? 9 : 13;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[41] = Heap.fcmp("ugt", Heap.f(v[19]), Heap.f(994913820L));
        return v[41] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[42] = Heap.fb((Heap.f(v[19]) * Heap.f(1132396544L)));
        v[43] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[42], 1095678034L, 1056964608L});
        v[44] = ((long) Heap.f(v[43])) & 255L;
        return 13;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[45] = Heap.fcmp("olt", Heap.f(v[19]), Heap.f(1065353216L));
        return v[45] != 0 ? 12 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[46] = Heap.db(Heap.f(v[19]));
        v[47] = LibC.call(m, "pow", new long[]{v[46], 4601177619296856747L});
        v[48] = Heap.fb(Heap.d(v[47]));
        v[49] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[48], 1065814589L, 3177269166L});
        v[50] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[49], 1132396544L, 1056964608L});
        v[51] = ((long) Heap.f(v[50])) & 255L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi52 = (previous == 10 ? v[44] : (previous == 12 ? v[51] : (previous == 8 ? 0L : 255L)));
        v[52] = phi52;
        v[53] = (v[12] + (Heap.s(v[17], 32) * 1L)) & 4294967295L;
        m.store(v[53], v[52], 1);
        v[54] = Heap.fcmp("ugt", Heap.f(v[22]), Heap.f(0L));
        return v[54] != 0 ? 14 : 18;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[55] = Heap.fcmp("ugt", Heap.f(v[22]), Heap.f(994913820L));
        return v[55] != 0 ? 16 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[56] = Heap.fb((Heap.f(v[22]) * Heap.f(1132396544L)));
        v[57] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[56], 1095678034L, 1056964608L});
        v[58] = ((long) Heap.f(v[57])) & 255L;
        return 18;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[59] = Heap.fcmp("olt", Heap.f(v[22]), Heap.f(1065353216L));
        return v[59] != 0 ? 17 : 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[60] = Heap.db(Heap.f(v[22]));
        v[61] = LibC.call(m, "pow", new long[]{v[60], 4601177619296856747L});
        v[62] = Heap.fb(Heap.d(v[61]));
        v[63] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[62], 1065814589L, 3177269166L});
        v[64] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[63], 1132396544L, 1056964608L});
        v[65] = ((long) Heap.f(v[64])) & 255L;
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi66 = (previous == 15 ? v[58] : (previous == 17 ? v[65] : (previous == 13 ? 0L : 255L)));
        v[66] = phi66;
        v[67] = (v[12] + (Heap.s(v[20], 32) * 1L)) & 4294967295L;
        m.store(v[67], v[66], 1);
        v[68] = Heap.fcmp("ugt", Heap.f(v[25]), Heap.f(0L));
        return v[68] != 0 ? 19 : 21;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[69] = Heap.fcmp("olt", Heap.f(v[25]), Heap.f(1065353216L));
        return v[69] != 0 ? 20 : 21;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[70] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[25], 1132396544L, 1056964608L});
        v[71] = ((long) Heap.f(v[70])) & 255L;
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi72 = (previous == 20 ? v[71] : (previous == 18 ? 0L : 255L));
        v[72] = phi72;
        v[73] = (v[12] + (Heap.s(v[23], 32) * 1L)) & 4294967295L;
        m.store(v[73], v[72], 1);
        v[74] = ((v[13] + 1L)) & 4294967295L;
        v[75] = v[74] == v[7] ? 1L : 0L;
        return v[75] != 0 ? 22 : 3;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[76] = ((v[10] + 1L)) & 4294967295L;
        v[77] = v[76] == v[5] ? 1L : 0L;
        return v[77] != 0 ? 23 : 2;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[78] = 0L;
        return -1;
    }
}
