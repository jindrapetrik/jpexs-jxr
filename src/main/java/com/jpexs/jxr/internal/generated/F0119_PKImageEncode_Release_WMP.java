package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_Release_WMP.
 */
public final class F0119_PKImageEncode_Release_WMP {

    private F0119_PKImageEncode_Release_WMP() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[111];
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
                    case 26:
                        pc = b26(m, v, previous);
                        break;
                    case 27:
                        pc = b27(m, v, previous);
                        break;
                    case 28:
                        pc = b28(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_Release_WMP");
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
        v[1] = m.load(v[0], 4);
        v[2] = (v[1] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[3] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Dispatch.call(m, v[5], new long[]{v[2]});
        v[7] = (v[1] + (Heap.s(0L, 32) * 66276L) + 120L) & 4294967295L;
        v[8] = F0032_PKFree.run(m, v[7]);
        v[9] = (v[1] + (Heap.s(0L, 32) * 66276L) + 124L) & 4294967295L;
        m.store(v[9], 0L, 4);
        v[10] = (v[1] + (Heap.s(0L, 32) * 66276L) + 152L) & 4294967295L;
        v[11] = F0032_PKFree.run(m, v[10]);
        v[12] = (v[1] + (Heap.s(0L, 32) * 66276L) + 156L) & 4294967295L;
        m.store(v[12], 0L, 4);
        v[13] = (v[1] + (Heap.s(0L, 32) * 66276L) + 128L) & 4294967295L;
        v[14] = F0032_PKFree.run(m, v[13]);
        v[15] = (v[1] + (Heap.s(0L, 32) * 66276L) + 132L) & 4294967295L;
        m.store(v[15], 0L, 4);
        v[16] = (v[1] + (Heap.s(0L, 32) * 66276L) + 136L) & 4294967295L;
        v[17] = F0032_PKFree.run(m, v[16]);
        v[18] = (v[1] + (Heap.s(0L, 32) * 66276L) + 140L) & 4294967295L;
        m.store(v[18], 0L, 4);
        v[19] = (v[1] + (Heap.s(0L, 32) * 66276L) + 144L) & 4294967295L;
        v[20] = F0032_PKFree.run(m, v[19]);
        v[21] = (v[1] + (Heap.s(0L, 32) * 66276L) + 148L) & 4294967295L;
        m.store(v[21], 0L, 4);
        v[22] = (v[1] + (Heap.s(0L, 32) * 66276L) + 160L) & 4294967295L;
        v[23] = F0032_PKFree.run(m, v[22]);
        v[24] = (v[1] + (Heap.s(0L, 32) * 66276L) + 164L) & 4294967295L;
        m.store(v[24], 0L, 4);
        v[25] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = ((v[26] & 4294967294L)) & 4294967295L;
        v[28] = v[27] == 30L ? 1L : 0L;
        return v[28] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[29] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 0L + 4L) & 4294967295L;
        v[30] = F0032_PKFree.run(m, v[29]);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[31] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 8L) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = ((v[32] & 4294967294L)) & 4294967295L;
        v[34] = v[33] == 30L ? 1L : 0L;
        return v[34] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[35] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 8L + 4L) & 4294967295L;
        v[36] = F0032_PKFree.run(m, v[35]);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[37] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 16L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = ((v[38] & 4294967294L)) & 4294967295L;
        v[40] = v[39] == 30L ? 1L : 0L;
        return v[40] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[41] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 16L + 4L) & 4294967295L;
        v[42] = F0032_PKFree.run(m, v[41]);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[43] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 24L) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = ((v[44] & 4294967294L)) & 4294967295L;
        v[46] = v[45] == 30L ? 1L : 0L;
        return v[46] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[47] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 24L + 4L) & 4294967295L;
        v[48] = F0032_PKFree.run(m, v[47]);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[49] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 32L) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = ((v[50] & 4294967294L)) & 4294967295L;
        v[52] = v[51] == 30L ? 1L : 0L;
        return v[52] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[53] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 32L + 4L) & 4294967295L;
        v[54] = F0032_PKFree.run(m, v[53]);
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[55] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 40L) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = ((v[56] & 4294967294L)) & 4294967295L;
        v[58] = v[57] == 30L ? 1L : 0L;
        return v[58] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[59] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 40L + 4L) & 4294967295L;
        v[60] = F0032_PKFree.run(m, v[59]);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[61] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 48L) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = ((v[62] & 4294967294L)) & 4294967295L;
        v[64] = v[63] == 30L ? 1L : 0L;
        return v[64] != 0 ? 13 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[65] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 48L + 4L) & 4294967295L;
        v[66] = F0032_PKFree.run(m, v[65]);
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[67] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 56L) & 4294967295L;
        v[68] = m.load(v[67], 4);
        v[69] = ((v[68] & 4294967294L)) & 4294967295L;
        v[70] = v[69] == 30L ? 1L : 0L;
        return v[70] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[71] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 56L + 4L) & 4294967295L;
        v[72] = F0032_PKFree.run(m, v[71]);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[73] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 64L) & 4294967295L;
        v[74] = m.load(v[73], 4);
        v[75] = ((v[74] & 4294967294L)) & 4294967295L;
        v[76] = v[75] == 30L ? 1L : 0L;
        return v[76] != 0 ? 17 : 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[77] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 64L + 4L) & 4294967295L;
        v[78] = F0032_PKFree.run(m, v[77]);
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[79] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 72L) & 4294967295L;
        v[80] = m.load(v[79], 4);
        v[81] = ((v[80] & 4294967294L)) & 4294967295L;
        v[82] = v[81] == 30L ? 1L : 0L;
        return v[82] != 0 ? 19 : 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[83] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 72L + 4L) & 4294967295L;
        v[84] = F0032_PKFree.run(m, v[83]);
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[85] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 80L) & 4294967295L;
        v[86] = m.load(v[85], 4);
        v[87] = ((v[86] & 4294967294L)) & 4294967295L;
        v[88] = v[87] == 30L ? 1L : 0L;
        return v[88] != 0 ? 21 : 22;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[89] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 80L + 4L) & 4294967295L;
        v[90] = F0032_PKFree.run(m, v[89]);
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[91] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 88L) & 4294967295L;
        v[92] = m.load(v[91], 4);
        v[93] = ((v[92] & 4294967294L)) & 4294967295L;
        v[94] = v[93] == 30L ? 1L : 0L;
        return v[94] != 0 ? 23 : 24;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[95] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 88L + 4L) & 4294967295L;
        v[96] = F0032_PKFree.run(m, v[95]);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[97] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 96L) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = ((v[98] & 4294967294L)) & 4294967295L;
        v[100] = v[99] == 30L ? 1L : 0L;
        return v[100] != 0 ? 25 : 26;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[101] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 96L + 4L) & 4294967295L;
        v[102] = F0032_PKFree.run(m, v[101]);
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[103] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 104L) & 4294967295L;
        v[104] = m.load(v[103], 4);
        v[105] = ((v[104] & 4294967294L)) & 4294967295L;
        v[106] = v[105] == 30L ? 1L : 0L;
        return v[106] != 0 ? 27 : 28;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[107] = (v[1] + (Heap.s(0L, 32) * 66276L) + 168L + 104L + 4L) & 4294967295L;
        v[108] = F0032_PKFree.run(m, v[107]);
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[109] = F0032_PKFree.run(m, v[0]);
        v[110] = v[109];
        return -1;
    }
}
