package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: predCBPDec.
 */
public final class F0478_predCBPDec {

    private F0478_predCBPDec() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[132];
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
                    default:
                        throw new IllegalStateException("Invalid block in predCBPDec");
                }
                previous = old;
                if (pc < 0) {
                    return v[131];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = ((v[3] + 4294967295L)) & 4294967295L;
        v[5] = v[4] < 2L ? 1L : 0L;
        return v[5] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = v[9] == 0L ? 1L : 0L;
        return v[12] != 0 ? 23 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 1 ? v[7] : v[11]);
        long phi14 = (previous == 1 ? 1L : v[9]);
        v[13] = phi13;
        v[14] = phi14;
        v[15] = (v[1] + (Heap.s(0L, 32) * 592L) + 560L) & 4294967295L;
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34276L) & 4294967295L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34280L) & 4294967295L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi18 = (previous == 3 ? 0L : v[101]);
        v[18] = phi18;
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1092L + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = v[18] != 0L ? 1L : 0L;
        v[22] = (v[21]) & 4294967295L;
        v[23] = (v[1] + (Heap.s(0L, 32) * 592L) + 560L + 16L + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[24] = m.load(v[23], 4);
        switch ((int) v[24]) {
            case 0:
                return 5;
            case 2:
                return 11;
            default:
                return 12;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = m.load(v[16], 4);
        v[26] = v[25] == 0L ? 1L : 0L;
        return v[26] != 0 ? 9 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[27] = m.load(v[17], 4);
        v[28] = v[27] == 0L ? 1L : 0L;
        return v[28] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[29] = ((v[20] ^ 1L)) & 4294967295L;
        return 10;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[31] + (Heap.s(v[13], 32) * 40L) + 4L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((v[33] >>> 10L)) & 4294967295L;
        v[35] = ((v[34] & 1L)) & 4294967295L;
        v[36] = ((v[35] ^ v[20])) & 4294967295L;
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[37] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = (v[38] + (Heap.s(v[13], 32) * 40L)) & 4294967295L;
        v[40] = (v[39] + (Heap.s(4294967295L, 32) * 40L) + 4L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = ((v[41] >>> 5L)) & 4294967295L;
        v[43] = ((v[42] & 1L)) & 4294967295L;
        v[44] = ((v[43] ^ v[20])) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi45 = (previous == 7 ? v[29] : (previous == 8 ? v[36] : v[44]));
        v[45] = phi45;
        v[46] = ((v[45] << 1L)) & 4294967295L;
        v[47] = ((v[46] & 2L)) & 4294967295L;
        v[48] = ((v[47] ^ v[45])) & 4294967295L;
        v[49] = ((v[48] << 3L)) & 4294967295L;
        v[50] = ((v[49] & 16L)) & 4294967295L;
        v[51] = ((v[50] ^ v[48])) & 4294967295L;
        v[52] = ((v[51] << 1L)) & 4294967295L;
        v[53] = ((v[52] & 32L)) & 4294967295L;
        v[54] = ((v[53] ^ v[51])) & 4294967295L;
        v[55] = ((v[54] << 2L)) & 4294967295L;
        v[56] = ((v[55] & 204L)) & 4294967295L;
        v[57] = ((v[56] ^ v[54])) & 4294967295L;
        v[58] = ((v[57] << 6L)) & 4294967295L;
        v[59] = ((v[58] & 13056L)) & 4294967295L;
        v[60] = ((v[59] ^ v[57])) & 4294967295L;
        v[61] = ((v[60] << 2L)) & 4294967295L;
        v[62] = ((v[61] & 52224L)) & 4294967295L;
        v[63] = ((v[62] ^ v[60])) & 4294967295L;
        return 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[64] = ((v[20] ^ 65535L)) & 4294967295L;
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi65 = (previous == 10 ? v[63] : (previous == 11 ? v[64] : v[20]));
        v[65] = phi65;
        v[66] = ((v[65] & 65535L)) & 4294967295L;
        v[67] = v[66] == 0L ? 1L : 0L;
        return v[67] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi68 = (previous == 13 ? v[73] : 0L);
        long phi69 = (previous == 13 ? v[74] : v[66]);
        v[68] = phi68;
        v[69] = phi69;
        v[70] = ((v[69] & 15L)) & 4294967295L;
        v[71] = (13888L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[70], 32) * 4L)) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = ((v[72] + v[68])) & 4294967295L;
        v[74] = ((v[69] >>> 4L)) & 4294967295L;
        v[75] = v[69] < 16L ? 1L : 0L;
        return v[75] != 0 ? 14 : 13;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi76 = (previous == 12 ? 0L : v[73]);
        v[76] = phi76;
        v[77] = ((v[76] + 4294967293L)) & 4294967295L;
        v[78] = (v[15] + (Heap.s(0L, 32) * 8L) + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[79] = m.load(v[78], 4);
        v[80] = ((v[77] + v[79])) & 4294967295L;
        v[81] = LibC.call(m, "llvm.smax.i32", new long[]{v[80], 4294967280L});
        v[82] = LibC.call(m, "llvm.smin.i32", new long[]{v[81], 15L});
        m.store(v[78], v[82], 4);
        v[83] = (v[1] + (Heap.s(0L, 32) * 592L) + 560L + 8L + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = ((v[84] - v[76])) & 4294967295L;
        v[86] = ((v[85] + 13L)) & 4294967295L;
        m.store(v[83], v[86], 4);
        v[87] = ((v[85] + 4294967293L)) & 4294967295L;
        v[88] = v[87] < 4294967264L ? 1L : 0L;
        return v[88] != 0 ? 15 : 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[89] = Heap.s(v[86], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[90] = Heap.s(v[80], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[89] != 0 ? 17 : 18;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[91] = Heap.s(v[80], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[91] != 0 ? 19 : 20;
    }

    private static int b17(Heap m, long[] v, int previous) {
        m.store(v[83], 4294967280L, 4);
        return v[90] != 0 ? 19 : 22;
    }

    private static int b18(Heap m, long[] v, int previous) {
        m.store(v[83], 15L, 4);
        return v[90] != 0 ? 19 : 21;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi92 = (previous == 18 ? 15L : (previous == 16 ? v[86] : 4294967280L));
        v[92] = phi92;
        v[93] = Heap.s(v[82], 32) < Heap.s(v[92], 32) ? 1L : 0L;
        v[94] = v[93] != 0 ? 1L : 2L;
        return 22;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[95] = Heap.s(v[86], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[95] != 0 ? 22 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi96 = (previous == 21 ? 0L : (previous == 19 ? v[94] : (previous == 20 ? 2L : 2L)));
        v[96] = phi96;
        m.store(v[23], v[96], 4);
        v[97] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1028L + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        m.store(v[97], v[65], 4);
        v[98] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        v[99] = m.load(v[98], 4);
        v[100] = (v[99] + (Heap.s(v[13], 32) * 40L) + 4L) & 4294967295L;
        m.store(v[100], v[65], 4);
        v[101] = ((v[18] + 1L)) & 4294967295L;
        v[102] = v[101] == v[14] ? 1L : 0L;
        return v[102] != 0 ? 23 : 4;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi103 = (previous == 2 ? v[11] : v[13]);
        v[103] = phi103;
        switch ((int) v[3]) {
            case 2:
                return 24;
            case 1:
                return 25;
            default:
                return 27;
        }
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[104] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1092L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[105] = m.load(v[104], 4);
        v[106] = (v[1] + (Heap.s(0L, 32) * 592L) + 560L) & 4294967295L;
        v[107] = F0479_predCBPC422Dec.run(m, v[0], v[105], v[103], 1L, v[106]);
        v[108] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1028L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[108], v[107], 4);
        v[109] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[110] = m.load(v[109], 4);
        v[111] = (v[110] + (Heap.s(v[103], 32) * 40L) + 4L) & 4294967295L;
        m.store(v[111], v[107], 4);
        v[112] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1092L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[113] = m.load(v[112], 4);
        v[114] = F0479_predCBPC422Dec.run(m, v[0], v[113], v[103], 2L, v[106]);
        return 26;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[115] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1092L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[116] = m.load(v[115], 4);
        v[117] = (v[1] + (Heap.s(0L, 32) * 592L) + 560L) & 4294967295L;
        v[118] = F0480_predCBPC420Dec.run(m, v[0], v[116], v[103], 1L, v[117]);
        v[119] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1028L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[119], v[118], 4);
        v[120] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[121] = m.load(v[120], 4);
        v[122] = (v[121] + (Heap.s(v[103], 32) * 40L) + 4L) & 4294967295L;
        m.store(v[122], v[118], 4);
        v[123] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1092L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[124] = m.load(v[123], 4);
        v[125] = F0480_predCBPC420Dec.run(m, v[0], v[124], v[103], 2L, v[117]);
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi126 = (previous == 25 ? v[125] : v[114]);
        v[126] = phi126;
        v[127] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1028L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[127], v[126], 4);
        v[128] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[129] = m.load(v[128], 4);
        v[130] = (v[129] + (Heap.s(v[103], 32) * 40L) + 4L) & 4294967295L;
        m.store(v[130], v[126], 4);
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        return -1;
    }
}
