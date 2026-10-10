package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: writeQuantizer.
 */
public final class F0405_writeQuantizer {

    private F0405_writeQuantizer() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[27];
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
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    case 5:
                        pc = b5(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in writeQuantizer");
                }
                previous = old;
                if (pc < 0) {
                    return v[26];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = v[3] > 1L ? 1L : 0L;
        return v[5] != 0 ? 1 : 4;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = LibC.call(m, "llvm.umin.i8", new long[]{v[2], 2L});
        v[7] = (v[6]) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[7], 2L);
        v[8] = m.load(v[0], 4);
        v[9] = (v[8] + (Heap.s(v[4], 32) * 20L)) & 4294967295L;
        v[10] = m.load(v[9], 1);
        v[11] = (v[10]) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[11], 8L);
        switch ((int) v[6]) {
            case 1:
                return 2;
            case 0:
                return 5;
            default:
                return 3;
        }
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 3 ? v[19] : 1L);
        v[13] = phi13;
        v[14] = (v[0] + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[15] + (Heap.s(v[4], 32) * 20L)) & 4294967295L;
        v[17] = m.load(v[16], 1);
        v[18] = (v[17]) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[18], 8L);
        v[19] = ((v[13] + 1L)) & 4294967295L;
        v[20] = v[19] == v[3] ? 1L : 0L;
        return v[20] != 0 ? 5 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi21 = (previous == 2 ? v[12] : v[0]);
        v[21] = phi21;
        v[22] = m.load(v[21], 4);
        v[23] = (v[22] + (Heap.s(v[4], 32) * 20L)) & 4294967295L;
        v[24] = m.load(v[23], 1);
        v[25] = (v[24]) & 4294967295L;
        F0297_putBit16.run(m, v[1], v[25], 8L);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        return -1;
    }
}
