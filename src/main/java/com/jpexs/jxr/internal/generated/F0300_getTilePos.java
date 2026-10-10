package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getTilePos.
 */
public final class F0300_getTilePos {

    private F0300_getTilePos() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[56];
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
                    case 7:
                        pc = b7(m, v, previous);
                        break;
                    case 8:
                        pc = b8(m, v, previous);
                        break;
                    case 9:
                        pc = b9(m, v, previous);
                        break;
                    case 10:
                        pc = b10(m, v, previous);
                        break;
                    case 11:
                        pc = b11(m, v, previous);
                        break;
                    case 12:
                        pc = b12(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in getTilePos");
                }
                previous = old;
                if (pc < 0) {
                    return v[55];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = v[1] == 0L ? 1L : 0L;
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        return v[3] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = v[5] < v[7] ? 1L : 0L;
        return v[8] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[9] = ((v[5] + 1L)) & 4294967295L;
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 60L + (Heap.s(v[9], 32) * 4L)) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = v[11] == v[1] ? 1L : 0L;
        return v[12] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 0 ? 0L : v[9]);
        v[13] = phi13;
        m.store(v[4], v[13], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi14 = (previous == 1 ? v[5] : (previous == 2 ? v[5] : v[13]));
        v[14] = phi14;
        v[15] = v[2] == 0L ? 1L : 0L;
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        return v[15] != 0 ? 7 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[17] = m.load(v[16], 4);
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = v[17] < v[19] ? 1L : 0L;
        return v[20] != 0 ? 6 : 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[21] = ((v[17] + 1L)) & 4294967295L;
        v[22] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = v[23] == v[2] ? 1L : 0L;
        return v[24] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi25 = (previous == 4 ? 0L : v[21]);
        v[25] = phi25;
        m.store(v[16], v[25], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi26 = (previous == 5 ? v[17] : (previous == 6 ? v[17] : v[25]));
        v[26] = phi26;
        v[27] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 60L + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = v[28] == v[1] ? 1L : 0L;
        v[30] = (v[29]) & 4294967295L;
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34276L) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = v[33] == v[2] ? 1L : 0L;
        v[35] = (v[34]) & 4294967295L;
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34280L) & 4294967295L;
        m.store(v[36], v[35], 4);
        v[37] = m.load(v[27], 4);
        v[38] = ((v[1] - v[37])) & 4294967295L;
        v[39] = ((v[38] & 15L)) & 4294967295L;
        v[40] = v[39] == 0L ? 1L : 0L;
        v[41] = (v[40]) & 4294967295L;
        v[42] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34284L) & 4294967295L;
        m.store(v[42], v[41], 4);
        v[43] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34288L) & 4294967295L;
        m.store(v[43], v[41], 4);
        v[44] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = v[14] == v[45] ? 1L : 0L;
        v[47] = ((v[1] + 1L)) & 4294967295L;
        return v[46] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[48] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = v[47] == v[49] ? 1L : 0L;
        return v[50] != 0 ? 11 : 12;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[51] = ((v[14] + 1L)) & 4294967295L;
        v[52] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 60L + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = v[47] == v[53] ? 1L : 0L;
        return v[54] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        m.store(v[43], 1L, 4);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        return -1;
    }
}
