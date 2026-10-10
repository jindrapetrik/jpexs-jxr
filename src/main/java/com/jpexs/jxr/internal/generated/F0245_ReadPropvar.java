package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ReadPropvar.
 */
public final class F0245_ReadPropvar {

    private F0245_ReadPropvar() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[19];
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
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    case 7:
                        pc = b7(m, v, previous);
                        break;
                    case 8:
                        pc = b8(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in ReadPropvar");
                }
                previous = old;
                if (pc < 0) {
                    return v[18];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = LibC.call(m, "memset", new long[]{v[4], 0L, 8L});
        v[6] = v[2] == 0L ? 1L : 0L;
        return v[6] != 0 ? 8 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        switch ((int) v[1]) {
            case 2:
                return 2;
            case 1:
                return 4;
            case 7:
                return 4;
            case 3:
                return 5;
            default:
                return 8;
        }
    }

    private static int b2(Heap m, long[] v, int previous) {
        m.store(v[4], 30L, 4);
        v[7] = (v[4] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[8] = F0244_ReadBinaryData.run(m, v[0], v[2], v[3], v[7]);
        v[9] = Heap.s(v[8], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 8 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[10] = m.load(v[7], 4);
        v[11] = (v[10] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        m.store(v[11], 0L, 1);
        return 8;
    }

    private static int b4(Heap m, long[] v, int previous) {
        m.store(v[4], 16401L, 4);
        v[12] = (v[4] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[13] = F0244_ReadBinaryData.run(m, v[0], v[2], v[3], v[12]);
        return 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        switch ((int) v[2]) {
            case 1:
                return 6;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    private static int b6(Heap m, long[] v, int previous) {
        m.store(v[4], 18L, 4);
        v[14] = (v[3]) & 65535L;
        v[15] = (v[4] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        m.store(v[15], v[14], 2);
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        m.store(v[4], 19L, 4);
        v[16] = (v[4] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        m.store(v[16], v[3], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi17 = (previous == 0 ? 0L : (previous == 6 ? 0L : (previous == 7 ? 0L : (previous == 3 ? v[8] : (previous == 2 ? v[8] : (previous == 4 ? v[13] : (previous == 5 ? 4294967294L : 4294967294L)))))));
        v[17] = phi17;
        v[18] = v[17];
        return -1;
    }
}
