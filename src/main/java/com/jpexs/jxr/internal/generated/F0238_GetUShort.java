package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetUShort.
 */
public final class F0238_GetUShort {

    private F0238_GetUShort() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[24];
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
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in GetUShort");
                }
                previous = old;
                if (pc < 0) {
                    return v[23];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(1L * 1L, 1);
        v[4] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Dispatch.call(m, v[5], new long[]{v[0], v[1]});
        v[7] = Heap.s(v[6], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[7] != 0 ? 4 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = Dispatch.call(m, v[9], new long[]{v[0], v[3], 1L});
        v[11] = Heap.s(v[10], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[11] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = m.load(v[3], 1);
        v[13] = (v[12]) & 65535L;
        m.store(v[2], v[13], 2);
        v[14] = m.load(v[8], 4);
        v[15] = Dispatch.call(m, v[14], new long[]{v[0], v[3], 1L});
        v[16] = Heap.s(v[15], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[16] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[17] = m.load(v[3], 1);
        v[18] = (v[17]) & 65535L;
        v[19] = ((v[18] << 8L)) & 65535L;
        v[20] = m.load(v[2], 2);
        v[21] = ((v[19] + v[20])) & 65535L;
        m.store(v[2], v[21], 2);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi22 = (previous == 3 ? v[15] : (previous == 0 ? v[6] : (previous == 1 ? v[10] : v[15])));
        v[22] = phi22;
        v[23] = v[22];
        return -1;
    }
}
