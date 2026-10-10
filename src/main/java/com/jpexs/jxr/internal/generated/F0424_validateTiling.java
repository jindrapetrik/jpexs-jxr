package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: validateTiling.
 */
public final class F0424_validateTiling {

    private F0424_validateTiling() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[174];
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
                        throw new IllegalStateException("Invalid block in validateTiling");
                }
                previous = old;
                if (pc < 0) {
                    return v[173];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = LibC.call(m, "llvm.umax.i32", new long[]{v[1], 1L});
        v[4] = v[3] > v[2] ? 1L : 0L;
        v[5] = LibC.call(m, "llvm.umin.i32", new long[]{v[3], 4096L});
        v[6] = v[4] != 0 ? 1L : v[5];
        v[7] = ((v[6] + 4294967295L)) & 4294967295L;
        return 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi8 = (previous == 0 ? 0L : v[10]);
        long phi9 = (previous == 0 ? 0L : v[52]);
        v[8] = phi8;
        v[9] = phi9;
        v[10] = ((v[8] + 1L)) & 4294967295L;
        v[11] = v[8] == v[7] ? 1L : 0L;
        return v[11] != 0 ? 11 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(v[8], 32) * 4L)) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[13] + 4294901760L)) & 4294967295L;
        v[15] = v[14] < 4294901761L ? 1L : 0L;
        return v[15] != 0 ? 3 : 10;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[16] = ((v[2] + 4294967295L)) & 4294967295L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi17 = (previous == 4 ? v[23] : 0L);
        long phi18 = (previous == 4 ? v[22] : v[5]);
        v[17] = phi17;
        v[18] = phi18;
        v[19] = ((v[16] + v[18])) & 4294967295L;
        v[20] = ((v[19] / v[18])) & 4294967295L;
        v[21] = v[20] > 65535L ? 1L : 0L;
        v[22] = ((v[18] + 1L)) & 4294967295L;
        v[23] = ((v[17] + 1L)) & 4294967295L;
        return v[21] != 0 ? 4 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[24] = v[18] > 1L ? 1L : 0L;
        return v[24] != 0 ? 6 : 11;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[25] = ((v[5] ^ 4294967295L)) & 4294967295L;
        v[26] = ((v[17] + v[25])) & 4294967295L;
        v[27] = ((v[26] & 1L)) & 4294967295L;
        v[28] = v[27] == 0L ? 1L : 0L;
        return v[28] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[29] = ((v[18] + 4294967295L)) & 4294967295L;
        v[30] = ((v[29] + v[2])) & 4294967295L;
        v[31] = ((v[30] / v[18])) & 4294967295L;
        m.store(v[0], v[31], 4);
        v[32] = ((v[2] - v[31])) & 4294967295L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi33 = (previous == 6 ? v[2] : v[32]);
        long phi34 = (previous == 6 ? v[18] : v[29]);
        v[33] = phi33;
        v[34] = phi34;
        v[35] = ((2L - v[5])) & 4294967295L;
        v[36] = v[17] == v[35] ? 1L : 0L;
        return v[36] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi37 = (previous == 9 ? v[50] : v[33]);
        long phi38 = (previous == 9 ? v[45] : v[34]);
        v[37] = phi37;
        v[38] = phi38;
        v[39] = ((v[38] + 4294967295L)) & 4294967295L;
        v[40] = ((v[39] + v[37])) & 4294967295L;
        v[41] = ((v[40] / v[38])) & 4294967295L;
        v[42] = ((v[18] - v[38])) & 4294967295L;
        v[43] = (v[0] + (Heap.s(v[42], 32) * 4L)) & 4294967295L;
        m.store(v[43], v[41], 4);
        v[44] = ((v[37] - v[41])) & 4294967295L;
        v[45] = ((v[38] + 4294967294L)) & 4294967295L;
        v[46] = ((v[45] + v[44])) & 4294967295L;
        v[47] = ((v[46] / v[39])) & 4294967295L;
        v[48] = ((v[18] - v[39])) & 4294967295L;
        v[49] = (v[0] + (Heap.s(v[48], 32) * 4L)) & 4294967295L;
        m.store(v[49], v[47], 4);
        v[50] = ((v[44] - v[47])) & 4294967295L;
        v[51] = v[45] > 1L ? 1L : 0L;
        return v[51] != 0 ? 9 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[52] = ((v[13] + v[9])) & 4294967295L;
        v[53] = v[52] < v[2] ? 1L : 0L;
        return v[53] != 0 ? 1 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi54 = (previous == 5 ? v[18] : (previous == 9 ? v[18] : (previous == 8 ? v[18] : (previous == 10 ? v[10] : v[6]))));
        long phi55 = (previous == 5 ? v[9] : (previous == 9 ? v[9] : (previous == 8 ? v[9] : (previous == 10 ? v[52] : v[9]))));
        v[54] = phi54;
        v[55] = phi55;
        v[56] = ((v[2] - v[55])) & 4294967295L;
        v[57] = v[56] > 65536L ? 1L : 0L;
        return v[57] != 0 ? 12 : 19;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[58] = ((v[2] + 4294967295L)) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi59 = (previous == 13 ? v[65] : 0L);
        long phi60 = (previous == 13 ? v[64] : v[54]);
        v[59] = phi59;
        v[60] = phi60;
        v[61] = ((v[58] + v[60])) & 4294967295L;
        v[62] = ((v[61] / v[60])) & 4294967295L;
        v[63] = v[62] > 65535L ? 1L : 0L;
        v[64] = ((v[60] + 1L)) & 4294967295L;
        v[65] = ((v[59] + 1L)) & 4294967295L;
        return v[63] != 0 ? 13 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[66] = v[60] > 1L ? 1L : 0L;
        return v[66] != 0 ? 15 : 24;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[67] = ((v[54] ^ 4294967295L)) & 4294967295L;
        v[68] = ((v[59] + v[67])) & 4294967295L;
        v[69] = ((v[68] & 1L)) & 4294967295L;
        v[70] = v[69] == 0L ? 1L : 0L;
        return v[70] != 0 ? 17 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[71] = ((v[60] + 4294967295L)) & 4294967295L;
        v[72] = ((v[71] + v[2])) & 4294967295L;
        v[73] = ((v[72] / v[60])) & 4294967295L;
        m.store(v[0], v[73], 4);
        v[74] = ((v[2] - v[73])) & 4294967295L;
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi75 = (previous == 15 ? v[2] : v[74]);
        long phi76 = (previous == 15 ? v[60] : v[71]);
        v[75] = phi75;
        v[76] = phi76;
        v[77] = ((2L - v[54])) & 4294967295L;
        v[78] = v[59] == v[77] ? 1L : 0L;
        return v[78] != 0 ? 19 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi79 = (previous == 18 ? v[92] : v[75]);
        long phi80 = (previous == 18 ? v[87] : v[76]);
        v[79] = phi79;
        v[80] = phi80;
        v[81] = ((v[80] + 4294967295L)) & 4294967295L;
        v[82] = ((v[81] + v[79])) & 4294967295L;
        v[83] = ((v[82] / v[80])) & 4294967295L;
        v[84] = ((v[60] - v[80])) & 4294967295L;
        v[85] = (v[0] + (Heap.s(v[84], 32) * 4L)) & 4294967295L;
        m.store(v[85], v[83], 4);
        v[86] = ((v[79] - v[83])) & 4294967295L;
        v[87] = ((v[80] + 4294967294L)) & 4294967295L;
        v[88] = ((v[87] + v[86])) & 4294967295L;
        v[89] = ((v[88] / v[81])) & 4294967295L;
        v[90] = ((v[60] - v[81])) & 4294967295L;
        v[91] = (v[0] + (Heap.s(v[90], 32) * 4L)) & 4294967295L;
        m.store(v[91], v[89], 4);
        v[92] = ((v[86] - v[89])) & 4294967295L;
        v[93] = v[87] > 1L ? 1L : 0L;
        return v[93] != 0 ? 18 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi94 = (previous == 11 ? v[54] : (previous == 18 ? v[60] : v[60]));
        v[94] = phi94;
        v[95] = v[94] > 1L ? 1L : 0L;
        return v[95] != 0 ? 20 : 24;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[96] = m.load(v[0], 4);
        v[97] = ((v[94] + 4294967295L)) & 4294967295L;
        v[98] = ((v[94] + 4294967294L)) & 4294967295L;
        v[99] = ((v[97] & 3L)) & 4294967295L;
        v[100] = v[98] < 3L ? 1L : 0L;
        return v[100] != 0 ? 22 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[101] = ((v[97] & 4294967292L)) & 4294967295L;
        v[102] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[103] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[104] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        return 28;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi105 = (previous == 20 ? v[96] : v[150]);
        long phi106 = (previous == 20 ? 1L : v[151]);
        v[105] = phi105;
        v[106] = phi106;
        v[107] = v[99] == 0L ? 1L : 0L;
        return v[107] != 0 ? 24 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi108 = (previous == 23 ? v[113] : v[105]);
        long phi109 = (previous == 23 ? v[114] : v[106]);
        long phi110 = (previous == 23 ? v[115] : 0L);
        v[108] = phi108;
        v[109] = phi109;
        v[110] = phi110;
        v[111] = (v[0] + (Heap.s(v[109], 32) * 4L)) & 4294967295L;
        v[112] = m.load(v[111], 4);
        v[113] = ((v[112] + v[108])) & 4294967295L;
        m.store(v[111], v[113], 4);
        v[114] = ((v[109] + 1L)) & 4294967295L;
        v[115] = ((v[110] + 1L)) & 4294967295L;
        v[116] = v[115] == v[99] ? 1L : 0L;
        return v[116] != 0 ? 24 : 23;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi117 = (previous == 19 ? v[94] : (previous == 14 ? v[60] : (previous == 23 ? v[94] : v[94])));
        v[117] = phi117;
        v[118] = (v[0] + (Heap.s(4294967294L, 32) * 4L)) & 4294967295L;
        v[119] = ((v[117] + 4294967295L)) & 4294967295L;
        v[120] = v[119] == 0L ? 1L : 0L;
        return v[120] != 0 ? 30 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[121] = ((v[117] + 4294967294L)) & 4294967295L;
        v[122] = ((v[119] & 3L)) & 4294967295L;
        v[123] = v[122] == 0L ? 1L : 0L;
        return v[123] != 0 ? 27 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi124 = (previous == 26 ? v[130] : v[119]);
        long phi125 = (previous == 26 ? v[124] : v[117]);
        long phi126 = (previous == 26 ? v[131] : 0L);
        v[124] = phi124;
        v[125] = phi125;
        v[126] = phi126;
        v[127] = (v[118] + (Heap.s(v[125], 32) * 4L)) & 4294967295L;
        v[128] = m.load(v[127], 4);
        v[129] = (v[0] + (Heap.s(v[124], 32) * 4L)) & 4294967295L;
        m.store(v[129], v[128], 4);
        v[130] = ((v[124] + 4294967295L)) & 4294967295L;
        v[131] = ((v[126] + 1L)) & 4294967295L;
        v[132] = v[131] == v[122] ? 1L : 0L;
        return v[132] != 0 ? 27 : 26;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi133 = (previous == 25 ? v[119] : v[130]);
        long phi134 = (previous == 25 ? v[117] : v[124]);
        v[133] = phi133;
        v[134] = phi134;
        v[135] = v[121] < 3L ? 1L : 0L;
        return v[135] != 0 ? 30 : 29;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi136 = (previous == 21 ? v[96] : v[150]);
        long phi137 = (previous == 21 ? 1L : v[151]);
        long phi138 = (previous == 21 ? 0L : v[152]);
        v[136] = phi136;
        v[137] = phi137;
        v[138] = phi138;
        v[139] = (v[0] + (Heap.s(v[137], 32) * 4L)) & 4294967295L;
        v[140] = m.load(v[139], 4);
        v[141] = ((v[140] + v[136])) & 4294967295L;
        m.store(v[139], v[141], 4);
        v[142] = (v[102] + (Heap.s(v[137], 32) * 4L)) & 4294967295L;
        v[143] = m.load(v[142], 4);
        v[144] = ((v[143] + v[141])) & 4294967295L;
        m.store(v[142], v[144], 4);
        v[145] = (v[103] + (Heap.s(v[137], 32) * 4L)) & 4294967295L;
        v[146] = m.load(v[145], 4);
        v[147] = ((v[146] + v[144])) & 4294967295L;
        m.store(v[145], v[147], 4);
        v[148] = (v[104] + (Heap.s(v[137], 32) * 4L)) & 4294967295L;
        v[149] = m.load(v[148], 4);
        v[150] = ((v[149] + v[147])) & 4294967295L;
        m.store(v[148], v[150], 4);
        v[151] = ((v[137] + 4L)) & 4294967295L;
        v[152] = ((v[138] + 4L)) & 4294967295L;
        v[153] = v[152] == v[101] ? 1L : 0L;
        return v[153] != 0 ? 22 : 28;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi154 = (previous == 29 ? v[171] : v[133]);
        long phi155 = (previous == 29 ? v[167] : v[134]);
        v[154] = phi154;
        v[155] = phi155;
        v[156] = (v[118] + (Heap.s(v[155], 32) * 4L)) & 4294967295L;
        v[157] = m.load(v[156], 4);
        v[158] = (v[0] + (Heap.s(v[154], 32) * 4L)) & 4294967295L;
        m.store(v[158], v[157], 4);
        v[159] = ((v[154] + 4294967295L)) & 4294967295L;
        v[160] = (v[118] + (Heap.s(v[154], 32) * 4L)) & 4294967295L;
        v[161] = m.load(v[160], 4);
        v[162] = (v[0] + (Heap.s(v[159], 32) * 4L)) & 4294967295L;
        m.store(v[162], v[161], 4);
        v[163] = ((v[154] + 4294967294L)) & 4294967295L;
        v[164] = (v[118] + (Heap.s(v[159], 32) * 4L)) & 4294967295L;
        v[165] = m.load(v[164], 4);
        v[166] = (v[0] + (Heap.s(v[163], 32) * 4L)) & 4294967295L;
        m.store(v[166], v[165], 4);
        v[167] = ((v[154] + 4294967293L)) & 4294967295L;
        v[168] = (v[118] + (Heap.s(v[163], 32) * 4L)) & 4294967295L;
        v[169] = m.load(v[168], 4);
        v[170] = (v[0] + (Heap.s(v[167], 32) * 4L)) & 4294967295L;
        m.store(v[170], v[169], 4);
        v[171] = ((v[154] + 4294967292L)) & 4294967295L;
        v[172] = v[171] == 0L ? 1L : 0L;
        return v[172] != 0 ? 30 : 29;
    }

    private static int b30(Heap m, long[] v, int previous) {
        m.store(v[0], 0L, 4);
        v[173] = v[117];
        return -1;
    }
}
