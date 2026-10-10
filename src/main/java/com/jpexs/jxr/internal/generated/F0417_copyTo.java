package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: copyTo.
 */
public final class F0417_copyTo {

    private F0417_copyTo() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[26];
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
                    default:
                        throw new IllegalStateException("Invalid block in copyTo");
                }
                previous = old;
                if (pc < 0) {
                    return v[25];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(4096L * 1L, 1);
        v[4] = v[2] < 5L ? 1L : 0L;
        return v[4] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = v[2] > 4096L ? 1L : 0L;
        return v[5] != 0 ? 2 : 5;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[7] = (v[1] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        return 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = Dispatch.call(m, v[9], new long[]{v[0], v[3], v[2]});
        return 6;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi11 = (previous == 2 ? v[2] : v[16]);
        v[11] = phi11;
        v[12] = m.load(v[6], 4);
        v[13] = Dispatch.call(m, v[12], new long[]{v[0], v[3], 4096L});
        v[14] = m.load(v[7], 4);
        v[15] = Dispatch.call(m, v[14], new long[]{v[1], v[3], 4096L});
        v[16] = ((v[11] + 4294963200L)) & 4294967295L;
        v[17] = v[16] > 4096L ? 1L : 0L;
        return v[17] != 0 ? 4 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi18 = (previous == 1 ? v[2] : v[16]);
        v[18] = phi18;
        v[19] = (v[0] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = Dispatch.call(m, v[20], new long[]{v[0], v[3], v[18]});
        v[22] = (v[1] + (Heap.s(0L, 32) * 44L) + 32L) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = Dispatch.call(m, v[23], new long[]{v[1], v[3], v[18]});
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[25] = 0L;
        return -1;
    }
}
