package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: port_decode.
 */
public final class F0013_port_decode {

    private F0013_port_decode() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[165];
        v[0] = a0;
        v[1] = a1;
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
                    default:
                        throw new IllegalStateException("Invalid block in port_decode");
                }
                previous = old;
                if (pc < 0) {
                    return v[164];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.stack(16L * 1L, 4);
        v[3] = m.stack(4L * 1L, 4);
        v[4] = m.stack(4L * 1L, 4);
        v[5] = m.stack(4L * 1L, 4);
        v[6] = m.stack(4L * 1L, 4);
        v[7] = m.stack(4L * 1L, 4);
        v[8] = m.stack(16L * 1L, 4);
        v[9] = m.stack(16L * 1L, 4);
        m.store(v[3], 0L, 4);
        m.store(v[4], 0L, 4);
        m.store(v[5], 0L, 4);
        m.store(v[6], 0L, 4);
        m.store(v[7], 0L, 4);
        v[10] = F0009_open_decoder.run(m, v[0], v[1], v[5], v[6]);
        v[11] = Heap.s(v[10], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[11] != 0 ? 18 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = m.load(v[6], 4);
        v[13] = (v[12] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 60L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = v[14] > 7L ? 1L : 0L;
        return v[15] != 0 ? 18 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        m.store(v[13], 0L, 4);
        v[16] = F0010_image_info.run(m, v[12], v[2], v[8]);
        v[17] = Heap.s(v[16], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[17] != 0 ? 18 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[18] = v[14] < 4L ? 1L : 0L;
        v[19] = (v[2] + (Heap.s(0L, 32) * 16L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = m.load(v[2], 4);
        v[22] = v[18] != 0 ? v[21] : v[20];
        v[23] = v[18] != 0 ? v[20] : v[21];
        v[24] = (v[2] + (Heap.s(0L, 32) * 16L) + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = v[25] == 1L ? 1L : 0L;
        v[27] = v[25] == 0L ? 1L : 0L;
        v[28] = v[27] != 0 ? 3L : 1L;
        v[29] = v[26] != 0 ? 4L : v[28];
        v[30] = (v[2] + (Heap.s(0L, 32) * 16L) + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = ((v[29] << 3L)) & 4294967295L;
        v[33] = LibC.call(m, "llvm.smax.i32", new long[]{v[31], v[32]});
        v[34] = ((v[33] * v[21])) & 4294967295L;
        v[35] = ((v[34] + 7L)) & 4294967295L;
        v[36] = ((v[35] >>> 3L)) & 4294967295L;
        v[37] = ((536870912L / v[20])) & 4294967295L;
        v[38] = v[36] > v[37] ? 1L : 0L;
        return v[38] != 0 ? 18 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[39] = ((v[36] * v[20])) & 4294967295L;
        v[40] = F0033_PKAllocAligned.run(m, v[3], v[39], 128L);
        v[41] = Heap.s(v[40], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[41] != 0 ? 18 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[42] = F0050_PKCodecFactory_CreateFormatConverter.run(m, v[7]);
        v[43] = Heap.s(v[42], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[43] != 0 ? 18 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[44] = m.load(v[7], 4);
        v[45] = m.load(v[44], 4);
        v[46] = m.load(v[6], 4);
        v[47] = Dispatch.call(m, v[45], new long[]{v[44], v[46], 0L, v[8]});
        v[48] = Heap.s(v[47], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[48] != 0 ? 18 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[49] = m.load(v[24], 4);
        v[50] = v[49] == 1L ? 1L : 0L;
        v[51] = v[50] != 0 ? 2L : 0L;
        v[52] = m.load(v[6], 4);
        v[53] = (v[52] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 36L) & 4294967295L;
        m.store(v[53], v[51], 1);
        v[54] = (v[9] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        m.store(v[54], 0L, 4);
        m.store(v[9], 0L, 4);
        v[55] = m.load(v[2], 4);
        v[56] = (v[9] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        m.store(v[56], v[55], 4);
        v[57] = m.load(v[19], 4);
        v[58] = (v[9] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        m.store(v[58], v[57], 4);
        v[59] = m.load(v[7], 4);
        v[60] = (v[59] + (Heap.s(0L, 32) * 56L) + 24L) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = m.load(v[3], 4);
        v[63] = Dispatch.call(m, v[61], new long[]{v[59], v[9], v[62], v[36]});
        v[64] = Heap.s(v[63], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[64] != 0 ? 18 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[65] = m.load(v[2], 4);
        v[66] = m.load(v[19], 4);
        v[67] = ((v[65] * v[29])) & 4294967295L;
        v[68] = ((v[67] * v[66])) & 4294967295L;
        v[69] = F0030_PKAlloc.run(m, v[4], v[68]);
        v[70] = Heap.s(v[69], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        v[71] = m.load(v[19], 4);
        v[72] = Heap.s(v[71], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[73] = v[70] != 0 ? v[72] : 0L;
        return v[73] != 0 ? 9 : 18;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[74] = ((v[14] & 2L)) & 4294967295L;
        v[75] = v[74] == 0L ? 1L : 0L;
        v[76] = ((v[14] & 1L)) & 4294967295L;
        v[77] = v[76] == 0L ? 1L : 0L;
        v[78] = m.load(v[2], 4);
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi79 = (previous == 9 ? v[71] : v[134]);
        long phi80 = (previous == 9 ? v[78] : v[135]);
        long phi81 = (previous == 9 ? 0L : v[136]);
        v[79] = phi79;
        v[80] = phi80;
        v[81] = phi81;
        v[82] = Heap.s(v[80], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[82] != 0 ? 11 : 17;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[83] = ((v[81] ^ 4294967295L)) & 4294967295L;
        v[84] = ((v[81] * v[36])) & 4294967295L;
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi85 = (previous == 11 ? 0L : v[130]);
        v[85] = phi85;
        v[86] = m.load(v[19], 4);
        v[87] = ((v[86] + v[83])) & 4294967295L;
        v[88] = v[18] != 0 ? v[81] : v[85];
        v[89] = v[18] != 0 ? v[85] : v[87];
        v[90] = ((v[89] ^ 4294967295L)) & 4294967295L;
        v[91] = ((v[22] + v[90])) & 4294967295L;
        v[92] = v[75] != 0 ? v[89] : v[91];
        v[93] = ((v[88] ^ 4294967295L)) & 4294967295L;
        v[94] = ((v[23] + v[93])) & 4294967295L;
        v[95] = v[77] != 0 ? v[88] : v[94];
        v[96] = m.load(v[24], 4);
        v[97] = v[96] == 3L ? 1L : 0L;
        return v[97] != 0 ? 13 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[98] = m.load(v[3], 4);
        v[99] = ((v[85] >>> 3L)) & 4294967295L;
        v[100] = (v[98] + (Heap.s(v[84], 32) * 1L)) & 4294967295L;
        v[101] = (v[100] + (Heap.s(v[99], 32) * 1L)) & 4294967295L;
        v[102] = m.load(v[101], 1);
        v[103] = (v[102]) & 4294967295L;
        v[104] = ((v[85] & 7L)) & 4294967295L;
        v[105] = ((v[104] ^ 7L)) & 4294967295L;
        v[106] = ((v[103] >>> v[105])) & 4294967295L;
        v[107] = ((v[106] & 1L)) & 4294967295L;
        v[108] = m.load(v[6], 4);
        v[109] = (v[108] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 32836L) & 4294967295L;
        v[110] = m.load(v[109], 4);
        v[111] = v[110] != 0L ? 1L : 0L;
        v[112] = (v[111]) & 4294967295L;
        v[113] = ((v[107] ^ v[112])) & 4294967295L;
        v[114] = (v[113]) & 255L;
        v[115] = ((0L - v[114])) & 255L;
        v[116] = m.load(v[4], 4);
        v[117] = ((v[95] * v[22])) & 4294967295L;
        v[118] = (v[116] + (Heap.s(v[117], 32) * 1L)) & 4294967295L;
        v[119] = (v[118] + (Heap.s(v[92], 32) * 1L)) & 4294967295L;
        m.store(v[119], v[115], 1);
        return 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[120] = m.load(v[4], 4);
        v[121] = ((v[95] * v[22])) & 4294967295L;
        v[122] = ((v[92] + v[121])) & 4294967295L;
        v[123] = ((v[122] * v[29])) & 4294967295L;
        v[124] = (v[120] + (Heap.s(v[123], 32) * 1L)) & 4294967295L;
        v[125] = m.load(v[3], 4);
        v[126] = (v[125] + (Heap.s(v[84], 32) * 1L)) & 4294967295L;
        v[127] = ((v[85] * v[29])) & 4294967295L;
        v[128] = (v[126] + (Heap.s(v[127], 32) * 1L)) & 4294967295L;
        v[129] = LibC.call(m, "memcpy", new long[]{v[124], v[128], v[29]});
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[130] = ((v[85] + 1L)) & 4294967295L;
        v[131] = m.load(v[2], 4);
        v[132] = Heap.s(v[130], 32) < Heap.s(v[131], 32) ? 1L : 0L;
        return v[132] != 0 ? 12 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[133] = m.load(v[19], 4);
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi134 = (previous == 16 ? v[133] : v[79]);
        long phi135 = (previous == 16 ? v[131] : v[80]);
        v[134] = phi134;
        v[135] = phi135;
        v[136] = ((v[81] + 1L)) & 4294967295L;
        v[137] = Heap.s(v[136], 32) < Heap.s(v[134], 32) ? 1L : 0L;
        return v[137] != 0 ? 10 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi138 = (previous == 0 ? v[10] : (previous == 1 ? 4294967190L : (previous == 2 ? v[16] : (previous == 3 ? 4294967195L : (previous == 4 ? v[40] : (previous == 5 ? v[42] : (previous == 6 ? v[47] : (previous == 7 ? v[63] : (previous == 8 ? v[69] : v[69])))))))));
        v[138] = phi138;
        v[139] = m.load(v[3], 4);
        v[140] = v[139] == 0L ? 1L : 0L;
        return v[140] != 0 ? 20 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[141] = F0034_PKFreeAligned.run(m, v[3]);
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[142] = m.load(v[7], 4);
        v[143] = v[142] == 0L ? 1L : 0L;
        return v[143] != 0 ? 22 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[144] = (v[142] + (Heap.s(0L, 32) * 56L) + 32L) & 4294967295L;
        v[145] = m.load(v[144], 4);
        v[146] = Dispatch.call(m, v[145], new long[]{v[7]});
        return 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[147] = m.load(v[6], 4);
        v[148] = v[147] == 0L ? 1L : 0L;
        return v[148] != 0 ? 24 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[149] = (v[147] + (Heap.s(0L, 32) * 66224L) + 40L) & 4294967295L;
        v[150] = m.load(v[149], 4);
        v[151] = Dispatch.call(m, v[150], new long[]{v[6]});
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[152] = m.load(v[5], 4);
        v[153] = v[152] == 0L ? 1L : 0L;
        return v[153] != 0 ? 26 : 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[154] = (v[152] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[155] = m.load(v[154], 4);
        v[156] = Dispatch.call(m, v[155], new long[]{v[5]});
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[157] = v[138] != 0L ? 1L : 0L;
        v[158] = m.load(v[4], 4);
        v[159] = v[158] != 0L ? 1L : 0L;
        v[160] = v[157] != 0 ? v[159] : 0L;
        return v[160] != 0 ? 27 : 28;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[161] = F0032_PKFree.run(m, v[4]);
        v[162] = m.load(v[4], 4);
        return 28;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi163 = (previous == 27 ? v[162] : v[158]);
        v[163] = phi163;
        m.store(3584L, v[138], 4);
        v[164] = v[163];
        return -1;
    }
}
