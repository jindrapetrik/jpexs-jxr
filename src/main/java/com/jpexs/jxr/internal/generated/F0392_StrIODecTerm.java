package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: StrIODecTerm.
 */
public final class F0392_StrIODecTerm {

    private F0392_StrIODecTerm() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[9];
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
                        throw new IllegalStateException("Invalid block in StrIODecTerm");
                }
                previous = old;
                if (pc < 0) {
                    return v[8];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = F0370_detachISRead.run(m, v[0], v[2]);
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34296L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        LibC.call(m, "free", new long[]{v[5]});
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34264L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        LibC.call(m, "free", new long[]{v[7]});
        v[8] = 0L;
        return -1;
    }
}
