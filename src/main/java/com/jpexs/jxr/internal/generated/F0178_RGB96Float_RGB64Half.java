package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB96Float_RGB64Half.
 */
public final class F0178_RGB96Float_RGB64Half {

    private F0178_RGB96Float_RGB64Half() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[97];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB96Float_RGB64Half");
                }
                previous = old;
                if (pc < 0) {
                    return v[96];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 1 : 26;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[94]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 25;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 24 ? v[92] : 0L);
        v[13] = phi13;
        v[14] = ((v[13] * 3L)) & 4294967295L;
        v[15] = (v[12] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = (v[16]) & 4294967295L;
        v[18] = Heap.fcmp("uno", Heap.f(v[16]), Heap.f(0L));
        return v[18] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[19] = (v[17]) & 65535L;
        v[20] = ((v[19] | 32767L)) & 65535L;
        return 10;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[21] = Heap.fcmp("olt", Heap.f(v[16]), Heap.f(3347046400L));
        return v[21] != 0 ? 10 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[22] = Heap.fcmp("ogt", Heap.f(v[16]), Heap.f(1199562752L));
        return v[22] != 0 ? 10 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[23] = Heap.fcmp("ogt", Heap.f(v[16]), Heap.f(3095396352L));
        v[24] = Heap.fcmp("olt", Heap.f(v[16]), Heap.f(947912704L));
        v[25] = ((v[23] & v[24])) & 1L;
        v[26] = ((v[17] >>> 16L)) & 4294967295L;
        return v[25] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[27] = (v[26]) & 65535L;
        v[28] = ((v[27] & 32768L)) & 65535L;
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[29] = ((v[26] & 32768L)) & 4294967295L;
        v[30] = ((v[17] >>> 13L)) & 4294967295L;
        v[31] = ((v[30] & 64512L)) & 4294967295L;
        v[32] = ((v[31] + 16384L)) & 4294967295L;
        v[33] = ((v[30] & 1023L)) & 4294967295L;
        v[34] = ((v[33] | v[29])) & 4294967295L;
        v[35] = ((v[34] | v[32])) & 4294967295L;
        v[36] = (v[35]) & 65535L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi37 = (previous == 4 ? v[20] : (previous == 8 ? v[28] : (previous == 9 ? v[36] : (previous == 5 ? 64511L : 31743L))));
        v[37] = phi37;
        v[38] = ((v[13] << 2L)) & 4294967295L;
        v[39] = (v[12] + (Heap.s(v[38], 32) * 2L)) & 4294967295L;
        m.store(v[39], v[37], 2);
        v[40] = (v[15] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = (v[41]) & 4294967295L;
        v[43] = Heap.fcmp("uno", Heap.f(v[41]), Heap.f(0L));
        return v[43] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[44] = (v[42]) & 65535L;
        v[45] = ((v[44] | 32767L)) & 65535L;
        return 17;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[46] = Heap.fcmp("olt", Heap.f(v[41]), Heap.f(3347046400L));
        return v[46] != 0 ? 17 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[47] = Heap.fcmp("ogt", Heap.f(v[41]), Heap.f(1199562752L));
        return v[47] != 0 ? 17 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[48] = Heap.fcmp("ogt", Heap.f(v[41]), Heap.f(3095396352L));
        v[49] = Heap.fcmp("olt", Heap.f(v[41]), Heap.f(947912704L));
        v[50] = ((v[48] & v[49])) & 1L;
        v[51] = ((v[42] >>> 16L)) & 4294967295L;
        return v[50] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[52] = (v[51]) & 65535L;
        v[53] = ((v[52] & 32768L)) & 65535L;
        return 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[54] = ((v[51] & 32768L)) & 4294967295L;
        v[55] = ((v[42] >>> 13L)) & 4294967295L;
        v[56] = ((v[55] & 64512L)) & 4294967295L;
        v[57] = ((v[56] + 16384L)) & 4294967295L;
        v[58] = ((v[55] & 1023L)) & 4294967295L;
        v[59] = ((v[58] | v[54])) & 4294967295L;
        v[60] = ((v[59] | v[57])) & 4294967295L;
        v[61] = (v[60]) & 65535L;
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi62 = (previous == 11 ? v[45] : (previous == 15 ? v[53] : (previous == 16 ? v[61] : (previous == 12 ? 64511L : 31743L))));
        v[62] = phi62;
        v[63] = ((v[38] | 1L)) & 4294967295L;
        v[64] = (v[12] + (Heap.s(v[63], 32) * 2L)) & 4294967295L;
        m.store(v[64], v[62], 2);
        v[65] = (v[15] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = (v[66]) & 4294967295L;
        v[68] = Heap.fcmp("uno", Heap.f(v[66]), Heap.f(0L));
        return v[68] != 0 ? 18 : 19;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[69] = (v[67]) & 65535L;
        v[70] = ((v[69] | 32767L)) & 65535L;
        return 24;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[71] = Heap.fcmp("olt", Heap.f(v[66]), Heap.f(3347046400L));
        return v[71] != 0 ? 24 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[72] = Heap.fcmp("ogt", Heap.f(v[66]), Heap.f(1199562752L));
        return v[72] != 0 ? 24 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[73] = Heap.fcmp("ogt", Heap.f(v[66]), Heap.f(3095396352L));
        v[74] = Heap.fcmp("olt", Heap.f(v[66]), Heap.f(947912704L));
        v[75] = ((v[73] & v[74])) & 1L;
        v[76] = ((v[67] >>> 16L)) & 4294967295L;
        return v[75] != 0 ? 22 : 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[77] = (v[76]) & 65535L;
        v[78] = ((v[77] & 32768L)) & 65535L;
        return 24;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[79] = ((v[76] & 32768L)) & 4294967295L;
        v[80] = ((v[67] >>> 13L)) & 4294967295L;
        v[81] = ((v[80] & 64512L)) & 4294967295L;
        v[82] = ((v[81] + 16384L)) & 4294967295L;
        v[83] = ((v[80] & 1023L)) & 4294967295L;
        v[84] = ((v[83] | v[79])) & 4294967295L;
        v[85] = ((v[84] | v[82])) & 4294967295L;
        v[86] = (v[85]) & 65535L;
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi87 = (previous == 18 ? v[70] : (previous == 22 ? v[78] : (previous == 23 ? v[86] : (previous == 19 ? 64511L : 31743L))));
        v[87] = phi87;
        v[88] = ((v[38] | 2L)) & 4294967295L;
        v[89] = (v[12] + (Heap.s(v[88], 32) * 2L)) & 4294967295L;
        m.store(v[89], v[87], 2);
        v[90] = ((v[38] | 3L)) & 4294967295L;
        v[91] = (v[12] + (Heap.s(v[90], 32) * 2L)) & 4294967295L;
        m.store(v[91], 0L, 2);
        v[92] = ((v[13] + 1L)) & 4294967295L;
        v[93] = v[92] == v[7] ? 1L : 0L;
        return v[93] != 0 ? 25 : 3;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[94] = ((v[10] + 1L)) & 4294967295L;
        v[95] = v[94] == v[5] ? 1L : 0L;
        return v[95] != 0 ? 26 : 2;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[96] = 0L;
        return -1;
    }
}
