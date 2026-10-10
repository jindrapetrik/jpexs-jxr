package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ImageStrDecInit.
 */
public final class F0401_ImageStrDecInit {

    private F0401_ImageStrDecInit() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[215];
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
                    default:
                        throw new IllegalStateException("Invalid block in ImageStrDecInit");
                }
                previous = old;
                if (pc < 0) {
                    return v[214];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(35064L * 1L, 4);
        v[4] = m.stack(16L * 1L, 4);
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[3], 0L, 35064L, 0L});
        m.store(v[2], 0L, 4);
        v[5] = F0400_WMPhotoValidate.run(m, v[0], v[1]);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 1 : 29;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 32860L) + 40L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] == 4L ? 1L : 0L;
        return v[9] != 0 ? 29 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = (v[1] + (Heap.s(0L, 32) * 32860L) + 48L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[3] + (Heap.s(0L, 32) * 35064L) + 76L) & 4294967295L;
        v[13] = (v[3] + (Heap.s(0L, 32) * 35064L) + 76L + 48L) & 4294967295L;
        m.store(v[13], v[11], 4);
        v[14] = (v[3] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        v[15] = (v[3] + (Heap.s(0L, 32) * 35064L) + 34120L) & 4294967295L;
        v[16] = F0398_ReadWMIHeader.run(m, v[14], v[12], v[15]);
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 3 : 29;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[18] = (v[3] + (Heap.s(0L, 32) * 35064L) + 76L + 32840L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = v[21] == 4L ? 1L : 0L;
        return v[22] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = (v[0] + (Heap.s(0L, 32) * 72L) + 8L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = v[24] == 4L ? 1L : 0L;
        return v[25] != 0 ? 29 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[12], v[1], 32860L, 0L});
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[14], v[0], 72L, 0L});
        v[26] = (v[3] + (Heap.s(0L, 32) * 35064L) + 34120L + 44L) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = (v[3] + (Heap.s(0L, 32) * 35064L) + 34120L + 52L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = ((v[29] + v[27])) & 4294967295L;
        v[31] = m.load(v[14], 4);
        v[32] = ((v[30] + v[31])) & 4294967295L;
        m.store(v[14], v[32], 4);
        v[33] = (v[3] + (Heap.s(0L, 32) * 35064L) + 34120L + 40L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = (v[3] + (Heap.s(0L, 32) * 35064L) + 34120L + 48L) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = ((v[36] + v[34])) & 4294967295L;
        v[38] = (v[3] + (Heap.s(0L, 32) * 35064L) + 4L + 4L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = ((v[37] + v[39])) & 4294967295L;
        m.store(v[38], v[40], 4);
        v[41] = (v[0] + (Heap.s(0L, 32) * 72L) + 32L) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = ((v[42] + v[27])) & 4294967295L;
        m.store(v[41], v[43], 4);
        v[44] = (v[0] + (Heap.s(0L, 32) * 72L) + 40L) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = ((v[45] + v[34])) & 4294967295L;
        m.store(v[44], v[46], 4);
        v[47] = (v[3] + (Heap.s(0L, 32) * 35064L) + 76L + 20L) & 4294967295L;
        v[48] = m.load(v[47], 4);
        v[49] = (12240L + (Heap.s(0L, 32) * 8L) + (Heap.s(v[48], 32) * 4L)) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = (v[3] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[52] = m.load(v[51], 4);
        v[53] = (12256L + (Heap.s(0L, 32) * 36L) + (Heap.s(v[52], 32) * 4L)) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = ((v[50] << 4L)) & 4294967295L;
        v[56] = ((v[50] << 8L)) & 4294967295L;
        v[57] = ((v[54] * v[55])) & 4294967295L;
        v[58] = ((v[32] + 15L)) & 4294967295L;
        v[59] = ((v[58] >>> 4L)) & 4294967295L;
        v[60] = (v[3] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = ((v[61] + 2147483647L)) & 4294967295L;
        v[63] = ((v[62] * v[57])) & 4294967295L;
        v[64] = ((v[63] + v[56])) & 4294967295L;
        v[65] = ((v[64] << 1L)) & 4294967295L;
        v[66] = ((v[58] >>> 20L)) & 4294967295L;
        v[67] = ((v[65] * v[66])) & 4294967295L;
        v[68] = v[67] < 16384L ? 1L : 0L;
        return v[68] != 0 ? 6 : 29;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[69] = ((v[65] * v[59])) & 4294967295L;
        v[70] = ((v[69] + 59846L)) & 4294967295L;
        v[71] = LibC.call(m, "malloc", new long[]{v[70]});
        v[72] = v[71] == 0L ? 1L : 0L;
        return v[72] != 0 ? 29 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[73] = LibC.call(m, "memset", new long[]{v[71], 0L, v[70]});
        v[74] = (v[71] + (Heap.s(35064L, 32) * 1L)) & 4294967295L;
        v[75] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        m.store(v[75], v[74], 4);
        v[76] = (v[71] + (Heap.s(35112L, 32) * 1L)) & 4294967295L;
        v[77] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34340L) & 4294967295L;
        m.store(v[77], v[50], 4);
        v[78] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34252L) & 4294967295L;
        m.store(v[78], v[19], 4);
        F0402_InitializeStrDec.run(m, v[71], v[15], v[3]);
        v[79] = (v[76]) & 4294967295L;
        v[80] = ((v[79] + 127L)) & 4294967295L;
        v[81] = ((v[80] & 4294967168L)) & 4294967295L;
        v[82] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[83] = m.load(v[82], 4);
        v[84] = v[83] == 0L ? 1L : 0L;
        return v[84] != 0 ? 15 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[85] = (v[81]) & 4294967295L;
        v[86] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[87] = m.load(v[86], 4);
        v[88] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        m.store(v[88], v[85], 4);
        v[89] = ((v[87] * v[56])) & 4294967295L;
        v[90] = (v[85] + (Heap.s(v[89], 32) * 1L)) & 4294967295L;
        v[91] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        m.store(v[91], v[90], 4);
        v[92] = (v[90] + (Heap.s(v[89], 32) * 1L)) & 4294967295L;
        v[93] = v[83] == 1L ? 1L : 0L;
        return v[93] != 0 ? 14 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[94] = ((v[87] * v[57])) & 4294967295L;
        v[95] = ((v[83] + 4294967295L)) & 4294967295L;
        v[96] = ((v[83] + 4294967294L)) & 4294967295L;
        v[97] = ((v[95] & 3L)) & 4294967295L;
        v[98] = v[96] < 3L ? 1L : 0L;
        return v[98] != 0 ? 12 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[99] = ((v[95] & 4294967292L)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi100 = (previous == 10 ? 1L : v[122]);
        long phi101 = (previous == 10 ? v[92] : v[121]);
        long phi102 = (previous == 10 ? 0L : v[123]);
        v[100] = phi100;
        v[101] = phi101;
        v[102] = phi102;
        v[103] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[100], 32) * 4L)) & 4294967295L;
        m.store(v[103], v[101], 4);
        v[104] = (v[101] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[105] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[100], 32) * 4L)) & 4294967295L;
        m.store(v[105], v[104], 4);
        v[106] = (v[104] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[107] = ((v[100] + 1L)) & 4294967295L;
        v[108] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[107], 32) * 4L)) & 4294967295L;
        m.store(v[108], v[106], 4);
        v[109] = (v[106] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[110] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[107], 32) * 4L)) & 4294967295L;
        m.store(v[110], v[109], 4);
        v[111] = (v[109] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[112] = ((v[100] + 2L)) & 4294967295L;
        v[113] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[112], 32) * 4L)) & 4294967295L;
        m.store(v[113], v[111], 4);
        v[114] = (v[111] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[115] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[112], 32) * 4L)) & 4294967295L;
        m.store(v[115], v[114], 4);
        v[116] = (v[114] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[117] = ((v[100] + 3L)) & 4294967295L;
        v[118] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[117], 32) * 4L)) & 4294967295L;
        m.store(v[118], v[116], 4);
        v[119] = (v[116] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[120] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[117], 32) * 4L)) & 4294967295L;
        m.store(v[120], v[119], 4);
        v[121] = (v[119] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[122] = ((v[100] + 4L)) & 4294967295L;
        v[123] = ((v[102] + 4L)) & 4294967295L;
        v[124] = v[123] == v[99] ? 1L : 0L;
        return v[124] != 0 ? 12 : 11;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi125 = (previous == 9 ? 0L : v[121]);
        long phi126 = (previous == 9 ? 1L : v[122]);
        long phi127 = (previous == 9 ? v[92] : v[121]);
        v[125] = phi125;
        v[126] = phi126;
        v[127] = phi127;
        v[128] = v[97] == 0L ? 1L : 0L;
        return v[128] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi129 = (previous == 13 ? v[136] : v[126]);
        long phi130 = (previous == 13 ? v[135] : v[127]);
        long phi131 = (previous == 13 ? v[137] : 0L);
        v[129] = phi129;
        v[130] = phi130;
        v[131] = phi131;
        v[132] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34524L + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        m.store(v[132], v[130], 4);
        v[133] = (v[130] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[134] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34588L + (Heap.s(v[129], 32) * 4L)) & 4294967295L;
        m.store(v[134], v[133], 4);
        v[135] = (v[133] + (Heap.s(v[94], 32) * 1L)) & 4294967295L;
        v[136] = ((v[129] + 1L)) & 4294967295L;
        v[137] = ((v[131] + 1L)) & 4294967295L;
        v[138] = v[137] == v[97] ? 1L : 0L;
        return v[138] != 0 ? 14 : 13;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi139 = (previous == 8 ? v[92] : (previous == 12 ? v[125] : v[135]));
        v[139] = phi139;
        v[140] = (v[139]) & 4294967295L;
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi141 = (previous == 7 ? v[81] : v[140]);
        v[141] = phi141;
        v[142] = ((v[141] + 16383L)) & 4294967295L;
        v[143] = ((v[142] & 4294950912L)) & 4294967295L;
        v[144] = (v[143]) & 4294967295L;
        v[145] = (v[144] + (Heap.s(8192L, 32) * 1L)) & 4294967295L;
        v[146] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        m.store(v[146], v[145], 4);
        v[147] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34120L + 16L) & 4294967295L;
        v[148] = m.load(v[147], 4);
        v[149] = v[148] == 0L ? 1L : 0L;
        return v[149] != 0 ? 21 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[4], 0L, 16L, 0L});
        v[150] = ((v[59] << 1L)) & 4294967295L;
        v[151] = ((v[150] * v[56])) & 4294967295L;
        v[152] = ((v[151] + 35191L)) & 4294967295L;
        v[153] = LibC.call(m, "malloc", new long[]{v[152]});
        v[154] = v[153] == 0L ? 1L : 0L;
        return v[154] != 0 ? 17 : 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        return 29;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[155] = LibC.call(m, "memset", new long[]{v[153], 0L, v[152]});
        v[156] = m.load(v[10], 4);
        v[157] = F0335_attach_SB.run(m, v[4], v[156]);
        v[158] = Heap.s(v[157], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[158] != 0 ? 20 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[159] = (v[153] + (Heap.s(35064L, 32) * 1L)) & 4294967295L;
        F0402_InitializeStrDec.run(m, v[153], v[15], v[3]);
        v[160] = (v[153] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        v[161] = (v[153] + (Heap.s(0L, 32) * 35064L) + 76L) & 4294967295L;
        v[162] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34120L) & 4294967295L;
        v[163] = F0397_ReadImagePlaneHeader.run(m, v[160], v[161], v[162], v[4]);
        v[164] = F0339_detach_SB.run(m, v[4]);
        v[165] = m.load(v[75], 4);
        v[166] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        m.store(v[166], v[165], 4);
        v[167] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34340L) & 4294967295L;
        m.store(v[167], v[50], 4);
        v[168] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        m.store(v[168], 0L, 4);
        v[169] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        m.store(v[169], 1L, 4);
        v[170] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34120L + 16L) & 4294967295L;
        m.store(v[170], 1L, 4);
        v[171] = (v[159]) & 4294967295L;
        v[172] = ((v[171] + 127L)) & 4294967295L;
        v[173] = ((v[172] & 4294967168L)) & 4294967295L;
        v[174] = (v[173]) & 4294967295L;
        v[175] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34524L) & 4294967295L;
        m.store(v[175], v[174], 4);
        v[176] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[177] = m.load(v[176], 4);
        v[178] = ((v[177] * v[56])) & 4294967295L;
        v[179] = (v[174] + (Heap.s(v[178], 32) * 1L)) & 4294967295L;
        v[180] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34588L) & 4294967295L;
        m.store(v[180], v[179], 4);
        v[181] = m.load(v[146], 4);
        v[182] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        m.store(v[182], v[181], 4);
        v[183] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        m.store(v[183], v[71], 4);
        v[184] = (v[153] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        m.store(v[184], 1L, 4);
        return 22;
    }

    private static int b20(Heap m, long[] v, int previous) {
        return 29;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[185] = (v[71] + (Heap.s(0L, 32) * 35064L) + 76L + 36L) & 4294967295L;
        m.store(v[185], 0L, 1);
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        long phi186 = (previous == 21 ? 0L : v[153]);
        v[186] = phi186;
        v[187] = F0391_StrIODecInit.run(m, v[71]);
        v[188] = v[187] == 0L ? 1L : 0L;
        return v[188] != 0 ? 23 : 29;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[189] = F0395_StrDecInit.run(m, v[71]);
        v[190] = v[189] == 0L ? 1L : 0L;
        return v[190] != 0 ? 24 : 29;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[191] = v[186] == 0L ? 1L : 0L;
        return v[191] != 0 ? 26 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[192] = F0395_StrDecInit.run(m, v[186]);
        v[193] = v[192] == 0L ? 1L : 0L;
        return v[193] != 0 ? 26 : 29;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[194] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        m.store(v[194], v[186], 4);
        v[195] = (v[71] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[0], v[195], 72L, 0L});
        v[196] = (v[71] + (Heap.s(0L, 32) * 35064L) + 76L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[1], v[196], 32860L, 0L});
        m.store(v[2], v[71], 4);
        v[197] = (v[71] + (Heap.s(0L, 32) * 35064L) + 4L + 64L) & 4294967295L;
        v[198] = m.load(v[197], 1);
        v[199] = v[198] == 0L ? 1L : 0L;
        return v[199] != 0 ? 29 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[200] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34936L) & 4294967295L;
        v[201] = (v[71] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[202] = m.load(v[201], 4);
        v[203] = m.load(v[82], 4);
        v[204] = F0265_initPostProc.run(m, v[200], v[202], v[203]);
        v[205] = m.load(v[147], 4);
        v[206] = v[205] == 0L ? 1L : 0L;
        return v[206] != 0 ? 29 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[207] = (v[186] + (Heap.s(0L, 32) * 35064L) + 34936L) & 4294967295L;
        v[208] = (v[186] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[209] = m.load(v[208], 4);
        v[210] = (v[186] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[211] = m.load(v[210], 4);
        v[212] = F0265_initPostProc.run(m, v[207], v[209], v[211]);
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi213 = (previous == 0 ? 4294967295L : (previous == 1 ? 4294967295L : (previous == 2 ? 4294967295L : (previous == 4 ? 4294967295L : (previous == 5 ? 4294967295L : (previous == 6 ? 4294967195L : (previous == 17 ? 4294967195L : (previous == 20 ? 4294967295L : (previous == 28 ? 0L : (previous == 27 ? 0L : (previous == 26 ? 0L : (previous == 22 ? 4294967295L : (previous == 23 ? 4294967295L : 4294967295L)))))))))))));
        v[213] = phi213;
        v[214] = v[213];
        return -1;
    }
}
