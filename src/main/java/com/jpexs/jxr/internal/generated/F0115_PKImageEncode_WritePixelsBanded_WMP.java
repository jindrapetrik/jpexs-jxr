package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_WritePixelsBanded_WMP.
 */
public final class F0115_PKImageEncode_WritePixelsBanded_WMP {

    private F0115_PKImageEncode_WritePixelsBanded_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[161];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_WritePixelsBanded_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[160];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = m.stack(24L * 1L, 4);
        v[6] = m.stack(24L * 1L, 4);
        v[7] = m.stack(40L * 1L, 4);
        v[8] = m.stack(4L * 1L, 4);
        v[9] = m.stack(4L * 1L, 4);
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[7], 0L, 40L, 0L});
        v[10] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65984L) & 4294967295L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65988L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = v[4] == 0L ? 1L : 0L;
        v[14] = ((v[1] & 15L)) & 4294967295L;
        v[15] = v[14] != 0L ? 1L : 0L;
        v[16] = ((v[15] & v[13])) & 1L;
        return v[16] != 0 ? 34 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[17] = m.load(v[10], 4);
        v[18] = (v[0] + (Heap.s(0L, 32) * 66276L) + 108L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = v[19] == 0L ? 1L : 0L;
        v[21] = v[17] == 1L ? 1L : 0L;
        v[22] = v[20] != 0 ? 1L : v[21];
        return v[22] != 0 ? 2 : 7;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[23] = (v[0] + (Heap.s(0L, 32) * 66276L) + 68L) & 4294967295L;
        m.store(v[7], v[23], 4);
        v[24] = F0037_PixelFormatLookup.run(m, v[7], 0L);
        v[25] = (v[7] + (Heap.s(0L, 32) * 40L) + 20L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = ((v[26] & 16L)) & 4294967295L;
        v[28] = v[27] == 0L ? 1L : 0L;
        v[29] = ((v[27] >>> 4L)) & 4294967295L;
        v[30] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65960L) & 4294967295L;
        m.store(v[30], v[29], 4);
        return v[28] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[31] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 36L) & 4294967295L;
        v[32] = m.load(v[31], 1);
        v[33] = v[32] == 2L ? 1L : 0L;
        v[34] = v[12] == 0L ? 1L : 0L;
        v[35] = v[33] != 0 ? v[34] : 0L;
        return v[35] != 0 ? 34 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[36] = m.load(v[18], 4);
        v[37] = v[36] == 0L ? 1L : 0L;
        return v[37] != 0 ? 5 : 7;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[38] = F0090_WriteContainerPre.run(m, v[0]);
        v[39] = Heap.s(v[38], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[39] != 0 ? 34 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        m.store(v[18], 1L, 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[40] = m.load(v[10], 4);
        v[41] = v[40] == 1L ? 1L : 0L;
        return v[41] != 0 ? 8 : 15;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[42] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = (v[43] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = Dispatch.call(m, v[45], new long[]{v[43], v[8]});
        v[47] = Heap.s(v[46], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[47] != 0 ? 13 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[48] = m.load(v[8], 4);
        v[49] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65964L) & 4294967295L;
        m.store(v[49], v[48], 4);
        v[50] = (v[7] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = (v[7] + (Heap.s(8L, 32) * 1L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = (v[7] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        v[55] = m.load(v[54], 4);
        v[56] = (v[7] + (Heap.s(16L, 32) * 1L)) & 4294967295L;
        v[57] = m.load(v[56], 4);
        v[58] = (v[7] + (Heap.s(20L, 32) * 1L)) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L) & 4294967295L;
        m.store(v[62], v[61], 4);
        v[63] = (v[0] + (Heap.s(0L, 32) * 66276L) + 88L) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 4L) & 4294967295L;
        m.store(v[65], v[64], 4);
        v[66] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 12L) & 4294967295L;
        m.store(v[66], v[55], 4);
        v[67] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 16L) & 4294967295L;
        m.store(v[67], v[57], 4);
        v[68] = ((v[59] >>> 6L)) & 4294967295L;
        v[69] = ((v[68] & 1L)) & 4294967295L;
        v[70] = ((v[69] ^ 1L)) & 4294967295L;
        v[71] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 24L) & 4294967295L;
        m.store(v[71], v[70], 4);
        v[72] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 8L) & 4294967295L;
        m.store(v[72], v[53], 4);
        v[73] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65980L) & 4294967295L;
        v[74] = m.load(v[73], 4);
        v[75] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 60L) & 4294967295L;
        m.store(v[75], v[74], 4);
        v[76] = (v[2]) & 4294967295L;
        v[77] = ((v[76] & 127L)) & 4294967295L;
        v[78] = v[77] == 0L ? 1L : 0L;
        return v[78] != 0 ? 10 : 12;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[79] = ((v[61] | v[1])) & 4294967295L;
        v[80] = ((v[79] & 15L)) & 4294967295L;
        v[81] = ((v[3] & 127L)) & 4294967295L;
        v[82] = ((v[80] | v[81])) & 4294967295L;
        v[83] = v[82] == 0L ? 1L : 0L;
        return v[83] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[84] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 68L) & 4294967295L;
        m.store(v[84], 1L, 4);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[85] = v[53] != 6L ? 1L : 0L;
        v[86] = ((v[59] & 16L)) & 4294967295L;
        v[87] = v[86] != 0L ? 1L : 0L;
        v[88] = v[85] != 0 ? 1L : v[87];
        v[89] = (Heap.s(v[88], 1)) & 4294967295L;
        v[90] = ((v[51] + v[89])) & 4294967295L;
        v[91] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32L) & 4294967295L;
        m.store(v[91], v[90], 4);
        v[92] = (v[0] + (Heap.s(0L, 32) * 66276L) + 92L) & 4294967295L;
        m.store(v[92], 0L, 4);
        v[93] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L) & 4294967295L;
        v[94] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32856L) & 4294967295L;
        m.store(v[94], 1L, 4);
        v[95] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33020L) & 4294967295L;
        v[96] = F0426_ImageStrEncInit.run(m, v[62], v[93], v[95]);
        v[97] = v[96] == 0L ? 1L : 0L;
        return v[97] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi98 = (previous == 12 ? 4294967295L : v[46]);
        v[98] = phi98;
        return 34;
    }

    private static int b14(Heap m, long[] v, int previous) {
        m.store(v[10], 2L, 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[99] = v[1] == 0L ? 1L : 0L;
        return v[99] != 0 ? 22 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[100] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 8L) & 4294967295L;
        v[101] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32848L) & 4294967295L;
        v[102] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 16L) & 4294967295L;
        v[103] = (v[6] + (Heap.s(0L, 32) * 24L) + 4L) & 4294967295L;
        v[104] = (v[6] + (Heap.s(0L, 32) * 24L) + 8L) & 4294967295L;
        v[105] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33020L) & 4294967295L;
        v[106] = (v[6] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        return 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[107] = ((v[109] + 16L)) & 4294967295L;
        v[108] = v[107] < v[1] ? 1L : 0L;
        return v[108] != 0 ? 18 : 22;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi109 = (previous == 16 ? 0L : v[107]);
        v[109] = phi109;
        v[110] = m.load(v[100], 4);
        v[111] = v[110] == 1L ? 1L : 0L;
        return v[111] != 0 ? 21 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[112] = m.load(v[101], 4);
        v[113] = v[112] == 0L ? 1L : 0L;
        return v[113] != 0 ? 21 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[114] = m.load(v[102], 4);
        v[115] = v[114] == 1L ? 1L : 0L;
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi116 = (previous == 18 ? 1L : (previous == 19 ? 0L : v[115]));
        v[116] = phi116;
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[106], 0L, 12L, 0L});
        v[117] = ((v[109] * v[3])) & 4294967295L;
        v[118] = (v[116]) & 4294967295L;
        v[119] = ((v[117] >>> v[118])) & 4294967295L;
        v[120] = (v[2] + (Heap.s(v[119], 32) * 1L)) & 4294967295L;
        m.store(v[6], v[120], 4);
        v[121] = ((v[1] - v[109])) & 4294967295L;
        v[122] = LibC.call(m, "llvm.umin.i32", new long[]{v[121], 16L});
        m.store(v[103], v[122], 4);
        m.store(v[104], v[3], 4);
        v[123] = m.load(v[105], 4);
        v[124] = F0432_ImageStrEncEncode.run(m, v[123], v[6]);
        v[125] = v[124] == 0L ? 1L : 0L;
        return v[125] != 0 ? 17 : 34;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[126] = (v[0] + (Heap.s(0L, 32) * 66276L) + 92L) & 4294967295L;
        v[127] = m.load(v[126], 4);
        v[128] = ((v[127] + v[1])) & 4294967295L;
        m.store(v[126], v[128], 4);
        v[129] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65960L) & 4294967295L;
        v[130] = m.load(v[129], 4);
        v[131] = v[130] == 0L ? 1L : 0L;
        return v[131] != 0 ? 34 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[132] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 36L) & 4294967295L;
        v[133] = m.load(v[132], 1);
        v[134] = v[133] == 2L ? 1L : 0L;
        return v[134] != 0 ? 24 : 34;
    }

    private static int b24(Heap m, long[] v, int previous) {
        return v[21] != 0 ? 25 : 29;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[135] = (v[12] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[136] = m.load(v[135], 4);
        v[137] = Dispatch.call(m, v[136], new long[]{v[12], v[9]});
        v[138] = Heap.s(v[137], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[138] != 0 ? 27 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[139] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L + 48L) & 4294967295L;
        m.store(v[139], v[12], 4);
        v[140] = F0099_PKImageEncode_EncodeAlpha_Init.run(m, v[0], v[7], 0L, 0L, 0L);
        v[141] = Heap.s(v[140], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[141] != 0 ? 27 : 28;
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi142 = (previous == 25 ? v[137] : 4294967295L);
        v[142] = phi142;
        return 34;
    }

    private static int b28(Heap m, long[] v, int previous) {
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        return v[99] != 0 ? 33 : 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[143] = (v[5] + (Heap.s(0L, 32) * 24L) + 4L) & 4294967295L;
        v[144] = (v[5] + (Heap.s(0L, 32) * 24L) + 8L) & 4294967295L;
        v[145] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65956L) & 4294967295L;
        v[146] = (v[5] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        return 32;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[147] = ((v[149] + 16L)) & 4294967295L;
        v[148] = v[147] < v[1] ? 1L : 0L;
        return v[148] != 0 ? 32 : 33;
    }

    private static int b32(Heap m, long[] v, int previous) {
        long phi149 = (previous == 30 ? 0L : v[147]);
        v[149] = phi149;
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[146], 0L, 12L, 0L});
        v[150] = ((v[149] * v[3])) & 4294967295L;
        v[151] = (v[2] + (Heap.s(v[150], 32) * 1L)) & 4294967295L;
        m.store(v[5], v[151], 4);
        v[152] = ((v[1] - v[149])) & 4294967295L;
        v[153] = LibC.call(m, "llvm.umin.i32", new long[]{v[152], 16L});
        m.store(v[143], v[153], 4);
        m.store(v[144], v[3], 4);
        v[154] = m.load(v[145], 4);
        v[155] = F0432_ImageStrEncEncode.run(m, v[154], v[5]);
        v[156] = v[155] == 0L ? 1L : 0L;
        return v[156] != 0 ? 31 : 34;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[157] = m.load(v[126], 4);
        v[158] = ((v[157] + v[1])) & 4294967295L;
        m.store(v[126], v[158], 4);
        return 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        long phi159 = (previous == 23 ? 0L : (previous == 22 ? 0L : (previous == 0 ? 4294967185L : (previous == 5 ? v[38] : (previous == 3 ? 4294967184L : (previous == 13 ? v[98] : (previous == 27 ? v[142] : (previous == 33 ? 0L : (previous == 32 ? 4294967295L : 4294967295L)))))))));
        v[159] = phi159;
        v[160] = v[159];
        return -1;
    }
}
