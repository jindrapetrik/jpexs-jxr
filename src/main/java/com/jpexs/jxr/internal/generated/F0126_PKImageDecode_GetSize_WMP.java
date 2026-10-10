package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_GetSize_WMP.
 */
public final class F0126_PKImageDecode_GetSize_WMP {

    private F0126_PKImageDecode_GetSize_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[15];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_GetSize_WMP");
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
        v[3] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 60L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = v[4] > 3L ? 1L : 0L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 66224L) + 76L) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 66224L) + 72L) & 4294967295L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 66224L) + 72L) & 4294967295L;
        v[9] = (v[0] + (Heap.s(0L, 32) * 66224L) + 76L) & 4294967295L;
        v[10] = v[5] != 0 ? v[6] : v[8];
        v[11] = v[5] != 0 ? v[7] : v[9];
        v[12] = m.load(v[10], 4);
        m.store(v[1], v[12], 4);
        v[13] = m.load(v[11], 4);
        m.store(v[2], v[13], 4);
        v[14] = 0L;
        return -1;
    }
}
