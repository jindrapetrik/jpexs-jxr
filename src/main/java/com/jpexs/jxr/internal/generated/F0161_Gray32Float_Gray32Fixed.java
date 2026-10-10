package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray32Float_Gray32Fixed.
 */
public final class F0161_Gray32Float_Gray32Fixed {

    private F0161_Gray32Float_Gray32Fixed() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[39];
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
                    default:
                        throw new IllegalStateException("Invalid block in Gray32Float_Gray32Fixed");
                }
                previous = old;
                if (pc < 0) {
                    return v[38];
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
        return v[8] != 0 ? 1 : 8;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[10] = ((v[7] & 1L)) & 4294967295L;
        v[11] = v[7] == 1L ? 1L : 0L;
        v[12] = ((v[7] & 2147483646L)) & 4294967295L;
        v[13] = v[10] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi14 = (previous == 1 ? 0L : v[36]);
        v[14] = phi14;
        v[15] = ((v[14] * v[3])) & 4294967295L;
        v[16] = (v[2] + (Heap.s(v[15], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[11] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi17 = (previous == 4 ? v[28] : 0L);
        long phi18 = (previous == 4 ? v[29] : 0L);
        v[17] = phi17;
        v[18] = phi18;
        v[19] = (v[16] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[20], 1266679808L, 1056964608L});
        v[22] = ((long) Heap.f(v[21])) & 4294967295L;
        m.store(v[19], v[22], 4);
        v[23] = ((v[17] | 1L)) & 4294967295L;
        v[24] = (v[16] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[25], 1266679808L, 1056964608L});
        v[27] = ((long) Heap.f(v[26])) & 4294967295L;
        m.store(v[24], v[27], 4);
        v[28] = ((v[17] + 2L)) & 4294967295L;
        v[29] = ((v[18] + 2L)) & 4294967295L;
        v[30] = v[29] == v[12] ? 1L : 0L;
        return v[30] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi31 = (previous == 3 ? 0L : v[28]);
        v[31] = phi31;
        return v[13] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[32] = (v[16] + (Heap.s(v[31], 32) * 4L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[33], 1266679808L, 1056964608L});
        v[35] = ((long) Heap.f(v[34])) & 4294967295L;
        m.store(v[32], v[35], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[36] = ((v[14] + 1L)) & 4294967295L;
        v[37] = v[36] == v[5] ? 1L : 0L;
        return v[37] != 0 ? 8 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[38] = 0L;
        return -1;
    }
}
