package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writePacketHeader.
 */
public final class F0406_writePacketHeader {

    private F0406_writePacketHeader() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[9];
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
                        throw new IllegalStateException("Invalid block in writePacketHeader");
                }
                previous = old;
                if (pc < 0) {
                    return v[8];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        F0297_putBit16.run(m, v[0], 0L, 8L);
        F0297_putBit16.run(m, v[0], 0L, 8L);
        F0297_putBit16.run(m, v[0], 1L, 8L);
        v[3] = (v[2]) & 4294967295L;
        v[4] = ((v[3] << 3L)) & 4294967295L;
        v[5] = ((v[1] & 7L)) & 255L;
        v[6] = (v[5]) & 4294967295L;
        v[7] = ((v[4] | v[6])) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[7], 8L);
        return -1;
    }
}
