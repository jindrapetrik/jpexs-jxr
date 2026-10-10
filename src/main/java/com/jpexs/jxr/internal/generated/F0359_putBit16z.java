package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: putBit16z.
 */
public final class F0359_putBit16z {

    private F0359_putBit16z() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[26];
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
                        throw new IllegalStateException("Invalid block in putBit16z");
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
        v[3] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = ((v[4] << v[2])) & 4294967295L;
        v[6] = ((v[5] | v[1])) & 4294967295L;
        m.store(v[3], v[6], 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] + v[2])) & 4294967295L;
        v[10] = ((32L - v[9])) & 4294967295L;
        v[11] = ((v[6] << v[10])) & 4294967295L;
        v[12] = LibC.call(m, "llvm.bswap.i32", new long[]{v[11]});
        v[13] = (v[12]) & 65535L;
        v[14] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        m.store(v[15], v[13], 2);
        v[16] = ((v[9] >>> 3L)) & 4294967295L;
        v[17] = ((v[16] & 2L)) & 4294967295L;
        v[18] = (v[15] + (Heap.s(v[17], 32) * 1L)) & 4294967295L;
        v[19] = (v[18]) & 4294967295L;
        v[20] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((v[21] & v[19])) & 4294967295L;
        v[23] = (v[22]) & 4294967295L;
        m.store(v[14], v[23], 4);
        v[24] = ((v[9] & 15L)) & 4294967295L;
        m.store(v[7], v[24], 4);
        return -1;
    }
}
