package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: WriteContainerPost.
 */
public final class F0092_WriteContainerPost {

    private F0092_WriteContainerPost() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[37];
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
                    default:
                        throw new IllegalStateException("Invalid block in WriteContainerPost");
                }
                previous = old;
                if (pc < 0) {
                    return v[36];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.stack(4L * 1L, 4);
        v[2] = m.stack(12L * 1L, 4);
        v[3] = m.stack(12L * 1L, 4);
        v[4] = m.stack(12L * 1L, 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 66276L) + 60L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        m.store(v[2], 4295277761L, 8);
        m.store(v[3], 4295277762L, 8);
        m.store(v[4], 4295277763L, 8);
        v[7] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65968L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[2] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        m.store(v[9], v[8], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 0L + 20L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        m.store(v[1], v[11], 4);
        v[12] = F0246_WriteWmpDE.run(m, v[6], v[1], v[2], 0L, 0L);
        v[13] = Heap.s(v[12], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[13] != 0 ? 5 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[14] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65960L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = v[15] == 0L ? 1L : 0L;
        return v[16] != 0 ? 5 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[17] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 160L + 36L) & 4294967295L;
        v[18] = m.load(v[17], 1);
        v[19] = v[18] == 2L ? 1L : 0L;
        return v[19] != 0 ? 3 : 5;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[20] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65972L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = (v[3] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        m.store(v[22], v[21], 4);
        v[23] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 0L + 24L) & 4294967295L;
        v[24] = m.load(v[23], 4);
        m.store(v[1], v[24], 4);
        v[25] = F0246_WriteWmpDE.run(m, v[6], v[1], v[3], 0L, 0L);
        v[26] = Heap.s(v[25], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[26] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[27] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65976L) & 4294967295L;
        v[28] = m.load(v[27], 4);
        v[29] = m.load(v[20], 4);
        v[30] = ((v[29] + v[28])) & 4294967295L;
        v[31] = (v[4] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        m.store(v[31], v[30], 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 0L + 28L) & 4294967295L;
        v[33] = m.load(v[32], 4);
        m.store(v[1], v[33], 4);
        v[34] = F0246_WriteWmpDE.run(m, v[6], v[1], v[4], 0L, 0L);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi35 = (previous == 2 ? v[12] : (previous == 1 ? v[12] : (previous == 0 ? v[12] : (previous == 3 ? v[25] : v[34]))));
        v[35] = phi35;
        v[36] = v[35];
        return -1;
    }
}
