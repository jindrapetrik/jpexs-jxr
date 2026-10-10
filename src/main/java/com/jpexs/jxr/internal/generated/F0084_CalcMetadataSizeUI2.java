package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: CalcMetadataSizeUI2.
 */
public final class F0084_CalcMetadataSizeUI2 {

    private F0084_CalcMetadataSizeUI2() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[8];
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
                    default:
                        throw new IllegalStateException("Invalid block in CalcMetadataSizeUI2");
                }
                previous = old;
                if (pc < 0) {
                    return v[7];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.load(v[0], 4);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = m.load(v[1], 2);
        v[6] = ((v[5] + 1L)) & 65535L;
        m.store(v[1], v[6], 2);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return -1;
    }
}
