package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writeTileHeaderHP.
 */
public final class F0409_writeTileHeaderHP {

    private F0409_writeTileHeaderHP() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[94];
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
                    default:
                        throw new IllegalStateException("Invalid block in writeTileHeaderHP");
                }
                previous = old;
                if (pc < 0) {
                    return v[93];
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
        long phi6 = (previous == 0 ? v[5] : v[90]);
        long phi7 = (previous == 0 ? v[0] : v[89]);
        v[6] = phi6;
        v[7] = phi7;
        v[8] = (v[7] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[9] & 4294967294L)) & 4294967295L;
        v[11] = v[10] == 2L ? 1L : 0L;
        return v[11] != 0 ? 17 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[13] & 4L)) & 4294967295L;
        v[15] = v[14] == 0L ? 1L : 0L;
        return v[15] != 0 ? 17 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[16] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = LibC.call(m, "rand", new long[]{});
        v[21] = ((v[20] & 1L)) & 4294967295L;
        v[22] = ((v[21] ^ 1L)) & 4294967295L;
        v[23] = (v[17] + (Heap.s(v[19], 32) * 240L) + 200L) & 4294967295L;
        m.store(v[23], v[22], 4);
        F0297_putBit16.run(m, v[1], v[22], 1L);
        v[24] = (v[17] + (Heap.s(v[19], 32) * 240L) + 195L) & 4294967295L;
        m.store(v[24], 0L, 1);
        v[25] = m.load(v[23], 4);
        v[26] = v[25] == 1L ? 1L : 0L;
        return v[26] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[27] = (v[17] + (Heap.s(v[19], 32) * 240L) + 192L) & 4294967295L;
        v[28] = m.load(v[27], 1);
        v[29] = (v[28]) & 4294967295L;
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[30] = LibC.call(m, "rand", new long[]{});
        v[31] = ((v[30] & 15L)) & 4294967295L;
        v[32] = ((v[31] + 1L)) & 4294967295L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi33 = (previous == 4 ? v[29] : v[32]);
        v[33] = phi33;
        v[34] = (v[33]) & 255L;
        v[35] = (v[17] + (Heap.s(v[19], 32) * 240L) + 193L) & 4294967295L;
        m.store(v[35], v[34], 1);
        v[36] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = v[37] == 0L ? 1L : 0L;
        return v[38] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[39] = (v[17] + (Heap.s(v[19], 32) * 240L) + 128L) & 4294967295L;
        F0346_freeQuantizer.run(m, v[39]);
        v[40] = m.load(v[35], 1);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi41 = (previous == 7 ? v[40] : v[34]);
        v[41] = phi41;
        v[42] = (v[17] + (Heap.s(v[19], 32) * 240L) + 128L) & 4294967295L;
        v[43] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = (v[41]) & 4294967295L;
        v[46] = F0347_allocateQuantizer.run(m, v[42], v[44], v[45]);
        v[47] = v[46] == 0L ? 1L : 0L;
        return v[47] != 0 ? 9 : 18;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[48] = m.load(v[23], 4);
        v[49] = v[48] == 1L ? 1L : 0L;
        v[50] = m.load(v[35], 1);
        v[51] = (v[50]) & 4294967295L;
        return v[49] != 0 ? 10 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[52] = m.load(v[18], 4);
        F0351_useLPQuantizer.run(m, v[7], v[51], v[52]);
        return 17;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[53] = ((v[51] + 4294967295L)) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[53], 4L);
        v[54] = m.load(v[35], 1);
        v[55] = F0352_dquantBits.run(m, v[54]);
        m.store(v[24], v[55], 1);
        v[56] = m.load(v[35], 1);
        v[57] = v[56] == 0L ? 1L : 0L;
        return v[57] != 0 ? 17 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[58] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi59 = (previous == 12 ? 0L : v[84]);
        v[59] = phi59;
        v[60] = LibC.call(m, "rand", new long[]{});
        v[61] = (v[60]) & 255L;
        v[62] = ((v[61] & 3L)) & 255L;
        v[63] = (v[17] + (Heap.s(v[19], 32) * 240L) + 221L + (Heap.s(v[59], 32) * 1L)) & 4294967295L;
        m.store(v[63], v[62], 1);
        v[64] = m.load(v[43], 4);
        v[65] = v[64] == 0L ? 1L : 0L;
        return v[65] != 0 ? 16 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi66 = (previous == 14 ? v[75] : 0L);
        long phi67 = (previous == 14 ? v[74] : 0L);
        v[66] = phi66;
        v[67] = phi67;
        v[68] = LibC.call(m, "rand", new long[]{});
        v[69] = (v[68]) & 255L;
        v[70] = ((v[69] | 1L)) & 255L;
        v[71] = (v[17] + (Heap.s(v[19], 32) * 240L) + 128L + (Heap.s(v[66], 32) * 4L)) & 4294967295L;
        v[72] = m.load(v[71], 4);
        v[73] = (v[72] + (Heap.s(v[59], 32) * 20L)) & 4294967295L;
        m.store(v[73], v[70], 1);
        v[74] = ((v[67] + 1L)) & 255L;
        v[75] = (v[74]) & 4294967295L;
        v[76] = m.load(v[43], 4);
        v[77] = v[76] > v[75] ? 1L : 0L;
        return v[77] != 0 ? 14 : 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[78] = m.load(v[63], 1);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi79 = (previous == 13 ? v[62] : v[78]);
        long phi80 = (previous == 13 ? 0L : v[76]);
        v[79] = phi79;
        v[80] = phi80;
        v[81] = m.load(v[58], 4);
        F0348_formatQuantizer.run(m, v[42], v[79], v[80], v[59], 0L, v[81]);
        v[82] = m.load(v[63], 1);
        v[83] = m.load(v[43], 4);
        F0405_writeQuantizer.run(m, v[42], v[1], v[82], v[83], v[59]);
        v[84] = ((v[59] + 1L)) & 4294967295L;
        v[85] = m.load(v[35], 1);
        v[86] = (v[85]) & 4294967295L;
        v[87] = v[84] < v[86] ? 1L : 0L;
        return v[87] != 0 ? 13 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[88] = (v[7] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[89] = m.load(v[88], 4);
        v[90] = ((v[6] + 4294967295L)) & 4294967295L;
        v[91] = v[90] == 0L ? 1L : 0L;
        return v[91] != 0 ? 18 : 1;
    }

    private static int b18(Heap m, long[] v, int previous) {
        long phi92 = (previous == 17 ? 0L : 4294967295L);
        v[92] = phi92;
        v[93] = v[92];
        return -1;
    }
}
