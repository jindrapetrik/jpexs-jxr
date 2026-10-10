package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKFormatConverter_Initialize.
 */
public final class F0214_PKFormatConverter_Initialize {

    private F0214_PKFormatConverter_Initialize() {
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
                        throw new IllegalStateException("Invalid block in PKFormatConverter_Initialize");
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
        v[4] = m.stack(16L * 1L, 4);
        v[5] = (v[1] + (Heap.s(0L, 32) * 66224L) + 4L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = Dispatch.call(m, v[6], new long[]{v[1], v[4]});
        v[8] = Heap.s(v[7], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = F0215_PKFormatConverter_InitializeConvert.run(m, v[0], v[4], v[2], v[3]);
        v[10] = Heap.s(v[9], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[10] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = (v[0] + (Heap.s(0L, 32) * 56L) + 36L) & 4294967295L;
        m.store(v[11], v[1], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi12 = (previous == 2 ? v[9] : (previous == 0 ? v[7] : v[9]));
        v[12] = phi12;
        v[13] = v[12];
        return -1;
    }
}
