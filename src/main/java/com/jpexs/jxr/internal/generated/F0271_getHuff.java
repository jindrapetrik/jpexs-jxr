package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getHuff.
 */
public final class F0271_getHuff {

    private F0271_getHuff() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[22];
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
                        throw new IllegalStateException("Invalid block in getHuff");
                }
                previous = old;
                if (pc < 0) {
                    return v[21];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = F0353_peekBit16.run(m, v[1], 5L);
        v[3] = (v[0] + (Heap.s(v[2], 32) * 2L)) & 4294967295L;
        v[4] = m.load(v[3], 2);
        v[5] = (Heap.s(v[4], 16)) & 4294967295L;
        v[6] = Heap.s(v[4], 16) < Heap.s(0L, 16) ? 1L : 0L;
        v[7] = ((v[5] & 7L)) & 4294967295L;
        v[8] = v[6] != 0 ? 5L : v[7];
        v[9] = F0354_flushBit16.run(m, v[1], v[8]);
        v[10] = ((Heap.s(v[5], 32) >> 3L)) & 4294967295L;
        v[11] = Heap.s(v[10], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[11] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(32768L, 32) * 2L)) & 4294967295L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi13 = (previous == 2 ? v[18] : v[5]);
        v[13] = phi13;
        v[14] = F0299_getBit16.run(m, v[1], 1L);
        v[15] = (v[12] + (Heap.s(v[13], 32) * 2L)) & 4294967295L;
        v[16] = (v[15] + (Heap.s(v[14], 32) * 2L)) & 4294967295L;
        v[17] = m.load(v[16], 2);
        v[18] = (Heap.s(v[17], 16)) & 4294967295L;
        v[19] = Heap.s(v[17], 16) < Heap.s(0L, 16) ? 1L : 0L;
        return v[19] != 0 ? 2 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi20 = (previous == 0 ? v[10] : v[18]);
        v[20] = phi20;
        v[21] = v[20];
        return -1;
    }
}
