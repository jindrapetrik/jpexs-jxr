package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKFormatConverter_EnumConversions.
 */
public final class F0216_PKFormatConverter_EnumConversions {

    private F0216_PKFormatConverter_EnumConversions() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[18];
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
                    case 5:
                        pc = b5(m, v, previous);
                        break;
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKFormatConverter_EnumConversions");
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
        m.store(v[2], 9616L, 4);
        return 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi3 = (previous == 0 ? 0L : v[14]);
        long phi4 = (previous == 0 ? 0L : v[13]);
        v[3] = phi3;
        v[4] = phi4;
        v[5] = (8704L + (Heap.s(0L, 32) * 912L) + (Heap.s(v[3], 32) * 12L)) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = LibC.call(m, "memcmp", new long[]{v[6], v[0], 16L});
        v[8] = v[7] == 0L ? 1L : 0L;
        return v[8] != 0 ? 2 : 5;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[9] = v[4] == v[1] ? 1L : 0L;
        return v[9] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[10] = (8704L + (Heap.s(0L, 32) * 912L) + (Heap.s(v[3], 32) * 12L) + 4L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        m.store(v[2], v[11], 4);
        return 6;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[12] = ((v[4] + 1L)) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi13 = (previous == 1 ? v[4] : v[12]);
        v[13] = phi13;
        v[14] = ((v[3] + 1L)) & 4294967295L;
        v[15] = v[14] == 76L ? 1L : 0L;
        return v[15] != 0 ? 6 : 1;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi16 = (previous == 3 ? 0L : 4294967188L);
        v[16] = phi16;
        v[17] = v[16];
        return -1;
    }
}
