package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transcodeQuantizersAlpha.
 */
public final class F0250_transcodeQuantizersAlpha {

    private F0250_transcodeQuantizersAlpha() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[17];
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
                        throw new IllegalStateException("Invalid block in transcodeQuantizersAlpha");
                }
                previous = old;
                if (pc < 0) {
                    return v[16];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = v[4] == 1L ? 1L : 0L;
        v[6] = (v[5]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[6], 1L);
        v[7] = v[4] == 0L ? 1L : 0L;
        return v[7] != 0 ? 1 : 3;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = ((v[2] + 4294967295L)) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[8], 4L);
        v[9] = v[2] == 0L ? 1L : 0L;
        return v[9] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 2 ? v[14] : 0L);
        v[10] = phi10;
        v[11] = (v[1] + (Heap.s(v[10], 32) * 16L) + (Heap.s(v[3], 32) * 1L)) & 4294967295L;
        v[12] = m.load(v[11], 1);
        v[13] = (v[12]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[13], 8L);
        v[14] = ((v[10] + 1L)) & 4294967295L;
        v[15] = v[14] == v[2] ? 1L : 0L;
        return v[15] != 0 ? 3 : 2;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return -1;
    }
}
