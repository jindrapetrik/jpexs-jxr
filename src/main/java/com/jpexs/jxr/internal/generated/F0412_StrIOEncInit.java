package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: StrIOEncInit.
 */
public final class F0412_StrIOEncInit {

    private F0412_StrIOEncInit() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[91];
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
                    default:
                        throw new IllegalStateException("Invalid block in StrIOEncInit");
                }
                previous = old;
                if (pc < 0) {
                    return v[90];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = ((0L - v[7])) & 4294967295L;
        v[9] = v[5] != v[8] ? 1L : 0L;
        v[10] = (v[9]) & 4294967295L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi11 = (previous == 0 ? 1L : v[10]);
        v[11] = phi11;
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 24L) & 4294967295L;
        m.store(v[12], v[11], 4);
        v[13] = F0342_allocateBitIOInfo.run(m, v[0]);
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 3 : 16;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 48L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = F0371_attachISWrite.run(m, v[16], v[18]);
        v[20] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = v[21] == 0L ? 1L : 0L;
        return v[22] != 0 ? 16 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = ((v[21] << 2L)) & 4294967295L;
        v[24] = LibC.call(m, "malloc", new long[]{v[23]});
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34920L) & 4294967295L;
        m.store(v[25], v[24], 4);
        v[26] = v[24] == 0L ? 1L : 0L;
        return v[26] != 0 ? 16 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[27] = m.load(v[20], 4);
        v[28] = ((v[27] << 2L)) & 4294967295L;
        v[29] = LibC.call(m, "memset", new long[]{v[24], 0L, v[28]});
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((v[33] * v[31])) & 4294967295L;
        v[35] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = ((v[34] * v[36])) & 4294967295L;
        v[38] = v[37] > 67108863L ? 1L : 0L;
        return v[38] != 0 ? 6 : 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[39] = m.load(v[20], 4);
        v[40] = ((v[39] << 2L)) & 4294967295L;
        v[41] = LibC.call(m, "malloc", new long[]{v[40]});
        v[42] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34924L) & 4294967295L;
        m.store(v[42], v[41], 4);
        v[43] = v[41] == 0L ? 1L : 0L;
        return v[43] != 0 ? 16 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[44] = m.load(v[20], 4);
        v[45] = ((v[44] << 2L)) & 4294967295L;
        v[46] = LibC.call(m, "memset", new long[]{v[41], 0L, v[45]});
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[47] = m.load(v[20], 4);
        v[48] = v[47] == 0L ? 1L : 0L;
        return v[48] != 0 ? 16 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[49] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34924L) & 4294967295L;
        v[50] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34296L) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi51 = (previous == 9 ? 0L : v[86]);
        v[51] = phi51;
        v[52] = m.load(v[30], 4);
        v[53] = m.load(v[32], 4);
        v[54] = ((v[53] * v[52])) & 4294967295L;
        v[55] = m.load(v[35], 4);
        v[56] = ((v[54] * v[55])) & 4294967295L;
        v[57] = v[56] > 67108863L ? 1L : 0L;
        return v[57] != 0 ? 11 : 14;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[58] = LibC.call(m, "malloc", new long[]{4096L});
        v[59] = m.load(v[49], 4);
        v[60] = (v[59] + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        m.store(v[60], v[58], 4);
        v[61] = m.load(v[49], 4);
        v[62] = (v[61] + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = v[63] == 0L ? 1L : 0L;
        return v[64] != 0 ? 16 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[65] = LibC.call(m, "tmpnam", new long[]{0L});
        v[66] = v[65] == 0L ? 1L : 0L;
        return v[66] != 0 ? 16 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[67] = m.load(v[49], 4);
        v[68] = (v[67] + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = LibC.call(m, "strcpy", new long[]{v[69], v[65]});
        v[71] = m.load(v[25], 4);
        v[72] = (v[71] + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        v[73] = F0308_CreateWS_File.run(m, v[72], v[65], 12320L);
        v[74] = v[73] == 0L ? 1L : 0L;
        return v[74] != 0 ? 15 : 16;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[75] = m.load(v[25], 4);
        v[76] = (v[75] + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        v[77] = F0329_CreateWS_List.run(m, v[76]);
        v[78] = v[77] == 0L ? 1L : 0L;
        return v[78] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[79] = m.load(v[50], 4);
        v[80] = (v[79] + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = m.load(v[25], 4);
        v[83] = (v[82] + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = F0371_attachISWrite.run(m, v[81], v[84]);
        v[86] = ((v[51] + 1L)) & 4294967295L;
        v[87] = m.load(v[20], 4);
        v[88] = v[86] < v[87] ? 1L : 0L;
        return v[88] != 0 ? 10 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi89 = (previous == 2 ? 4294967295L : (previous == 3 ? 0L : (previous == 4 ? 4294967295L : (previous == 6 ? 4294967295L : (previous == 8 ? 0L : (previous == 15 ? 0L : (previous == 11 ? 4294967295L : (previous == 12 ? 4294967295L : (previous == 13 ? 4294967295L : 4294967295L)))))))));
        v[89] = phi89;
        v[90] = v[89];
        return -1;
    }
}
