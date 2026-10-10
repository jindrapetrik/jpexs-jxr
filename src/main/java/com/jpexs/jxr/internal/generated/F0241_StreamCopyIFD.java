package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: StreamCopyIFD.
 */
public final class F0241_StreamCopyIFD {

    private F0241_StreamCopyIFD() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[302];
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
                    case 48:
                        pc = b48(m, v, previous);
                        break;
                    case 49:
                        pc = b49(m, v, previous);
                        break;
                    case 50:
                        pc = b50(m, v, previous);
                        break;
                    case 51:
                        pc = b51(m, v, previous);
                        break;
                    case 52:
                        pc = b52(m, v, previous);
                        break;
                    case 53:
                        pc = b53(m, v, previous);
                        break;
                    case 54:
                        pc = b54(m, v, previous);
                        break;
                    case 55:
                        pc = b55(m, v, previous);
                        break;
                    case 56:
                        pc = b56(m, v, previous);
                        break;
                    case 57:
                        pc = b57(m, v, previous);
                        break;
                    case 58:
                        pc = b58(m, v, previous);
                        break;
                    case 59:
                        pc = b59(m, v, previous);
                        break;
                    case 60:
                        pc = b60(m, v, previous);
                        break;
                    case 61:
                        pc = b61(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in StreamCopyIFD");
                }
                previous = old;
                if (pc < 0) {
                    return v[301];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = m.stack(1L * 1L, 1);
        v[6] = m.stack(1L * 1L, 1);
        v[7] = m.stack(1L * 1L, 1);
        v[8] = m.stack(1L * 1L, 1);
        v[9] = m.stack(1L * 1L, 1);
        v[10] = m.stack(4L * 1L, 4);
        v[11] = m.stack(4L * 1L, 4);
        m.store(v[10], 0L, 4);
        v[12] = m.load(v[4], 4);
        v[13] = (v[0] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = Dispatch.call(m, v[14], new long[]{v[0], v[10]});
        v[16] = Heap.s(v[15], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[16] != 0 ? 61 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[17] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = Dispatch.call(m, v[18], new long[]{v[0], v[1]});
        v[20] = Heap.s(v[19], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[20] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[21] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = Dispatch.call(m, v[22], new long[]{v[0], v[9], 1L});
        v[24] = Heap.s(v[23], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[24] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[25] = m.load(v[9], 1);
        v[26] = m.load(v[21], 4);
        v[27] = Dispatch.call(m, v[26], new long[]{v[0], v[9], 1L});
        v[28] = Heap.s(v[27], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[28] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return 59;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[29] = (v[25]) & 65535L;
        v[30] = m.load(v[9], 1);
        v[31] = (v[30]) & 65535L;
        v[32] = ((v[31] << 8L)) & 65535L;
        v[33] = ((v[12] + 2L)) & 4294967295L;
        v[34] = v[33] > v[3] ? 1L : 0L;
        return v[34] != 0 ? 59 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[35] = ((v[32] | v[29])) & 65535L;
        v[36] = (v[2] + (Heap.s(v[12], 32) * 1L)) & 4294967295L;
        m.store(v[36], v[25], 1);
        v[37] = (v[36] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[37], v[30], 1);
        v[38] = m.load(10048L, 4);
        v[39] = (v[35]) & 4294967295L;
        v[40] = ((v[38] * v[39])) & 4294967295L;
        v[41] = ((v[40] + v[33])) & 4294967295L;
        v[42] = ((v[41] + 4L)) & 4294967295L;
        v[43] = v[35] == 0L ? 1L : 0L;
        return v[43] != 0 ? 44 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[44] = ((v[1] + 2L)) & 4294967295L;
        v[45] = ((v[32] | v[29])) & 65535L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi46 = (previous == 7 ? v[33] : v[209]);
        long phi47 = (previous == 7 ? v[44] : v[210]);
        long phi48 = (previous == 7 ? 0L : v[208]);
        long phi49 = (previous == 7 ? 0L : v[207]);
        long phi50 = (previous == 7 ? 0L : v[206]);
        long phi51 = (previous == 7 ? 0L : v[205]);
        long phi52 = (previous == 7 ? 0L : v[204]);
        long phi53 = (previous == 7 ? 0L : v[203]);
        long phi54 = (previous == 7 ? 0L : v[211]);
        long phi55 = (previous == 7 ? v[42] : v[202]);
        v[46] = phi46;
        v[47] = phi47;
        v[48] = phi48;
        v[49] = phi49;
        v[50] = phi50;
        v[51] = phi51;
        v[52] = phi52;
        v[53] = phi53;
        v[54] = phi54;
        v[55] = phi55;
        v[56] = m.load(v[17], 4);
        v[57] = Dispatch.call(m, v[56], new long[]{v[0], v[47]});
        v[58] = Heap.s(v[57], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[58] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[59] = m.load(v[21], 4);
        v[60] = Dispatch.call(m, v[59], new long[]{v[0], v[8], 1L});
        v[61] = Heap.s(v[60], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[61] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[62] = m.load(v[8], 1);
        v[63] = m.load(v[21], 4);
        v[64] = Dispatch.call(m, v[63], new long[]{v[0], v[8], 1L});
        v[65] = Heap.s(v[64], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[65] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi66 = (previous == 10 ? v[64] : (previous == 9 ? v[60] : v[57]));
        v[66] = phi66;
        return 58;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[67] = (v[62]) & 65535L;
        v[68] = m.load(v[8], 1);
        v[69] = (v[68]) & 65535L;
        v[70] = ((v[69] << 8L)) & 65535L;
        v[71] = ((v[70] | v[67])) & 65535L;
        v[72] = ((v[46] + 2L)) & 4294967295L;
        v[73] = v[72] > v[3] ? 1L : 0L;
        return v[73] != 0 ? 58 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[74] = (v[2] + (Heap.s(v[46], 32) * 1L)) & 4294967295L;
        m.store(v[74], v[62], 1);
        v[75] = (v[74] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[75], v[68], 1);
        v[76] = ((v[47] + 2L)) & 4294967295L;
        v[77] = m.load(v[17], 4);
        v[78] = Dispatch.call(m, v[77], new long[]{v[0], v[76]});
        v[79] = Heap.s(v[78], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[79] != 0 ? 16 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[80] = m.load(v[21], 4);
        v[81] = Dispatch.call(m, v[80], new long[]{v[0], v[7], 1L});
        v[82] = Heap.s(v[81], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[82] != 0 ? 16 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[83] = m.load(v[7], 1);
        v[84] = m.load(v[21], 4);
        v[85] = Dispatch.call(m, v[84], new long[]{v[0], v[7], 1L});
        v[86] = Heap.s(v[85], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[86] != 0 ? 16 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi87 = (previous == 15 ? v[85] : (previous == 14 ? v[81] : v[78]));
        v[87] = phi87;
        return 58;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[88] = (v[83]) & 65535L;
        v[89] = m.load(v[7], 1);
        v[90] = (v[89]) & 65535L;
        v[91] = ((v[90] << 8L)) & 65535L;
        v[92] = ((v[91] | v[88])) & 65535L;
        v[93] = ((v[46] + 4L)) & 4294967295L;
        v[94] = v[93] > v[3] ? 1L : 0L;
        return v[94] != 0 ? 58 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[95] = (v[2] + (Heap.s(v[72], 32) * 1L)) & 4294967295L;
        m.store(v[95], v[83], 1);
        v[96] = (v[95] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[96], v[89], 1);
        v[97] = ((v[47] + 4L)) & 4294967295L;
        v[98] = m.load(v[17], 4);
        v[99] = Dispatch.call(m, v[98], new long[]{v[0], v[97]});
        v[100] = Heap.s(v[99], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[100] != 0 ? 23 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[101] = m.load(v[21], 4);
        v[102] = Dispatch.call(m, v[101], new long[]{v[0], v[6], 1L});
        v[103] = Heap.s(v[102], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[103] != 0 ? 23 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[104] = m.load(v[6], 1);
        v[105] = m.load(v[21], 4);
        v[106] = Dispatch.call(m, v[105], new long[]{v[0], v[6], 1L});
        v[107] = Heap.s(v[106], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[107] != 0 ? 23 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[108] = m.load(v[6], 1);
        v[109] = m.load(v[21], 4);
        v[110] = Dispatch.call(m, v[109], new long[]{v[0], v[6], 1L});
        v[111] = Heap.s(v[110], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[111] != 0 ? 23 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[112] = m.load(v[6], 1);
        v[113] = m.load(v[21], 4);
        v[114] = Dispatch.call(m, v[113], new long[]{v[0], v[6], 1L});
        v[115] = Heap.s(v[114], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[115] != 0 ? 23 : 24;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi116 = (previous == 22 ? v[114] : (previous == 21 ? v[110] : (previous == 20 ? v[106] : (previous == 19 ? v[102] : v[99]))));
        v[116] = phi116;
        return 58;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[117] = (v[112]) & 4294967295L;
        v[118] = ((v[117] << 16L)) & 4294967295L;
        v[119] = (v[108]) & 4294967295L;
        v[120] = ((v[119] << 8L)) & 4294967295L;
        v[121] = (v[104]) & 4294967295L;
        v[122] = ((v[120] | v[121])) & 4294967295L;
        v[123] = ((v[118] | v[122])) & 4294967295L;
        v[124] = m.load(v[6], 1);
        v[125] = (v[124]) & 4294967295L;
        v[126] = ((v[125] << 24L)) & 4294967295L;
        v[127] = ((v[126] | v[123])) & 4294967295L;
        v[128] = ((v[46] + 8L)) & 4294967295L;
        v[129] = v[128] > v[3] ? 1L : 0L;
        return v[129] != 0 ? 58 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[130] = (v[74] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        m.store(v[130], v[104], 1);
        v[131] = (v[74] + (Heap.s(5L, 32) * 1L)) & 4294967295L;
        m.store(v[131], v[108], 1);
        v[132] = (v[74] + (Heap.s(6L, 32) * 1L)) & 4294967295L;
        m.store(v[132], v[112], 1);
        v[133] = (v[74] + (Heap.s(7L, 32) * 1L)) & 4294967295L;
        m.store(v[133], v[124], 1);
        v[134] = ((v[47] + 8L)) & 4294967295L;
        v[135] = m.load(v[17], 4);
        v[136] = Dispatch.call(m, v[135], new long[]{v[0], v[134]});
        v[137] = Heap.s(v[136], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[137] != 0 ? 30 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[138] = m.load(v[21], 4);
        v[139] = Dispatch.call(m, v[138], new long[]{v[0], v[5], 1L});
        v[140] = Heap.s(v[139], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[140] != 0 ? 30 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[141] = m.load(v[5], 1);
        v[142] = m.load(v[21], 4);
        v[143] = Dispatch.call(m, v[142], new long[]{v[0], v[5], 1L});
        v[144] = Heap.s(v[143], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[144] != 0 ? 30 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[145] = m.load(v[5], 1);
        v[146] = m.load(v[21], 4);
        v[147] = Dispatch.call(m, v[146], new long[]{v[0], v[5], 1L});
        v[148] = Heap.s(v[147], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[148] != 0 ? 30 : 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[149] = m.load(v[5], 1);
        v[150] = m.load(v[21], 4);
        v[151] = Dispatch.call(m, v[150], new long[]{v[0], v[5], 1L});
        v[152] = Heap.s(v[151], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[152] != 0 ? 30 : 31;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi153 = (previous == 29 ? v[151] : (previous == 28 ? v[147] : (previous == 27 ? v[143] : (previous == 26 ? v[139] : v[136]))));
        v[153] = phi153;
        return 58;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[154] = (v[149]) & 4294967295L;
        v[155] = ((v[154] << 16L)) & 4294967295L;
        v[156] = (v[145]) & 4294967295L;
        v[157] = ((v[156] << 8L)) & 4294967295L;
        v[158] = (v[141]) & 4294967295L;
        v[159] = ((v[157] | v[158])) & 4294967295L;
        v[160] = ((v[155] | v[159])) & 4294967295L;
        v[161] = m.load(v[5], 1);
        v[162] = (v[161]) & 4294967295L;
        v[163] = ((v[162] << 24L)) & 4294967295L;
        v[164] = ((v[163] | v[160])) & 4294967295L;
        v[165] = ((v[46] + 12L)) & 4294967295L;
        v[166] = v[165] > v[3] ? 1L : 0L;
        return v[166] != 0 ? 58 : 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[167] = (v[2] + (Heap.s(v[128], 32) * 1L)) & 4294967295L;
        m.store(v[167], 0L, 1);
        v[168] = (v[167] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[168], 0L, 1);
        v[169] = (v[167] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[169], 0L, 1);
        v[170] = (v[167] + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[170], 0L, 1);
        v[171] = (v[92]) & 4294967295L;
        v[172] = ((v[92] + 65523L)) & 65535L;
        v[173] = v[172] < 65524L ? 1L : 0L;
        return v[173] != 0 ? 58 : 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        switch ((int) v[71]) {
            case 34665:
                return 34;
            case 34853:
                return 35;
            case 40965:
                return 36;
            default:
                return 37;
        }
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[174] = (v[46]) & 65535L;
        return 43;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[175] = (v[46]) & 65535L;
        return 43;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[176] = (v[46]) & 65535L;
        return 43;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[177] = (10064L + (Heap.s(0L, 32) * 52L) + (Heap.s(v[171], 32) * 4L)) & 4294967295L;
        v[178] = m.load(v[177], 4);
        v[179] = ((v[178] * v[127])) & 4294967295L;
        v[180] = v[179] > 4L ? 1L : 0L;
        return v[180] != 0 ? 39 : 38;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[181] = ((v[128] + v[179])) & 4294967295L;
        return 40;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[182] = (v[55]) & 255L;
        m.store(v[167], v[182], 1);
        v[183] = ((v[55] >>> 8L)) & 4294967295L;
        v[184] = (v[183]) & 255L;
        m.store(v[168], v[184], 1);
        v[185] = ((v[55] >>> 16L)) & 4294967295L;
        v[186] = (v[185]) & 255L;
        m.store(v[169], v[186], 1);
        v[187] = ((v[55] >>> 24L)) & 4294967295L;
        v[188] = (v[187]) & 255L;
        m.store(v[170], v[188], 1);
        v[189] = ((v[55] + v[179])) & 4294967295L;
        return 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        long phi190 = (previous == 38 ? v[181] : v[189]);
        long phi191 = (previous == 38 ? v[55] : v[189]);
        long phi192 = (previous == 38 ? v[128] : v[55]);
        long phi193 = (previous == 38 ? v[134] : v[164]);
        v[190] = phi190;
        v[191] = phi191;
        v[192] = phi192;
        v[193] = phi193;
        v[194] = v[190] > v[3] ? 1L : 0L;
        return v[194] != 0 ? 58 : 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[195] = m.load(v[17], 4);
        v[196] = Dispatch.call(m, v[195], new long[]{v[0], v[193]});
        v[197] = Heap.s(v[196], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[197] != 0 ? 58 : 42;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[198] = m.load(v[21], 4);
        v[199] = (v[2] + (Heap.s(v[192], 32) * 1L)) & 4294967295L;
        v[200] = Dispatch.call(m, v[198], new long[]{v[0], v[199], v[179]});
        v[201] = Heap.s(v[200], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        return v[201] != 0 ? 43 : 58;
    }

    private static int b43(Heap m, long[] v, int previous) {
        long phi202 = (previous == 34 ? v[55] : (previous == 35 ? v[55] : (previous == 36 ? v[55] : v[191])));
        long phi203 = (previous == 34 ? v[174] : (previous == 35 ? v[53] : (previous == 36 ? v[53] : v[53])));
        long phi204 = (previous == 34 ? v[52] : (previous == 35 ? v[175] : (previous == 36 ? v[52] : v[52])));
        long phi205 = (previous == 34 ? v[51] : (previous == 35 ? v[51] : (previous == 36 ? v[176] : v[51])));
        long phi206 = (previous == 34 ? v[164] : (previous == 35 ? v[50] : (previous == 36 ? v[50] : v[50])));
        long phi207 = (previous == 34 ? v[49] : (previous == 35 ? v[164] : (previous == 36 ? v[49] : v[49])));
        long phi208 = (previous == 34 ? v[48] : (previous == 35 ? v[48] : (previous == 36 ? v[164] : v[48])));
        v[202] = phi202;
        v[203] = phi203;
        v[204] = phi204;
        v[205] = phi205;
        v[206] = phi206;
        v[207] = phi207;
        v[208] = phi208;
        v[209] = ((v[46] + v[38])) & 4294967295L;
        v[210] = ((v[47] + v[38])) & 4294967295L;
        v[211] = ((v[54] + 1L)) & 65535L;
        v[212] = v[211] == v[45] ? 1L : 0L;
        return v[212] != 0 ? 44 : 8;
    }

    private static int b44(Heap m, long[] v, int previous) {
        long phi213 = (previous == 6 ? v[42] : v[202]);
        long phi214 = (previous == 6 ? 0L : v[203]);
        long phi215 = (previous == 6 ? 0L : v[204]);
        long phi216 = (previous == 6 ? 0L : v[205]);
        long phi217 = (previous == 6 ? 0L : v[206]);
        long phi218 = (previous == 6 ? 0L : v[207]);
        long phi219 = (previous == 6 ? 0L : v[208]);
        v[213] = phi213;
        v[214] = phi214;
        v[215] = phi215;
        v[216] = phi216;
        v[217] = phi217;
        v[218] = phi218;
        v[219] = phi219;
        v[220] = v[42] > v[3] ? 1L : 0L;
        return v[220] != 0 ? 58 : 45;
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[221] = (v[2] + (Heap.s(v[41], 32) * 1L)) & 4294967295L;
        m.store(v[221], 0L, 1);
        v[222] = (v[221] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[222], 0L, 1);
        v[223] = (v[221] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[223], 0L, 1);
        v[224] = (v[221] + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[224], 0L, 1);
        v[225] = v[214] == 0L ? 1L : 0L;
        return v[225] != 0 ? 49 : 46;
    }

    private static int b46(Heap m, long[] v, int previous) {
        v[226] = (v[214]) & 4294967295L;
        v[227] = ((v[213] & 1L)) & 4294967295L;
        v[228] = ((v[227] + v[213])) & 4294967295L;
        m.store(v[11], v[228], 4);
        v[229] = ((v[226] + 12L)) & 4294967295L;
        v[230] = v[229] > v[3] ? 1L : 0L;
        return v[230] != 0 ? 58 : 47;
    }

    private static int b47(Heap m, long[] v, int previous) {
        v[231] = (v[228]) & 255L;
        v[232] = (v[2] + (Heap.s(v[226], 32) * 1L)) & 4294967295L;
        v[233] = (v[232] + (Heap.s(8L, 32) * 1L)) & 4294967295L;
        m.store(v[233], v[231], 1);
        v[234] = ((v[228] >>> 8L)) & 4294967295L;
        v[235] = (v[234]) & 255L;
        v[236] = (v[232] + (Heap.s(9L, 32) * 1L)) & 4294967295L;
        m.store(v[236], v[235], 1);
        v[237] = ((v[228] >>> 16L)) & 4294967295L;
        v[238] = (v[237]) & 255L;
        v[239] = (v[232] + (Heap.s(10L, 32) * 1L)) & 4294967295L;
        m.store(v[239], v[238], 1);
        v[240] = ((v[228] >>> 24L)) & 4294967295L;
        v[241] = (v[240]) & 255L;
        v[242] = (v[232] + (Heap.s(11L, 32) * 1L)) & 4294967295L;
        m.store(v[242], v[241], 1);
        v[243] = F0241_StreamCopyIFD.run(m, v[0], v[217], v[2], v[3], v[11]);
        v[244] = Heap.s(v[243], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[244] != 0 ? 58 : 48;
    }

    private static int b48(Heap m, long[] v, int previous) {
        v[245] = m.load(v[11], 4);
        return 49;
    }

    private static int b49(Heap m, long[] v, int previous) {
        long phi246 = (previous == 45 ? v[213] : v[245]);
        long phi247 = (previous == 45 ? 0L : v[243]);
        v[246] = phi246;
        v[247] = phi247;
        v[248] = v[215] == 0L ? 1L : 0L;
        return v[248] != 0 ? 53 : 50;
    }

    private static int b50(Heap m, long[] v, int previous) {
        v[249] = (v[215]) & 4294967295L;
        v[250] = ((v[246] & 1L)) & 4294967295L;
        v[251] = ((v[250] + v[246])) & 4294967295L;
        m.store(v[11], v[251], 4);
        v[252] = ((v[249] + 12L)) & 4294967295L;
        v[253] = v[252] > v[3] ? 1L : 0L;
        return v[253] != 0 ? 58 : 51;
    }

    private static int b51(Heap m, long[] v, int previous) {
        v[254] = (v[251]) & 255L;
        v[255] = (v[2] + (Heap.s(v[249], 32) * 1L)) & 4294967295L;
        v[256] = (v[255] + (Heap.s(8L, 32) * 1L)) & 4294967295L;
        m.store(v[256], v[254], 1);
        v[257] = ((v[251] >>> 8L)) & 4294967295L;
        v[258] = (v[257]) & 255L;
        v[259] = (v[255] + (Heap.s(9L, 32) * 1L)) & 4294967295L;
        m.store(v[259], v[258], 1);
        v[260] = ((v[251] >>> 16L)) & 4294967295L;
        v[261] = (v[260]) & 255L;
        v[262] = (v[255] + (Heap.s(10L, 32) * 1L)) & 4294967295L;
        m.store(v[262], v[261], 1);
        v[263] = ((v[251] >>> 24L)) & 4294967295L;
        v[264] = (v[263]) & 255L;
        v[265] = (v[255] + (Heap.s(11L, 32) * 1L)) & 4294967295L;
        m.store(v[265], v[264], 1);
        v[266] = F0241_StreamCopyIFD.run(m, v[0], v[218], v[2], v[3], v[11]);
        v[267] = Heap.s(v[266], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[267] != 0 ? 58 : 52;
    }

    private static int b52(Heap m, long[] v, int previous) {
        v[268] = m.load(v[11], 4);
        return 53;
    }

    private static int b53(Heap m, long[] v, int previous) {
        long phi269 = (previous == 49 ? v[246] : v[268]);
        long phi270 = (previous == 49 ? v[247] : v[266]);
        v[269] = phi269;
        v[270] = phi270;
        v[271] = v[216] == 0L ? 1L : 0L;
        return v[271] != 0 ? 57 : 54;
    }

    private static int b54(Heap m, long[] v, int previous) {
        v[272] = (v[216]) & 4294967295L;
        v[273] = ((v[269] & 1L)) & 4294967295L;
        v[274] = ((v[273] + v[269])) & 4294967295L;
        m.store(v[11], v[274], 4);
        v[275] = ((v[272] + 12L)) & 4294967295L;
        v[276] = v[275] > v[3] ? 1L : 0L;
        return v[276] != 0 ? 58 : 55;
    }

    private static int b55(Heap m, long[] v, int previous) {
        v[277] = (v[274]) & 255L;
        v[278] = (v[2] + (Heap.s(v[272], 32) * 1L)) & 4294967295L;
        v[279] = (v[278] + (Heap.s(8L, 32) * 1L)) & 4294967295L;
        m.store(v[279], v[277], 1);
        v[280] = ((v[274] >>> 8L)) & 4294967295L;
        v[281] = (v[280]) & 255L;
        v[282] = (v[278] + (Heap.s(9L, 32) * 1L)) & 4294967295L;
        m.store(v[282], v[281], 1);
        v[283] = ((v[274] >>> 16L)) & 4294967295L;
        v[284] = (v[283]) & 255L;
        v[285] = (v[278] + (Heap.s(10L, 32) * 1L)) & 4294967295L;
        m.store(v[285], v[284], 1);
        v[286] = ((v[274] >>> 24L)) & 4294967295L;
        v[287] = (v[286]) & 255L;
        v[288] = (v[278] + (Heap.s(11L, 32) * 1L)) & 4294967295L;
        m.store(v[288], v[287], 1);
        v[289] = F0241_StreamCopyIFD.run(m, v[0], v[219], v[2], v[3], v[11]);
        v[290] = Heap.s(v[289], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[290] != 0 ? 58 : 56;
    }

    private static int b56(Heap m, long[] v, int previous) {
        v[291] = m.load(v[11], 4);
        return 57;
    }

    private static int b57(Heap m, long[] v, int previous) {
        long phi292 = (previous == 53 ? v[269] : v[291]);
        long phi293 = (previous == 53 ? v[270] : v[289]);
        v[292] = phi292;
        v[293] = phi293;
        m.store(v[4], v[292], 4);
        return 58;
    }

    private static int b58(Heap m, long[] v, int previous) {
        long phi294 = (previous == 54 ? 4294967193L : (previous == 50 ? 4294967193L : (previous == 46 ? 4294967193L : (previous == 44 ? 4294967193L : (previous == 55 ? v[289] : (previous == 51 ? v[266] : (previous == 47 ? v[243] : (previous == 57 ? v[293] : (previous == 30 ? v[153] : (previous == 23 ? v[116] : (previous == 16 ? v[87] : (previous == 11 ? v[66] : (previous == 32 ? 4294967295L : (previous == 12 ? 4294967193L : (previous == 17 ? 4294967193L : (previous == 24 ? 4294967193L : (previous == 31 ? 4294967193L : (previous == 40 ? 4294967193L : (previous == 41 ? v[196] : v[200])))))))))))))))))));
        v[294] = phi294;
        return v[16] != 0 ? 61 : 59;
    }

    private static int b59(Heap m, long[] v, int previous) {
        v[295] = (v[0] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        return 60;
    }

    private static int b60(Heap m, long[] v, int previous) {
        v[296] = m.load(v[295], 4);
        v[297] = m.load(v[10], 4);
        v[298] = Dispatch.call(m, v[296], new long[]{v[0], v[297]});
        v[299] = Heap.s(v[298], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[299] != 0 ? 60 : 61;
    }

    private static int b61(Heap m, long[] v, int previous) {
        long phi300 = (previous == 58 ? v[294] : (previous == 0 ? v[15] : v[298]));
        v[300] = phi300;
        v[301] = v[300];
        return -1;
    }
}
