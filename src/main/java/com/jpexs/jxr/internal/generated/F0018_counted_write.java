package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: counted_write.
 */
public final class F0018_counted_write {

    private F0018_counted_write() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[11];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
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
                    default:
                        throw new IllegalStateException("Invalid block in counted_write");
                }
                previous = old;
                if (pc < 0) {
                    return v[10];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = F0326_WriteWS_Memory.run(m, v[0], v[1], v[2]);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[6] > v[8] ? 1L : 0L;
        return v[9] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        m.store(v[7], v[6], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[10] = v[3];
        return -1;
    }
}
