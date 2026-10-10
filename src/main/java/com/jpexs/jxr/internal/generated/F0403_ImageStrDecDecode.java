package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ImageStrDecDecode.
 */
public final class F0403_ImageStrDecDecode {

    private F0403_ImageStrDecDecode() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[146];
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
                    default:
                        throw new IllegalStateException("Invalid block in ImageStrDecDecode");
                }
                previous = old;
                if (pc < 0) {
                    return v[145];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = v[6] == 1L ? 1L : 0L;
        v[8] = v[6] == 2L ? 1L : 0L;
        v[9] = m.load(v[0], 4);
        v[10] = v[9] == 35064L ? 1L : 0L;
        return v[10] != 0 ? 1 : 36;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[11], v[1], 24L, 0L});
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 12L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        F0394_setROI.run(m, v[0]);
        v[15] = v[4] == 0L ? 1L : 0L;
        return v[15] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[16] = (v[4] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[16], v[11], 24L, 0L});
        F0394_setROI.run(m, v[4]);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34232L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = m.load(v[18], 4);
        v[20] = v[19] == 0L ? 1L : 0L;
        return v[20] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[23] = (v[18] + (Heap.s(0L, 32) * 48L) + 36L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = ((v[24] + 16L)) & 4294967295L;
        v[26] = ((v[25] >>> 4L)) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi27 = (previous == 5 ? v[22] : v[26]);
        v[27] = phi27;
        v[28] = m.load(v[12], 4);
        v[29] = v[28] == 0L ? 1L : 0L;
        return v[29] != 0 ? 8 : 11;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[30] = F0393_initLookupTables.run(m, v[0]);
        v[31] = v[30] == 0L ? 1L : 0L;
        return v[31] != 0 ? 9 : 36;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[32] = v[4] == 0L ? 1L : 0L;
        return v[32] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[33] = F0393_initLookupTables.run(m, v[4]);
        v[34] = v[33] == 0L ? 1L : 0L;
        return v[34] != 0 ? 11 : 36;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[35] = m.load(v[12], 4);
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[37] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 16L) & 4294967295L;
        m.store(v[36], v[35], 4);
        v[38] = m.load(v[37], 4);
        v[39] = v[35] > v[38] ? 1L : 0L;
        return v[39] != 0 ? 36 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[40] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34436L) & 4294967295L;
        v[41] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34440L) & 4294967295L;
        v[42] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34444L) & 4294967295L;
        v[43] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34416L) & 4294967295L;
        v[44] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34448L) & 4294967295L;
        v[45] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34452L) & 4294967295L;
        v[46] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34456L) & 4294967295L;
        v[47] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 4L) & 4294967295L;
        v[48] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34424L) & 4294967295L;
        v[49] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34428L) & 4294967295L;
        v[50] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34432L) & 4294967295L;
        v[51] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[52] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L) & 4294967295L;
        v[53] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[54] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[55] = v[8] != 0 ? 9L : 10L;
        v[56] = v[7] != 0 ? 8L : v[55];
        v[57] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34412L) & 4294967295L;
        v[58] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34408L) & 4294967295L;
        v[59] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L + 20L) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi60 = (previous == 12 ? v[35] : v[141]);
        v[60] = phi60;
        v[61] = v[60] == 0L ? 1L : 0L;
        return v[61] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[62] = m.load(v[47], 4);
        v[63] = v[62] == 0L ? 1L : 0L;
        v[64] = v[63] != 0 ? 1879048655L : 1879048656L;
        return 18;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[65] = v[27] == v[60] ? 1L : 0L;
        return v[65] != 0 ? 16 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[66] = m.load(v[47], 4);
        v[67] = v[66] == 0L ? 1L : 0L;
        v[68] = v[67] != 0 ? 1879048655L : 1879048656L;
        return 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[69] = m.load(v[43], 4);
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi70 = (previous == 14 ? v[48] : (previous == 16 ? v[44] : v[40]));
        long phi71 = (previous == 14 ? v[49] : (previous == 16 ? v[45] : v[41]));
        long phi72 = (previous == 14 ? v[50] : (previous == 16 ? v[46] : v[42]));
        long phi73 = (previous == 14 ? v[64] : (previous == 16 ? v[68] : v[69]));
        v[70] = phi70;
        v[71] = phi71;
        v[72] = phi72;
        v[73] = phi73;
        v[74] = m.load(v[72], 4);
        v[75] = m.load(v[71], 4);
        v[76] = m.load(v[70], 4);
        m.store(v[51], 0L, 4);
        F0301_initMRPtr.run(m, v[0]);
        v[77] = m.load(v[52], 4);
        v[78] = m.load(v[53], 4);
        v[79] = ((v[78] << 10L)) & 4294967295L;
        v[80] = LibC.call(m, "memset", new long[]{v[77], 0L, v[79]});
        v[81] = m.load(v[54], 4);
        v[82] = v[81] > 1L ? 1L : 0L;
        return v[82] != 0 ? 19 : 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi83 = (previous == 19 ? v[89] : 1L);
        v[83] = phi83;
        v[84] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[83], 32) * 4L)) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = m.load(v[53], 4);
        v[87] = ((v[86] << v[56])) & 4294967295L;
        v[88] = LibC.call(m, "memset", new long[]{v[85], 0L, v[87]});
        v[89] = ((v[83] + 1L)) & 4294967295L;
        v[90] = m.load(v[54], 4);
        v[91] = v[89] < v[90] ? 1L : 0L;
        return v[91] != 0 ? 19 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[92] = m.load(v[3], 4);
        v[93] = v[92] == 0L ? 1L : 0L;
        return v[93] != 0 ? 22 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[94] = (v[92] + (Heap.s(0L, 32) * 35064L) + 34716L) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = (v[92] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = ((v[97] << 10L)) & 4294967295L;
        v[99] = LibC.call(m, "memset", new long[]{v[95], 0L, v[98]});
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[100] = Dispatch.call(m, v[76], new long[]{v[0]});
        v[101] = v[100] == 0L ? 1L : 0L;
        return v[101] != 0 ? 23 : 36;
    }

    private static int b23(Heap m, long[] v, int previous) {
        F0302_advanceMRPtr.run(m, v[0]);
        m.store(v[57], v[73], 4);
        m.store(v[51], 1L, 4);
        v[102] = m.load(v[53], 4);
        v[103] = v[102] > 1L ? 1L : 0L;
        return v[103] != 0 ? 24 : 26;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[104] = Dispatch.call(m, v[75], new long[]{v[0]});
        v[105] = v[104] == 0L ? 1L : 0L;
        return v[105] != 0 ? 25 : 36;
    }

    private static int b25(Heap m, long[] v, int previous) {
        F0302_advanceMRPtr.run(m, v[0]);
        v[106] = m.load(v[51], 4);
        v[107] = ((v[106] + 1L)) & 4294967295L;
        m.store(v[51], v[107], 4);
        v[108] = m.load(v[53], 4);
        v[109] = v[107] < v[108] ? 1L : 0L;
        return v[109] != 0 ? 24 : 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[110] = m.load(v[47], 4);
        v[111] = v[110] == 0L ? 1L : 0L;
        v[112] = v[111] != 0 ? 1879048655L : 1879048656L;
        m.store(v[57], v[112], 4);
        v[113] = Dispatch.call(m, v[74], new long[]{v[0]});
        v[114] = v[113] == 0L ? 1L : 0L;
        return v[114] != 0 ? 27 : 36;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[115] = m.load(v[36], 4);
        v[116] = v[115] == 0L ? 1L : 0L;
        return v[116] != 0 ? 35 : 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[117] = m.load(v[17], 4);
        v[118] = (v[117] + (Heap.s(0L, 32) * 48L) + 12L) & 4294967295L;
        v[119] = m.load(v[118], 4);
        v[120] = v[119] < 2L ? 1L : 0L;
        return v[120] != 0 ? 29 : 34;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[121] = m.load(v[117], 4);
        v[122] = v[121] == 0L ? 1L : 0L;
        return v[122] != 0 ? 30 : 32;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[123] = ((v[115] << 4L)) & 4294967295L;
        v[124] = (v[117] + (Heap.s(0L, 32) * 48L) + 32L) & 4294967295L;
        v[125] = m.load(v[124], 4);
        v[126] = v[123] > v[125] ? 1L : 0L;
        return v[126] != 0 ? 31 : 35;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[127] = (v[117] + (Heap.s(0L, 32) * 48L) + 36L) & 4294967295L;
        v[128] = m.load(v[127], 4);
        v[129] = ((v[128] + 16L)) & 4294967295L;
        v[130] = v[123] > v[129] ? 1L : 0L;
        return v[130] != 0 ? 35 : 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[131] = m.load(v[58], 4);
        v[132] = Dispatch.call(m, v[131], new long[]{v[0]});
        v[133] = v[132] == 0L ? 1L : 0L;
        return v[133] != 0 ? 33 : 36;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[134] = m.load(v[17], 4);
        v[135] = (v[134] + (Heap.s(0L, 32) * 48L) + 12L) & 4294967295L;
        v[136] = m.load(v[135], 4);
        v[137] = v[136] > 1L ? 1L : 0L;
        return v[137] != 0 ? 34 : 35;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[138] = F0388_decodeThumbnail.run(m, v[0]);
        return 35;
    }

    private static int b35(Heap m, long[] v, int previous) {
        F0303_advanceOneMBRow.run(m, v[0]);
        F0304_swapMRPtr.run(m, v[0]);
        v[139] = m.load(v[59], 4);
        m.store(v[2], v[139], 4);
        v[140] = m.load(v[36], 4);
        v[141] = ((v[140] + 1L)) & 4294967295L;
        m.store(v[36], v[141], 4);
        v[142] = m.load(v[37], 4);
        v[143] = v[141] > v[142] ? 1L : 0L;
        return v[143] != 0 ? 36 : 13;
    }

    private static int b36(Heap m, long[] v, int previous) {
        long phi144 = (previous == 0 ? 4294967295L : (previous == 8 ? 4294967295L : (previous == 10 ? 4294967295L : (previous == 11 ? 0L : (previous == 24 ? 4294967295L : (previous == 22 ? 4294967295L : (previous == 26 ? 4294967295L : (previous == 32 ? 4294967295L : 0L))))))));
        v[144] = phi144;
        v[145] = v[144];
        return -1;
    }
}
