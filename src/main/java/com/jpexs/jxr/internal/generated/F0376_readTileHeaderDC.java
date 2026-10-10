package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readTileHeaderDC.
 */
public final class F0376_readTileHeaderDC {

    private F0376_readTileHeaderDC() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[35];
        v[0] = a0;
        v[1] = a1;
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
                        throw new IllegalStateException("Invalid block in readTileHeaderDC");
                }
                previous = old;
                if (pc < 0) {
                    return v[34];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 60L) & 4294967295L;
        v[3] = m.load(v[2], 4);
        v[4] = ((v[3] & 1L)) & 4294967295L;
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 6 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34292L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[7] + (Heap.s(v[9], 32) * 240L)) & 4294967295L;
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((0L - v[9])) & 4294967295L;
        v[14] = v[12] == v[13] ? 1L : 0L;
        return v[14] != 0 ? 2 : 5;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 56L) & 4294967295L;
        v[16] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        return 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[17] = ((v[20] + 1L)) & 4294967295L;
        v[18] = m.load(v[15], 4);
        v[19] = v[17] > v[18] ? 1L : 0L;
        return v[19] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi20 = (previous == 2 ? 0L : v[17]);
        v[20] = phi20;
        v[21] = m.load(v[6], 4);
        v[22] = (v[21] + (Heap.s(v[20], 32) * 240L)) & 4294967295L;
        v[23] = m.load(v[16], 4);
        v[24] = F0347_allocateQuantizer.run(m, v[22], v[23], 1L);
        v[25] = v[24] == 0L ? 1L : 0L;
        return v[25] != 0 ? 3 : 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[26] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 36L) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = F0374_readQuantizer.run(m, v[10], v[1], v[27], 0L);
        v[29] = (v[7] + (Heap.s(v[9], 32) * 240L) + 204L) & 4294967295L;
        m.store(v[29], v[28], 1);
        v[30] = m.load(v[26], 4);
        v[31] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34120L + 20L) & 4294967295L;
        v[32] = m.load(v[31], 4);
        F0348_formatQuantizer.run(m, v[10], v[28], v[30], 0L, 1L, v[32]);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi33 = (previous == 5 ? 0L : (previous == 0 ? 0L : 4294967295L));
        v[33] = phi33;
        v[34] = v[33];
        return -1;
    }
}
