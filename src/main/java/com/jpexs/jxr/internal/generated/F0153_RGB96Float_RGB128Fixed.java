package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB96Float_RGB128Fixed.
 */
public final class F0153_RGB96Float_RGB128Fixed {

    private F0153_RGB96Float_RGB128Fixed() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[40];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB96Float_RGB128Fixed");
                }
                previous = old;
                if (pc < 0) {
                    return v[39];
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
        return v[8] != 0 ? 1 : 5;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = Heap.s(v[11], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[10] != 0 ? 3 : 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi11 = (previous == 1 ? v[5] : v[12]);
        v[11] = phi11;
        v[12] = ((v[11] + 4294967295L)) & 4294967295L;
        v[13] = ((v[12] * v[3])) & 4294967295L;
        v[14] = (v[2] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 4 : 2;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi15 = (previous == 4 ? v[16] : v[7]);
        v[15] = phi15;
        v[16] = ((v[15] + 4294967295L)) & 4294967295L;
        v[17] = ((v[16] * 3L)) & 4294967295L;
        v[18] = (v[14] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[19], 1266679808L, 1056964608L});
        v[21] = ((long) Heap.f(v[20])) & 4294967295L;
        v[22] = ((v[16] << 2L)) & 4294967295L;
        v[23] = (v[14] + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        m.store(v[23], v[21], 4);
        v[24] = (v[18] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[25], 1266679808L, 1056964608L});
        v[27] = ((long) Heap.f(v[26])) & 4294967295L;
        v[28] = ((v[22] | 1L)) & 4294967295L;
        v[29] = (v[14] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        m.store(v[29], v[27], 4);
        v[30] = (v[18] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = LibC.call(m, "llvm.fmuladd.f32", new long[]{v[31], 1266679808L, 1056964608L});
        v[33] = ((long) Heap.f(v[32])) & 4294967295L;
        v[34] = ((v[22] | 2L)) & 4294967295L;
        v[35] = (v[14] + (Heap.s(v[34], 32) * 4L)) & 4294967295L;
        m.store(v[35], v[33], 4);
        v[36] = ((v[22] | 3L)) & 4294967295L;
        v[37] = (v[14] + (Heap.s(v[36], 32) * 4L)) & 4294967295L;
        m.store(v[37], 0L, 4);
        v[38] = v[15] > 1L ? 1L : 0L;
        return v[38] != 0 ? 4 : 2;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[39] = 0L;
        return -1;
    }
}
