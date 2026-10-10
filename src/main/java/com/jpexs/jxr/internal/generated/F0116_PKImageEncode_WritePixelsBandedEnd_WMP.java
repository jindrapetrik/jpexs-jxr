package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_WritePixelsBandedEnd_WMP.
 */
public final class F0116_PKImageEncode_WritePixelsBandedEnd_WMP {

    private F0116_PKImageEncode_WritePixelsBandedEnd_WMP() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[67];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_WritePixelsBandedEnd_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[66];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.stack(4L * 1L, 4);
        v[2] = m.stack(4L * 1L, 4);
        v[3] = m.stack(8192L * 1L, 1);
        v[4] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 48L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33020L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = F0433_ImageStrEncTerm.run(m, v[7]);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 1 : 16;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = (v[5] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = Dispatch.call(m, v[11], new long[]{v[13], v[1]});
        v[15] = Heap.s(v[14], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[15] != 0 ? 16 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[16] = m.load(v[1], 4);
        v[17] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65964L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = ((v[16] - v[18])) & 4294967295L;
        v[20] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65968L) & 4294967295L;
        m.store(v[20], v[19], 4);
        v[21] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65960L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = v[22] == 0L ? 1L : 0L;
        return v[23] != 0 ? 15 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[24] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 36L) & 4294967295L;
        v[25] = m.load(v[24], 1);
        v[26] = v[25] == 2L ? 1L : 0L;
        return v[26] != 0 ? 4 : 15;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[27] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L + 48L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65956L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = F0433_ImageStrEncTerm.run(m, v[30]);
        v[32] = v[31] == 0L ? 1L : 0L;
        return v[32] != 0 ? 5 : 13;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[33] = (v[28] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = Dispatch.call(m, v[34], new long[]{v[28], v[2]});
        v[36] = Heap.s(v[35], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[36] != 0 ? 13 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[37] = (v[28] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = Dispatch.call(m, v[38], new long[]{v[28], 0L});
        v[40] = Heap.s(v[39], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[40] != 0 ? 13 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[41] = m.load(v[2], 4);
        v[42] = v[41] == 0L ? 1L : 0L;
        return v[42] != 0 ? 14 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[43] = (v[28] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[44] = (v[5] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi45 = (previous == 8 ? v[41] : v[57]);
        long phi46 = (previous == 8 ? 0L : v[56]);
        v[45] = phi45;
        v[46] = phi46;
        v[47] = ((v[45] - v[46])) & 4294967295L;
        v[48] = LibC.call(m, "llvm.umin.i32", new long[]{v[47], 8192L});
        v[49] = m.load(v[43], 4);
        v[50] = Dispatch.call(m, v[49], new long[]{v[28], v[3], v[48]});
        v[51] = Heap.s(v[50], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[51] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[52] = m.load(v[44], 4);
        v[53] = Dispatch.call(m, v[52], new long[]{v[5], v[3], v[48]});
        v[54] = Heap.s(v[53], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[54] != 0 ? 11 : 12;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi55 = (previous == 10 ? v[53] : v[50]);
        v[55] = phi55;
        return 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[56] = ((v[48] + v[46])) & 4294967295L;
        v[57] = m.load(v[2], 4);
        v[58] = v[56] < v[57] ? 1L : 0L;
        return v[58] != 0 ? 9 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi59 = (previous == 11 ? v[55] : (previous == 6 ? v[39] : (previous == 5 ? v[35] : 4294967295L)));
        v[59] = phi59;
        return 16;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi60 = (previous == 7 ? 0L : v[57]);
        v[60] = phi60;
        v[61] = m.load(v[1], 4);
        v[62] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65972L) & 4294967295L;
        m.store(v[62], v[61], 4);
        v[63] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65976L) & 4294967295L;
        m.store(v[63], v[60], 4);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[64] = F0092_WriteContainerPost.run(m, v[0]);
        return 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi65 = (previous == 0 ? 4294967295L : (previous == 1 ? v[14] : (previous == 15 ? v[64] : v[59])));
        v[65] = phi65;
        v[66] = v[65];
        return -1;
    }
}
