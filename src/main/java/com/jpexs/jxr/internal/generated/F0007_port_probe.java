package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: port_probe.
 */
public final class F0007_port_probe {

    private F0007_port_probe() {
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
                        throw new IllegalStateException("Invalid block in port_probe");
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
        v[3] = m.stack(4L * 1L, 4);
        v[4] = m.stack(4L * 1L, 4);
        v[5] = m.stack(16L * 1L, 4);
        m.store(v[3], 0L, 4);
        m.store(v[4], 0L, 4);
        v[6] = F0009_open_decoder.run(m, v[0], v[1], v[3], v[4]);
        v[7] = Heap.s(v[6], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[7] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = m.load(v[4], 4);
        v[9] = F0010_image_info.run(m, v[8], v[2], v[5]);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 0 ? v[6] : v[9]);
        v[10] = phi10;
        v[11] = m.load(v[4], 4);
        v[12] = v[11] == 0L ? 1L : 0L;
        return v[12] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[13] = (v[11] + (Heap.s(0L, 32) * 66224L) + 40L) & 4294967295L;
        v[14] = m.load(v[13], 4);
        v[15] = Dispatch.call(m, v[14], new long[]{v[4]});
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[16] = m.load(v[3], 4);
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 6 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[18] = (v[16] + (Heap.s(0L, 32) * 44L) + 20L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = Dispatch.call(m, v[19], new long[]{v[3]});
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        m.store(3584L, v[10], 4);
        v[21] = v[10];
        return -1;
    }
}
