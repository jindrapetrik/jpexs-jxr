package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: EOSWS_Memory.
 */
public final class F0324_EOSWS_Memory {

    private F0324_EOSWS_Memory() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[8];
        v[0] = a0;
        int frame = m.stackPosition();
        int pc = 0, previous = -1;
        try {
            while (true) {
                int old = pc;
                switch (pc) {
                    case 0:
                        pc = b0(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in EOSWS_Memory");
                }
                previous = old;
                if (pc < 0) {
                    return v[7];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = v[2] <= v[4] ? 1L : 0L;
        v[6] = (v[5]) & 4294967295L;
        v[7] = v[6];
        return -1;
    }
}
