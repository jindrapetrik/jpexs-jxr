package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: WriteWS_List.
 */
public final class F0332_WriteWS_List {

    private F0332_WriteWS_List() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[39];
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
                    default:
                        throw new IllegalStateException("Invalid block in WriteWS_List");
                }
                previous = old;
                if (pc < 0) {
                    return v[38];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = ((v[4] + v[2])) & 4294967295L;
        v[6] = v[5] < v[4] ? 1L : 0L;
        return v[6] != 0 ? 8 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] < v[5] ? 1L : 0L;
        return v[9] != 0 ? 8 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = v[2] == 0L ? 1L : 0L;
        return v[10] != 0 ? 8 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[11] = (v[0] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi12 = (previous == 3 ? v[4] : v[35]);
        long phi13 = (previous == 3 ? v[2] : v[23]);
        long phi14 = (previous == 3 ? v[1] : v[22]);
        v[12] = phi12;
        v[13] = phi13;
        v[14] = phi14;
        v[15] = ((4096L - v[12])) & 4294967295L;
        v[16] = LibC.call(m, "llvm.umin.i32", new long[]{v[15], v[13]});
        v[17] = m.load(v[0], 4);
        v[18] = (v[17] + (Heap.s(v[12], 32) * 1L)) & 4294967295L;
        v[19] = LibC.call(m, "memcpy", new long[]{v[18], v[14], v[16]});
        v[20] = m.load(v[3], 4);
        v[21] = ((v[20] + v[16])) & 4294967295L;
        m.store(v[3], v[21], 4);
        v[22] = (v[14] + (Heap.s(v[16], 32) * 1L)) & 4294967295L;
        v[23] = ((v[13] - v[16])) & 4294967295L;
        v[24] = v[21] == 4096L ? 1L : 0L;
        return v[24] != 0 ? 5 : 7;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = m.load(v[0], 4);
        v[26] = LibC.call(m, "calloc", new long[]{1L, 4100L});
        v[27] = v[26] == 0L ? 1L : 0L;
        return v[27] != 0 ? 8 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[28] = (v[25] + (Heap.s(4294967292L, 32) * 1L)) & 4294967295L;
        m.store(v[28], v[26], 4);
        v[29] = (v[26] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        m.store(v[0], v[29], 4);
        v[30] = m.load(v[7], 4);
        v[31] = ((v[30] + 4096L)) & 4294967295L;
        m.store(v[7], v[31], 4);
        v[32] = LibC.call(m, "memset", new long[]{v[26], 0L, 4L});
        m.store(v[3], 0L, 4);
        v[33] = m.load(v[11], 4);
        v[34] = ((v[33] + 1L)) & 4294967295L;
        m.store(v[11], v[34], 4);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi35 = (previous == 6 ? 0L : v[21]);
        v[35] = phi35;
        v[36] = v[23] == 0L ? 1L : 0L;
        return v[36] != 0 ? 8 : 4;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi37 = (previous == 0 ? 4294967193L : (previous == 1 ? 4294967193L : (previous == 2 ? 0L : (previous == 7 ? 0L : 4294967195L))));
        v[37] = phi37;
        v[38] = v[37];
        return -1;
    }
}
