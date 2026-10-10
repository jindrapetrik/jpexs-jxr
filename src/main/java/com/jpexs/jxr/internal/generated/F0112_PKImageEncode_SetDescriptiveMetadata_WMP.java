package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib:
 * PKImageEncode_SetDescriptiveMetadata_WMP.
 */
public final class F0112_PKImageEncode_SetDescriptiveMetadata_WMP {

    private F0112_PKImageEncode_SetDescriptiveMetadata_WMP() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[61];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_SetDescriptiveMetadata_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[60];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 66276L) + 108L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 1 : 15;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L) & 4294967295L;
        v[6] = F0087_CopyDescMetadata.run(m, v[5], v[1]);
        v[7] = Heap.s(v[6], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[7] != 0 ? 15 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 8L) & 4294967295L;
        v[9] = (v[1] + (Heap.s(0L, 32) * 112L) + 8L) & 4294967295L;
        v[10] = F0087_CopyDescMetadata.run(m, v[8], v[9]);
        v[11] = Heap.s(v[10], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[11] != 0 ? 15 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 16L) & 4294967295L;
        v[13] = (v[1] + (Heap.s(0L, 32) * 112L) + 16L) & 4294967295L;
        v[14] = F0087_CopyDescMetadata.run(m, v[12], v[13]);
        v[15] = Heap.s(v[14], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[15] != 0 ? 15 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[16] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 24L) & 4294967295L;
        v[17] = (v[1] + (Heap.s(0L, 32) * 112L) + 24L) & 4294967295L;
        v[18] = F0087_CopyDescMetadata.run(m, v[16], v[17]);
        v[19] = Heap.s(v[18], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[19] != 0 ? 15 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[20] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 32L) & 4294967295L;
        v[21] = (v[1] + (Heap.s(0L, 32) * 112L) + 32L) & 4294967295L;
        v[22] = F0087_CopyDescMetadata.run(m, v[20], v[21]);
        v[23] = Heap.s(v[22], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[23] != 0 ? 15 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[24] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 40L) & 4294967295L;
        v[25] = (v[1] + (Heap.s(0L, 32) * 112L) + 40L) & 4294967295L;
        v[26] = F0087_CopyDescMetadata.run(m, v[24], v[25]);
        v[27] = Heap.s(v[26], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[27] != 0 ? 15 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[28] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 48L) & 4294967295L;
        v[29] = (v[1] + (Heap.s(0L, 32) * 112L) + 48L) & 4294967295L;
        v[30] = F0087_CopyDescMetadata.run(m, v[28], v[29]);
        v[31] = Heap.s(v[30], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[31] != 0 ? 15 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[32] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 56L) & 4294967295L;
        v[33] = (v[1] + (Heap.s(0L, 32) * 112L) + 56L) & 4294967295L;
        v[34] = F0087_CopyDescMetadata.run(m, v[32], v[33]);
        v[35] = Heap.s(v[34], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[35] != 0 ? 15 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[36] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 64L) & 4294967295L;
        v[37] = (v[1] + (Heap.s(0L, 32) * 112L) + 64L) & 4294967295L;
        v[38] = F0087_CopyDescMetadata.run(m, v[36], v[37]);
        v[39] = Heap.s(v[38], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[39] != 0 ? 15 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[40] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 72L) & 4294967295L;
        v[41] = (v[1] + (Heap.s(0L, 32) * 112L) + 72L) & 4294967295L;
        v[42] = F0087_CopyDescMetadata.run(m, v[40], v[41]);
        v[43] = Heap.s(v[42], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[43] != 0 ? 15 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[44] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 80L) & 4294967295L;
        v[45] = (v[1] + (Heap.s(0L, 32) * 112L) + 80L) & 4294967295L;
        v[46] = F0087_CopyDescMetadata.run(m, v[44], v[45]);
        v[47] = Heap.s(v[46], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[47] != 0 ? 15 : 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[48] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 88L) & 4294967295L;
        v[49] = (v[1] + (Heap.s(0L, 32) * 112L) + 88L) & 4294967295L;
        v[50] = F0087_CopyDescMetadata.run(m, v[48], v[49]);
        v[51] = Heap.s(v[50], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[51] != 0 ? 15 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[52] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 96L) & 4294967295L;
        v[53] = (v[1] + (Heap.s(0L, 32) * 112L) + 96L) & 4294967295L;
        v[54] = F0087_CopyDescMetadata.run(m, v[52], v[53]);
        v[55] = Heap.s(v[54], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[55] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[56] = (v[0] + (Heap.s(0L, 32) * 66276L) + 168L + 104L) & 4294967295L;
        v[57] = (v[1] + (Heap.s(0L, 32) * 112L) + 104L) & 4294967295L;
        v[58] = F0087_CopyDescMetadata.run(m, v[56], v[57]);
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi59 = (previous == 0 ? 4294967187L : (previous == 1 ? v[6] : (previous == 2 ? v[10] : (previous == 3 ? v[14] : (previous == 4 ? v[18] : (previous == 5 ? v[22] : (previous == 6 ? v[26] : (previous == 7 ? v[30] : (previous == 8 ? v[34] : (previous == 9 ? v[38] : (previous == 10 ? v[42] : (previous == 11 ? v[46] : (previous == 12 ? v[50] : (previous == 13 ? v[54] : v[58]))))))))))))));
        v[59] = phi59;
        v[60] = v[59];
        return -1;
    }
}
