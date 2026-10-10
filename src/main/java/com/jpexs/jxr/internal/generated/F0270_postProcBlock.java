package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: postProcBlock.
 */
public final class F0270_postProcBlock {

    private F0270_postProcBlock() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4, long a5) {
        long[] v = new long[199];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
        v[5] = a5;
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
                    default:
                        throw new IllegalStateException("Invalid block in postProcBlock");
                }
                previous = old;
                if (pc < 0) {
                    return v[198];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[6] = m.stack(100L * 1L, 4);
        v[7] = m.stack(25L * 1L, 1);
        v[8] = (v[0] + (Heap.s(v[4], 32) * 8L)) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[9] + (Heap.s(v[3], 32) * 88L)) & 4294967295L;
        v[11] = (v[0] + (Heap.s(v[4], 32) * 8L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = (v[12] + (Heap.s(v[3], 32) * 88L)) & 4294967295L;
        v[14] = (v[13] + (Heap.s(4294967295L, 32) * 88L) + 8L) & 4294967295L;
        v[15] = (v[13] + (Heap.s(4294967295L, 32) * 88L) + 72L) & 4294967295L;
        return 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi16 = (previous == 0 ? 0L : v[53]);
        v[16] = phi16;
        v[17] = (v[10] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(v[16], 32) * 16L) + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[16], 32) * 20L) + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        m.store(v[19], v[18], 4);
        v[20] = (v[10] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(v[16], 32) * 4L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        v[21] = m.load(v[20], 1);
        v[22] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(v[16], 32) * 5L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        m.store(v[22], v[21], 1);
        v[23] = (v[10] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(v[16], 32) * 16L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[16], 32) * 20L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        m.store(v[25], v[24], 4);
        v[26] = (v[10] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(v[16], 32) * 4L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[27] = m.load(v[26], 1);
        v[28] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(v[16], 32) * 5L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[28], v[27], 1);
        v[29] = (v[10] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(v[16], 32) * 16L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[16], 32) * 20L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = (v[10] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(v[16], 32) * 4L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        v[33] = m.load(v[32], 1);
        v[34] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(v[16], 32) * 5L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[34], v[33], 1);
        v[35] = (v[10] + (Heap.s(4294967295L, 32) * 88L) + 8L + (Heap.s(v[16], 32) * 16L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[16], 32) * 20L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[37], v[36], 4);
        v[38] = (v[10] + (Heap.s(4294967295L, 32) * 88L) + 72L + (Heap.s(v[16], 32) * 4L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        v[39] = m.load(v[38], 1);
        v[40] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(v[16], 32) * 5L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[40], v[39], 1);
        v[41] = (v[14] + (Heap.s(0L, 32) * 16L) + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(4L, 32) * 20L) + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        m.store(v[43], v[42], 4);
        v[44] = (v[15] + (Heap.s(0L, 32) * 4L) + (Heap.s(v[16], 32) * 1L)) & 4294967295L;
        v[45] = m.load(v[44], 1);
        v[46] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(4L, 32) * 5L) + (Heap.s(v[16], 32) * 1L)) & 4294967295L;
        m.store(v[46], v[45], 1);
        v[47] = (v[9] + (Heap.s(v[3], 32) * 88L) + 8L + (Heap.s(v[16], 32) * 16L)) & 4294967295L;
        v[48] = m.load(v[47], 4);
        v[49] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[16], 32) * 20L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[49], v[48], 4);
        v[50] = (v[9] + (Heap.s(v[3], 32) * 88L) + 72L + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        v[51] = m.load(v[50], 1);
        v[52] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(v[16], 32) * 5L) + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        m.store(v[52], v[51], 1);
        v[53] = ((v[16] + 1L)) & 4294967295L;
        v[54] = v[53] == 4L ? 1L : 0L;
        return v[54] != 0 ? 2 : 1;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[55] = (v[12] + (Heap.s(v[3], 32) * 88L) + 8L) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(4L, 32) * 20L) + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        m.store(v[57], v[56], 4);
        v[58] = (v[12] + (Heap.s(v[3], 32) * 88L) + 72L) & 4294967295L;
        v[59] = m.load(v[58], 1);
        v[60] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(4L, 32) * 5L) + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        m.store(v[60], v[59], 1);
        v[61] = (v[1] + (Heap.s(4294967040L, 32) * 4L)) & 4294967295L;
        v[62] = (v[2] + (Heap.s(4294967040L, 32) * 4L)) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi63 = (previous == 2 ? 0L : v[66]);
        v[63] = phi63;
        v[64] = ((v[63] << 4L)) & 4294967295L;
        v[65] = (v[61] + (Heap.s(v[64], 32) * 4L)) & 4294967295L;
        v[66] = ((v[63] + 1L)) & 4294967295L;
        v[67] = v[63] == 3L ? 1L : 0L;
        v[68] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(v[63], 32) * 5L) + (Heap.s(0L, 32) * 1L)) & 4294967295L;
        v[69] = m.load(v[68], 1);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi70 = (previous == 3 ? v[69] : v[138]);
        long phi71 = (previous == 3 ? 0L : v[136]);
        v[70] = phi70;
        v[71] = phi71;
        v[72] = ((v[71] << 6L)) & 4294967295L;
        v[73] = (v[65] + (Heap.s(v[72], 32) * 4L)) & 4294967295L;
        v[74] = (v[70]) & 4294967295L;
        v[75] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(v[66], 32) * 5L) + (Heap.s(v[71], 32) * 1L)) & 4294967295L;
        v[76] = m.load(v[75], 1);
        v[77] = (v[76]) & 4294967295L;
        v[78] = ((v[77] + v[74])) & 4294967295L;
        v[79] = v[78] < 3L ? 1L : 0L;
        return v[79] != 0 ? 5 : 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[80] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[63], 32) * 20L) + (Heap.s(v[71], 32) * 4L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[66], 32) * 20L) + (Heap.s(v[71], 32) * 4L)) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = ((v[81] - v[83])) & 4294967295L;
        v[85] = LibC.call(m, "abs", new long[]{v[84]});
        v[86] = Heap.s(v[85], 32) > Heap.s(v[5], 32) ? 1L : 0L;
        return v[86] != 0 ? 8 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[87] = (v[73] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[88] = (v[62] + (Heap.s(v[72], 32) * 4L)) & 4294967295L;
        v[89] = v[67] != 0 ? v[88] : v[87];
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi90 = (previous == 6 ? 0L : v[134]);
        v[90] = phi90;
        v[91] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(1L, 32) * 16L) + (Heap.s(v[90], 32) * 1L)) & 4294967295L;
        v[92] = m.load(v[91], 1);
        v[93] = (v[92]) & 4294967295L;
        v[94] = (v[73] + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        v[95] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(2L, 32) * 16L) + (Heap.s(v[90], 32) * 1L)) & 4294967295L;
        v[96] = m.load(v[95], 1);
        v[97] = (v[96]) & 4294967295L;
        v[98] = (v[73] + (Heap.s(v[97], 32) * 4L)) & 4294967295L;
        v[99] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(3L, 32) * 16L) + (Heap.s(v[90], 32) * 1L)) & 4294967295L;
        v[100] = m.load(v[99], 1);
        v[101] = (v[100]) & 4294967295L;
        v[102] = (v[73] + (Heap.s(v[101], 32) * 4L)) & 4294967295L;
        v[103] = (13296L + (Heap.s(0L, 32) * 16L) + (Heap.s(v[90], 32) * 1L)) & 4294967295L;
        v[104] = m.load(v[103], 1);
        v[105] = (v[104]) & 4294967295L;
        v[106] = (v[89] + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        v[107] = (v[89] + (Heap.s(v[93], 32) * 4L)) & 4294967295L;
        v[108] = (v[89] + (Heap.s(v[97], 32) * 4L)) & 4294967295L;
        v[109] = m.load(v[106], 4);
        v[110] = m.load(v[102], 4);
        v[111] = ((v[109] - v[110])) & 4294967295L;
        v[112] = ((v[111] << 2L)) & 4294967295L;
        v[113] = m.load(v[98], 4);
        v[114] = m.load(v[107], 4);
        v[115] = ((v[113] - v[114])) & 4294967295L;
        v[116] = ((v[115] + v[112])) & 4294967295L;
        v[117] = ((Heap.s(v[116], 32) >> 3L)) & 4294967295L;
        v[118] = ((v[109] - v[117])) & 4294967295L;
        m.store(v[106], v[118], 4);
        v[119] = m.load(v[102], 4);
        v[120] = ((v[117] + v[119])) & 4294967295L;
        m.store(v[102], v[120], 4);
        v[121] = m.load(v[98], 4);
        v[122] = ((Heap.s(v[121], 32) >> 1L)) & 4294967295L;
        v[123] = m.load(v[94], 4);
        v[124] = ((v[123] + v[120])) & 4294967295L;
        v[125] = ((Heap.s(v[124], 32) >> 2L)) & 4294967295L;
        v[126] = ((v[125] + v[122])) & 4294967295L;
        m.store(v[98], v[126], 4);
        v[127] = m.load(v[107], 4);
        v[128] = ((Heap.s(v[127], 32) >> 1L)) & 4294967295L;
        v[129] = m.load(v[106], 4);
        v[130] = m.load(v[108], 4);
        v[131] = ((v[130] + v[129])) & 4294967295L;
        v[132] = ((Heap.s(v[131], 32) >> 2L)) & 4294967295L;
        v[133] = ((v[132] + v[128])) & 4294967295L;
        m.store(v[107], v[133], 4);
        v[134] = ((v[90] + 1L)) & 4294967295L;
        v[135] = v[134] == 4L ? 1L : 0L;
        return v[135] != 0 ? 8 : 7;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[136] = ((v[71] + 1L)) & 4294967295L;
        v[137] = (v[7] + (Heap.s(0L, 32) * 25L) + (Heap.s(v[63], 32) * 5L) + (Heap.s(v[136], 32) * 1L)) & 4294967295L;
        v[138] = m.load(v[137], 1);
        v[139] = (v[138]) & 4294967295L;
        v[140] = ((v[139] + v[74])) & 4294967295L;
        v[141] = v[140] < 3L ? 1L : 0L;
        return v[141] != 0 ? 9 : 12;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[142] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[63], 32) * 20L) + (Heap.s(v[71], 32) * 4L)) & 4294967295L;
        v[143] = m.load(v[142], 4);
        v[144] = (v[6] + (Heap.s(0L, 32) * 100L) + (Heap.s(v[63], 32) * 20L) + (Heap.s(v[136], 32) * 4L)) & 4294967295L;
        v[145] = m.load(v[144], 4);
        v[146] = ((v[143] - v[145])) & 4294967295L;
        v[147] = LibC.call(m, "abs", new long[]{v[146]});
        v[148] = Heap.s(v[147], 32) > Heap.s(v[5], 32) ? 1L : 0L;
        return v[148] != 0 ? 12 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[149] = (v[73] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi150 = (previous == 10 ? 0L : v[194]);
        v[150] = phi150;
        v[151] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[150], 32) * 16L)) & 4294967295L;
        v[152] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[150], 32) * 16L) + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[153] = m.load(v[152], 1);
        v[154] = (v[153]) & 4294967295L;
        v[155] = (v[73] + (Heap.s(v[154], 32) * 4L)) & 4294967295L;
        v[156] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[150], 32) * 16L) + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        v[157] = m.load(v[156], 1);
        v[158] = (v[157]) & 4294967295L;
        v[159] = (v[73] + (Heap.s(v[158], 32) * 4L)) & 4294967295L;
        v[160] = (13296L + (Heap.s(0L, 32) * 256L) + (Heap.s(v[150], 32) * 16L) + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        v[161] = m.load(v[160], 1);
        v[162] = (v[161]) & 4294967295L;
        v[163] = (v[73] + (Heap.s(v[162], 32) * 4L)) & 4294967295L;
        v[164] = m.load(v[151], 1);
        v[165] = (v[164]) & 4294967295L;
        v[166] = (v[149] + (Heap.s(v[165], 32) * 4L)) & 4294967295L;
        v[167] = (v[149] + (Heap.s(v[154], 32) * 4L)) & 4294967295L;
        v[168] = (v[149] + (Heap.s(v[158], 32) * 4L)) & 4294967295L;
        v[169] = m.load(v[166], 4);
        v[170] = m.load(v[163], 4);
        v[171] = ((v[169] - v[170])) & 4294967295L;
        v[172] = ((v[171] << 2L)) & 4294967295L;
        v[173] = m.load(v[159], 4);
        v[174] = m.load(v[167], 4);
        v[175] = ((v[173] - v[174])) & 4294967295L;
        v[176] = ((v[175] + v[172])) & 4294967295L;
        v[177] = ((Heap.s(v[176], 32) >> 3L)) & 4294967295L;
        v[178] = ((v[169] - v[177])) & 4294967295L;
        m.store(v[166], v[178], 4);
        v[179] = m.load(v[163], 4);
        v[180] = ((v[177] + v[179])) & 4294967295L;
        m.store(v[163], v[180], 4);
        v[181] = m.load(v[159], 4);
        v[182] = ((Heap.s(v[181], 32) >> 1L)) & 4294967295L;
        v[183] = m.load(v[155], 4);
        v[184] = ((v[183] + v[180])) & 4294967295L;
        v[185] = ((Heap.s(v[184], 32) >> 2L)) & 4294967295L;
        v[186] = ((v[185] + v[182])) & 4294967295L;
        m.store(v[159], v[186], 4);
        v[187] = m.load(v[167], 4);
        v[188] = ((Heap.s(v[187], 32) >> 1L)) & 4294967295L;
        v[189] = m.load(v[166], 4);
        v[190] = m.load(v[168], 4);
        v[191] = ((v[190] + v[189])) & 4294967295L;
        v[192] = ((Heap.s(v[191], 32) >> 2L)) & 4294967295L;
        v[193] = ((v[192] + v[188])) & 4294967295L;
        m.store(v[167], v[193], 4);
        v[194] = ((v[150] + 1L)) & 4294967295L;
        v[195] = v[194] == 4L ? 1L : 0L;
        return v[195] != 0 ? 12 : 11;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[196] = v[136] == 4L ? 1L : 0L;
        return v[196] != 0 ? 13 : 4;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[197] = v[66] == 4L ? 1L : 0L;
        return v[197] != 0 ? 14 : 3;
    }

    private static int b14(Heap m, long[] v, int previous) {
        return -1;
    }
}
