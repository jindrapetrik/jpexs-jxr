package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: BufferCalcIFDSize.
 */
public final class F0236_BufferCalcIFDSize {

    private F0236_BufferCalcIFDSize() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[158];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                    default:
                        throw new IllegalStateException("Invalid block in BufferCalcIFDSize");
                }
                previous = old;
                if (pc < 0) {
                    return v[157];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = m.stack(4L * 1L, 4);
        v[6] = m.stack(4L * 1L, 4);
        v[7] = m.stack(4L * 1L, 4);
        m.store(v[5], 0L, 4);
        m.store(v[6], 0L, 4);
        m.store(v[7], 0L, 4);
        m.store(v[4], 0L, 4);
        v[8] = v[3] == 73L ? 1L : 0L;
        v[9] = ((v[2] + 2L)) & 4294967295L;
        v[10] = v[9] > v[1] ? 1L : 0L;
        return v[8] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        return v[10] != 0 ? 24 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = (v[0] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        v[12] = m.load(v[11], 2);
        return 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[10] != 0 ? 24 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[13] = (v[0] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        v[14] = (v[13] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[15] = m.load(v[14], 1);
        v[16] = (v[15]) & 65535L;
        v[17] = m.load(v[13], 1);
        v[18] = (v[17]) & 65535L;
        v[19] = ((v[18] << 8L)) & 65535L;
        v[20] = ((v[19] | v[16])) & 65535L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi21 = (previous == 4 ? v[20] : v[12]);
        v[21] = phi21;
        v[22] = (v[21]) & 4294967295L;
        v[23] = m.load(10048L, 4);
        v[24] = ((v[23] * v[22])) & 4294967295L;
        v[25] = ((v[24] + 6L)) & 4294967295L;
        v[26] = (v[0] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[27] = (v[0] + (Heap.s(8L, 32) * 1L)) & 4294967295L;
        v[28] = v[21] == 0L ? 1L : 0L;
        return v[28] != 0 ? 23 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi29 = (previous == 21 ? v[128] : v[25]);
        long phi30 = (previous == 21 ? v[129] : v[9]);
        long phi31 = (previous == 21 ? v[130] : 0L);
        v[29] = phi29;
        v[30] = phi30;
        v[31] = phi31;
        v[32] = ((v[30] + 2L)) & 4294967295L;
        v[33] = v[32] > v[1] ? 1L : 0L;
        return v[8] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        return v[33] != 0 ? 24 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        return v[33] != 0 ? 24 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[34] = (v[0] + (Heap.s(v[30], 32) * 1L)) & 4294967295L;
        v[35] = m.load(v[34], 2);
        v[36] = ((v[30] + 4L)) & 4294967295L;
        v[37] = v[36] > v[1] ? 1L : 0L;
        return v[37] != 0 ? 24 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[38] = (v[0] + (Heap.s(v[30], 32) * 1L)) & 4294967295L;
        v[39] = (v[38] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[40] = m.load(v[39], 1);
        v[41] = (v[40]) & 65535L;
        v[42] = m.load(v[38], 1);
        v[43] = (v[42]) & 65535L;
        v[44] = ((v[43] << 8L)) & 65535L;
        v[45] = ((v[44] | v[41])) & 65535L;
        v[46] = ((v[30] + 4L)) & 4294967295L;
        v[47] = v[46] > v[1] ? 1L : 0L;
        return v[47] != 0 ? 24 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[48] = ((v[30] + 8L)) & 4294967295L;
        v[49] = v[48] > v[1] ? 1L : 0L;
        v[50] = ((v[30] + 12L)) & 4294967295L;
        v[51] = v[50] > v[1] ? 1L : 0L;
        v[52] = ((v[49] | v[51])) & 1L;
        return v[52] != 0 ? 24 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[53] = ((v[30] + 8L)) & 4294967295L;
        v[54] = v[53] > v[1] ? 1L : 0L;
        v[55] = ((v[30] + 12L)) & 4294967295L;
        v[56] = v[55] > v[1] ? 1L : 0L;
        v[57] = ((v[54] | v[56])) & 1L;
        return v[57] != 0 ? 24 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[58] = (v[0] + (Heap.s(v[32], 32) * 1L)) & 4294967295L;
        v[59] = m.load(v[58], 2);
        v[60] = (v[26] + (Heap.s(v[30], 32) * 1L)) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = (v[27] + (Heap.s(v[30], 32) * 1L)) & 4294967295L;
        v[63] = m.load(v[62], 4);
        return 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[64] = (v[0] + (Heap.s(v[32], 32) * 1L)) & 4294967295L;
        v[65] = m.load(v[64], 1);
        v[66] = (v[65]) & 65535L;
        v[67] = ((v[66] << 8L)) & 65535L;
        v[68] = (v[64] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[69] = m.load(v[68], 1);
        v[70] = (v[69]) & 65535L;
        v[71] = ((v[67] | v[70])) & 65535L;
        v[72] = (v[38] + (Heap.s(6L, 32) * 1L)) & 4294967295L;
        v[73] = m.load(v[72], 1);
        v[74] = (v[73]) & 4294967295L;
        v[75] = ((v[74] << 8L)) & 4294967295L;
        v[76] = (v[38] + (Heap.s(7L, 32) * 1L)) & 4294967295L;
        v[77] = m.load(v[76], 1);
        v[78] = (v[77]) & 4294967295L;
        v[79] = ((v[75] | v[78])) & 4294967295L;
        v[80] = (v[38] + (Heap.s(5L, 32) * 1L)) & 4294967295L;
        v[81] = m.load(v[80], 1);
        v[82] = (v[81]) & 4294967295L;
        v[83] = ((v[82] << 16L)) & 4294967295L;
        v[84] = ((v[79] | v[83])) & 4294967295L;
        v[85] = (v[38] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[86] = m.load(v[85], 1);
        v[87] = (v[86]) & 4294967295L;
        v[88] = ((v[87] << 24L)) & 4294967295L;
        v[89] = ((v[84] | v[88])) & 4294967295L;
        v[90] = (v[38] + (Heap.s(8L, 32) * 1L)) & 4294967295L;
        v[91] = (v[38] + (Heap.s(11L, 32) * 1L)) & 4294967295L;
        v[92] = m.load(v[91], 1);
        v[93] = (v[92]) & 4294967295L;
        v[94] = (v[38] + (Heap.s(10L, 32) * 1L)) & 4294967295L;
        v[95] = m.load(v[94], 1);
        v[96] = (v[95]) & 4294967295L;
        v[97] = ((v[96] << 8L)) & 4294967295L;
        v[98] = ((v[97] | v[93])) & 4294967295L;
        v[99] = (v[38] + (Heap.s(9L, 32) * 1L)) & 4294967295L;
        v[100] = m.load(v[99], 1);
        v[101] = (v[100]) & 4294967295L;
        v[102] = ((v[101] << 16L)) & 4294967295L;
        v[103] = ((v[98] | v[102])) & 4294967295L;
        v[104] = m.load(v[90], 1);
        v[105] = (v[104]) & 4294967295L;
        v[106] = ((v[105] << 24L)) & 4294967295L;
        v[107] = ((v[103] | v[106])) & 4294967295L;
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi108 = (previous == 14 ? v[89] : v[61]);
        long phi109 = (previous == 14 ? v[45] : v[35]);
        long phi110 = (previous == 14 ? v[71] : v[59]);
        long phi111 = (previous == 14 ? v[107] : v[63]);
        v[108] = phi108;
        v[109] = phi109;
        v[110] = phi110;
        v[111] = phi111;
        v[112] = (v[110]) & 4294967295L;
        v[113] = ((v[110] + 65523L)) & 65535L;
        v[114] = v[113] < 65524L ? 1L : 0L;
        return v[114] != 0 ? 24 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        switch ((int) v[109]) {
            case 34665:
                return 17;
            case 34853:
                return 18;
            case 40965:
                return 19;
            default:
                return 20;
        }
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[115] = F0236_BufferCalcIFDSize.run(m, v[0], v[1], v[111], v[3], v[5]);
        v[116] = Heap.s(v[115], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[116] != 0 ? 24 : 21;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[117] = F0236_BufferCalcIFDSize.run(m, v[0], v[1], v[111], v[3], v[6]);
        v[118] = Heap.s(v[117], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[118] != 0 ? 24 : 21;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[119] = F0236_BufferCalcIFDSize.run(m, v[0], v[1], v[111], v[3], v[7]);
        v[120] = Heap.s(v[119], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[120] != 0 ? 24 : 21;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[121] = (10064L + (Heap.s(0L, 32) * 52L) + (Heap.s(v[112], 32) * 4L)) & 4294967295L;
        v[122] = m.load(v[121], 4);
        v[123] = ((v[122] * v[108])) & 4294967295L;
        v[124] = v[123] > 4L ? 1L : 0L;
        v[125] = v[124] != 0 ? v[123] : 0L;
        v[126] = ((v[125] + v[29])) & 4294967295L;
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi127 = (previous == 17 ? v[115] : (previous == 18 ? v[117] : (previous == 19 ? v[119] : 0L)));
        long phi128 = (previous == 17 ? v[29] : (previous == 18 ? v[29] : (previous == 19 ? v[29] : v[126])));
        v[127] = phi127;
        v[128] = phi128;
        v[129] = ((v[30] + v[23])) & 4294967295L;
        v[130] = ((v[31] + 1L)) & 65535L;
        v[131] = v[130] == v[21] ? 1L : 0L;
        return v[131] != 0 ? 22 : 6;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[132] = m.load(v[5], 4);
        v[133] = (v[132]) & 4294967295L;
        v[134] = m.load(v[6], 4);
        v[135] = (v[134]) & 4294967295L;
        v[136] = m.load(v[7], 4);
        v[137] = (v[136]) & 4294967295L;
        v[138] = v[133] == 0L ? 1L : 0L;
        v[139] = ((v[128] & 1L)) & 4294967295L;
        v[140] = ((v[133] + v[139])) & 4294967295L;
        v[141] = v[138] != 0 ? 0L : v[140];
        v[142] = ((v[141] + v[128])) & 4294967295L;
        v[143] = v[135] == 0L ? 1L : 0L;
        v[144] = ((v[142] & 1L)) & 4294967295L;
        v[145] = ((v[144] + v[135])) & 4294967295L;
        v[146] = v[143] != 0 ? 0L : v[145];
        v[147] = ((v[146] + v[142])) & 4294967295L;
        v[148] = v[137] == 0L ? 1L : 0L;
        v[149] = ((v[147] & 1L)) & 4294967295L;
        v[150] = ((v[149] + v[137])) & 4294967295L;
        v[151] = v[148] != 0 ? 0L : v[150];
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi152 = (previous == 5 ? v[25] : v[147]);
        long phi153 = (previous == 5 ? 0L : v[127]);
        long phi154 = (previous == 5 ? 0L : v[151]);
        v[152] = phi152;
        v[153] = phi153;
        v[154] = phi154;
        v[155] = ((v[154] + v[152])) & 4294967295L;
        m.store(v[4], v[155], 4);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi156 = (previous == 23 ? v[153] : (previous == 1 ? 4294967193L : (previous == 3 ? 4294967193L : (previous == 12 ? 4294967193L : (previous == 11 ? 4294967193L : (previous == 10 ? 4294967193L : (previous == 9 ? 4294967193L : (previous == 8 ? 4294967193L : (previous == 7 ? 4294967193L : (previous == 15 ? 4294967295L : (previous == 17 ? v[115] : (previous == 18 ? v[117] : v[119]))))))))))));
        v[156] = phi156;
        v[157] = v[156];
        return -1;
    }
}
