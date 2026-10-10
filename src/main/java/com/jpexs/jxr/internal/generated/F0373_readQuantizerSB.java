package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readQuantizerSB.
 */
public final class F0373_readQuantizerSB {

    private F0373_readQuantizerSB() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[22];
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
                        throw new IllegalStateException("Invalid block in readQuantizerSB");
                }
                previous = old;
                if (pc < 0) {
                    return v[21];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = v[2] > 15L ? 1L : 0L;
        return v[3] != 0 ? 6 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = v[2] > 1L ? 1L : 0L;
        return v[4] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[5] = F0336_getBit32_SB.run(m, v[1], 8L);
        v[6] = (v[5]) & 255L;
        m.store(v[0], v[6], 1);
        return 6;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[7] = F0336_getBit32_SB.run(m, v[1], 2L);
        v[8] = (v[7]) & 255L;
        v[9] = F0336_getBit32_SB.run(m, v[1], 8L);
        v[10] = (v[9]) & 255L;
        m.store(v[0], v[10], 1);
        switch ((int) v[8]) {
            case 1:
                return 4;
            case 0:
                return 6;
            default:
                return 5;
        }
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[11] = F0336_getBit32_SB.run(m, v[1], 8L);
        v[12] = (v[11]) & 255L;
        v[13] = (v[0] + (Heap.s(1L, 32) * 1L)) & 4294967295L;
        m.store(v[13], v[12], 1);
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi14 = (previous == 5 ? v[18] : 1L);
        v[14] = phi14;
        v[15] = F0336_getBit32_SB.run(m, v[1], 8L);
        v[16] = (v[15]) & 255L;
        v[17] = (v[0] + (Heap.s(v[14], 32) * 1L)) & 4294967295L;
        m.store(v[17], v[16], 1);
        v[18] = ((v[14] + 1L)) & 4294967295L;
        v[19] = v[18] == v[2] ? 1L : 0L;
        return v[19] != 0 ? 6 : 5;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi20 = (previous == 0 ? 0L : (previous == 3 ? v[8] : (previous == 4 ? 1L : (previous == 2 ? 0L : v[8]))));
        v[20] = phi20;
        v[21] = v[20];
        return -1;
    }
}
