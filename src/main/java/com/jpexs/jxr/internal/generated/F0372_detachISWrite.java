package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: detachISWrite.
 */
public final class F0372_detachISWrite {

    private F0372_detachISWrite() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[42];
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
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    case 5:
                        pc = b5(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in detachISWrite");
                }
                previous = old;
                if (pc < 0) {
                    return v[41];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[1] + (Heap.s(0L, 32) * 32L) + 16L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[3]) & 4294967295L;
        v[5] = (v[1] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[6]) & 4294967295L;
        v[8] = ((v[7] ^ v[4])) & 4294967295L;
        v[9] = ((v[8] & 4096L)) & 4294967295L;
        v[10] = v[9] == 0L ? 1L : 0L;
        return v[10] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = (v[1] + (Heap.s(0L, 32) * 32L) + 24L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = (v[12] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = Dispatch.call(m, v[14], new long[]{v[12], v[3], 4096L});
        v[16] = Heap.s(v[15], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[16] != 0 ? 5 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[17] = m.load(v[2], 4);
        v[18] = (v[17] + (Heap.s(4096L, 32) * 1L)) & 4294967295L;
        v[19] = (v[18]) & 4294967295L;
        v[20] = (v[1] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((v[21] & v[19])) & 4294967295L;
        v[23] = (v[22]) & 4294967295L;
        m.store(v[2], v[23], 4);
        v[24] = m.load(v[5], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi25 = (previous == 2 ? v[22] : v[4]);
        long phi26 = (previous == 2 ? v[24] : v[6]);
        long phi27 = (previous == 2 ? v[23] : v[3]);
        v[25] = phi25;
        v[26] = phi26;
        v[27] = phi27;
        v[28] = (v[1] + (Heap.s(0L, 32) * 32L) + 24L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = (v[29] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[1] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((v[33] >>> 3L)) & 4294967295L;
        v[35] = (v[26] + (Heap.s(v[34], 32) * 1L)) & 4294967295L;
        v[36] = (v[35]) & 4294967295L;
        v[37] = ((v[36] - v[25])) & 4294967295L;
        v[38] = Dispatch.call(m, v[31], new long[]{v[29], v[27], v[37]});
        v[39] = Heap.s(v[38], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[39] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        m.store(v[28], 0L, 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi40 = (previous == 4 ? v[38] : (previous == 3 ? v[38] : v[15]));
        v[40] = phi40;
        v[41] = v[40];
        return -1;
    }
}
