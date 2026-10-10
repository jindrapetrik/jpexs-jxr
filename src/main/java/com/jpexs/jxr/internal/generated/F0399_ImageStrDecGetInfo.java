package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ImageStrDecGetInfo.
 */
public final class F0399_ImageStrDecGetInfo {

    private F0399_ImageStrDecGetInfo() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[20];
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
                    default:
                        throw new IllegalStateException("Invalid block in ImageStrDecGetInfo");
                }
                previous = old;
                if (pc < 0) {
                    return v[19];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.stack(4L * 1L, 4);
        v[3] = m.stack(112L * 1L, 4);
        v[4] = (v[1] + (Heap.s(0L, 32) * 32860L) + 48L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[5] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Dispatch.call(m, v[7], new long[]{v[5], v[2]});
        v[9] = Heap.s(v[8], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 3 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = F0398_ReadWMIHeader.run(m, v[0], v[1], v[3]);
        v[11] = Heap.s(v[10], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[11] != 0 ? 3 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = m.load(v[4], 4);
        v[13] = (v[12] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = m.load(v[2], 4);
        v[16] = Dispatch.call(m, v[14], new long[]{v[12], v[15]});
        v[17] = Heap.s(v[16], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[17] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi18 = (previous == 3 ? 4294967295L : 0L);
        v[18] = phi18;
        v[19] = v[18];
        return -1;
    }
}
