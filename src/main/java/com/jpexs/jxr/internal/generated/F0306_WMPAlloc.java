package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: WMPAlloc.
 */
public final class F0306_WMPAlloc {

    private F0306_WMPAlloc() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[6];
        v[0] = a0;
        v[1] = a1;
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
                        throw new IllegalStateException("Invalid block in WMPAlloc");
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
        v[2] = LibC.call(m, "calloc", new long[]{1L, v[1]});
        m.store(v[0], v[2], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        v[4] = v[3] != 0 ? 4294967195L : 0L;
        v[5] = v[4];
        return -1;
    }
}
