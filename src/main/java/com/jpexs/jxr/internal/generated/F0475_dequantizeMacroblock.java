package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: dequantizeMacroblock.
 */
public final class F0475_dequantizeMacroblock {

    private F0475_dequantizeMacroblock() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[142];
        v[0] = a0;
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
                    default:
                        throw new IllegalStateException("Invalid block in dequantizeMacroblock");
                }
                previous = old;
                if (pc < 0) {
                    return v[141];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L) & 4294967295L;
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[3] + (Heap.s(v[5], 32) * 240L)) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 10 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 8L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 40L) & 4294967295L;
        v[13] = ((v[11] + 4294967293L)) & 4294967295L;
        v[14] = v[13] < 4294967294L ? 1L : 0L;
        v[15] = v[11] == 2L ? 1L : 0L;
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32960L + 1156L) & 4294967295L;
        v[17] = m.load(14196L, 4);
        v[18] = m.load(14200L, 4);
        v[19] = m.load(14204L, 4);
        v[20] = m.load(14208L, 4);
        v[21] = m.load(14212L, 4);
        v[22] = m.load(14216L, 4);
        v[23] = m.load(14220L, 4);
        v[24] = m.load(14224L, 4);
        v[25] = m.load(14228L, 4);
        v[26] = m.load(14232L, 4);
        v[27] = m.load(14236L, 4);
        v[28] = m.load(14240L, 4);
        v[29] = m.load(14244L, 4);
        v[30] = m.load(14248L, 4);
        v[31] = m.load(14252L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi32 = (previous == 1 ? 0L : v[139]);
        v[32] = phi32;
        v[33] = (v[1] + (Heap.s(0L, 32) * 1024L) + (Heap.s(v[32], 32) * 64L)) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = (v[6] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[32], 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[35], 4);
        v[37] = (v[36] + (Heap.s(0L, 32) * 20L) + 4L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = ((v[38] * v[34])) & 4294967295L;
        v[40] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34716L + (Heap.s(v[32], 32) * 4L)) & 4294967295L;
        v[41] = m.load(v[40], 4);
        m.store(v[41], v[39], 4);
        v[42] = m.load(v[12], 4);
        v[43] = v[42] == 3L ? 1L : 0L;
        return v[43] != 0 ? 9 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[44] = v[32] == 0L ? 1L : 0L;
        v[45] = v[44] != 0 ? 1L : v[14];
        v[46] = (v[3] + (Heap.s(v[5], 32) * 240L) + 64L + (Heap.s(v[32], 32) * 4L)) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = m.load(v[16], 1);
        v[49] = (v[48]) & 4294967295L;
        v[50] = (v[47] + (Heap.s(v[49], 32) * 20L) + 4L) & 4294967295L;
        v[51] = m.load(v[50], 4);
        v[52] = (v[33] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[53] = m.load(v[52], 4);
        v[54] = ((v[53] * v[51])) & 4294967295L;
        return v[45] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[55] = (v[41] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        m.store(v[55], v[54], 4);
        v[56] = (v[33] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[57] = m.load(v[56], 4);
        v[58] = ((v[57] * v[51])) & 4294967295L;
        v[59] = (v[41] + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        m.store(v[59], v[58], 4);
        v[60] = (v[33] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = ((v[61] * v[51])) & 4294967295L;
        v[63] = (v[41] + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        m.store(v[63], v[62], 4);
        v[64] = (v[33] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[65] = m.load(v[64], 4);
        v[66] = ((v[65] * v[51])) & 4294967295L;
        v[67] = (v[41] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        m.store(v[67], v[66], 4);
        v[68] = (v[33] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[69] = m.load(v[68], 4);
        v[70] = ((v[69] * v[51])) & 4294967295L;
        v[71] = (v[41] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        m.store(v[71], v[70], 4);
        v[72] = (v[33] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = ((v[73] * v[51])) & 4294967295L;
        v[75] = (v[41] + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        m.store(v[75], v[74], 4);
        v[76] = (v[33] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[77] = m.load(v[76], 4);
        v[78] = ((v[77] * v[51])) & 4294967295L;
        v[79] = (v[41] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        m.store(v[79], v[78], 4);
        v[80] = (v[33] + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[81] = m.load(v[80], 4);
        v[82] = ((v[81] * v[51])) & 4294967295L;
        v[83] = (v[41] + (Heap.s(v[24], 32) * 4L)) & 4294967295L;
        m.store(v[83], v[82], 4);
        v[84] = (v[33] + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = ((v[85] * v[51])) & 4294967295L;
        v[87] = (v[41] + (Heap.s(v[25], 32) * 4L)) & 4294967295L;
        m.store(v[87], v[86], 4);
        v[88] = (v[33] + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[89] = m.load(v[88], 4);
        v[90] = ((v[89] * v[51])) & 4294967295L;
        v[91] = (v[41] + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        m.store(v[91], v[90], 4);
        v[92] = (v[33] + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[93] = m.load(v[92], 4);
        v[94] = ((v[93] * v[51])) & 4294967295L;
        v[95] = (v[41] + (Heap.s(v[27], 32) * 4L)) & 4294967295L;
        m.store(v[95], v[94], 4);
        v[96] = (v[33] + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = ((v[97] * v[51])) & 4294967295L;
        v[99] = (v[41] + (Heap.s(v[28], 32) * 4L)) & 4294967295L;
        m.store(v[99], v[98], 4);
        v[100] = (v[33] + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[101] = m.load(v[100], 4);
        v[102] = ((v[101] * v[51])) & 4294967295L;
        v[103] = (v[41] + (Heap.s(v[29], 32) * 4L)) & 4294967295L;
        m.store(v[103], v[102], 4);
        v[104] = (v[33] + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[105] = m.load(v[104], 4);
        v[106] = ((v[105] * v[51])) & 4294967295L;
        v[107] = (v[41] + (Heap.s(v[30], 32) * 4L)) & 4294967295L;
        m.store(v[107], v[106], 4);
        v[108] = (v[33] + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        return 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[109] = (v[33] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[110] = (v[41] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[111] = (v[33] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        return v[15] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[112] = (v[41] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        m.store(v[112], v[54], 4);
        v[113] = m.load(v[109], 4);
        v[114] = ((v[113] * v[51])) & 4294967295L;
        m.store(v[110], v[114], 4);
        v[115] = m.load(v[111], 4);
        v[116] = ((v[115] * v[51])) & 4294967295L;
        v[117] = (v[41] + (Heap.s(80L, 32) * 4L)) & 4294967295L;
        m.store(v[117], v[116], 4);
        v[118] = (v[33] + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[119] = m.load(v[118], 4);
        v[120] = ((v[119] * v[51])) & 4294967295L;
        v[121] = (v[41] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        m.store(v[121], v[120], 4);
        v[122] = (v[33] + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[123] = m.load(v[122], 4);
        v[124] = ((v[123] * v[51])) & 4294967295L;
        v[125] = (v[41] + (Heap.s(96L, 32) * 4L)) & 4294967295L;
        m.store(v[125], v[124], 4);
        v[126] = (v[33] + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[127] = m.load(v[126], 4);
        v[128] = ((v[127] * v[51])) & 4294967295L;
        v[129] = (v[41] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        m.store(v[129], v[128], 4);
        v[130] = (v[33] + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[131] = (v[41] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        m.store(v[131], v[54], 4);
        v[132] = m.load(v[109], 4);
        v[133] = ((v[132] * v[51])) & 4294967295L;
        m.store(v[110], v[133], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi134 = (previous == 6 ? v[130] : (previous == 7 ? v[111] : v[108]));
        long phi135 = (previous == 6 ? 112L : (previous == 7 ? 48L : v[31]));
        v[134] = phi134;
        v[135] = phi135;
        v[136] = m.load(v[134], 4);
        v[137] = ((v[136] * v[51])) & 4294967295L;
        v[138] = (v[41] + (Heap.s(v[135], 32) * 4L)) & 4294967295L;
        m.store(v[138], v[137], 4);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[139] = ((v[32] + 1L)) & 4294967295L;
        v[140] = v[139] == v[8] ? 1L : 0L;
        return v[140] != 0 ? 10 : 2;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[141] = 0L;
        return -1;
    }
}
