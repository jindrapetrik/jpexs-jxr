package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: allocateTileInfo.
 */
public final class F0344_allocateTileInfo {

    private F0344_allocateTileInfo() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[42];
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
                    default:
                        throw new IllegalStateException("Invalid block in allocateTileInfo");
                }
                previous = old;
                if (pc < 0) {
                    return v[41];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] > 4095L ? 1L : 0L;
        return v[3] != 0 ? 7 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = ((v[2] * 240L)) & 4294967295L;
        v[5] = ((v[4] + 240L)) & 4294967295L;
        v[6] = LibC.call(m, "malloc", new long[]{v[5]});
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        m.store(v[7], v[6], 4);
        v[8] = v[6] == 0L ? 1L : 0L;
        return v[8] != 0 ? 7 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[9] = m.load(v[1], 4);
        v[10] = ((v[9] * 240L)) & 4294967295L;
        v[11] = ((v[10] + 240L)) & 4294967295L;
        v[12] = LibC.call(m, "memset", new long[]{v[6], 0L, v[11]});
        v[13] = m.load(v[1], 4);
        v[14] = m.load(v[7], 4);
        v[15] = ((v[13] + 1L)) & 4294967295L;
        v[16] = LibC.call(m, "llvm.umax.i32", new long[]{v[15], 1L});
        v[17] = ((v[16] & 1L)) & 4294967295L;
        v[18] = v[15] < 2L ? 1L : 0L;
        return v[18] != 0 ? 5 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[19] = ((v[16] & 4294967294L)) & 4294967295L;
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi20 = (previous == 3 ? 0L : v[31]);
        long phi21 = (previous == 3 ? 0L : v[32]);
        v[20] = phi20;
        v[21] = phi21;
        v[22] = (v[14] + (Heap.s(v[20], 32) * 240L) + 192L) & 4294967295L;
        m.store(v[22], 1L, 1);
        v[23] = (v[14] + (Heap.s(v[20], 32) * 240L) + 193L) & 4294967295L;
        m.store(v[23], 1L, 1);
        v[24] = (v[14] + (Heap.s(v[20], 32) * 240L) + 194L) & 4294967295L;
        m.store(v[24], 0L, 1);
        v[25] = (v[14] + (Heap.s(v[20], 32) * 240L) + 195L) & 4294967295L;
        m.store(v[25], 0L, 1);
        v[26] = ((v[20] | 1L)) & 4294967295L;
        v[27] = (v[14] + (Heap.s(v[26], 32) * 240L) + 192L) & 4294967295L;
        m.store(v[27], 1L, 1);
        v[28] = (v[14] + (Heap.s(v[26], 32) * 240L) + 193L) & 4294967295L;
        m.store(v[28], 1L, 1);
        v[29] = (v[14] + (Heap.s(v[26], 32) * 240L) + 194L) & 4294967295L;
        m.store(v[29], 0L, 1);
        v[30] = (v[14] + (Heap.s(v[26], 32) * 240L) + 195L) & 4294967295L;
        m.store(v[30], 0L, 1);
        v[31] = ((v[20] + 2L)) & 4294967295L;
        v[32] = ((v[21] + 2L)) & 4294967295L;
        v[33] = v[32] == v[19] ? 1L : 0L;
        return v[33] != 0 ? 5 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi34 = (previous == 2 ? 0L : v[31]);
        v[34] = phi34;
        v[35] = v[17] == 0L ? 1L : 0L;
        return v[35] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[36] = (v[14] + (Heap.s(v[34], 32) * 240L) + 192L) & 4294967295L;
        m.store(v[36], 1L, 1);
        v[37] = (v[14] + (Heap.s(v[34], 32) * 240L) + 193L) & 4294967295L;
        m.store(v[37], 1L, 1);
        v[38] = (v[14] + (Heap.s(v[34], 32) * 240L) + 194L) & 4294967295L;
        m.store(v[38], 0L, 1);
        v[39] = (v[14] + (Heap.s(v[34], 32) * 240L) + 195L) & 4294967295L;
        m.store(v[39], 0L, 1);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi40 = (previous == 0 ? 4294967295L : (previous == 1 ? 4294967295L : (previous == 5 ? 0L : 0L)));
        v[40] = phi40;
        v[41] = v[40];
        return -1;
    }
}
