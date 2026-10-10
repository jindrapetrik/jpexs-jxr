package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ReadImagePlaneHeader.
 */
public final class F0397_ReadImagePlaneHeader {

    private F0397_ReadImagePlaneHeader() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[123];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                    default:
                        throw new IllegalStateException("Invalid block in ReadImagePlaneHeader");
                }
                previous = old;
                if (pc < 0) {
                    return v[122];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = F0336_getBit32_SB.run(m, v[3], 3L);
        v[5] = (v[2] + (Heap.s(0L, 32) * 112L) + 8L) & 4294967295L;
        m.store(v[5], v[4], 4);
        v[6] = v[4] > 6L ? 1L : 0L;
        return v[6] != 0 ? 32 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 32860L) + 16L) & 4294967295L;
        m.store(v[7], v[4], 4);
        v[8] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[9] = (v[2] + (Heap.s(0L, 32) * 112L) + 20L) & 4294967295L;
        m.store(v[9], v[8], 4);
        v[10] = F0336_getBit32_SB.run(m, v[3], 4L);
        v[11] = (v[1] + (Heap.s(0L, 32) * 32860L) + 40L) & 4294967295L;
        m.store(v[11], v[10], 4);
        v[12] = m.load(v[5], 4);
        switch ((int) v[12]) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 6:
                return 6;
            case 4:
                return 7;
            default:
                return 8;
        }
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        m.store(v[13], 1L, 4);
        return 8;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[14] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        m.store(v[14], 3L, 4);
        v[15] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[16] = F0336_getBit32_SB.run(m, v[3], 3L);
        v[17] = (v[16]) & 255L;
        v[18] = (v[0] + (Heap.s(0L, 32) * 72L) + 28L) & 4294967295L;
        m.store(v[18], v[17], 1);
        v[19] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[20] = F0336_getBit32_SB.run(m, v[3], 3L);
        v[21] = (v[20]) & 255L;
        v[22] = (v[0] + (Heap.s(0L, 32) * 72L) + 29L) & 4294967295L;
        m.store(v[22], v[21], 1);
        return 8;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        m.store(v[23], 3L, 4);
        v[24] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[25] = F0336_getBit32_SB.run(m, v[3], 3L);
        v[26] = (v[25]) & 255L;
        v[27] = (v[0] + (Heap.s(0L, 32) * 72L) + 28L) & 4294967295L;
        m.store(v[27], v[26], 1);
        v[28] = F0336_getBit32_SB.run(m, v[3], 4L);
        return 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[29] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        m.store(v[29], 3L, 4);
        v[30] = F0336_getBit32_SB.run(m, v[3], 4L);
        v[31] = F0336_getBit32_SB.run(m, v[3], 4L);
        return 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[32] = F0336_getBit32_SB.run(m, v[3], 4L);
        v[33] = ((v[32] + 1L)) & 4294967295L;
        v[34] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        m.store(v[34], v[33], 4);
        v[35] = F0336_getBit32_SB.run(m, v[3], 4L);
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[36] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        m.store(v[36], 4L, 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[37] = (v[0] + (Heap.s(0L, 32) * 72L) + 12L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        switch ((int) v[38]) {
            case 2:
                return 9;
            case 3:
                return 9;
            case 5:
                return 9;
            case 6:
                return 9;
            case 7:
                return 10;
            default:
                return 11;
        }
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[39] = F0336_getBit32_SB.run(m, v[3], 8L);
        v[40] = (v[39]) & 255L;
        v[41] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32832L) & 4294967295L;
        m.store(v[41], v[40], 1);
        return 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[42] = F0336_getBit32_SB.run(m, v[3], 8L);
        v[43] = (v[42]) & 255L;
        v[44] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32832L) & 4294967295L;
        m.store(v[44], v[43], 1);
        v[45] = F0336_getBit32_SB.run(m, v[3], 8L);
        v[46] = (v[45]) & 255L;
        v[47] = (v[1] + (Heap.s(0L, 32) * 32860L) + 32833L) & 4294967295L;
        m.store(v[47], v[46], 1);
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[48] = (v[2] + (Heap.s(0L, 32) * 112L) + 60L) & 4294967295L;
        m.store(v[48], 0L, 4);
        v[49] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[50] = v[49] == 1L ? 1L : 0L;
        return v[50] != 0 ? 12 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[51] = (v[2] + (Heap.s(0L, 32) * 112L) + 64L) & 4294967295L;
        v[52] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = F0373_readQuantizerSB.run(m, v[51], v[3], v[53]);
        v[55] = (v[54]) & 4294967295L;
        v[56] = ((v[55] << 3L)) & 4294967295L;
        v[57] = m.load(v[48], 4);
        return 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[58] = m.load(v[48], 4);
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi59 = (previous == 13 ? 1L : v[57]);
        long phi60 = (previous == 13 ? v[58] : v[56]);
        v[59] = phi59;
        v[60] = phi60;
        v[61] = ((v[60] + v[59])) & 4294967295L;
        m.store(v[48], v[61], 4);
        v[62] = m.load(v[11], 4);
        v[63] = v[62] == 3L ? 1L : 0L;
        return v[63] != 0 ? 27 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[64] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[65] = v[64] == 0L ? 1L : 0L;
        v[66] = m.load(v[48], 4);
        return v[65] != 0 ? 16 : 19;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[67] = ((v[66] + 512L)) & 4294967295L;
        m.store(v[48], v[67], 4);
        v[68] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[69] = v[68] == 1L ? 1L : 0L;
        return v[69] != 0 ? 17 : 18;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[70] = (v[2] + (Heap.s(0L, 32) * 112L) + 80L) & 4294967295L;
        v[71] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = F0373_readQuantizerSB.run(m, v[70], v[3], v[72]);
        v[74] = (v[73]) & 4294967295L;
        v[75] = ((v[74] << 5L)) & 4294967295L;
        v[76] = m.load(v[48], 4);
        v[77] = ((v[75] + v[76])) & 4294967295L;
        return 20;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[78] = m.load(v[48], 4);
        v[79] = ((v[78] + 2L)) & 4294967295L;
        return 20;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[80] = ((v[66] << 1L)) & 4294967295L;
        v[81] = ((v[80] & 2L)) & 4294967295L;
        v[82] = ((v[66] << 2L)) & 4294967295L;
        v[83] = ((v[82] & 96L)) & 4294967295L;
        v[84] = ((v[83] + v[66])) & 4294967295L;
        v[85] = ((v[84] + v[81])) & 4294967295L;
        return 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        long phi86 = (previous == 17 ? v[77] : (previous == 18 ? v[79] : v[85]));
        v[86] = phi86;
        m.store(v[48], v[86], 4);
        v[87] = m.load(v[11], 4);
        v[88] = v[87] == 2L ? 1L : 0L;
        return v[88] != 0 ? 28 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[89] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[90] = v[89] == 0L ? 1L : 0L;
        v[91] = m.load(v[48], 4);
        return v[90] != 0 ? 22 : 25;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[92] = ((v[91] + 1024L)) & 4294967295L;
        m.store(v[48], v[92], 4);
        v[93] = F0336_getBit32_SB.run(m, v[3], 1L);
        v[94] = v[93] == 1L ? 1L : 0L;
        return v[94] != 0 ? 23 : 24;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[95] = (v[2] + (Heap.s(0L, 32) * 112L) + 96L) & 4294967295L;
        v[96] = (v[2] + (Heap.s(0L, 32) * 112L) + 36L) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = F0373_readQuantizerSB.run(m, v[95], v[3], v[97]);
        v[99] = (v[98]) & 4294967295L;
        v[100] = ((v[99] << 7L)) & 4294967295L;
        v[101] = m.load(v[48], 4);
        v[102] = ((v[100] + v[101])) & 4294967295L;
        return 26;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[103] = m.load(v[48], 4);
        v[104] = ((v[103] + 4L)) & 4294967295L;
        return 26;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[105] = ((v[91] << 1L)) & 4294967295L;
        v[106] = ((v[105] & 4L)) & 4294967295L;
        v[107] = ((v[91] << 2L)) & 4294967295L;
        v[108] = ((v[107] & 384L)) & 4294967295L;
        v[109] = ((v[108] + v[91])) & 4294967295L;
        v[110] = ((v[109] + v[106])) & 4294967295L;
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi111 = (previous == 23 ? v[102] : (previous == 24 ? v[104] : v[110]));
        v[111] = phi111;
        m.store(v[48], v[111], 4);
        v[112] = m.load(v[11], 4);
        switch ((int) v[112]) {
            case 3:
                return 27;
            case 2:
                return 28;
            default:
                return 30;
        }
    }

    private static int b27(Heap m, long[] v, int previous) {
        long phi113 = (previous == 14 ? v[61] : v[111]);
        v[113] = phi113;
        v[114] = ((v[113] | 512L)) & 4294967295L;
        return 29;
    }

    private static int b28(Heap m, long[] v, int previous) {
        long phi115 = (previous == 20 ? v[86] : v[111]);
        v[115] = phi115;
        v[116] = ((v[115] | 1024L)) & 4294967295L;
        return 29;
    }

    private static int b29(Heap m, long[] v, int previous) {
        long phi117 = (previous == 28 ? v[116] : v[114]);
        v[117] = phi117;
        m.store(v[48], v[117], 4);
        return 30;
    }

    private static int b30(Heap m, long[] v, int previous) {
        long phi118 = (previous == 26 ? v[111] : v[117]);
        v[118] = phi118;
        v[119] = ((v[118] & 1536L)) & 4294967295L;
        v[120] = v[119] == 0L ? 1L : 0L;
        return v[120] != 0 ? 32 : 31;
    }

    private static int b31(Heap m, long[] v, int previous) {
        F0337_flushToByte_SB.run(m, v[3]);
        return 32;
    }

    private static int b32(Heap m, long[] v, int previous) {
        long phi121 = (previous == 31 ? 0L : (previous == 0 ? 4294967295L : 4294967295L));
        v[121] = phi121;
        v[122] = v[121];
        return -1;
    }
}
