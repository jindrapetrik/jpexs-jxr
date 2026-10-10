package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PixelFormatLookup.
 */
public final class F0037_PixelFormatLookup {

    private F0037_PixelFormatLookup() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[41];
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
                    case 10:
                        pc = b10(m, v, previous);
                        break;
                    case 11:
                        pc = b11(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PixelFormatLookup");
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
        v[2] = (v[0] + (Heap.s(0L, 32) * 40L) + 28L) & 4294967295L;
        v[3] = (v[0] + (Heap.s(0L, 32) * 40L) + 32L) & 4294967295L;
        v[4] = (v[0] + (Heap.s(0L, 32) * 40L) + 36L) & 4294967295L;
        v[5] = (v[0] + (Heap.s(0L, 32) * 40L) + 24L) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 40L) + 20L) & 4294967295L;
        return 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi7 = (previous == 0 ? 0L : v[36]);
        v[7] = phi7;
        switch ((int) v[1]) {
            case 0:
                return 2;
            case 1:
                return 3;
            default:
                return 9;
        }
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = m.load(v[0], 4);
        v[9] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[7], 32) * 40L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = LibC.call(m, "memcmp", new long[]{v[8], v[10], 16L});
        v[12] = v[11] == 0L ? 1L : 0L;
        return v[12] != 0 ? 10 : 9;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[13] = m.load(v[2], 4);
        v[14] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[7], 32) * 40L) + 28L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = v[13] == v[15] ? 1L : 0L;
        return v[16] != 0 ? 4 : 9;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[17] = m.load(v[3], 4);
        v[18] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[7], 32) * 40L) + 32L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = v[17] == v[19] ? 1L : 0L;
        return v[20] != 0 ? 5 : 9;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[21] = m.load(v[4], 4);
        v[22] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[7], 32) * 40L) + 36L) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = v[21] == v[23] ? 1L : 0L;
        return v[24] != 0 ? 6 : 9;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[25] = m.load(v[5], 4);
        v[26] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[7], 32) * 40L) + 24L) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = v[25] == v[27] ? 1L : 0L;
        return v[28] != 0 ? 7 : 9;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[29] = m.load(v[6], 4);
        v[30] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[7], 32) * 40L) + 20L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = ((v[31] ^ v[29])) & 4294967295L;
        v[33] = ((v[32] & 48L)) & 4294967295L;
        v[34] = v[33] == 0L ? 1L : 0L;
        return v[34] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[35] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[7], 32) * 40L)) & 4294967295L;
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[36] = ((v[7] + 1L)) & 4294967295L;
        v[37] = v[36] == 68L ? 1L : 0L;
        return v[37] != 0 ? 11 : 1;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi38 = (previous == 8 ? v[35] : v[9]);
        v[38] = phi38;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[0], v[38], 40L, 0L});
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi39 = (previous == 10 ? 0L : 4294967190L);
        v[39] = phi39;
        v[40] = v[39];
        return -1;
    }
}
