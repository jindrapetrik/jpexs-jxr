package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readTileHeaderHP.
 */
public final class F0378_readTileHeaderHP {

    private F0378_readTileHeaderHP() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[63];
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
                    default:
                        throw new IllegalStateException("Invalid block in readTileHeaderHP");
                }
                previous = old;
                if (pc < 0) {
                    return v[62];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = ((v[3] & 4294967294L)) & 4294967295L;
        v[5] = v[4] == 2L ? 1L : 0L;
        return v[5] != 0 ? 11 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = ((v[7] & 4L)) & 4294967295L;
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 11 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = F0299_getBit16.run(m, v[1], 1L);
        v[15] = v[14] == 1L ? 1L : 0L;
        v[16] = (v[15]) & 4294967295L;
        v[17] = (v[11] + (Heap.s(v[13], 32) * 240L) + 200L) & 4294967295L;
        m.store(v[17], v[16], 4);
        v[18] = (v[11] + (Heap.s(v[13], 32) * 240L) + 195L) & 4294967295L;
        m.store(v[18], 0L, 1);
        v[19] = (v[11] + (Heap.s(v[13], 32) * 240L) + 193L) & 4294967295L;
        m.store(v[19], 1L, 1);
        v[20] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = v[21] == 0L ? 1L : 0L;
        return v[22] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[23] = (v[11] + (Heap.s(v[13], 32) * 240L) + 128L) & 4294967295L;
        F0346_freeQuantizer.run(m, v[23]);
        v[24] = m.load(v[17], 4);
        v[25] = v[24] == 1L ? 1L : 0L;
        return v[25] != 0 ? 5 : 7;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[15] != 0 ? 5 : 7;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[26] = (v[11] + (Heap.s(v[13], 32) * 240L) + 192L) & 4294967295L;
        v[27] = m.load(v[26], 1);
        m.store(v[19], v[27], 1);
        v[28] = (v[11] + (Heap.s(v[13], 32) * 240L) + 128L) & 4294967295L;
        v[29] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = (v[27]) & 4294967295L;
        v[32] = F0347_allocateQuantizer.run(m, v[28], v[30], v[31]);
        v[33] = v[32] == 0L ? 1L : 0L;
        return v[33] != 0 ? 6 : 11;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[34] = m.load(v[19], 1);
        v[35] = (v[34]) & 4294967295L;
        v[36] = m.load(v[12], 4);
        F0351_useLPQuantizer.run(m, v[0], v[35], v[36]);
        return 11;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[37] = F0299_getBit16.run(m, v[1], 4L);
        v[38] = (v[37]) & 255L;
        v[39] = ((v[38] + 1L)) & 255L;
        m.store(v[19], v[39], 1);
        v[40] = F0352_dquantBits.run(m, v[39]);
        m.store(v[18], v[40], 1);
        v[41] = (v[11] + (Heap.s(v[13], 32) * 240L) + 128L) & 4294967295L;
        v[42] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = m.load(v[19], 1);
        v[45] = (v[44]) & 4294967295L;
        v[46] = F0347_allocateQuantizer.run(m, v[41], v[43], v[45]);
        v[47] = v[46] == 0L ? 1L : 0L;
        return v[47] != 0 ? 8 : 11;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[48] = m.load(v[19], 1);
        v[49] = v[48] == 0L ? 1L : 0L;
        return v[49] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[50] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi51 = (previous == 9 ? 0L : v[57]);
        v[51] = phi51;
        v[52] = m.load(v[42], 4);
        v[53] = F0374_readQuantizer.run(m, v[41], v[1], v[52], v[51]);
        v[54] = (v[11] + (Heap.s(v[13], 32) * 240L) + 221L + (Heap.s(v[51], 32) * 1L)) & 4294967295L;
        m.store(v[54], v[53], 1);
        v[55] = m.load(v[42], 4);
        v[56] = m.load(v[50], 4);
        F0348_formatQuantizer.run(m, v[41], v[53], v[55], v[51], 0L, v[56]);
        v[57] = ((v[51] + 1L)) & 4294967295L;
        v[58] = m.load(v[19], 1);
        v[59] = (v[58]) & 4294967295L;
        v[60] = v[57] < v[59] ? 1L : 0L;
        return v[60] != 0 ? 10 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi61 = (previous == 7 ? 4294967295L : (previous == 5 ? 4294967295L : (previous == 0 ? 0L : (previous == 1 ? 0L : (previous == 6 ? 0L : (previous == 8 ? 0L : 0L))))));
        v[61] = phi61;
        v[62] = v[61];
        return -1;
    }
}
