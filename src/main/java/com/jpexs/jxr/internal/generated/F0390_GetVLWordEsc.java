package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetVLWordEsc.
 */
public final class F0390_GetVLWordEsc {

    private F0390_GetVLWordEsc() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[18];
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
                    case 7:
                        pc = b7(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in GetVLWordEsc");
                }
                previous = old;
                if (pc < 0) {
                    return v[17];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = F0357_getBit32.run(m, v[0], 8L);
        v[2] = ((v[1] + 4294967043L)) & 4294967295L;
        v[3] = v[2] < 3L ? 1L : 0L;
        return v[3] != 0 ? 7 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = v[1] < 251L ? 1L : 0L;
        return v[4] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[5] = ((v[1] << 8L)) & 4294967295L;
        v[6] = F0357_getBit32.run(m, v[0], 8L);
        return 6;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[7] = v[1] == 251L ? 1L : 0L;
        return v[7] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[8] = F0357_getBit32.run(m, v[0], 16L);
        v[9] = F0357_getBit32.run(m, v[0], 16L);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[10] = F0357_getBit32.run(m, v[0], 16L);
        v[11] = ((v[10] << 16L)) & 4294967295L;
        v[12] = F0357_getBit32.run(m, v[0], 16L);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi13 = (previous == 2 ? v[5] : v[12]);
        long phi14 = (previous == 2 ? v[6] : v[11]);
        v[13] = phi13;
        v[14] = phi14;
        v[15] = ((v[14] | v[13])) & 4294967295L;
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi16 = (previous == 0 ? 0L : v[15]);
        v[16] = phi16;
        v[17] = v[16];
        return -1;
    }
}
