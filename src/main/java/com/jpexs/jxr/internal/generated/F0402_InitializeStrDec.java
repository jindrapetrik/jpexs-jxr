package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: InitializeStrDec.
 */
public final class F0402_InitializeStrDec {

    private F0402_InitializeStrDec() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[39];
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
                        throw new IllegalStateException("Invalid block in InitializeStrDec");
                }
                previous = old;
                if (pc < 0) {
                    return v[38];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L) & 4294967295L;
        v[4] = LibC.call(m, "memcpy", new long[]{v[3], v[1], 112L});
        m.store(v[0], 35064L, 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        v[6] = (v[2] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[5], v[6], 72L, 0L});
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L) & 4294967295L;
        v[8] = (v[2] + (Heap.s(0L, 32) * 35064L) + 76L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[7], v[8], 32860L, 0L});
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        m.store(v[9], 0L, 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        m.store(v[10], 0L, 4);
        v[11] = m.load(v[5], 4);
        v[12] = ((v[11] + 15L)) & 4294967295L;
        v[13] = ((v[12] >>> 4L)) & 4294967295L;
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        m.store(v[14], v[13], 4);
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 4L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = ((v[16] + 15L)) & 4294967295L;
        v[18] = ((v[17] >>> 4L)) & 4294967295L;
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        m.store(v[19], v[18], 4);
        v[20] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34408L) & 4294967295L;
        m.store(v[20], 1879048576L, 4);
        v[21] = (v[1] + (Heap.s(0L, 32) * 112L) + 4L) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = v[22] == 0L ? 1L : 0L;
        v[24] = v[23] != 0 ? 1879048655L : 1879048656L;
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34412L) & 4294967295L;
        m.store(v[25], v[24], 4);
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34416L) & 4294967295L;
        m.store(v[26], v[24], 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34424L) & 4294967295L;
        m.store(v[27], 1879048572L, 4);
        v[28] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34428L) & 4294967295L;
        m.store(v[28], 1879048572L, 4);
        v[29] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34432L) & 4294967295L;
        m.store(v[29], 1879048572L, 4);
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34436L) & 4294967295L;
        m.store(v[30], 1879048572L, 4);
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34440L) & 4294967295L;
        m.store(v[31], 1879048572L, 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34444L) & 4294967295L;
        m.store(v[32], 1879048572L, 4);
        v[33] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34448L) & 4294967295L;
        m.store(v[33], 1879048572L, 4);
        v[34] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34452L) & 4294967295L;
        m.store(v[34], 1879048572L, 4);
        v[35] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34456L) & 4294967295L;
        m.store(v[35], 1879048572L, 4);
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        m.store(v[36], 0L, 4);
        v[37] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        m.store(v[37], 0L, 4);
        return -1;
    }
}
