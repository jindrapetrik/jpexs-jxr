package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readQPIndex.
 */
public final class F0298_readQPIndex {

    private F0298_readQPIndex() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[37];
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
                    default:
                        throw new IllegalStateException("Invalid block in readQPIndex");
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
        v[2] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((v[5] + 1L)) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[6] >>> 3L)) & 4294967295L;
        v[10] = (v[8] + (Heap.s(v[9], 32) * 1L)) & 4294967295L;
        v[11] = (v[10]) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[13] & v[11])) & 4294967295L;
        v[15] = (v[14]) & 4294967295L;
        m.store(v[7], v[15], 4);
        v[16] = ((v[6] & 15L)) & 4294967295L;
        m.store(v[4], v[16], 4);
        v[17] = m.load(v[15], 4);
        v[18] = LibC.call(m, "llvm.bswap.i32", new long[]{v[17]});
        v[19] = ((v[18] << v[16])) & 4294967295L;
        m.store(v[2], v[19], 4);
        v[20] = Heap.s(v[3], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        return v[20] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[21] = ((32L - v[1])) & 4294967295L;
        v[22] = ((v[19] >>> v[21])) & 4294967295L;
        v[23] = ((v[16] + v[1])) & 4294967295L;
        v[24] = ((v[23] >>> 3L)) & 4294967295L;
        v[25] = (v[15] + (Heap.s(v[24], 32) * 1L)) & 4294967295L;
        v[26] = (v[25]) & 4294967295L;
        v[27] = ((v[13] & v[26])) & 4294967295L;
        v[28] = (v[27]) & 4294967295L;
        m.store(v[7], v[28], 4);
        v[29] = ((v[23] & 15L)) & 4294967295L;
        m.store(v[4], v[29], 4);
        v[30] = m.load(v[28], 4);
        v[31] = LibC.call(m, "llvm.bswap.i32", new long[]{v[30]});
        v[32] = ((v[31] << v[29])) & 4294967295L;
        m.store(v[2], v[32], 4);
        v[33] = (v[22]) & 255L;
        v[34] = ((v[33] + 1L)) & 255L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi35 = (previous == 1 ? v[34] : 0L);
        v[35] = phi35;
        v[36] = v[35];
        return -1;
    }
}
