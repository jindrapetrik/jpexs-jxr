package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: DecodeSignificantAbsLevel.
 */
public final class F0278_DecodeSignificantAbsLevel {

    private F0278_DecodeSignificantAbsLevel() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[119];
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
                        throw new IllegalStateException("Invalid block in DecodeSignificantAbsLevel");
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
        v[2] = (v[0] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = F0353_peekBit16.run(m, v[1], 5L);
        v[5] = (v[3] + (Heap.s(v[4], 32) * 2L)) & 4294967295L;
        v[6] = m.load(v[5], 2);
        v[7] = (Heap.s(v[6], 16)) & 4294967295L;
        v[8] = Heap.s(v[6], 16) < Heap.s(0L, 16) ? 1L : 0L;
        v[9] = ((v[7] & 7L)) & 4294967295L;
        v[10] = v[8] != 0 ? 5L : v[9];
        v[11] = F0354_flushBit16.run(m, v[1], v[10]);
        v[12] = ((Heap.s(v[7], 32) >> 3L)) & 4294967295L;
        v[13] = Heap.s(v[12], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[13] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[14] = (v[3] + (Heap.s(32768L, 32) * 2L)) & 4294967295L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi15 = (previous == 2 ? v[20] : v[7]);
        v[15] = phi15;
        v[16] = F0299_getBit16.run(m, v[1], 1L);
        v[17] = (v[14] + (Heap.s(v[15], 32) * 2L)) & 4294967295L;
        v[18] = (v[17] + (Heap.s(v[16], 32) * 2L)) & 4294967295L;
        v[19] = m.load(v[18], 2);
        v[20] = (Heap.s(v[19], 16)) & 4294967295L;
        v[21] = Heap.s(v[19], 16) < Heap.s(0L, 16) ? 1L : 0L;
        return v[21] != 0 ? 2 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi22 = (previous == 0 ? v[12] : v[20]);
        v[22] = phi22;
        v[23] = (v[0] + (Heap.s(0L, 32) * 44L) + 8L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = (v[24] + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[28] + v[26])) & 4294967295L;
        m.store(v[27], v[29], 4);
        v[30] = v[22] < 2L ? 1L : 0L;
        return v[30] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[31] = ((v[22] | 2L)) & 4294967295L;
        return 11;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[32] = v[22] < 6L ? 1L : 0L;
        return v[32] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[33] = (10256L + (Heap.s(0L, 32) * 24L) + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = (10224L + (Heap.s(0L, 32) * 24L) + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[1] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = ((32L - v[34])) & 4294967295L;
        v[40] = ((v[38] >>> v[39])) & 4294967295L;
        v[41] = (v[1] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = ((v[42] + v[34])) & 4294967295L;
        v[44] = (v[1] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = ((v[43] >>> 3L)) & 4294967295L;
        v[47] = (v[45] + (Heap.s(v[46], 32) * 1L)) & 4294967295L;
        v[48] = (v[47]) & 4294967295L;
        v[49] = (v[1] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = ((v[50] & v[48])) & 4294967295L;
        v[52] = (v[51]) & 4294967295L;
        m.store(v[44], v[52], 4);
        v[53] = ((v[43] & 15L)) & 4294967295L;
        m.store(v[41], v[53], 4);
        v[54] = m.load(v[52], 4);
        v[55] = F0340__byteswap_ulong.run(m, v[54]);
        v[56] = m.load(v[41], 4);
        v[57] = ((v[55] << v[56])) & 4294967295L;
        m.store(v[37], v[57], 4);
        v[58] = ((v[40] + v[36])) & 4294967295L;
        return 11;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[59] = (v[1] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[60] = m.load(v[59], 4);
        v[61] = ((v[60] >>> 28L)) & 4294967295L;
        v[62] = (v[1] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = ((v[63] + 4L)) & 4294967295L;
        v[65] = (v[1] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[66] = m.load(v[65], 4);
        v[67] = ((v[64] >>> 3L)) & 4294967295L;
        v[68] = (v[66] + (Heap.s(v[67], 32) * 1L)) & 4294967295L;
        v[69] = (v[68]) & 4294967295L;
        v[70] = (v[1] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = ((v[71] & v[69])) & 4294967295L;
        v[73] = (v[72]) & 4294967295L;
        m.store(v[65], v[73], 4);
        v[74] = ((v[64] & 15L)) & 4294967295L;
        m.store(v[62], v[74], 4);
        v[75] = m.load(v[73], 4);
        v[76] = F0340__byteswap_ulong.run(m, v[75]);
        v[77] = m.load(v[62], 4);
        v[78] = ((v[76] << v[77])) & 4294967295L;
        m.store(v[59], v[78], 4);
        v[79] = ((v[61] + 4L)) & 4294967295L;
        v[80] = v[79] == 19L ? 1L : 0L;
        return v[80] != 0 ? 8 : 10;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[81] = ((v[78] >>> 30L)) & 4294967295L;
        v[82] = ((v[77] + 2L)) & 4294967295L;
        v[83] = m.load(v[65], 4);
        v[84] = ((v[82] >>> 3L)) & 4294967295L;
        v[85] = (v[83] + (Heap.s(v[84], 32) * 1L)) & 4294967295L;
        v[86] = (v[85]) & 4294967295L;
        v[87] = m.load(v[70], 4);
        v[88] = ((v[87] & v[86])) & 4294967295L;
        v[89] = (v[88]) & 4294967295L;
        m.store(v[65], v[89], 4);
        v[90] = ((v[82] & 15L)) & 4294967295L;
        m.store(v[62], v[90], 4);
        v[91] = m.load(v[89], 4);
        v[92] = F0340__byteswap_ulong.run(m, v[91]);
        v[93] = m.load(v[62], 4);
        v[94] = ((v[92] << v[93])) & 4294967295L;
        m.store(v[59], v[94], 4);
        v[95] = ((v[81] + 19L)) & 4294967295L;
        v[96] = v[95] == 22L ? 1L : 0L;
        return v[96] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[97] = ((v[94] >>> 29L)) & 4294967295L;
        v[98] = ((v[93] + 3L)) & 4294967295L;
        v[99] = m.load(v[65], 4);
        v[100] = ((v[98] >>> 3L)) & 4294967295L;
        v[101] = (v[99] + (Heap.s(v[100], 32) * 1L)) & 4294967295L;
        v[102] = (v[101]) & 4294967295L;
        v[103] = m.load(v[70], 4);
        v[104] = ((v[103] & v[102])) & 4294967295L;
        v[105] = (v[104]) & 4294967295L;
        m.store(v[65], v[105], 4);
        v[106] = ((v[98] & 15L)) & 4294967295L;
        m.store(v[62], v[106], 4);
        v[107] = m.load(v[105], 4);
        v[108] = F0340__byteswap_ulong.run(m, v[107]);
        v[109] = m.load(v[62], 4);
        v[110] = ((v[108] << v[109])) & 4294967295L;
        m.store(v[59], v[110], 4);
        v[111] = ((v[97] + 22L)) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi112 = (previous == 9 ? v[111] : (previous == 8 ? v[95] : v[79]));
        v[112] = phi112;
        v[113] = ((1L << v[112])) & 4294967295L;
        v[114] = ((v[113] + 2L)) & 4294967295L;
        v[115] = F0357_getBit32.run(m, v[1], v[112]);
        v[116] = ((v[114] + v[115])) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi117 = (previous == 4 ? v[31] : (previous == 6 ? v[58] : v[116]));
        v[117] = phi117;
        v[118] = v[117];
        return -1;
    }
}
