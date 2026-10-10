package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: transcodeQuantizers.
 */
public final class F0249_transcodeQuantizers {

    private F0249_transcodeQuantizers() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4, long a5) {
        long[] v = new long[33];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
        v[5] = a5;
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
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    case 7:
                        pc = b7(m, v, previous);
                        break;
                    case 8:
                        pc = b8(m, v, previous);
                        break;
                    case 9:
                        pc = b9(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in transcodeQuantizers");
                }
                previous = old;
                if (pc < 0) {
                    return v[32];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[6] = v[5] == 1L ? 1L : 0L;
        v[7] = (v[6]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[7], 1L);
        v[8] = v[5] == 0L ? 1L : 0L;
        return v[8] != 0 ? 1 : 9;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = ((v[3] + 4294967295L)) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[9], 4L);
        v[10] = v[3] == 0L ? 1L : 0L;
        return v[10] != 0 ? 9 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = v[4] > 1L ? 1L : 0L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi12 = (previous == 2 ? 0L : v[30]);
        v[12] = phi12;
        v[13] = (v[1] + (Heap.s(v[12], 32) * 16L)) & 4294967295L;
        return v[11] != 0 ? 4 : 7;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[14] = (v[2] + (Heap.s(v[12], 32) * 1L)) & 4294967295L;
        v[15] = m.load(v[14], 1);
        v[16] = LibC.call(m, "llvm.umin.i8", new long[]{v[15], 2L});
        v[17] = (v[16]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[17], 2L);
        v[18] = m.load(v[13], 1);
        v[19] = (v[18]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[19], 8L);
        switch ((int) v[16]) {
            case 1:
                return 5;
            case 0:
                return 8;
            default:
                return 6;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[20] = (v[13] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi21 = (previous == 6 ? v[25] : 1L);
        v[21] = phi21;
        v[22] = (v[13] + (Heap.s(v[21], 32) * 1L)) & 4294967295L;
        v[23] = m.load(v[22], 1);
        v[24] = (v[23]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[24], 8L);
        v[25] = ((v[21] + 1L)) & 4294967295L;
        v[26] = v[25] == v[4] ? 1L : 0L;
        return v[26] != 0 ? 8 : 6;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi27 = (previous == 5 ? v[20] : v[13]);
        v[27] = phi27;
        v[28] = m.load(v[27], 1);
        v[29] = (v[28]) & 4294967295L;
        F0297_putBit16.run(m, v[0], v[29], 8L);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[30] = ((v[12] + 1L)) & 4294967295L;
        v[31] = v[30] == v[3] ? 1L : 0L;
        return v[31] != 0 ? 9 : 3;
    }

    private static int b9(Heap m, long[] v, int previous) {
        return -1;
    }
}
