package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB96Float_RGB96Fixed.
 */
public final class F0152_RGB96Float_RGB96Fixed {

    private F0152_RGB96Float_RGB96Fixed() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[41];
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
                        throw new IllegalStateException("Invalid block in RGB96Float_RGB96Fixed");
                }
                previous = old;
                if (pc < 0) {
                    return v[40];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[6] != 0 ? 1 : 8;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] * 3L)) & 4294967295L;
        v[10] = Heap.s(v[8], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[11] = LibC.call(m, "llvm.smax.i32", new long[]{v[9], 1L});
        v[12] = ((v[11] & 1L)) & 4294967295L;
        v[13] = Heap.s(v[9], 32) < Heap.s(2L, 32) ? 1L : 0L;
        v[14] = ((v[11] & 2147483646L)) & 4294967295L;
        v[15] = v[12] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi16 = (previous == 1 ? 0L : v[38]);
        v[16] = phi16;
        v[17] = ((v[16] * v[3])) & 4294967295L;
        v[18] = (v[2] + (Heap.s(v[17], 32) * 1L)) & 4294967295L;
        return v[10] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[13] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi19 = (previous == 4 ? v[30] : 0L);
        long phi20 = (previous == 4 ? v[31] : 0L);
        v[19] = phi19;
        v[20] = phi20;
        v[21] = (v[18] + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[22], 1266679808L, 1056964608L});
        v[24] = ((long) Heap.f(v[23])) & 4294967295L;
        m.store(v[21], v[24], 4);
        v[25] = ((v[19] | 1L)) & 4294967295L;
        v[26] = (v[18] + (Heap.s(v[25], 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[27], 1266679808L, 1056964608L});
        v[29] = ((long) Heap.f(v[28])) & 4294967295L;
        m.store(v[26], v[29], 4);
        v[30] = ((v[19] + 2L)) & 4294967295L;
        v[31] = ((v[20] + 2L)) & 4294967295L;
        v[32] = v[31] == v[14] ? 1L : 0L;
        return v[32] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi33 = (previous == 3 ? 0L : v[30]);
        v[33] = phi33;
        return v[15] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[34] = (v[18] + (Heap.s(v[33], 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[35], 1266679808L, 1056964608L});
        v[37] = ((long) Heap.f(v[36])) & 4294967295L;
        m.store(v[34], v[37], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[38] = ((v[16] + 1L)) & 4294967295L;
        v[39] = v[38] == v[5] ? 1L : 0L;
        return v[39] != 0 ? 8 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[40] = 0L;
        return -1;
    }
}
