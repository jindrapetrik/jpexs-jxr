package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_EncodeAlpha_Init.
 */
public final class F0099_PKImageEncode_EncodeAlpha_Init {

    private F0099_PKImageEncode_EncodeAlpha_Init() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[50];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_EncodeAlpha_Init");
                }
                previous = old;
                if (pc < 0) {
                    return v[49];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[5], v[6], 72L, 0L});
        v[7] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        m.store(v[5], v[8], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 66276L) + 88L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 4L) & 4294967295L;
        m.store(v[11], v[10], 4);
        v[12] = (v[1] + (Heap.s(0L, 32) * 40L) + 12L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 12L) & 4294967295L;
        m.store(v[14], v[13], 4);
        v[15] = (v[1] + (Heap.s(0L, 32) * 40L) + 16L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 16L) & 4294967295L;
        m.store(v[17], v[16], 4);
        v[18] = (v[1] + (Heap.s(0L, 32) * 40L) + 20L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = ((v[19] >>> 6L)) & 4294967295L;
        v[21] = ((v[20] & 1L)) & 4294967295L;
        v[22] = ((v[21] ^ 1L)) & 4294967295L;
        v[23] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 24L) & 4294967295L;
        m.store(v[23], v[22], 4);
        v[24] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65980L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 60L) & 4294967295L;
        m.store(v[26], v[25], 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 12L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = ((v[28] + 4294967295L)) & 4294967295L;
        v[30] = v[29] < 7L ? 1L : 0L;
        return v[30] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[31] = (8528L + (Heap.s(0L, 32) * 28L) + (Heap.s(v[29], 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        v[33] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 16L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = ((v[34] >>> v[32])) & 4294967295L;
        v[36] = ((v[35] + 4294967295L)) & 4294967295L;
        v[37] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 20L) & 4294967295L;
        v[38] = m.load(v[37], 4);
        v[39] = ((v[36] + v[38])) & 4294967295L;
        m.store(v[37], v[39], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[40] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33024L + 8L) & 4294967295L;
        m.store(v[40], 0L, 4);
        v[41] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L) & 4294967295L;
        v[42] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L + 16L) & 4294967295L;
        m.store(v[42], 0L, 4);
        v[43] = (v[0] + (Heap.s(0L, 32) * 66276L) + 92L) & 4294967295L;
        m.store(v[43], 0L, 4);
        v[44] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33096L + 32856L) & 4294967295L;
        m.store(v[44], 1L, 4);
        v[45] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65956L) & 4294967295L;
        v[46] = F0426_ImageStrEncInit.run(m, v[5], v[41], v[45]);
        v[47] = v[46] != 0L ? 1L : 0L;
        v[48] = (Heap.s(v[47], 1)) & 4294967295L;
        v[49] = v[48];
        return -1;
    }
}
