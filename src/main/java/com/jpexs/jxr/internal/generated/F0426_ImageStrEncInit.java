package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ImageStrEncInit.
 */
public final class F0426_ImageStrEncInit {

    private F0426_ImageStrEncInit() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[183];
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
                    default:
                        throw new IllegalStateException("Invalid block in ImageStrEncInit");
                }
                previous = old;
                if (pc < 0) {
                    return v[182];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = F0425_ValidateArgs.run(m, v[0], v[1]);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 1 : 17;
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[2], 0L, 4);
        v[5] = (v[1] + (Heap.s(0L, 32) * 32860L) + 20L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (13232L + (Heap.s(0L, 32) * 8L) + (Heap.s(v[6], 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = (13248L + (Heap.s(0L, 32) * 36L) + (Heap.s(v[10], 32) * 4L)) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[8] << 4L)) & 4294967295L;
        v[14] = ((v[8] << 8L)) & 4294967295L;
        v[15] = ((v[12] * v[13])) & 4294967295L;
        v[16] = m.load(v[0], 4);
        v[17] = ((v[16] + 15L)) & 4294967295L;
        v[18] = ((v[17] >>> 4L)) & 4294967295L;
        v[19] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = ((v[20] + 4294967295L)) & 4294967295L;
        v[22] = ((v[21] * v[15])) & 4294967295L;
        v[23] = ((v[22] + v[14])) & 4294967295L;
        v[24] = ((v[17] >>> 19L)) & 4294967295L;
        v[25] = ((v[23] * v[24])) & 4294967295L;
        v[26] = v[25] < 65536L ? 1L : 0L;
        return v[26] != 0 ? 2 : 17;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[27] = ((v[18] << 1L)) & 4294967295L;
        v[28] = ((v[27] * v[23])) & 4294967295L;
        v[29] = ((v[28] + 59798L)) & 4294967295L;
        v[30] = LibC.call(m, "malloc", new long[]{v[29]});
        v[31] = v[30] == 0L ? 1L : 0L;
        return v[31] != 0 ? 17 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[32] = LibC.call(m, "memset", new long[]{v[30], 0L, v[29]});
        v[33] = (v[30] + (Heap.s(35064L, 32) * 1L)) & 4294967295L;
        v[34] = m.load(v[9], 4);
        v[35] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        m.store(v[35], v[34], 4);
        v[36] = (v[1] + (Heap.s(0L, 32) * 32860L) + 36L) & 4294967295L;
        v[37] = m.load(v[36], 1);
        v[38] = v[37] == 3L ? 1L : 0L;
        v[39] = (v[38]) & 4294967295L;
        v[40] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34120L + 16L) & 4294967295L;
        m.store(v[40], v[39], 4);
        v[41] = m.load(v[19], 4);
        v[42] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        m.store(v[42], v[41], 4);
        v[43] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34120L + 52L) & 4294967295L;
        m.store(v[43], 0L, 4);
        v[44] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34120L + 44L) & 4294967295L;
        m.store(v[44], 0L, 4);
        v[45] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34120L + 48L) & 4294967295L;
        m.store(v[45], 0L, 4);
        v[46] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34120L + 40L) & 4294967295L;
        m.store(v[46], 0L, 4);
        v[47] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34340L) & 4294967295L;
        m.store(v[47], v[8], 4);
        v[48] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34244L) & 4294967295L;
        m.store(v[48], 0L, 4);
        v[49] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34120L + 56L) & 4294967295L;
        m.store(v[49], 0L, 4);
        m.store(v[30], 35064L, 4);
        v[50] = (v[30] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[50], v[0], 72L, 0L});
        v[51] = (v[30] + (Heap.s(0L, 32) * 35064L) + 76L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[51], v[1], 32860L, 0L});
        v[52] = (v[30] + (Heap.s(0L, 32) * 35064L) + 76L + 32833L) & 4294967295L;
        v[53] = m.load(v[52], 1);
        v[54] = v[53] == 0L ? 1L : 0L;
        v[55] = ((v[53] ^ 128L)) & 255L;
        v[56] = v[54] != 0 ? 4L : v[55];
        m.store(v[52], v[56], 1);
        v[57] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        m.store(v[57], 0L, 4);
        v[58] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        m.store(v[58], 0L, 4);
        v[59] = m.load(v[50], 4);
        v[60] = ((v[59] + 15L)) & 4294967295L;
        v[61] = ((v[60] >>> 4L)) & 4294967295L;
        v[62] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        m.store(v[62], v[61], 4);
        v[63] = (v[30] + (Heap.s(0L, 32) * 35064L) + 4L + 4L) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = ((v[64] + 15L)) & 4294967295L;
        v[66] = ((v[65] >>> 4L)) & 4294967295L;
        v[67] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        m.store(v[67], v[66], 4);
        v[68] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34408L) & 4294967295L;
        m.store(v[68], 1879048619L, 4);
        v[69] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34420L) & 4294967295L;
        m.store(v[69], 1879048676L, 4);
        v[70] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34424L) & 4294967295L;
        m.store(v[70], 1879048603L, 4);
        v[71] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34428L) & 4294967295L;
        m.store(v[71], 1879048603L, 4);
        v[72] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34432L) & 4294967295L;
        m.store(v[72], 1879048603L, 4);
        v[73] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34436L) & 4294967295L;
        m.store(v[73], 1879048603L, 4);
        v[74] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34440L) & 4294967295L;
        m.store(v[74], 1879048603L, 4);
        v[75] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34444L) & 4294967295L;
        m.store(v[75], 1879048603L, 4);
        v[76] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34448L) & 4294967295L;
        m.store(v[76], 1879048603L, 4);
        v[77] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34452L) & 4294967295L;
        m.store(v[77], 1879048603L, 4);
        v[78] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34456L) & 4294967295L;
        m.store(v[78], 1879048603L, 4);
        v[79] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        m.store(v[79], 0L, 4);
        v[80] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        m.store(v[80], 0L, 4);
        v[81] = (v[33]) & 4294967295L;
        v[82] = ((v[81] + 127L)) & 4294967295L;
        v[83] = ((v[82] & 4294967168L)) & 4294967295L;
        v[84] = v[41] == 0L ? 1L : 0L;
        return v[84] != 0 ? 11 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[85] = (v[83]) & 4294967295L;
        v[86] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        m.store(v[86], v[85], 4);
        v[87] = ((v[14] * v[61])) & 4294967295L;
        v[88] = (v[85] + (Heap.s(v[87], 32) * 1L)) & 4294967295L;
        v[89] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        m.store(v[89], v[88], 4);
        v[90] = (v[88] + (Heap.s(v[87], 32) * 1L)) & 4294967295L;
        v[91] = v[41] == 1L ? 1L : 0L;
        return v[91] != 0 ? 10 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[92] = ((v[15] * v[61])) & 4294967295L;
        v[93] = ((v[41] + 4294967295L)) & 4294967295L;
        v[94] = ((v[41] + 4294967294L)) & 4294967295L;
        v[95] = ((v[93] & 3L)) & 4294967295L;
        v[96] = v[94] < 3L ? 1L : 0L;
        return v[96] != 0 ? 8 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[97] = ((v[93] & 4294967292L)) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi98 = (previous == 6 ? v[90] : v[119]);
        long phi99 = (previous == 6 ? 1L : v[120]);
        long phi100 = (previous == 6 ? 0L : v[121]);
        v[98] = phi98;
        v[99] = phi99;
        v[100] = phi100;
        v[101] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[99], 32) * 4L)) & 4294967295L;
        m.store(v[101], v[98], 4);
        v[102] = (v[98] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[103] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[99], 32) * 4L)) & 4294967295L;
        m.store(v[103], v[102], 4);
        v[104] = (v[102] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[105] = ((v[99] + 1L)) & 4294967295L;
        v[106] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        m.store(v[106], v[104], 4);
        v[107] = (v[104] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[108] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[105], 32) * 4L)) & 4294967295L;
        m.store(v[108], v[107], 4);
        v[109] = (v[107] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[110] = ((v[99] + 2L)) & 4294967295L;
        v[111] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[110], 32) * 4L)) & 4294967295L;
        m.store(v[111], v[109], 4);
        v[112] = (v[109] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[113] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[110], 32) * 4L)) & 4294967295L;
        m.store(v[113], v[112], 4);
        v[114] = (v[112] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[115] = ((v[99] + 3L)) & 4294967295L;
        v[116] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[115], 32) * 4L)) & 4294967295L;
        m.store(v[116], v[114], 4);
        v[117] = (v[114] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[118] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[115], 32) * 4L)) & 4294967295L;
        m.store(v[118], v[117], 4);
        v[119] = (v[117] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[120] = ((v[99] + 4L)) & 4294967295L;
        v[121] = ((v[100] + 4L)) & 4294967295L;
        v[122] = v[121] == v[97] ? 1L : 0L;
        return v[122] != 0 ? 8 : 7;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi123 = (previous == 5 ? 0L : v[119]);
        long phi124 = (previous == 5 ? v[90] : v[119]);
        long phi125 = (previous == 5 ? 1L : v[120]);
        v[123] = phi123;
        v[124] = phi124;
        v[125] = phi125;
        v[126] = v[95] == 0L ? 1L : 0L;
        return v[126] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi127 = (previous == 9 ? v[133] : v[124]);
        long phi128 = (previous == 9 ? v[134] : v[125]);
        long phi129 = (previous == 9 ? v[135] : 0L);
        v[127] = phi127;
        v[128] = phi128;
        v[129] = phi129;
        v[130] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[128], 32) * 4L)) & 4294967295L;
        m.store(v[130], v[127], 4);
        v[131] = (v[127] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[132] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[128], 32) * 4L)) & 4294967295L;
        m.store(v[132], v[131], 4);
        v[133] = (v[131] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        v[134] = ((v[128] + 1L)) & 4294967295L;
        v[135] = ((v[129] + 1L)) & 4294967295L;
        v[136] = v[135] == v[95] ? 1L : 0L;
        return v[136] != 0 ? 10 : 9;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi137 = (previous == 4 ? v[90] : (previous == 8 ? v[123] : v[133]));
        v[137] = phi137;
        v[138] = (v[137]) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi139 = (previous == 3 ? v[83] : v[138]);
        v[139] = phi139;
        v[140] = ((v[139] + 16383L)) & 4294967295L;
        v[141] = ((v[140] & 4294950912L)) & 4294967295L;
        v[142] = (v[141]) & 4294967295L;
        v[143] = (v[142] + (Heap.s(8192L, 32) * 1L)) & 4294967295L;
        v[144] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        m.store(v[144], v[143], 4);
        v[145] = F0422_StrEncInit.run(m, v[30]);
        v[146] = v[145] == 0L ? 1L : 0L;
        return v[146] != 0 ? 12 : 17;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[147] = m.load(v[40], 4);
        v[148] = v[147] == 0L ? 1L : 0L;
        return v[148] != 0 ? 15 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[149] = ((v[8] << 9L)) & 4294967295L;
        v[150] = ((v[149] * v[18])) & 4294967295L;
        v[151] = ((v[150] + 35191L)) & 4294967295L;
        v[152] = LibC.call(m, "malloc", new long[]{v[151]});
        v[153] = v[152] == 0L ? 1L : 0L;
        return v[153] != 0 ? 17 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[154] = LibC.call(m, "memset", new long[]{v[152], 0L, v[151]});
        v[155] = (v[152] + (Heap.s(35064L, 32) * 1L)) & 4294967295L;
        v[156] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        m.store(v[156], 0L, 4);
        v[157] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        m.store(v[157], 1L, 4);
        v[158] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34120L + 16L) & 4294967295L;
        m.store(v[158], 1L, 4);
        v[159] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34340L) & 4294967295L;
        m.store(v[159], v[8], 4);
        F0428_InitializeStrEnc.run(m, v[152], v[0], v[1]);
        v[160] = (v[155]) & 4294967295L;
        v[161] = ((v[160] + 127L)) & 4294967295L;
        v[162] = ((v[161] & 4294967168L)) & 4294967295L;
        v[163] = (v[162]) & 4294967295L;
        v[164] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34524L) & 4294967295L;
        m.store(v[164], v[163], 4);
        v[165] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[166] = m.load(v[165], 4);
        v[167] = ((v[166] * v[14])) & 4294967295L;
        v[168] = (v[163] + (Heap.s(v[167], 32) * 1L)) & 4294967295L;
        v[169] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34588L) & 4294967295L;
        m.store(v[169], v[168], 4);
        v[170] = m.load(v[144], 4);
        v[171] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        m.store(v[171], v[170], 4);
        v[172] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        m.store(v[172], v[30], 4);
        v[173] = (v[152] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        m.store(v[173], 1L, 4);
        v[174] = F0422_StrEncInit.run(m, v[152]);
        v[175] = F0420_WriteImagePlaneHeader.run(m, v[152]);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi176 = (previous == 14 ? v[152] : 0L);
        v[176] = phi176;
        m.store(v[79], v[176], 4);
        m.store(v[2], v[30], 4);
        v[177] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        v[178] = m.load(v[177], 4);
        v[179] = v[178] == 0L ? 1L : 0L;
        return v[179] != 0 ? 16 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[180] = m.load(v[144], 4);
        F0361_fillToByte.run(m, v[180]);
        F0297_putBit16.run(m, v[180], 4L, 16L);
        F0297_putBit16.run(m, v[180], 111L, 8L);
        F0297_putBit16.run(m, v[180], 255L, 8L);
        F0297_putBit16.run(m, v[180], 1L, 16L);
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi181 = (previous == 1 ? 4294967295L : (previous == 13 ? 4294967295L : (previous == 11 ? 4294967295L : (previous == 2 ? 4294967295L : (previous == 0 ? 4294967295L : (previous == 15 ? 0L : 0L))))));
        v[181] = phi181;
        v[182] = v[181];
        return -1;
    }
}
