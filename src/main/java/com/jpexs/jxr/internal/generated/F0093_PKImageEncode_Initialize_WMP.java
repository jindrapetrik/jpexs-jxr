package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_Initialize_WMP.
 */
public final class F0093_PKImageEncode_Initialize_WMP {

    private F0093_PKImageEncode_Initialize_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[12];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_Initialize_WMP");
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
        v[4] = v[3] == 32860L ? 1L : 0L;
        return v[4] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[5], v[2], 32860L, 0L});
        v[6] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[6], v[2], 32860L, 0L});
        v[7] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        m.store(v[7], v[1], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 48L) & 4294967295L;
        m.store(v[8], v[1], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L + 48L) & 4294967295L;
        m.store(v[9], v[1], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : 4294967191L);
        v[10] = phi10;
        v[11] = v[10];
        return -1;
    }
}
