package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetIIDInfo.
 */
public final class F0041_GetIIDInfo {

    private F0041_GetIIDInfo() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[110];
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
                    default:
                        throw new IllegalStateException("Invalid block in GetIIDInfo");
                }
                previous = old;
                if (pc < 0) {
                    return v[109];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        m.store(v[1], 0L, 4);
        v[2] = m.load(7904L, 4);
        v[3] = LibC.call(m, "strlen", new long[]{v[2]});
        v[4] = m.load(v[0], 1);
        v[5] = (Heap.s(v[4], 8)) & 4294967295L;
        v[6] = LibC.call(m, "tolower", new long[]{v[5]});
        v[7] = m.load(v[2], 1);
        v[8] = (Heap.s(v[7], 8)) & 4294967295L;
        v[9] = LibC.call(m, "tolower", new long[]{v[8]});
        v[10] = v[6] == v[9] ? 1L : 0L;
        return v[10] != 0 ? 13 : 16;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = m.load(7916L, 4);
        v[12] = LibC.call(m, "strlen", new long[]{v[11]});
        v[13] = m.load(v[0], 1);
        v[14] = (Heap.s(v[13], 8)) & 4294967295L;
        v[15] = LibC.call(m, "tolower", new long[]{v[14]});
        v[16] = m.load(v[11], 1);
        v[17] = (Heap.s(v[16], 8)) & 4294967295L;
        v[18] = LibC.call(m, "tolower", new long[]{v[17]});
        v[19] = v[15] == v[18] ? 1L : 0L;
        return v[19] != 0 ? 2 : 5;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi20 = (previous == 4 ? v[31] : v[12]);
        long phi21 = (previous == 4 ? v[30] : v[11]);
        long phi22 = (previous == 4 ? v[29] : v[0]);
        v[20] = phi20;
        v[21] = phi21;
        v[22] = phi22;
        v[23] = m.load(v[22], 1);
        v[24] = v[23] == 0L ? 1L : 0L;
        return v[24] != 0 ? 5 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[25] = m.load(v[21], 1);
        v[26] = v[25] != 0L ? 1L : 0L;
        v[27] = v[20] != 0L ? 1L : 0L;
        v[28] = v[26] != 0 ? v[27] : 0L;
        return v[28] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[29] = (v[22] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[30] = (v[21] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[31] = ((v[20] + 4294967295L)) & 4294967295L;
        v[32] = m.load(v[29], 1);
        v[33] = (Heap.s(v[32], 8)) & 4294967295L;
        v[34] = LibC.call(m, "tolower", new long[]{v[33]});
        v[35] = m.load(v[30], 1);
        v[36] = (Heap.s(v[35], 8)) & 4294967295L;
        v[37] = LibC.call(m, "tolower", new long[]{v[36]});
        v[38] = v[34] == v[37] ? 1L : 0L;
        return v[38] != 0 ? 2 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi39 = (previous == 1 ? v[0] : (previous == 4 ? v[29] : (previous == 2 ? v[22] : v[22])));
        long phi40 = (previous == 1 ? v[11] : (previous == 4 ? v[30] : (previous == 2 ? v[21] : v[21])));
        long phi41 = (previous == 1 ? v[12] : (previous == 4 ? v[31] : (previous == 2 ? v[20] : v[20])));
        v[39] = phi39;
        v[40] = phi40;
        v[41] = phi41;
        v[42] = v[41] == 0L ? 1L : 0L;
        return v[42] != 0 ? 18 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[43] = m.load(v[39], 1);
        v[44] = m.load(v[40], 1);
        v[45] = v[43] == v[44] ? 1L : 0L;
        return v[45] != 0 ? 18 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[46] = m.load(7928L, 4);
        v[47] = LibC.call(m, "strlen", new long[]{v[46]});
        v[48] = m.load(v[0], 1);
        v[49] = (Heap.s(v[48], 8)) & 4294967295L;
        v[50] = LibC.call(m, "tolower", new long[]{v[49]});
        v[51] = m.load(v[46], 1);
        v[52] = (Heap.s(v[51], 8)) & 4294967295L;
        v[53] = LibC.call(m, "tolower", new long[]{v[52]});
        v[54] = v[50] == v[53] ? 1L : 0L;
        return v[54] != 0 ? 8 : 11;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi55 = (previous == 10 ? v[66] : v[47]);
        long phi56 = (previous == 10 ? v[65] : v[46]);
        long phi57 = (previous == 10 ? v[64] : v[0]);
        v[55] = phi55;
        v[56] = phi56;
        v[57] = phi57;
        v[58] = m.load(v[57], 1);
        v[59] = v[58] == 0L ? 1L : 0L;
        return v[59] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[60] = m.load(v[56], 1);
        v[61] = v[60] != 0L ? 1L : 0L;
        v[62] = v[55] != 0L ? 1L : 0L;
        v[63] = v[61] != 0 ? v[62] : 0L;
        return v[63] != 0 ? 10 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[64] = (v[57] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[65] = (v[56] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[66] = ((v[55] + 4294967295L)) & 4294967295L;
        v[67] = m.load(v[64], 1);
        v[68] = (Heap.s(v[67], 8)) & 4294967295L;
        v[69] = LibC.call(m, "tolower", new long[]{v[68]});
        v[70] = m.load(v[65], 1);
        v[71] = (Heap.s(v[70], 8)) & 4294967295L;
        v[72] = LibC.call(m, "tolower", new long[]{v[71]});
        v[73] = v[69] == v[72] ? 1L : 0L;
        return v[73] != 0 ? 8 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi74 = (previous == 7 ? v[0] : (previous == 10 ? v[64] : (previous == 8 ? v[57] : v[57])));
        long phi75 = (previous == 7 ? v[46] : (previous == 10 ? v[65] : (previous == 8 ? v[56] : v[56])));
        long phi76 = (previous == 7 ? v[47] : (previous == 10 ? v[66] : (previous == 8 ? v[55] : v[55])));
        v[74] = phi74;
        v[75] = phi75;
        v[76] = phi76;
        v[77] = v[76] == 0L ? 1L : 0L;
        return v[77] != 0 ? 18 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[78] = m.load(v[74], 1);
        v[79] = m.load(v[75], 1);
        v[80] = v[78] == v[79] ? 1L : 0L;
        return v[80] != 0 ? 18 : 19;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi81 = (previous == 15 ? v[92] : v[3]);
        long phi82 = (previous == 15 ? v[91] : v[2]);
        long phi83 = (previous == 15 ? v[90] : v[0]);
        v[81] = phi81;
        v[82] = phi82;
        v[83] = phi83;
        v[84] = m.load(v[83], 1);
        v[85] = v[84] == 0L ? 1L : 0L;
        return v[85] != 0 ? 16 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[86] = m.load(v[82], 1);
        v[87] = v[86] != 0L ? 1L : 0L;
        v[88] = v[81] != 0L ? 1L : 0L;
        v[89] = v[87] != 0 ? v[88] : 0L;
        return v[89] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[90] = (v[83] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[91] = (v[82] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[92] = ((v[81] + 4294967295L)) & 4294967295L;
        v[93] = m.load(v[90], 1);
        v[94] = (Heap.s(v[93], 8)) & 4294967295L;
        v[95] = LibC.call(m, "tolower", new long[]{v[94]});
        v[96] = m.load(v[91], 1);
        v[97] = (Heap.s(v[96], 8)) & 4294967295L;
        v[98] = LibC.call(m, "tolower", new long[]{v[97]});
        v[99] = v[95] == v[98] ? 1L : 0L;
        return v[99] != 0 ? 13 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi100 = (previous == 0 ? v[0] : (previous == 15 ? v[90] : (previous == 13 ? v[83] : v[83])));
        long phi101 = (previous == 0 ? v[2] : (previous == 15 ? v[91] : (previous == 13 ? v[82] : v[82])));
        long phi102 = (previous == 0 ? v[3] : (previous == 15 ? v[92] : (previous == 13 ? v[81] : v[81])));
        v[100] = phi100;
        v[101] = phi101;
        v[102] = phi102;
        v[103] = v[102] == 0L ? 1L : 0L;
        return v[103] != 0 ? 18 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[104] = m.load(v[100], 1);
        v[105] = m.load(v[101], 1);
        v[106] = v[104] == v[105] ? 1L : 0L;
        return v[106] != 0 ? 18 : 1;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi107 = (previous == 16 ? 7904L : (previous == 17 ? 7904L : (previous == 5 ? 7916L : (previous == 6 ? 7916L : (previous == 11 ? 7928L : 7928L)))));
        v[107] = phi107;
        m.store(v[1], v[107], 4);
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi108 = (previous == 18 ? 0L : 4294967190L);
        v[108] = phi108;
        v[109] = v[108];
        return -1;
    }
}
