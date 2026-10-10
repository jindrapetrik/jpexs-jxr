package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB96Fixed_RGB96Float.
 */
public final class F0150_RGB96Fixed_RGB96Float {

    private F0150_RGB96Fixed_RGB96Float() {
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
                        throw new IllegalStateException("Invalid block in RGB96Fixed_RGB96Float");
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
        v[6] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[6] != 0 ? 1 : 8;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] * 3L)) & 4294967295L;
        v[10] = Heap.s(v[8], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[11] = LibC.call(m, "llvm.smax.i32", new long[]{v[9], 1L});
        v[12] = ((v[11] & 3L)) & 4294967295L;
        v[13] = Heap.s(v[9], 32) < Heap.s(4L, 32) ? 1L : 0L;
        v[14] = ((v[11] & 2147483644L)) & 4294967295L;
        v[15] = v[12] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi16 = (previous == 1 ? 0L : v[53]);
        v[16] = phi16;
        v[17] = ((v[16] * v[3])) & 4294967295L;
        v[18] = (v[2] + (Heap.s(v[17], 32) * 1L)) & 4294967295L;
        return v[10] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[13] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi19 = (previous == 4 ? v[40] : 0L);
        long phi20 = (previous == 4 ? v[41] : 0L);
        v[19] = phi19;
        v[20] = phi20;
        v[21] = (v[18] + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = Heap.fb(Heap.s(v[22], 32));
        v[24] = Heap.fb((Heap.f(v[23]) * Heap.f(864026624L)));
        m.store(v[21], v[24], 4);
        v[25] = ((v[19] | 1L)) & 4294967295L;
        v[26] = (v[18] + (Heap.s(v[25], 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = Heap.fb(Heap.s(v[27], 32));
        v[29] = Heap.fb((Heap.f(v[28]) * Heap.f(864026624L)));
        m.store(v[26], v[29], 4);
        v[30] = ((v[19] | 2L)) & 4294967295L;
        v[31] = (v[18] + (Heap.s(v[30], 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = Heap.fb(Heap.s(v[32], 32));
        v[34] = Heap.fb((Heap.f(v[33]) * Heap.f(864026624L)));
        m.store(v[31], v[34], 4);
        v[35] = ((v[19] | 3L)) & 4294967295L;
        v[36] = (v[18] + (Heap.s(v[35], 32) * 4L)) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = Heap.fb(Heap.s(v[37], 32));
        v[39] = Heap.fb((Heap.f(v[38]) * Heap.f(864026624L)));
        m.store(v[36], v[39], 4);
        v[40] = ((v[19] + 4L)) & 4294967295L;
        v[41] = ((v[20] + 4L)) & 4294967295L;
        v[42] = v[41] == v[14] ? 1L : 0L;
        return v[42] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi43 = (previous == 3 ? 0L : v[40]);
        v[43] = phi43;
        return v[15] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi44 = (previous == 6 ? v[50] : v[43]);
        long phi45 = (previous == 6 ? v[51] : 0L);
        v[44] = phi44;
        v[45] = phi45;
        v[46] = (v[18] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = Heap.fb(Heap.s(v[47], 32));
        v[49] = Heap.fb((Heap.f(v[48]) * Heap.f(864026624L)));
        m.store(v[46], v[49], 4);
        v[50] = ((v[44] + 1L)) & 4294967295L;
        v[51] = ((v[45] + 1L)) & 4294967295L;
        v[52] = v[51] == v[12] ? 1L : 0L;
        return v[52] != 0 ? 7 : 6;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[53] = ((v[16] + 1L)) & 4294967295L;
        v[54] = v[53] == v[5] ? 1L : 0L;
        return v[54] != 0 ? 8 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[55] = 0L;
        return -1;
    }
}
