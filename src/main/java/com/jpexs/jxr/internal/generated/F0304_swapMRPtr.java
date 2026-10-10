package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: swapMRPtr.
 */
public final class F0304_swapMRPtr {

    private F0304_swapMRPtr() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[18];
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in swapMRPtr");
                }
                previous = old;
                if (pc < 0) {
                    return v[17];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.stack(64L * 1L, 4);
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34524L) & 4294967295L;
        v[6] = LibC.call(m, "memcpy", new long[]{v[1], v[5], 64L});
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34588L) & 4294967295L;
        v[8] = LibC.call(m, "memcpy", new long[]{v[5], v[7], 64L});
        v[9] = LibC.call(m, "memcpy", new long[]{v[7], v[1], 64L});
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = (v[11] + (Heap.s(0L, 32) * 35064L) + 34524L) & 4294967295L;
        v[13] = (v[11] + (Heap.s(0L, 32) * 35064L) + 34588L) & 4294967295L;
        v[14] = LibC.call(m, "memcpy", new long[]{v[1], v[12], 64L});
        v[15] = LibC.call(m, "memcpy", new long[]{v[12], v[13], 64L});
        v[16] = LibC.call(m, "memcpy", new long[]{v[13], v[1], 64L});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return -1;
    }
}
