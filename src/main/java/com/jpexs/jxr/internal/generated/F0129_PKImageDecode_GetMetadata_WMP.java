package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_GetMetadata_WMP.
 */
public final class F0129_PKImageDecode_GetMetadata_WMP {

    private F0129_PKImageDecode_GetMetadata_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[35];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_GetMetadata_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[34];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = m.stack(4L * 1L, 4);
        v[6] = v[3] != 0L ? 1L : 0L;
        v[7] = v[1] != 0L ? 1L : 0L;
        v[8] = ((v[7] & v[6])) & 1L;
        return v[8] != 0 ? 1 : 7;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = (v[0] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = m.load(v[4], 4);
        v[12] = v[11] < v[2] ? 1L : 0L;
        return v[12] != 0 ? 5 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = (v[10] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = Dispatch.call(m, v[14], new long[]{v[10], v[5]});
        v[16] = Heap.s(v[15], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[16] != 0 ? 5 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[17] = (v[10] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = Dispatch.call(m, v[18], new long[]{v[10], v[1]});
        v[20] = Heap.s(v[19], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[20] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[21] = (v[10] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = Dispatch.call(m, v[22], new long[]{v[10], v[3], v[2]});
        v[24] = Heap.s(v[23], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[24] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi25 = (previous == 4 ? v[23] : (previous == 3 ? v[19] : (previous == 2 ? v[15] : 4294967193L)));
        v[25] = phi25;
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[26] = m.load(v[17], 4);
        v[27] = m.load(v[5], 4);
        v[28] = Dispatch.call(m, v[26], new long[]{v[10], v[27]});
        v[29] = (v[28]) & 4294967295L;
        v[30] = Heap.s(v[29], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[31] = v[30] != 0 ? 0L : v[2];
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi32 = (previous == 5 ? v[25] : (previous == 0 ? 0L : v[29]));
        long phi33 = (previous == 5 ? 0L : (previous == 0 ? v[2] : v[31]));
        v[32] = phi32;
        v[33] = phi33;
        m.store(v[4], v[33], 4);
        v[34] = v[32];
        return -1;
    }
}
