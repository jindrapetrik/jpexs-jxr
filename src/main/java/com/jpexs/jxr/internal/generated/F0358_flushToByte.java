package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: flushToByte.
 */
public final class F0358_flushToByte {

    private F0358_flushToByte() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[21];
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
                        throw new IllegalStateException("Invalid block in flushToByte");
                }
                previous = old;
                if (pc < 0) {
                    return v[20];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = ((0L - v[2])) & 4294967295L;
        v[4] = ((v[3] & 7L)) & 4294967295L;
        v[5] = ((v[4] + v[2])) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = ((v[5] >>> 3L)) & 4294967295L;
        v[9] = (v[7] + (Heap.s(v[8], 32) * 1L)) & 4294967295L;
        v[10] = (v[9]) & 4294967295L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[12] & v[10])) & 4294967295L;
        v[14] = (v[13]) & 4294967295L;
        m.store(v[6], v[14], 4);
        v[15] = ((v[5] & 15L)) & 4294967295L;
        m.store(v[1], v[15], 4);
        v[16] = m.load(v[14], 4);
        v[17] = LibC.call(m, "llvm.bswap.i32", new long[]{v[16]});
        v[18] = ((v[17] << v[15])) & 4294967295L;
        v[19] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        m.store(v[19], v[18], 4);
        v[20] = 0L;
        return -1;
    }
}
