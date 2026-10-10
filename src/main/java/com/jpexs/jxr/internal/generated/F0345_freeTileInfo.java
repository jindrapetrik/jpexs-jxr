package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: freeTileInfo.
 */
public final class F0345_freeTileInfo {

    private F0345_freeTileInfo() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[65];
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
                    default:
                        throw new IllegalStateException("Invalid block in freeTileInfo");
                }
                previous = old;
                if (pc < 0) {
                    return v[64];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = ((v[2] & 1L)) & 4294967295L;
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 5 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi7 = (previous == 1 ? 0L : v[12]);
        v[7] = phi7;
        v[8] = m.load(v[6], 4);
        v[9] = (v[8] + (Heap.s(v[7], 32) * 240L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = v[10] == 0L ? 1L : 0L;
        return v[11] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[10]});
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[12] = ((v[7] + 1L)) & 4294967295L;
        v[13] = m.load(v[5], 4);
        v[14] = v[12] > v[13] ? 1L : 0L;
        return v[14] != 0 ? 7 : 2;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = m.load(v[16], 4);
        v[18] = v[17] == 0L ? 1L : 0L;
        return v[18] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[17]});
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = v[20] == 3L ? 1L : 0L;
        return v[21] != 0 ? 15 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[22] = m.load(v[1], 4);
        v[23] = ((v[22] & 2L)) & 4294967295L;
        v[24] = v[23] == 0L ? 1L : 0L;
        return v[24] != 0 ? 13 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi27 = (previous == 9 ? 0L : v[32]);
        v[27] = phi27;
        v[28] = m.load(v[26], 4);
        v[29] = (v[28] + (Heap.s(v[27], 32) * 240L) + 64L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = v[30] == 0L ? 1L : 0L;
        return v[31] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[30]});
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[32] = ((v[27] + 1L)) & 4294967295L;
        v[33] = m.load(v[25], 4);
        v[34] = v[32] > v[33] ? 1L : 0L;
        return v[34] != 0 ? 15 : 10;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[35] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[36] + (Heap.s(0L, 32) * 240L) + 64L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = v[38] == 0L ? 1L : 0L;
        return v[39] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[38]});
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[40] = m.load(v[19], 4);
        v[41] = ((v[40] & 4294967294L)) & 4294967295L;
        v[42] = v[41] == 2L ? 1L : 0L;
        return v[42] != 0 ? 23 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[43] = m.load(v[1], 4);
        v[44] = ((v[43] & 4L)) & 4294967295L;
        v[45] = v[44] == 0L ? 1L : 0L;
        return v[45] != 0 ? 21 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[46] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[47] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi48 = (previous == 17 ? 0L : v[53]);
        v[48] = phi48;
        v[49] = m.load(v[47], 4);
        v[50] = (v[49] + (Heap.s(v[48], 32) * 240L) + 128L) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = v[51] == 0L ? 1L : 0L;
        return v[52] != 0 ? 20 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[51]});
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[53] = ((v[48] + 1L)) & 4294967295L;
        v[54] = m.load(v[46], 4);
        v[55] = v[53] > v[54] ? 1L : 0L;
        return v[55] != 0 ? 23 : 18;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[56] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[57] = m.load(v[56], 4);
        v[58] = (v[57] + (Heap.s(0L, 32) * 240L) + 128L) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = v[59] == 0L ? 1L : 0L;
        return v[60] != 0 ? 23 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[59]});
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[61] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = v[62] == 0L ? 1L : 0L;
        return v[63] != 0 ? 25 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[62]});
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        return -1;
    }
}
