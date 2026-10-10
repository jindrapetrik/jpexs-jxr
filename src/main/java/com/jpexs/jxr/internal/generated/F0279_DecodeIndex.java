package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: DecodeIndex.
 */
public final class F0279_DecodeIndex {

    private F0279_DecodeIndex() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[115];
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
                    default:
                        throw new IllegalStateException("Invalid block in DecodeIndex");
                }
                previous = old;
                if (pc < 0) {
                    return v[114];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = Heap.s(v[1], 32) < Heap.s(15L, 32) ? 1L : 0L;
        return v[4] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[2] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[3] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] >>> 27L)) & 4294967295L;
        v[10] = (v[6] + (Heap.s(v[9], 32) * 2L)) & 4294967295L;
        v[11] = m.load(v[10], 2);
        v[12] = (Heap.s(v[11], 16)) & 4294967295L;
        v[13] = ((v[12] & 7L)) & 4294967295L;
        v[14] = F0354_flushBit16.run(m, v[3], v[13]);
        v[15] = ((Heap.s(v[12], 32) >> 3L)) & 4294967295L;
        v[16] = (v[2] + (Heap.s(0L, 32) * 44L) + 8L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[17] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = (v[2] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((v[21] + v[19])) & 4294967295L;
        m.store(v[20], v[22], 4);
        v[23] = (v[2] + (Heap.s(0L, 32) * 44L) + 12L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = (v[24] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[2] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[28] + v[26])) & 4294967295L;
        m.store(v[27], v[29], 4);
        return 16;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[30] = v[1] == 15L ? 1L : 0L;
        v[31] = (v[3] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[32] = m.load(v[31], 4);
        return v[30] != 0 ? 3 : 15;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[33] = (v[3] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = ((v[34] + 1L)) & 4294967295L;
        m.store(v[33], v[35], 4);
        v[36] = v[35] < 16L ? 1L : 0L;
        return v[36] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[37] = ((v[32] << 1L)) & 4294967295L;
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[38] = (v[3] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = ((v[35] >>> 3L)) & 4294967295L;
        v[41] = (v[39] + (Heap.s(v[40], 32) * 1L)) & 4294967295L;
        v[42] = (v[41]) & 4294967295L;
        v[43] = (v[3] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = ((v[44] & v[42])) & 4294967295L;
        v[46] = (v[45]) & 4294967295L;
        m.store(v[38], v[46], 4);
        v[47] = ((v[35] & 15L)) & 4294967295L;
        m.store(v[33], v[47], 4);
        v[48] = m.load(v[46], 4);
        v[49] = F0340__byteswap_ulong.run(m, v[48]);
        v[50] = m.load(v[33], 4);
        v[51] = ((v[49] << v[50])) & 4294967295L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi52 = (previous == 5 ? v[50] : v[35]);
        long phi53 = (previous == 5 ? v[51] : v[37]);
        v[52] = phi52;
        v[53] = phi53;
        m.store(v[31], v[53], 4);
        v[54] = Heap.s(v[32], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        return v[54] != 0 ? 16 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[55] = ((v[52] + 1L)) & 4294967295L;
        m.store(v[33], v[55], 4);
        v[56] = v[55] < 16L ? 1L : 0L;
        return v[56] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[57] = ((v[53] << 1L)) & 4294967295L;
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[58] = (v[3] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[59] = m.load(v[58], 4);
        v[60] = ((v[55] >>> 3L)) & 4294967295L;
        v[61] = (v[59] + (Heap.s(v[60], 32) * 1L)) & 4294967295L;
        v[62] = (v[61]) & 4294967295L;
        v[63] = (v[3] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[64] = m.load(v[63], 4);
        v[65] = ((v[64] & v[62])) & 4294967295L;
        v[66] = (v[65]) & 4294967295L;
        m.store(v[58], v[66], 4);
        v[67] = ((v[55] & 15L)) & 4294967295L;
        m.store(v[33], v[67], 4);
        v[68] = m.load(v[66], 4);
        v[69] = F0340__byteswap_ulong.run(m, v[68]);
        v[70] = m.load(v[33], 4);
        v[71] = ((v[69] << v[70])) & 4294967295L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi72 = (previous == 9 ? v[70] : v[55]);
        long phi73 = (previous == 9 ? v[71] : v[57]);
        v[72] = phi72;
        v[73] = phi73;
        m.store(v[31], v[73], 4);
        v[74] = Heap.s(v[53], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        return v[74] != 0 ? 16 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[75] = ((v[72] + 1L)) & 4294967295L;
        m.store(v[33], v[75], 4);
        v[76] = v[75] < 16L ? 1L : 0L;
        return v[76] != 0 ? 12 : 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[77] = ((v[73] << 1L)) & 4294967295L;
        return 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[78] = (v[3] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[79] = m.load(v[78], 4);
        v[80] = ((v[75] >>> 3L)) & 4294967295L;
        v[81] = (v[79] + (Heap.s(v[80], 32) * 1L)) & 4294967295L;
        v[82] = (v[81]) & 4294967295L;
        v[83] = (v[3] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = ((v[84] & v[82])) & 4294967295L;
        v[86] = (v[85]) & 4294967295L;
        m.store(v[78], v[86], 4);
        v[87] = ((v[75] & 15L)) & 4294967295L;
        m.store(v[33], v[87], 4);
        v[88] = m.load(v[86], 4);
        v[89] = F0340__byteswap_ulong.run(m, v[88]);
        v[90] = m.load(v[33], 4);
        v[91] = ((v[89] << v[90])) & 4294967295L;
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi92 = (previous == 13 ? v[91] : v[77]);
        v[92] = phi92;
        m.store(v[31], v[92], 4);
        v[93] = ((v[73] >>> 30L)) & 4294967295L;
        v[94] = ((v[93] | 1L)) & 4294967295L;
        return 16;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[95] = ((v[32] >>> 31L)) & 4294967295L;
        v[96] = (v[3] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = ((v[97] + 1L)) & 4294967295L;
        v[99] = (v[3] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[100] = m.load(v[99], 4);
        v[101] = ((v[98] >>> 3L)) & 4294967295L;
        v[102] = (v[100] + (Heap.s(v[101], 32) * 1L)) & 4294967295L;
        v[103] = (v[102]) & 4294967295L;
        v[104] = (v[3] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[105] = m.load(v[104], 4);
        v[106] = ((v[105] & v[103])) & 4294967295L;
        v[107] = (v[106]) & 4294967295L;
        m.store(v[99], v[107], 4);
        v[108] = ((v[98] & 15L)) & 4294967295L;
        m.store(v[96], v[108], 4);
        v[109] = m.load(v[107], 4);
        v[110] = F0340__byteswap_ulong.run(m, v[109]);
        v[111] = m.load(v[96], 4);
        v[112] = ((v[110] << v[111])) & 4294967295L;
        m.store(v[31], v[112], 4);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi113 = (previous == 15 ? v[95] : (previous == 1 ? v[15] : (previous == 14 ? v[94] : (previous == 6 ? 0L : 2L))));
        v[113] = phi113;
        m.store(v[0], v[113], 4);
        return -1;
    }
}
