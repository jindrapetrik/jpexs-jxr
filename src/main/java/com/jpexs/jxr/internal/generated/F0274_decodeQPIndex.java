package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: decodeQPIndex.
 */
public final class F0274_decodeQPIndex {

    private F0274_decodeQPIndex() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[42];
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
                    case 1:
                        pc = b1(m, v, previous);
                        break;
                    case 2:
                        pc = b2(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in decodeQPIndex");
                }
                previous = old;
                if (pc < 0) {
                    return v[41];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = ((v[5] + 1L)) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[6] >>> 3L)) & 4294967295L;
        v[10] = (v[8] + (Heap.s(v[9], 32) * 1L)) & 4294967295L;
        v[11] = (v[10]) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = ((v[13] & v[11])) & 4294967295L;
        v[15] = (v[14]) & 4294967295L;
        m.store(v[7], v[15], 4);
        v[16] = ((v[6] & 15L)) & 4294967295L;
        m.store(v[4], v[16], 4);
        v[17] = m.load(v[15], 4);
        v[18] = F0340__byteswap_ulong.run(m, v[17]);
        v[19] = m.load(v[4], 4);
        v[20] = ((v[18] << v[19])) & 4294967295L;
        m.store(v[2], v[20], 4);
        v[21] = Heap.s(v[3], 32) > Heap.s(4294967295L, 32) ? 1L : 0L;
        return v[21] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[22] = (v[1]) & 4294967295L;
        v[23] = ((32L - v[22])) & 4294967295L;
        v[24] = ((v[20] >>> v[23])) & 4294967295L;
        v[25] = ((v[19] + v[22])) & 4294967295L;
        v[26] = m.load(v[7], 4);
        v[27] = ((v[25] >>> 3L)) & 4294967295L;
        v[28] = (v[26] + (Heap.s(v[27], 32) * 1L)) & 4294967295L;
        v[29] = (v[28]) & 4294967295L;
        v[30] = m.load(v[12], 4);
        v[31] = ((v[30] & v[29])) & 4294967295L;
        v[32] = (v[31]) & 4294967295L;
        m.store(v[7], v[32], 4);
        v[33] = ((v[25] & 15L)) & 4294967295L;
        m.store(v[4], v[33], 4);
        v[34] = m.load(v[32], 4);
        v[35] = F0340__byteswap_ulong.run(m, v[34]);
        v[36] = m.load(v[4], 4);
        v[37] = ((v[35] << v[36])) & 4294967295L;
        m.store(v[2], v[37], 4);
        v[38] = (v[24]) & 255L;
        v[39] = ((v[38] + 1L)) & 255L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi40 = (previous == 1 ? v[39] : 0L);
        v[40] = phi40;
        v[41] = v[40];
        return -1;
    }
}
