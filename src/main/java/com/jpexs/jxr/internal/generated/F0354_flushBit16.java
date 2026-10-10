package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: flushBit16.
 */
public final class F0354_flushBit16 {

    private F0354_flushBit16() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[20];
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
                    default:
                        throw new IllegalStateException("Invalid block in flushBit16");
                }
                previous = old;
                if (pc < 0) {
                    return v[19];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = ((v[3] + v[1])) & 4294967295L;
        v[5] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = ((v[4] >>> 3L)) & 4294967295L;
        v[8] = (v[6] + (Heap.s(v[7], 32) * 1L)) & 4294967295L;
        v[9] = (v[8]) & 4294967295L;
        v[10] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = ((v[11] & v[9])) & 4294967295L;
        v[13] = (v[12]) & 4294967295L;
        m.store(v[5], v[13], 4);
        v[14] = ((v[4] & 15L)) & 4294967295L;
        m.store(v[2], v[14], 4);
        v[15] = m.load(v[13], 4);
        v[16] = LibC.call(m, "llvm.bswap.i32", new long[]{v[15]});
        v[17] = ((v[16] << v[14])) & 4294967295L;
        v[18] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        m.store(v[18], v[17], 4);
        v[19] = 0L;
        return -1;
    }
}
