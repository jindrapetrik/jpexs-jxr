package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_Initialize.
 */
public final class F0053_PKImageEncode_Initialize {

    private F0053_PKImageEncode_Initialize() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[14];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_Initialize");
                }
                previous = old;
                if (pc < 0) {
                    return v[13];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        m.store(v[4], v[1], 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 66276L) + 68L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[5], 9616L, 16L, 0L});
        v[6] = (v[0] + (Heap.s(0L, 32) * 66276L) + 96L) & 4294967295L;
        m.store(v[6], 1119879168L, 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 66276L) + 100L) & 4294967295L;
        m.store(v[7], 1119879168L, 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 66276L) + 104L) & 4294967295L;
        m.store(v[8], 1L, 4);
        v[9] = (v[1] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = (v[0] + (Heap.s(0L, 32) * 66276L) + 64L) & 4294967295L;
        v[12] = Dispatch.call(m, v[10], new long[]{v[1], v[11]});
        v[13] = v[12];
        return -1;
    }
}
