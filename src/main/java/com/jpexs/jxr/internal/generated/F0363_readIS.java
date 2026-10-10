package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readIS.
 */
public final class F0363_readIS {

    private F0363_readIS() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[33];
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
                        throw new IllegalStateException("Invalid block in readIS");
                }
                previous = old;
                if (pc < 0) {
                    return v[32];
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
        return v[10] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = (v[1] + (Heap.s(0L, 32) * 32L) + 24L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = (v[12] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[1] + (Heap.s(0L, 32) * 32L) + 28L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = Dispatch.call(m, v[14], new long[]{v[12], v[16]});
        v[18] = (v[12] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = m.load(v[2], 4);
        v[21] = Dispatch.call(m, v[19], new long[]{v[12], v[20], 4096L});
        v[22] = m.load(v[15], 4);
        v[23] = ((v[22] + 4096L)) & 4294967295L;
        m.store(v[15], v[23], 4);
        v[24] = m.load(v[2], 4);
        v[25] = m.load(v[24], 4);
        m.store(v[1], v[25], 4);
        v[26] = (v[24] + (Heap.s(4096L, 32) * 1L)) & 4294967295L;
        v[27] = (v[26]) & 4294967295L;
        v[28] = (v[1] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = ((v[29] & v[27])) & 4294967295L;
        v[31] = (v[30]) & 4294967295L;
        m.store(v[2], v[31], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[32] = 0L;
        return -1;
    }
}
