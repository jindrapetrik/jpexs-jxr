package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: open_decoder.
 */
public final class F0009_open_decoder {

    private F0009_open_decoder() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[48];
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
                    case 14:
                        pc = b14(m, v, previous);
                        break;
                    case 15:
                        pc = b15(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in open_decoder");
                }
                previous = old;
                if (pc < 0) {
                    return v[47];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = Heap.s(v[1], 32) < Heap.s(8L, 32) ? 1L : 0L;
        return v[4] != 0 ? 15 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = m.load(v[0], 1);
        v[6] = v[5] == 73L ? 1L : 0L;
        return v[6] != 0 ? 2 : 15;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[8] = m.load(v[7], 1);
        v[9] = v[8] == 73L ? 1L : 0L;
        return v[9] != 0 ? 3 : 15;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        v[11] = m.load(v[10], 1);
        v[12] = v[11] == 188L ? 1L : 0L;
        return v[12] != 0 ? 4 : 15;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[13] = (v[0] + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        v[14] = m.load(v[13], 1);
        v[15] = v[14] == 1L ? 1L : 0L;
        return v[15] != 0 ? 5 : 15;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[16] = ((v[1] + 8192L)) & 4294967295L;
        v[17] = F0322_CreateWS_Memory.run(m, v[2], v[0], v[16]);
        v[18] = Heap.s(v[17], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[18] != 0 ? 15 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[19] = F0138_PKImageDecode_Create_WMP.run(m, v[3]);
        v[20] = Heap.s(v[19], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[20] != 0 ? 15 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[21] = m.load(v[3], 4);
        v[22] = m.load(v[21], 4);
        v[23] = m.load(v[2], 4);
        v[24] = Dispatch.call(m, v[22], new long[]{v[21], v[23]});
        v[25] = Heap.s(v[24], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[25] != 0 ? 15 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[26] = m.load(v[3], 4);
        v[27] = (v[26] + (Heap.s(0L, 32) * 66224L) + 96L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = v[28] < v[1] ? 1L : 0L;
        return v[29] != 0 ? 9 : 15;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[30] = (v[26] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 4L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = ((v[1] - v[28])) & 4294967295L;
        v[33] = v[31] > v[32] ? 1L : 0L;
        return v[33] != 0 ? 15 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[34] = (v[26] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 8L) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = v[35] == 0L ? 1L : 0L;
        return v[36] != 0 ? 15 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[37] = v[35] < v[1] ? 1L : 0L;
        return v[37] != 0 ? 12 : 14;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[38] = (v[26] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 12L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = ((v[1] - v[35])) & 4294967295L;
        v[41] = v[39] > v[40] ? 1L : 0L;
        return v[41] != 0 ? 13 : 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[42] = v[39] <= v[35] ? 1L : 0L;
        v[43] = v[39] > v[1] ? 1L : 0L;
        v[44] = ((v[42] | v[43])) & 1L;
        v[45] = (v[44]) & 1L;
        return v[45] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi46 = (previous == 4 ? 4294967190L : (previous == 3 ? 4294967190L : (previous == 2 ? 4294967190L : (previous == 1 ? 4294967190L : (previous == 0 ? 4294967190L : (previous == 5 ? v[17] : (previous == 6 ? v[19] : (previous == 7 ? v[24] : (previous == 10 ? 0L : (previous == 14 ? 4294967194L : (previous == 13 ? 0L : (previous == 8 ? 4294967194L : (previous == 9 ? 4294967194L : 0L)))))))))))));
        v[46] = phi46;
        v[47] = v[46];
        return -1;
    }
}
