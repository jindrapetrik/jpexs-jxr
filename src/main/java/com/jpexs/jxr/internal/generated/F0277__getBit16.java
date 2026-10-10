package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: _getBit16.
 */
public final class F0277__getBit16 {

    private F0277__getBit16() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[24];
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
                        throw new IllegalStateException("Invalid block in _getBit16");
                }
                previous = old;
                if (pc < 0) {
                    return v[23];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = ((32L - v[1])) & 4294967295L;
        v[5] = ((v[3] >>> v[4])) & 4294967295L;
        v[6] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = ((v[7] + v[1])) & 4294967295L;
        v[9] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((v[8] >>> 3L)) & 4294967295L;
        v[12] = (v[10] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        v[13] = (v[12]) & 4294967295L;
        v[14] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = ((v[15] & v[13])) & 4294967295L;
        v[17] = (v[16]) & 4294967295L;
        m.store(v[9], v[17], 4);
        v[18] = ((v[8] & 15L)) & 4294967295L;
        m.store(v[6], v[18], 4);
        v[19] = m.load(v[17], 4);
        v[20] = F0340__byteswap_ulong.run(m, v[19]);
        v[21] = m.load(v[6], 4);
        v[22] = ((v[20] << v[21])) & 4294967295L;
        m.store(v[2], v[22], 4);
        v[23] = v[5];
        return -1;
    }
}
