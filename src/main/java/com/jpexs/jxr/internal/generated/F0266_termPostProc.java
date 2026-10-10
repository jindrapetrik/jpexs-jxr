package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: termPostProc.
 */
public final class F0266_termPostProc {

    private F0266_termPostProc() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[15];
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
                    case 5:
                        pc = b5(m, v, previous);
                        break;
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in termPostProc");
                }
                previous = old;
                if (pc < 0) {
                    return v[14];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = v[1] == 0L ? 1L : 0L;
        return v[2] != 0 ? 6 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi3 = (previous == 5 ? v[12] : 0L);
        v[3] = phi3;
        v[4] = (v[0] + (Heap.s(v[3], 32) * 8L) + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[7] = (v[5] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "free", new long[]{v[7]});
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(v[3], 32) * 8L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = v[9] == 0L ? 1L : 0L;
        return v[10] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[11] = (v[9] + (Heap.s(4294967295L, 32) * 88L)) & 4294967295L;
        LibC.call(m, "free", new long[]{v[11]});
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[12] = ((v[3] + 1L)) & 4294967295L;
        v[13] = v[12] == v[1] ? 1L : 0L;
        return v[13] != 0 ? 6 : 1;
    }

    private static int b6(Heap m, long[] v, int previous) {
        return -1;
    }
}
