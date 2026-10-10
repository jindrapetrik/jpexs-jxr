package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetPosWS_List.
 */
public final class F0334_GetPosWS_List {

    private F0334_GetPosWS_List() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[9];
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
                        throw new IllegalStateException("Invalid block in GetPosWS_List");
                }
                previous = old;
                if (pc < 0) {
                    return v[8];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((v[5] << 12L)) & 4294967295L;
        v[7] = ((v[6] + v[3])) & 4294967295L;
        m.store(v[1], v[7], 4);
        v[8] = 0L;
        return -1;
    }
}
