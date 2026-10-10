package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: EncodeSignificantAbsLevel.
 */
public final class F0287_EncodeSignificantAbsLevel {

    private F0287_EncodeSignificantAbsLevel() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[53];
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
                    case 9:
                        pc = b9(m, v, previous);
                        break;
                    case 10:
                        pc = b10(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in EncodeSignificantAbsLevel");
                }
                previous = old;
                if (pc < 0) {
                    return v[52];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((v[0] + 4294967295L)) & 4294967295L;
        v[4] = v[3] > 15L ? 1L : 0L;
        return v[4] != 0 ? 1 : 9;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = v[3] < 32L ? 1L : 0L;
        return v[5] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[6] = ((Heap.s(v[3], 32) >> 5L)) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi7 = (previous == 3 ? v[10] : v[6]);
        long phi8 = (previous == 3 ? v[9] : 4L);
        v[7] = phi7;
        v[8] = phi8;
        v[9] = ((v[8] + 1L)) & 4294967295L;
        v[10] = ((Heap.s(v[7], 32) >> 1L)) & 4294967295L;
        v[11] = v[7] < 2L ? 1L : 0L;
        return v[11] != 0 ? 4 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi12 = (previous == 1 ? 4L : v[9]);
        v[12] = phi12;
        v[13] = (v[1] + (Heap.s(0L, 32) * 44L) + 8L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[14] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = (v[1] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = ((v[18] + v[16])) & 4294967295L;
        m.store(v[17], v[19], 4);
        v[20] = (v[1] + (Heap.s(0L, 32) * 44L) + 4L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = (v[21] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = (v[21] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        F0359_putBit16z.run(m, v[2], v[23], v[25]);
        v[26] = v[12] > 18L ? 1L : 0L;
        return v[26] != 0 ? 5 : 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[2], 15L, 4L);
        v[27] = v[12] > 21L ? 1L : 0L;
        return v[27] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        F0359_putBit16z.run(m, v[2], 3L, 2L);
        v[28] = ((v[12] + 4294967274L)) & 4294967295L;
        F0297_putBit16.run(m, v[2], v[28], 3L);
        return 10;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[29] = ((v[12] + 4294967277L)) & 4294967295L;
        F0359_putBit16z.run(m, v[2], v[29], 2L);
        return 10;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[30] = ((v[12] + 4294967292L)) & 4294967295L;
        F0359_putBit16z.run(m, v[2], v[30], 4L);
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[31] = (10480L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[3], 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = (10544L + (Heap.s(0L, 32) * 24L) + (Heap.s(v[32], 32) * 4L)) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = (v[1] + (Heap.s(0L, 32) * 44L) + 8L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[36] + (Heap.s(v[32], 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = (v[1] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = ((v[40] + v[38])) & 4294967295L;
        m.store(v[39], v[41], 4);
        v[42] = (v[1] + (Heap.s(0L, 32) * 44L) + 4L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = ((v[32] << 1L)) & 4294967295L;
        v[45] = ((v[44] | 1L)) & 4294967295L;
        v[46] = (v[43] + (Heap.s(v[45], 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = (v[43] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        v[49] = (v[48] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[50] = m.load(v[49], 4);
        F0359_putBit16z.run(m, v[2], v[47], v[50]);
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi51 = (previous == 9 ? v[34] : (previous == 6 ? v[12] : (previous == 7 ? v[12] : v[12])));
        v[51] = phi51;
        F0360_putBit32.run(m, v[2], v[3], v[51]);
        return -1;
    }
}
