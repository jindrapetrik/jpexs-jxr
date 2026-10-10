package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray16Half_Gray8.
 */
public final class F0208_Gray16Half_Gray8 {

    private F0208_Gray16Half_Gray8() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[51];
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
                    default:
                        throw new IllegalStateException("Invalid block in Gray16Half_Gray8");
                }
                previous = old;
                if (pc < 0) {
                    return v[50];
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
        return v[8] != 0 ? 1 : 13;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[48]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 12;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 11 ? v[46] : 0L);
        v[13] = phi13;
        v[14] = (v[12] + (Heap.s(v[13], 32) * 2L)) & 4294967295L;
        v[15] = m.load(v[14], 2);
        v[16] = (v[15]) & 4294967295L;
        v[17] = ((v[16] >>> 10L)) & 4294967295L;
        v[18] = ((v[17] & 31L)) & 4294967295L;
        v[19] = (Heap.s(v[15], 16)) & 4294967295L;
        v[20] = ((v[19] & 2147483648L)) & 4294967295L;
        switch ((int) v[18]) {
            case 0:
                return 6;
            case 31:
                return 4;
            default:
                return 5;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = ((v[16] << 13L)) & 4294967295L;
        v[22] = ((v[20] | v[21])) & 4294967295L;
        v[23] = ((v[22] | 2139095040L)) & 4294967295L;
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[24] = ((v[18] << 23L)) & 4294967295L;
        v[25] = ((v[24] + 939524096L)) & 4294967295L;
        v[26] = ((v[16] << 13L)) & 4294967295L;
        v[27] = ((v[26] & 8380416L)) & 4294967295L;
        v[28] = ((v[25] | v[27])) & 4294967295L;
        v[29] = ((v[28] | v[20])) & 4294967295L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi30 = (previous == 4 ? v[23] : (previous == 5 ? v[29] : v[20]));
        v[30] = phi30;
        v[31] = (v[30]) & 4294967295L;
        v[32] = Heap.fcmp("ugt", Heap.f(v[31]), Heap.f(0L));
        return v[32] != 0 ? 7 : 11;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[33] = Heap.fcmp("ugt", Heap.f(v[31]), Heap.f(994913820L));
        return v[33] != 0 ? 9 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[34] = Heap.fb((Heap.f(v[31]) * Heap.f(1132396544L)));
        v[35] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[34], 1095678034L, 1056964608L});
        v[36] = ((long) Heap.f(v[35])) & 255L;
        return 11;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[37] = Heap.fcmp("olt", Heap.f(v[31]), Heap.f(1065353216L));
        return v[37] != 0 ? 10 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[38] = Heap.db(Heap.f(v[31]));
        v[39] = LibC.call(m, "pow", new long[]{v[38], 4601177619296856747L});
        v[40] = Heap.fb(Heap.d(v[39]));
        v[41] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[40], 1065814589L, 3177269166L});
        v[42] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[41], 1132396544L, 1056964608L});
        v[43] = ((long) Heap.f(v[42])) & 255L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi44 = (previous == 8 ? v[36] : (previous == 10 ? v[43] : (previous == 6 ? 0L : 255L)));
        v[44] = phi44;
        v[45] = (v[12] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        m.store(v[45], v[44], 1);
        v[46] = ((v[13] + 1L)) & 4294967295L;
        v[47] = v[46] == v[7] ? 1L : 0L;
        return v[47] != 0 ? 12 : 3;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[48] = ((v[10] + 1L)) & 4294967295L;
        v[49] = v[48] == v[5] ? 1L : 0L;
        return v[49] != 0 ? 13 : 2;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[50] = 0L;
        return -1;
    }
}
