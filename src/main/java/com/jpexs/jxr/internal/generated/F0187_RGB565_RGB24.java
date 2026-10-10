package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB565_RGB24.
 */
public final class F0187_RGB565_RGB24 {

    private F0187_RGB565_RGB24() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[67];
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
                        throw new IllegalStateException("Invalid block in RGB565_RGB24");
                }
                previous = old;
                if (pc < 0) {
                    return v[66];
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
        v[11] = v[10] == 0L ? 1L : 0L;
        v[12] = ((v[7] + 4294967295L)) & 4294967295L;
        v[13] = ((v[12] * 3L)) & 4294967295L;
        v[14] = v[7] == 1L ? 1L : 0L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = Heap.s(v[16], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[15] != 0 ? 3 : 8;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi16 = (previous == 1 ? v[5] : v[17]);
        v[16] = phi16;
        v[17] = ((v[16] + 4294967295L)) & 4294967295L;
        v[18] = ((v[17] * v[3])) & 4294967295L;
        v[19] = (v[2] + (Heap.s(v[18], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 4 : 2;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[11] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[20] = (v[19] + (Heap.s(v[12], 32) * 2L)) & 4294967295L;
        v[21] = m.load(v[20], 2);
        v[22] = ((v[21] >>> 8L)) & 65535L;
        v[23] = (v[22]) & 255L;
        v[24] = ((v[23] & 248L)) & 255L;
        v[25] = (v[19] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        m.store(v[25], v[24], 1);
        v[26] = ((v[21] >>> 3L)) & 65535L;
        v[27] = (v[26]) & 255L;
        v[28] = ((v[27] & 252L)) & 255L;
        v[29] = (v[25] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[29], v[28], 1);
        v[30] = (v[21]) & 255L;
        v[31] = ((v[30] << 3L)) & 255L;
        v[32] = (v[25] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[32], v[31], 1);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi33 = (previous == 4 ? v[7] : v[12]);
        v[33] = phi33;
        return v[14] != 0 ? 2 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi34 = (previous == 7 ? v[50] : v[33]);
        v[34] = phi34;
        v[35] = ((v[34] + 4294967295L)) & 4294967295L;
        v[36] = (v[19] + (Heap.s(v[35], 32) * 2L)) & 4294967295L;
        v[37] = m.load(v[36], 2);
        v[38] = ((v[37] >>> 8L)) & 65535L;
        v[39] = (v[38]) & 255L;
        v[40] = ((v[39] & 248L)) & 255L;
        v[41] = ((v[35] * 3L)) & 4294967295L;
        v[42] = (v[19] + (Heap.s(v[41], 32) * 1L)) & 4294967295L;
        m.store(v[42], v[40], 1);
        v[43] = ((v[37] >>> 3L)) & 65535L;
        v[44] = (v[43]) & 255L;
        v[45] = ((v[44] & 252L)) & 255L;
        v[46] = (v[42] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[46], v[45], 1);
        v[47] = (v[37]) & 255L;
        v[48] = ((v[47] << 3L)) & 255L;
        v[49] = (v[42] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[49], v[48], 1);
        v[50] = ((v[34] + 4294967294L)) & 4294967295L;
        v[51] = (v[19] + (Heap.s(v[50], 32) * 2L)) & 4294967295L;
        v[52] = m.load(v[51], 2);
        v[53] = ((v[52] >>> 8L)) & 65535L;
        v[54] = (v[53]) & 255L;
        v[55] = ((v[54] & 248L)) & 255L;
        v[56] = ((v[50] * 3L)) & 4294967295L;
        v[57] = (v[19] + (Heap.s(v[56], 32) * 1L)) & 4294967295L;
        m.store(v[57], v[55], 1);
        v[58] = ((v[52] >>> 3L)) & 65535L;
        v[59] = (v[58]) & 255L;
        v[60] = ((v[59] & 252L)) & 255L;
        v[61] = (v[57] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[61], v[60], 1);
        v[62] = (v[52]) & 255L;
        v[63] = ((v[62] << 3L)) & 255L;
        v[64] = (v[57] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[64], v[63], 1);
        v[65] = v[35] > 1L ? 1L : 0L;
        return v[65] != 0 ? 7 : 2;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[66] = 0L;
        return -1;
    }
}
