package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray32Fixed_Gray8.
 */
public final class F0201_Gray32Fixed_Gray8 {

    private F0201_Gray32Fixed_Gray8() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[37];
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
                    default:
                        throw new IllegalStateException("Invalid block in Gray32Fixed_Gray8");
                }
                previous = old;
                if (pc < 0) {
                    return v[36];
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
        return v[8] != 0 ? 1 : 10;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[34]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 9;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 8 ? v[32] : 0L);
        v[13] = phi13;
        v[14] = (v[12] + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = Heap.fb(Heap.s(v[15], 32));
        v[17] = Heap.fb((Heap.f(v[16]) * Heap.f(864026624L)));
        v[18] = Heap.fcmp("ugt", Heap.f(v[17]), Heap.f(0L));
        return v[18] != 0 ? 4 : 8;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[19] = Heap.fcmp("ugt", Heap.f(v[17]), Heap.f(994913820L));
        return v[19] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[20] = Heap.fb((Heap.f(v[17]) * Heap.f(1132396544L)));
        v[21] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[20], 1095678034L, 1056964608L});
        v[22] = ((long) Heap.f(v[21])) & 255L;
        return 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[23] = Heap.fcmp("olt", Heap.f(v[17]), Heap.f(1065353216L));
        return v[23] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[24] = Heap.db(Heap.f(v[17]));
        v[25] = LibC.call(m, "pow", new long[]{v[24], 4601177619296856747L});
        v[26] = Heap.fb(Heap.d(v[25]));
        v[27] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[26], 1065814589L, 3177269166L});
        v[28] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[27], 1132396544L, 1056964608L});
        v[29] = ((long) Heap.f(v[28])) & 255L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi30 = (previous == 5 ? v[22] : (previous == 7 ? v[29] : (previous == 3 ? 0L : 255L)));
        v[30] = phi30;
        v[31] = (v[12] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        m.store(v[31], v[30], 1);
        v[32] = ((v[13] + 1L)) & 4294967295L;
        v[33] = v[32] == v[7] ? 1L : 0L;
        return v[33] != 0 ? 9 : 3;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[34] = ((v[10] + 1L)) & 4294967295L;
        v[35] = v[34] == v[5] ? 1L : 0L;
        return v[35] != 0 ? 10 : 2;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[36] = 0L;
        return -1;
    }
}
