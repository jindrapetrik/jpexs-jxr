package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: StrIODecInit.
 */
public final class F0391_StrIODecInit {

    private F0391_StrIODecInit() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[109];
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
                    default:
                        throw new IllegalStateException("Invalid block in StrIODecInit");
                }
                previous = old;
                if (pc < 0) {
                    return v[108];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = F0342_allocateBitIOInfo.run(m, v[0]);
        v[2] = v[1] == 0L ? 1L : 0L;
        return v[2] != 0 ? 1 : 21;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 48L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = F0369_attachISRead.run(m, v[4], v[7], v[0]);
        v[9] = F0389_readIndexTable.run(m, v[0]);
        v[10] = m.load(v[5], 4);
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 21 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[13] + 1L)) & 4294967295L;
        v[15] = LibC.call(m, "printf", new long[]{11728L, v[14]});
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi16 = (previous == 2 ? 0L : v[20]);
        v[16] = phi16;
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = LibC.call(m, "printf", new long[]{11760L, v[16], v[18]});
        v[20] = ((v[16] + 1L)) & 4294967295L;
        v[21] = m.load(v[12], 4);
        v[22] = v[20] > v[21] ? 1L : 0L;
        return v[22] != 0 ? 4 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = ((v[24] + 1L)) & 4294967295L;
        v[26] = LibC.call(m, "printf", new long[]{11808L, v[25]});
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi27 = (previous == 4 ? 0L : v[31]);
        v[27] = phi27;
        v[28] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 60L + (Heap.s(v[27], 32) * 4L)) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = LibC.call(m, "printf", new long[]{11760L, v[27], v[29]});
        v[31] = ((v[27] + 1L)) & 4294967295L;
        v[32] = m.load(v[23], 4);
        v[33] = v[31] > v[32] ? 1L : 0L;
        return v[33] != 0 ? 6 : 5;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[34] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = v[35] == 0L ? 1L : 0L;
        v[37] = v[36] != 0 ? 11840L : 11872L;
        v[38] = LibC.call(m, "printf", new long[]{v[37]});
        v[39] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 24L) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = v[40] == 0L ? 1L : 0L;
        return v[41] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[42] = LibC.call(m, "printf", new long[]{11904L});
        return 21;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[43] = m.load(v[34], 4);
        v[44] = v[43] == 0L ? 1L : 0L;
        v[45] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34264L) & 4294967295L;
        v[46] = m.load(v[23], 4);
        return v[44] != 0 ? 9 : 15;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi47 = (previous == 14 ? v[67] : v[46]);
        long phi48 = (previous == 14 ? v[69] : 0L);
        v[47] = phi47;
        v[48] = phi48;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi49 = (previous == 9 ? v[47] : v[67]);
        long phi50 = (previous == 9 ? 0L : v[66]);
        v[49] = phi49;
        v[50] = phi50;
        v[51] = ((v[50] + v[48])) & 4294967295L;
        v[52] = m.load(v[12], 4);
        v[53] = ((v[52] + v[49])) & 4294967295L;
        v[54] = v[51] == v[53] ? 1L : 0L;
        return v[54] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[55] = m.load(v[45], 4);
        v[56] = ((v[49] + 1L)) & 4294967295L;
        v[57] = ((v[56] * v[48])) & 4294967295L;
        v[58] = (v[55] + (Heap.s(v[57], 32) * 4L)) & 4294967295L;
        v[59] = (v[58] + (Heap.s(v[50], 32) * 4L)) & 4294967295L;
        v[60] = (v[59] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = m.load(v[59], 4);
        v[63] = ((v[61] - v[62])) & 4294967295L;
        v[64] = LibC.call(m, "printf", new long[]{11952L, v[48], v[50], v[63]});
        return 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[65] = LibC.call(m, "printf", new long[]{12000L, v[48], v[50]});
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[66] = ((v[50] + 1L)) & 4294967295L;
        v[67] = m.load(v[23], 4);
        v[68] = v[66] > v[67] ? 1L : 0L;
        return v[68] != 0 ? 14 : 10;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[69] = ((v[48] + 1L)) & 4294967295L;
        v[70] = m.load(v[12], 4);
        v[71] = v[69] > v[70] ? 1L : 0L;
        return v[71] != 0 ? 21 : 9;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi72 = (previous == 20 ? v[102] : v[46]);
        long phi73 = (previous == 20 ? v[104] : 0L);
        v[72] = phi72;
        v[73] = phi73;
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi74 = (previous == 15 ? v[72] : v[102]);
        long phi75 = (previous == 15 ? 0L : v[101]);
        v[74] = phi74;
        v[75] = phi75;
        v[76] = m.load(v[45], 4);
        v[77] = ((v[74] + 1L)) & 4294967295L;
        v[78] = ((v[77] * v[73])) & 4294967295L;
        v[79] = ((v[78] + v[75])) & 4294967295L;
        v[80] = ((v[79] << 2L)) & 4294967295L;
        v[81] = (v[76] + (Heap.s(v[80], 32) * 4L)) & 4294967295L;
        v[82] = ((v[75] + v[73])) & 4294967295L;
        v[83] = m.load(v[12], 4);
        v[84] = ((v[83] + v[74])) & 4294967295L;
        v[85] = v[82] == v[84] ? 1L : 0L;
        v[86] = (v[81] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[87] = m.load(v[86], 4);
        v[88] = m.load(v[81], 4);
        v[89] = ((v[87] - v[88])) & 4294967295L;
        v[90] = (v[81] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[91] = m.load(v[90], 4);
        v[92] = ((v[91] - v[87])) & 4294967295L;
        v[93] = (v[81] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[94] = m.load(v[93], 4);
        v[95] = ((v[94] - v[91])) & 4294967295L;
        return v[85] != 0 ? 18 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[96] = (v[81] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = ((v[97] - v[94])) & 4294967295L;
        v[99] = LibC.call(m, "printf", new long[]{12048L, v[73], v[75], v[89], v[92], v[95], v[98]});
        return 19;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[100] = LibC.call(m, "printf", new long[]{12128L, v[73], v[75], v[89], v[92], v[95]});
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[101] = ((v[75] + 1L)) & 4294967295L;
        v[102] = m.load(v[23], 4);
        v[103] = v[101] > v[102] ? 1L : 0L;
        return v[103] != 0 ? 20 : 16;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[104] = ((v[73] + 1L)) & 4294967295L;
        v[105] = m.load(v[12], 4);
        v[106] = v[104] > v[105] ? 1L : 0L;
        return v[106] != 0 ? 21 : 15;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi107 = (previous == 0 ? 4294967295L : (previous == 7 ? 0L : (previous == 1 ? 0L : (previous == 14 ? 0L : 0L))));
        v[107] = phi107;
        v[108] = v[107];
        return -1;
    }
}
