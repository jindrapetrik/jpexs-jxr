package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: port_encode.
 */
public final class F0016_port_encode {

    private F0016_port_encode() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4, long a5, long a6, long a7, long a8) {
        long[] v = new long[201];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
        v[5] = a5;
        v[6] = a6;
        v[7] = a7;
        v[8] = a8;
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
                    default:
                        throw new IllegalStateException("Invalid block in port_encode");
                }
                previous = old;
                if (pc < 0) {
                    return v[200];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[9] = m.stack(4L * 1L, 4);
        v[10] = m.stack(4L * 1L, 4);
        v[11] = m.stack(32860L * 1L, 4);
        v[12] = m.stack(4L * 1L, 4);
        v[13] = m.stack(4L * 1L, 4);
        v[14] = m.stack(16L * 1L, 4);
        m.store(v[9], 0L, 4);
        m.store(v[10], 0L, 4);
        m.store(v[12], 0L, 4);
        m.store(v[13], 0L, 4);
        v[15] = v[3] != 1L ? 1L : 0L;
        v[16] = v[3] == 0L ? 1L : 0L;
        v[17] = v[16] != 0 ? 3L : 1L;
        v[18] = v[15] != 0 ? v[17] : 4L;
        v[19] = ((v[18] * v[1])) & 4294967295L;
        return v[15] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[14], 8640L, 16L, 0L});
        return 6;
    }

    private static int b2(Heap m, long[] v, int previous) {
        switch ((int) v[3]) {
            case 2:
                return 3;
            case 3:
                return 4;
            default:
                return 5;
        }
    }

    private static int b3(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[14], 9648L, 16L, 0L});
        return 6;
    }

    private static int b4(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[14], 10000L, 16L, 0L});
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[14], 8560L, 16L, 0L});
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[20] = Heap.s(v[1], 32) < Heap.s(1L, 32) ? 1L : 0L;
        v[21] = Heap.s(v[2], 32) < Heap.s(1L, 32) ? 1L : 0L;
        v[22] = ((v[20] | v[21])) & 1L;
        return v[22] != 0 ? 36 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[23] = Heap.db(Heap.s(v[1], 32));
        v[24] = Heap.db(Heap.s(v[2], 32));
        v[25] = Heap.db((Heap.d(v[23]) * Heap.d(v[24])));
        v[26] = Heap.fcmp("ogt", Heap.d(v[25]), Heap.d(4724276009111650304L));
        v[27] = v[4] > 100L ? 1L : 0L;
        v[28] = ((v[26] | v[27])) & 1L;
        v[29] = v[5] > 100L ? 1L : 0L;
        v[30] = ((v[28] | v[29])) & 1L;
        return v[30] != 0 ? 36 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[31] = ((v[2] * v[1])) & 4294967295L;
        v[32] = ((v[31] << 2L)) & 4294967295L;
        v[33] = ((v[32] * v[18])) & 4294967295L;
        v[34] = ((v[33] + 65536L)) & 4294967295L;
        v[35] = LibC.call(m, "llvm.umin.i32", new long[]{v[34], 268435456L});
        v[36] = F0030_PKAlloc.run(m, v[12], v[35]);
        v[37] = Heap.s(v[36], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[37] != 0 ? 36 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[38] = m.load(v[12], 4);
        v[39] = F0322_CreateWS_Memory.run(m, v[10], v[38], v[35]);
        v[40] = Heap.s(v[39], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[40] != 0 ? 36 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[41] = m.load(v[10], 4);
        v[42] = (v[41] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        m.store(v[42], 1879048210L, 4);
        v[43] = F0120_PKImageEncode_Create_WMP.run(m, v[9]);
        v[44] = Heap.s(v[43], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[44] != 0 ? 36 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[45] = LibC.call(m, "memset", new long[]{v[11], 0L, 32860L});
        v[46] = (v[11] + (Heap.s(0L, 32) * 32860L) + 20L) & 4294967295L;
        m.store(v[46], 1L, 4);
        v[47] = (v[11] + (Heap.s(0L, 32) * 32860L) + 28L) & 4294967295L;
        m.store(v[47], 1L, 4);
        v[48] = (v[11] + (Heap.s(0L, 32) * 32860L) + 32844L) & 4294967295L;
        m.store(v[48], 1L, 4);
        v[49] = (v[11] + (Heap.s(0L, 32) * 32860L) + 40L) & 4294967295L;
        m.store(v[49], 0L, 4);
        v[50] = v[15] != 0 ? 0L : 2L;
        v[51] = (v[11] + (Heap.s(0L, 32) * 32860L) + 36L) & 4294967295L;
        m.store(v[51], v[50], 1);
        v[52] = Heap.s(v[3], 32) > Heap.s(1L, 32) ? 1L : 0L;
        v[53] = v[52] != 0 ? 0L : v[6];
        v[54] = (v[11] + (Heap.s(0L, 32) * 32860L) + 16L) & 4294967295L;
        m.store(v[54], v[53], 4);
        v[55] = v[4] == 100L ? 1L : 0L;
        return v[55] != 0 ? 14 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[56] = Heap.s(v[7], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[56] != 0 ? 13 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[57] = v[4] > 49L ? 1L : 0L;
        v[58] = v[57] != 0 ? 1L : 2L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi59 = (previous == 11 ? 0L : (previous == 13 ? v[58] : v[7]));
        v[59] = phi59;
        v[60] = (v[11] + (Heap.s(0L, 32) * 32860L) + 24L) & 4294967295L;
        m.store(v[60], v[59], 4);
        v[61] = (v[4]) & 255L;
        v[62] = ((102L - v[61])) & 255L;
        v[63] = v[55] != 0 ? 1L : v[62];
        v[64] = (v[11] + (Heap.s(0L, 32) * 32860L) + 4L) & 4294967295L;
        m.store(v[64], v[63], 1);
        v[65] = v[5] == 100L ? 1L : 0L;
        v[66] = (v[5]) & 255L;
        v[67] = ((102L - v[66])) & 255L;
        v[68] = v[65] != 0 ? 1L : v[67];
        v[69] = (v[11] + (Heap.s(0L, 32) * 32860L) + 13L) & 4294967295L;
        m.store(v[69], v[68], 1);
        v[70] = m.load(v[9], 4);
        v[71] = m.load(v[70], 4);
        v[72] = m.load(v[10], 4);
        v[73] = Dispatch.call(m, v[71], new long[]{v[70], v[72], v[11], 32860L});
        v[74] = Heap.s(v[73], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[74] != 0 ? 36 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[75] = m.load(v[69], 1);
        v[76] = m.load(v[9], 4);
        v[77] = (v[76] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L + 4L) & 4294967295L;
        m.store(v[77], v[75], 1);
        v[78] = (v[76] + (Heap.s(0L, 32) * 66276L) + 8L) & 4294967295L;
        v[79] = m.load(v[78], 4);
        v[80] = Dispatch.call(m, v[79], new long[]{v[76], v[14]});
        v[81] = Heap.s(v[80], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[81] != 0 ? 36 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[82] = m.load(v[9], 4);
        v[83] = (v[82] + (Heap.s(0L, 32) * 66276L) + 12L) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = Dispatch.call(m, v[84], new long[]{v[82], v[1], v[2]});
        v[86] = Heap.s(v[85], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[86] != 0 ? 36 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[87] = m.load(v[9], 4);
        v[88] = (v[87] + (Heap.s(0L, 32) * 66276L) + 16L) & 4294967295L;
        v[89] = m.load(v[88], 4);
        v[90] = Dispatch.call(m, v[89], new long[]{v[87], 1119879168L, 1119879168L});
        v[91] = Heap.s(v[90], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[91] != 0 ? 36 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[92] = v[3] == 3L ? 1L : 0L;
        return v[92] != 0 ? 19 : 26;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[93] = ((v[1] + 7L)) & 4294967295L;
        v[94] = ((v[93] >>> 3L)) & 4294967295L;
        v[95] = ((v[94] * v[2])) & 4294967295L;
        v[96] = F0030_PKAlloc.run(m, v[13], v[95]);
        v[97] = Heap.s(v[96], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[97] != 0 ? 36 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[98] = m.load(v[13], 4);
        v[99] = LibC.call(m, "memset", new long[]{v[98], 0L, v[95]});
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi100 = (previous == 20 ? 0L : v[120]);
        v[100] = phi100;
        v[101] = ((v[100] * v[1])) & 4294967295L;
        v[102] = (v[0] + (Heap.s(v[101], 32) * 1L)) & 4294967295L;
        v[103] = ((v[100] * v[94])) & 4294967295L;
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi104 = (previous == 21 ? 0L : v[118]);
        v[104] = phi104;
        v[105] = (v[102] + (Heap.s(v[104], 32) * 1L)) & 4294967295L;
        v[106] = m.load(v[105], 1);
        v[107] = v[106] == 0L ? 1L : 0L;
        return v[107] != 0 ? 24 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[108] = ((v[104] & 7L)) & 4294967295L;
        v[109] = ((v[108] ^ 7L)) & 4294967295L;
        v[110] = ((1L << v[109])) & 4294967295L;
        v[111] = m.load(v[13], 4);
        v[112] = ((v[104] >>> 3L)) & 4294967295L;
        v[113] = (v[111] + (Heap.s(v[103], 32) * 1L)) & 4294967295L;
        v[114] = (v[113] + (Heap.s(v[112], 32) * 1L)) & 4294967295L;
        v[115] = m.load(v[114], 1);
        v[116] = (v[110]) & 255L;
        v[117] = ((v[115] | v[116])) & 255L;
        m.store(v[114], v[117], 1);
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[118] = ((v[104] + 1L)) & 4294967295L;
        v[119] = v[118] == v[1] ? 1L : 0L;
        return v[119] != 0 ? 25 : 22;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[120] = ((v[100] + 1L)) & 4294967295L;
        v[121] = v[120] == v[2] ? 1L : 0L;
        return v[121] != 0 ? 32 : 21;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[122] = v[32] == 0L ? 1L : 0L;
        v[123] = ((v[15] | v[122])) & 1L;
        return v[123] != 0 ? 32 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[124] = ((v[32] + 4294967295L)) & 4294967295L;
        v[125] = v[124] == 3L ? 1L : 0L;
        return v[125] != 0 ? 30 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[126] = ((v[124] >>> 2L)) & 4294967295L;
        v[127] = ((v[126] + 1L)) & 4294967295L;
        v[128] = ((v[127] & 2147483646L)) & 4294967295L;
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi129 = (previous == 28 ? 0L : v[142]);
        long phi130 = (previous == 28 ? 0L : v[143]);
        v[129] = phi129;
        v[130] = phi130;
        v[131] = (v[0] + (Heap.s(v[129], 32) * 1L)) & 4294967295L;
        v[132] = m.load(v[131], 1);
        v[133] = ((v[129] | 2L)) & 4294967295L;
        v[134] = (v[0] + (Heap.s(v[133], 32) * 1L)) & 4294967295L;
        v[135] = m.load(v[134], 1);
        m.store(v[131], v[135], 1);
        m.store(v[134], v[132], 1);
        v[136] = ((v[129] | 4L)) & 4294967295L;
        v[137] = (v[0] + (Heap.s(v[136], 32) * 1L)) & 4294967295L;
        v[138] = m.load(v[137], 1);
        v[139] = ((v[129] | 6L)) & 4294967295L;
        v[140] = (v[0] + (Heap.s(v[139], 32) * 1L)) & 4294967295L;
        v[141] = m.load(v[140], 1);
        m.store(v[137], v[141], 1);
        m.store(v[140], v[138], 1);
        v[142] = ((v[129] + 8L)) & 4294967295L;
        v[143] = ((v[130] + 2L)) & 4294967295L;
        v[144] = v[143] == v[128] ? 1L : 0L;
        return v[144] != 0 ? 30 : 29;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi145 = (previous == 27 ? 0L : v[142]);
        v[145] = phi145;
        v[146] = ((v[124] & 4L)) & 4294967295L;
        v[147] = v[146] == 0L ? 1L : 0L;
        return v[147] != 0 ? 31 : 32;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[148] = (v[0] + (Heap.s(v[145], 32) * 1L)) & 4294967295L;
        v[149] = m.load(v[148], 1);
        v[150] = ((v[145] | 2L)) & 4294967295L;
        v[151] = (v[0] + (Heap.s(v[150], 32) * 1L)) & 4294967295L;
        v[152] = m.load(v[151], 1);
        m.store(v[148], v[152], 1);
        m.store(v[151], v[149], 1);
        return 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        long phi153 = (previous == 26 ? v[19] : (previous == 25 ? v[94] : (previous == 30 ? v[19] : v[19])));
        v[153] = phi153;
        v[154] = m.load(v[9], 4);
        v[155] = (v[154] + (Heap.s(0L, 32) * 66276L) + 28L) & 4294967295L;
        v[156] = m.load(v[155], 4);
        v[157] = m.load(v[13], 4);
        v[158] = v[157] == 0L ? 1L : 0L;
        v[159] = v[158] != 0 ? v[0] : v[157];
        v[160] = Dispatch.call(m, v[156], new long[]{v[154], v[2], v[159], v[153]});
        v[161] = Heap.s(v[160], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[161] != 0 ? 36 : 33;
    }

    private static int b33(Heap m, long[] v, int previous) {
        return v[15] != 0 ? 35 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[162] = m.load(v[10], 4);
        v[163] = m.load(v[9], 4);
        v[164] = (v[163] + (Heap.s(0L, 32) * 66276L) + 284L + 0L + 28L) & 4294967295L;
        v[165] = m.load(v[164], 4);
        v[166] = ((v[165] + 8L)) & 4294967295L;
        v[167] = (v[163] + (Heap.s(0L, 32) * 66276L) + 284L + 65976L) & 4294967295L;
        v[168] = m.load(v[167], 4);
        v[169] = F0243_PutULong.run(m, v[162], v[166], v[168]);
        v[170] = Heap.s(v[169], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[170] != 0 ? 36 : 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        long phi171 = (previous == 33 ? v[160] : v[169]);
        v[171] = phi171;
        v[172] = m.load(v[10], 4);
        v[173] = (v[172] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[174] = m.load(v[173], 4);
        m.store(v[8], v[174], 4);
        return 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        long phi175 = (previous == 35 ? v[171] : (previous == 7 ? 4294967192L : (previous == 8 ? v[36] : (previous == 9 ? v[39] : (previous == 10 ? v[43] : (previous == 14 ? v[73] : (previous == 15 ? v[80] : (previous == 16 ? v[85] : (previous == 17 ? v[90] : (previous == 32 ? v[160] : (previous == 34 ? v[169] : (previous == 6 ? 4294967192L : v[96]))))))))))));
        v[175] = phi175;
        v[176] = m.load(v[13], 4);
        v[177] = v[176] == 0L ? 1L : 0L;
        return v[177] != 0 ? 38 : 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[178] = F0032_PKFree.run(m, v[13]);
        return 38;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[179] = m.load(v[9], 4);
        v[180] = v[179] == 0L ? 1L : 0L;
        return v[180] != 0 ? 42 : 39;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[181] = (v[179] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[182] = m.load(v[181], 4);
        v[183] = v[182] == 0L ? 1L : 0L;
        return v[183] != 0 ? 41 : 40;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[184] = (v[179] + (Heap.s(0L, 32) * 66276L) + 56L) & 4294967295L;
        v[185] = m.load(v[184], 4);
        v[186] = Dispatch.call(m, v[185], new long[]{v[9]});
        m.store(v[10], 0L, 4);
        return 44;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[187] = F0032_PKFree.run(m, v[9]);
        return 42;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[188] = m.load(v[10], 4);
        v[189] = v[188] == 0L ? 1L : 0L;
        return v[189] != 0 ? 44 : 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        v[190] = (v[188] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[191] = m.load(v[190], 4);
        v[192] = Dispatch.call(m, v[191], new long[]{v[10]});
        return 44;
    }

    private static int b44(Heap m, long[] v, int previous) {
        v[193] = v[175] != 0L ? 1L : 0L;
        v[194] = m.load(v[12], 4);
        v[195] = v[194] != 0L ? 1L : 0L;
        v[196] = v[193] != 0 ? v[195] : 0L;
        return v[196] != 0 ? 45 : 46;
    }

    private static int b45(Heap m, long[] v, int previous) {
        v[197] = F0032_PKFree.run(m, v[12]);
        v[198] = m.load(v[12], 4);
        return 46;
    }

    private static int b46(Heap m, long[] v, int previous) {
        long phi199 = (previous == 45 ? v[198] : v[194]);
        v[199] = phi199;
        m.store(3584L, v[175], 4);
        v[200] = v[199];
        return -1;
    }
}
