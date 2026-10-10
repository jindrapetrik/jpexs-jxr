package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_Release.
 */
public final class F0079_PKImageDecode_Release {

    private F0079_PKImageDecode_Release() {
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
                        throw new IllegalStateException("Invalid block in PKImageDecode_Release");
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
        v[1] = m.load(v[0], 4);
        v[2] = (v[1] + (Heap.s(0L, 32) * 66224L) + 48L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = (v[1] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[6] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = Dispatch.call(m, v[8], new long[]{v[5]});
        v[10] = m.load(v[0], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi11 = (previous == 1 ? v[10] : v[1]);
        v[11] = phi11;
        LibC.call(m, "free", new long[]{v[11]});
        m.store(v[0], 0L, 4);
        v[12] = 0L;
        return -1;
    }
}
