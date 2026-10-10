package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: initMRPtr.
 */
public final class F0301_initMRPtr {

    private F0301_initMRPtr() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[19];
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
                        throw new IllegalStateException("Invalid block in initMRPtr");
                }
                previous = old;
                if (pc < 0) {
                    return v[18];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34652L) & 4294967295L;
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34524L) & 4294967295L;
        v[6] = LibC.call(m, "memcpy", new long[]{v[4], v[5], 64L});
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L) & 4294967295L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34588L) & 4294967295L;
        v[9] = LibC.call(m, "memcpy", new long[]{v[7], v[8], 64L});
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        return v[3] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = (v[11] + (Heap.s(0L, 32) * 35064L) + 34652L) & 4294967295L;
        v[13] = (v[11] + (Heap.s(0L, 32) * 35064L) + 34524L) & 4294967295L;
        v[14] = (v[11] + (Heap.s(0L, 32) * 35064L) + 34716L) & 4294967295L;
        v[15] = (v[11] + (Heap.s(0L, 32) * 35064L) + 34588L) & 4294967295L;
        v[16] = LibC.call(m, "memcpy", new long[]{v[12], v[13], 64L});
        v[17] = LibC.call(m, "memcpy", new long[]{v[14], v[15], 64L});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return -1;
    }
}
