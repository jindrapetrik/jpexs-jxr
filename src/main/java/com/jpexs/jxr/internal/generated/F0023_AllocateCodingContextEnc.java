package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: AllocateCodingContextEnc.
 */
public final class F0023_AllocateCodingContextEnc {

    private F0023_AllocateCodingContextEnc() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[113];
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
                    default:
                        throw new IllegalStateException("Invalid block in AllocateCodingContextEnc");
                }
                previous = old;
                if (pc < 0) {
                    return v[112];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = LibC.call(m, "llvm.smin.i32", new long[]{v[2], 15L});
        v[4] = LibC.call(m, "llvm.smax.i32", new long[]{v[3], 0L});
        v[5] = Heap.s(v[2], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[6] = (v[5]) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 28L) & 4294967295L;
        m.store(v[7], v[6], 4);
        v[8] = ((v[1] + 4294963199L)) & 4294967295L;
        v[9] = v[8] < 4294963200L ? 1L : 0L;
        v[10] = v[0] == 0L ? 1L : 0L;
        v[11] = ((v[10] | v[9])) & 1L;
        return v[11] != 0 ? 11 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = ((v[1] * 592L)) & 4294967295L;
        v[13] = LibC.call(m, "malloc", new long[]{v[12]});
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34308L) & 4294967295L;
        m.store(v[14], v[13], 4);
        v[15] = v[13] == 0L ? 1L : 0L;
        return v[15] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34312L) & 4294967295L;
        m.store(v[16], 0L, 4);
        return 11;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[17] = LibC.call(m, "memset", new long[]{v[13], 0L, v[12]});
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34312L) & 4294967295L;
        m.store(v[18], v[1], 4);
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        switch ((int) v[20]) {
            case 0:
                return 5;
            case 6:
                return 5;
            default:
                return 4;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = v[20] == 4L ? 1L : 0L;
        v[22] = v[21] != 0 ? 5L : 9L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi23 = (previous == 3 ? 5L : (previous == 4 ? v[22] : 5L));
        v[23] = phi23;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi24 = (previous == 10 ? v[109] : 0L);
        v[24] = phi24;
        v[25] = m.load(v[14], 4);
        v[26] = (v[25] + (Heap.s(v[24], 32) * 592L)) & 4294967295L;
        v[27] = F0002_Allocate.run(m, v[23], 0L);
        v[28] = (v[25] + (Heap.s(v[24], 32) * 592L) + 16L) & 4294967295L;
        m.store(v[28], v[27], 4);
        v[29] = v[27] == 0L ? 1L : 0L;
        return v[29] != 0 ? 11 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[30] = F0002_Allocate.run(m, 5L, 0L);
        v[31] = (v[25] + (Heap.s(v[24], 32) * 592L) + 20L) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = v[30] == 0L ? 1L : 0L;
        return v[32] != 0 ? 11 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[33] = ((v[35] + 1L)) & 4294967295L;
        v[34] = v[33] == 21L ? 1L : 0L;
        return v[34] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi35 = (previous == 8 ? v[33] : 0L);
        v[35] = phi35;
        v[36] = (3744L + (Heap.s(0L, 32) * 84L) + (Heap.s(v[35], 32) * 4L)) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = F0002_Allocate.run(m, v[37], 0L);
        v[39] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(v[35], 32) * 4L)) & 4294967295L;
        m.store(v[39], v[38], 4);
        v[40] = v[38] == 0L ? 1L : 0L;
        return v[40] != 0 ? 11 : 8;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[41] = m.load(v[28], 4);
        v[42] = (v[41] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[42], 0L, 4);
        v[43] = m.load(v[31], 4);
        v[44] = (v[43] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[44], 0L, 4);
        v[45] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = (v[46] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[47], 0L, 4);
        v[48] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = (v[49] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[50], 0L, 4);
        v[51] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = (v[52] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[53], 0L, 4);
        v[54] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = (v[55] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[56], 0L, 4);
        v[57] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[58] = m.load(v[57], 4);
        v[59] = (v[58] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[59], 0L, 4);
        v[60] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = (v[61] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[62], 0L, 4);
        v[63] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = (v[64] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[65], 0L, 4);
        v[66] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[67] = m.load(v[66], 4);
        v[68] = (v[67] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[68], 0L, 4);
        v[69] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[70] = m.load(v[69], 4);
        v[71] = (v[70] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[71], 0L, 4);
        v[72] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = (v[73] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[74], 0L, 4);
        v[75] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[76] = m.load(v[75], 4);
        v[77] = (v[76] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[77], 0L, 4);
        v[78] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[79] = m.load(v[78], 4);
        v[80] = (v[79] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[80], 0L, 4);
        v[81] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[82] = m.load(v[81], 4);
        v[83] = (v[82] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[83], 0L, 4);
        v[84] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = (v[85] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[86], 0L, 4);
        v[87] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[88] = m.load(v[87], 4);
        v[89] = (v[88] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[89], 0L, 4);
        v[90] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[91] = m.load(v[90], 4);
        v[92] = (v[91] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[92], 0L, 4);
        v[93] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[94] = m.load(v[93], 4);
        v[95] = (v[94] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[95], 0L, 4);
        v[96] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(17L, 32) * 4L)) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = (v[97] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[98], 0L, 4);
        v[99] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(18L, 32) * 4L)) & 4294967295L;
        v[100] = m.load(v[99], 4);
        v[101] = (v[100] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[101], 0L, 4);
        v[102] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(19L, 32) * 4L)) & 4294967295L;
        v[103] = m.load(v[102], 4);
        v[104] = (v[103] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[104], 0L, 4);
        v[105] = (v[25] + (Heap.s(v[24], 32) * 592L) + 24L + (Heap.s(20L, 32) * 4L)) & 4294967295L;
        v[106] = m.load(v[105], 4);
        v[107] = (v[106] + (Heap.s(0L, 32) * 44L) + 24L) & 4294967295L;
        m.store(v[107], 0L, 4);
        F0291_AdaptLowpassEnc.run(m, v[26]);
        F0292_AdaptHighpassEnc.run(m, v[26]);
        F0029_InitZigzagScan.run(m, v[26]);
        F0028_ResetCodingContext.run(m, v[26]);
        v[108] = (v[25] + (Heap.s(v[24], 32) * 592L) + 584L) & 4294967295L;
        m.store(v[108], v[4], 4);
        v[109] = ((v[24] + 1L)) & 4294967295L;
        v[110] = v[109] == v[1] ? 1L : 0L;
        return v[110] != 0 ? 11 : 6;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi111 = (previous == 2 ? 4294967295L : (previous == 0 ? 4294967295L : (previous == 9 ? 4294967295L : (previous == 7 ? 4294967295L : (previous == 6 ? 4294967295L : 0L)))));
        v[111] = phi111;
        v[112] = v[111];
        return -1;
    }
}
