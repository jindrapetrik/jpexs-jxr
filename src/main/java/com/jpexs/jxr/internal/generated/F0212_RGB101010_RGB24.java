package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB101010_RGB24.
 */
public final class F0212_RGB101010_RGB24 {

    private F0212_RGB101010_RGB24() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[63];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB101010_RGB24");
                }
                previous = old;
                if (pc < 0) {
                    return v[62];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 1 : 8;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[10] = ((v[7] & 1L)) & 4294967295L;
        v[11] = v[7] == 1L ? 1L : 0L;
        v[12] = ((v[7] & 2147483646L)) & 4294967295L;
        v[13] = v[10] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi14 = (previous == 1 ? 0L : v[60]);
        v[14] = phi14;
        v[15] = ((v[14] * v[3])) & 4294967295L;
        v[16] = (v[2] + (Heap.s(v[15], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[11] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi17 = (previous == 4 ? v[44] : 0L);
        long phi18 = (previous == 4 ? v[45] : 0L);
        v[17] = phi17;
        v[18] = phi18;
        v[19] = (v[16] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = ((v[20] >>> 22L)) & 4294967295L;
        v[22] = ((v[20] >>> 12L)) & 4294967295L;
        v[23] = (v[21]) & 255L;
        v[24] = ((v[17] * 3L)) & 4294967295L;
        v[25] = (v[16] + (Heap.s(v[24], 32) * 1L)) & 4294967295L;
        m.store(v[25], v[23], 1);
        v[26] = (v[22]) & 255L;
        v[27] = (v[25] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[27], v[26], 1);
        v[28] = ((v[20] >>> 2L)) & 4294967295L;
        v[29] = (v[28]) & 255L;
        v[30] = (v[25] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[30], v[29], 1);
        v[31] = ((v[17] | 1L)) & 4294967295L;
        v[32] = (v[16] + (Heap.s(v[31], 32) * 4L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((v[33] >>> 22L)) & 4294967295L;
        v[35] = ((v[33] >>> 12L)) & 4294967295L;
        v[36] = (v[34]) & 255L;
        v[37] = ((v[31] * 3L)) & 4294967295L;
        v[38] = (v[16] + (Heap.s(v[37], 32) * 1L)) & 4294967295L;
        m.store(v[38], v[36], 1);
        v[39] = (v[35]) & 255L;
        v[40] = (v[38] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[40], v[39], 1);
        v[41] = ((v[33] >>> 2L)) & 4294967295L;
        v[42] = (v[41]) & 255L;
        v[43] = (v[38] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[43], v[42], 1);
        v[44] = ((v[17] + 2L)) & 4294967295L;
        v[45] = ((v[18] + 2L)) & 4294967295L;
        v[46] = v[45] == v[12] ? 1L : 0L;
        return v[46] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi47 = (previous == 3 ? 0L : v[44]);
        v[47] = phi47;
        return v[13] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[48] = (v[16] + (Heap.s(v[47], 32) * 4L)) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = ((v[49] >>> 22L)) & 4294967295L;
        v[51] = ((v[49] >>> 12L)) & 4294967295L;
        v[52] = (v[50]) & 255L;
        v[53] = ((v[47] * 3L)) & 4294967295L;
        v[54] = (v[16] + (Heap.s(v[53], 32) * 1L)) & 4294967295L;
        m.store(v[54], v[52], 1);
        v[55] = (v[51]) & 255L;
        v[56] = (v[54] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[56], v[55], 1);
        v[57] = ((v[49] >>> 2L)) & 4294967295L;
        v[58] = (v[57]) & 255L;
        v[59] = (v[54] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[59], v[58], 1);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[60] = ((v[14] + 1L)) & 4294967295L;
        v[61] = v[60] == v[5] ? 1L : 0L;
        return v[61] != 0 ? 8 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[62] = 0L;
        return -1;
    }
}
