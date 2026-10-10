package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: advanceOneMBRow.
 */
public final class F0303_advanceOneMBRow {

    private F0303_advanceOneMBRow() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[59];
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
                    case 10:
                        pc = b10(m, v, previous);
                        break;
                    case 11:
                        pc = b11(m, v, previous);
                        break;
                    case 12:
                        pc = b12(m, v, previous);
                        break;
                    case 13:
                        pc = b13(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in advanceOneMBRow");
                }
                previous = old;
                if (pc < 0) {
                    return v[58];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 6 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = ((v[5] & 1L)) & 4294967295L;
        v[8] = v[5] == 1L ? 1L : 0L;
        return v[8] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[9] = ((v[5] & 4294967294L)) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi10 = (previous == 2 ? 0L : v[21]);
        long phi11 = (previous == 2 ? 0L : v[22]);
        v[10] = phi10;
        v[11] = phi11;
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[10], 32) * 4L)) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[10], 32) * 4L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        m.store(v[12], v[15], 4);
        m.store(v[14], v[13], 4);
        v[16] = ((v[10] | 1L)) & 4294967295L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        m.store(v[17], v[20], 4);
        m.store(v[19], v[18], 4);
        v[21] = ((v[10] + 2L)) & 4294967295L;
        v[22] = ((v[11] + 2L)) & 4294967295L;
        v[23] = v[22] == v[9] ? 1L : 0L;
        return v[23] != 0 ? 4 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi24 = (previous == 1 ? 0L : v[21]);
        v[24] = phi24;
        v[25] = v[7] == 0L ? 1L : 0L;
        return v[25] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[24], 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[24], 32) * 4L)) & 4294967295L;
        v[29] = m.load(v[28], 4);
        m.store(v[26], v[29], 4);
        m.store(v[28], v[27], 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        return v[3] != 0 ? 13 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[32] = (v[31] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = v[33] == 0L ? 1L : 0L;
        return v[34] != 0 ? 13 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[35] = ((v[33] & 1L)) & 4294967295L;
        v[36] = v[33] == 1L ? 1L : 0L;
        return v[36] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[37] = ((v[33] & 4294967294L)) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi38 = (previous == 9 ? 0L : v[49]);
        long phi39 = (previous == 9 ? 0L : v[50]);
        v[38] = phi38;
        v[39] = phi39;
        v[40] = (v[31] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[38], 32) * 4L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = (v[31] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[38], 32) * 4L)) & 4294967295L;
        v[43] = m.load(v[42], 4);
        m.store(v[40], v[43], 4);
        m.store(v[42], v[41], 4);
        v[44] = ((v[38] | 1L)) & 4294967295L;
        v[45] = (v[31] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = (v[31] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        v[48] = m.load(v[47], 4);
        m.store(v[45], v[48], 4);
        m.store(v[47], v[46], 4);
        v[49] = ((v[38] + 2L)) & 4294967295L;
        v[50] = ((v[39] + 2L)) & 4294967295L;
        v[51] = v[50] == v[37] ? 1L : 0L;
        return v[51] != 0 ? 11 : 10;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi52 = (previous == 8 ? 0L : v[49]);
        v[52] = phi52;
        v[53] = v[35] == 0L ? 1L : 0L;
        return v[53] != 0 ? 13 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[54] = (v[31] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[52], 32) * 4L)) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = (v[31] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[52], 32) * 4L)) & 4294967295L;
        v[57] = m.load(v[56], 4);
        m.store(v[54], v[57], 4);
        m.store(v[56], v[55], 4);
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        return -1;
    }
}
