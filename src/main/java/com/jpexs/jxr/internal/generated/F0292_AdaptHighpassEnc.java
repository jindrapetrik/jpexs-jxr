package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: AdaptHighpassEnc.
 */
public final class F0292_AdaptHighpassEnc {

    private F0292_AdaptHighpassEnc() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[22];
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
                        throw new IllegalStateException("Invalid block in AdaptHighpassEnc");
                }
                previous = old;
                if (pc < 0) {
                    return v[21];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 592L) + 16L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        F0005_AdaptDiscriminant.run(m, v[2]);
        v[3] = (v[0] + (Heap.s(0L, 32) * 592L) + 20L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        F0005_AdaptDiscriminant.run(m, v[4]);
        v[5] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[6] = m.load(v[5], 4);
        F0005_AdaptDiscriminant.run(m, v[6]);
        v[7] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        F0005_AdaptDiscriminant.run(m, v[8]);
        v[9] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        F0005_AdaptDiscriminant.run(m, v[10]);
        v[11] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[12] = m.load(v[11], 4);
        F0005_AdaptDiscriminant.run(m, v[12]);
        v[13] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(17L, 32) * 4L)) & 4294967295L;
        v[14] = m.load(v[13], 4);
        F0005_AdaptDiscriminant.run(m, v[14]);
        v[15] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(18L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        F0005_AdaptDiscriminant.run(m, v[16]);
        v[17] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(19L, 32) * 4L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        F0005_AdaptDiscriminant.run(m, v[18]);
        v[19] = (v[0] + (Heap.s(0L, 32) * 592L) + 24L + (Heap.s(20L, 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        F0005_AdaptDiscriminant.run(m, v[20]);
        return -1;
    }
}
