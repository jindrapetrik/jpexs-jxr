package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKFormatConverter_GetResolution.
 */
public final class F0220_PKFormatConverter_GetResolution {

    private F0220_PKFormatConverter_GetResolution() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[9];
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
                        throw new IllegalStateException("Invalid block in PKFormatConverter_GetResolution");
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
        v[3] = (v[0] + (Heap.s(0L, 32) * 56L) + 36L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[4] + (Heap.s(0L, 32) * 66224L) + 12L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = Dispatch.call(m, v[6], new long[]{v[4], v[1], v[2]});
        v[8] = v[7];
        return -1;
    }
}
