package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writeIndexTable.
 */
public final class F0416_writeIndexTable {

    private F0416_writeIndexTable() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[127];
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
                    default:
                        throw new IllegalStateException("Invalid block in writeIndexTable");
                }
                previous = old;
                if (pc < 0) {
                    return v[126];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.stack(16L * 1L, 4);
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 43 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34264L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[1], 0L, 16L, 0L});
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((v[10] + 1L)) & 4294967295L;
        v[12] = ((v[11] * v[3])) & 4294967295L;
        F0297_putBit16.run(m, v[6], 1L, 16L);
        v[13] = m.load(v[9], 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34244L) & 4294967295L;
        v[15] = Heap.s(v[13], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        return v[15] != 0 ? 2 : 23;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32844L) & 4294967295L;
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34236L) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi19 = (previous == 2 ? v[13] : v[70]);
        v[19] = phi19;
        v[20] = m.load(v[14], 4);
        v[21] = v[20] == 0L ? 1L : 0L;
        return v[21] != 0 ? 4 : 22;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[22] = m.load(v[2], 4);
        v[23] = Heap.s(v[22], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[23] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[24] = ((v[19] + 4294967295L)) & 4294967295L;
        return 21;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[25] = v[19] == 0L ? 1L : 0L;
        v[26] = ((v[19] + 4294967295L)) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi27 = (previous == 6 ? v[22] : v[60]);
        long phi28 = (previous == 6 ? 0L : v[69]);
        long phi29 = (previous == 6 ? 0L : v[68]);
        v[27] = phi27;
        v[28] = phi28;
        v[29] = phi29;
        v[30] = m.load(v[16], 4);
        v[31] = v[30] == 1L ? 1L : 0L;
        return v[31] != 0 ? 8 : 10;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[32] = m.load(v[17], 4);
        v[33] = v[32] == 0L ? 1L : 0L;
        return v[33] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[34] = m.load(v[18], 1);
        v[35] = (v[34]) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi36 = (previous == 9 ? v[35] : (previous == 8 ? 1L : 1L));
        v[36] = phi36;
        v[37] = v[29] < v[36] ? 1L : 0L;
        return v[37] != 0 ? 18 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[38] = Heap.s(v[28], 32) < Heap.s(v[27], 32) ? 1L : 0L;
        return v[38] != 0 ? 12 : 21;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[39] = m.load(v[16], 4);
        v[40] = v[39] == 1L ? 1L : 0L;
        v[41] = Heap.s(v[28], 32) < Heap.s(v[27], 32) ? 1L : 0L;
        return 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        return v[41] != 0 ? 14 : 21;
    }

    private static int b14(Heap m, long[] v, int previous) {
        return v[40] != 0 ? 15 : 17;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[42] = m.load(v[17], 4);
        v[43] = v[42] == 0L ? 1L : 0L;
        return v[43] != 0 ? 17 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[44] = m.load(v[18], 1);
        v[45] = (v[44]) & 4294967295L;
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi46 = (previous == 16 ? v[45] : (previous == 15 ? 1L : 1L));
        v[46] = phi46;
        v[47] = v[46] == 0L ? 1L : 0L;
        return v[47] != 0 ? 13 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi48 = (previous == 10 ? v[29] : 0L);
        v[48] = phi48;
        return v[25] != 0 ? 20 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[49] = m.load(v[7], 4);
        v[50] = ((v[27] * v[26])) & 4294967295L;
        v[51] = (v[49] + (Heap.s(v[50], 32) * 4L)) & 4294967295L;
        v[52] = (v[51] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = ((v[27] * v[19])) & 4294967295L;
        v[55] = (v[8] + (Heap.s(v[54], 32) * 4L)) & 4294967295L;
        v[56] = (v[55] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        v[57] = m.load(v[56], 4);
        v[58] = ((v[57] - v[53])) & 4294967295L;
        m.store(v[56], v[58], 4);
        v[59] = m.load(v[2], 4);
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi60 = (previous == 19 ? v[59] : v[27]);
        v[60] = phi60;
        v[61] = ((v[60] * v[19])) & 4294967295L;
        v[62] = (v[8] + (Heap.s(v[61], 32) * 4L)) & 4294967295L;
        v[63] = (v[62] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = (v[1] + (Heap.s(0L, 32) * 16L) + (Heap.s(v[48], 32) * 4L)) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = ((v[66] + v[64])) & 4294967295L;
        m.store(v[65], v[67], 4);
        v[68] = ((v[48] + 1L)) & 4294967295L;
        v[69] = ((v[28] + 1L)) & 4294967295L;
        return 7;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi70 = (previous == 5 ? v[24] : (previous == 11 ? v[26] : v[26]));
        v[70] = phi70;
        v[71] = Heap.s(v[19], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[71] != 0 ? 3 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[72] = (v[1] + (Heap.s(0L, 32) * 16L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = (v[1] + (Heap.s(0L, 32) * 16L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[75] = m.load(v[74], 4);
        v[76] = m.load(v[1], 4);
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi77 = (previous == 22 ? v[76] : 0L);
        long phi78 = (previous == 22 ? v[75] : 0L);
        long phi79 = (previous == 22 ? v[73] : 0L);
        v[77] = phi77;
        v[78] = phi78;
        v[79] = phi79;
        v[80] = (v[1] + (Heap.s(0L, 32) * 16L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[81] = (v[1] + (Heap.s(0L, 32) * 16L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[82] = ((v[77] + v[78])) & 4294967295L;
        v[83] = ((v[82] + v[79])) & 4294967295L;
        v[84] = (v[1] + (Heap.s(0L, 32) * 16L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[84], v[83], 4);
        m.store(v[80], v[82], 4);
        m.store(v[81], v[77], 4);
        m.store(v[1], 0L, 4);
        v[85] = Heap.s(v[12], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[85] != 0 ? 24 : 42;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[86] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[87] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32844L) & 4294967295L;
        v[88] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34236L) & 4294967295L;
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        long phi89 = (previous == 24 ? 0L : v[124]);
        long phi90 = (previous == 24 ? 0L : v[123]);
        v[89] = phi89;
        v[90] = phi90;
        v[91] = m.load(v[86], 4);
        v[92] = v[91] == 1L ? 1L : 0L;
        return v[92] != 0 ? 26 : 28;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[93] = m.load(v[87], 4);
        v[94] = v[93] == 0L ? 1L : 0L;
        return v[94] != 0 ? 28 : 27;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[95] = m.load(v[88], 1);
        v[96] = (v[95]) & 4294967295L;
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi97 = (previous == 27 ? v[96] : (previous == 26 ? 1L : 1L));
        v[97] = phi97;
        v[98] = v[90] < v[97] ? 1L : 0L;
        return v[98] != 0 ? 36 : 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[99] = Heap.s(v[89], 32) < Heap.s(v[12], 32) ? 1L : 0L;
        return v[99] != 0 ? 30 : 42;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[100] = m.load(v[86], 4);
        v[101] = v[100] == 1L ? 1L : 0L;
        v[102] = Heap.s(v[89], 32) < Heap.s(v[12], 32) ? 1L : 0L;
        return 32;
    }

    private static int b31(Heap m, long[] v, int previous) {
        return v[102] != 0 ? 32 : 42;
    }

    private static int b32(Heap m, long[] v, int previous) {
        return v[101] != 0 ? 33 : 35;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[103] = m.load(v[87], 4);
        v[104] = v[103] == 0L ? 1L : 0L;
        return v[104] != 0 ? 35 : 34;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[105] = m.load(v[88], 1);
        v[106] = (v[105]) & 4294967295L;
        return 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        long phi107 = (previous == 34 ? v[106] : (previous == 33 ? 1L : 1L));
        v[107] = phi107;
        v[108] = v[107] == 0L ? 1L : 0L;
        return v[108] != 0 ? 31 : 36;
    }

    private static int b36(Heap m, long[] v, int previous) {
        long phi109 = (previous == 28 ? v[90] : 0L);
        v[109] = phi109;
        v[110] = F0365_writeIS.run(m, v[0], v[6]);
        v[111] = (v[8] + (Heap.s(v[89], 32) * 4L)) & 4294967295L;
        v[112] = m.load(v[111], 4);
        v[113] = v[112] > 4L ? 1L : 0L;
        v[114] = (v[1] + (Heap.s(0L, 32) * 16L) + (Heap.s(v[109], 32) * 4L)) & 4294967295L;
        v[115] = m.load(v[114], 4);
        return v[113] != 0 ? 38 : 37;
    }

    private static int b37(Heap m, long[] v, int previous) {
        F0297_putBit16.run(m, v[6], 255L, 8L);
        return 41;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[116] = v[115] < 64256L ? 1L : 0L;
        return v[116] != 0 ? 39 : 40;
    }

    private static int b39(Heap m, long[] v, int previous) {
        F0297_putBit16.run(m, v[6], v[115], 16L);
        return 41;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[117] = ((v[115] >>> 16L)) & 4294967295L;
        F0297_putBit16.run(m, v[6], 251L, 8L);
        F0297_putBit16.run(m, v[6], v[117], 16L);
        v[118] = ((v[115] & 65535L)) & 4294967295L;
        F0297_putBit16.run(m, v[6], v[118], 16L);
        return 41;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[119] = m.load(v[111], 4);
        v[120] = v[119] < 5L ? 1L : 0L;
        v[121] = v[120] != 0 ? 0L : v[119];
        v[122] = ((v[121] + v[115])) & 4294967295L;
        m.store(v[114], v[122], 4);
        v[123] = ((v[109] + 1L)) & 4294967295L;
        v[124] = ((v[89] + 1L)) & 4294967295L;
        return 25;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[125] = F0365_writeIS.run(m, v[0], v[6]);
        F0297_putBit16.run(m, v[6], 255L, 8L);
        F0361_fillToByte.run(m, v[6]);
        return 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        v[126] = 0L;
        return -1;
    }
}
