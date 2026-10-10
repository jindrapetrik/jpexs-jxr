package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writeIS.
 */
public final class F0365_writeIS {

    private F0365_writeIS() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[26];
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
                        throw new IllegalStateException("Invalid block in writeIS");
                }
                previous = old;
                if (pc < 0) {
                    return v[25];
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
        return v[16] != 0 ? 3 : 2;
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
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi24 = (previous == 2 ? v[15] : (previous == 0 ? 0L : v[15]));
        v[24] = phi24;
        v[25] = v[24];
        return -1;
    }
}
