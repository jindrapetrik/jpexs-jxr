package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: attachISWrite.
 */
public final class F0371_attachISWrite {

    private F0371_attachISWrite() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[14];
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
                    default:
                        throw new IllegalStateException("Invalid block in attachISWrite");
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
        v[2] = (v[1] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 32L) + 28L) & 4294967295L;
        v[5] = Dispatch.call(m, v[3], new long[]{v[1], v[4]});
        v[6] = (v[0] + (Heap.s(4294959104L, 32) * 1L)) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 32L) + 16L) & 4294967295L;
        m.store(v[7], v[6], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        m.store(v[8], v[6], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        m.store(v[9], 0L, 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        m.store(v[10], 0L, 4);
        v[11] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        m.store(v[11], 4294959103L, 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 32L) + 24L) & 4294967295L;
        m.store(v[12], v[1], 4);
        v[13] = 0L;
        return -1;
    }
}
