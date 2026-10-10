package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: _getBool16.
 */
public final class F0273__getBool16 {

    private F0273__getBool16() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[25];
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
                    case 3:
                        pc = b3(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in _getBool16");
                }
                previous = old;
                if (pc < 0) {
                    return v[24];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 32L) + 4L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = (v[0] + (Heap.s(0L, 32) * 32L) + 8L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = ((v[4] + 1L)) & 4294967295L;
        m.store(v[3], v[5], 4);
        v[6] = v[5] < 16L ? 1L : 0L;
        return v[6] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = ((v[2] << 1L)) & 4294967295L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 32L) + 20L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = ((v[5] >>> 3L)) & 4294967295L;
        v[11] = (v[9] + (Heap.s(v[10], 32) * 1L)) & 4294967295L;
        v[12] = (v[11]) & 4294967295L;
        v[13] = (v[0] + (Heap.s(0L, 32) * 32L) + 12L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = ((v[14] & v[12])) & 4294967295L;
        v[16] = (v[15]) & 4294967295L;
        m.store(v[8], v[16], 4);
        v[17] = ((v[5] & 15L)) & 4294967295L;
        m.store(v[3], v[17], 4);
        v[18] = m.load(v[16], 4);
        v[19] = F0340__byteswap_ulong.run(m, v[18]);
        v[20] = m.load(v[3], 4);
        v[21] = ((v[19] << v[20])) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi22 = (previous == 2 ? v[21] : v[7]);
        v[22] = phi22;
        m.store(v[1], v[22], 4);
        v[23] = ((v[2] >>> 31L)) & 4294967295L;
        v[24] = v[23];
        return -1;
    }
}
