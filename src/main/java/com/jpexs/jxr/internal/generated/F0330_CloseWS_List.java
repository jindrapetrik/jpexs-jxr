package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: CloseWS_List.
 */
public final class F0330_CloseWS_List {

    private F0330_CloseWS_List() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[12];
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
                    default:
                        throw new IllegalStateException("Invalid block in CloseWS_List");
                }
                previous = old;
                if (pc < 0) {
                    return v[11];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.load(v[0], 4);
        v[2] = (v[1] + (Heap.s(1L, 32) * 44L)) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi5 = (previous == 1 ? v[6] : v[3]);
        v[5] = phi5;
        v[6] = m.load(v[5], 4);
        LibC.call(m, "free", new long[]{v[5]});
        v[7] = v[6] == 0L ? 1L : 0L;
        return v[7] != 0 ? 2 : 1;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = m.load(v[0], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi10 = (previous == 2 ? v[8] : v[1]);
        v[10] = phi10;
        LibC.call(m, "free", new long[]{v[10]});
        m.store(v[0], 0L, 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[11] = 0L;
        return -1;
    }
}
