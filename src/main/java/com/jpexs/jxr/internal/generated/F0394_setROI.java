package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: setROI.
 */
public final class F0394_setROI {

    private F0394_setROI() {
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
                    case 16:
                        pc = b16(m, v, previous);
                        break;
                    case 17:
                        pc = b17(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in setROI");
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
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 44L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 52L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = m.load(v[1], 4);
        v[7] = ((v[5] + v[3])) & 4294967295L;
        v[8] = ((v[6] - v[7])) & 4294967295L;
        m.store(v[1], v[8], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 40L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 48L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 4L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = ((v[12] + v[10])) & 4294967295L;
        v[16] = ((v[14] - v[15])) & 4294967295L;
        m.store(v[13], v[16], 4);
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = v[18] == 1L ? 1L : 0L;
        v[20] = (v[19]) & 4294967295L;
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[22] + (Heap.s(0L, 32) * 48L) + 8L) & 4294967295L;
        m.store(v[23], v[20], 4);
        v[24] = v[18] == 0L ? 1L : 0L;
        v[25] = v[24] != 0 ? 1L : v[20];
        v[26] = (v[22] + (Heap.s(0L, 32) * 48L) + 16L) & 4294967295L;
        m.store(v[26], v[25], 4);
        v[27] = v[18] != 3L ? 1L : 0L;
        v[28] = (v[27]) & 4294967295L;
        v[29] = (v[22] + (Heap.s(0L, 32) * 48L) + 20L) & 4294967295L;
        m.store(v[29], v[28], 4);
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 52L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        return 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi32 = (previous == 0 ? 1L : v[35]);
        v[32] = phi32;
        v[33] = ((v[31] * v[32])) & 4294967295L;
        v[34] = v[33] < v[8] ? 1L : 0L;
        v[35] = ((v[32] << 1L)) & 4294967295L;
        return v[34] != 0 ? 1 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[36] = (v[22] + (Heap.s(0L, 32) * 48L) + 12L) & 4294967295L;
        m.store(v[36], v[32], 4);
        v[37] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = v[38] == 1L ? 1L : 0L;
        v[40] = v[32] > 3L ? 1L : 0L;
        v[41] = ((v[40] & v[39])) & 1L;
        return v[41] != 0 ? 3 : 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        m.store(v[26], 0L, 4);
        v[42] = v[32] > 15L ? 1L : 0L;
        return v[42] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        m.store(v[29], 0L, 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[43] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 32L) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = ((v[44] * v[32])) & 4294967295L;
        v[46] = ((v[45] + v[3])) & 4294967295L;
        v[47] = (v[22] + (Heap.s(0L, 32) * 48L) + 24L) & 4294967295L;
        m.store(v[47], v[46], 4);
        v[48] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 36L) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = ((v[49] * v[32])) & 4294967295L;
        v[51] = ((v[46] + 4294967295L)) & 4294967295L;
        v[52] = ((v[51] + v[50])) & 4294967295L;
        v[53] = (v[22] + (Heap.s(0L, 32) * 48L) + 28L) & 4294967295L;
        m.store(v[53], v[52], 4);
        v[54] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 40L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = ((v[55] * v[32])) & 4294967295L;
        v[57] = ((v[56] + v[10])) & 4294967295L;
        v[58] = (v[22] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        m.store(v[58], v[57], 4);
        v[59] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 44L) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = ((v[60] * v[32])) & 4294967295L;
        v[62] = ((v[57] + 4294967295L)) & 4294967295L;
        v[63] = ((v[62] + v[61])) & 4294967295L;
        v[64] = (v[22] + (Heap.s(0L, 32) * 48L) + 36L) & 4294967295L;
        m.store(v[64], v[63], 4);
        v[65] = v[52] < v[6] ? 1L : 0L;
        return v[65] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[66] = ((v[6] + 4294967295L)) & 4294967295L;
        m.store(v[53], v[66], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi67 = (previous == 6 ? v[66] : v[52]);
        v[67] = phi67;
        v[68] = v[63] < v[14] ? 1L : 0L;
        return v[68] != 0 ? 9 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[69] = ((v[14] + 4294967295L)) & 4294967295L;
        m.store(v[64], v[69], 4);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi70 = (previous == 8 ? v[69] : v[63]);
        v[70] = phi70;
        v[71] = ((0L - v[57])) & 4294967295L;
        v[72] = v[46] == v[71] ? 1L : 0L;
        return v[72] != 0 ? 10 : 12;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[73] = ((v[67] + 15L)) & 4294967295L;
        v[74] = ((v[73] >>> 4L)) & 4294967295L;
        v[75] = ((v[6] + 14L)) & 4294967295L;
        v[76] = ((v[75] >>> 4L)) & 4294967295L;
        v[77] = v[74] < v[76] ? 1L : 0L;
        return v[77] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[78] = ((v[70] + 15L)) & 4294967295L;
        v[79] = ((v[78] >>> 4L)) & 4294967295L;
        v[80] = ((v[14] + 14L)) & 4294967295L;
        v[81] = ((v[80] >>> 4L)) & 4294967295L;
        v[82] = v[79] >= v[81] ? 1L : 0L;
        v[83] = (v[82]) & 4294967295L;
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi84 = (previous == 10 ? 0L : (previous == 9 ? 0L : v[83]));
        v[84] = phi84;
        m.store(v[22], v[84], 4);
        v[85] = v[46] == 0L ? 1L : 0L;
        return v[85] != 0 ? 13 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[86] = ((v[67] + 15L)) & 4294967295L;
        v[87] = ((v[86] >>> 4L)) & 4294967295L;
        v[88] = ((v[6] + 14L)) & 4294967295L;
        v[89] = ((v[88] >>> 4L)) & 4294967295L;
        v[90] = v[87] >= v[89] ? 1L : 0L;
        v[91] = (v[90]) & 4294967295L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi92 = (previous == 12 ? 0L : v[91]);
        v[92] = phi92;
        v[93] = (v[22] + (Heap.s(0L, 32) * 48L) + 4L) & 4294967295L;
        m.store(v[93], v[92], 4);
        m.store(v[1], v[8], 4);
        m.store(v[13], v[16], 4);
        return v[39] != 0 ? 15 : 17;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[94] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 48L) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = v[95] == 1L ? 1L : 0L;
        return v[96] != 0 ? 16 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        m.store(v[23], 1L, 4);
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[97] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        m.store(v[97], 0L, 4);
        v[98] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        m.store(v[98], 0L, 4);
        return -1;
    }
}
