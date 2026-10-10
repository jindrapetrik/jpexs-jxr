package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PutUShort.
 */
public final class F0242_PutUShort {

    private F0242_PutUShort() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[19];
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
                        throw new IllegalStateException("Invalid block in PutUShort");
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
        v[3] = m.stack(1L * 1L, 1);
        v[4] = (v[2]) & 255L;
        m.store(v[3], v[4], 1);
        v[5] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = Dispatch.call(m, v[6], new long[]{v[0], v[1]});
        v[8] = Heap.s(v[7], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = (v[0] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = Dispatch.call(m, v[10], new long[]{v[0], v[3], 1L});
        v[12] = Heap.s(v[11], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[12] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = ((v[2] >>> 8L)) & 65535L;
        v[14] = (v[13]) & 255L;
        m.store(v[3], v[14], 1);
        v[15] = m.load(v[9], 4);
        v[16] = Dispatch.call(m, v[15], new long[]{v[0], v[3], 1L});
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi17 = (previous == 0 ? v[7] : (previous == 1 ? v[11] : v[16]));
        v[17] = phi17;
        v[18] = v[17];
        return -1;
    }
}
