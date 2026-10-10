package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_EncodeContent_Init.
 */
public final class F0095_PKImageEncode_EncodeContent_Init {

    private F0095_PKImageEncode_EncodeContent_Init() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[55];
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
                    case 3:
                        pc = b3(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_EncodeContent_Init");
                }
                previous = old;
                if (pc < 0) {
                    return v[54];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = (v[0] + (Heap.s(0L, 32) * 66276L) + 84L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L) & 4294967295L;
        m.store(v[7], v[6], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 66276L) + 88L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 4L) & 4294967295L;
        m.store(v[10], v[9], 4);
        v[11] = (v[1] + (Heap.s(0L, 32) * 40L) + 12L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 12L) & 4294967295L;
        m.store(v[13], v[12], 4);
        v[14] = (v[1] + (Heap.s(0L, 32) * 40L) + 16L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 16L) & 4294967295L;
        m.store(v[16], v[15], 4);
        v[17] = (v[1] + (Heap.s(0L, 32) * 40L) + 20L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = ((v[18] >>> 6L)) & 4294967295L;
        v[20] = ((v[19] & 1L)) & 4294967295L;
        v[21] = ((v[20] ^ 1L)) & 4294967295L;
        v[22] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 24L) & 4294967295L;
        m.store(v[22], v[21], 4);
        v[23] = (v[1] + (Heap.s(0L, 32) * 40L) + 8L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        v[25] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 8L) & 4294967295L;
        m.store(v[25], v[24], 4);
        v[26] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65980L) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 60L) & 4294967295L;
        m.store(v[28], v[27], 4);
        v[29] = (v[3]) & 4294967295L;
        v[30] = ((v[29] & 127L)) & 4294967295L;
        v[31] = v[30] == 0L ? 1L : 0L;
        return v[31] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[32] = ((v[6] | v[2])) & 4294967295L;
        v[33] = ((v[32] & 15L)) & 4294967295L;
        v[34] = ((v[4] & 127L)) & 4294967295L;
        v[35] = ((v[33] | v[34])) & 4294967295L;
        v[36] = v[35] == 0L ? 1L : 0L;
        return v[36] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[37] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 88L + 68L) & 4294967295L;
        m.store(v[37], 1L, 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[38] = v[24] != 6L ? 1L : 0L;
        v[39] = ((v[18] & 16L)) & 4294967295L;
        v[40] = v[39] != 0L ? 1L : 0L;
        v[41] = v[38] != 0 ? 1L : v[40];
        v[42] = (v[1] + (Heap.s(0L, 32) * 40L) + 4L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        v[44] = (Heap.s(v[41], 1)) & 4294967295L;
        v[45] = ((v[43] + v[44])) & 4294967295L;
        v[46] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32L) & 4294967295L;
        m.store(v[46], v[45], 4);
        v[47] = (v[0] + (Heap.s(0L, 32) * 66276L) + 92L) & 4294967295L;
        m.store(v[47], 0L, 4);
        v[48] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L) & 4294967295L;
        v[49] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 32856L) & 4294967295L;
        m.store(v[49], 1L, 4);
        v[50] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 33020L) & 4294967295L;
        v[51] = F0426_ImageStrEncInit.run(m, v[7], v[48], v[50]);
        v[52] = v[51] != 0L ? 1L : 0L;
        v[53] = (Heap.s(v[52], 1)) & 4294967295L;
        v[54] = v[53];
        return -1;
    }
}
