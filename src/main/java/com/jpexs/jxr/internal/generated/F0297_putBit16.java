package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: putBit16.
 */
public final class F0297_putBit16 {

    private F0297_putBit16() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[29];
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
                        throw new IllegalStateException("Invalid block in putBit16");
                }
                previous = old;
                if (pc < 0) {
                    return v[28];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((4294967295L << v[2])) & 4294967295L;
        v[4] = ((v[3] ^ 4294967295L)) & 4294967295L;
        v[5] = ((v[4] & v[1])) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = ((v[7] << v[2])) & 4294967295L;
        v[9] = ((v[8] | v[5])) & 4294967295L;
        m.store(v[6], v[9], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = ((v[11] + v[2])) & 4294967295L;
        v[13] = ((32L - v[12])) & 4294967295L;
        v[14] = ((v[9] << v[13])) & 4294967295L;
        v[15] = LibC.call(m, "llvm.bswap.i32", new long[]{v[14]});
        v[16] = (v[15]) & 65535L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        m.store(v[18], v[16], 2);
        v[19] = ((v[12] >>> 3L)) & 4294967295L;
        v[20] = ((v[19] & 2L)) & 4294967295L;
        v[21] = (v[18] + (Heap.s(v[20], 32) * 1L)) & 4294967295L;
        v[22] = (v[21]) & 4294967295L;
        v[23] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = ((v[24] & v[22])) & 4294967295L;
        v[26] = (v[25]) & 4294967295L;
        m.store(v[17], v[26], 4);
        v[27] = ((v[12] & 15L)) & 4294967295L;
        m.store(v[10], v[27], 4);
        return -1;
    }
}
