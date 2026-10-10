package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: QUANT_Mulless.
 */
public final class F0481_QUANT_Mulless {

    private F0481_QUANT_Mulless() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[12];
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
                    default:
                        throw new IllegalStateException("Invalid block in QUANT_Mulless");
                }
                previous = old;
                if (pc < 0) {
                    return v[11];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((v[0] >>> 31L)) & 4294967295L;
        v[4] = ((Heap.s(v[0], 32) >> 31L)) & 4294967295L;
        v[5] = ((v[4] ^ v[0])) & 4294967295L;
        v[6] = ((v[3] + v[1])) & 4294967295L;
        v[7] = ((v[6] + v[5])) & 4294967295L;
        v[8] = ((Heap.s(v[7], 32) >> v[2])) & 4294967295L;
        v[9] = ((v[8] ^ v[4])) & 4294967295L;
        v[10] = ((v[9] - v[4])) & 4294967295L;
        v[11] = v[10];
        return -1;
    }
}
