package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray32Fixed_Gray32Float.
 */
public final class F0160_Gray32Fixed_Gray32Float {

    private F0160_Gray32Fixed_Gray32Float() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[54];
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
                        throw new IllegalStateException("Invalid block in Gray32Fixed_Gray32Float");
                }
                previous = old;
                if (pc < 0) {
                    return v[53];
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
        v[10] = ((v[7] & 3L)) & 4294967295L;
        v[11] = v[7] < 4L ? 1L : 0L;
        v[12] = ((v[7] & 2147483644L)) & 4294967295L;
        v[13] = v[10] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi14 = (previous == 1 ? 0L : v[51]);
        v[14] = phi14;
        v[15] = ((v[14] * v[3])) & 4294967295L;
        v[16] = (v[2] + (Heap.s(v[15], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[11] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi17 = (previous == 4 ? v[38] : 0L);
        long phi18 = (previous == 4 ? v[39] : 0L);
        v[17] = phi17;
        v[18] = phi18;
        v[19] = (v[16] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = Heap.fb(Heap.s(v[20], 32));
        v[22] = Heap.fb((Heap.f(v[21]) * Heap.f(864026624L)));
        m.store(v[19], v[22], 4);
        v[23] = ((v[17] | 1L)) & 4294967295L;
        v[24] = (v[16] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = Heap.fb(Heap.s(v[25], 32));
        v[27] = Heap.fb((Heap.f(v[26]) * Heap.f(864026624L)));
        m.store(v[24], v[27], 4);
        v[28] = ((v[17] | 2L)) & 4294967295L;
        v[29] = (v[16] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = Heap.fb(Heap.s(v[30], 32));
        v[32] = Heap.fb((Heap.f(v[31]) * Heap.f(864026624L)));
        m.store(v[29], v[32], 4);
        v[33] = ((v[17] | 3L)) & 4294967295L;
        v[34] = (v[16] + (Heap.s(v[33], 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = Heap.fb(Heap.s(v[35], 32));
        v[37] = Heap.fb((Heap.f(v[36]) * Heap.f(864026624L)));
        m.store(v[34], v[37], 4);
        v[38] = ((v[17] + 4L)) & 4294967295L;
        v[39] = ((v[18] + 4L)) & 4294967295L;
        v[40] = v[39] == v[12] ? 1L : 0L;
        return v[40] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi41 = (previous == 3 ? 0L : v[38]);
        v[41] = phi41;
        return v[13] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi42 = (previous == 6 ? v[48] : v[41]);
        long phi43 = (previous == 6 ? v[49] : 0L);
        v[42] = phi42;
        v[43] = phi43;
        v[44] = (v[16] + (Heap.s(v[42], 32) * 4L)) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = Heap.fb(Heap.s(v[45], 32));
        v[47] = Heap.fb((Heap.f(v[46]) * Heap.f(864026624L)));
        m.store(v[44], v[47], 4);
        v[48] = ((v[42] + 1L)) & 4294967295L;
        v[49] = ((v[43] + 1L)) & 4294967295L;
        v[50] = v[49] == v[10] ? 1L : 0L;
        return v[50] != 0 ? 7 : 6;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[51] = ((v[14] + 1L)) & 4294967295L;
        v[52] = v[51] == v[5] ? 1L : 0L;
        return v[52] != 0 ? 8 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[53] = 0L;
        return -1;
    }
}
