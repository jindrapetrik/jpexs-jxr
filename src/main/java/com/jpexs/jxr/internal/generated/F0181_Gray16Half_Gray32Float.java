package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray16Half_Gray32Float.
 */
public final class F0181_Gray16Half_Gray32Float {

    private F0181_Gray16Half_Gray32Float() {
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
                    default:
                        throw new IllegalStateException("Invalid block in Gray16Half_Gray32Float");
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
        return v[8] != 0 ? 1 : 8;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = Heap.s(v[11], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[10] != 0 ? 3 : 8;
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
        long phi15 = (previous == 7 ? v[16] : v[7]);
        v[15] = phi15;
        v[16] = ((v[15] + 4294967295L)) & 4294967295L;
        v[17] = (v[14] + (Heap.s(v[16], 32) * 2L)) & 4294967295L;
        v[18] = m.load(v[17], 2);
        v[19] = (v[18]) & 4294967295L;
        v[20] = ((v[19] >>> 10L)) & 4294967295L;
        v[21] = ((v[20] & 31L)) & 4294967295L;
        v[22] = (Heap.s(v[18], 16)) & 4294967295L;
        v[23] = ((v[22] & 2147483648L)) & 4294967295L;
        switch ((int) v[21]) {
            case 0:
                return 7;
            case 31:
                return 5;
            default:
                return 6;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[24] = ((v[19] << 13L)) & 4294967295L;
        v[25] = ((v[23] | v[24])) & 4294967295L;
        v[26] = ((v[25] | 2139095040L)) & 4294967295L;
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[27] = ((v[21] << 23L)) & 4294967295L;
        v[28] = ((v[27] + 939524096L)) & 4294967295L;
        v[29] = ((v[19] << 13L)) & 4294967295L;
        v[30] = ((v[29] & 8380416L)) & 4294967295L;
        v[31] = ((v[28] | v[30])) & 4294967295L;
        v[32] = ((v[31] | v[23])) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi33 = (previous == 5 ? v[26] : (previous == 6 ? v[32] : v[23]));
        v[33] = phi33;
        v[34] = (v[14] + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        m.store(v[34], v[33], 4);
        v[35] = v[15] > 1L ? 1L : 0L;
        return v[35] != 0 ? 4 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[36] = 0L;
        return -1;
    }
}
