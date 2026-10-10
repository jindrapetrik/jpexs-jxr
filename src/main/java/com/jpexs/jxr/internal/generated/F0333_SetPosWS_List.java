package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: SetPosWS_List.
 */
public final class F0333_SetPosWS_List {

    private F0333_SetPosWS_List() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[20];
        v[0] = a0;
        v[1] = a1;
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
                    default:
                        throw new IllegalStateException("Invalid block in SetPosWS_List");
                }
                previous = old;
                if (pc < 0) {
                    return v[19];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(1L, 32) * 44L)) & 4294967295L;
        v[3] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        m.store(v[3], 0L, 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        m.store(v[4], 0L, 4);
        v[5] = v[1] > 4095L ? 1L : 0L;
        return v[5] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi6 = (previous == 1 ? v[9] : v[2]);
        long phi7 = (previous == 1 ? v[10] : v[1]);
        long phi8 = (previous == 1 ? v[11] : 0L);
        v[6] = phi6;
        v[7] = phi7;
        v[8] = phi8;
        v[9] = m.load(v[6], 4);
        v[10] = ((v[7] + 4294963200L)) & 4294967295L;
        v[11] = ((v[8] + 1L)) & 4294967295L;
        m.store(v[4], v[11], 4);
        v[12] = v[10] > 4095L ? 1L : 0L;
        v[13] = v[9] != 0L ? 1L : 0L;
        v[14] = v[12] != 0 ? v[13] : 0L;
        return v[14] != 0 ? 1 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = v[9] == 0L ? 1L : 0L;
        return v[15] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi16 = (previous == 2 ? v[9] : v[2]);
        long phi17 = (previous == 2 ? v[10] : v[1]);
        v[16] = phi16;
        v[17] = phi17;
        m.store(v[3], v[17], 4);
        v[18] = (v[16] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        m.store(v[0], v[18], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[19] = 0L;
        return -1;
    }
}
