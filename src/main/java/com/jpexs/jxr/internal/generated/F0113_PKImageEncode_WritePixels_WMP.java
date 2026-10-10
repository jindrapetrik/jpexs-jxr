package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_WritePixels_WMP.
 */
public final class F0113_PKImageEncode_WritePixels_WMP {

    private F0113_PKImageEncode_WritePixels_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[30];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_WritePixels_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[29];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.stack(40L * 1L, 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65984L) & 4294967295L;
        m.store(v[5], 4L, 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 66276L) + 68L) & 4294967295L;
        m.store(v[4], v[6], 4);
        v[7] = F0037_PixelFormatLookup.run(m, v[4], 0L);
        v[8] = (v[4] + (Heap.s(0L, 32) * 40L) + 20L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[9] >>> 4L)) & 4294967295L;
        v[11] = ((v[10] & 1L)) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65960L) & 4294967295L;
        m.store(v[12], v[11], 4);
        v[13] = (v[0] + (Heap.s(0L, 32) * 66276L) + 108L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = v[14] == 0L ? 1L : 0L;
        return v[15] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[16] = F0090_WriteContainerPre.run(m, v[0]);
        v[17] = Heap.s(v[16], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[17] != 0 ? 8 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        m.store(v[13], 1L, 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[18] = F0098_PKImageEncode_EncodeContent.run(m, v[0], v[4], v[1], v[2], v[3]);
        v[19] = Heap.s(v[18], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[19] != 0 ? 8 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[20] = m.load(v[12], 4);
        v[21] = v[20] == 0L ? 1L : 0L;
        return v[21] != 0 ? 7 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[22] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 36L) & 4294967295L;
        v[23] = m.load(v[22], 1);
        v[24] = v[23] == 2L ? 1L : 0L;
        return v[24] != 0 ? 6 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[25] = F0102_PKImageEncode_EncodeAlpha.run(m, v[0], v[4], v[1], v[2], v[3]);
        v[26] = Heap.s(v[25], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[26] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[27] = F0092_WriteContainerPost.run(m, v[0]);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi28 = (previous == 1 ? v[16] : (previous == 3 ? v[18] : (previous == 6 ? v[25] : v[27])));
        v[28] = phi28;
        v[29] = v[28];
        return -1;
    }
}
