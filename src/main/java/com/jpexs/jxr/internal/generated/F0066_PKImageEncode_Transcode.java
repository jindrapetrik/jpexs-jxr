package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_Transcode.
 */
public final class F0066_PKImageEncode_Transcode {

    private F0066_PKImageEncode_Transcode() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[142];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_Transcode");
                }
                previous = old;
                if (pc < 0) {
                    return v[141];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(16L * 1L, 4);
        v[4] = m.stack(16L * 1L, 4);
        v[5] = m.stack(36L * 1L, 4);
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[3], 9616L, 16L, 0L});
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[4], 9616L, 16L, 0L});
        v[6] = (v[5] + (Heap.s(20L, 32) * 1L)) & 4294967295L;
        m.store(v[6], 0L, 4);
        v[7] = (v[1] + (Heap.s(0L, 32) * 56L) + 12L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = Dispatch.call(m, v[8], new long[]{v[1], v[3]});
        v[10] = Heap.s(v[9], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[10] != 0 ? 23 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = (v[1] + (Heap.s(0L, 32) * 56L) + 8L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = Dispatch.call(m, v[12], new long[]{v[1], v[4]});
        v[14] = Heap.s(v[13], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[14] != 0 ? 23 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = (v[0] + (Heap.s(0L, 32) * 66276L) + 68L) & 4294967295L;
        v[16] = LibC.call(m, "memcmp", new long[]{v[15], v[4], 16L});
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 3 : 23;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi18 = (previous == 4 ? v[23] : 0L);
        v[18] = phi18;
        v[19] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[18], 32) * 40L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = LibC.call(m, "memcmp", new long[]{v[3], v[20], 16L});
        v[22] = v[21] == 0L ? 1L : 0L;
        return v[22] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = ((v[18] + 1L)) & 4294967295L;
        v[24] = v[23] == 68L ? 1L : 0L;
        return v[24] != 0 ? 6 : 3;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = (v[19] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[19] + (Heap.s(16L, 32) * 1L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = v[26] == 0L ? 1L : 0L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi30 = (previous == 5 ? v[28] : 0L);
        long phi31 = (previous == 5 ? v[29] : 0L);
        long phi32 = (previous == 5 ? v[20] : v[3]);
        v[30] = phi30;
        v[31] = phi31;
        v[32] = phi32;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi33 = (previous == 6 ? 0L : v[38]);
        v[33] = phi33;
        v[34] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[33], 32) * 40L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = LibC.call(m, "memcmp", new long[]{v[4], v[35], 16L});
        v[37] = v[36] == 0L ? 1L : 0L;
        return v[37] != 0 ? 9 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[38] = ((v[33] + 1L)) & 4294967295L;
        v[39] = v[38] == 68L ? 1L : 0L;
        return v[39] != 0 ? 10 : 7;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[40] = (v[34] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = (v[34] + (Heap.s(16L, 32) * 1L)) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = v[41] == 0L ? 1L : 0L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi45 = (previous == 9 ? v[43] : 0L);
        long phi46 = (previous == 9 ? v[44] : 0L);
        long phi47 = (previous == 9 ? v[35] : v[4]);
        v[45] = phi45;
        v[46] = phi46;
        v[47] = phi47;
        return v[31] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[48] = (v[2] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = ((v[49] * v[30])) & 4294967295L;
        v[51] = ((v[50] + 7L)) & 4294967295L;
        v[52] = ((v[51] >>> 3L)) & 4294967295L;
        return 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[53] = ((v[30] + 7L)) & 4294967295L;
        v[54] = ((v[53] >>> 3L)) & 4294967295L;
        v[55] = (v[2] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = ((v[56] * v[54])) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi58 = (previous == 11 ? v[52] : v[57]);
        v[58] = phi58;
        v[59] = v[32] == 4768L ? 1L : 0L;
        v[60] = v[32] == 4784L ? 1L : 0L;
        v[61] = ((v[59] | v[60])) & 1L;
        v[62] = (v[61]) & 4294967295L;
        v[63] = ((v[58] >>> v[62])) & 4294967295L;
        return v[46] != 0 ? 14 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[64] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[65] = m.load(v[64], 4);
        v[66] = ((v[65] * v[45])) & 4294967295L;
        v[67] = ((v[66] + 7L)) & 4294967295L;
        v[68] = ((v[67] >>> 3L)) & 4294967295L;
        return 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[69] = ((v[45] + 7L)) & 4294967295L;
        v[70] = ((v[69] >>> 3L)) & 4294967295L;
        v[71] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = ((v[72] * v[70])) & 4294967295L;
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi74 = (previous == 14 ? v[68] : v[73]);
        v[74] = phi74;
        v[75] = v[47] == 4768L ? 1L : 0L;
        v[76] = v[47] == 4784L ? 1L : 0L;
        v[77] = ((v[75] | v[76])) & 1L;
        v[78] = (v[77]) & 4294967295L;
        v[79] = ((v[74] >>> v[78])) & 4294967295L;
        v[80] = LibC.call(m, "llvm.umax.i32", new long[]{v[63], v[79]});
        v[81] = (v[0] + (Heap.s(0L, 32) * 66276L) + 280L) & 4294967295L;
        v[82] = m.load(v[81], 4);
        v[83] = v[82] == 0L ? 1L : 0L;
        return v[83] != 0 ? 18 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[84] = (v[1] + (Heap.s(0L, 32) * 56L) + 36L) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 32L) & 4294967295L;
        v[87] = m.load(v[86], 4);
        m.store(v[5], v[87], 4);
        v[88] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 40L) & 4294967295L;
        v[89] = m.load(v[88], 4);
        v[90] = (v[5] + (Heap.s(0L, 32) * 36L) + 8L) & 4294967295L;
        m.store(v[90], v[89], 4);
        v[91] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 36L) & 4294967295L;
        v[92] = m.load(v[91], 4);
        v[93] = (v[5] + (Heap.s(0L, 32) * 36L) + 4L) & 4294967295L;
        m.store(v[93], v[92], 4);
        v[94] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 44L) & 4294967295L;
        v[95] = m.load(v[94], 4);
        v[96] = (v[5] + (Heap.s(0L, 32) * 36L) + 12L) & 4294967295L;
        m.store(v[96], v[95], 4);
        v[97] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 60L) & 4294967295L;
        v[98] = m.load(v[97], 4);
        v[99] = (v[5] + (Heap.s(0L, 32) * 36L) + 28L) & 4294967295L;
        m.store(v[99], v[98], 4);
        v[100] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 36L) & 4294967295L;
        v[101] = m.load(v[100], 1);
        v[102] = (v[5] + (Heap.s(0L, 32) * 36L) + 20L) & 4294967295L;
        m.store(v[102], v[101], 1);
        v[103] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 28L) & 4294967295L;
        v[104] = m.load(v[103], 4);
        v[105] = (v[5] + (Heap.s(0L, 32) * 36L) + 16L) & 4294967295L;
        m.store(v[105], v[104], 4);
        v[106] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 40L) & 4294967295L;
        v[107] = m.load(v[106], 4);
        v[108] = (v[5] + (Heap.s(0L, 32) * 36L) + 24L) & 4294967295L;
        m.store(v[108], v[107], 4);
        v[109] = (v[85] + (Heap.s(0L, 32) * 66224L) + 96L + 65980L) & 4294967295L;
        v[110] = m.load(v[109], 4);
        v[111] = (v[5] + (Heap.s(0L, 32) * 36L) + 32L) & 4294967295L;
        m.store(v[111], v[110], 4);
        v[112] = (v[0] + (Heap.s(0L, 32) * 66276L) + 48L) & 4294967295L;
        v[113] = m.load(v[112], 4);
        v[114] = Dispatch.call(m, v[113], new long[]{v[0], v[85], v[5]});
        return 23;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[115] = (v[2] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[116] = m.load(v[115], 4);
        v[117] = ((v[116] * v[80])) & 4294967295L;
        v[118] = ((v[117] + 131L)) & 4294967295L;
        v[119] = LibC.call(m, "calloc", new long[]{1L, v[118]});
        v[120] = v[119] == 0L ? 1L : 0L;
        return v[120] != 0 ? 23 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[121] = (v[119]) & 4294967295L;
        v[122] = ((v[121] & 127L)) & 4294967295L;
        v[123] = ((128L - v[122])) & 4294967295L;
        v[124] = v[122] > 124L ? 1L : 0L;
        v[125] = v[124] != 0 ? 128L : 0L;
        v[126] = (v[119] + (Heap.s(v[123], 32) * 1L)) & 4294967295L;
        v[127] = (v[126] + (Heap.s(v[125], 32) * 1L)) & 4294967295L;
        v[128] = (v[127] + (Heap.s(4294967292L, 32) * 1L)) & 4294967295L;
        m.store(v[128], v[119], 4);
        v[129] = (v[1] + (Heap.s(0L, 32) * 56L) + 24L) & 4294967295L;
        v[130] = m.load(v[129], 4);
        v[131] = Dispatch.call(m, v[130], new long[]{v[1], v[2], v[127], v[80]});
        v[132] = Heap.s(v[131], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[132] != 0 ? 21 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[133] = (v[0] + (Heap.s(0L, 32) * 66276L) + 28L) & 4294967295L;
        v[134] = m.load(v[133], 4);
        v[135] = m.load(v[115], 4);
        v[136] = Dispatch.call(m, v[134], new long[]{v[0], v[135], v[127], v[80]});
        return 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        long phi137 = (previous == 19 ? v[131] : v[136]);
        v[137] = phi137;
        v[138] = v[127] == 0L ? 1L : 0L;
        return v[138] != 0 ? 23 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[139] = m.load(v[128], 4);
        LibC.call(m, "free", new long[]{v[139]});
        return 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        long phi140 = (previous == 21 ? v[137] : (previous == 22 ? v[137] : (previous == 17 ? v[114] : (previous == 2 ? 4294967190L : (previous == 1 ? v[13] : (previous == 0 ? v[9] : 4294967195L))))));
        v[140] = phi140;
        v[141] = v[140];
        return -1;
    }
}
