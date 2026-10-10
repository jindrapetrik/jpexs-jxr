package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_EncodeContent_Encode.
 */
public final class F0096_PKImageEncode_EncodeContent_Encode {

    private F0096_PKImageEncode_EncodeContent_Encode() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[37];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_EncodeContent_Encode");
                }
                previous = old;
                if (pc < 0) {
                    return v[36];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.stack(24L * 1L, 4);
        v[5] = v[1] == 0L ? 1L : 0L;
        return v[5] != 0 ? 7 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 8L) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32848L) & 4294967295L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 16L) & 4294967295L;
        v[9] = (v[4] + (Heap.s(0L, 32) * 24L) + 4L) & 4294967295L;
        v[10] = (v[4] + (Heap.s(0L, 32) * 24L) + 8L) & 4294967295L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33020L) & 4294967295L;
        v[12] = (v[4] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = ((v[15] + 16L)) & 4294967295L;
        v[14] = v[13] < v[1] ? 1L : 0L;
        return v[14] != 0 ? 3 : 7;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi15 = (previous == 1 ? 0L : v[13]);
        v[15] = phi15;
        v[16] = m.load(v[6], 4);
        v[17] = v[16] == 1L ? 1L : 0L;
        return v[17] != 0 ? 6 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[18] = m.load(v[7], 4);
        v[19] = v[18] == 0L ? 1L : 0L;
        return v[19] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[20] = m.load(v[8], 4);
        v[21] = v[20] == 1L ? 1L : 0L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi22 = (previous == 3 ? 1L : (previous == 4 ? 0L : v[21]));
        v[22] = phi22;
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[12], 0L, 12L, 0L});
        v[23] = ((v[15] * v[3])) & 4294967295L;
        v[24] = (v[22]) & 4294967295L;
        v[25] = ((v[23] >>> v[24])) & 4294967295L;
        v[26] = (v[2] + (Heap.s(v[25], 32) * 1L)) & 4294967295L;
        m.store(v[4], v[26], 4);
        v[27] = ((v[1] - v[15])) & 4294967295L;
        v[28] = LibC.call(m, "llvm.umin.i32", new long[]{v[27], 16L});
        m.store(v[9], v[28], 4);
        m.store(v[10], v[3], 4);
        v[29] = m.load(v[11], 4);
        v[30] = F0432_ImageStrEncEncode.run(m, v[29], v[4]);
        v[31] = v[30] == 0L ? 1L : 0L;
        return v[31] != 0 ? 2 : 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[32] = (v[0] + (Heap.s(0L, 32) * 66276L) + 92L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = ((v[33] + v[1])) & 4294967295L;
        m.store(v[32], v[34], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi35 = (previous == 7 ? 0L : 4294967295L);
        v[35] = phi35;
        v[36] = v[35];
        return -1;
    }
}
