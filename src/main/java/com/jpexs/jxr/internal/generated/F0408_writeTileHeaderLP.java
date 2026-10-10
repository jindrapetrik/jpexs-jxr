package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writeTileHeaderLP.
 */
public final class F0408_writeTileHeaderLP {

    private F0408_writeTileHeaderLP() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[90];
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
                    default:
                        throw new IllegalStateException("Invalid block in writeTileHeaderLP");
                }
                previous = old;
                if (pc < 0) {
                    return v[89];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        v[5] = v[4] != 0 ? 1L : 2L;
        return 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi6 = (previous == 0 ? v[5] : v[86]);
        long phi7 = (previous == 0 ? v[0] : v[85]);
        v[6] = phi6;
        v[7] = phi7;
        v[8] = (v[7] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = v[9] == 3L ? 1L : 0L;
        return v[10] != 0 ? 16 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[12] & 2L)) & 4294967295L;
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 16 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[15] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = LibC.call(m, "rand", new long[]{});
        v[20] = ((v[19] & 1L)) & 4294967295L;
        v[21] = ((v[20] ^ 1L)) & 4294967295L;
        v[22] = (v[16] + (Heap.s(v[18], 32) * 240L) + 196L) & 4294967295L;
        m.store(v[22], v[21], 4);
        F0297_putBit16.run(m, v[1], v[21], 1L);
        v[23] = (v[16] + (Heap.s(v[18], 32) * 240L) + 194L) & 4294967295L;
        m.store(v[23], 0L, 1);
        v[24] = m.load(v[22], 4);
        v[25] = v[24] == 1L ? 1L : 0L;
        return v[25] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[26] = LibC.call(m, "rand", new long[]{});
        v[27] = ((v[26] & 15L)) & 4294967295L;
        v[28] = ((v[27] + 1L)) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi29 = (previous == 4 ? v[28] : 1L);
        v[29] = phi29;
        v[30] = (v[29]) & 255L;
        v[31] = (v[16] + (Heap.s(v[18], 32) * 240L) + 192L) & 4294967295L;
        m.store(v[31], v[30], 1);
        v[32] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = v[33] == 0L ? 1L : 0L;
        return v[34] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[35] = (v[16] + (Heap.s(v[18], 32) * 240L) + 64L) & 4294967295L;
        F0346_freeQuantizer.run(m, v[35]);
        v[36] = m.load(v[31], 1);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi37 = (previous == 6 ? v[36] : v[30]);
        v[37] = phi37;
        v[38] = (v[16] + (Heap.s(v[18], 32) * 240L) + 64L) & 4294967295L;
        v[39] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = (v[37]) & 4294967295L;
        v[42] = F0347_allocateQuantizer.run(m, v[38], v[40], v[41]);
        v[43] = v[42] == 0L ? 1L : 0L;
        return v[43] != 0 ? 8 : 17;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[44] = m.load(v[22], 4);
        v[45] = v[44] == 1L ? 1L : 0L;
        return v[45] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[46] = m.load(v[17], 4);
        F0350_useDCQuantizer.run(m, v[7], v[46]);
        return 16;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[47] = m.load(v[31], 1);
        v[48] = (v[47]) & 4294967295L;
        v[49] = ((v[48] + 4294967295L)) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[49], 4L);
        v[50] = m.load(v[31], 1);
        v[51] = F0352_dquantBits.run(m, v[50]);
        m.store(v[23], v[51], 1);
        v[52] = m.load(v[31], 1);
        v[53] = v[52] == 0L ? 1L : 0L;
        return v[53] != 0 ? 16 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[54] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi55 = (previous == 11 ? 0L : v[80]);
        v[55] = phi55;
        v[56] = LibC.call(m, "rand", new long[]{});
        v[57] = (v[56]) & 255L;
        v[58] = ((v[57] & 3L)) & 255L;
        v[59] = (v[16] + (Heap.s(v[18], 32) * 240L) + 205L + (Heap.s(v[55], 32) * 1L)) & 4294967295L;
        m.store(v[59], v[58], 1);
        v[60] = m.load(v[39], 4);
        v[61] = v[60] == 0L ? 1L : 0L;
        return v[61] != 0 ? 15 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi62 = (previous == 13 ? v[71] : 0L);
        long phi63 = (previous == 13 ? v[70] : 0L);
        v[62] = phi62;
        v[63] = phi63;
        v[64] = LibC.call(m, "rand", new long[]{});
        v[65] = (v[64]) & 255L;
        v[66] = ((v[65] | 1L)) & 255L;
        v[67] = (v[16] + (Heap.s(v[18], 32) * 240L) + 64L + (Heap.s(v[62], 32) * 4L)) & 4294967295L;
        v[68] = m.load(v[67], 4);
        v[69] = (v[68] + (Heap.s(v[55], 32) * 20L)) & 4294967295L;
        m.store(v[69], v[66], 1);
        v[70] = ((v[63] + 1L)) & 255L;
        v[71] = (v[70]) & 4294967295L;
        v[72] = m.load(v[39], 4);
        v[73] = v[72] > v[71] ? 1L : 0L;
        return v[73] != 0 ? 13 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[74] = m.load(v[59], 1);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi75 = (previous == 12 ? v[58] : v[74]);
        long phi76 = (previous == 12 ? 0L : v[72]);
        v[75] = phi75;
        v[76] = phi76;
        v[77] = m.load(v[54], 4);
        F0348_formatQuantizer.run(m, v[38], v[75], v[76], v[55], 1L, v[77]);
        v[78] = m.load(v[59], 1);
        v[79] = m.load(v[39], 4);
        F0405_writeQuantizer.run(m, v[38], v[1], v[78], v[79], v[55]);
        v[80] = ((v[55] + 1L)) & 4294967295L;
        v[81] = m.load(v[31], 1);
        v[82] = (v[81]) & 4294967295L;
        v[83] = v[80] < v[82] ? 1L : 0L;
        return v[83] != 0 ? 12 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[84] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = ((v[6] + 4294967295L)) & 4294967295L;
        v[87] = v[86] == 0L ? 1L : 0L;
        return v[87] != 0 ? 17 : 1;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi88 = (previous == 16 ? 0L : 4294967295L);
        v[88] = phi88;
        v[89] = v[88];
        return -1;
    }
}
