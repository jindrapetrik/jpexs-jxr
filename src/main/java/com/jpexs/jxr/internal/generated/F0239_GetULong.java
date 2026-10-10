package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetULong.
 */
public final class F0239_GetULong {

    private F0239_GetULong() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[40];
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
                    default:
                        throw new IllegalStateException("Invalid block in GetULong");
                }
                previous = old;
                if (pc < 0) {
                    return v[39];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(1L * 1L, 1);
        v[4] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Dispatch.call(m, v[5], new long[]{v[0], v[1]});
        v[7] = Heap.s(v[6], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[7] != 0 ? 6 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = Dispatch.call(m, v[9], new long[]{v[0], v[3], 1L});
        v[11] = Heap.s(v[10], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[11] != 0 ? 6 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = m.load(v[3], 1);
        v[13] = (v[12]) & 4294967295L;
        m.store(v[2], v[13], 4);
        v[14] = m.load(v[8], 4);
        v[15] = Dispatch.call(m, v[14], new long[]{v[0], v[3], 1L});
        v[16] = Heap.s(v[15], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[16] != 0 ? 6 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[17] = m.load(v[3], 1);
        v[18] = (v[17]) & 4294967295L;
        v[19] = ((v[18] << 8L)) & 4294967295L;
        v[20] = m.load(v[2], 4);
        v[21] = ((v[19] + v[20])) & 4294967295L;
        m.store(v[2], v[21], 4);
        v[22] = m.load(v[8], 4);
        v[23] = Dispatch.call(m, v[22], new long[]{v[0], v[3], 1L});
        v[24] = Heap.s(v[23], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[24] != 0 ? 6 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[25] = m.load(v[3], 1);
        v[26] = (v[25]) & 4294967295L;
        v[27] = ((v[26] << 16L)) & 4294967295L;
        v[28] = m.load(v[2], 4);
        v[29] = ((v[27] + v[28])) & 4294967295L;
        m.store(v[2], v[29], 4);
        v[30] = m.load(v[8], 4);
        v[31] = Dispatch.call(m, v[30], new long[]{v[0], v[3], 1L});
        v[32] = Heap.s(v[31], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[32] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[33] = m.load(v[3], 1);
        v[34] = (v[33]) & 4294967295L;
        v[35] = ((v[34] << 24L)) & 4294967295L;
        v[36] = m.load(v[2], 4);
        v[37] = ((v[35] + v[36])) & 4294967295L;
        m.store(v[2], v[37], 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi38 = (previous == 5 ? v[31] : (previous == 0 ? v[6] : (previous == 1 ? v[10] : (previous == 2 ? v[15] : (previous == 3 ? v[23] : v[31])))));
        v[38] = phi38;
        v[39] = v[38];
        return -1;
    }
}
