package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: interpolateUV.
 */
public final class F0381_interpolateUV {

    private F0381_interpolateUV() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[268];
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
                    default:
                        throw new IllegalStateException("Invalid block in interpolateUV");
                }
                previous = old;
                if (pc < 0) {
                    return v[267];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = ((v[2] << 4L)) & 4294967295L;
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34780L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34784L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = v[13] == 2L ? 1L : 0L;
        return v[14] != 0 ? 1 : 6;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[15] = v[3] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi16 = (previous == 1 ? 0L : v[96]);
        long phi17 = (previous == 1 ? 0L : v[80]);
        v[16] = phi16;
        v[17] = phi17;
        return v[15] != 0 ? 5 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[18] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[16], 32) * 16L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        v[19] = m.load(v[18], 1);
        v[20] = (v[19]) & 4294967295L;
        v[21] = (v[5] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[9] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        m.store(v[23], v[22], 4);
        v[24] = (v[7] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = (v[11] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        m.store(v[26], v[25], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi27 = (previous == 4 ? v[78] : 2L);
        v[27] = phi27;
        v[28] = ((v[27] >>> 4L)) & 4294967295L;
        v[29] = ((v[28] << 7L)) & 4294967295L;
        v[30] = ((v[27] >>> 1L)) & 4294967295L;
        v[31] = ((v[30] & 7L)) & 4294967295L;
        v[32] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[16], 32) * 16L) + (Heap.s(v[31], 32) * 1L)) & 4294967295L;
        v[33] = m.load(v[32], 1);
        v[34] = (v[33]) & 4294967295L;
        v[35] = ((v[29] + v[34])) & 4294967295L;
        v[36] = ((v[28] << 8L)) & 4294967295L;
        v[37] = ((v[27] & 14L)) & 4294967295L;
        v[38] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[16], 32) * 16L) + (Heap.s(v[37], 32) * 1L)) & 4294967295L;
        v[39] = m.load(v[38], 1);
        v[40] = (v[39]) & 4294967295L;
        v[41] = ((v[36] | v[40])) & 4294967295L;
        v[42] = (v[5] + (Heap.s(v[35], 32) * 4L)) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = (v[9] + (Heap.s(v[41], 32) * 4L)) & 4294967295L;
        m.store(v[44], v[43], 4);
        v[45] = (v[7] + (Heap.s(v[35], 32) * 4L)) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = (v[11] + (Heap.s(v[41], 32) * 4L)) & 4294967295L;
        m.store(v[47], v[46], 4);
        v[48] = ((v[27] + 4294967294L)) & 4294967295L;
        v[49] = ((v[48] << 4L)) & 4294967295L;
        v[50] = ((v[49] & 4294967040L)) & 4294967295L;
        v[51] = ((v[48] & 14L)) & 4294967295L;
        v[52] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[16], 32) * 16L) + (Heap.s(v[51], 32) * 1L)) & 4294967295L;
        v[53] = m.load(v[52], 1);
        v[54] = (v[53]) & 4294967295L;
        v[55] = ((v[50] | v[54])) & 4294967295L;
        v[56] = ((v[27] + 4294967295L)) & 4294967295L;
        v[57] = ((v[56] << 4L)) & 4294967295L;
        v[58] = ((v[57] & 4294967040L)) & 4294967295L;
        v[59] = ((v[56] & 15L)) & 4294967295L;
        v[60] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[16], 32) * 16L) + (Heap.s(v[59], 32) * 1L)) & 4294967295L;
        v[61] = m.load(v[60], 1);
        v[62] = (v[61]) & 4294967295L;
        v[63] = ((v[58] | v[62])) & 4294967295L;
        v[64] = (v[9] + (Heap.s(v[55], 32) * 4L)) & 4294967295L;
        v[65] = m.load(v[64], 4);
        v[66] = m.load(v[44], 4);
        v[67] = ((v[65] + 1L)) & 4294967295L;
        v[68] = ((v[67] + v[66])) & 4294967295L;
        v[69] = ((Heap.s(v[68], 32) >> 1L)) & 4294967295L;
        v[70] = (v[9] + (Heap.s(v[63], 32) * 4L)) & 4294967295L;
        m.store(v[70], v[69], 4);
        v[71] = (v[11] + (Heap.s(v[55], 32) * 4L)) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = m.load(v[47], 4);
        v[74] = ((v[72] + 1L)) & 4294967295L;
        v[75] = ((v[74] + v[73])) & 4294967295L;
        v[76] = ((Heap.s(v[75], 32) >> 1L)) & 4294967295L;
        v[77] = (v[11] + (Heap.s(v[63], 32) * 4L)) & 4294967295L;
        m.store(v[77], v[76], 4);
        v[78] = ((v[27] + 2L)) & 4294967295L;
        v[79] = v[78] < v[3] ? 1L : 0L;
        return v[79] != 0 ? 4 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi80 = (previous == 2 ? v[17] : v[41]);
        long phi81 = (previous == 2 ? 0L : v[78]);
        v[80] = phi80;
        v[81] = phi81;
        v[82] = ((v[81] + 4294967295L)) & 4294967295L;
        v[83] = ((v[82] << 4L)) & 4294967295L;
        v[84] = ((v[83] & 4294967040L)) & 4294967295L;
        v[85] = ((v[82] & 15L)) & 4294967295L;
        v[86] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[16], 32) * 16L) + (Heap.s(v[85], 32) * 1L)) & 4294967295L;
        v[87] = m.load(v[86], 1);
        v[88] = (v[87]) & 4294967295L;
        v[89] = ((v[84] | v[88])) & 4294967295L;
        v[90] = (v[9] + (Heap.s(v[80], 32) * 4L)) & 4294967295L;
        v[91] = m.load(v[90], 4);
        v[92] = (v[9] + (Heap.s(v[89], 32) * 4L)) & 4294967295L;
        m.store(v[92], v[91], 4);
        v[93] = (v[11] + (Heap.s(v[80], 32) * 4L)) & 4294967295L;
        v[94] = m.load(v[93], 4);
        v[95] = (v[11] + (Heap.s(v[89], 32) * 4L)) & 4294967295L;
        m.store(v[95], v[94], 4);
        v[96] = ((v[16] + 1L)) & 4294967295L;
        v[97] = v[96] == 16L ? 1L : 0L;
        return v[97] != 0 ? 19 : 2;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[98] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 8L) & 4294967295L;
        v[99] = m.load(v[98], 4);
        v[100] = v[99] == 2L ? 1L : 0L;
        v[101] = v[3] == 0L ? 1L : 0L;
        return v[101] != 0 ? 14 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[102] = v[100] != 0 ? 3L : 4L;
        v[103] = ((v[102] + 4L)) & 4294967295L;
        v[104] = ((4L - v[102])) & 4294967295L;
        v[105] = ((4294967295L << v[102])) & 4294967295L;
        v[106] = ((v[105] ^ 4294967295L)) & 4294967295L;
        v[107] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[108] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        v[109] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[110] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi111 = (previous == 7 ? 0L : v[206]);
        v[111] = phi111;
        v[112] = ((v[111] >>> 4L)) & 4294967295L;
        v[113] = ((v[112] << v[103])) & 4294967295L;
        v[114] = ((v[111] >>> v[104])) & 4294967295L;
        v[115] = ((v[114] & v[106])) & 4294967295L;
        v[116] = ((v[112] << 6L)) & 4294967295L;
        v[117] = ((v[111] >>> 1L)) & 4294967295L;
        v[118] = ((v[117] & 7L)) & 4294967295L;
        v[119] = (13552L + (Heap.s(0L, 32) * 64L) + (Heap.s(0L, 32) * 8L) + (Heap.s(v[118], 32) * 1L)) & 4294967295L;
        v[120] = m.load(v[119], 1);
        v[121] = (v[120]) & 4294967295L;
        v[122] = ((v[116] + v[121])) & 4294967295L;
        v[123] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(0L, 32) * 16L) + (Heap.s(v[115], 32) * 1L)) & 4294967295L;
        v[124] = m.load(v[123], 1);
        v[125] = (v[124]) & 4294967295L;
        v[126] = ((v[113] + v[125])) & 4294967295L;
        v[127] = (v[5] + (Heap.s(v[122], 32) * 4L)) & 4294967295L;
        v[128] = m.load(v[127], 4);
        v[129] = (v[9] + (Heap.s(v[126], 32) * 4L)) & 4294967295L;
        m.store(v[129], v[128], 4);
        v[130] = (v[7] + (Heap.s(v[122], 32) * 4L)) & 4294967295L;
        v[131] = m.load(v[130], 4);
        v[132] = (v[11] + (Heap.s(v[126], 32) * 4L)) & 4294967295L;
        m.store(v[132], v[131], 4);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi133 = (previous == 8 ? 2L : v[173]);
        v[133] = phi133;
        v[134] = ((v[133] >>> 1L)) & 4294967295L;
        v[135] = (13552L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[134], 32) * 8L) + (Heap.s(v[118], 32) * 1L)) & 4294967295L;
        v[136] = m.load(v[135], 1);
        v[137] = (v[136]) & 4294967295L;
        v[138] = ((v[116] + v[137])) & 4294967295L;
        v[139] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[133], 32) * 16L) + (Heap.s(v[115], 32) * 1L)) & 4294967295L;
        v[140] = m.load(v[139], 1);
        v[141] = (v[140]) & 4294967295L;
        v[142] = ((v[113] + v[141])) & 4294967295L;
        v[143] = (v[5] + (Heap.s(v[138], 32) * 4L)) & 4294967295L;
        v[144] = m.load(v[143], 4);
        v[145] = (v[9] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        m.store(v[145], v[144], 4);
        v[146] = (v[7] + (Heap.s(v[138], 32) * 4L)) & 4294967295L;
        v[147] = m.load(v[146], 4);
        v[148] = (v[11] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        m.store(v[148], v[147], 4);
        v[149] = ((v[133] + 4294967294L)) & 4294967295L;
        v[150] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[149], 32) * 16L) + (Heap.s(v[115], 32) * 1L)) & 4294967295L;
        v[151] = m.load(v[150], 1);
        v[152] = (v[151]) & 4294967295L;
        v[153] = ((v[113] + v[152])) & 4294967295L;
        v[154] = ((v[133] + 4294967295L)) & 4294967295L;
        v[155] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[154], 32) * 16L) + (Heap.s(v[115], 32) * 1L)) & 4294967295L;
        v[156] = m.load(v[155], 1);
        v[157] = (v[156]) & 4294967295L;
        v[158] = ((v[113] + v[157])) & 4294967295L;
        v[159] = (v[9] + (Heap.s(v[153], 32) * 4L)) & 4294967295L;
        v[160] = m.load(v[159], 4);
        v[161] = m.load(v[145], 4);
        v[162] = ((v[160] + 1L)) & 4294967295L;
        v[163] = ((v[162] + v[161])) & 4294967295L;
        v[164] = ((Heap.s(v[163], 32) >> 1L)) & 4294967295L;
        v[165] = (v[9] + (Heap.s(v[158], 32) * 4L)) & 4294967295L;
        m.store(v[165], v[164], 4);
        v[166] = (v[11] + (Heap.s(v[153], 32) * 4L)) & 4294967295L;
        v[167] = m.load(v[166], 4);
        v[168] = m.load(v[148], 4);
        v[169] = ((v[167] + 1L)) & 4294967295L;
        v[170] = ((v[169] + v[168])) & 4294967295L;
        v[171] = ((Heap.s(v[170], 32) >> 1L)) & 4294967295L;
        v[172] = (v[11] + (Heap.s(v[158], 32) * 4L)) & 4294967295L;
        m.store(v[172], v[171], 4);
        v[173] = ((v[133] + 2L)) & 4294967295L;
        v[174] = v[133] < 14L ? 1L : 0L;
        return v[174] != 0 ? 9 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[175] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(15L, 32) * 16L) + (Heap.s(v[115], 32) * 1L)) & 4294967295L;
        v[176] = m.load(v[175], 1);
        v[177] = (v[176]) & 4294967295L;
        v[178] = ((v[113] + v[177])) & 4294967295L;
        v[179] = m.load(v[107], 4);
        v[180] = m.load(v[108], 4);
        v[181] = v[179] == v[180] ? 1L : 0L;
        return v[181] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[182] = (v[9] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        v[183] = m.load(v[182], 4);
        v[184] = (v[9] + (Heap.s(v[178], 32) * 4L)) & 4294967295L;
        m.store(v[184], v[183], 4);
        v[185] = (v[11] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        v[186] = m.load(v[185], 4);
        return 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[187] = m.load(v[109], 4);
        v[188] = (v[187] + (Heap.s(v[122], 32) * 4L)) & 4294967295L;
        v[189] = m.load(v[188], 4);
        v[190] = (v[9] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        v[191] = m.load(v[190], 4);
        v[192] = ((v[189] + 1L)) & 4294967295L;
        v[193] = ((v[192] + v[191])) & 4294967295L;
        v[194] = ((Heap.s(v[193], 32) >> 1L)) & 4294967295L;
        v[195] = (v[9] + (Heap.s(v[178], 32) * 4L)) & 4294967295L;
        m.store(v[195], v[194], 4);
        v[196] = m.load(v[110], 4);
        v[197] = (v[196] + (Heap.s(v[122], 32) * 4L)) & 4294967295L;
        v[198] = m.load(v[197], 4);
        v[199] = (v[11] + (Heap.s(v[142], 32) * 4L)) & 4294967295L;
        v[200] = m.load(v[199], 4);
        v[201] = ((v[198] + 1L)) & 4294967295L;
        v[202] = ((v[201] + v[200])) & 4294967295L;
        v[203] = ((Heap.s(v[202], 32) >> 1L)) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi204 = (previous == 11 ? v[186] : v[203]);
        v[204] = phi204;
        v[205] = (v[11] + (Heap.s(v[178], 32) * 4L)) & 4294967295L;
        m.store(v[205], v[204], 4);
        v[206] = ((v[111] + 2L)) & 4294967295L;
        v[207] = v[206] < v[3] ? 1L : 0L;
        return v[207] != 0 ? 8 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        return v[100] != 0 ? 19 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[208] = ((v[3] + 4294967294L)) & 4294967295L;
        v[209] = ((v[2] << 8L)) & 4294967295L;
        v[210] = ((v[209] + 4294967280L)) & 4294967295L;
        v[211] = ((v[210] & 4294967040L)) & 4294967295L;
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi212 = (previous == 15 ? 0L : v[265]);
        v[212] = phi212;
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi213 = (previous == 17 ? v[253] : 1L);
        v[213] = phi213;
        v[214] = ((v[213] + 4294967295L)) & 4294967295L;
        v[215] = ((v[214] << 4L)) & 4294967295L;
        v[216] = ((v[215] & 4294967040L)) & 4294967295L;
        v[217] = ((v[214] & 15L)) & 4294967295L;
        v[218] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[212], 32) * 16L) + (Heap.s(v[217], 32) * 1L)) & 4294967295L;
        v[219] = m.load(v[218], 1);
        v[220] = (v[219]) & 4294967295L;
        v[221] = ((v[216] | v[220])) & 4294967295L;
        v[222] = ((v[213] << 4L)) & 4294967295L;
        v[223] = ((v[222] & 4294967040L)) & 4294967295L;
        v[224] = ((v[213] & 15L)) & 4294967295L;
        v[225] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[212], 32) * 16L) + (Heap.s(v[224], 32) * 1L)) & 4294967295L;
        v[226] = m.load(v[225], 1);
        v[227] = (v[226]) & 4294967295L;
        v[228] = ((v[223] | v[227])) & 4294967295L;
        v[229] = ((v[213] + 1L)) & 4294967295L;
        v[230] = ((v[229] << 4L)) & 4294967295L;
        v[231] = ((v[230] & 4294967040L)) & 4294967295L;
        v[232] = ((v[229] & 15L)) & 4294967295L;
        v[233] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[212], 32) * 16L) + (Heap.s(v[232], 32) * 1L)) & 4294967295L;
        v[234] = m.load(v[233], 1);
        v[235] = (v[234]) & 4294967295L;
        v[236] = ((v[231] | v[235])) & 4294967295L;
        v[237] = (v[9] + (Heap.s(v[236], 32) * 4L)) & 4294967295L;
        v[238] = m.load(v[237], 4);
        v[239] = (v[9] + (Heap.s(v[221], 32) * 4L)) & 4294967295L;
        v[240] = m.load(v[239], 4);
        v[241] = ((v[238] + 1L)) & 4294967295L;
        v[242] = ((v[241] + v[240])) & 4294967295L;
        v[243] = ((Heap.s(v[242], 32) >> 1L)) & 4294967295L;
        v[244] = (v[9] + (Heap.s(v[228], 32) * 4L)) & 4294967295L;
        m.store(v[244], v[243], 4);
        v[245] = (v[11] + (Heap.s(v[236], 32) * 4L)) & 4294967295L;
        v[246] = m.load(v[245], 4);
        v[247] = (v[11] + (Heap.s(v[221], 32) * 4L)) & 4294967295L;
        v[248] = m.load(v[247], 4);
        v[249] = ((v[246] + 1L)) & 4294967295L;
        v[250] = ((v[249] + v[248])) & 4294967295L;
        v[251] = ((Heap.s(v[250], 32) >> 1L)) & 4294967295L;
        v[252] = (v[11] + (Heap.s(v[228], 32) * 4L)) & 4294967295L;
        m.store(v[252], v[251], 4);
        v[253] = ((v[213] + 2L)) & 4294967295L;
        v[254] = v[253] < v[208] ? 1L : 0L;
        return v[254] != 0 ? 17 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[255] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[212], 32) * 16L) + (Heap.s(15L, 32) * 1L)) & 4294967295L;
        v[256] = m.load(v[255], 1);
        v[257] = (v[256]) & 4294967295L;
        v[258] = ((v[211] | v[257])) & 4294967295L;
        v[259] = (v[9] + (Heap.s(v[236], 32) * 4L)) & 4294967295L;
        v[260] = m.load(v[259], 4);
        v[261] = (v[9] + (Heap.s(v[258], 32) * 4L)) & 4294967295L;
        m.store(v[261], v[260], 4);
        v[262] = (v[11] + (Heap.s(v[236], 32) * 4L)) & 4294967295L;
        v[263] = m.load(v[262], 4);
        v[264] = (v[11] + (Heap.s(v[258], 32) * 4L)) & 4294967295L;
        m.store(v[264], v[263], 4);
        v[265] = ((v[212] + 1L)) & 4294967295L;
        v[266] = v[265] == 16L ? 1L : 0L;
        return v[266] != 0 ? 19 : 16;
    }

    private static int b19(Heap m, long[] v, int previous) {
        return -1;
    }
}
