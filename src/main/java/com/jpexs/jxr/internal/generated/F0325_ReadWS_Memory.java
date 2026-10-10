package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ReadWS_Memory.
 */
public final class F0325_ReadWS_Memory {

    private F0325_ReadWS_Memory() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[20];
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
                        throw new IllegalStateException("Invalid block in ReadWS_Memory");
                }
                previous = old;
                if (pc < 0) {
                    return v[19];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = v[4] < v[6] ? 1L : 0L;
        return v[7] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = ((v[6] + v[2])) & 4294967295L;
        v[9] = v[8] < v[6] ? 1L : 0L;
        return v[9] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = v[4] < v[8] ? 1L : 0L;
        v[11] = ((v[4] - v[6])) & 4294967295L;
        v[12] = v[10] != 0 ? v[11] : v[2];
        v[13] = m.load(v[0], 4);
        v[14] = (v[13] + (Heap.s(v[6], 32) * 1L)) & 4294967295L;
        v[15] = LibC.call(m, "memcpy", new long[]{v[1], v[14], v[12]});
        v[16] = m.load(v[5], 4);
        v[17] = ((v[16] + v[12])) & 4294967295L;
        m.store(v[5], v[17], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi18 = (previous == 0 ? 0L : (previous == 1 ? 4294967193L : 0L));
        v[18] = phi18;
        v[19] = v[18];
        return -1;
    }
}
