package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ImageStrEncEncode.
 */
public final class F0432_ImageStrEncEncode {

    private F0432_ImageStrEncEncode() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[49];
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
                    default:
                        throw new IllegalStateException("Invalid block in ImageStrEncEncode");
                }
                previous = old;
                if (pc < 0) {
                    return v[48];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = m.load(v[0], 4);
        v[5] = v[4] == 35064L ? 1L : 0L;
        return v[5] != 0 ? 1 : 12;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[6], v[1], 24L, 0L});
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        m.store(v[7], 0L, 4);
        F0301_initMRPtr.run(m, v[0]);
        v[8] = v[3] == 0L ? 1L : 0L;
        return v[8] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[9] = (v[3] + (Heap.s(0L, 32) * 35064L) + 32936L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[9], v[1], 24L, 0L});
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = v[11] == 0L ? 1L : 0L;
        v[13] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34424L) & 4294967295L;
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34428L) & 4294967295L;
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34432L) & 4294967295L;
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34436L) & 4294967295L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34440L) & 4294967295L;
        v[18] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34444L) & 4294967295L;
        v[19] = v[12] != 0 ? v[13] : v[16];
        v[20] = v[12] != 0 ? v[14] : v[17];
        v[21] = v[12] != 0 ? v[15] : v[18];
        v[22] = m.load(v[21], 4);
        v[23] = m.load(v[20], 4);
        v[24] = m.load(v[19], 4);
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34408L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = Dispatch.call(m, v[26], new long[]{v[0]});
        v[28] = v[27] == 0L ? 1L : 0L;
        return v[28] != 0 ? 4 : 12;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[29] = Dispatch.call(m, v[24], new long[]{v[0]});
        v[30] = v[29] == 0L ? 1L : 0L;
        return v[30] != 0 ? 5 : 12;
    }

    private static int b5(Heap m, long[] v, int previous) {
        F0302_advanceMRPtr.run(m, v[0]);
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        m.store(v[7], 1L, 4);
        v[32] = m.load(v[31], 4);
        v[33] = v[32] > 1L ? 1L : 0L;
        return v[33] != 0 ? 6 : 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[34] = Dispatch.call(m, v[23], new long[]{v[0]});
        v[35] = v[34] == 0L ? 1L : 0L;
        return v[35] != 0 ? 7 : 12;
    }

    private static int b7(Heap m, long[] v, int previous) {
        F0302_advanceMRPtr.run(m, v[0]);
        v[36] = m.load(v[7], 4);
        v[37] = ((v[36] + 1L)) & 4294967295L;
        m.store(v[7], v[37], 4);
        v[38] = m.load(v[31], 4);
        v[39] = v[37] < v[38] ? 1L : 0L;
        return v[39] != 0 ? 6 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[40] = Dispatch.call(m, v[22], new long[]{v[0]});
        v[41] = v[40] == 0L ? 1L : 0L;
        return v[41] != 0 ? 9 : 12;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[42] = m.load(v[10], 4);
        v[43] = v[42] == 0L ? 1L : 0L;
        return v[43] != 0 ? 11 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        F0303_advanceOneMBRow.run(m, v[0]);
        v[44] = m.load(v[10], 4);
        v[45] = ((v[44] + 1L)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi46 = (previous == 10 ? v[45] : 1L);
        v[46] = phi46;
        m.store(v[10], v[46], 4);
        F0304_swapMRPtr.run(m, v[0]);
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi47 = (previous == 11 ? 0L : (previous == 0 ? 4294967295L : (previous == 3 ? 4294967295L : (previous == 4 ? 4294967295L : (previous == 8 ? 4294967295L : 4294967295L)))));
        v[47] = phi47;
        v[48] = v[47];
        return -1;
    }
}
