package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writeQPIndex.
 */
public final class F0295_writeQPIndex {

    private F0295_writeQPIndex() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[69];
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
                        throw new IllegalStateException("Invalid block in writeQPIndex");
                }
                previous = old;
                if (pc < 0) {
                    return v[68];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = v[1] == 0L ? 1L : 0L;
        return v[3] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((v[5] << 1L)) & 4294967295L;
        v[7] = ((v[6] | 1L)) & 4294967295L;
        m.store(v[4], v[7], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[9] + 1L)) & 4294967295L;
        v[11] = ((31L - v[9])) & 4294967295L;
        v[12] = ((v[7] << v[11])) & 4294967295L;
        v[13] = LibC.call(m, "llvm.bswap.i32", new long[]{v[12]});
        v[14] = (v[13]) & 65535L;
        v[15] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        m.store(v[16], v[14], 2);
        v[17] = ((v[10] >>> 3L)) & 4294967295L;
        v[18] = ((v[17] & 2L)) & 4294967295L;
        v[19] = (v[16] + (Heap.s(v[18], 32) * 1L)) & 4294967295L;
        v[20] = (v[19]) & 4294967295L;
        v[21] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = ((v[22] & v[20])) & 4294967295L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[24] = (v[1]) & 4294967295L;
        v[25] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = ((v[26] << 1L)) & 4294967295L;
        v[28] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = ((v[29] + 1L)) & 4294967295L;
        v[31] = ((31L - v[29])) & 4294967295L;
        v[32] = ((v[27] << v[31])) & 4294967295L;
        v[33] = LibC.call(m, "llvm.bswap.i32", new long[]{v[32]});
        v[34] = (v[33]) & 65535L;
        v[35] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        m.store(v[36], v[34], 2);
        v[37] = ((v[30] >>> 3L)) & 4294967295L;
        v[38] = ((v[37] & 2L)) & 4294967295L;
        v[39] = (v[36] + (Heap.s(v[38], 32) * 1L)) & 4294967295L;
        v[40] = (v[39]) & 4294967295L;
        v[41] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = ((v[42] & v[40])) & 4294967295L;
        v[44] = (v[43]) & 4294967295L;
        v[45] = ((v[30] & 15L)) & 4294967295L;
        v[46] = ((v[24] + 2147483647L)) & 4294967295L;
        v[47] = ((4294967295L << v[2])) & 4294967295L;
        v[48] = ((v[47] ^ 4294967295L)) & 4294967295L;
        v[49] = ((v[46] & v[48])) & 4294967295L;
        v[50] = ((v[27] << v[2])) & 4294967295L;
        v[51] = ((v[50] | v[49])) & 4294967295L;
        m.store(v[25], v[51], 4);
        v[52] = ((v[45] + v[2])) & 4294967295L;
        v[53] = ((32L - v[52])) & 4294967295L;
        v[54] = ((v[51] << v[53])) & 4294967295L;
        v[55] = LibC.call(m, "llvm.bswap.i32", new long[]{v[54]});
        v[56] = (v[55]) & 65535L;
        m.store(v[44], v[56], 2);
        v[57] = ((v[52] >>> 3L)) & 4294967295L;
        v[58] = ((v[57] & 2L)) & 4294967295L;
        v[59] = (v[44] + (Heap.s(v[58], 32) * 1L)) & 4294967295L;
        v[60] = (v[59]) & 4294967295L;
        v[61] = ((v[42] & v[60])) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi62 = (previous == 2 ? v[61] : v[23]);
        long phi63 = (previous == 2 ? v[35] : v[15]);
        long phi64 = (previous == 2 ? v[52] : v[10]);
        long phi65 = (previous == 2 ? v[28] : v[8]);
        v[62] = phi62;
        v[63] = phi63;
        v[64] = phi64;
        v[65] = phi65;
        v[66] = (v[62]) & 4294967295L;
        m.store(v[63], v[66], 4);
        v[67] = ((v[64] & 15L)) & 4294967295L;
        m.store(v[65], v[67], 4);
        return -1;
    }
}
