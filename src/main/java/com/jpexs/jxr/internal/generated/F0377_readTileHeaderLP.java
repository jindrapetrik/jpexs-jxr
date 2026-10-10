package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readTileHeaderLP.
 */
public final class F0377_readTileHeaderLP {

    private F0377_readTileHeaderLP() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[59];
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
                        throw new IllegalStateException("Invalid block in readTileHeaderLP");
                }
                previous = old;
                if (pc < 0) {
                    return v[58];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 3L ? 1L : 0L;
        return v[4] != 0 ? 11 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = ((v[6] & 2L)) & 4294967295L;
        v[8] = v[7] == 0L ? 1L : 0L;
        return v[8] != 0 ? 11 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = F0299_getBit16.run(m, v[1], 1L);
        v[14] = v[13] == 1L ? 1L : 0L;
        v[15] = (v[14]) & 4294967295L;
        v[16] = (v[10] + (Heap.s(v[12], 32) * 240L) + 196L) & 4294967295L;
        m.store(v[16], v[15], 4);
        v[17] = (v[10] + (Heap.s(v[12], 32) * 240L) + 194L) & 4294967295L;
        m.store(v[17], 0L, 1);
        v[18] = (v[10] + (Heap.s(v[12], 32) * 240L) + 192L) & 4294967295L;
        m.store(v[18], 1L, 1);
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = v[20] == 0L ? 1L : 0L;
        return v[21] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[22] = (v[10] + (Heap.s(v[12], 32) * 240L) + 64L) & 4294967295L;
        F0346_freeQuantizer.run(m, v[22]);
        v[23] = m.load(v[16], 4);
        v[24] = v[23] == 1L ? 1L : 0L;
        return v[24] != 0 ? 5 : 7;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[14] != 0 ? 5 : 7;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = (v[10] + (Heap.s(v[12], 32) * 240L) + 64L) & 4294967295L;
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = m.load(v[18], 1);
        v[29] = (v[28]) & 4294967295L;
        v[30] = F0347_allocateQuantizer.run(m, v[25], v[27], v[29]);
        v[31] = v[30] == 0L ? 1L : 0L;
        return v[31] != 0 ? 6 : 11;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[32] = m.load(v[11], 4);
        F0350_useDCQuantizer.run(m, v[0], v[32]);
        return 11;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[33] = F0299_getBit16.run(m, v[1], 4L);
        v[34] = (v[33]) & 255L;
        v[35] = ((v[34] + 1L)) & 255L;
        m.store(v[18], v[35], 1);
        v[36] = F0352_dquantBits.run(m, v[35]);
        m.store(v[17], v[36], 1);
        v[37] = (v[10] + (Heap.s(v[12], 32) * 240L) + 64L) & 4294967295L;
        v[38] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = m.load(v[18], 1);
        v[41] = (v[40]) & 4294967295L;
        v[42] = F0347_allocateQuantizer.run(m, v[37], v[39], v[41]);
        v[43] = v[42] == 0L ? 1L : 0L;
        return v[43] != 0 ? 8 : 11;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[44] = m.load(v[18], 1);
        v[45] = v[44] == 0L ? 1L : 0L;
        return v[45] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[46] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi47 = (previous == 9 ? 0L : v[53]);
        v[47] = phi47;
        v[48] = m.load(v[38], 4);
        v[49] = F0374_readQuantizer.run(m, v[37], v[1], v[48], v[47]);
        v[50] = (v[10] + (Heap.s(v[12], 32) * 240L) + 205L + (Heap.s(v[47], 32) * 1L)) & 4294967295L;
        m.store(v[50], v[49], 1);
        v[51] = m.load(v[38], 4);
        v[52] = m.load(v[46], 4);
        F0348_formatQuantizer.run(m, v[37], v[49], v[51], v[47], 1L, v[52]);
        v[53] = ((v[47] + 1L)) & 4294967295L;
        v[54] = m.load(v[18], 1);
        v[55] = (v[54]) & 4294967295L;
        v[56] = v[53] < v[55] ? 1L : 0L;
        return v[56] != 0 ? 10 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi57 = (previous == 7 ? 4294967295L : (previous == 5 ? 4294967295L : (previous == 1 ? 0L : (previous == 0 ? 0L : (previous == 6 ? 0L : (previous == 8 ? 0L : 0L))))));
        v[57] = phi57;
        v[58] = v[57];
        return -1;
    }
}
