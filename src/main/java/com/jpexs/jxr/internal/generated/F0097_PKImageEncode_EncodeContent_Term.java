package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_EncodeContent_Term.
 */
public final class F0097_PKImageEncode_EncodeContent_Term {

    private F0097_PKImageEncode_EncodeContent_Term() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[7];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_EncodeContent_Term");
                }
                previous = old;
                if (pc < 0) {
                    return v[6];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33020L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = F0433_ImageStrEncTerm.run(m, v[2]);
        v[4] = v[3] != 0L ? 1L : 0L;
        v[5] = (Heap.s(v[4], 1)) & 4294967295L;
        v[6] = v[5];
        return -1;
    }
}
