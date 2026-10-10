package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_Release_WMP.
 */
public final class F0137_PKImageDecode_Release_WMP {

    private F0137_PKImageDecode_Release_WMP() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[90];
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
                    case 29:
                        pc = b29(m, v, previous);
                        break;
                    case 30:
                        pc = b30(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_Release_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[89];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = v[0] == 0L ? 1L : 0L;
        return v[1] != 0 ? 30 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[2] = m.load(v[0], 4);
        v[3] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = ((v[4] & 4294967294L)) & 4294967295L;
        v[6] = v[5] == 30L ? 1L : 0L;
        return v[6] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[7] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 0L + 4L) & 4294967295L;
        v[8] = F0032_PKFree.run(m, v[7]);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[9] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 8L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((v[10] & 4294967294L)) & 4294967295L;
        v[12] = v[11] == 30L ? 1L : 0L;
        return v[12] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[13] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 8L + 4L) & 4294967295L;
        v[14] = F0032_PKFree.run(m, v[13]);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[15] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 16L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[16] & 4294967294L)) & 4294967295L;
        v[18] = v[17] == 30L ? 1L : 0L;
        return v[18] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[19] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 16L + 4L) & 4294967295L;
        v[20] = F0032_PKFree.run(m, v[19]);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[21] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 24L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = ((v[22] & 4294967294L)) & 4294967295L;
        v[24] = v[23] == 30L ? 1L : 0L;
        return v[24] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[25] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 24L + 4L) & 4294967295L;
        v[26] = F0032_PKFree.run(m, v[25]);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[27] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 32L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[28] & 4294967294L)) & 4294967295L;
        v[30] = v[29] == 30L ? 1L : 0L;
        return v[30] != 0 ? 10 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[31] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 32L + 4L) & 4294967295L;
        v[32] = F0032_PKFree.run(m, v[31]);
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[33] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 40L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = ((v[34] & 4294967294L)) & 4294967295L;
        v[36] = v[35] == 30L ? 1L : 0L;
        return v[36] != 0 ? 12 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[37] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 40L + 4L) & 4294967295L;
        v[38] = F0032_PKFree.run(m, v[37]);
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[39] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 48L) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = ((v[40] & 4294967294L)) & 4294967295L;
        v[42] = v[41] == 30L ? 1L : 0L;
        return v[42] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[43] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 48L + 4L) & 4294967295L;
        v[44] = F0032_PKFree.run(m, v[43]);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[45] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 56L) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = ((v[46] & 4294967294L)) & 4294967295L;
        v[48] = v[47] == 30L ? 1L : 0L;
        return v[48] != 0 ? 16 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[49] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 56L + 4L) & 4294967295L;
        v[50] = F0032_PKFree.run(m, v[49]);
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[51] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 64L) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = ((v[52] & 4294967294L)) & 4294967295L;
        v[54] = v[53] == 30L ? 1L : 0L;
        return v[54] != 0 ? 18 : 19;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[55] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 64L + 4L) & 4294967295L;
        v[56] = F0032_PKFree.run(m, v[55]);
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[57] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 72L) & 4294967295L;
        v[58] = m.load(v[57], 4);
        v[59] = ((v[58] & 4294967294L)) & 4294967295L;
        v[60] = v[59] == 30L ? 1L : 0L;
        return v[60] != 0 ? 20 : 21;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[61] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 72L + 4L) & 4294967295L;
        v[62] = F0032_PKFree.run(m, v[61]);
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[63] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 80L) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = ((v[64] & 4294967294L)) & 4294967295L;
        v[66] = v[65] == 30L ? 1L : 0L;
        return v[66] != 0 ? 22 : 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[67] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 80L + 4L) & 4294967295L;
        v[68] = F0032_PKFree.run(m, v[67]);
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[69] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 88L) & 4294967295L;
        v[70] = m.load(v[69], 4);
        v[71] = ((v[70] & 4294967294L)) & 4294967295L;
        v[72] = v[71] == 30L ? 1L : 0L;
        return v[72] != 0 ? 24 : 25;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[73] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 88L + 4L) & 4294967295L;
        v[74] = F0032_PKFree.run(m, v[73]);
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[75] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 96L) & 4294967295L;
        v[76] = m.load(v[75], 4);
        v[77] = ((v[76] & 4294967294L)) & 4294967295L;
        v[78] = v[77] == 30L ? 1L : 0L;
        return v[78] != 0 ? 26 : 27;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[79] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 96L + 4L) & 4294967295L;
        v[80] = F0032_PKFree.run(m, v[79]);
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[81] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 104L) & 4294967295L;
        v[82] = m.load(v[81], 4);
        v[83] = ((v[82] & 4294967294L)) & 4294967295L;
        v[84] = v[83] == 30L ? 1L : 0L;
        return v[84] != 0 ? 28 : 29;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[85] = (v[2] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 104L + 4L) & 4294967295L;
        v[86] = F0032_PKFree.run(m, v[85]);
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[87] = F0079_PKImageDecode_Release.run(m, v[0]);
        return 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi88 = (previous == 0 ? 0L : v[87]);
        v[88] = phi88;
        v[89] = v[88];
        return -1;
    }
}
