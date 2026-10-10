package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: processMacroblockDec.
 */
public final class F0380_processMacroblockDec {

    private F0380_processMacroblockDec() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[166];
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
                    default:
                        throw new IllegalStateException("Invalid block in processMacroblockDec");
                }
                previous = old;
                if (pc < 0) {
                    return v[165];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 24L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = v[4] == v[6] ? 1L : 0L;
        return v[7] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = v[9] == v[11] ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi13 = (previous == 0 ? 1L : v[12]);
        v[13] = phi13;
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = v[15] != 0L ? 1L : 0L;
        v[17] = v[2] == 0L ? 1L : 0L;
        v[18] = v[2] == 1L ? 1L : 0L;
        v[19] = v[18] != 0 ? 2L : 10L;
        v[20] = v[17] != 0 ? 0L : v[19];
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi21 = (previous == 2 ? v[0] : v[158]);
        long phi22 = (previous == 2 ? 1L : 0L);
        v[21] = phi21;
        v[22] = phi22;
        return v[13] != 0 ? 23 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        F0300_getTilePos.run(m, v[21], v[24], v[26]);
        v[27] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        return v[16] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[29] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        m.store(v[31], v[28], 4);
        v[32] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = (v[30] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        m.store(v[34], v[33], 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[35] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34308L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[38] = (v[36] + (Heap.s(v[28], 32) * 592L)) & 4294967295L;
        v[39] = F0379_readPackets.run(m, v[21]);
        v[40] = v[39] == 0L ? 1L : 0L;
        return v[40] != 0 ? 7 : 31;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[41] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = m.load(v[42], 4);
        v[44] = v[43] == 0L ? 1L : 0L;
        v[45] = m.load(v[23], 4);
        return v[44] != 0 ? 8 : 16;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[46] = m.load(v[37], 4);
        v[47] = (v[21] + (Heap.s(0L, 32) * 35064L) + 76L + 60L + (Heap.s(v[46], 32) * 4L)) & 4294967295L;
        v[48] = m.load(v[47], 4);
        v[49] = v[45] == v[48] ? 1L : 0L;
        return v[49] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[50] = (v[36] + (Heap.s(v[28], 32) * 592L) + 588L) & 4294967295L;
        v[51] = m.load(v[50], 4);
        return 15;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[52] = (v[42] + (Heap.s(0L, 32) * 48L) + 24L) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = (v[42] + (Heap.s(0L, 32) * 48L) + 36L) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[57] = m.load(v[56], 4);
        v[58] = (v[21] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L + (Heap.s(v[57], 32) * 4L)) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = ((v[59] << 4L)) & 4294967295L;
        v[61] = (v[21] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[62] = m.load(v[61], 4);
        v[63] = v[46] == v[62] ? 1L : 0L;
        v[64] = ((v[46] + 1L)) & 4294967295L;
        v[65] = (v[21] + (Heap.s(0L, 32) * 35064L) + 76L + 60L + (Heap.s(v[64], 32) * 4L)) & 4294967295L;
        v[66] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[67] = v[63] != 0 ? v[66] : v[65];
        v[68] = m.load(v[67], 4);
        v[69] = ((v[68] << 4L)) & 4294967295L;
        v[70] = ((v[69] | v[20])) & 4294967295L;
        v[71] = v[53] < v[70] ? 1L : 0L;
        return v[71] != 0 ? 11 : 14;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[72] = (v[21] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = v[57] == v[73] ? 1L : 0L;
        v[75] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        v[76] = ((v[57] + 1L)) & 4294967295L;
        v[77] = (v[21] + (Heap.s(0L, 32) * 35064L) + 76L + 16448L + (Heap.s(v[76], 32) * 4L)) & 4294967295L;
        v[78] = v[74] != 0 ? v[75] : v[77];
        v[79] = ((v[45] << 4L)) & 4294967295L;
        v[80] = (v[42] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = (v[42] + (Heap.s(0L, 32) * 48L) + 28L) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = m.load(v[78], 4);
        v[85] = ((v[84] << 4L)) & 4294967295L;
        v[86] = ((v[85] | v[20])) & 4294967295L;
        v[87] = v[81] >= v[86] ? 1L : 0L;
        v[88] = ((v[83] + v[20])) & 4294967295L;
        v[89] = v[79] > v[88] ? 1L : 0L;
        v[90] = v[87] != 0 ? 1L : v[89];
        return v[90] != 0 ? 14 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[91] = ((v[55] + v[20])) & 4294967295L;
        v[92] = v[60] > v[91] ? 1L : 0L;
        return v[92] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[93] = m.load(v[25], 4);
        v[94] = ((v[93] << 4L)) & 4294967295L;
        v[95] = v[94] > v[91] ? 1L : 0L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi96 = (previous == 12 ? 1L : (previous == 11 ? 1L : (previous == 10 ? 1L : v[95])));
        v[96] = phi96;
        v[97] = ((v[96] ^ 1L)) & 1L;
        v[98] = (v[97]) & 4294967295L;
        v[99] = (v[36] + (Heap.s(v[28], 32) * 592L) + 588L) & 4294967295L;
        m.store(v[99], v[98], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi100 = (previous == 9 ? v[51] : v[98]);
        v[100] = phi100;
        v[101] = v[100] == 0L ? 1L : 0L;
        return v[101] != 0 ? 23 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[102] = m.load(v[25], 4);
        v[103] = F0281_DecodeMacroblockDC.run(m, v[21], v[38], v[45], v[102]);
        v[104] = v[103] == 0L ? 1L : 0L;
        return v[104] != 0 ? 17 : 31;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[105] = m.load(v[41], 4);
        v[106] = (v[105] + (Heap.s(0L, 32) * 48L) + 20L) & 4294967295L;
        v[107] = m.load(v[106], 4);
        v[108] = v[107] == 0L ? 1L : 0L;
        return v[108] != 0 ? 19 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[109] = m.load(v[23], 4);
        v[110] = m.load(v[25], 4);
        v[111] = F0275_DecodeMacroblockLowpass.run(m, v[21], v[38], v[109], v[110]);
        v[112] = v[111] == 0L ? 1L : 0L;
        return v[112] != 0 ? 19 : 31;
    }

    private static int b19(Heap m, long[] v, int previous) {
        F0476_predDCACDec.run(m, v[21]);
        v[113] = F0475_dequantizeMacroblock.run(m, v[21]);
        v[114] = m.load(v[41], 4);
        v[115] = (v[114] + (Heap.s(0L, 32) * 48L) + 16L) & 4294967295L;
        v[116] = m.load(v[115], 4);
        v[117] = v[116] == 0L ? 1L : 0L;
        return v[117] != 0 ? 22 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[118] = m.load(v[23], 4);
        v[119] = m.load(v[25], 4);
        v[120] = F0282_DecodeMacroblockHighpass.run(m, v[21], v[38], v[118], v[119]);
        v[121] = v[120] == 0L ? 1L : 0L;
        return v[121] != 0 ? 21 : 31;
    }

    private static int b21(Heap m, long[] v, int previous) {
        F0477_predACDec.run(m, v[21]);
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[122] = (v[21] + (Heap.s(0L, 32) * 35064L) + 32960L) & 4294967295L;
        v[123] = m.load(v[23], 4);
        v[124] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[125] = m.load(v[124], 4);
        F0471_updatePredInfo.run(m, v[21], v[122], v[123], v[125]);
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[126] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        v[127] = m.load(v[126], 4);
        v[128] = m.load(v[127], 4);
        v[129] = v[128] == 0L ? 1L : 0L;
        return v[129] != 0 ? 24 : 28;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[130] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[131] = m.load(v[130], 4);
        v[132] = ((v[131] << 4L)) & 4294967295L;
        v[133] = (v[127] + (Heap.s(0L, 32) * 48L) + 28L) & 4294967295L;
        v[134] = m.load(v[133], 4);
        v[135] = ((v[134] + 25L)) & 4294967295L;
        v[136] = v[132] > v[135] ? 1L : 0L;
        return v[136] != 0 ? 29 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[137] = ((v[132] + 25L)) & 4294967295L;
        v[138] = (v[127] + (Heap.s(0L, 32) * 48L) + 24L) & 4294967295L;
        v[139] = m.load(v[138], 4);
        v[140] = v[137] < v[139] ? 1L : 0L;
        return v[140] != 0 ? 29 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[141] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[142] = m.load(v[141], 4);
        v[143] = ((v[142] << 4L)) & 4294967295L;
        v[144] = (v[127] + (Heap.s(0L, 32) * 48L) + 36L) & 4294967295L;
        v[145] = m.load(v[144], 4);
        v[146] = ((v[145] + 25L)) & 4294967295L;
        v[147] = v[143] > v[146] ? 1L : 0L;
        return v[147] != 0 ? 29 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[148] = ((v[143] + 25L)) & 4294967295L;
        v[149] = (v[127] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        v[150] = m.load(v[149], 4);
        v[151] = v[148] < v[150] ? 1L : 0L;
        return v[151] != 0 ? 29 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[152] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34412L) & 4294967295L;
        v[153] = m.load(v[152], 4);
        v[154] = Dispatch.call(m, v[153], new long[]{v[21]});
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        return v[16] != 0 ? 30 : 31;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[155] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[156] = m.load(v[155], 4);
        v[157] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[158] = m.load(v[157], 4);
        v[159] = (v[158] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        m.store(v[159], v[156], 4);
        v[160] = (v[21] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[161] = m.load(v[160], 4);
        v[162] = (v[158] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        m.store(v[162], v[161], 4);
        v[163] = ((v[22] & v[16])) & 1L;
        return v[163] != 0 ? 3 : 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        long phi164 = (previous == 30 ? 0L : (previous == 20 ? v[120] : (previous == 18 ? v[111] : (previous == 16 ? v[103] : (previous == 6 ? 4294967295L : 0L)))));
        v[164] = phi164;
        v[165] = v[164];
        return -1;
    }
}
