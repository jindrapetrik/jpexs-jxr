package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: useLPQuantizer.
 */
public final class F0351_useLPQuantizer {

    private F0351_useLPQuantizer() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[46];
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
                    default:
                        throw new IllegalStateException("Invalid block in useLPQuantizer");
                }
                previous = old;
                if (pc < 0) {
                    return v[45];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 8 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[7] = ((v[1] & 1L)) & 4294967295L;
        v[8] = v[1] == 1L ? 1L : 0L;
        v[9] = ((v[1] & 4294967294L)) & 4294967295L;
        v[10] = v[7] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi11 = (previous == 1 ? v[4] : v[42]);
        long phi12 = (previous == 1 ? 0L : v[43]);
        v[11] = phi11;
        v[12] = phi12;
        switch ((int) v[1]) {
            case 0:
                return 7;
            case 1:
                return 4;
            default:
                return 3;
        }
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 3 ? v[30] : 0L);
        long phi14 = (previous == 3 ? v[31] : 0L);
        v[13] = phi13;
        v[14] = phi14;
        v[15] = m.load(v[6], 4);
        v[16] = (v[15] + (Heap.s(v[2], 32) * 240L) + 128L + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[17] + (Heap.s(v[13], 32) * 20L)) & 4294967295L;
        v[19] = (v[15] + (Heap.s(v[2], 32) * 240L) + 64L + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = (v[20] + (Heap.s(v[13], 32) * 20L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[18], v[21], 20L, 0L});
        v[22] = ((v[13] | 1L)) & 4294967295L;
        v[23] = m.load(v[6], 4);
        v[24] = (v[23] + (Heap.s(v[2], 32) * 240L) + 128L + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = (v[25] + (Heap.s(v[22], 32) * 20L)) & 4294967295L;
        v[27] = (v[23] + (Heap.s(v[2], 32) * 240L) + 64L + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = (v[28] + (Heap.s(v[22], 32) * 20L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[26], v[29], 20L, 0L});
        v[30] = ((v[13] + 2L)) & 4294967295L;
        v[31] = ((v[14] + 2L)) & 4294967295L;
        v[32] = v[31] == v[9] ? 1L : 0L;
        return v[32] != 0 ? 4 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi33 = (previous == 2 ? 0L : v[30]);
        v[33] = phi33;
        return v[10] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[34] = m.load(v[6], 4);
        v[35] = (v[34] + (Heap.s(v[2], 32) * 240L) + 128L + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[36] + (Heap.s(v[33], 32) * 20L)) & 4294967295L;
        v[38] = (v[34] + (Heap.s(v[2], 32) * 240L) + 64L + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = (v[39] + (Heap.s(v[33], 32) * 20L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[37], v[40], 20L, 0L});
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[41] = m.load(v[3], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi42 = (previous == 6 ? v[41] : v[11]);
        v[42] = phi42;
        v[43] = ((v[12] + 1L)) & 4294967295L;
        v[44] = v[43] < v[42] ? 1L : 0L;
        return v[44] != 0 ? 2 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        return -1;
    }
}
