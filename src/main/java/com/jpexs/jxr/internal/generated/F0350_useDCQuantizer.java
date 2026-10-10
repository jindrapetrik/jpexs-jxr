package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: useDCQuantizer.
 */
public final class F0350_useDCQuantizer {

    private F0350_useDCQuantizer() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[17];
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
                    default:
                        throw new IllegalStateException("Invalid block in useDCQuantizer");
                }
                previous = old;
                if (pc < 0) {
                    return v[16];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi6 = (previous == 1 ? 0L : v[13]);
        v[6] = phi6;
        v[7] = m.load(v[5], 4);
        v[8] = (v[7] + (Heap.s(v[1], 32) * 240L)) & 4294967295L;
        v[9] = (v[7] + (Heap.s(v[1], 32) * 240L) + 64L + (Heap.s(v[6], 32) * 4L)) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = (v[8] + (Heap.s(0L, 32) * 64L) + (Heap.s(v[6], 32) * 4L)) & 4294967295L;
        v[12] = m.load(v[11], 4);
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[10], v[12], 20L, 0L});
        v[13] = ((v[6] + 1L)) & 4294967295L;
        v[14] = m.load(v[2], 4);
        v[15] = v[13] < v[14] ? 1L : 0L;
        return v[15] != 0 ? 2 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return -1;
    }
}
