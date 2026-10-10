package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: CalcMetadataSizeLPWSTR.
 */
public final class F0082_CalcMetadataSizeLPWSTR {

    private F0082_CalcMetadataSizeLPWSTR() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[18];
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
                        throw new IllegalStateException("Invalid block in CalcMetadataSizeLPWSTR");
                }
                previous = old;
                if (pc < 0) {
                    return v[17];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.load(v[0], 4);
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 5 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = LibC.call(m, "wcslen", new long[]{v[7]});
        v[9] = ((v[8] << 1L)) & 4294967295L;
        v[10] = ((v[9] + 2L)) & 4294967295L;
        v[11] = v[10] > 4L ? 1L : 0L;
        return v[11] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = m.load(v[2], 4);
        v[13] = ((v[12] + v[10])) & 4294967295L;
        m.store(v[2], v[13], 4);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[14] = v[3] == 0L ? 1L : 0L;
        return v[14] != 0 ? 6 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        m.store(v[3], v[10], 4);
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[15] = m.load(v[1], 2);
        v[16] = ((v[15] + 1L)) & 65535L;
        m.store(v[1], v[16], 2);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        return -1;
    }
}
