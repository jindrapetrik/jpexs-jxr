package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getbfwe.
 */
public final class F0229_getbfwe {

    private F0229_getbfwe() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[21];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                        throw new IllegalStateException("Invalid block in getbfwe");
                }
                previous = old;
                if (pc < 0) {
                    return v[20];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = v[4] == 73L ? 1L : 0L;
        v[6] = ((v[2] + 2L)) & 4294967295L;
        v[7] = v[6] > v[1] ? 1L : 0L;
        return v[5] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        return v[7] != 0 ? 6 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        v[9] = m.load(v[8], 2);
        return 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[7] != 0 ? 6 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        v[11] = (v[10] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[12] = m.load(v[11], 1);
        v[13] = (v[12]) & 65535L;
        v[14] = m.load(v[10], 1);
        v[15] = (v[14]) & 65535L;
        v[16] = ((v[15] << 8L)) & 65535L;
        v[17] = ((v[16] | v[13])) & 65535L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi18 = (previous == 4 ? v[17] : v[9]);
        v[18] = phi18;
        m.store(v[3], v[18], 2);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi19 = (previous == 1 ? 4294967193L : (previous == 3 ? 4294967193L : 0L));
        v[19] = phi19;
        v[20] = v[19];
        return -1;
    }
}
