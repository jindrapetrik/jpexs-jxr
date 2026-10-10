package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: formatQuantizer.
 */
public final class F0348_formatQuantizer {

    private F0348_formatQuantizer() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4, long a5) {
        long[] v = new long[26];
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
                    default:
                        throw new IllegalStateException("Invalid block in formatQuantizer");
                }
                previous = old;
                if (pc < 0) {
                    return v[25];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[6] = v[2] == 0L ? 1L : 0L;
        return v[6] != 0 ? 7 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[8] = m.load(v[0], 4);
        v[9] = (v[8] + (Heap.s(v[3], 32) * 20L)) & 4294967295L;
        F0465_remapQP.run(m, v[9], 1L, v[5]);
        v[10] = v[2] == 1L ? 1L : 0L;
        return v[10] != 0 ? 7 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = v[4] != 1L ? 1L : 0L;
        v[12] = (v[11]) & 4294967295L;
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 2 ? 1L : v[23]);
        v[13] = phi13;
        switch ((int) v[1]) {
            case 0:
                return 5;
            case 1:
                return 4;
            default:
                return 6;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi14 = (previous == 4 ? v[7] : v[0]);
        v[14] = phi14;
        v[15] = (v[0] + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = (v[16] + (Heap.s(v[3], 32) * 20L)) & 4294967295L;
        v[18] = m.load(v[14], 4);
        v[19] = (v[18] + (Heap.s(v[3], 32) * 20L)) & 4294967295L;
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[17], v[19], 20L, 0L});
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[20] = (v[0] + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = (v[21] + (Heap.s(v[3], 32) * 20L)) & 4294967295L;
        F0465_remapQP.run(m, v[22], v[12], v[5]);
        v[23] = ((v[13] + 1L)) & 4294967295L;
        v[24] = v[23] == v[2] ? 1L : 0L;
        return v[24] != 0 ? 7 : 3;
    }

    private static int b7(Heap m, long[] v, int previous) {
        return -1;
    }
}
