package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_SetEXIFMetadata_WMP.
 */
public final class F0108_PKImageEncode_SetEXIFMetadata_WMP {

    private F0108_PKImageEncode_SetEXIFMetadata_WMP() {
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_SetEXIFMetadata_WMP");
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
        v[3] = (v[0] + (Heap.s(0L, 32) * 66276L) + 128L) & 4294967295L;
        v[4] = (v[0] + (Heap.s(0L, 32) * 66276L) + 132L) & 4294967295L;
        v[5] = (v[0] + (Heap.s(0L, 32) * 66276L) + 108L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = v[6] == 0L ? 1L : 0L;
        return v[7] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = F0032_PKFree.run(m, v[3]);
        m.store(v[4], 0L, 4);
        v[9] = F0030_PKAlloc.run(m, v[3], v[2]);
        v[10] = Heap.s(v[9], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[10] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = m.load(v[3], 4);
        v[12] = LibC.call(m, "memcpy", new long[]{v[11], v[1], v[2]});
        m.store(v[4], v[2], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 2 ? v[9] : (previous == 0 ? 4294967187L : v[9]));
        v[13] = phi13;
        v[14] = v[13];
        return -1;
    }
}
