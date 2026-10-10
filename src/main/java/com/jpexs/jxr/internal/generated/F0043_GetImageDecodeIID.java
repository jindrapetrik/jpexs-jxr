package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetImageDecodeIID.
 */
public final class F0043_GetImageDecodeIID {

    private F0043_GetImageDecodeIID() {
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in GetImageDecodeIID");
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
        v[2] = m.stack(4L * 1L, 4);
        m.store(v[2], 0L, 4);
        v[3] = F0041_GetIIDInfo.run(m, v[0], v[2]);
        v[4] = Heap.s(v[3], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = m.load(v[2], 4);
        v[6] = (v[5] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        m.store(v[1], v[7], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = v[3];
        return -1;
    }
}
