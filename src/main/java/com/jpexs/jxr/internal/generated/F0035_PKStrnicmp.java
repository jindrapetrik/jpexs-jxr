package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKStrnicmp.
 */
public final class F0035_PKStrnicmp {

    private F0035_PKStrnicmp() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[40];
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
                        throw new IllegalStateException("Invalid block in PKStrnicmp");
                }
                previous = old;
                if (pc < 0) {
                    return v[39];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.load(v[0], 1);
        v[4] = (Heap.s(v[3], 8)) & 4294967295L;
        v[5] = LibC.call(m, "tolower", new long[]{v[4]});
        v[6] = m.load(v[1], 1);
        v[7] = (Heap.s(v[6], 8)) & 4294967295L;
        v[8] = LibC.call(m, "tolower", new long[]{v[7]});
        v[9] = v[5] == v[8] ? 1L : 0L;
        return v[9] != 0 ? 1 : 4;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi10 = (previous == 3 ? v[21] : v[2]);
        long phi11 = (previous == 3 ? v[20] : v[1]);
        long phi12 = (previous == 3 ? v[19] : v[0]);
        v[10] = phi10;
        v[11] = phi11;
        v[12] = phi12;
        v[13] = m.load(v[12], 1);
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = m.load(v[11], 1);
        v[16] = v[15] != 0L ? 1L : 0L;
        v[17] = v[10] != 0L ? 1L : 0L;
        v[18] = v[16] != 0 ? v[17] : 0L;
        return v[18] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[19] = (v[12] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[20] = (v[11] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[21] = ((v[10] + 4294967295L)) & 4294967295L;
        v[22] = m.load(v[19], 1);
        v[23] = (Heap.s(v[22], 8)) & 4294967295L;
        v[24] = LibC.call(m, "tolower", new long[]{v[23]});
        v[25] = m.load(v[20], 1);
        v[26] = (Heap.s(v[25], 8)) & 4294967295L;
        v[27] = LibC.call(m, "tolower", new long[]{v[26]});
        v[28] = v[24] == v[27] ? 1L : 0L;
        return v[28] != 0 ? 1 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi29 = (previous == 0 ? v[0] : (previous == 2 ? v[12] : (previous == 1 ? v[12] : v[19])));
        long phi30 = (previous == 0 ? v[1] : (previous == 2 ? v[11] : (previous == 1 ? v[11] : v[20])));
        long phi31 = (previous == 0 ? v[2] : (previous == 2 ? v[10] : (previous == 1 ? v[10] : v[21])));
        v[29] = phi29;
        v[30] = phi30;
        v[31] = phi31;
        v[32] = v[31] == 0L ? 1L : 0L;
        return v[32] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[33] = m.load(v[29], 1);
        v[34] = (Heap.s(v[33], 8)) & 4294967295L;
        v[35] = m.load(v[30], 1);
        v[36] = (Heap.s(v[35], 8)) & 4294967295L;
        v[37] = ((v[34] - v[36])) & 4294967295L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi38 = (previous == 5 ? v[37] : 0L);
        v[38] = phi38;
        v[39] = v[38];
        return -1;
    }
}
