package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: slideOneMBRow.
 */
public final class F0267_slideOneMBRow {

    private F0267_slideOneMBRow() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[60];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                    default:
                        throw new IllegalStateException("Invalid block in slideOneMBRow");
                }
                previous = old;
                if (pc < 0) {
                    return v[59];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = v[1] == 0L ? 1L : 0L;
        return v[5] != 0 ? 13 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = v[3] == 0L ? 1L : 0L;
        v[7] = v[2] == 0L ? 1L : 0L;
        v[8] = v[4] == 0L ? 1L : 0L;
        v[9] = ((v[6] | v[7])) & 1L;
        v[10] = ((v[8] | v[7])) & 1L;
        v[11] = ((v[2] + 4294967295L)) & 4294967295L;
        v[12] = ((v[2] & 1L)) & 4294967295L;
        v[13] = v[11] == 0L ? 1L : 0L;
        v[14] = ((v[2] & 4294967294L)) & 4294967295L;
        v[15] = v[12] == 0L ? 1L : 0L;
        v[16] = ((v[2] & 1L)) & 4294967295L;
        v[17] = v[11] == 0L ? 1L : 0L;
        v[18] = ((v[2] & 4294967294L)) & 4294967295L;
        v[19] = v[16] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi20 = (previous == 1 ? 0L : v[57]);
        v[20] = phi20;
        v[21] = (v[0] + (Heap.s(v[20], 32) * 8L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[0] + (Heap.s(v[20], 32) * 8L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[24] = m.load(v[23], 4);
        m.store(v[21], v[24], 4);
        m.store(v[23], v[22], 4);
        return v[9] != 0 ? 7 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return v[13] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi25 = (previous == 4 ? v[34] : 0L);
        long phi26 = (previous == 4 ? v[35] : 0L);
        v[25] = phi25;
        v[26] = phi26;
        v[27] = m.load(v[21], 4);
        v[28] = (v[27] + (Heap.s(v[25], 32) * 88L)) & 4294967295L;
        v[29] = (v[27] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[28], v[29], 88L, 0L});
        v[30] = ((v[25] | 1L)) & 4294967295L;
        v[31] = m.load(v[21], 4);
        v[32] = (v[31] + (Heap.s(v[30], 32) * 88L)) & 4294967295L;
        v[33] = (v[31] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[32], v[33], 88L, 0L});
        v[34] = ((v[25] + 2L)) & 4294967295L;
        v[35] = ((v[26] + 2L)) & 4294967295L;
        v[36] = v[35] == v[14] ? 1L : 0L;
        return v[36] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi37 = (previous == 3 ? 0L : v[34]);
        v[37] = phi37;
        return v[15] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[38] = m.load(v[21], 4);
        v[39] = (v[38] + (Heap.s(v[37], 32) * 88L)) & 4294967295L;
        v[40] = (v[38] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[39], v[40], 88L, 0L});
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        return v[10] != 0 ? 12 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        return v[17] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi41 = (previous == 9 ? v[50] : 0L);
        long phi42 = (previous == 9 ? v[51] : 0L);
        v[41] = phi41;
        v[42] = phi42;
        v[43] = m.load(v[23], 4);
        v[44] = (v[43] + (Heap.s(v[41], 32) * 88L)) & 4294967295L;
        v[45] = (v[43] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[44], v[45], 88L, 0L});
        v[46] = ((v[41] | 1L)) & 4294967295L;
        v[47] = m.load(v[23], 4);
        v[48] = (v[47] + (Heap.s(v[46], 32) * 88L)) & 4294967295L;
        v[49] = (v[47] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[48], v[49], 88L, 0L});
        v[50] = ((v[41] + 2L)) & 4294967295L;
        v[51] = ((v[42] + 2L)) & 4294967295L;
        v[52] = v[51] == v[18] ? 1L : 0L;
        return v[52] != 0 ? 10 : 9;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi53 = (previous == 8 ? 0L : v[50]);
        v[53] = phi53;
        return v[19] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[54] = m.load(v[23], 4);
        v[55] = (v[54] + (Heap.s(v[53], 32) * 88L)) & 4294967295L;
        v[56] = (v[54] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[55], v[56], 88L, 0L});
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[57] = ((v[20] + 1L)) & 4294967295L;
        v[58] = v[57] == v[1] ? 1L : 0L;
        return v[58] != 0 ? 13 : 2;
    }

    private static int b13(Heap m, long[] v, int previous) {
        return -1;
    }
}
