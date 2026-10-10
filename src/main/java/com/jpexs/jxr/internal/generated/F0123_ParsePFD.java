package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ParsePFD.
 */
public final class F0123_ParsePFD {

    private F0123_ParsePFD() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[47];
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
                        throw new IllegalStateException("Invalid block in ParsePFD");
                }
                previous = old;
                if (pc < 0) {
                    return v[46];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(2L * 1L, 2);
        v[4] = m.stack(2L * 1L, 2);
        v[5] = m.stack(4L * 1L, 4);
        v[6] = m.stack(4L * 1L, 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[2] == 0L ? 1L : 0L;
        return v[9] != 0 ? 8 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi10 = (previous == 7 ? v[31] : 0L);
        long phi11 = (previous == 7 ? v[30] : v[1]);
        v[10] = phi10;
        v[11] = phi11;
        m.store(v[3], 0L, 2);
        m.store(v[4], 0L, 2);
        m.store(v[5], 0L, 4);
        m.store(v[6], 0L, 4);
        v[12] = F0238_GetUShort.run(m, v[8], v[11], v[3]);
        v[13] = Heap.s(v[12], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[13] != 0 ? 6 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[14] = ((v[11] + 2L)) & 4294967295L;
        v[15] = F0238_GetUShort.run(m, v[8], v[14], v[4]);
        v[16] = Heap.s(v[15], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[16] != 0 ? 6 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[17] = ((v[11] + 4L)) & 4294967295L;
        v[18] = F0239_GetULong.run(m, v[8], v[17], v[5]);
        v[19] = Heap.s(v[18], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[19] != 0 ? 6 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[20] = ((v[11] + 8L)) & 4294967295L;
        v[21] = F0239_GetULong.run(m, v[8], v[20], v[6]);
        v[22] = Heap.s(v[21], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[22] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[23] = m.load(v[3], 2);
        v[24] = m.load(v[4], 2);
        v[25] = m.load(v[5], 4);
        v[26] = m.load(v[6], 4);
        v[27] = F0121_ParsePFDEntry.run(m, v[0], v[23], v[24], v[25], v[26]);
        v[28] = Heap.s(v[27], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[28] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi29 = (previous == 4 ? v[21] : (previous == 3 ? v[18] : (previous == 2 ? v[15] : (previous == 1 ? v[12] : v[27]))));
        v[29] = phi29;
        return 12;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[30] = ((v[11] + 12L)) & 4294967295L;
        v[31] = ((v[10] + 1L)) & 65535L;
        v[32] = v[31] == v[2] ? 1L : 0L;
        return v[32] != 0 ? 8 : 1;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi33 = (previous == 0 ? 0L : v[27]);
        v[33] = phi33;
        v[34] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65960L) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = v[35] == 0L ? 1L : 0L;
        return v[36] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[37] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 8L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = v[38] == 0L ? 1L : 0L;
        return v[39] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[40] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 12L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = v[41] != 0L ? 1L : 0L;
        v[43] = (v[42]) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi44 = (previous == 9 ? 0L : (previous == 8 ? 0L : v[43]));
        v[44] = phi44;
        m.store(v[34], v[44], 4);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi45 = (previous == 11 ? v[33] : v[29]);
        v[45] = phi45;
        v[46] = v[45];
        return -1;
    }
}
