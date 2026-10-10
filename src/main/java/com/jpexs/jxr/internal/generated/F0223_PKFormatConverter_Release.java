package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKFormatConverter_Release.
 */
public final class F0223_PKFormatConverter_Release {

    private F0223_PKFormatConverter_Release() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[3];
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
                        throw new IllegalStateException("Invalid block in PKFormatConverter_Release");
                }
                previous = old;
                if (pc < 0) {
                    return v[2];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = F0032_PKFree.run(m, v[0]);
        v[2] = v[1];
        return -1;
    }
}
