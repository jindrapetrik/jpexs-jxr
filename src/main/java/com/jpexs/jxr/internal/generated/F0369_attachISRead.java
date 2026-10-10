package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: attachISRead.
 */
public final class F0369_attachISRead {

    private F0369_attachISRead() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[28];
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
                        throw new IllegalStateException("Invalid block in attachISRead");
                }
                previous = old;
                if (pc < 0) {
                    return v[27];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[1] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 32L) + 28L) & 4294967295L;
        v[6] = Dispatch.call(m, v[4], new long[]{v[1], v[5]});
        v[7] = (v[0] + (Heap.s(4294959104L, 32) * 1L)) & 4294967295L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 32L) + 16L) & 4294967295L;
        m.store(v[8], v[7], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        m.store(v[9], v[7], 4);
        v[10] = (v[1] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = m.load(v[5], 4);
        v[13] = Dispatch.call(m, v[11], new long[]{v[1], v[12]});
        v[14] = (v[1] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = m.load(v[8], 4);
        v[17] = Dispatch.call(m, v[15], new long[]{v[1], v[16], 8192L});
        v[18] = m.load(v[5], 4);
        v[19] = ((v[18] + 8192L)) & 4294967295L;
        m.store(v[5], v[19], 4);
        v[20] = m.load(v[8], 4);
        v[21] = m.load(v[20], 4);
        v[22] = LibC.call(m, "llvm.bswap.i32", new long[]{v[21]});
        v[23] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        m.store(v[23], v[22], 4);
        v[24] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        m.store(v[24], 0L, 4);
        v[25] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        m.store(v[25], 4294959102L, 4);
        v[26] = (v[0] + (Heap.s(0L, 32) * 32L) + 24L) & 4294967295L;
        m.store(v[26], v[1], 4);
        v[27] = 0L;
        return -1;
    }
}
