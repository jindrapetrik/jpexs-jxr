package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: WriteDescMetadata.
 */
public final class F0089_WriteDescMetadata {

    private F0089_WriteDescMetadata() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[57];
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
                        throw new IllegalStateException("Invalid block in WriteDescMetadata");
                }
                previous = old;
                if (pc < 0) {
                    return v[56];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = m.stack(4L * 1L, 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        m.store(v[5], 0L, 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 0L + 80L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = v[9] == 0L ? 1L : 0L;
        return v[10] != 0 ? 8 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[11] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 0L + 84L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = v[12] == 0L ? 1L : 0L;
        return v[13] != 0 ? 8 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[14] = m.load(v[1], 4);
        switch ((int) v[14]) {
            case 0:
                return 7;
            case 30:
                return 3;
            case 31:
                return 4;
            case 18:
                return 5;
            case 19:
                return 6;
            default:
                return 8;
        }
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[15] = (v[1] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = LibC.call(m, "strlen", new long[]{v[16]});
        v[18] = ((v[17] + 1L)) & 4294967295L;
        v[19] = (v[2] + (Heap.s(0L, 32) * 12L) + 4L) & 4294967295L;
        m.store(v[19], v[18], 4);
        v[20] = m.load(v[8], 4);
        v[21] = m.load(v[3], 4);
        v[22] = ((v[21] + v[20])) & 4294967295L;
        v[23] = (v[2] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        m.store(v[23], v[22], 4);
        v[24] = F0246_WriteWmpDE.run(m, v[7], v[4], v[2], v[16], v[5]);
        v[25] = Heap.s(v[24], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[25] != 0 ? 8 : 7;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[26] = (v[1] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[27] = m.load(v[26], 4);
        v[28] = LibC.call(m, "wcslen", new long[]{v[27]});
        v[29] = ((v[28] << 1L)) & 4294967295L;
        v[30] = ((v[29] + 2L)) & 4294967295L;
        v[31] = (v[2] + (Heap.s(0L, 32) * 12L) + 4L) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = m.load(v[8], 4);
        v[33] = m.load(v[3], 4);
        v[34] = ((v[33] + v[32])) & 4294967295L;
        v[35] = (v[2] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        m.store(v[35], v[34], 4);
        v[36] = F0246_WriteWmpDE.run(m, v[7], v[4], v[2], v[27], v[5]);
        v[37] = Heap.s(v[36], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[37] != 0 ? 8 : 7;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[38] = (v[1] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[39] = (v[2] + (Heap.s(0L, 32) * 12L) + 4L) & 4294967295L;
        m.store(v[39], 1L, 4);
        v[40] = m.load(v[38], 2);
        v[41] = (v[40]) & 4294967295L;
        v[42] = (v[2] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        m.store(v[42], v[41], 4);
        v[43] = F0246_WriteWmpDE.run(m, v[7], v[4], v[2], 0L, 0L);
        v[44] = Heap.s(v[43], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[44] != 0 ? 8 : 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[45] = (v[1] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        v[46] = (v[2] + (Heap.s(0L, 32) * 12L) + 4L) & 4294967295L;
        m.store(v[46], 1L, 4);
        v[47] = m.load(v[45], 4);
        v[48] = (v[2] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        m.store(v[48], v[47], 4);
        v[49] = F0246_WriteWmpDE.run(m, v[7], v[4], v[2], 0L, 0L);
        v[50] = Heap.s(v[49], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[50] != 0 ? 8 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi51 = (previous == 2 ? v[14] : (previous == 3 ? v[24] : (previous == 4 ? v[36] : (previous == 5 ? v[43] : v[49]))));
        v[51] = phi51;
        v[52] = m.load(v[5], 4);
        v[53] = m.load(v[3], 4);
        v[54] = ((v[53] + v[52])) & 4294967295L;
        m.store(v[3], v[54], 4);
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi55 = (previous == 0 ? 0L : (previous == 1 ? 0L : (previous == 7 ? v[51] : (previous == 3 ? v[24] : (previous == 4 ? v[36] : (previous == 5 ? v[43] : (previous == 6 ? v[49] : 4294967294L)))))));
        v[55] = phi55;
        v[56] = v[55];
        return -1;
    }
}
