package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: BlackWhite_Gray8.
 */
public final class F0191_BlackWhite_Gray8 {

    private F0191_BlackWhite_Gray8() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[119];
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
                    default:
                        throw new IllegalStateException("Invalid block in BlackWhite_Gray8");
                }
                previous = old;
                if (pc < 0) {
                    return v[118];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 56L) + 36L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = (v[7] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 32836L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[10] != 0 ? 1 : 14;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((Heap.s(v[12], 32) % Heap.s(8L, 32))) & 4294967295L;
        v[14] = ((Heap.s(v[12], 32) / Heap.s(8L, 32))) & 4294967295L;
        v[15] = Heap.s(v[13], 32) < Heap.s(1L, 32) ? 1L : 0L;
        v[16] = ((v[14] << 3L)) & 4294967295L;
        v[17] = Heap.s(v[12], 32) > Heap.s(7L, 32) ? 1L : 0L;
        v[18] = v[13] == 1L ? 1L : 0L;
        v[19] = v[13] == 2L ? 1L : 0L;
        v[20] = v[13] == 3L ? 1L : 0L;
        v[21] = v[13] == 4L ? 1L : 0L;
        v[22] = v[13] == 5L ? 1L : 0L;
        v[23] = v[13] == 6L ? 1L : 0L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[24] = Heap.s(v[25], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[24] != 0 ? 3 : 14;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi25 = (previous == 1 ? v[5] : v[26]);
        v[25] = phi25;
        v[26] = ((v[25] + 4294967295L)) & 4294967295L;
        v[27] = ((v[26] * v[3])) & 4294967295L;
        v[28] = (v[2] + (Heap.s(v[27], 32) * 1L)) & 4294967295L;
        return v[15] != 0 ? 11 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[29] = (v[28] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        v[30] = m.load(v[29], 1);
        v[31] = (v[30]) & 4294967295L;
        v[32] = (v[28] + (Heap.s(v[16], 32) * 1L)) & 4294967295L;
        v[33] = ((v[31] >>> 7L)) & 4294967295L;
        v[34] = v[33] != v[9] ? 1L : 0L;
        v[35] = (Heap.s(v[34], 1)) & 255L;
        m.store(v[32], v[35], 1);
        return v[18] != 0 ? 11 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[36] = ((v[31] >>> 6L)) & 4294967295L;
        v[37] = ((v[36] & 1L)) & 4294967295L;
        v[38] = v[37] != v[9] ? 1L : 0L;
        v[39] = (Heap.s(v[38], 1)) & 255L;
        v[40] = (v[32] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[40], v[39], 1);
        return v[19] != 0 ? 11 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[41] = ((v[31] >>> 5L)) & 4294967295L;
        v[42] = ((v[41] & 1L)) & 4294967295L;
        v[43] = v[42] != v[9] ? 1L : 0L;
        v[44] = (Heap.s(v[43], 1)) & 255L;
        v[45] = (v[32] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        m.store(v[45], v[44], 1);
        return v[20] != 0 ? 11 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[46] = ((v[31] >>> 4L)) & 4294967295L;
        v[47] = ((v[46] & 1L)) & 4294967295L;
        v[48] = v[47] != v[9] ? 1L : 0L;
        v[49] = (Heap.s(v[48], 1)) & 255L;
        v[50] = (v[32] + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        m.store(v[50], v[49], 1);
        return v[21] != 0 ? 11 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[51] = ((v[31] >>> 3L)) & 4294967295L;
        v[52] = ((v[51] & 1L)) & 4294967295L;
        v[53] = v[52] != v[9] ? 1L : 0L;
        v[54] = (Heap.s(v[53], 1)) & 255L;
        v[55] = (v[32] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        m.store(v[55], v[54], 1);
        return v[22] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[56] = ((v[31] >>> 2L)) & 4294967295L;
        v[57] = ((v[56] & 1L)) & 4294967295L;
        v[58] = v[57] != v[9] ? 1L : 0L;
        v[59] = (Heap.s(v[58], 1)) & 255L;
        v[60] = (v[32] + (Heap.s(5L, 32) * 1L)) & 4294967295L;
        m.store(v[60], v[59], 1);
        return v[23] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[61] = ((v[31] >>> 1L)) & 4294967295L;
        v[62] = ((v[61] & 1L)) & 4294967295L;
        v[63] = v[62] != v[9] ? 1L : 0L;
        v[64] = (Heap.s(v[63], 1)) & 255L;
        v[65] = (v[32] + (Heap.s(6L, 32) * 1L)) & 4294967295L;
        m.store(v[65], v[64], 1);
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        return v[17] != 0 ? 12 : 2;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[66] = (v[28] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        v[67] = (v[28] + (Heap.s(2L, 32) * 1L)) & 4294967295L;
        v[68] = (v[28] + (Heap.s(3L, 32) * 1L)) & 4294967295L;
        v[69] = (v[28] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[70] = (v[28] + (Heap.s(5L, 32) * 1L)) & 4294967295L;
        v[71] = (v[28] + (Heap.s(6L, 32) * 1L)) & 4294967295L;
        v[72] = (v[28] + (Heap.s(7L, 32) * 1L)) & 4294967295L;
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi73 = (previous == 13 ? v[74] : v[14]);
        v[73] = phi73;
        v[74] = ((v[73] + 4294967295L)) & 4294967295L;
        v[75] = (v[28] + (Heap.s(v[74], 32) * 1L)) & 4294967295L;
        v[76] = m.load(v[75], 1);
        v[77] = (v[76]) & 4294967295L;
        v[78] = ((v[74] << 3L)) & 4294967295L;
        v[79] = ((v[77] >>> 7L)) & 4294967295L;
        v[80] = v[79] != v[9] ? 1L : 0L;
        v[81] = (Heap.s(v[80], 1)) & 255L;
        v[82] = (v[28] + (Heap.s(v[78], 32) * 1L)) & 4294967295L;
        m.store(v[82], v[81], 1);
        v[83] = ((v[77] >>> 6L)) & 4294967295L;
        v[84] = ((v[83] & 1L)) & 4294967295L;
        v[85] = v[84] != v[9] ? 1L : 0L;
        v[86] = (Heap.s(v[85], 1)) & 255L;
        v[87] = (v[66] + (Heap.s(v[78], 32) * 1L)) & 4294967295L;
        m.store(v[87], v[86], 1);
        v[88] = ((v[77] >>> 5L)) & 4294967295L;
        v[89] = ((v[88] & 1L)) & 4294967295L;
        v[90] = v[89] != v[9] ? 1L : 0L;
        v[91] = (Heap.s(v[90], 1)) & 255L;
        v[92] = (v[67] + (Heap.s(v[78], 32) * 1L)) & 4294967295L;
        m.store(v[92], v[91], 1);
        v[93] = ((v[77] >>> 4L)) & 4294967295L;
        v[94] = ((v[93] & 1L)) & 4294967295L;
        v[95] = v[94] != v[9] ? 1L : 0L;
        v[96] = (Heap.s(v[95], 1)) & 255L;
        v[97] = (v[68] + (Heap.s(v[78], 32) * 1L)) & 4294967295L;
        m.store(v[97], v[96], 1);
        v[98] = ((v[77] >>> 3L)) & 4294967295L;
        v[99] = ((v[98] & 1L)) & 4294967295L;
        v[100] = v[99] != v[9] ? 1L : 0L;
        v[101] = (Heap.s(v[100], 1)) & 255L;
        v[102] = (v[69] + (Heap.s(v[78], 32) * 1L)) & 4294967295L;
        m.store(v[102], v[101], 1);
        v[103] = ((v[77] >>> 2L)) & 4294967295L;
        v[104] = ((v[103] & 1L)) & 4294967295L;
        v[105] = v[104] != v[9] ? 1L : 0L;
        v[106] = (Heap.s(v[105], 1)) & 255L;
        v[107] = (v[70] + (Heap.s(v[78], 32) * 1L)) & 4294967295L;
        m.store(v[107], v[106], 1);
        v[108] = ((v[77] >>> 1L)) & 4294967295L;
        v[109] = ((v[108] & 1L)) & 4294967295L;
        v[110] = v[109] != v[9] ? 1L : 0L;
        v[111] = (Heap.s(v[110], 1)) & 255L;
        v[112] = (v[71] + (Heap.s(v[78], 32) * 1L)) & 4294967295L;
        m.store(v[112], v[111], 1);
        v[113] = ((v[77] & 1L)) & 4294967295L;
        v[114] = v[113] != v[9] ? 1L : 0L;
        v[115] = (Heap.s(v[114], 1)) & 255L;
        v[116] = (v[72] + (Heap.s(v[78], 32) * 1L)) & 4294967295L;
        m.store(v[116], v[115], 1);
        v[117] = Heap.s(v[73], 32) > Heap.s(1L, 32) ? 1L : 0L;
        return v[117] != 0 ? 13 : 2;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[118] = 0L;
        return -1;
    }
}
