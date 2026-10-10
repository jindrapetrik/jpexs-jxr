package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: FreeCodingContextEnc.
 */
public final class F0026_FreeCodingContextEnc {

    private F0026_FreeCodingContextEnc() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[59];
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
                    default:
                        throw new IllegalStateException("Invalid block in FreeCodingContextEnc");
                }
                previous = old;
                if (pc < 0) {
                    return v[58];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34312L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = Heap.s(v[2], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[3] != 0 ? 1 : 4;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34308L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 4 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi7 = (previous == 2 ? v[55] : 0L);
        v[7] = phi7;
        v[8] = m.load(v[4], 4);
        v[9] = (v[8] + (Heap.s(v[7], 32) * 592L) + 16L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        F0000_Clean.run(m, v[10]);
        v[11] = (v[8] + (Heap.s(v[7], 32) * 592L) + 20L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        F0000_Clean.run(m, v[12]);
        v[13] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(0L, 32) * 4L)) & 4294967295L;
        v[14] = m.load(v[13], 4);
        F0000_Clean.run(m, v[14]);
        v[15] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        F0000_Clean.run(m, v[16]);
        v[17] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        v[18] = m.load(v[17], 4);
        F0000_Clean.run(m, v[18]);
        v[19] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        v[20] = m.load(v[19], 4);
        F0000_Clean.run(m, v[20]);
        v[21] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(4L, 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        F0000_Clean.run(m, v[22]);
        v[23] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(5L, 32) * 4L)) & 4294967295L;
        v[24] = m.load(v[23], 4);
        F0000_Clean.run(m, v[24]);
        v[25] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(6L, 32) * 4L)) & 4294967295L;
        v[26] = m.load(v[25], 4);
        F0000_Clean.run(m, v[26]);
        v[27] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(7L, 32) * 4L)) & 4294967295L;
        v[28] = m.load(v[27], 4);
        F0000_Clean.run(m, v[28]);
        v[29] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(8L, 32) * 4L)) & 4294967295L;
        v[30] = m.load(v[29], 4);
        F0000_Clean.run(m, v[30]);
        v[31] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(9L, 32) * 4L)) & 4294967295L;
        v[32] = m.load(v[31], 4);
        F0000_Clean.run(m, v[32]);
        v[33] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(10L, 32) * 4L)) & 4294967295L;
        v[34] = m.load(v[33], 4);
        F0000_Clean.run(m, v[34]);
        v[35] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(11L, 32) * 4L)) & 4294967295L;
        v[36] = m.load(v[35], 4);
        F0000_Clean.run(m, v[36]);
        v[37] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(12L, 32) * 4L)) & 4294967295L;
        v[38] = m.load(v[37], 4);
        F0000_Clean.run(m, v[38]);
        v[39] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(13L, 32) * 4L)) & 4294967295L;
        v[40] = m.load(v[39], 4);
        F0000_Clean.run(m, v[40]);
        v[41] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(14L, 32) * 4L)) & 4294967295L;
        v[42] = m.load(v[41], 4);
        F0000_Clean.run(m, v[42]);
        v[43] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(15L, 32) * 4L)) & 4294967295L;
        v[44] = m.load(v[43], 4);
        F0000_Clean.run(m, v[44]);
        v[45] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(16L, 32) * 4L)) & 4294967295L;
        v[46] = m.load(v[45], 4);
        F0000_Clean.run(m, v[46]);
        v[47] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(17L, 32) * 4L)) & 4294967295L;
        v[48] = m.load(v[47], 4);
        F0000_Clean.run(m, v[48]);
        v[49] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(18L, 32) * 4L)) & 4294967295L;
        v[50] = m.load(v[49], 4);
        F0000_Clean.run(m, v[50]);
        v[51] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(19L, 32) * 4L)) & 4294967295L;
        v[52] = m.load(v[51], 4);
        F0000_Clean.run(m, v[52]);
        v[53] = (v[8] + (Heap.s(v[7], 32) * 592L) + 24L + (Heap.s(20L, 32) * 4L)) & 4294967295L;
        v[54] = m.load(v[53], 4);
        F0000_Clean.run(m, v[54]);
        v[55] = ((v[7] + 1L)) & 4294967295L;
        v[56] = v[55] == v[2] ? 1L : 0L;
        return v[56] != 0 ? 3 : 2;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[57] = m.load(v[4], 4);
        LibC.call(m, "free", new long[]{v[57]});
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        return -1;
    }
}
