package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: WMPhotoValidate.
 */
public final class F0400_WMPhotoValidate {

    private F0400_WMPhotoValidate() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[119];
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
                    default:
                        throw new IllegalStateException("Invalid block in WMPhotoValidate");
                }
                previous = old;
                if (pc < 0) {
                    return v[118];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.stack(4L * 1L, 4);
        v[3] = m.stack(112L * 1L, 4);
        v[4] = m.stack(72L * 1L, 4);
        v[5] = m.load(v[1], 4);
        v[6] = (v[1] + (Heap.s(36L, 32) * 1L)) & 4294967295L;
        v[7] = m.load(v[6], 1);
        v[8] = (v[1] + (Heap.s(48L, 32) * 1L)) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[1] + (Heap.s(52L, 32) * 1L)) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[9] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = Dispatch.call(m, v[13], new long[]{v[9], v[2]});
        v[15] = Heap.s(v[14], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[15] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[16] = F0398_ReadWMIHeader.run(m, v[4], v[1], v[3]);
        v[17] = Heap.s(v[16], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[17] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[18] = m.load(v[8], 4);
        v[19] = (v[18] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = m.load(v[2], 4);
        v[22] = Dispatch.call(m, v[20], new long[]{v[18], v[21]});
        v[23] = Heap.s(v[22], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[23] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return 35;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[24] = (v[4] + (Heap.s(0L, 32) * 72L) + 12L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = (v[0] + (Heap.s(0L, 32) * 72L) + 12L) & 4294967295L;
        m.store(v[26], v[25], 4);
        v[27] = m.load(v[4], 4);
        m.store(v[0], v[27], 4);
        v[28] = (v[4] + (Heap.s(0L, 32) * 72L) + 4L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = (v[29]) & 4294967295L;
        v[31] = (v[0] + (Heap.s(0L, 32) * 72L) + 4L) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = v[27] == 0L ? 1L : 0L;
        v[33] = v[30] == 0L ? 1L : 0L;
        v[34] = ((v[32] | v[33])) & 1L;
        return v[34] != 0 ? 35 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        m.store(v[1], v[5], 4);
        m.store(v[10], v[11], 4);
        m.store(v[8], v[9], 4);
        v[35] = m.load(v[6], 1);
        v[36] = v[35] > 1L ? 1L : 0L;
        return v[36] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        m.store(v[6], v[7], 1);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[37] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        switch ((int) v[38]) {
            case 6:
                return 8;
            case 4:
                return 9;
            case 2:
                return 11;
            case 3:
                return 13;
            default:
                return 15;
        }
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[39] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        m.store(v[39], 6L, 4);
        return 15;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[40] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        switch ((int) v[41]) {
            case 0:
                return 15;
            case 7:
                return 15;
            default:
                return 10;
        }
    }

    private static int b10(Heap m, long[] v, int previous) {
        m.store(v[40], 4L, 4);
        return 15;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[42] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = v[43] == 1L ? 1L : 0L;
        return v[44] != 0 ? 12 : 15;
    }

    private static int b12(Heap m, long[] v, int previous) {
        m.store(v[42], 2L, 4);
        return 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[45] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = ((v[46] + 4294967295L)) & 4294967295L;
        v[48] = v[47] < 2L ? 1L : 0L;
        return v[48] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        m.store(v[45], 3L, 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[49] = (v[4] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[50] = m.load(v[49], 4);
        switch ((int) v[50]) {
            case 7:
                return 16;
            case 8:
                return 18;
            default:
                return 19;
        }
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[51] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[52] = m.load(v[51], 4);
        switch ((int) v[52]) {
            case 0:
                return 19;
            case 6:
                return 19;
            default:
                return 17;
        }
    }

    private static int b17(Heap m, long[] v, int previous) {
        m.store(v[51], 7L, 4);
        return 19;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[53] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        m.store(v[53], 8L, 4);
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[54] = (v[0] + (Heap.s(0L, 32) * 72L) + 52L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = ((v[55] + 4294967295L)) & 4294967295L;
        v[57] = v[56] < v[27] ? 1L : 0L;
        v[58] = v[57] != 0 ? v[55] : v[27];
        v[59] = (v[0] + (Heap.s(0L, 32) * 72L) + 56L) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = ((v[60] + 4294967295L)) & 4294967295L;
        v[62] = v[61] < v[30] ? 1L : 0L;
        v[63] = v[62] != 0 ? v[60] : v[30];
        v[64] = ((v[27] + 4294967295L)) & 4294967295L;
        v[65] = ((v[64] + v[58])) & 4294967295L;
        v[66] = ((v[65] / v[58])) & 4294967295L;
        v[67] = ((v[30] + 4294967295L)) & 4294967295L;
        v[68] = ((v[67] + v[63])) & 4294967295L;
        v[69] = ((v[68] / v[63])) & 4294967295L;
        v[70] = v[66] == v[69] ? 1L : 0L;
        return v[70] != 0 ? 22 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi71 = (previous == 21 ? v[78] : 1L);
        v[71] = phi71;
        v[72] = ((v[64] + v[71])) & 4294967295L;
        v[73] = ((v[72] / v[71])) & 4294967295L;
        v[74] = v[73] > v[58] ? 1L : 0L;
        return v[74] != 0 ? 21 : 23;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[75] = ((v[67] + v[71])) & 4294967295L;
        v[76] = ((v[75] / v[71])) & 4294967295L;
        v[77] = v[76] <= v[63] ? 1L : 0L;
        v[78] = ((v[71] << 1L)) & 4294967295L;
        v[79] = v[78] == 0L ? 1L : 0L;
        v[80] = ((v[79] | v[77])) & 1L;
        return v[80] != 0 ? 23 : 20;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[81] = v[58] > v[65] ? 1L : 0L;
        v[82] = v[81] != 0 ? 1L : v[66];
        v[83] = ((v[64] + v[82])) & 4294967295L;
        v[84] = ((v[83] / v[82])) & 4294967295L;
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi85 = (previous == 22 ? v[84] : (previous == 21 ? v[73] : v[73]));
        long phi86 = (previous == 22 ? v[82] : (previous == 21 ? v[71] : v[71]));
        v[85] = phi85;
        v[86] = phi86;
        m.store(v[54], v[85], 4);
        v[87] = ((v[67] + v[86])) & 4294967295L;
        v[88] = ((v[87] / v[86])) & 4294967295L;
        m.store(v[59], v[88], 4);
        v[89] = (v[0] + (Heap.s(0L, 32) * 72L) + 44L) & 4294967295L;
        v[90] = m.load(v[89], 4);
        v[91] = v[90] == 0L ? 1L : 0L;
        return v[91] != 0 ? 26 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[92] = (v[0] + (Heap.s(0L, 32) * 72L) + 36L) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = v[93] == 0L ? 1L : 0L;
        return v[94] != 0 ? 26 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[95] = (v[0] + (Heap.s(0L, 32) * 72L) + 32L) & 4294967295L;
        v[96] = m.load(v[95], 4);
        return 27;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[97] = (v[0] + (Heap.s(0L, 32) * 72L) + 40L) & 4294967295L;
        m.store(v[97], 0L, 4);
        v[98] = (v[0] + (Heap.s(0L, 32) * 72L) + 32L) & 4294967295L;
        m.store(v[98], 0L, 4);
        v[99] = (v[0] + (Heap.s(0L, 32) * 72L) + 36L) & 4294967295L;
        m.store(v[99], v[85], 4);
        m.store(v[89], v[88], 4);
        return 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi100 = (previous == 25 ? v[90] : v[88]);
        long phi101 = (previous == 25 ? v[93] : v[85]);
        long phi102 = (previous == 25 ? v[96] : 0L);
        v[100] = phi100;
        v[101] = phi101;
        v[102] = phi102;
        v[103] = v[102] < v[85] ? 1L : 0L;
        return v[103] != 0 ? 29 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[104] = (v[0] + (Heap.s(0L, 32) * 72L) + 32L) & 4294967295L;
        m.store(v[104], 0L, 4);
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi105 = (previous == 28 ? 0L : v[102]);
        v[105] = phi105;
        v[106] = (v[0] + (Heap.s(0L, 32) * 72L) + 40L) & 4294967295L;
        v[107] = m.load(v[106], 4);
        v[108] = v[107] < v[88] ? 1L : 0L;
        return v[108] != 0 ? 31 : 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        m.store(v[106], 0L, 4);
        return 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        long phi109 = (previous == 30 ? 0L : v[107]);
        v[109] = phi109;
        v[110] = ((v[101] + v[105])) & 4294967295L;
        v[111] = v[110] > v[85] ? 1L : 0L;
        return v[111] != 0 ? 32 : 33;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[112] = (v[0] + (Heap.s(0L, 32) * 72L) + 36L) & 4294967295L;
        v[113] = ((v[85] - v[105])) & 4294967295L;
        m.store(v[112], v[113], 4);
        return 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[114] = ((v[100] + v[109])) & 4294967295L;
        v[115] = v[114] > v[88] ? 1L : 0L;
        return v[115] != 0 ? 34 : 35;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[116] = ((v[88] - v[109])) & 4294967295L;
        m.store(v[89], v[116], 4);
        return 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        long phi117 = (previous == 3 ? 4294967295L : (previous == 4 ? 4294967295L : (previous == 34 ? 0L : 0L)));
        v[117] = phi117;
        v[118] = v[117];
        return -1;
    }
}
