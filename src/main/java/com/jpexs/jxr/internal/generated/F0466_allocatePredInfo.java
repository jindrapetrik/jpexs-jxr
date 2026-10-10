package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: allocatePredInfo.
 */
public final class F0466_allocatePredInfo {

    private F0466_allocatePredInfo() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[53];
        v[0] = a0;
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
                    default:
                        throw new IllegalStateException("Invalid block in allocatePredInfo");
                }
                previous = old;
                if (pc < 0) {
                    return v[52];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = ((v[2] >>> 16L)) & 4294967295L;
        v[6] = ((v[4] * 80L)) & 4294967295L;
        v[7] = ((v[6] * v[5])) & 4294967295L;
        v[8] = v[7] < 65536L ? 1L : 0L;
        return v[8] != 0 ? 1 : 9;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = ((v[6] * v[2])) & 4294967295L;
        v[10] = LibC.call(m, "malloc", new long[]{v[9]});
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 9 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34916L) & 4294967295L;
        m.store(v[12], v[10], 4);
        v[13] = v[4] == 0L ? 1L : 0L;
        return v[13] != 0 ? 9 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[14] = ((v[2] & 1L)) & 4294967295L;
        v[15] = v[2] == 1L ? 1L : 0L;
        v[16] = ((v[2] & 4294967294L)) & 4294967295L;
        v[17] = v[14] == 0L ? 1L : 0L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi18 = (previous == 3 ? v[10] : v[23]);
        long phi19 = (previous == 3 ? 0L : v[49]);
        v[18] = phi18;
        v[19] = phi19;
        v[20] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        m.store(v[20], v[18], 4);
        v[21] = (v[18] + (Heap.s(v[2], 32) * 40L)) & 4294967295L;
        v[22] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        m.store(v[22], v[21], 4);
        v[23] = (v[21] + (Heap.s(v[2], 32) * 40L)) & 4294967295L;
        switch ((int) v[2]) {
            case 0:
                return 8;
            case 1:
                return 6;
            default:
                return 5;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi24 = (previous == 5 ? v[39] : 0L);
        long phi25 = (previous == 5 ? v[40] : 0L);
        v[24] = phi24;
        v[25] = phi25;
        v[26] = m.load(v[20], 4);
        v[27] = (v[26] + (Heap.s(v[24], 32) * 40L) + 12L) & 4294967295L;
        v[28] = (v[26] + (Heap.s(v[24], 32) * 40L) + 36L) & 4294967295L;
        m.store(v[28], v[27], 4);
        v[29] = m.load(v[22], 4);
        v[30] = (v[29] + (Heap.s(v[24], 32) * 40L) + 12L) & 4294967295L;
        v[31] = (v[29] + (Heap.s(v[24], 32) * 40L) + 36L) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = ((v[24] | 1L)) & 4294967295L;
        v[33] = m.load(v[20], 4);
        v[34] = (v[33] + (Heap.s(v[32], 32) * 40L) + 12L) & 4294967295L;
        v[35] = (v[33] + (Heap.s(v[32], 32) * 40L) + 36L) & 4294967295L;
        m.store(v[35], v[34], 4);
        v[36] = m.load(v[22], 4);
        v[37] = (v[36] + (Heap.s(v[32], 32) * 40L) + 12L) & 4294967295L;
        v[38] = (v[36] + (Heap.s(v[32], 32) * 40L) + 36L) & 4294967295L;
        m.store(v[38], v[37], 4);
        v[39] = ((v[24] + 2L)) & 4294967295L;
        v[40] = ((v[25] + 2L)) & 4294967295L;
        v[41] = v[40] == v[16] ? 1L : 0L;
        return v[41] != 0 ? 6 : 5;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi42 = (previous == 4 ? 0L : v[39]);
        v[42] = phi42;
        return v[17] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[43] = m.load(v[20], 4);
        v[44] = (v[43] + (Heap.s(v[42], 32) * 40L) + 12L) & 4294967295L;
        v[45] = (v[43] + (Heap.s(v[42], 32) * 40L) + 36L) & 4294967295L;
        m.store(v[45], v[44], 4);
        v[46] = m.load(v[22], 4);
        v[47] = (v[46] + (Heap.s(v[42], 32) * 40L) + 12L) & 4294967295L;
        v[48] = (v[46] + (Heap.s(v[42], 32) * 40L) + 36L) & 4294967295L;
        m.store(v[48], v[47], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[49] = ((v[19] + 1L)) & 4294967295L;
        v[50] = v[49] == v[4] ? 1L : 0L;
        return v[50] != 0 ? 9 : 4;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi51 = (previous == 0 ? 4294967295L : (previous == 1 ? 4294967295L : (previous == 2 ? 0L : 0L)));
        v[51] = phi51;
        v[52] = v[51];
        return -1;
    }
}
