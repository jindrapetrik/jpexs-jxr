package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ImageStrEncTerm.
 */
public final class F0433_ImageStrEncTerm {

    private F0433_ImageStrEncTerm() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[55];
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
                    case 17:
                        pc = b17(m, v, previous);
                        break;
                    case 18:
                        pc = b18(m, v, previous);
                        break;
                    case 19:
                        pc = b19(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in ImageStrEncTerm");
                }
                previous = old;
                if (pc < 0) {
                    return v[54];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.load(v[0], 4);
        v[2] = v[1] == 35064L ? 1L : 0L;
        return v[2] != 0 ? 1 : 19;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        m.store(v[3], 0L, 4);
        F0301_initMRPtr.run(m, v[0]);
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34448L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Dispatch.call(m, v[5], new long[]{v[0]});
        F0302_advanceMRPtr.run(m, v[0]);
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        m.store(v[3], 1L, 4);
        v[8] = m.load(v[7], 4);
        v[9] = v[8] > 1L ? 1L : 0L;
        return v[9] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34452L) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[11] = m.load(v[10], 4);
        v[12] = Dispatch.call(m, v[11], new long[]{v[0]});
        F0302_advanceMRPtr.run(m, v[0]);
        v[13] = m.load(v[3], 4);
        v[14] = ((v[13] + 1L)) & 4294967295L;
        m.store(v[3], v[14], 4);
        v[15] = m.load(v[7], 4);
        v[16] = v[14] < v[15] ? 1L : 0L;
        return v[16] != 0 ? 3 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34456L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = Dispatch.call(m, v[18], new long[]{v[0]});
        v[20] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = v[21] == 0L ? 1L : 0L;
        v[23] = m.load(v[0], 4);
        v[24] = v[23] == 35064L ? 1L : 0L;
        return v[24] != 0 ? 5 : 18;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34240L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = v[26] == 0L ? 1L : 0L;
        return v[27] != 0 ? 10 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[28] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34780L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = v[29] == 0L ? 1L : 0L;
        return v[30] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[29]});
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34784L) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = v[32] == 0L ? 1L : 0L;
        return v[33] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[32]});
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        F0467_freePredInfo.run(m, v[0]);
        v[34] = F0418_StrIOEncTerm.run(m, v[0]);
        F0026_FreeCodingContextEnc.run(m, v[0]);
        F0345_freeTileInfo.run(m, v[0]);
        v[35] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32833L) & 4294967295L;
        v[36] = m.load(v[35], 1);
        v[37] = ((v[36] ^ 128L)) & 255L;
        m.store(v[35], v[37], 1);
        v[38] = m.load(v[20], 4);
        return v[22] != 0 ? 18 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[39] = m.load(v[38], 4);
        v[40] = v[39] == 35064L ? 1L : 0L;
        return v[40] != 0 ? 12 : 18;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[41] = (v[38] + (Heap.s(0L, 32) * 35064L) + 34240L) & 4294967295L;
        v[42] = m.load(v[41], 4);
        v[43] = v[42] == 0L ? 1L : 0L;
        return v[43] != 0 ? 17 : 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[44] = (v[38] + (Heap.s(0L, 32) * 35064L) + 34780L) & 4294967295L;
        v[45] = m.load(v[44], 4);
        v[46] = v[45] == 0L ? 1L : 0L;
        return v[46] != 0 ? 15 : 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[45]});
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[47] = (v[38] + (Heap.s(0L, 32) * 35064L) + 34784L) & 4294967295L;
        v[48] = m.load(v[47], 4);
        v[49] = v[48] == 0L ? 1L : 0L;
        return v[49] != 0 ? 17 : 16;
    }

    private static int b16(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[48]});
        return 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        F0467_freePredInfo.run(m, v[38]);
        F0026_FreeCodingContextEnc.run(m, v[38]);
        F0345_freeTileInfo.run(m, v[38]);
        v[50] = (v[38] + (Heap.s(0L, 32) * 35064L) + 76L + 32833L) & 4294967295L;
        v[51] = m.load(v[50], 1);
        v[52] = ((v[51] ^ 128L)) & 255L;
        m.store(v[50], v[52], 1);
        return 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[0]});
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi53 = (previous == 18 ? 0L : 4294967295L);
        v[53] = phi53;
        v[54] = v[53];
        return -1;
    }
}
