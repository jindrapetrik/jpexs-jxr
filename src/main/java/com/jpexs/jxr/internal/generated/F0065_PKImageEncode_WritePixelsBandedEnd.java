package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_WritePixelsBandedEnd.
 */
public final class F0065_PKImageEncode_WritePixelsBandedEnd {

    private F0065_PKImageEncode_WritePixelsBandedEnd() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[2];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_WritePixelsBandedEnd");
                }
                previous = old;
                if (pc < 0) {
                    return v[1];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = 4294967293L;
        return -1;
    }
}
