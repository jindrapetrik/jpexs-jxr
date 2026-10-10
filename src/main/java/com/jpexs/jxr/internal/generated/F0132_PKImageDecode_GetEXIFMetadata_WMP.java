package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_GetEXIFMetadata_WMP.
 */
public final class F0132_PKImageDecode_GetEXIFMetadata_WMP {

    private F0132_PKImageDecode_GetEXIFMetadata_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[37];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_GetEXIFMetadata_WMP");
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
        v[3] = m.stack(4L * 1L, 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 48L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 52L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = v[1] != 0L ? 1L : 0L;
        v[9] = v[5] != 0L ? 1L : 0L;
        v[10] = ((v[8] & v[9])) & 1L;
        return v[10] != 0 ? 1 : 7;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = (v[0] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = m.load(v[2], 4);
        v[14] = v[13] < v[7] ? 1L : 0L;
        return v[14] != 0 ? 5 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = (v[12] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = Dispatch.call(m, v[16], new long[]{v[12], v[3]});
        v[18] = Heap.s(v[17], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[18] != 0 ? 5 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[19] = (v[12] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = Dispatch.call(m, v[20], new long[]{v[12], v[5]});
        v[22] = Heap.s(v[21], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[22] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[23] = (v[12] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = Dispatch.call(m, v[24], new long[]{v[12], v[1], v[7]});
        v[26] = Heap.s(v[25], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[26] != 0 ? 5 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi27 = (previous == 4 ? v[25] : (previous == 3 ? v[21] : (previous == 2 ? v[17] : 4294967193L)));
        v[27] = phi27;
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[28] = m.load(v[19], 4);
        v[29] = m.load(v[3], 4);
        v[30] = Dispatch.call(m, v[28], new long[]{v[12], v[29]});
        v[31] = (v[30]) & 4294967295L;
        v[32] = Heap.s(v[31], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[33] = v[32] != 0 ? 0L : v[7];
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi34 = (previous == 5 ? v[27] : (previous == 0 ? 0L : v[31]));
        long phi35 = (previous == 5 ? 0L : (previous == 0 ? v[7] : v[33]));
        v[34] = phi34;
        v[35] = phi35;
        m.store(v[2], v[35], 4);
        v[36] = v[34];
        return -1;
    }
}
