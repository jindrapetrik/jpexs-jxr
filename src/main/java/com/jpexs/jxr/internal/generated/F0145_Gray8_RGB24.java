package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray8_RGB24.
 */
public final class F0145_Gray8_RGB24 {

    private F0145_Gray8_RGB24() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[56];
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
                    default:
                        throw new IllegalStateException("Invalid block in Gray8_RGB24");
                }
                previous = old;
                if (pc < 0) {
                    return v[55];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[6] != 0 ? 1 : 9;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi8 = (previous == 1 ? v[5] : v[51]);
        long phi9 = (previous == 1 ? v[2] : v[52]);
        long phi10 = (previous == 1 ? 0L : v[53]);
        v[8] = phi8;
        v[9] = phi9;
        v[10] = phi10;
        v[11] = m.load(v[7], 4);
        v[12] = Heap.s(v[11], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[12] != 0 ? 3 : 8;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[13] = ((v[11] + 4294967295L)) & 4294967295L;
        v[14] = ((v[13] * 3L)) & 4294967295L;
        v[15] = ((v[11] & 1L)) & 4294967295L;
        v[16] = v[15] == 0L ? 1L : 0L;
        return v[16] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[17] = (v[9] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        v[18] = m.load(v[17], 1);
        v[19] = (v[9] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        m.store(v[19], v[18], 1);
        v[20] = ((v[14] | 1L)) & 4294967295L;
        v[21] = (v[9] + (Heap.s(v[20], 32) * 1L)) & 4294967295L;
        m.store(v[21], v[18], 1);
        v[22] = ((v[14] + 2L)) & 4294967295L;
        v[23] = (v[9] + (Heap.s(v[22], 32) * 1L)) & 4294967295L;
        m.store(v[23], v[18], 1);
        v[24] = ((v[11] + 4294967294L)) & 4294967295L;
        v[25] = ((v[14] + 4294967293L)) & 4294967295L;
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi26 = (previous == 3 ? v[14] : v[25]);
        long phi27 = (previous == 3 ? v[13] : v[24]);
        v[26] = phi26;
        v[27] = phi27;
        v[28] = v[13] == 0L ? 1L : 0L;
        return v[28] != 0 ? 7 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi29 = (previous == 6 ? v[48] : v[26]);
        long phi30 = (previous == 6 ? v[47] : v[27]);
        v[29] = phi29;
        v[30] = phi30;
        v[31] = (v[9] + (Heap.s(v[30], 32) * 1L)) & 4294967295L;
        v[32] = m.load(v[31], 1);
        v[33] = (v[9] + (Heap.s(v[29], 32) * 1L)) & 4294967295L;
        m.store(v[33], v[32], 1);
        v[34] = ((v[29] + 1L)) & 4294967295L;
        v[35] = (v[9] + (Heap.s(v[34], 32) * 1L)) & 4294967295L;
        m.store(v[35], v[32], 1);
        v[36] = ((v[29] + 2L)) & 4294967295L;
        v[37] = (v[9] + (Heap.s(v[36], 32) * 1L)) & 4294967295L;
        m.store(v[37], v[32], 1);
        v[38] = ((v[30] + 4294967295L)) & 4294967295L;
        v[39] = ((v[29] + 4294967293L)) & 4294967295L;
        v[40] = (v[9] + (Heap.s(v[38], 32) * 1L)) & 4294967295L;
        v[41] = m.load(v[40], 1);
        v[42] = (v[9] + (Heap.s(v[39], 32) * 1L)) & 4294967295L;
        m.store(v[42], v[41], 1);
        v[43] = ((v[29] + 4294967294L)) & 4294967295L;
        v[44] = (v[9] + (Heap.s(v[43], 32) * 1L)) & 4294967295L;
        m.store(v[44], v[41], 1);
        v[45] = ((v[29] + 4294967295L)) & 4294967295L;
        v[46] = (v[9] + (Heap.s(v[45], 32) * 1L)) & 4294967295L;
        m.store(v[46], v[41], 1);
        v[47] = ((v[30] + 4294967294L)) & 4294967295L;
        v[48] = ((v[29] + 4294967290L)) & 4294967295L;
        v[49] = v[38] == 0L ? 1L : 0L;
        return v[49] != 0 ? 7 : 6;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[50] = m.load(v[4], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi51 = (previous == 7 ? v[50] : v[8]);
        v[51] = phi51;
        v[52] = (v[9] + (Heap.s(v[3], 32) * 1L)) & 4294967295L;
        v[53] = ((v[10] + 1L)) & 4294967295L;
        v[54] = Heap.s(v[53], 32) < Heap.s(v[51], 32) ? 1L : 0L;
        return v[54] != 0 ? 2 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[55] = 0L;
        return -1;
    }
}
