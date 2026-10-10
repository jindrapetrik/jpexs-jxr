package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray16Fixed_Gray32Float.
 */
public final class F0162_Gray16Fixed_Gray32Float {

    private F0162_Gray16Fixed_Gray32Float() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[56];
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
                        throw new IllegalStateException("Invalid block in Gray16Fixed_Gray32Float");
                }
                previous = old;
                if (pc < 0) {
                    return v[55];
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
        v[11] = v[10] == 0L ? 1L : 0L;
        v[12] = v[7] < 4L ? 1L : 0L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = Heap.s(v[14], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[13] != 0 ? 3 : 8;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi14 = (previous == 1 ? v[5] : v[15]);
        v[14] = phi14;
        v[15] = ((v[14] + 4294967295L)) & 4294967295L;
        v[16] = ((v[15] * v[3])) & 4294967295L;
        v[17] = (v[2] + (Heap.s(v[16], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 4 : 2;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[11] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi18 = (previous == 5 ? v[20] : v[7]);
        long phi19 = (previous == 5 ? v[26] : 0L);
        v[18] = phi18;
        v[19] = phi19;
        v[20] = ((v[18] + 4294967295L)) & 4294967295L;
        v[21] = (v[17] + (Heap.s(v[20], 32) * 2L)) & 4294967295L;
        v[22] = m.load(v[21], 2);
        v[23] = Heap.fb(Heap.s(v[22], 16));
        v[24] = Heap.fb((Heap.f(v[23]) * Heap.f(956301312L)));
        v[25] = (v[17] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        m.store(v[25], v[24], 4);
        v[26] = ((v[19] + 1L)) & 4294967295L;
        v[27] = v[26] == v[10] ? 1L : 0L;
        return v[27] != 0 ? 6 : 5;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi28 = (previous == 4 ? v[7] : v[20]);
        v[28] = phi28;
        return v[12] != 0 ? 2 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi29 = (previous == 7 ? v[48] : v[28]);
        v[29] = phi29;
        v[30] = ((v[29] + 4294967295L)) & 4294967295L;
        v[31] = (v[17] + (Heap.s(v[30], 32) * 2L)) & 4294967295L;
        v[32] = m.load(v[31], 2);
        v[33] = Heap.fb(Heap.s(v[32], 16));
        v[34] = Heap.fb((Heap.f(v[33]) * Heap.f(956301312L)));
        v[35] = (v[17] + (Heap.s(v[30], 32) * 4L)) & 4294967295L;
        m.store(v[35], v[34], 4);
        v[36] = ((v[29] + 4294967294L)) & 4294967295L;
        v[37] = (v[17] + (Heap.s(v[36], 32) * 2L)) & 4294967295L;
        v[38] = m.load(v[37], 2);
        v[39] = Heap.fb(Heap.s(v[38], 16));
        v[40] = Heap.fb((Heap.f(v[39]) * Heap.f(956301312L)));
        v[41] = (v[17] + (Heap.s(v[36], 32) * 4L)) & 4294967295L;
        m.store(v[41], v[40], 4);
        v[42] = ((v[29] + 4294967293L)) & 4294967295L;
        v[43] = (v[17] + (Heap.s(v[42], 32) * 2L)) & 4294967295L;
        v[44] = m.load(v[43], 2);
        v[45] = Heap.fb(Heap.s(v[44], 16));
        v[46] = Heap.fb((Heap.f(v[45]) * Heap.f(956301312L)));
        v[47] = (v[17] + (Heap.s(v[42], 32) * 4L)) & 4294967295L;
        m.store(v[47], v[46], 4);
        v[48] = ((v[29] + 4294967292L)) & 4294967295L;
        v[49] = (v[17] + (Heap.s(v[48], 32) * 2L)) & 4294967295L;
        v[50] = m.load(v[49], 2);
        v[51] = Heap.fb(Heap.s(v[50], 16));
        v[52] = Heap.fb((Heap.f(v[51]) * Heap.f(956301312L)));
        v[53] = (v[17] + (Heap.s(v[48], 32) * 4L)) & 4294967295L;
        m.store(v[53], v[52], 4);
        v[54] = v[42] > 1L ? 1L : 0L;
        return v[54] != 0 ? 7 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[55] = 0L;
        return -1;
    }
}
