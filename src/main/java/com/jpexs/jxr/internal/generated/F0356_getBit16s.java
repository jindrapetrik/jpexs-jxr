package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getBit16s.
 */
public final class F0356_getBit16s {

    private F0356_getBit16s() {
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
                        throw new IllegalStateException("Invalid block in getBit16s");
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
        v[2] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = ((31L - v[1])) & 4294967295L;
        v[5] = ((v[3] >>> v[4])) & 4294967295L;
        v[6] = v[5] < 2L ? 1L : 0L;
        return v[6] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] + v[1])) & 4294967295L;
        v[10] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = ((v[9] >>> 3L)) & 4294967295L;
        v[13] = (v[11] + (Heap.s(v[12], 32) * 1L)) & 4294967295L;
        v[14] = (v[13]) & 4294967295L;
        v[15] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[16] & v[14])) & 4294967295L;
        v[18] = (v[17]) & 4294967295L;
        m.store(v[10], v[18], 4);
        v[19] = ((v[9] & 15L)) & 4294967295L;
        m.store(v[7], v[19], 4);
        v[20] = m.load(v[18], 4);
        v[21] = LibC.call(m, "llvm.bswap.i32", new long[]{v[20]});
        v[22] = ((v[21] << v[19])) & 4294967295L;
        m.store(v[2], v[22], 4);
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[23] = ((v[1] + 1L)) & 4294967295L;
        v[24] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = ((v[23] + v[25])) & 4294967295L;
        v[27] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[26] >>> 3L)) & 4294967295L;
        v[30] = (v[28] + (Heap.s(v[29], 32) * 1L)) & 4294967295L;
        v[31] = (v[30]) & 4294967295L;
        v[32] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((v[33] & v[31])) & 4294967295L;
        v[35] = (v[34]) & 4294967295L;
        m.store(v[27], v[35], 4);
        v[36] = ((v[26] & 15L)) & 4294967295L;
        m.store(v[24], v[36], 4);
        v[37] = m.load(v[35], 4);
        v[38] = LibC.call(m, "llvm.bswap.i32", new long[]{v[37]});
        v[39] = ((v[38] << v[36])) & 4294967295L;
        m.store(v[2], v[39], 4);
        v[40] = ((v[5] & 1L)) & 4294967295L;
        v[41] = v[40] == 0L ? 1L : 0L;
        v[42] = ((v[5] >>> 1L)) & 4294967295L;
        v[43] = ((0L - v[42])) & 4294967295L;
        v[44] = v[41] != 0 ? v[42] : v[43];
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi45 = (previous == 1 ? 0L : v[44]);
        v[45] = phi45;
        v[46] = v[45];
        return -1;
    }
}
