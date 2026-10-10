package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: updatePredInfo.
 */
public final class F0471_updatePredInfo {

    private F0471_updatePredInfo() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[118];
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
                    default:
                        throw new IllegalStateException("Invalid block in updatePredInfo");
                }
                previous = old;
                if (pc < 0) {
                    return v[117];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = ((v[3] + 4294967295L)) & 4294967295L;
        v[5] = v[4] < 2L ? 1L : 0L;
        return v[5] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi9 = (previous == 1 ? v[7] : 1L);
        v[9] = phi9;
        v[10] = (v[1] + (Heap.s(0L, 32) * 1160L) + 1156L) & 4294967295L;
        v[11] = m.load(v[10], 1);
        v[12] = (v[11]) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 2 ? 0L : v[39]);
        v[13] = phi13;
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[15] + (Heap.s(v[2], 32) * 40L)) & 4294967295L;
        v[17] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[13], 32) * 64L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[15] + (Heap.s(v[2], 32) * 40L) + 8L) & 4294967295L;
        m.store(v[19], v[18], 4);
        m.store(v[16], v[12], 4);
        v[20] = (v[15] + (Heap.s(v[2], 32) * 40L) + 36L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = (v[17] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        m.store(v[21], v[23], 4);
        v[24] = (v[17] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = (v[21] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[26], v[25], 4);
        v[27] = (v[17] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = (v[21] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[29], v[28], 4);
        v[30] = (v[17] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[21] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[32], v[31], 4);
        v[33] = (v[17] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = (v[21] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[35], v[34], 4);
        v[36] = (v[17] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = (v[21] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        m.store(v[38], v[37], 4);
        v[39] = ((v[13] + 1L)) & 4294967295L;
        v[40] = v[39] == v[9] ? 1L : 0L;
        return v[40] != 0 ? 4 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        switch ((int) v[3]) {
            case 1:
                return 6;
            case 2:
                return 5;
            default:
                return 7;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[41] = (v[1] + (Heap.s(0L, 32) * 1160L) + 1156L) & 4294967295L;
        v[42] = m.load(v[41], 1);
        v[43] = (v[42]) & 4294967295L;
        v[44] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = (v[45] + (Heap.s(v[2], 32) * 40L)) & 4294967295L;
        m.store(v[46], v[43], 4);
        v[47] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L)) & 4294967295L;
        v[48] = m.load(v[47], 4);
        v[49] = (v[45] + (Heap.s(v[2], 32) * 40L) + 8L) & 4294967295L;
        m.store(v[49], v[48], 4);
        v[50] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = (v[45] + (Heap.s(v[2], 32) * 40L) + 36L) & 4294967295L;
        v[53] = m.load(v[52], 4);
        m.store(v[53], v[51], 4);
        v[54] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = (v[53] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[56], v[55], 4);
        v[57] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[58] = m.load(v[57], 4);
        v[59] = (v[53] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[59], v[58], 4);
        v[60] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = (v[53] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[62], v[61], 4);
        v[63] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = (v[53] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[65], v[64], 4);
        v[66] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[67] = m.load(v[66], 4);
        v[68] = (v[67] + (Heap.s(v[2], 32) * 40L)) & 4294967295L;
        m.store(v[68], v[43], 4);
        v[69] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L)) & 4294967295L;
        v[70] = m.load(v[69], 4);
        v[71] = (v[67] + (Heap.s(v[2], 32) * 40L) + 8L) & 4294967295L;
        m.store(v[71], v[70], 4);
        v[72] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = (v[67] + (Heap.s(v[2], 32) * 40L) + 36L) & 4294967295L;
        v[75] = m.load(v[74], 4);
        m.store(v[75], v[73], 4);
        v[76] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = (v[75] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[78], v[77], 4);
        v[79] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[80] = m.load(v[79], 4);
        v[81] = (v[75] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[81], v[80], 4);
        v[82] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = (v[75] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[84], v[83], 4);
        v[85] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[86] = m.load(v[85], 4);
        v[87] = (v[75] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[87], v[86], 4);
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[88] = (v[1] + (Heap.s(0L, 32) * 1160L) + 1156L) & 4294967295L;
        v[89] = m.load(v[88], 1);
        v[90] = (v[89]) & 4294967295L;
        v[91] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[92] = m.load(v[91], 4);
        v[93] = (v[92] + (Heap.s(v[2], 32) * 40L)) & 4294967295L;
        v[94] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L)) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = (v[92] + (Heap.s(v[2], 32) * 40L) + 8L) & 4294967295L;
        m.store(v[96], v[95], 4);
        m.store(v[93], v[90], 4);
        v[97] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = (v[92] + (Heap.s(v[2], 32) * 40L) + 36L) & 4294967295L;
        v[100] = m.load(v[99], 4);
        m.store(v[100], v[98], 4);
        v[101] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(1L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[102] = m.load(v[101], 4);
        v[103] = (v[100] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[103], v[102], 4);
        v[104] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[105] = m.load(v[104], 4);
        v[106] = (v[105] + (Heap.s(v[2], 32) * 40L)) & 4294967295L;
        v[107] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L)) & 4294967295L;
        v[108] = m.load(v[107], 4);
        v[109] = (v[105] + (Heap.s(v[2], 32) * 40L) + 8L) & 4294967295L;
        m.store(v[109], v[108], 4);
        m.store(v[106], v[90], 4);
        v[110] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[111] = m.load(v[110], 4);
        v[112] = (v[105] + (Heap.s(v[2], 32) * 40L) + 36L) & 4294967295L;
        v[113] = m.load(v[112], 4);
        m.store(v[113], v[111], 4);
        v[114] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(2L, 32) * 64L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[115] = m.load(v[114], 4);
        v[116] = (v[113] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[116], v[115], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        return -1;
    }
}
