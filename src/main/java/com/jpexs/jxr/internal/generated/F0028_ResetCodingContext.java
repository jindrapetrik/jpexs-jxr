package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ResetCodingContext.
 */
public final class F0028_ResetCodingContext {

    private F0028_ResetCodingContext() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[23];
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
                        throw new IllegalStateException("Invalid block in ResetCodingContext");
                }
                previous = old;
                if (pc < 0) {
                    return v[22];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 592L) + 492L) & 4294967295L;
        v[2] = LibC.call(m, "memset", new long[]{v[1], 0L, 20L});
        v[3] = (v[0] + (Heap.s(0L, 32) * 592L) + 492L + 16L) & 4294967295L;
        m.store(v[3], 3L, 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 592L) + 512L) & 4294967295L;
        v[5] = LibC.call(m, "memset", new long[]{v[4], 0L, 20L});
        v[6] = (v[0] + (Heap.s(0L, 32) * 592L) + 512L + 16L) & 4294967295L;
        m.store(v[6], 2L, 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 592L) + 512L + 8L) & 4294967295L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 592L) + 512L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[8], 4L, 4);
        m.store(v[7], 4L, 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 592L) + 532L) & 4294967295L;
        v[10] = LibC.call(m, "memset", new long[]{v[9], 0L, 20L});
        v[11] = (v[0] + (Heap.s(0L, 32) * 592L) + 532L + 16L) & 4294967295L;
        m.store(v[11], 1L, 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 592L) + 532L + 8L) & 4294967295L;
        v[13] = (v[0] + (Heap.s(0L, 32) * 592L) + 532L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[13], 8L, 4);
        m.store(v[12], 8L, 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 592L) + 552L) & 4294967295L;
        m.store(v[14], 1L, 4);
        v[15] = (v[0] + (Heap.s(0L, 32) * 592L) + 556L) & 4294967295L;
        m.store(v[15], 1L, 4);
        v[16] = (v[0] + (Heap.s(0L, 32) * 592L) + 560L) & 4294967295L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 592L) + 560L + 0L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[17], 4294967292L, 4);
        m.store(v[16], 4294967292L, 4);
        v[18] = (v[0] + (Heap.s(0L, 32) * 592L) + 560L + 8L) & 4294967295L;
        v[19] = (v[0] + (Heap.s(0L, 32) * 592L) + 560L + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[19], 4L, 4);
        m.store(v[18], 4L, 4);
        v[20] = (v[0] + (Heap.s(0L, 32) * 592L) + 560L + 16L) & 4294967295L;
        v[21] = (v[0] + (Heap.s(0L, 32) * 592L) + 560L + 16L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[21], 0L, 4);
        m.store(v[20], 0L, 4);
        return -1;
    }
}
