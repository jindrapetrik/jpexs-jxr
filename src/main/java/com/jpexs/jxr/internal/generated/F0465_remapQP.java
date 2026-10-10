package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: remapQP.
 */
public final class F0465_remapQP {

    private F0465_remapQP() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[58];
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
                        throw new IllegalStateException("Invalid block in remapQP");
                }
                previous = old;
                if (pc < 0) {
                    return v[57];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.load(v[0], 1);
        v[4] = (v[3]) & 4294967295L;
        v[5] = v[3] == 0L ? 1L : 0L;
        return v[5] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        m.store(v[6], 1L, 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        m.store(v[7], 0L, 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 20L) + 16L) & 4294967295L;
        m.store(v[8], 0L, 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 20L) + 12L) & 4294967295L;
        m.store(v[9], 0L, 4);
        return 12;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = v[2] == 0L ? 1L : 0L;
        return v[10] != 0 ? 3 : 9;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[11] = v[3] < 32L ? 1L : 0L;
        return v[11] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[12] = ((v[4] + 3L)) & 4294967295L;
        v[13] = ((v[12] >>> 2L)) & 4294967295L;
        return 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[14] = v[3] < 48L ? 1L : 0L;
        v[15] = ((v[4] & 15L)) & 4294967295L;
        return v[14] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[16] = ((v[15] + 17L)) & 4294967295L;
        v[17] = ((v[16] >>> 1L)) & 4294967295L;
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[18] = ((v[15] | 16L)) & 4294967295L;
        v[19] = ((v[4] >>> 4L)) & 4294967295L;
        v[20] = ((v[19] + 4294967293L)) & 4294967295L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi21 = (previous == 4 ? 0L : (previous == 6 ? 0L : v[20]));
        long phi22 = (previous == 4 ? v[13] : (previous == 6 ? v[17] : v[18]));
        v[21] = phi21;
        v[22] = phi22;
        v[23] = ((v[22] << v[21])) & 4294967295L;
        v[24] = (v[0] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        m.store(v[24], v[23], 4);
        v[25] = (13616L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[22], 32) * 8L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 20L) + 12L) & 4294967295L;
        m.store(v[27], v[26], 4);
        v[28] = (13616L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[22], 32) * 8L) + 4L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = ((v[29] + v[21])) & 4294967295L;
        v[31] = (v[0] + (Heap.s(0L, 32) * 20L) + 16L) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = ((v[23] * 3L)) & 4294967295L;
        v[33] = ((v[32] + 1L)) & 4294967295L;
        v[34] = ((Heap.s(v[33], 32) >> 3L)) & 4294967295L;
        v[35] = (v[0] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        m.store(v[35], v[34], 4);
        return 12;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[36] = v[3] < 16L ? 1L : 0L;
        return v[36] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[37] = ((v[4] & 15L)) & 4294967295L;
        v[38] = ((v[37] | 16L)) & 4294967295L;
        v[39] = ((v[4] >>> 4L)) & 4294967295L;
        v[40] = ((v[1] + 4294967295L)) & 4294967295L;
        v[41] = ((v[40] + v[39])) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi42 = (previous == 10 ? v[38] : v[4]);
        long phi43 = (previous == 10 ? v[41] : v[1]);
        v[42] = phi42;
        v[43] = phi43;
        v[44] = ((v[42] << v[43])) & 4294967295L;
        v[45] = (v[0] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        m.store(v[45], v[44], 4);
        v[46] = (13616L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[42], 32) * 8L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = (v[0] + (Heap.s(0L, 32) * 20L) + 12L) & 4294967295L;
        m.store(v[48], v[47], 4);
        v[49] = (13616L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[42], 32) * 8L) + 4L) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = ((v[50] + v[43])) & 4294967295L;
        v[52] = (v[0] + (Heap.s(0L, 32) * 20L) + 16L) & 4294967295L;
        m.store(v[52], v[51], 4);
        v[53] = ((v[44] * 3L)) & 4294967295L;
        v[54] = ((v[53] + 1L)) & 4294967295L;
        v[55] = ((Heap.s(v[54], 32) >> 3L)) & 4294967295L;
        v[56] = (v[0] + (Heap.s(0L, 32) * 20L) + 8L) & 4294967295L;
        m.store(v[56], v[55], 4);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        return -1;
    }
}
