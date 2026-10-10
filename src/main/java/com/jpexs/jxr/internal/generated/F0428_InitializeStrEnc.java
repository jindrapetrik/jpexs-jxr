package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: InitializeStrEnc.
 */
public final class F0428_InitializeStrEnc {

    private F0428_InitializeStrEnc() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[35];
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
                        throw new IllegalStateException("Invalid block in InitializeStrEnc");
                }
                previous = old;
                if (pc < 0) {
                    return v[34];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        m.store(v[0], 35064L, 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[3], v[1], 72L, 0L});
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[4], v[2], 32860L, 0L});
        v[5] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 32833L) & 4294967295L;
        v[6] = m.load(v[5], 1);
        v[7] = v[6] == 0L ? 1L : 0L;
        v[8] = ((v[6] ^ 128L)) & 255L;
        v[9] = v[7] != 0 ? 4L : v[8];
        m.store(v[5], v[9], 1);
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        m.store(v[10], 0L, 4);
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        m.store(v[11], 0L, 4);
        v[12] = m.load(v[3], 4);
        v[13] = ((v[12] + 15L)) & 4294967295L;
        v[14] = ((v[13] >>> 4L)) & 4294967295L;
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34332L) & 4294967295L;
        m.store(v[15], v[14], 4);
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 4L + 4L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = ((v[17] + 15L)) & 4294967295L;
        v[19] = ((v[18] >>> 4L)) & 4294967295L;
        v[20] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34336L) & 4294967295L;
        m.store(v[20], v[19], 4);
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34408L) & 4294967295L;
        m.store(v[21], 1879048619L, 4);
        v[22] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34420L) & 4294967295L;
        m.store(v[22], 1879048676L, 4);
        v[23] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34424L) & 4294967295L;
        m.store(v[23], 1879048603L, 4);
        v[24] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34428L) & 4294967295L;
        m.store(v[24], 1879048603L, 4);
        v[25] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34432L) & 4294967295L;
        m.store(v[25], 1879048603L, 4);
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34436L) & 4294967295L;
        m.store(v[26], 1879048603L, 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34440L) & 4294967295L;
        m.store(v[27], 1879048603L, 4);
        v[28] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34444L) & 4294967295L;
        m.store(v[28], 1879048603L, 4);
        v[29] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34448L) & 4294967295L;
        m.store(v[29], 1879048603L, 4);
        v[30] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34452L) & 4294967295L;
        m.store(v[30], 1879048603L, 4);
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34456L) & 4294967295L;
        m.store(v[31], 1879048603L, 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        m.store(v[32], 0L, 4);
        v[33] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34932L) & 4294967295L;
        m.store(v[33], 0L, 4);
        return -1;
    }
}
