package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: FreeCodingContextDec.
 */
public final class F0022_FreeCodingContextDec {

    private F0022_FreeCodingContextDec() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[25];
        v[0] = a0;
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
                    default:
                        throw new IllegalStateException("Invalid block in FreeCodingContextDec");
                }
                previous = old;
                if (pc < 0) {
                    return v[24];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34312L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = Heap.s(v[2], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[3] != 0 ? 1 : 12;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34308L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 12 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi7 = (previous == 10 ? v[21] : 0L);
        v[7] = phi7;
        v[8] = m.load(v[4], 4);
        v[9] = (v[8] + (Heap.s(v[7], 32) * 592L) + 16L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[10]});
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        m.store(v[9], 0L, 4);
        v[12] = (v[8] + (Heap.s(v[7], 32) * 592L) + 20L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[13]});
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        m.store(v[12], 0L, 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi15 = (previous == 6 ? 0L : v[19]);
        v[15] = phi15;
        v[16] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = v[17] == 0L ? 1L : 0L;
        return v[18] != 0 ? 9 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[17]});
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        m.store(v[16], 0L, 4);
        v[19] = ((v[15] + 1L)) & 4294967295L;
        v[20] = v[19] == 21L ? 1L : 0L;
        return v[20] != 0 ? 10 : 7;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[21] = ((v[7] + 1L)) & 4294967295L;
        v[22] = v[21] == v[2] ? 1L : 0L;
        return v[22] != 0 ? 11 : 2;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[23] = m.load(v[4], 4);
        LibC.call(m, "free", new long[]{v[23]});
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        return -1;
    }
}
