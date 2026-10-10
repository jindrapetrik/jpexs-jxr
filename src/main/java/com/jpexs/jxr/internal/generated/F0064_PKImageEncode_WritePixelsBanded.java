package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_WritePixelsBanded.
 */
public final class F0064_PKImageEncode_WritePixelsBanded {

    private F0064_PKImageEncode_WritePixelsBanded() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[6];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_WritePixelsBanded");
                }
                previous = old;
                if (pc < 0) {
                    return v[5];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = 4294967293L;
        return -1;
    }
}
