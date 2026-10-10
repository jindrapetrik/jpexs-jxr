package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: setUniformQuantizer.
 */
public final class F0349_setUniformQuantizer {

    private F0349_setUniformQuantizer() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[29];
        v[0] = a0;
        v[1] = a1;
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
                    default:
                        throw new IllegalStateException("Invalid block in setUniformQuantizer");
                }
                previous = old;
                if (pc < 0) {
                    return v[28];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 9 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = v[6] == 0L ? 1L : 0L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[9] = ((v[6] + 1L)) & 4294967295L;
        v[10] = LibC.call(m, "llvm.umax.i32", new long[]{v[9], 2L});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi11 = (previous == 1 ? 0L : v[26]);
        v[11] = phi11;
        return v[7] != 0 ? 8 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi12 = (previous == 7 ? v[24] : 1L);
        v[12] = phi12;
        v[13] = m.load(v[8], 4);
        switch ((int) v[1]) {
            case 0:
                return 4;
            case 1:
                return 5;
            default:
                return 6;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[14] = (v[13] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[13] + (Heap.s(v[12], 32) * 240L)) & 4294967295L;
        v[17] = (v[16] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        m.store(v[17], v[15], 4);
        return 7;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[18] = (v[13] + (Heap.s(0L, 32) * 240L) + 64L + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = (v[13] + (Heap.s(v[12], 32) * 240L) + 64L + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        m.store(v[20], v[19], 4);
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[21] = (v[13] + (Heap.s(0L, 32) * 240L) + 128L + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[13] + (Heap.s(v[12], 32) * 240L) + 128L + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        m.store(v[23], v[22], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[24] = ((v[12] + 1L)) & 4294967295L;
        v[25] = v[24] == v[10] ? 1L : 0L;
        return v[25] != 0 ? 8 : 3;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[26] = ((v[11] + 1L)) & 4294967295L;
        v[27] = v[26] == v[3] ? 1L : 0L;
        return v[27] != 0 ? 9 : 2;
    }

    private static int b9(Heap m, long[] v, int previous) {
        return -1;
    }
}
