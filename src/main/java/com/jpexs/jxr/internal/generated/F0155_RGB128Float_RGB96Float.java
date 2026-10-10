package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB128Float_RGB96Float.
 */
public final class F0155_RGB128Float_RGB96Float {

    private F0155_RGB128Float_RGB96Float() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[66];
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
                        throw new IllegalStateException("Invalid block in RGB128Float_RGB96Float");
                }
                previous = old;
                if (pc < 0) {
                    return v[65];
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
        long phi14 = (previous == 1 ? 0L : v[63]);
        v[14] = phi14;
        v[15] = ((v[14] * v[3])) & 4294967295L;
        v[16] = (v[2] + (Heap.s(v[15], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[11] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi17 = (previous == 4 ? v[46] : 0L);
        long phi18 = (previous == 4 ? v[47] : 0L);
        v[17] = phi17;
        v[18] = phi18;
        v[19] = ((v[17] << 2L)) & 4294967295L;
        v[20] = (v[16] + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((v[17] * 3L)) & 4294967295L;
        v[23] = (v[16] + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        m.store(v[23], v[21], 4);
        v[24] = ((v[19] | 1L)) & 4294967295L;
        v[25] = (v[16] + (Heap.s(v[24], 32) * 4L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[23] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[27], v[26], 4);
        v[28] = ((v[19] | 2L)) & 4294967295L;
        v[29] = (v[16] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = (v[23] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = ((v[17] | 1L)) & 4294967295L;
        v[33] = ((v[32] << 2L)) & 4294967295L;
        v[34] = (v[16] + (Heap.s(v[33], 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = ((v[32] * 3L)) & 4294967295L;
        v[37] = (v[16] + (Heap.s(v[36], 32) * 4L)) & 4294967295L;
        m.store(v[37], v[35], 4);
        v[38] = ((v[33] | 1L)) & 4294967295L;
        v[39] = (v[16] + (Heap.s(v[38], 32) * 4L)) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = (v[37] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[41], v[40], 4);
        v[42] = ((v[33] | 2L)) & 4294967295L;
        v[43] = (v[16] + (Heap.s(v[42], 32) * 4L)) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = (v[37] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[45], v[44], 4);
        v[46] = ((v[17] + 2L)) & 4294967295L;
        v[47] = ((v[18] + 2L)) & 4294967295L;
        v[48] = v[47] == v[12] ? 1L : 0L;
        return v[48] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi49 = (previous == 3 ? 0L : v[46]);
        v[49] = phi49;
        return v[13] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[50] = ((v[49] << 2L)) & 4294967295L;
        v[51] = (v[16] + (Heap.s(v[50], 32) * 4L)) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = ((v[49] * 3L)) & 4294967295L;
        v[54] = (v[16] + (Heap.s(v[53], 32) * 4L)) & 4294967295L;
        m.store(v[54], v[52], 4);
        v[55] = ((v[50] | 1L)) & 4294967295L;
        v[56] = (v[16] + (Heap.s(v[55], 32) * 4L)) & 4294967295L;
        v[57] = m.load(v[56], 4);
        v[58] = (v[54] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[58], v[57], 4);
        v[59] = ((v[50] | 2L)) & 4294967295L;
        v[60] = (v[16] + (Heap.s(v[59], 32) * 4L)) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = (v[54] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[62], v[61], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[63] = ((v[14] + 1L)) & 4294967295L;
        v[64] = v[63] == v[5] ? 1L : 0L;
        return v[64] != 0 ? 8 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[65] = 0L;
        return -1;
    }
}
