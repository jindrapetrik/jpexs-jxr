package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: setBitIOPointers.
 */
public final class F0343_setBitIOPointers {

    private F0343_setBitIOPointers() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[51];
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
                        throw new IllegalStateException("Invalid block in setBitIOPointers");
                }
                previous = old;
                if (pc < 0) {
                    return v[50];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 9 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34308L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 28L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = v[9] == 0L ? 1L : 0L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34236L) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34296L) & 4294967295L;
        v[13] = ((v[5] + 1L)) & 4294967295L;
        v[14] = LibC.call(m, "llvm.umax.i32", new long[]{v[13], 1L});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi15 = (previous == 1 ? 0L : v[41]);
        v[15] = phi15;
        v[16] = (v[7] + (Heap.s(v[15], 32) * 592L)) & 4294967295L;
        return v[10] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[17] = m.load(v[12], 4);
        v[18] = (v[17] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = (v[7] + (Heap.s(v[15], 32) * 592L) + 12L) & 4294967295L;
        m.store(v[20], v[19], 4);
        v[21] = (v[7] + (Heap.s(v[15], 32) * 592L) + 8L) & 4294967295L;
        m.store(v[21], v[19], 4);
        v[22] = (v[7] + (Heap.s(v[15], 32) * 592L) + 4L) & 4294967295L;
        m.store(v[22], v[19], 4);
        m.store(v[16], v[19], 4);
        return 8;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = m.load(v[11], 1);
        v[24] = (v[23]) & 4294967295L;
        v[25] = m.load(v[12], 4);
        v[26] = ((v[15] * v[24])) & 4294967295L;
        v[27] = (v[25] + (Heap.s(v[26], 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        m.store(v[16], v[28], 4);
        v[29] = v[23] > 1L ? 1L : 0L;
        return v[29] != 0 ? 5 : 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[30] = (v[27] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[7] + (Heap.s(v[15], 32) * 592L) + 4L) & 4294967295L;
        m.store(v[32], v[31], 4);
        v[33] = v[23] == 2L ? 1L : 0L;
        return v[33] != 0 ? 8 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[34] = (v[27] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = (v[7] + (Heap.s(v[15], 32) * 592L) + 8L) & 4294967295L;
        m.store(v[36], v[35], 4);
        v[37] = v[23] > 3L ? 1L : 0L;
        return v[37] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[38] = (v[27] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = (v[7] + (Heap.s(v[15], 32) * 592L) + 12L) & 4294967295L;
        m.store(v[40], v[39], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[41] = ((v[15] + 1L)) & 4294967295L;
        v[42] = v[41] == v[14] ? 1L : 0L;
        return v[42] != 0 ? 10 : 2;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[43] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34308L) & 4294967295L;
        v[44] = m.load(v[43], 4);
        v[45] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[46] = m.load(v[45], 4);
        v[47] = (v[44] + (Heap.s(0L, 32) * 592L) + 12L) & 4294967295L;
        m.store(v[47], v[46], 4);
        v[48] = (v[44] + (Heap.s(0L, 32) * 592L) + 8L) & 4294967295L;
        m.store(v[48], v[46], 4);
        v[49] = (v[44] + (Heap.s(0L, 32) * 592L) + 4L) & 4294967295L;
        m.store(v[49], v[46], 4);
        m.store(v[44], v[46], 4);
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[50] = 0L;
        return -1;
    }
}
