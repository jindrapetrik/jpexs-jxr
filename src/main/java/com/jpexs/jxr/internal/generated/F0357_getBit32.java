package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getBit32.
 */
public final class F0357_getBit32 {

    private F0357_getBit32() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[53];
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
                        throw new IllegalStateException("Invalid block in getBit32");
                }
                previous = old;
                if (pc < 0) {
                    return v[52];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = v[1] > 16L ? 1L : 0L;
        v[3] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        return v[2] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = ((v[4] >>> 16L)) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[13] + 16L)) & 4294967295L;
        v[15] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[14] >>> 3L)) & 4294967295L;
        v[18] = (v[16] + (Heap.s(v[17], 32) * 1L)) & 4294967295L;
        v[19] = (v[18]) & 4294967295L;
        v[20] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((v[21] & v[19])) & 4294967295L;
        v[23] = (v[22]) & 4294967295L;
        v[24] = ((v[13] & 15L)) & 4294967295L;
        m.store(v[12], v[24], 4);
        v[25] = m.load(v[23], 4);
        v[26] = LibC.call(m, "llvm.bswap.i32", new long[]{v[25]});
        v[27] = ((v[26] << v[24])) & 4294967295L;
        m.store(v[3], v[27], 4);
        v[28] = ((v[1] + 4294967280L)) & 4294967295L;
        v[29] = ((v[11] << v[28])) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi30 = (previous == 2 ? v[21] : v[10]);
        long phi31 = (previous == 2 ? v[23] : v[8]);
        long phi32 = (previous == 2 ? v[24] : v[6]);
        long phi33 = (previous == 2 ? v[27] : v[4]);
        long phi34 = (previous == 2 ? v[28] : v[1]);
        long phi35 = (previous == 2 ? v[29] : 0L);
        v[30] = phi30;
        v[31] = phi31;
        v[32] = phi32;
        v[33] = phi33;
        v[34] = phi34;
        v[35] = phi35;
        v[36] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[37] = ((32L - v[34])) & 4294967295L;
        v[38] = ((v[33] >>> v[37])) & 4294967295L;
        v[39] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[40] = ((v[32] + v[34])) & 4294967295L;
        v[41] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[42] = ((v[40] >>> 3L)) & 4294967295L;
        v[43] = (v[31] + (Heap.s(v[42], 32) * 1L)) & 4294967295L;
        v[44] = (v[43]) & 4294967295L;
        v[45] = ((v[30] & v[44])) & 4294967295L;
        v[46] = (v[45]) & 4294967295L;
        m.store(v[41], v[46], 4);
        v[47] = ((v[40] & 15L)) & 4294967295L;
        m.store(v[39], v[47], 4);
        v[48] = m.load(v[46], 4);
        v[49] = LibC.call(m, "llvm.bswap.i32", new long[]{v[48]});
        v[50] = ((v[49] << v[47])) & 4294967295L;
        m.store(v[36], v[50], 4);
        v[51] = ((v[38] | v[35])) & 4294967295L;
        v[52] = v[51];
        return -1;
    }
}
