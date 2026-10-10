package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: allocateQuantizer.
 */
public final class F0347_allocateQuantizer {

    private F0347_allocateQuantizer() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[47];
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
                        throw new IllegalStateException("Invalid block in allocateQuantizer");
                }
                previous = old;
                if (pc < 0) {
                    return v[46];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = v[2] > 16L ? 1L : 0L;
        v[4] = v[1] > 16L ? 1L : 0L;
        v[5] = ((v[4] | v[3])) & 1L;
        return v[5] != 0 ? 8 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = ((v[1] * 20L)) & 4294967295L;
        v[7] = ((v[6] * v[2])) & 4294967295L;
        v[8] = LibC.call(m, "malloc", new long[]{v[7]});
        m.store(v[0], v[8], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 8 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = v[1] > 1L ? 1L : 0L;
        return v[10] != 0 ? 3 : 8;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[11] = m.load(v[0], 4);
        v[12] = ((v[1] + 4294967295L)) & 4294967295L;
        v[13] = ((v[1] + 4294967294L)) & 4294967295L;
        v[14] = ((v[12] & 3L)) & 4294967295L;
        v[15] = v[13] < 3L ? 1L : 0L;
        return v[15] != 0 ? 6 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[16] = ((v[12] & 4294967292L)) & 4294967295L;
        v[17] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[18] = (v[0] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[19] = (v[0] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi20 = (previous == 4 ? v[11] : v[30]);
        long phi21 = (previous == 4 ? 1L : v[31]);
        long phi22 = (previous == 4 ? 0L : v[32]);
        v[20] = phi20;
        v[21] = phi21;
        v[22] = phi22;
        v[23] = (v[0] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[24] = (v[20] + (Heap.s(v[2], 32) * 20L)) & 4294967295L;
        m.store(v[23], v[24], 4);
        v[25] = (v[17] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[26] = (v[24] + (Heap.s(v[2], 32) * 20L)) & 4294967295L;
        m.store(v[25], v[26], 4);
        v[27] = (v[18] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[28] = (v[26] + (Heap.s(v[2], 32) * 20L)) & 4294967295L;
        m.store(v[27], v[28], 4);
        v[29] = (v[19] + (Heap.s(v[21], 32) * 4L)) & 4294967295L;
        v[30] = (v[28] + (Heap.s(v[2], 32) * 20L)) & 4294967295L;
        m.store(v[29], v[30], 4);
        v[31] = ((v[21] + 4L)) & 4294967295L;
        v[32] = ((v[22] + 4L)) & 4294967295L;
        v[33] = v[32] == v[16] ? 1L : 0L;
        return v[33] != 0 ? 6 : 5;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi34 = (previous == 3 ? v[11] : v[30]);
        long phi35 = (previous == 3 ? 1L : v[31]);
        v[34] = phi34;
        v[35] = phi35;
        v[36] = v[14] == 0L ? 1L : 0L;
        return v[36] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi37 = (previous == 7 ? v[41] : v[34]);
        long phi38 = (previous == 7 ? v[42] : v[35]);
        long phi39 = (previous == 7 ? v[43] : 0L);
        v[37] = phi37;
        v[38] = phi38;
        v[39] = phi39;
        v[40] = (v[0] + (Heap.s(v[38], 32) * 4L)) & 4294967295L;
        v[41] = (v[37] + (Heap.s(v[2], 32) * 20L)) & 4294967295L;
        m.store(v[40], v[41], 4);
        v[42] = ((v[38] + 1L)) & 4294967295L;
        v[43] = ((v[39] + 1L)) & 4294967295L;
        v[44] = v[43] == v[14] ? 1L : 0L;
        return v[44] != 0 ? 8 : 7;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi45 = (previous == 0 ? 4294967295L : (previous == 1 ? 4294967295L : (previous == 2 ? 0L : (previous == 7 ? 0L : 0L))));
        v[45] = phi45;
        v[46] = v[45];
        return -1;
    }
}
