package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: allocateBitIOInfo.
 */
public final class F0342_allocateBitIOInfo {

    private F0342_allocateBitIOInfo() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[84];
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
                        throw new IllegalStateException("Invalid block in allocateBitIOInfo");
                }
                previous = old;
                if (pc < 0) {
                    return v[83];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        switch ((int) v[2]) {
            case 3:
                return 3;
            case 2:
                return 2;
            default:
                return 1;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = v[2] == 1L ? 1L : 0L;
        v[4] = v[3] != 0 ? 3L : 4L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi5 = (previous == 0 ? 1L : (previous == 1 ? v[4] : 2L));
        v[5] = phi5;
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34236L) & 4294967295L;
        m.store(v[6], v[5], 1);
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 24L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 14 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = v[11] == 0L ? 1L : 0L;
        v[13] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = ((v[14] + 1L)) & 4294967295L;
        v[16] = (v[5]) & 4294967295L;
        v[17] = v[12] != 0 ? 1L : v[16];
        v[18] = ((v[15] * v[17])) & 4294967295L;
        v[19] = v[18] > 16384L ? 1L : 0L;
        return v[19] != 0 ? 15 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[20] = v[18] == 0L ? 1L : 0L;
        return v[20] != 0 ? 14 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[21] = ((v[18] << 5L)) & 4294967295L;
        v[22] = ((v[21] + 16383L)) & 4294967295L;
        v[23] = ((v[18] << 14L)) & 4294967295L;
        v[24] = ((v[22] + v[23])) & 4294967295L;
        v[25] = LibC.call(m, "malloc", new long[]{v[24]});
        v[26] = v[25] == 0L ? 1L : 0L;
        return v[26] != 0 ? 15 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[27] = LibC.call(m, "memset", new long[]{v[25], 0L, v[24]});
        v[28] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34296L) & 4294967295L;
        m.store(v[28], v[25], 4);
        v[29] = (v[25] + (Heap.s(v[21], 32) * 1L)) & 4294967295L;
        v[30] = (v[29]) & 4294967295L;
        v[31] = ((v[30] + 16383L)) & 4294967295L;
        v[32] = ((v[31] & 4294950912L)) & 4294967295L;
        v[33] = (v[32]) & 4294967295L;
        v[34] = (v[33] + (Heap.s(8192L, 32) * 1L)) & 4294967295L;
        v[35] = ((v[18] & 3L)) & 4294967295L;
        v[36] = v[18] < 4L ? 1L : 0L;
        return v[36] != 0 ? 10 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[37] = ((v[18] & 32764L)) & 4294967295L;
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi38 = (previous == 8 ? v[34] : v[55]);
        long phi39 = (previous == 8 ? 0L : v[56]);
        long phi40 = (previous == 8 ? 0L : v[57]);
        v[38] = phi38;
        v[39] = phi39;
        v[40] = phi40;
        v[41] = m.load(v[28], 4);
        v[42] = (v[41] + (Heap.s(v[39], 32) * 4L)) & 4294967295L;
        m.store(v[42], v[38], 4);
        v[43] = (v[38] + (Heap.s(16384L, 32) * 1L)) & 4294967295L;
        v[44] = ((v[39] | 1L)) & 4294967295L;
        v[45] = m.load(v[28], 4);
        v[46] = (v[45] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        m.store(v[46], v[43], 4);
        v[47] = (v[38] + (Heap.s(32768L, 32) * 1L)) & 4294967295L;
        v[48] = ((v[39] | 2L)) & 4294967295L;
        v[49] = m.load(v[28], 4);
        v[50] = (v[49] + (Heap.s(v[48], 32) * 4L)) & 4294967295L;
        m.store(v[50], v[47], 4);
        v[51] = (v[38] + (Heap.s(49152L, 32) * 1L)) & 4294967295L;
        v[52] = ((v[39] | 3L)) & 4294967295L;
        v[53] = m.load(v[28], 4);
        v[54] = (v[53] + (Heap.s(v[52], 32) * 4L)) & 4294967295L;
        m.store(v[54], v[51], 4);
        v[55] = (v[38] + (Heap.s(65536L, 32) * 1L)) & 4294967295L;
        v[56] = ((v[39] + 4L)) & 4294967295L;
        v[57] = ((v[40] + 4L)) & 4294967295L;
        v[58] = v[57] == v[37] ? 1L : 0L;
        return v[58] != 0 ? 10 : 9;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi59 = (previous == 7 ? v[34] : v[55]);
        long phi60 = (previous == 7 ? 0L : v[56]);
        v[59] = phi59;
        v[60] = phi60;
        v[61] = v[35] == 0L ? 1L : 0L;
        return v[61] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi62 = (previous == 11 ? v[67] : v[59]);
        long phi63 = (previous == 11 ? v[68] : v[60]);
        long phi64 = (previous == 11 ? v[69] : 0L);
        v[62] = phi62;
        v[63] = phi63;
        v[64] = phi64;
        v[65] = m.load(v[28], 4);
        v[66] = (v[65] + (Heap.s(v[63], 32) * 4L)) & 4294967295L;
        m.store(v[66], v[62], 4);
        v[67] = (v[62] + (Heap.s(16384L, 32) * 1L)) & 4294967295L;
        v[68] = ((v[63] + 1L)) & 4294967295L;
        v[69] = ((v[64] + 1L)) & 4294967295L;
        v[70] = v[69] == v[35] ? 1L : 0L;
        return v[70] != 0 ? 12 : 11;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[71] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = v[72] > 4095L ? 1L : 0L;
        return v[73] != 0 ? 15 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[74] = ((v[72] + 1L)) & 4294967295L;
        v[75] = ((v[18] << 2L)) & 4294967295L;
        v[76] = ((v[75] * v[74])) & 4294967295L;
        v[77] = LibC.call(m, "malloc", new long[]{v[76]});
        v[78] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34264L) & 4294967295L;
        m.store(v[78], v[77], 4);
        v[79] = v[77] == 0L ? 1L : 0L;
        return v[79] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi80 = (previous == 13 ? v[18] : (previous == 5 ? 0L : 0L));
        v[80] = phi80;
        v[81] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        m.store(v[81], v[80], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi82 = (previous == 14 ? 0L : (previous == 13 ? 4294967295L : (previous == 4 ? 4294967295L : (previous == 12 ? 4294967295L : 4294967295L))));
        v[82] = phi82;
        v[83] = v[82];
        return -1;
    }
}
