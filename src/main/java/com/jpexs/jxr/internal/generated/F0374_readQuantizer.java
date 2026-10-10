package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readQuantizer.
 */
public final class F0374_readQuantizer {

    private F0374_readQuantizer() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[30];
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
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in readQuantizer");
                }
                previous = old;
                if (pc < 0) {
                    return v[29];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = v[2] > 1L ? 1L : 0L;
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = F0299_getBit16.run(m, v[1], 8L);
        return 5;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[6] = F0299_getBit16.run(m, v[1], 2L);
        v[7] = (v[6]) & 255L;
        v[8] = F0299_getBit16.run(m, v[1], 8L);
        v[9] = (v[8]) & 255L;
        v[10] = m.load(v[0], 4);
        v[11] = (v[10] + (Heap.s(v[3], 32) * 20L)) & 4294967295L;
        m.store(v[11], v[9], 1);
        switch ((int) v[7]) {
            case 1:
                return 3;
            case 0:
                return 6;
            default:
                return 4;
        }
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[12] = F0299_getBit16.run(m, v[1], 8L);
        v[13] = (v[0] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        return 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi14 = (previous == 4 ? v[20] : 1L);
        v[14] = phi14;
        v[15] = F0299_getBit16.run(m, v[1], 8L);
        v[16] = (v[15]) & 255L;
        v[17] = (v[0] + (Heap.s(v[14], 32) * 4L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[18] + (Heap.s(v[3], 32) * 20L)) & 4294967295L;
        m.store(v[19], v[16], 1);
        v[20] = ((v[14] + 1L)) & 4294967295L;
        v[21] = v[20] == v[2] ? 1L : 0L;
        return v[21] != 0 ? 6 : 4;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi22 = (previous == 1 ? v[0] : v[13]);
        long phi23 = (previous == 1 ? v[5] : v[12]);
        long phi24 = (previous == 1 ? 0L : 1L);
        v[22] = phi22;
        v[23] = phi23;
        v[24] = phi24;
        v[25] = (v[23]) & 255L;
        v[26] = m.load(v[22], 4);
        v[27] = (v[26] + (Heap.s(v[3], 32) * 20L)) & 4294967295L;
        m.store(v[27], v[25], 1);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi28 = (previous == 2 ? v[7] : (previous == 5 ? v[24] : v[7]));
        v[28] = phi28;
        v[29] = v[28];
        return -1;
    }
}
