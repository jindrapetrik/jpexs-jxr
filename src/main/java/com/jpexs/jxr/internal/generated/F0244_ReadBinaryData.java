package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ReadBinaryData.
 */
public final class F0244_ReadBinaryData {

    private F0244_ReadBinaryData() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[55];
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
                    case 16:
                        pc = b16(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in ReadBinaryData");
                }
                previous = old;
                if (pc < 0) {
                    return v[54];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.stack(4L * 1L, 4);
        v[5] = m.stack(4L * 1L, 4);
        v[6] = (v[2]) & 255L;
        v[7] = ((v[2] >>> 8L)) & 4294967295L;
        v[8] = (v[7]) & 255L;
        v[9] = ((v[2] >>> 16L)) & 4294967295L;
        v[10] = (v[9]) & 255L;
        v[11] = ((v[2] >>> 24L)) & 4294967295L;
        v[12] = (v[11]) & 255L;
        m.store(v[4], 0L, 4);
        v[13] = ((v[1] + 2L)) & 4294967295L;
        v[14] = F0030_PKAlloc.run(m, v[4], v[13]);
        v[15] = Heap.s(v[14], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[15] != 0 ? 14 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[16] = v[1] < 5L ? 1L : 0L;
        return v[16] != 0 ? 2 : 7;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[17] = v[1] == 0L ? 1L : 0L;
        return v[17] != 0 ? 13 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[18] = m.load(v[4], 4);
        m.store(v[18], v[6], 1);
        v[19] = v[1] == 1L ? 1L : 0L;
        return v[19] != 0 ? 13 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[20] = m.load(v[4], 4);
        v[21] = (v[20] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[21], v[8], 1);
        v[22] = v[1] == 2L ? 1L : 0L;
        return v[22] != 0 ? 13 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[23] = m.load(v[4], 4);
        v[24] = (v[23] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[24], v[10], 1);
        v[25] = v[1] == 3L ? 1L : 0L;
        return v[25] != 0 ? 13 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[26] = m.load(v[4], 4);
        v[27] = (v[26] + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[27], v[12], 1);
        return 13;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[28] = (v[0] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = Dispatch.call(m, v[29], new long[]{v[0], v[5]});
        v[31] = Heap.s(v[30], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[31] != 0 ? 11 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[32] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = Dispatch.call(m, v[33], new long[]{v[0], v[2]});
        v[35] = Heap.s(v[34], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[35] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[36] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = m.load(v[4], 4);
        v[39] = Dispatch.call(m, v[37], new long[]{v[0], v[38], v[1]});
        v[40] = Heap.s(v[39], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[40] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[41] = m.load(v[32], 4);
        v[42] = m.load(v[5], 4);
        v[43] = Dispatch.call(m, v[41], new long[]{v[0], v[42]});
        v[44] = Heap.s(v[43], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[44] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi45 = (previous == 9 ? v[39] : (previous == 8 ? v[34] : (previous == 7 ? v[30] : v[43])));
        v[45] = phi45;
        return 14;
    }

    private static int b12(Heap m, long[] v, int previous) {
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi46 = (previous == 12 ? v[43] : (previous == 2 ? v[14] : (previous == 6 ? v[14] : (previous == 5 ? v[14] : (previous == 4 ? v[14] : v[14])))));
        v[46] = phi46;
        v[47] = m.load(v[4], 4);
        m.store(v[3], v[47], 4);
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi48 = (previous == 13 ? v[46] : (previous == 0 ? v[14] : v[45]));
        v[48] = phi48;
        v[49] = Heap.s(v[48], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[50] = m.load(v[4], 4);
        v[51] = v[50] != 0L ? 1L : 0L;
        v[52] = v[49] != 0 ? v[51] : 0L;
        return v[52] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[53] = F0032_PKFree.run(m, v[4]);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[54] = v[48];
        return -1;
    }
}
