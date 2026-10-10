package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKCodecFactory_CreateFormatConverter.
 */
public final class F0050_PKCodecFactory_CreateFormatConverter {

    private F0050_PKCodecFactory_CreateFormatConverter() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[13];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKCodecFactory_CreateFormatConverter");
                }
                previous = old;
                if (pc < 0) {
                    return v[12];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = LibC.call(m, "calloc", new long[]{1L, 56L});
        m.store(v[0], v[1], 4);
        v[2] = v[1] == 0L ? 1L : 0L;
        return v[2] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[1], 1879048406L, 4);
        v[3] = (v[1] + (Heap.s(0L, 32) * 56L) + 4L) & 4294967295L;
        m.store(v[3], 1879048407L, 4);
        v[4] = (v[1] + (Heap.s(0L, 32) * 56L) + 8L) & 4294967295L;
        m.store(v[4], 1879048409L, 4);
        v[5] = (v[1] + (Heap.s(0L, 32) * 56L) + 12L) & 4294967295L;
        m.store(v[5], 1879048410L, 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 56L) + 16L) & 4294967295L;
        m.store(v[6], 1879048411L, 4);
        v[7] = (v[1] + (Heap.s(0L, 32) * 56L) + 20L) & 4294967295L;
        m.store(v[7], 1879048412L, 4);
        v[8] = (v[1] + (Heap.s(0L, 32) * 56L) + 24L) & 4294967295L;
        m.store(v[8], 1879048413L, 4);
        v[9] = (v[1] + (Heap.s(0L, 32) * 56L) + 28L) & 4294967295L;
        m.store(v[9], 1879048414L, 4);
        v[10] = (v[1] + (Heap.s(0L, 32) * 56L) + 32L) & 4294967295L;
        m.store(v[10], 1879048415L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi11 = (previous == 0 ? 4294967195L : 0L);
        v[11] = phi11;
        v[12] = v[11];
        return -1;
    }
}
