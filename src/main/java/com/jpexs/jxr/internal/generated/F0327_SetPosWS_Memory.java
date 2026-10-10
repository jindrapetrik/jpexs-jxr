package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: SetPosWS_Memory.
 */
public final class F0327_SetPosWS_Memory {

    private F0327_SetPosWS_Memory() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[4];
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
                        throw new IllegalStateException("Invalid block in SetPosWS_Memory");
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
        v[2] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        m.store(v[2], v[1], 4);
        v[3] = 0L;
        return -1;
    }
}
