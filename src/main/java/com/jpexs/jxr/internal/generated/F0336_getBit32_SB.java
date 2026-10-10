package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getBit32_SB.
 */
public final class F0336_getBit32_SB {

    private F0336_getBit32_SB() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[47];
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
                    default:
                        throw new IllegalStateException("Invalid block in getBit32_SB");
                }
                previous = old;
                if (pc < 0) {
                    return v[46];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] < v[1] ? 1L : 0L;
        return v[4] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        v[7] = m.load(v[5], 1);
        v[8] = (v[7]) & 4294967295L;
        v[9] = ((8L - v[3])) & 4294967295L;
        v[10] = ((v[8] >>> v[9])) & 4294967295L;
        v[11] = ((v[1] - v[3])) & 4294967295L;
        v[12] = m.load(v[0], 4);
        v[13] = (v[12] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = Dispatch.call(m, v[14], new long[]{v[12], v[5], 1L});
        v[16] = m.load(v[6], 4);
        v[17] = ((v[16] + 1L)) & 4294967295L;
        m.store(v[6], v[17], 4);
        m.store(v[2], 8L, 4);
        v[18] = v[11] > 8L ? 1L : 0L;
        return v[18] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi19 = (previous == 2 ? v[24] : v[10]);
        long phi20 = (previous == 2 ? v[25] : v[11]);
        v[19] = phi19;
        v[20] = phi20;
        v[21] = ((v[19] << 8L)) & 4294967295L;
        v[22] = m.load(v[5], 1);
        v[23] = (v[22]) & 4294967295L;
        v[24] = ((v[21] | v[23])) & 4294967295L;
        v[25] = ((v[20] + 4294967288L)) & 4294967295L;
        v[26] = m.load(v[0], 4);
        v[27] = (v[26] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = Dispatch.call(m, v[28], new long[]{v[26], v[5], 1L});
        v[30] = m.load(v[6], 4);
        v[31] = ((v[30] + 1L)) & 4294967295L;
        m.store(v[6], v[31], 4);
        m.store(v[2], 8L, 4);
        v[32] = v[25] > 8L ? 1L : 0L;
        return v[32] != 0 ? 2 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi33 = (previous == 0 ? v[1] : (previous == 1 ? v[11] : v[25]));
        long phi34 = (previous == 0 ? 0L : (previous == 1 ? v[10] : v[24]));
        long phi35 = (previous == 0 ? v[3] : (previous == 1 ? 8L : 8L));
        v[33] = phi33;
        v[34] = phi34;
        v[35] = phi35;
        v[36] = ((v[34] << v[33])) & 4294967295L;
        v[37] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[38] = m.load(v[37], 1);
        v[39] = (v[38]) & 4294967295L;
        v[40] = ((8L - v[33])) & 4294967295L;
        v[41] = ((v[39] >>> v[40])) & 4294967295L;
        v[42] = ((v[41] | v[36])) & 4294967295L;
        v[43] = ((v[39] << v[33])) & 4294967295L;
        v[44] = (v[43]) & 255L;
        m.store(v[37], v[44], 1);
        v[45] = ((v[35] - v[33])) & 4294967295L;
        m.store(v[2], v[45], 4);
        v[46] = v[42];
        return -1;
    }
}
