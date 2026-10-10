package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: DecodeSignificantRun.
 */
public final class F0272_DecodeSignificantRun {

    private F0272_DecodeSignificantRun() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[96];
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
                    default:
                        throw new IllegalStateException("Invalid block in DecodeSignificantRun");
                }
                previous = old;
                if (pc < 0) {
                    return v[95];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = Heap.s(v[0], 32) < Heap.s(5L, 32) ? 1L : 0L;
        return v[3] != 0 ? 1 : 13;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = v[0] == 1L ? 1L : 0L;
        return v[4] != 0 ? 15 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[5] = (v[2] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[2] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] + 1L)) & 4294967295L;
        m.store(v[7], v[9], 4);
        v[10] = v[9] < 16L ? 1L : 0L;
        return v[10] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[11] = ((v[6] << 1L)) & 4294967295L;
        return 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[12] = (v[2] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[9] >>> 3L)) & 4294967295L;
        v[15] = (v[13] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        v[16] = (v[15]) & 4294967295L;
        v[17] = (v[2] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = ((v[18] & v[16])) & 4294967295L;
        v[20] = (v[19]) & 4294967295L;
        m.store(v[12], v[20], 4);
        v[21] = ((v[9] & 15L)) & 4294967295L;
        m.store(v[7], v[21], 4);
        v[22] = m.load(v[20], 4);
        v[23] = F0340__byteswap_ulong.run(m, v[22]);
        v[24] = m.load(v[7], 4);
        v[25] = ((v[23] << v[24])) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi26 = (previous == 4 ? v[24] : v[9]);
        long phi27 = (previous == 4 ? v[25] : v[11]);
        v[26] = phi26;
        v[27] = phi27;
        m.store(v[5], v[27], 4);
        v[28] = Heap.s(v[6], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        return v[28] != 0 ? 6 : 15;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[29] = v[0] == 2L ? 1L : 0L;
        return v[29] != 0 ? 15 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[30] = ((v[26] + 1L)) & 4294967295L;
        m.store(v[7], v[30], 4);
        v[31] = v[30] < 16L ? 1L : 0L;
        return v[31] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[32] = ((v[27] << 1L)) & 4294967295L;
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[33] = (v[2] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = ((v[30] >>> 3L)) & 4294967295L;
        v[36] = (v[34] + (Heap.s(v[35], 32) * 1L)) & 4294967295L;
        v[37] = (v[36]) & 4294967295L;
        v[38] = (v[2] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = ((v[39] & v[37])) & 4294967295L;
        v[41] = (v[40]) & 4294967295L;
        m.store(v[33], v[41], 4);
        v[42] = ((v[30] & 15L)) & 4294967295L;
        m.store(v[7], v[42], 4);
        v[43] = m.load(v[41], 4);
        v[44] = F0340__byteswap_ulong.run(m, v[43]);
        v[45] = m.load(v[7], 4);
        v[46] = ((v[44] << v[45])) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi47 = (previous == 9 ? v[46] : v[32]);
        v[47] = phi47;
        m.store(v[5], v[47], 4);
        v[48] = Heap.s(v[27], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        return v[48] != 0 ? 11 : 15;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[49] = v[0] == 3L ? 1L : 0L;
        return v[49] != 0 ? 15 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[50] = F0273__getBool16.run(m, v[2]);
        v[51] = v[50] == 0L ? 1L : 0L;
        v[52] = v[51] != 0 ? 4L : 3L;
        return 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[53] = (11008L + (Heap.s(0L, 32) * 0L) + (Heap.s(v[0], 32) * 4L)) & 4294967295L;
        v[54] = m.load(v[53], 4);
        v[55] = (v[1] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[56] = m.load(v[55], 4);
        v[57] = (v[2] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[58] = m.load(v[57], 4);
        v[59] = ((v[58] >>> 27L)) & 4294967295L;
        v[60] = (v[56] + (Heap.s(v[59], 32) * 2L)) & 4294967295L;
        v[61] = m.load(v[60], 2);
        v[62] = (Heap.s(v[61], 16)) & 4294967295L;
        v[63] = ((v[62] & 7L)) & 4294967295L;
        v[64] = F0354_flushBit16.run(m, v[2], v[63]);
        v[65] = ((Heap.s(v[62], 32) >> 3L)) & 4294967295L;
        v[66] = ((v[54] * 5L)) & 4294967295L;
        v[67] = ((v[65] + v[66])) & 4294967295L;
        v[68] = (10128L + (Heap.s(0L, 32) * 60L) + (Heap.s(v[67], 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = (11072L + (Heap.s(0L, 32) * 0L) + (Heap.s(v[67], 32) * 4L)) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = v[71] == 0L ? 1L : 0L;
        return v[72] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[73] = m.load(v[57], 4);
        v[74] = ((32L - v[71])) & 4294967295L;
        v[75] = ((v[73] >>> v[74])) & 4294967295L;
        v[76] = (v[2] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = ((v[77] + v[71])) & 4294967295L;
        v[79] = (v[2] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[80] = m.load(v[79], 4);
        v[81] = ((v[78] >>> 3L)) & 4294967295L;
        v[82] = (v[80] + (Heap.s(v[81], 32) * 1L)) & 4294967295L;
        v[83] = (v[82]) & 4294967295L;
        v[84] = (v[2] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = ((v[85] & v[83])) & 4294967295L;
        v[87] = (v[86]) & 4294967295L;
        m.store(v[79], v[87], 4);
        v[88] = ((v[78] & 15L)) & 4294967295L;
        m.store(v[76], v[88], 4);
        v[89] = m.load(v[87], 4);
        v[90] = F0340__byteswap_ulong.run(m, v[89]);
        v[91] = m.load(v[76], 4);
        v[92] = ((v[90] << v[91])) & 4294967295L;
        m.store(v[57], v[92], 4);
        v[93] = ((v[75] + v[69])) & 4294967295L;
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi94 = (previous == 1 ? 1L : (previous == 5 ? 1L : (previous == 10 ? 2L : (previous == 6 ? 2L : (previous == 11 ? 3L : (previous == 14 ? v[93] : (previous == 13 ? v[69] : v[52])))))));
        v[94] = phi94;
        v[95] = v[94];
        return -1;
    }
}
