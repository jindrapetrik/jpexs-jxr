package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: CloseWS_File.
 */
public final class F0309_CloseWS_File {

    private F0309_CloseWS_File() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[7];
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
                        throw new IllegalStateException("Invalid block in CloseWS_File");
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
        v[1] = m.load(v[0], 4);
        v[2] = m.load(v[1], 4);
        v[3] = LibC.call(m, "fclose", new long[]{v[2]});
        v[4] = m.load(v[0], 4);
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        LibC.call(m, "free", new long[]{v[4]});
        m.store(v[0], 0L, 4);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[6] = 0L;
        return -1;
    }
}
