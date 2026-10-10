package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_Transcode_WMP.
 */
public final class F0117_PKImageEncode_Transcode_WMP {

    private F0117_PKImageEncode_Transcode_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[110];
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
                    case 16:
                        pc = b16(m, v, previous);
                        break;
                    case 17:
                        pc = b17(m, v, previous);
                        break;
                    case 18:
                        pc = b18(m, v, previous);
                        break;
                    case 19:
                        pc = b19(m, v, previous);
                        break;
                    case 20:
                        pc = b20(m, v, previous);
                        break;
                    case 21:
                        pc = b21(m, v, previous);
                        break;
                    case 22:
                        pc = b22(m, v, previous);
                        break;
                    case 23:
                        pc = b23(m, v, previous);
                        break;
                    case 24:
                        pc = b24(m, v, previous);
                        break;
                    case 25:
                        pc = b25(m, v, previous);
                        break;
                    case 26:
                        pc = b26(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_Transcode_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[109];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(4L * 1L, 4);
        v[4] = m.stack(4L * 1L, 4);
        v[5] = m.stack(16L * 1L, 4);
        v[6] = m.stack(36L * 1L, 4);
        v[7] = m.stack(4L * 1L, 4);
        v[8] = m.stack(40L * 1L, 4);
        v[9] = m.stack(4L * 1L, 4);
        m.store(v[3], 0L, 4);
        m.store(v[4], 0L, 4);
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[5], 0L, 16L, 0L});
        m.store(v[7], 0L, 4);
        m.store(v[9], 0L, 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[1] + (Heap.s(0L, 32) * 66224L) + 4L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = Dispatch.call(m, v[13], new long[]{v[1], v[5]});
        v[15] = Heap.s(v[14], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[15] != 0 ? 26 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[16] = (v[0] + (Heap.s(0L, 32) * 66276L) + 8L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = Dispatch.call(m, v[17], new long[]{v[0], v[5]});
        v[19] = Heap.s(v[18], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[19] != 0 ? 26 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[20] = (v[0] + (Heap.s(0L, 32) * 66276L) + 12L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = (v[2] + (Heap.s(0L, 32) * 36L) + 4L) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = (v[2] + (Heap.s(0L, 32) * 36L) + 12L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = Dispatch.call(m, v[21], new long[]{v[0], v[23], v[25]});
        v[27] = Heap.s(v[26], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[27] != 0 ? 26 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[28] = (v[1] + (Heap.s(0L, 32) * 66224L) + 12L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = Dispatch.call(m, v[29], new long[]{v[1], v[3], v[4]});
        v[31] = Heap.s(v[30], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[31] != 0 ? 26 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[32] = (v[0] + (Heap.s(0L, 32) * 66276L) + 16L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = m.load(v[3], 4);
        v[35] = m.load(v[4], 4);
        v[36] = Dispatch.call(m, v[33], new long[]{v[0], v[34], v[35]});
        v[37] = Heap.s(v[36], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[37] != 0 ? 26 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[38] = (v[0] + (Heap.s(0L, 32) * 66276L) + 68L) & 4294967295L;
        m.store(v[8], v[38], 4);
        v[39] = F0037_PixelFormatLookup.run(m, v[8], 0L);
        v[40] = (v[8] + (Heap.s(0L, 32) * 40L) + 20L) & 4294967295L;
        v[41] = m.load(v[40], 4);
        v[42] = ((v[41] & 16L)) & 4294967295L;
        v[43] = v[42] == 0L ? 1L : 0L;
        return v[43] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[44] = (v[2] + (Heap.s(0L, 32) * 36L) + 20L) & 4294967295L;
        v[45] = m.load(v[44], 1);
        v[46] = v[45] == 2L ? 1L : 0L;
        v[47] = (v[46]) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi48 = (previous == 5 ? 0L : v[47]);
        v[48] = phi48;
        v[49] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65960L) & 4294967295L;
        m.store(v[49], v[48], 4);
        m.store(v[8], v[5], 4);
        v[50] = F0037_PixelFormatLookup.run(m, v[8], 0L);
        v[51] = m.load(v[40], 4);
        v[52] = ((v[51] & 16L)) & 4294967295L;
        v[53] = v[52] == 0L ? 1L : 0L;
        v[54] = (v[2] + (Heap.s(0L, 32) * 36L) + 20L) & 4294967295L;
        v[55] = m.load(v[54], 1);
        return v[53] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[56] = v[55] == 0L ? 1L : 0L;
        return v[56] != 0 ? 12 : 26;
    }

    private static int b9(Heap m, long[] v, int previous) {
        switch ((int) v[55]) {
            case 2:
                return 10;
            case 3:
                return 11;
            default:
                return 12;
        }
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[57] = (v[1] + (Heap.s(0L, 32) * 66224L) + 96L + 65960L) & 4294967295L;
        v[58] = m.load(v[57], 4);
        v[59] = v[58] == 0L ? 1L : 0L;
        return v[59] != 0 ? 26 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[60] = (v[1] + (Heap.s(0L, 32) * 66224L) + 96L + 65960L) & 4294967295L;
        v[61] = m.load(v[60], 4);
        v[62] = v[61] == 0L ? 1L : 0L;
        return v[62] != 0 ? 12 : 26;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi63 = (previous == 8 ? 0L : (previous == 11 ? 3L : (previous == 10 ? 2L : v[55])));
        v[63] = phi63;
        v[64] = m.load(v[49], 4);
        v[65] = v[64] == 0L ? 1L : 0L;
        v[66] = F0090_WriteContainerPre.run(m, v[0]);
        v[67] = Heap.s(v[66], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[65] != 0 ? 14 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        return v[67] != 0 ? 26 : 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        return v[67] != 0 ? 26 : 17;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[68] = v[63] == 2L ? 1L : 0L;
        return v[68] != 0 ? 16 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[6], v[2], 36L, 0L});
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        long phi69 = (previous == 16 ? 1L : (previous == 15 ? 0L : 0L));
        v[69] = phi69;
        v[70] = (v[1] + (Heap.s(0L, 32) * 66224L) + 24L) & 4294967295L;
        v[71] = m.load(v[70], 4);
        v[72] = Dispatch.call(m, v[71], new long[]{v[1], v[9]});
        v[73] = Heap.s(v[72], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[73] != 0 ? 26 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[74] = m.load(v[9], 4);
        v[75] = F0262_WMPhotoTranscode.run(m, v[74], v[11], v[2]);
        v[76] = v[75] == 0L ? 1L : 0L;
        return v[76] != 0 ? 19 : 26;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[77] = m.load(v[10], 4);
        v[78] = (v[77] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[79] = m.load(v[78], 4);
        v[80] = Dispatch.call(m, v[79], new long[]{v[77], v[7]});
        v[81] = Heap.s(v[80], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[81] != 0 ? 26 : 20;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[82] = m.load(v[7], 4);
        v[83] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65964L) & 4294967295L;
        v[84] = m.load(v[83], 4);
        v[85] = ((v[82] - v[84])) & 4294967295L;
        v[86] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65968L) & 4294967295L;
        m.store(v[86], v[85], 4);
        return v[69] != 0 ? 21 : 25;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[87] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65972L) & 4294967295L;
        m.store(v[87], v[82], 4);
        v[88] = m.load(v[9], 4);
        v[89] = (v[88] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[90] = m.load(v[89], 4);
        v[91] = (v[1] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 8L) & 4294967295L;
        v[92] = m.load(v[91], 4);
        v[93] = Dispatch.call(m, v[90], new long[]{v[88], v[92]});
        v[94] = Heap.s(v[93], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[94] != 0 ? 26 : 22;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[95] = m.load(v[9], 4);
        v[96] = F0262_WMPhotoTranscode.run(m, v[95], v[11], v[6]);
        v[97] = v[96] == 0L ? 1L : 0L;
        return v[97] != 0 ? 23 : 26;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[98] = m.load(v[10], 4);
        v[99] = (v[98] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[100] = m.load(v[99], 4);
        v[101] = Dispatch.call(m, v[100], new long[]{v[98], v[7]});
        v[102] = Heap.s(v[101], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[102] != 0 ? 26 : 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[103] = m.load(v[7], 4);
        v[104] = m.load(v[87], 4);
        v[105] = ((v[103] - v[104])) & 4294967295L;
        v[106] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65976L) & 4294967295L;
        m.store(v[106], v[105], 4);
        return 25;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[107] = F0092_WriteContainerPost.run(m, v[0]);
        return 26;
    }

    private static int b26(Heap m, long[] v, int previous) {
        long phi108 = (previous == 0 ? v[14] : (previous == 1 ? v[18] : (previous == 2 ? v[26] : (previous == 3 ? v[30] : (previous == 4 ? v[36] : (previous == 8 ? 4294967183L : (previous == 10 ? 4294967183L : (previous == 11 ? 4294967183L : (previous == 13 ? v[66] : (previous == 17 ? v[72] : (previous == 18 ? 4294967295L : (previous == 19 ? v[80] : (previous == 21 ? v[93] : (previous == 22 ? 4294967295L : (previous == 23 ? v[101] : (previous == 25 ? v[107] : v[66]))))))))))))))));
        v[108] = phi108;
        v[109] = v[108];
        return -1;
    }
}
