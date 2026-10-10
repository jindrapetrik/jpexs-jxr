package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ClipDCL.
 */
public final class F0456_ClipDCL {

    private F0456_ClipDCL() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[11];
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
                    default:
                        throw new IllegalStateException("Invalid block in ClipDCL");
                }
                previous = old;
                if (pc < 0) {
                    return v[10];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = Heap.s(v[0], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[2] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = Heap.s(v[1], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[3] != 0 ? 2 : 5;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[4] = LibC.call(m, "llvm.smin.i32", new long[]{v[0], v[1]});
        return 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[5] = v[0] != 0L ? 1L : 0L;
        v[6] = Heap.s(v[1], 32) < Heap.s(0L, 32) ? 1L : 0L;
        v[7] = ((v[5] & v[6])) & 1L;
        return v[7] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[8] = LibC.call(m, "llvm.smax.i32", new long[]{v[0], v[1]});
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi9 = (previous == 2 ? v[4] : (previous == 4 ? v[8] : (previous == 3 ? 0L : 0L)));
        v[9] = phi9;
        v[10] = v[9];
        return -1;
    }
}
