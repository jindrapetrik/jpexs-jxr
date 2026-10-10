package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetPosWS_Memory.
 */
public final class F0328_GetPosWS_Memory {

    private F0328_GetPosWS_Memory() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[5];
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
                        throw new IllegalStateException("Invalid block in GetPosWS_Memory");
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
        v[2] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        m.store(v[1], v[3], 4);
        v[4] = 0L;
        return -1;
    }
}
