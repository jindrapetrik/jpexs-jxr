package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: QUANT.
 */
public final class F0483_QUANT {

    private F0483_QUANT() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[18];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                        throw new IllegalStateException("Invalid block in QUANT");
                }
                previous = old;
                if (pc < 0) {
                    return v[17];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = ((v[0] >>> 31L)) & 4294967295L;
        v[5] = ((Heap.s(v[0], 32) >> 31L)) & 4294967295L;
        v[6] = ((v[5] ^ v[0])) & 4294967295L;
        v[7] = ((v[4] + v[1])) & 4294967295L;
        v[8] = ((v[7] + v[6])) & 4294967295L;
        v[9] = v[8];
        v[10] = v[2];
        v[11] = (v[9] * v[10]);
        v[12] = (v[11] >>> 32L);
        v[13] = (v[12]) & 4294967295L;
        v[14] = ((v[13] >>> v[3])) & 4294967295L;
        v[15] = ((v[14] ^ v[5])) & 4294967295L;
        v[16] = ((v[15] - v[5])) & 4294967295L;
        v[17] = v[16];
        return -1;
    }
}
