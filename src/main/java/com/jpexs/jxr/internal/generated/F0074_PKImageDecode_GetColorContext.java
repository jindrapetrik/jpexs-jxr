package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_GetColorContext.
 */
public final class F0074_PKImageDecode_GetColorContext {

    private F0074_PKImageDecode_GetColorContext() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[4];
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
                        throw new IllegalStateException("Invalid block in PKImageDecode_GetColorContext");
                }
                previous = old;
                if (pc < 0) {
                    return v[3];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = 4294967294L;
        return -1;
    }
}
