package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_Release.
 */
public final class F0068_PKImageEncode_Release {

    private F0068_PKImageEncode_Release() {
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_Release");
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
        v[1] = m.load(v[0], 4);
        v[2] = (v[1] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[3] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Dispatch.call(m, v[5], new long[]{v[2]});
        v[7] = m.load(v[0], 4);
        LibC.call(m, "free", new long[]{v[7]});
        m.store(v[0], 0L, 4);
        v[8] = 0L;
        return -1;
    }
}
