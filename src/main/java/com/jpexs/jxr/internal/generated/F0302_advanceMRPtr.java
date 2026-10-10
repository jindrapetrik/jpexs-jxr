package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: advanceMRPtr.
 */
public final class F0302_advanceMRPtr {

    private F0302_advanceMRPtr() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[100];
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
                    case 14:
                        pc = b14(m, v, previous);
                        break;
                    case 15:
                        pc = b15(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in advanceMRPtr");
                }
                previous = old;
                if (pc < 0) {
                    return v[99];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (11552L + (Heap.s(0L, 32) * 36L) + (Heap.s(v[2], 32) * 4L)) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = ((v[4] << 4L)) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = v[7] == 0L ? 1L : 0L;
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 7 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34652L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        m.store(v[14], v[13], 4);
        v[15] = (v[13] + (Heap.s(256L, 32) * 4L)) & 4294967295L;
        m.store(v[12], v[15], 4);
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[17] + (Heap.s(256L, 32) * 4L)) & 4294967295L;
        m.store(v[16], v[18], 4);
        v[19] = v[10] == 1L ? 1L : 0L;
        return v[19] != 0 ? 7 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[20] = ((v[10] + 4294967295L)) & 4294967295L;
        v[21] = ((v[20] & 1L)) & 4294967295L;
        v[22] = v[10] == 2L ? 1L : 0L;
        return v[22] != 0 ? 5 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[23] = ((v[20] & 4294967294L)) & 4294967295L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi24 = (previous == 3 ? 1L : v[41]);
        long phi25 = (previous == 3 ? 0L : v[42]);
        v[24] = phi24;
        v[25] = phi25;
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34652L + (Heap.s(v[24], 32) * 4L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[24], 32) * 4L)) & 4294967295L;
        m.store(v[28], v[27], 4);
        v[29] = (v[27] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[26], v[29], 4);
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[24], 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[31] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[30], v[32], 4);
        v[33] = ((v[24] + 1L)) & 4294967295L;
        v[34] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34652L + (Heap.s(v[33], 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[33], 32) * 4L)) & 4294967295L;
        m.store(v[36], v[35], 4);
        v[37] = (v[35] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[34], v[37], 4);
        v[38] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[33], 32) * 4L)) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = (v[39] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[38], v[40], 4);
        v[41] = ((v[24] + 2L)) & 4294967295L;
        v[42] = ((v[25] + 2L)) & 4294967295L;
        v[43] = v[42] == v[23] ? 1L : 0L;
        return v[43] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi44 = (previous == 2 ? 1L : v[41]);
        v[44] = phi44;
        v[45] = v[21] == 0L ? 1L : 0L;
        return v[45] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[46] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34652L + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        m.store(v[48], v[47], 4);
        v[49] = (v[47] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[46], v[49], 4);
        v[50] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = (v[51] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[50], v[52], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[53] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[54] = m.load(v[53], 4);
        return v[8] != 0 ? 15 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[55] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = v[56] == 0L ? 1L : 0L;
        return v[57] != 0 ? 15 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[58] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34652L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        m.store(v[60], v[59], 4);
        v[61] = (v[59] + (Heap.s(256L, 32) * 4L)) & 4294967295L;
        m.store(v[58], v[61], 4);
        v[62] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = (v[63] + (Heap.s(256L, 32) * 4L)) & 4294967295L;
        m.store(v[62], v[64], 4);
        v[65] = v[56] == 1L ? 1L : 0L;
        return v[65] != 0 ? 15 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[66] = ((v[56] + 4294967295L)) & 4294967295L;
        v[67] = ((v[66] & 1L)) & 4294967295L;
        v[68] = v[56] == 2L ? 1L : 0L;
        return v[68] != 0 ? 13 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[69] = ((v[66] & 4294967294L)) & 4294967295L;
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi70 = (previous == 11 ? 1L : v[87]);
        long phi71 = (previous == 11 ? 0L : v[88]);
        v[70] = phi70;
        v[71] = phi71;
        v[72] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34652L + (Heap.s(v[70], 32) * 4L)) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[70], 32) * 4L)) & 4294967295L;
        m.store(v[74], v[73], 4);
        v[75] = (v[73] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[72], v[75], 4);
        v[76] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[70], 32) * 4L)) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = (v[77] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[76], v[78], 4);
        v[79] = ((v[70] + 1L)) & 4294967295L;
        v[80] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34652L + (Heap.s(v[79], 32) * 4L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[79], 32) * 4L)) & 4294967295L;
        m.store(v[82], v[81], 4);
        v[83] = (v[81] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[80], v[83], 4);
        v[84] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[79], 32) * 4L)) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = (v[85] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[84], v[86], 4);
        v[87] = ((v[70] + 2L)) & 4294967295L;
        v[88] = ((v[71] + 2L)) & 4294967295L;
        v[89] = v[88] == v[69] ? 1L : 0L;
        return v[89] != 0 ? 13 : 12;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi90 = (previous == 10 ? 1L : v[87]);
        v[90] = phi90;
        v[91] = v[67] == 0L ? 1L : 0L;
        return v[91] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[92] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34652L + (Heap.s(v[90], 32) * 4L)) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34460L + (Heap.s(v[90], 32) * 4L)) & 4294967295L;
        m.store(v[94], v[93], 4);
        v[95] = (v[93] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[92], v[95], 4);
        v[96] = (v[54] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[90], 32) * 4L)) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = (v[97] + (Heap.s(v[5], 32) * 4L)) & 4294967295L;
        m.store(v[96], v[98], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        return -1;
    }
}
