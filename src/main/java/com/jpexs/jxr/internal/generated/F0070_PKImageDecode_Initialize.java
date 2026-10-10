package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_Initialize.
 */
public final class F0070_PKImageDecode_Initialize {

    private F0070_PKImageDecode_Initialize() {
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_Initialize");
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
        v[2] = (v[0] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        m.store(v[2], v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 66224L) + 56L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[3], 9616L, 16L, 0L});
        v[4] = (v[0] + (Heap.s(0L, 32) * 66224L) + 84L) & 4294967295L;
        m.store(v[4], 1119879168L, 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 66224L) + 88L) & 4294967295L;
        m.store(v[5], 1119879168L, 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 66224L) + 92L) & 4294967295L;
        m.store(v[6], 1L, 4);
        v[7] = (v[1] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 66224L) + 52L) & 4294967295L;
        v[10] = Dispatch.call(m, v[8], new long[]{v[1], v[9]});
        v[11] = Heap.s(v[10], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[11] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L) & 4294967295L;
        v[13] = LibC.call(m, "memset", new long[]{v[12], 0L, 88L});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[14] = 0L;
        return -1;
    }
}
