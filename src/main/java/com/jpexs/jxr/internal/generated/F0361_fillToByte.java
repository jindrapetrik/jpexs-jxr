package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: fillToByte.
 */
public final class F0361_fillToByte {

    private F0361_fillToByte() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[25];
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
                        throw new IllegalStateException("Invalid block in fillToByte");
                }
                previous = old;
                if (pc < 0) {
                    return v[24];
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
        v[5] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = ((v[6] << v[4])) & 4294967295L;
        m.store(v[5], v[7], 4);
        v[8] = ((v[4] + v[2])) & 4294967295L;
        v[9] = ((32L - v[8])) & 4294967295L;
        v[10] = ((v[7] << v[9])) & 4294967295L;
        v[11] = LibC.call(m, "llvm.bswap.i32", new long[]{v[10]});
        v[12] = (v[11]) & 65535L;
        v[13] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        m.store(v[14], v[12], 2);
        v[15] = ((v[8] >>> 3L)) & 4294967295L;
        v[16] = ((v[15] & 2L)) & 4294967295L;
        v[17] = (v[14] + (Heap.s(v[16], 32) * 1L)) & 4294967295L;
        v[18] = (v[17]) & 4294967295L;
        v[19] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = ((v[20] & v[18])) & 4294967295L;
        v[22] = (v[21]) & 4294967295L;
        m.store(v[13], v[22], 4);
        v[23] = ((v[8] & 15L)) & 4294967295L;
        m.store(v[1], v[23], 4);
        return -1;
    }
}
