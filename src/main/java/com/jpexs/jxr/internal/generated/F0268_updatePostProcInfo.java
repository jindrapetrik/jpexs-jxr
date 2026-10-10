package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: updatePostProcInfo.
 */
public final class F0268_updatePostProcInfo {

    private F0268_updatePostProcInfo() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[111];
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
                    case 18:
                        pc = b18(m, v, previous);
                        break;
                    case 19:
                        pc = b19(m, v, previous);
                        break;
                    case 20:
                        pc = b20(m, v, previous);
                        break;
                    case 21:
                        pc = b21(m, v, previous);
                        break;
                    case 22:
                        pc = b22(m, v, previous);
                        break;
                    case 23:
                        pc = b23(m, v, previous);
                        break;
                    case 24:
                        pc = b24(m, v, previous);
                        break;
                    case 25:
                        pc = b25(m, v, previous);
                        break;
                    case 26:
                        pc = b26(m, v, previous);
                        break;
                    case 27:
                        pc = b27(m, v, previous);
                        break;
                    case 28:
                        pc = b28(m, v, previous);
                        break;
                    case 29:
                        pc = b29(m, v, previous);
                        break;
                    case 30:
                        pc = b30(m, v, previous);
                        break;
                    case 31:
                        pc = b31(m, v, previous);
                        break;
                    case 32:
                        pc = b32(m, v, previous);
                        break;
                    case 33:
                        pc = b33(m, v, previous);
                        break;
                    case 34:
                        pc = b34(m, v, previous);
                        break;
                    case 35:
                        pc = b35(m, v, previous);
                        break;
                    case 36:
                        pc = b36(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in updatePostProcInfo");
                }
                previous = old;
                if (pc < 0) {
                    return v[110];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(v[3], 32) * 8L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[5] + (Heap.s(v[2], 32) * 88L)) & 4294967295L;
        v[7] = m.load(v[1], 4);
        m.store(v[6], v[7], 4);
        v[8] = (v[5] + (Heap.s(v[2], 32) * 88L) + 4L) & 4294967295L;
        m.store(v[8], 0L, 1);
        v[9] = (v[1] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 1 : 15;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = (v[1] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 2 : 15;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = (v[1] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 3 : 15;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[18] = (v[1] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = v[19] == 0L ? 1L : 0L;
        return v[20] != 0 ? 4 : 15;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = (v[1] + (Heap.s(80L, 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = v[22] == 0L ? 1L : 0L;
        return v[23] != 0 ? 5 : 15;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[24] = (v[1] + (Heap.s(96L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = v[25] == 0L ? 1L : 0L;
        return v[26] != 0 ? 6 : 15;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[27] = (v[1] + (Heap.s(112L, 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = v[28] == 0L ? 1L : 0L;
        return v[29] != 0 ? 7 : 15;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[30] = (v[1] + (Heap.s(128L, 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = v[31] == 0L ? 1L : 0L;
        return v[32] != 0 ? 8 : 15;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[33] = (v[1] + (Heap.s(144L, 32) * 4L)) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = v[34] == 0L ? 1L : 0L;
        return v[35] != 0 ? 9 : 15;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[36] = (v[1] + (Heap.s(160L, 32) * 4L)) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = v[37] == 0L ? 1L : 0L;
        return v[38] != 0 ? 10 : 15;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[39] = (v[1] + (Heap.s(176L, 32) * 4L)) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = v[40] == 0L ? 1L : 0L;
        return v[41] != 0 ? 11 : 15;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[42] = (v[1] + (Heap.s(192L, 32) * 4L)) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = v[43] == 0L ? 1L : 0L;
        return v[44] != 0 ? 12 : 15;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[45] = (v[1] + (Heap.s(208L, 32) * 4L)) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = v[46] == 0L ? 1L : 0L;
        return v[47] != 0 ? 13 : 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[48] = (v[1] + (Heap.s(224L, 32) * 4L)) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = v[49] == 0L ? 1L : 0L;
        return v[50] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[51] = (v[1] + (Heap.s(240L, 32) * 4L)) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = v[52] == 0L ? 1L : 0L;
        return v[53] != 0 ? 16 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        m.store(v[8], 3L, 1);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi54 = (previous == 35 ? v[108] : 0L);
        v[54] = phi54;
        v[55] = ((v[54] << 4L)) & 4294967295L;
        v[56] = (v[1] + (Heap.s(v[55], 32) * 4L)) & 4294967295L;
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi57 = (previous == 17 ? 0L : v[106]);
        v[57] = phi57;
        v[58] = ((v[57] << 6L)) & 4294967295L;
        v[59] = (v[56] + (Heap.s(v[58], 32) * 4L)) & 4294967295L;
        v[60] = (v[5] + (Heap.s(v[2], 32) * 88L) + 72L + (Heap.s(v[54], 32) * 4L) + (Heap.s(v[57], 32) * 1L)) & 4294967295L;
        m.store(v[60], 0L, 1);
        v[61] = (v[59] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = v[62] == 0L ? 1L : 0L;
        return v[63] != 0 ? 19 : 33;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[64] = (v[59] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[65] = m.load(v[64], 4);
        v[66] = v[65] == 0L ? 1L : 0L;
        return v[66] != 0 ? 20 : 33;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[67] = (v[59] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[68] = m.load(v[67], 4);
        v[69] = v[68] == 0L ? 1L : 0L;
        return v[69] != 0 ? 21 : 33;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[70] = (v[59] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = v[71] == 0L ? 1L : 0L;
        return v[72] != 0 ? 22 : 33;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[73] = (v[59] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[74] = m.load(v[73], 4);
        v[75] = v[74] == 0L ? 1L : 0L;
        return v[75] != 0 ? 23 : 33;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[76] = (v[59] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = v[77] == 0L ? 1L : 0L;
        return v[78] != 0 ? 24 : 33;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[79] = (v[59] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[80] = m.load(v[79], 4);
        v[81] = v[80] == 0L ? 1L : 0L;
        return v[81] != 0 ? 25 : 33;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[82] = (v[59] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = v[83] == 0L ? 1L : 0L;
        return v[84] != 0 ? 26 : 33;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[85] = (v[59] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[86] = m.load(v[85], 4);
        v[87] = v[86] == 0L ? 1L : 0L;
        return v[87] != 0 ? 27 : 33;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[88] = (v[59] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[89] = m.load(v[88], 4);
        v[90] = v[89] == 0L ? 1L : 0L;
        return v[90] != 0 ? 28 : 33;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[91] = (v[59] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[92] = m.load(v[91], 4);
        v[93] = v[92] == 0L ? 1L : 0L;
        return v[93] != 0 ? 29 : 33;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[94] = (v[59] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = v[95] == 0L ? 1L : 0L;
        return v[96] != 0 ? 30 : 33;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[97] = (v[59] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = v[98] == 0L ? 1L : 0L;
        return v[99] != 0 ? 31 : 33;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[100] = (v[59] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[101] = m.load(v[100], 4);
        v[102] = v[101] == 0L ? 1L : 0L;
        return v[102] != 0 ? 32 : 33;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[103] = (v[59] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[104] = m.load(v[103], 4);
        v[105] = v[104] == 0L ? 1L : 0L;
        return v[105] != 0 ? 34 : 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        m.store(v[60], 3L, 1);
        return 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[106] = ((v[57] + 1L)) & 4294967295L;
        v[107] = v[106] == 4L ? 1L : 0L;
        return v[107] != 0 ? 35 : 18;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[108] = ((v[54] + 1L)) & 4294967295L;
        v[109] = v[108] == 4L ? 1L : 0L;
        return v[109] != 0 ? 36 : 17;
    }

    private static int b36(Heap m, long[] v, int previous) {
        return -1;
    }
}
