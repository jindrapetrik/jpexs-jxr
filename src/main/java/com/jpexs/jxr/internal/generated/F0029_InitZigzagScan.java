package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: InitZigzagScan.
 */
public final class F0029_InitZigzagScan {

    private F0029_InitZigzagScan() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[19];
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
                    default:
                        throw new IllegalStateException("Invalid block in InitZigzagScan");
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
        v[1] = v[0] == 0L ? 1L : 0L;
        return v[1] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        long phi2 = (previous == 1 ? v[16] : 0L);
        v[2] = phi2;
        v[3] = (3840L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[2], 32) * 4L)) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 592L) + 108L + (Heap.s(v[2], 32) * 8L) + 4L) & 4294967295L;
        m.store(v[5], v[4], 4);
        v[6] = (3904L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[2], 32) * 4L)) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = (14064L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[7], 32) * 4L)) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 592L) + 236L + (Heap.s(v[2], 32) * 8L) + 4L) & 4294967295L;
        m.store(v[10], v[9], 4);
        v[11] = (3968L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[2], 32) * 4L)) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = (14064L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[12], 32) * 4L)) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = (v[0] + (Heap.s(0L, 32) * 592L) + 364L + (Heap.s(v[2], 32) * 8L) + 4L) & 4294967295L;
        m.store(v[15], v[14], 4);
        v[16] = ((v[2] + 1L)) & 4294967295L;
        v[17] = v[16] == 16L ? 1L : 0L;
        return v[17] != 0 ? 2 : 1;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return -1;
    }
}
