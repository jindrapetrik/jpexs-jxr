package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: getDCACPredMode.
 */
public final class F0469_getDCACPredMode {

    private F0469_getDCACPredMode() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[99];
        v[0] = a0;
        v[1] = a1;
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
                    default:
                        throw new IllegalStateException("Invalid block in getDCACPredMode");
                }
                previous = old;
                if (pc < 0) {
                    return v[98];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34276L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34280L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = v[6] == 0L ? 1L : 0L;
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        return v[7] != 0 ? 7 : 11;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return v[7] != 0 ? 3 : 9;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = ((v[1] + 4294967295L)) & 4294967295L;
        v[13] = (v[11] + (Heap.s(v[12], 32) * 40L) + 8L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = (v[16] + (Heap.s(v[1], 32) * 40L) + 8L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[16] + (Heap.s(v[12], 32) * 40L) + 8L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        switch ((int) v[9]) {
            case 6:
                return 4;
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = ((v[20] - v[14])) & 4294967295L;
        v[22] = LibC.call(m, "abs", new long[]{v[21]});
        v[23] = ((v[20] - v[18])) & 4294967295L;
        v[24] = LibC.call(m, "abs", new long[]{v[23]});
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[26] + (Heap.s(v[1], 32) * 40L)) & 4294967295L;
        v[28] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = (v[29] + (Heap.s(v[1], 32) * 40L)) & 4294967295L;
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = (v[32] + (Heap.s(v[1], 32) * 40L)) & 4294967295L;
        v[34] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = (v[35] + (Heap.s(v[1], 32) * 40L)) & 4294967295L;
        v[37] = v[9] == 1L ? 1L : 0L;
        v[38] = v[9] == 2L ? 1L : 0L;
        v[39] = ((v[20] - v[14])) & 4294967295L;
        v[40] = LibC.call(m, "abs", new long[]{v[39]});
        v[41] = v[38] != 0 ? 2L : 1L;
        v[42] = v[37] != 0 ? 3L : v[41];
        v[43] = ((v[40] << v[42])) & 4294967295L;
        v[44] = (v[27] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = (v[30] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = ((v[45] - v[47])) & 4294967295L;
        v[49] = LibC.call(m, "abs", new long[]{v[48]});
        v[50] = ((v[49] + v[43])) & 4294967295L;
        v[51] = (v[33] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = (v[36] + (Heap.s(4294967295L, 32) * 40L) + 8L) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = ((v[52] - v[54])) & 4294967295L;
        v[56] = LibC.call(m, "abs", new long[]{v[55]});
        v[57] = ((v[50] + v[56])) & 4294967295L;
        v[58] = ((v[20] - v[18])) & 4294967295L;
        v[59] = LibC.call(m, "abs", new long[]{v[58]});
        v[60] = ((v[59] << v[42])) & 4294967295L;
        v[61] = m.load(v[44], 4);
        v[62] = (v[26] + (Heap.s(v[1], 32) * 40L) + 8L) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = ((v[61] - v[63])) & 4294967295L;
        v[65] = LibC.call(m, "abs", new long[]{v[64]});
        v[66] = ((v[65] + v[60])) & 4294967295L;
        v[67] = m.load(v[51], 4);
        v[68] = (v[32] + (Heap.s(v[1], 32) * 40L) + 8L) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = ((v[67] - v[69])) & 4294967295L;
        v[71] = LibC.call(m, "abs", new long[]{v[70]});
        v[72] = ((v[66] + v[71])) & 4294967295L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi73 = (previous == 4 ? v[24] : v[72]);
        long phi74 = (previous == 4 ? v[22] : v[57]);
        v[73] = phi73;
        v[74] = phi74;
        v[75] = ((v[74] << 2L)) & 4294967295L;
        v[76] = Heap.s(v[75], 32) < Heap.s(v[73], 32) ? 1L : 0L;
        return v[76] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[77] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L) & 4294967295L;
        v[78] = m.load(v[77], 4);
        v[79] = (v[78] + (Heap.s(v[1], 32) * 40L)) & 4294967295L;
        return 10;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[80] = ((v[73] << 2L)) & 4294967295L;
        v[81] = Heap.s(v[80], 32) < Heap.s(v[74], 32) ? 1L : 0L;
        return v[81] != 0 ? 9 : 11;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[82] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = (v[83] + (Heap.s(v[1], 32) * 40L)) & 4294967295L;
        v[85] = (v[84] + (Heap.s(4294967295L, 32) * 40L)) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi86 = (previous == 7 ? v[79] : v[85]);
        long phi87 = (previous == 7 ? 4L : 0L);
        long phi88 = (previous == 7 ? 1L : 0L);
        v[86] = phi86;
        v[87] = phi87;
        v[88] = phi88;
        v[89] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1156L) & 4294967295L;
        v[90] = m.load(v[89], 1);
        v[91] = (v[90]) & 4294967295L;
        v[92] = m.load(v[86], 4);
        v[93] = v[92] == v[91] ? 1L : 0L;
        v[94] = v[93] != 0 ? v[87] : 8L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi95 = (previous == 8 ? 2L : (previous == 1 ? 3L : v[88]));
        long phi96 = (previous == 8 ? 8L : (previous == 1 ? 8L : v[94]));
        v[95] = phi95;
        v[96] = phi96;
        v[97] = ((v[96] | v[95])) & 4294967295L;
        v[98] = v[97];
        return -1;
    }
}
