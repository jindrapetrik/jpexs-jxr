package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: WriteWS_File.
 */
public final class F0312_WriteWS_File {

    private F0312_WriteWS_File() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[10];
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
                        throw new IllegalStateException("Invalid block in WriteWS_File");
                }
                previous = old;
                if (pc < 0) {
                    return v[9];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = m.load(v[0], 4);
        v[5] = LibC.call(m, "fwrite", new long[]{v[1], v[2], 1L, v[4]});
        v[6] = v[5] == 1L ? 1L : 0L;
        v[7] = v[6] != 0 ? 0L : 4294967194L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi8 = (previous == 0 ? 0L : v[7]);
        v[8] = phi8;
        v[9] = v[8];
        return -1;
    }
}
