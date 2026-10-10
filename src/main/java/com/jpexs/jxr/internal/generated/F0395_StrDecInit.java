package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: StrDecInit.
 */
public final class F0395_StrDecInit {

    private F0395_StrDecInit() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[251];
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
                    case 36:
                        pc = b36(m, v, previous);
                        break;
                    case 37:
                        pc = b37(m, v, previous);
                        break;
                    case 38:
                        pc = b38(m, v, previous);
                        break;
                    case 39:
                        pc = b39(m, v, previous);
                        break;
                    case 40:
                        pc = b40(m, v, previous);
                        break;
                    case 41:
                        pc = b41(m, v, previous);
                        break;
                    case 42:
                        pc = b42(m, v, previous);
                        break;
                    case 43:
                        pc = b43(m, v, previous);
                        break;
                    case 44:
                        pc = b44(m, v, previous);
                        break;
                    case 45:
                        pc = b45(m, v, previous);
                        break;
                    case 46:
                        pc = b46(m, v, previous);
                        break;
                    case 47:
                        pc = b47(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in StrDecInit");
                }
                previous = old;
                if (pc < 0) {
                    return v[250];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 6 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = v[2] == 1L ? 1L : 0L;
        v[7] = v[4] != 1L ? 1L : 0L;
        v[8] = ((v[6] & v[7])) & 1L;
        return v[8] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[9] = v[2] == 2L ? 1L : 0L;
        v[10] = v[4] != 2L ? 1L : 0L;
        v[11] = ((v[9] & v[10])) & 1L;
        return v[11] != 0 ? 3 : 6;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32848L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = v[13] == 0L ? 1L : 0L;
        v[15] = (v[14]) & 4294967295L;
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34240L) & 4294967295L;
        m.store(v[16], v[15], 4);
        return v[14] != 0 ? 4 : 7;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[17] = v[4] == 2L ? 1L : 0L;
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = v[17] != 0 ? 7L : 8L;
        v[21] = ((v[19] << v[20])) & 4294967295L;
        v[22] = ((v[21] << 2L)) & 4294967295L;
        v[23] = LibC.call(m, "malloc", new long[]{v[22]});
        v[24] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34780L) & 4294967295L;
        m.store(v[24], v[23], 4);
        v[25] = m.load(v[18], 4);
        v[26] = ((v[25] << v[20])) & 4294967295L;
        v[27] = ((v[26] << 2L)) & 4294967295L;
        v[28] = LibC.call(m, "malloc", new long[]{v[27]});
        v[29] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34784L) & 4294967295L;
        m.store(v[29], v[28], 4);
        v[30] = m.load(v[24], 4);
        v[31] = v[30] == 0L ? 1L : 0L;
        v[32] = v[28] == 0L ? 1L : 0L;
        v[33] = v[31] != 0 ? 1L : v[32];
        return v[33] != 0 ? 47 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[34] = m.load(v[18], 4);
        v[35] = ((v[34] << v[20])) & 4294967295L;
        v[36] = ((v[35] << 2L)) & 4294967295L;
        v[37] = v[36] < v[34] ? 1L : 0L;
        return v[37] != 0 ? 47 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[38] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34240L) & 4294967295L;
        m.store(v[38], 0L, 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[39] = F0466_allocatePredInfo.run(m, v[0]);
        v[40] = v[39] == 0L ? 1L : 0L;
        return v[40] != 0 ? 8 : 47;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[41] = F0344_allocateTileInfo.run(m, v[0]);
        v[42] = v[41] == 0L ? 1L : 0L;
        return v[42] != 0 ? 9 : 47;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[43] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = ((v[44] & 1L)) & 4294967295L;
        v[46] = v[45] == 0L ? 1L : 0L;
        return v[46] != 0 ? 10 : 18;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[47] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[48] = m.load(v[47], 4);
        v[49] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = F0347_allocateQuantizer.run(m, v[48], v[50], 1L);
        v[52] = v[51] == 0L ? 1L : 0L;
        return v[52] != 0 ? 11 : 47;
    }

    private static int b11(Heap m, long[] v, int previous) {
        F0349_setUniformQuantizer.run(m, v[0], 0L);
        v[53] = m.load(v[49], 4);
        v[54] = v[53] == 0L ? 1L : 0L;
        v[55] = m.load(v[47], 4);
        return v[54] != 0 ? 17 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[56] = ((v[53] & 3L)) & 4294967295L;
        v[57] = v[53] < 4L ? 1L : 0L;
        return v[57] != 0 ? 15 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[58] = ((v[53] & 4294967292L)) & 4294967295L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi59 = (previous == 13 ? 0L : v[80]);
        long phi60 = (previous == 13 ? 0L : v[81]);
        v[59] = phi59;
        v[60] = phi60;
        v[61] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 64L + (Heap.s(v[59], 32) * 1L)) & 4294967295L;
        v[62] = m.load(v[61], 1);
        v[63] = (v[55] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[59], 32) * 4L)) & 4294967295L;
        v[64] = m.load(v[63], 4);
        m.store(v[64], v[62], 1);
        v[65] = ((v[59] | 1L)) & 4294967295L;
        v[66] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 64L + (Heap.s(v[65], 32) * 1L)) & 4294967295L;
        v[67] = m.load(v[66], 1);
        v[68] = (v[55] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[65], 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        m.store(v[69], v[67], 1);
        v[70] = ((v[59] | 2L)) & 4294967295L;
        v[71] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 64L + (Heap.s(v[70], 32) * 1L)) & 4294967295L;
        v[72] = m.load(v[71], 1);
        v[73] = (v[55] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[70], 32) * 4L)) & 4294967295L;
        v[74] = m.load(v[73], 4);
        m.store(v[74], v[72], 1);
        v[75] = ((v[59] | 3L)) & 4294967295L;
        v[76] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 64L + (Heap.s(v[75], 32) * 1L)) & 4294967295L;
        v[77] = m.load(v[76], 1);
        v[78] = (v[55] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[75], 32) * 4L)) & 4294967295L;
        v[79] = m.load(v[78], 4);
        m.store(v[79], v[77], 1);
        v[80] = ((v[59] + 4L)) & 4294967295L;
        v[81] = ((v[60] + 4L)) & 4294967295L;
        v[82] = v[81] == v[58] ? 1L : 0L;
        return v[82] != 0 ? 15 : 14;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi83 = (previous == 12 ? 0L : v[80]);
        v[83] = phi83;
        v[84] = v[56] == 0L ? 1L : 0L;
        return v[84] != 0 ? 17 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi85 = (previous == 16 ? v[91] : v[83]);
        long phi86 = (previous == 16 ? v[92] : 0L);
        v[85] = phi85;
        v[86] = phi86;
        v[87] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 64L + (Heap.s(v[85], 32) * 1L)) & 4294967295L;
        v[88] = m.load(v[87], 1);
        v[89] = (v[55] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[85], 32) * 4L)) & 4294967295L;
        v[90] = m.load(v[89], 4);
        m.store(v[90], v[88], 1);
        v[91] = ((v[85] + 1L)) & 4294967295L;
        v[92] = ((v[86] + 1L)) & 4294967295L;
        v[93] = v[92] == v[56] ? 1L : 0L;
        return v[93] != 0 ? 17 : 16;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[94] = m.load(v[43], 4);
        v[95] = (v[94]) & 255L;
        v[96] = ((v[95] >>> 3L)) & 255L;
        v[97] = ((v[96] & 3L)) & 255L;
        v[98] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        v[99] = m.load(v[98], 4);
        F0348_formatQuantizer.run(m, v[55], v[97], v[53], 0L, 1L, v[99]);
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[100] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[101] = m.load(v[100], 4);
        v[102] = v[101] == 3L ? 1L : 0L;
        return v[102] != 0 ? 42 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[103] = m.load(v[43], 4);
        v[104] = ((v[103] & 2L)) & 4294967295L;
        v[105] = v[104] == 0L ? 1L : 0L;
        return v[105] != 0 ? 20 : 30;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[106] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[107] = m.load(v[106], 4);
        v[108] = (v[107] + (Heap.s(0L, 32) * 240L) + 64L) & 4294967295L;
        v[109] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[110] = m.load(v[109], 4);
        v[111] = F0347_allocateQuantizer.run(m, v[108], v[110], 1L);
        v[112] = v[111] == 0L ? 1L : 0L;
        return v[112] != 0 ? 21 : 47;
    }

    private static int b21(Heap m, long[] v, int previous) {
        F0349_setUniformQuantizer.run(m, v[0], 1L);
        v[113] = m.load(v[43], 4);
        v[114] = ((v[113] & 512L)) & 4294967295L;
        v[115] = v[114] == 0L ? 1L : 0L;
        return v[115] != 0 ? 25 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[116] = m.load(v[109], 4);
        v[117] = v[116] == 0L ? 1L : 0L;
        v[118] = m.load(v[106], 4);
        return v[117] != 0 ? 29 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[119] = ((v[116] & 3L)) & 4294967295L;
        v[120] = v[116] < 4L ? 1L : 0L;
        return v[120] != 0 ? 27 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[121] = ((v[116] & 4294967292L)) & 4294967295L;
        return 26;
    }

    private static int b25(Heap m, long[] v, int previous) {
        F0350_useDCQuantizer.run(m, v[0], 0L);
        return 30;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi122 = (previous == 24 ? 0L : v[143]);
        long phi123 = (previous == 24 ? 0L : v[144]);
        v[122] = phi122;
        v[123] = phi123;
        v[124] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 80L + (Heap.s(v[122], 32) * 1L)) & 4294967295L;
        v[125] = m.load(v[124], 1);
        v[126] = (v[118] + (Heap.s(0L, 32) * 240L) + 64L + (Heap.s(v[122], 32) * 4L)) & 4294967295L;
        v[127] = m.load(v[126], 4);
        m.store(v[127], v[125], 1);
        v[128] = ((v[122] | 1L)) & 4294967295L;
        v[129] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 80L + (Heap.s(v[128], 32) * 1L)) & 4294967295L;
        v[130] = m.load(v[129], 1);
        v[131] = (v[118] + (Heap.s(0L, 32) * 240L) + 64L + (Heap.s(v[128], 32) * 4L)) & 4294967295L;
        v[132] = m.load(v[131], 4);
        m.store(v[132], v[130], 1);
        v[133] = ((v[122] | 2L)) & 4294967295L;
        v[134] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 80L + (Heap.s(v[133], 32) * 1L)) & 4294967295L;
        v[135] = m.load(v[134], 1);
        v[136] = (v[118] + (Heap.s(0L, 32) * 240L) + 64L + (Heap.s(v[133], 32) * 4L)) & 4294967295L;
        v[137] = m.load(v[136], 4);
        m.store(v[137], v[135], 1);
        v[138] = ((v[122] | 3L)) & 4294967295L;
        v[139] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 80L + (Heap.s(v[138], 32) * 1L)) & 4294967295L;
        v[140] = m.load(v[139], 1);
        v[141] = (v[118] + (Heap.s(0L, 32) * 240L) + 64L + (Heap.s(v[138], 32) * 4L)) & 4294967295L;
        v[142] = m.load(v[141], 4);
        m.store(v[142], v[140], 1);
        v[143] = ((v[122] + 4L)) & 4294967295L;
        v[144] = ((v[123] + 4L)) & 4294967295L;
        v[145] = v[144] == v[121] ? 1L : 0L;
        return v[145] != 0 ? 27 : 26;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi146 = (previous == 23 ? 0L : v[143]);
        v[146] = phi146;
        v[147] = v[119] == 0L ? 1L : 0L;
        return v[147] != 0 ? 29 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi148 = (previous == 28 ? v[154] : v[146]);
        long phi149 = (previous == 28 ? v[155] : 0L);
        v[148] = phi148;
        v[149] = phi149;
        v[150] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 80L + (Heap.s(v[148], 32) * 1L)) & 4294967295L;
        v[151] = m.load(v[150], 1);
        v[152] = (v[118] + (Heap.s(0L, 32) * 240L) + 64L + (Heap.s(v[148], 32) * 4L)) & 4294967295L;
        v[153] = m.load(v[152], 4);
        m.store(v[153], v[151], 1);
        v[154] = ((v[148] + 1L)) & 4294967295L;
        v[155] = ((v[149] + 1L)) & 4294967295L;
        v[156] = v[155] == v[119] ? 1L : 0L;
        return v[156] != 0 ? 29 : 28;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[157] = (v[118] + (Heap.s(0L, 32) * 240L) + 64L) & 4294967295L;
        v[158] = (v[113]) & 255L;
        v[159] = ((v[158] >>> 5L)) & 255L;
        v[160] = ((v[159] & 3L)) & 255L;
        v[161] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        v[162] = m.load(v[161], 4);
        F0348_formatQuantizer.run(m, v[157], v[160], v[116], 0L, 1L, v[162]);
        return 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[163] = m.load(v[100], 4);
        v[164] = v[163] == 2L ? 1L : 0L;
        return v[164] != 0 ? 42 : 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[165] = m.load(v[43], 4);
        v[166] = ((v[165] & 4L)) & 4294967295L;
        v[167] = v[166] == 0L ? 1L : 0L;
        return v[167] != 0 ? 32 : 42;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[168] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[169] = m.load(v[168], 4);
        v[170] = (v[169] + (Heap.s(0L, 32) * 240L) + 128L) & 4294967295L;
        v[171] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[172] = m.load(v[171], 4);
        v[173] = F0347_allocateQuantizer.run(m, v[170], v[172], 1L);
        v[174] = v[173] == 0L ? 1L : 0L;
        return v[174] != 0 ? 33 : 47;
    }

    private static int b33(Heap m, long[] v, int previous) {
        F0349_setUniformQuantizer.run(m, v[0], 2L);
        v[175] = m.load(v[43], 4);
        v[176] = ((v[175] & 1024L)) & 4294967295L;
        v[177] = v[176] == 0L ? 1L : 0L;
        return v[177] != 0 ? 37 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[178] = m.load(v[171], 4);
        v[179] = v[178] == 0L ? 1L : 0L;
        v[180] = m.load(v[168], 4);
        return v[179] != 0 ? 41 : 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[181] = ((v[178] & 3L)) & 4294967295L;
        v[182] = v[178] < 4L ? 1L : 0L;
        return v[182] != 0 ? 39 : 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[183] = ((v[178] & 4294967292L)) & 4294967295L;
        return 38;
    }

    private static int b37(Heap m, long[] v, int previous) {
        F0351_useLPQuantizer.run(m, v[0], 1L, 0L);
        return 42;
    }

    private static int b38(Heap m, long[] v, int previous) {
        long phi184 = (previous == 36 ? 0L : v[205]);
        long phi185 = (previous == 36 ? 0L : v[206]);
        v[184] = phi184;
        v[185] = phi185;
        v[186] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 96L + (Heap.s(v[184], 32) * 1L)) & 4294967295L;
        v[187] = m.load(v[186], 1);
        v[188] = (v[180] + (Heap.s(0L, 32) * 240L) + 128L + (Heap.s(v[184], 32) * 4L)) & 4294967295L;
        v[189] = m.load(v[188], 4);
        m.store(v[189], v[187], 1);
        v[190] = ((v[184] | 1L)) & 4294967295L;
        v[191] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 96L + (Heap.s(v[190], 32) * 1L)) & 4294967295L;
        v[192] = m.load(v[191], 1);
        v[193] = (v[180] + (Heap.s(0L, 32) * 240L) + 128L + (Heap.s(v[190], 32) * 4L)) & 4294967295L;
        v[194] = m.load(v[193], 4);
        m.store(v[194], v[192], 1);
        v[195] = ((v[184] | 2L)) & 4294967295L;
        v[196] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 96L + (Heap.s(v[195], 32) * 1L)) & 4294967295L;
        v[197] = m.load(v[196], 1);
        v[198] = (v[180] + (Heap.s(0L, 32) * 240L) + 128L + (Heap.s(v[195], 32) * 4L)) & 4294967295L;
        v[199] = m.load(v[198], 4);
        m.store(v[199], v[197], 1);
        v[200] = ((v[184] | 3L)) & 4294967295L;
        v[201] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 96L + (Heap.s(v[200], 32) * 1L)) & 4294967295L;
        v[202] = m.load(v[201], 1);
        v[203] = (v[180] + (Heap.s(0L, 32) * 240L) + 128L + (Heap.s(v[200], 32) * 4L)) & 4294967295L;
        v[204] = m.load(v[203], 4);
        m.store(v[204], v[202], 1);
        v[205] = ((v[184] + 4L)) & 4294967295L;
        v[206] = ((v[185] + 4L)) & 4294967295L;
        v[207] = v[206] == v[183] ? 1L : 0L;
        return v[207] != 0 ? 39 : 38;
    }

    private static int b39(Heap m, long[] v, int previous) {
        long phi208 = (previous == 35 ? 0L : v[205]);
        v[208] = phi208;
        v[209] = v[181] == 0L ? 1L : 0L;
        return v[209] != 0 ? 41 : 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        long phi210 = (previous == 40 ? v[216] : v[208]);
        long phi211 = (previous == 40 ? v[217] : 0L);
        v[210] = phi210;
        v[211] = phi211;
        v[212] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 96L + (Heap.s(v[210], 32) * 1L)) & 4294967295L;
        v[213] = m.load(v[212], 1);
        v[214] = (v[180] + (Heap.s(0L, 32) * 240L) + 128L + (Heap.s(v[210], 32) * 4L)) & 4294967295L;
        v[215] = m.load(v[214], 4);
        m.store(v[215], v[213], 1);
        v[216] = ((v[210] + 1L)) & 4294967295L;
        v[217] = ((v[211] + 1L)) & 4294967295L;
        v[218] = v[217] == v[181] ? 1L : 0L;
        return v[218] != 0 ? 41 : 40;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[219] = (v[180] + (Heap.s(0L, 32) * 240L) + 128L) & 4294967295L;
        v[220] = ((v[175] >>> 7L)) & 4294967295L;
        v[221] = (v[220]) & 255L;
        v[222] = ((v[221] & 3L)) & 255L;
        v[223] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        v[224] = m.load(v[223], 4);
        F0348_formatQuantizer.run(m, v[219], v[222], v[178], 0L, 0L, v[224]);
        return 42;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[225] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[226] = m.load(v[225], 4);
        v[227] = v[226] > 4095L ? 1L : 0L;
        return v[227] != 0 ? 47 : 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        v[228] = ((v[226] + 1L)) & 4294967295L;
        v[229] = F0019_AllocateCodingContextDec.run(m, v[0], v[228]);
        v[230] = v[229] == 0L ? 1L : 0L;
        return v[230] != 0 ? 44 : 47;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[231] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        v[232] = m.load(v[231], 4);
        v[233] = v[232] == 0L ? 1L : 0L;
        return v[233] != 0 ? 46 : 45;
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[234] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[235] = m.load(v[234], 4);
        v[236] = (v[235] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[237] = m.load(v[236], 4);
        v[238] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        m.store(v[238], v[237], 4);
        v[239] = (v[235] + (Heap.s(0L, 32) * 35064L) + 34296L) & 4294967295L;
        v[240] = m.load(v[239], 4);
        v[241] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34296L) & 4294967295L;
        m.store(v[241], v[240], 4);
        v[242] = (v[235] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        v[243] = m.load(v[242], 4);
        v[244] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        m.store(v[244], v[243], 4);
        v[245] = (v[235] + (Heap.s(0L, 32) * 35064L) + 34236L) & 4294967295L;
        v[246] = m.load(v[245], 1);
        v[247] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34236L) & 4294967295L;
        m.store(v[247], v[246], 1);
        return 46;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[248] = F0343_setBitIOPointers.run(m, v[0]);
        return 47;
    }

    private static int b47(Heap m, long[] v, int previous) {
        long phi249 = (previous == 46 ? 0L : (previous == 5 ? 4294967295L : (previous == 4 ? 4294967295L : (previous == 7 ? 4294967295L : (previous == 8 ? 4294967295L : (previous == 10 ? 4294967295L : (previous == 20 ? 4294967295L : (previous == 32 ? 4294967295L : (previous == 43 ? 4294967295L : 4294967295L)))))))));
        v[249] = phi249;
        v[250] = v[249];
        return -1;
    }
}
