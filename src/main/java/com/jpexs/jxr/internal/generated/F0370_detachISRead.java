package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: detachISRead.
 */
public final class F0370_detachISRead {

    private F0370_detachISRead() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[66];
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
                        throw new IllegalStateException("Invalid block in detachISRead");
                }
                previous = old;
                if (pc < 0) {
                    return v[65];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[1] + (Heap.s(0L, 32) * 32L) + 24L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[1] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((0L - v[5])) & 4294967295L;
        v[7] = ((v[6] & 7L)) & 4294967295L;
        v[8] = ((v[7] + v[5])) & 4294967295L;
        v[9] = (v[1] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((v[8] >>> 3L)) & 4294967295L;
        v[12] = (v[10] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        v[13] = (v[12]) & 4294967295L;
        v[14] = (v[1] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = ((v[15] & v[13])) & 4294967295L;
        v[17] = (v[16]) & 4294967295L;
        m.store(v[9], v[17], 4);
        v[18] = ((v[8] & 15L)) & 4294967295L;
        m.store(v[4], v[18], 4);
        v[19] = m.load(v[17], 4);
        v[20] = LibC.call(m, "llvm.bswap.i32", new long[]{v[19]});
        v[21] = ((v[20] << v[18])) & 4294967295L;
        v[22] = (v[1] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        m.store(v[22], v[21], 4);
        v[23] = (v[1] + (Heap.s(0L, 32) * 32L) + 16L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = (v[24]) & 4294967295L;
        v[26] = ((v[16] ^ v[25])) & 4294967295L;
        v[27] = ((v[26] & 4096L)) & 4294967295L;
        v[28] = v[27] == 0L ? 1L : 0L;
        return v[28] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[29] = (v[1] + (Heap.s(0L, 32) * 32L) + 28L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[31] = (v[3] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = (v[1] + (Heap.s(0L, 32) * 32L) + 28L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = Dispatch.call(m, v[32], new long[]{v[3], v[34]});
        v[36] = (v[3] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = m.load(v[23], 4);
        v[39] = Dispatch.call(m, v[37], new long[]{v[3], v[38], 4096L});
        v[40] = m.load(v[33], 4);
        v[41] = ((v[40] + 4096L)) & 4294967295L;
        m.store(v[33], v[41], 4);
        v[42] = m.load(v[23], 4);
        v[43] = m.load(v[42], 4);
        m.store(v[1], v[43], 4);
        v[44] = (v[42] + (Heap.s(4096L, 32) * 1L)) & 4294967295L;
        v[45] = (v[44]) & 4294967295L;
        v[46] = m.load(v[14], 4);
        v[47] = ((v[46] & v[45])) & 4294967295L;
        v[48] = (v[47]) & 4294967295L;
        m.store(v[23], v[48], 4);
        v[49] = m.load(v[9], 4);
        v[50] = m.load(v[4], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi51 = (previous == 1 ? v[30] : v[41]);
        long phi52 = (previous == 1 ? v[18] : v[50]);
        long phi53 = (previous == 1 ? v[17] : v[49]);
        long phi54 = (previous == 1 ? v[24] : v[48]);
        v[51] = phi51;
        v[52] = phi52;
        v[53] = phi53;
        v[54] = phi54;
        v[55] = (v[54] + (Heap.s(8192L, 32) * 1L)) & 4294967295L;
        v[56] = ((v[52] >>> 3L)) & 4294967295L;
        v[57] = (v[53] + (Heap.s(v[56], 32) * 1L)) & 4294967295L;
        v[58] = (v[55]) & 4294967295L;
        v[59] = (v[57]) & 4294967295L;
        v[60] = (v[3] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = ((v[51] - v[58])) & 4294967295L;
        v[63] = ((v[62] + v[59])) & 4294967295L;
        v[64] = Dispatch.call(m, v[61], new long[]{v[3], v[63]});
        m.store(v[2], 0L, 4);
        v[65] = 0L;
        return -1;
    }
}
