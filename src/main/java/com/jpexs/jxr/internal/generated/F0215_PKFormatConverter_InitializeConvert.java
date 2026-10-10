package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKFormatConverter_InitializeConvert.
 */
public final class F0215_PKFormatConverter_InitializeConvert {

    private F0215_PKFormatConverter_InitializeConvert() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[55];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKFormatConverter_InitializeConvert");
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
        v[4] = (v[0] + (Heap.s(0L, 32) * 56L) + 40L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[4], v[3], 16L, 0L});
        v[5] = v[2] == 0L ? 1L : 0L;
        return v[5] != 0 ? 10 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = LibC.call(m, "memcmp", new long[]{v[3], 8560L, 16L});
        v[7] = v[6] == 0L ? 1L : 0L;
        return v[7] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = LibC.call(m, "strlen", new long[]{v[2]});
        v[9] = F0035_PKStrnicmp.run(m, v[2], 8576L, v[8]);
        v[10] = v[9] == 0L ? 1L : 0L;
        return v[10] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[3], 8592L, 16L, 0L});
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[11] = LibC.call(m, "strlen", new long[]{v[2]});
        v[12] = F0035_PKStrnicmp.run(m, v[2], 8608L, v[11]);
        v[13] = v[12] == 0L ? 1L : 0L;
        return v[13] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[14] = LibC.call(m, "strlen", new long[]{v[2]});
        v[15] = F0035_PKStrnicmp.run(m, v[2], 8624L, v[14]);
        v[16] = v[15] == 0L ? 1L : 0L;
        return v[16] != 0 ? 6 : 10;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[17] = LibC.call(m, "memcmp", new long[]{v[3], 8640L, 16L});
        v[18] = v[17] == 0L ? 1L : 0L;
        return v[18] != 0 ? 7 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[3], 8656L, 16L, 0L});
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[19] = LibC.call(m, "memcmp", new long[]{v[3], 8672L, 16L});
        v[20] = v[19] == 0L ? 1L : 0L;
        return v[20] != 0 ? 9 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[3], 8688L, 16L, 0L});
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[21] = LibC.call(m, "memcmp", new long[]{v[1], v[3], 16L});
        v[22] = v[21] == 0L ? 1L : 0L;
        return v[22] != 0 ? 24 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi23 = (previous == 14 ? v[35] : 0L);
        v[23] = phi23;
        v[24] = (8704L + (Heap.s(v[23], 32) * 12L)) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = LibC.call(m, "memcmp", new long[]{v[1], v[25], 16L});
        v[27] = v[26] == 0L ? 1L : 0L;
        return v[27] != 0 ? 12 : 14;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[28] = (8704L + (Heap.s(v[23], 32) * 12L) + 4L) & 4294967295L;
        v[29] = m.load(v[28], 4);
        v[30] = LibC.call(m, "memcmp", new long[]{v[3], v[29], 16L});
        v[31] = v[30] == 0L ? 1L : 0L;
        return v[31] != 0 ? 13 : 14;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[32] = (8704L + (Heap.s(v[23], 32) * 12L) + 8L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = (v[0] + (Heap.s(0L, 32) * 56L) + 28L) & 4294967295L;
        m.store(v[34], v[33], 4);
        return 24;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[35] = ((v[23] + 1L)) & 4294967295L;
        v[36] = v[35] == 76L ? 1L : 0L;
        return v[36] != 0 ? 15 : 11;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[37] = LibC.call(m, "memcmp", new long[]{v[1], 9728L, 16L});
        v[38] = v[37] == 0L ? 1L : 0L;
        return v[38] != 0 ? 16 : 17;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[39] = LibC.call(m, "memcmp", new long[]{v[3], 9680L, 16L});
        v[40] = v[39] == 0L ? 1L : 0L;
        return v[40] != 0 ? 24 : 17;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[41] = LibC.call(m, "memcmp", new long[]{v[1], 9616L, 16L});
        v[42] = v[41] == 0L ? 1L : 0L;
        return v[42] != 0 ? 18 : 19;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[43] = LibC.call(m, "memcmp", new long[]{v[3], 9936L, 16L});
        v[44] = v[43] == 0L ? 1L : 0L;
        return v[44] != 0 ? 24 : 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[45] = LibC.call(m, "memcmp", new long[]{v[1], 9616L, 16L});
        v[46] = v[45] == 0L ? 1L : 0L;
        return v[46] != 0 ? 20 : 21;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[47] = LibC.call(m, "memcmp", new long[]{v[3], 9952L, 16L});
        v[48] = v[47] == 0L ? 1L : 0L;
        return v[48] != 0 ? 24 : 21;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[49] = LibC.call(m, "memcmp", new long[]{v[1], 9616L, 16L});
        v[50] = v[49] == 0L ? 1L : 0L;
        return v[50] != 0 ? 22 : 23;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[51] = LibC.call(m, "memcmp", new long[]{v[3], 8640L, 16L});
        v[52] = v[51] == 0L ? 1L : 0L;
        return v[52] != 0 ? 24 : 23;
    }

    private static int b23(Heap m, long[] v, int previous) {
        return 24;
    }

    private static int b24(Heap m, long[] v, int previous) {
        long phi53 = (previous == 10 ? 0L : (previous == 13 ? 0L : (previous == 16 ? 0L : (previous == 18 ? 0L : (previous == 20 ? 0L : (previous == 22 ? 0L : 4294967190L))))));
        v[53] = phi53;
        v[54] = v[53];
        return -1;
    }
}
