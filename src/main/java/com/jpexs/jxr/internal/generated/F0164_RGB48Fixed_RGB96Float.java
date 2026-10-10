package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB48Fixed_RGB96Float.
 */
public final class F0164_RGB48Fixed_RGB96Float {

    private F0164_RGB48Fixed_RGB96Float() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[51];
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
                    case 9:
                        pc = b9(m, v, previous);
                        break;
                    case 10:
                        pc = b10(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in RGB48Fixed_RGB96Float");
                }
                previous = old;
                if (pc < 0) {
                    return v[50];
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
        v[8] = ((v[7] * 3L)) & 4294967295L;
        v[9] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 1 : 10;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[11] = ((v[5] & 1L)) & 4294967295L;
        v[12] = v[11] == 0L ? 1L : 0L;
        return v[12] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = ((v[5] + 4294967295L)) & 4294967295L;
        v[14] = ((v[13] * v[3])) & 4294967295L;
        v[15] = (v[2] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        return v[10] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi16 = (previous == 3 ? v[17] : v[8]);
        v[16] = phi16;
        v[17] = ((v[16] + 4294967295L)) & 4294967295L;
        v[18] = (v[15] + (Heap.s(v[17], 32) * 2L)) & 4294967295L;
        v[19] = m.load(v[18], 2);
        v[20] = Heap.fb(Heap.s(v[19], 16));
        v[21] = Heap.fb((Heap.f(v[20]) * Heap.f(956301312L)));
        v[22] = (v[15] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        m.store(v[22], v[21], 4);
        v[23] = Heap.s(v[16], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[23] != 0 ? 3 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi24 = (previous == 1 ? v[5] : (previous == 3 ? v[13] : v[13]));
        v[24] = phi24;
        v[25] = v[5] == 1L ? 1L : 0L;
        return v[25] != 0 ? 10 : 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[26] = ((v[38] + 4294967294L)) & 4294967295L;
        v[27] = ((v[26] * v[3])) & 4294967295L;
        v[28] = (v[2] + (Heap.s(v[27], 32) * 1L)) & 4294967295L;
        return v[10] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi29 = (previous == 6 ? v[30] : v[8]);
        v[29] = phi29;
        v[30] = ((v[29] + 4294967295L)) & 4294967295L;
        v[31] = (v[28] + (Heap.s(v[30], 32) * 2L)) & 4294967295L;
        v[32] = m.load(v[31], 2);
        v[33] = Heap.fb(Heap.s(v[32], 16));
        v[34] = Heap.fb((Heap.f(v[33]) * Heap.f(956301312L)));
        v[35] = (v[28] + (Heap.s(v[30], 32) * 4L)) & 4294967295L;
        m.store(v[35], v[34], 4);
        v[36] = Heap.s(v[29], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[36] != 0 ? 6 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[37] = Heap.s(v[38], 32) > Heap.s(2L, 32) ? 1L : 0L;
        return v[37] != 0 ? 8 : 10;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi38 = (previous == 7 ? v[26] : v[24]);
        v[38] = phi38;
        v[39] = ((v[38] + 4294967295L)) & 4294967295L;
        v[40] = ((v[39] * v[3])) & 4294967295L;
        v[41] = (v[2] + (Heap.s(v[40], 32) * 1L)) & 4294967295L;
        return v[10] != 0 ? 9 : 5;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi42 = (previous == 9 ? v[43] : v[8]);
        v[42] = phi42;
        v[43] = ((v[42] + 4294967295L)) & 4294967295L;
        v[44] = (v[41] + (Heap.s(v[43], 32) * 2L)) & 4294967295L;
        v[45] = m.load(v[44], 2);
        v[46] = Heap.fb(Heap.s(v[45], 16));
        v[47] = Heap.fb((Heap.f(v[46]) * Heap.f(956301312L)));
        v[48] = (v[41] + (Heap.s(v[43], 32) * 4L)) & 4294967295L;
        m.store(v[48], v[47], 4);
        v[49] = Heap.s(v[42], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[49] != 0 ? 9 : 5;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[50] = 0L;
        return -1;
    }
}
