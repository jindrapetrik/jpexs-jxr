package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: putBit32.
 */
public final class F0360_putBit32 {

    private F0360_putBit32() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[63];
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
                    default:
                        throw new IllegalStateException("Invalid block in putBit32");
                }
                previous = old;
                if (pc < 0) {
                    return v[62];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = v[2] > 16L ? 1L : 0L;
        return v[3] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = ((v[2] + 4294967280L)) & 4294967295L;
        v[13] = ((v[1] >>> v[12])) & 4294967295L;
        v[14] = ((v[13] & 65535L)) & 4294967295L;
        v[15] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[16] << 16L)) & 4294967295L;
        v[18] = ((v[17] | v[14])) & 4294967295L;
        v[19] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = ((16L - v[20])) & 4294967295L;
        v[22] = ((v[18] << v[21])) & 4294967295L;
        v[23] = LibC.call(m, "llvm.bswap.i32", new long[]{v[22]});
        v[24] = (v[23]) & 65535L;
        v[25] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        m.store(v[26], v[24], 2);
        v[27] = ((v[20] >>> 3L)) & 4294967295L;
        v[28] = ((v[27] & 2L)) & 4294967295L;
        v[29] = ((v[28] ^ 2L)) & 4294967295L;
        v[30] = (v[26] + (Heap.s(v[29], 32) * 1L)) & 4294967295L;
        v[31] = (v[30]) & 4294967295L;
        v[32] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((v[33] & v[31])) & 4294967295L;
        v[35] = (v[34]) & 4294967295L;
        v[36] = ((v[20] & 15L)) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi37 = (previous == 2 ? v[33] : v[11]);
        long phi38 = (previous == 2 ? v[35] : v[9]);
        long phi39 = (previous == 2 ? v[36] : v[7]);
        long phi40 = (previous == 2 ? v[18] : v[5]);
        long phi41 = (previous == 2 ? v[12] : v[2]);
        v[37] = phi37;
        v[38] = phi38;
        v[39] = phi39;
        v[40] = phi40;
        v[41] = phi41;
        v[42] = ((4294967295L << v[41])) & 4294967295L;
        v[43] = ((v[42] ^ 4294967295L)) & 4294967295L;
        v[44] = ((v[43] & v[1])) & 4294967295L;
        v[45] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[46] = ((v[40] << v[41])) & 4294967295L;
        v[47] = ((v[46] | v[44])) & 4294967295L;
        m.store(v[45], v[47], 4);
        v[48] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[49] = ((v[39] + v[41])) & 4294967295L;
        v[50] = ((32L - v[49])) & 4294967295L;
        v[51] = ((v[47] << v[50])) & 4294967295L;
        v[52] = LibC.call(m, "llvm.bswap.i32", new long[]{v[51]});
        v[53] = (v[52]) & 65535L;
        v[54] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        m.store(v[38], v[53], 2);
        v[55] = ((v[49] >>> 3L)) & 4294967295L;
        v[56] = ((v[55] & 2L)) & 4294967295L;
        v[57] = (v[38] + (Heap.s(v[56], 32) * 1L)) & 4294967295L;
        v[58] = (v[57]) & 4294967295L;
        v[59] = ((v[37] & v[58])) & 4294967295L;
        v[60] = (v[59]) & 4294967295L;
        m.store(v[54], v[60], 4);
        v[61] = ((v[49] & 15L)) & 4294967295L;
        m.store(v[48], v[61], 4);
        return -1;
    }
}
