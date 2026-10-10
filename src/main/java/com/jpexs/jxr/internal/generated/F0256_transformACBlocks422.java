package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transformACBlocks422.
 */
public final class F0256_transformACBlocks422 {

    private F0256_transformACBlocks422() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[124];
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
                    default:
                        throw new IllegalStateException("Invalid block in transformACBlocks422");
                }
                previous = old;
                if (pc < 0) {
                    return v[123];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = ((197L >>> v[2])) & 4294967295L;
        v[4] = ((v[3] & 1L)) & 4294967295L;
        v[5] = v[4] == 0L ? 1L : 0L;
        v[6] = ((83L >>> v[2])) & 4294967295L;
        v[7] = ((v[6] & 1L)) & 4294967295L;
        v[8] = v[7] == 0L ? 1L : 0L;
        v[9] = m.load(14068L, 4);
        v[10] = m.load(14076L, 4);
        v[11] = m.load(14084L, 4);
        v[12] = m.load(14092L, 4);
        v[13] = m.load(14100L, 4);
        v[14] = m.load(14108L, 4);
        v[15] = m.load(14116L, 4);
        v[16] = m.load(14124L, 4);
        v[17] = m.load(14080L, 4);
        v[18] = m.load(14112L, 4);
        v[19] = m.load(14084L, 4);
        v[20] = m.load(14088L, 4);
        v[21] = m.load(14120L, 4);
        v[22] = m.load(14092L, 4);
        v[23] = m.load(14124L, 4);
        return 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[24] = v[5] != 0 ? 48L : 0L;
        v[25] = ((v[7] << 6L)) & 4294967295L;
        v[26] = ((v[24] | v[25])) & 4294967295L;
        v[27] = ((v[26] ^ 64L)) & 4294967295L;
        v[28] = (v[1] + (Heap.s(v[27], 32) * 4L)) & 4294967295L;
        v[29] = LibC.call(m, "memcpy", new long[]{v[28], v[0], 64L});
        v[30] = v[5] != 0 ? 32L : 16L;
        v[31] = ((v[30] | v[25])) & 4294967295L;
        v[32] = ((v[31] ^ 64L)) & 4294967295L;
        v[33] = (v[1] + (Heap.s(v[32], 32) * 4L)) & 4294967295L;
        v[34] = (v[0] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[35] = LibC.call(m, "memcpy", new long[]{v[33], v[34], 64L});
        v[36] = v[5] != 0 ? 16L : 32L;
        v[37] = ((v[36] | v[25])) & 4294967295L;
        v[38] = ((v[37] ^ 64L)) & 4294967295L;
        v[39] = (v[1] + (Heap.s(v[38], 32) * 4L)) & 4294967295L;
        v[40] = (v[0] + (Heap.s(32L, 32) * 4L)) & 4294967295L;
        v[41] = LibC.call(m, "memcpy", new long[]{v[39], v[40], 64L});
        v[42] = v[5] != 0 ? 0L : 48L;
        v[43] = ((v[42] | v[25])) & 4294967295L;
        v[44] = ((v[43] ^ 64L)) & 4294967295L;
        v[45] = (v[1] + (Heap.s(v[44], 32) * 4L)) & 4294967295L;
        v[46] = (v[0] + (Heap.s(48L, 32) * 4L)) & 4294967295L;
        v[47] = LibC.call(m, "memcpy", new long[]{v[45], v[46], 64L});
        v[48] = ((v[7] << 6L)) & 4294967295L;
        v[49] = ((v[48] ^ 64L)) & 4294967295L;
        v[50] = ((v[24] | v[49])) & 4294967295L;
        v[51] = ((v[50] ^ 64L)) & 4294967295L;
        v[52] = (v[1] + (Heap.s(v[51], 32) * 4L)) & 4294967295L;
        v[53] = (v[0] + (Heap.s(64L, 32) * 4L)) & 4294967295L;
        v[54] = LibC.call(m, "memcpy", new long[]{v[52], v[53], 64L});
        v[55] = ((v[30] | v[49])) & 4294967295L;
        v[56] = ((v[55] ^ 64L)) & 4294967295L;
        v[57] = (v[1] + (Heap.s(v[56], 32) * 4L)) & 4294967295L;
        v[58] = (v[0] + (Heap.s(80L, 32) * 4L)) & 4294967295L;
        v[59] = LibC.call(m, "memcpy", new long[]{v[57], v[58], 64L});
        v[60] = ((v[36] | v[49])) & 4294967295L;
        v[61] = ((v[60] ^ 64L)) & 4294967295L;
        v[62] = (v[1] + (Heap.s(v[61], 32) * 4L)) & 4294967295L;
        v[63] = (v[0] + (Heap.s(96L, 32) * 4L)) & 4294967295L;
        v[64] = LibC.call(m, "memcpy", new long[]{v[62], v[63], 64L});
        v[65] = ((v[42] | v[49])) & 4294967295L;
        v[66] = ((v[65] ^ 64L)) & 4294967295L;
        v[67] = (v[1] + (Heap.s(v[66], 32) * 4L)) & 4294967295L;
        v[68] = (v[0] + (Heap.s(112L, 32) * 4L)) & 4294967295L;
        v[69] = LibC.call(m, "memcpy", new long[]{v[67], v[68], 64L});
        return -1;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi70 = (previous == 0 ? v[0] : v[121]);
        long phi71 = (previous == 0 ? 0L : v[120]);
        v[70] = phi70;
        v[71] = phi71;
        return v[5] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[72] = (v[70] + (Heap.s(v[9], 32) * 4L)) & 4294967295L;
        v[73] = m.load(v[72], 4);
        v[74] = ((0L - v[73])) & 4294967295L;
        m.store(v[72], v[74], 4);
        v[75] = (v[70] + (Heap.s(v[10], 32) * 4L)) & 4294967295L;
        v[76] = m.load(v[75], 4);
        v[77] = ((0L - v[76])) & 4294967295L;
        m.store(v[75], v[77], 4);
        v[78] = (v[70] + (Heap.s(v[11], 32) * 4L)) & 4294967295L;
        v[79] = m.load(v[78], 4);
        v[80] = ((0L - v[79])) & 4294967295L;
        m.store(v[78], v[80], 4);
        v[81] = (v[70] + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[82] = m.load(v[81], 4);
        v[83] = ((0L - v[82])) & 4294967295L;
        m.store(v[81], v[83], 4);
        v[84] = (v[70] + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[85] = m.load(v[84], 4);
        v[86] = ((0L - v[85])) & 4294967295L;
        m.store(v[84], v[86], 4);
        v[87] = (v[70] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[88] = m.load(v[87], 4);
        v[89] = ((0L - v[88])) & 4294967295L;
        m.store(v[87], v[89], 4);
        v[90] = (v[70] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[91] = m.load(v[90], 4);
        v[92] = ((0L - v[91])) & 4294967295L;
        m.store(v[90], v[92], 4);
        v[93] = (v[70] + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        v[94] = m.load(v[93], 4);
        v[95] = ((0L - v[94])) & 4294967295L;
        m.store(v[93], v[95], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return v[8] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[96] = (v[70] + (Heap.s(v[17], 32) * 4L)) & 4294967295L;
        v[97] = m.load(v[96], 4);
        v[98] = ((0L - v[97])) & 4294967295L;
        m.store(v[96], v[98], 4);
        v[99] = (v[70] + (Heap.s(v[18], 32) * 4L)) & 4294967295L;
        v[100] = m.load(v[99], 4);
        v[101] = ((0L - v[100])) & 4294967295L;
        m.store(v[99], v[101], 4);
        v[102] = (v[70] + (Heap.s(v[19], 32) * 4L)) & 4294967295L;
        v[103] = m.load(v[102], 4);
        v[104] = ((0L - v[103])) & 4294967295L;
        m.store(v[102], v[104], 4);
        v[105] = (v[70] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[106] = m.load(v[105], 4);
        v[107] = ((0L - v[106])) & 4294967295L;
        m.store(v[105], v[107], 4);
        v[108] = (v[70] + (Heap.s(v[20], 32) * 4L)) & 4294967295L;
        v[109] = m.load(v[108], 4);
        v[110] = ((0L - v[109])) & 4294967295L;
        m.store(v[108], v[110], 4);
        v[111] = (v[70] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[112] = m.load(v[111], 4);
        v[113] = ((0L - v[112])) & 4294967295L;
        m.store(v[111], v[113], 4);
        v[114] = (v[70] + (Heap.s(v[22], 32) * 4L)) & 4294967295L;
        v[115] = m.load(v[114], 4);
        v[116] = ((0L - v[115])) & 4294967295L;
        m.store(v[114], v[116], 4);
        v[117] = (v[70] + (Heap.s(v[23], 32) * 4L)) & 4294967295L;
        v[118] = m.load(v[117], 4);
        v[119] = ((0L - v[118])) & 4294967295L;
        m.store(v[117], v[119], 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[120] = ((v[71] + 1L)) & 4294967295L;
        v[121] = (v[70] + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[122] = v[120] == 8L ? 1L : 0L;
        return v[122] != 0 ? 1 : 2;
    }
}
