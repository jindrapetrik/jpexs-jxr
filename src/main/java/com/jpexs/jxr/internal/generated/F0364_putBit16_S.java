package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: putBit16_S.
 */
public final class F0364_putBit16_S {

    private F0364_putBit16_S() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[48];
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
                    default:
                        throw new IllegalStateException("Invalid block in putBit16_S");
                }
                previous = old;
                if (pc < 0) {
                    return v[47];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = ((4294967295L << v[3])) & 4294967295L;
        v[5] = ((v[4] ^ 4294967295L)) & 4294967295L;
        v[6] = ((v[5] & v[2])) & 4294967295L;
        v[7] = (v[1] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] << v[3])) & 4294967295L;
        v[10] = ((v[9] | v[6])) & 4294967295L;
        m.store(v[7], v[10], 4);
        v[11] = (v[1] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[12] + v[3])) & 4294967295L;
        v[14] = ((32L - v[13])) & 4294967295L;
        v[15] = ((v[10] << v[14])) & 4294967295L;
        v[16] = LibC.call(m, "llvm.bswap.i32", new long[]{v[15]});
        v[17] = (v[16]) & 65535L;
        v[18] = (v[1] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        m.store(v[19], v[17], 2);
        v[20] = ((v[13] >>> 3L)) & 4294967295L;
        v[21] = ((v[20] & 2L)) & 4294967295L;
        v[22] = (v[19] + (Heap.s(v[21], 32) * 1L)) & 4294967295L;
        v[23] = (v[22]) & 4294967295L;
        v[24] = (v[1] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = ((v[25] & v[23])) & 4294967295L;
        v[27] = (v[26]) & 4294967295L;
        m.store(v[18], v[27], 4);
        v[28] = ((v[13] & 15L)) & 4294967295L;
        m.store(v[11], v[28], 4);
        v[29] = (v[1] + (Heap.s(0L, 32) * 32L) + 16L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = (v[30]) & 4294967295L;
        v[32] = ((v[26] ^ v[31])) & 4294967295L;
        v[33] = ((v[32] & 4096L)) & 4294967295L;
        v[34] = v[33] == 0L ? 1L : 0L;
        return v[34] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[35] = (v[1] + (Heap.s(0L, 32) * 32L) + 24L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[36] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = Dispatch.call(m, v[38], new long[]{v[36], v[30], 4096L});
        v[40] = Heap.s(v[39], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[40] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[41] = m.load(v[29], 4);
        v[42] = (v[41] + (Heap.s(4096L, 32) * 1L)) & 4294967295L;
        v[43] = (v[42]) & 4294967295L;
        v[44] = m.load(v[24], 4);
        v[45] = ((v[44] & v[43])) & 4294967295L;
        v[46] = (v[45]) & 4294967295L;
        m.store(v[29], v[46], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[47] = 0L;
        return -1;
    }
}
