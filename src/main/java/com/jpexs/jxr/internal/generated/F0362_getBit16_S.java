package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getBit16_S.
 */
public final class F0362_getBit16_S {

    private F0362_getBit16_S() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[50];
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
                    default:
                        throw new IllegalStateException("Invalid block in getBit16_S");
                }
                previous = old;
                if (pc < 0) {
                    return v[49];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[1] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[1] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = ((v[6] + v[2])) & 4294967295L;
        v[8] = (v[1] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[7] >>> 3L)) & 4294967295L;
        v[11] = (v[9] + (Heap.s(v[10], 32) * 1L)) & 4294967295L;
        v[12] = (v[11]) & 4294967295L;
        v[13] = (v[1] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = ((v[14] & v[12])) & 4294967295L;
        v[16] = (v[15]) & 4294967295L;
        m.store(v[8], v[16], 4);
        v[17] = ((v[7] & 15L)) & 4294967295L;
        m.store(v[5], v[17], 4);
        v[18] = m.load(v[16], 4);
        v[19] = LibC.call(m, "llvm.bswap.i32", new long[]{v[18]});
        v[20] = ((v[19] << v[17])) & 4294967295L;
        m.store(v[3], v[20], 4);
        v[21] = (v[1] + (Heap.s(0L, 32) * 32L) + 16L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[22]) & 4294967295L;
        v[24] = ((v[15] ^ v[23])) & 4294967295L;
        v[25] = ((v[24] & 4096L)) & 4294967295L;
        v[26] = v[25] == 0L ? 1L : 0L;
        return v[26] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[27] = (v[1] + (Heap.s(0L, 32) * 32L) + 24L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = (v[28] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = (v[1] + (Heap.s(0L, 32) * 32L) + 28L) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = Dispatch.call(m, v[30], new long[]{v[28], v[32]});
        v[34] = (v[28] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = m.load(v[21], 4);
        v[37] = Dispatch.call(m, v[35], new long[]{v[28], v[36], 4096L});
        v[38] = m.load(v[31], 4);
        v[39] = ((v[38] + 4096L)) & 4294967295L;
        m.store(v[31], v[39], 4);
        v[40] = m.load(v[21], 4);
        v[41] = m.load(v[40], 4);
        m.store(v[1], v[41], 4);
        v[42] = (v[40] + (Heap.s(4096L, 32) * 1L)) & 4294967295L;
        v[43] = (v[42]) & 4294967295L;
        v[44] = m.load(v[13], 4);
        v[45] = ((v[44] & v[43])) & 4294967295L;
        v[46] = (v[45]) & 4294967295L;
        m.store(v[21], v[46], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[47] = ((32L - v[2])) & 4294967295L;
        v[48] = ((v[4] >>> v[47])) & 4294967295L;
        v[49] = v[48];
        return -1;
    }
}
