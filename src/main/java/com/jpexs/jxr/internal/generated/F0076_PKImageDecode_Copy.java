package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_Copy.
 */
public final class F0076_PKImageDecode_Copy {

    private F0076_PKImageDecode_Copy() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[5];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                        throw new IllegalStateException("Invalid block in PKImageDecode_Copy");
                }
                previous = old;
                if (pc < 0) {
                    return v[4];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = 4294967293L;
        return -1;
    }
}
