package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: isTileBoundary.
 */
public final class F0260_isTileBoundary {

    private F0260_isTileBoundary() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[18];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                        throw new IllegalStateException("Invalid block in isTileBoundary");
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
        v[4] = v[1] == 0L ? 1L : 0L;
        return v[4] != 0 ? 3 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = ((v[7] + 1L)) & 4294967295L;
        v[6] = v[5] == v[1] ? 1L : 0L;
        return v[6] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi7 = (previous == 1 ? v[5] : 0L);
        v[7] = phi7;
        v[8] = (v[0] + (Heap.s(v[7], 32) * 4L)) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[9] << 4L)) & 4294967295L;
        v[11] = v[10] == v[3] ? 1L : 0L;
        return v[11] != 0 ? 4 : 1;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[12] = ((v[3] + 15L)) & 4294967295L;
        v[13] = ((v[12] >>> 4L)) & 4294967295L;
        v[14] = v[13] >= v[2] ? 1L : 0L;
        v[15] = (v[14]) & 4294967295L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi16 = (previous == 3 ? v[15] : 1L);
        v[16] = phi16;
        v[17] = v[16];
        return -1;
    }
}
