package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transcodeQuantizer.
 */
public final class F0247_transcodeQuantizer {

    private F0247_transcodeQuantizer() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[20];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                        throw new IllegalStateException("Invalid block in transcodeQuantizer");
                }
                previous = old;
                if (pc < 0) {
                    return v[19];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = v[3] > 1L ? 1L : 0L;
        return v[4] != 0 ? 1 : 4;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = LibC.call(m, "llvm.umin.i8", new long[]{v[2], 2L});
        v[6] = (v[5]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[6], 2L);
        v[7] = m.load(v[1], 1);
        v[8] = (v[7]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[8], 8L);
        switch ((int) v[5]) {
            case 1:
                return 2;
            case 0:
                return 5;
            default:
                return 3;
        }
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[9] = (v[1] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        return 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi10 = (previous == 3 ? v[14] : 1L);
        v[10] = phi10;
        v[11] = (v[1] + (Heap.s(v[10], 32) * 1L)) & 4294967295L;
        v[12] = m.load(v[11], 1);
        v[13] = (v[12]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[13], 8L);
        v[14] = ((v[10] + 1L)) & 4294967295L;
        v[15] = v[14] == v[3] ? 1L : 0L;
        return v[15] != 0 ? 5 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi16 = (previous == 2 ? v[9] : v[1]);
        v[16] = phi16;
        v[17] = m.load(v[16], 1);
        v[18] = (v[17]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[18], 8L);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        return -1;
    }
}
