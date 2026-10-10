package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Allocate.
 */
public final class F0002_Allocate {

    private F0002_Allocate() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[13];
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
                    case 3:
                        pc = b3(m, v, previous);
                        break;
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in Allocate");
                }
                previous = old;
                if (pc < 0) {
                    return v[12];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = LibC.call(m, "malloc", new long[]{44L});
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 4 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = ((v[0] + 4294967040L)) & 4294967295L;
        v[5] = v[4] < 4294967041L ? 1L : 0L;
        return v[5] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[6] = LibC.call(m, "memset", new long[]{v[2], 0L, 44L});
        m.store(v[2], v[0], 4);
        v[7] = (v[2] + (Heap.s(0L, 32) * 44L) + 8L) & 4294967295L;
        m.store(v[7], 0L, 4);
        v[8] = (v[2] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        m.store(v[8], 0L, 4);
        v[9] = (v[2] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        m.store(v[9], 0L, 4);
        v[10] = (v[2] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        m.store(v[10], 0L, 4);
        return 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[2]});
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi11 = (previous == 3 ? 0L : (previous == 2 ? v[2] : 0L));
        v[11] = phi11;
        v[12] = v[11];
        return -1;
    }
}
