package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getBool16.
 */
public final class F0355_getBool16 {

    private F0355_getBool16() {
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
                        throw new IllegalStateException("Invalid block in getBool16");
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
        v[1] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = ((v[2] >>> 31L)) & 4294967295L;
        v[4] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((v[5] + 1L)) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[6] >>> 3L)) & 4294967295L;
        v[10] = (v[8] + (Heap.s(v[9], 32) * 1L)) & 4294967295L;
        v[11] = (v[10]) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[13] & v[11])) & 4294967295L;
        v[15] = (v[14]) & 4294967295L;
        m.store(v[7], v[15], 4);
        v[16] = ((v[6] & 15L)) & 4294967295L;
        m.store(v[4], v[16], 4);
        v[17] = m.load(v[15], 4);
        v[18] = LibC.call(m, "llvm.bswap.i32", new long[]{v[17]});
        v[19] = ((v[18] << v[16])) & 4294967295L;
        m.store(v[1], v[19], 4);
        v[20] = v[3];
        return -1;
    }
}
