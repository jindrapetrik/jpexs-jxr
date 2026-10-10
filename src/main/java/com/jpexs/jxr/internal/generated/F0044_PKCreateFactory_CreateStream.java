package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKCreateFactory_CreateStream.
 */
public final class F0044_PKCreateFactory_CreateStream {

    private F0044_PKCreateFactory_CreateStream() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[5];
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
                        throw new IllegalStateException("Invalid block in PKCreateFactory_CreateStream");
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
        v[1] = LibC.call(m, "calloc", new long[]{1L, 12L});
        m.store(v[0], v[1], 4);
        v[2] = v[1] == 0L ? 1L : 0L;
        v[3] = v[2] != 0 ? 4294967195L : 0L;
        v[4] = v[3];
        return -1;
    }
}
