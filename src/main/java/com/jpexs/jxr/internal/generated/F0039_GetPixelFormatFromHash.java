package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetPixelFormatFromHash.
 */
public final class F0039_GetPixelFormatFromHash {

    private F0039_GetPixelFormatFromHash() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[29];
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
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    case 5:
                        pc = b5(m, v, previous);
                        break;
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in GetPixelFormatFromHash");
                }
                previous = old;
                if (pc < 0) {
                    return v[28];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        return 5;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[1] = ((v[21] | 1L)) & 4294967295L;
        v[2] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[1], 32) * 40L)) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = (v[3] + (Heap.s(0L, 32) * 16L) + 8L + (Heap.s(7L, 32) * 1L)) & 4294967295L;
        v[5] = m.load(v[4], 1);
        v[6] = v[5] == v[0] ? 1L : 0L;
        return v[6] != 0 ? 6 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[7] = ((v[21] | 2L)) & 4294967295L;
        v[8] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[7], 32) * 40L)) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[9] + (Heap.s(0L, 32) * 16L) + 8L + (Heap.s(7L, 32) * 1L)) & 4294967295L;
        v[11] = m.load(v[10], 1);
        v[12] = v[11] == v[0] ? 1L : 0L;
        return v[12] != 0 ? 6 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[13] = ((v[21] | 3L)) & 4294967295L;
        v[14] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[13], 32) * 40L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[15] + (Heap.s(0L, 32) * 16L) + 8L + (Heap.s(7L, 32) * 1L)) & 4294967295L;
        v[17] = m.load(v[16], 1);
        v[18] = v[17] == v[0] ? 1L : 0L;
        return v[18] != 0 ? 6 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[19] = ((v[21] + 4L)) & 4294967295L;
        v[20] = v[19] == 68L ? 1L : 0L;
        return v[20] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi21 = (previous == 0 ? 0L : v[19]);
        v[21] = phi21;
        v[22] = (5168L + (Heap.s(0L, 32) * 2720L) + (Heap.s(v[21], 32) * 40L)) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = (v[23] + (Heap.s(0L, 32) * 16L) + 8L + (Heap.s(7L, 32) * 1L)) & 4294967295L;
        v[25] = m.load(v[24], 1);
        v[26] = v[25] == v[0] ? 1L : 0L;
        return v[26] != 0 ? 6 : 1;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi27 = (previous == 5 ? v[23] : (previous == 1 ? v[3] : (previous == 2 ? v[9] : (previous == 3 ? v[15] : 0L))));
        v[27] = phi27;
        v[28] = v[27];
        return -1;
    }
}
