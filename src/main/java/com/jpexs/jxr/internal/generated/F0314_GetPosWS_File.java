package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: GetPosWS_File.
 */
public final class F0314_GetPosWS_File {

    private F0314_GetPosWS_File() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[7];
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
                    default:
                        throw new IllegalStateException("Invalid block in GetPosWS_File");
                }
                previous = old;
                if (pc < 0) {
                    return v[6];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.load(v[0], 4);
        v[3] = LibC.call(m, "ftell", new long[]{v[2]});
        v[4] = v[3] == 4294967295L ? 1L : 0L;
        return v[4] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[1], v[3], 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi5 = (previous == 1 ? 0L : 4294967194L);
        v[5] = phi5;
        v[6] = v[5];
        return -1;
    }
}
