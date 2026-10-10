package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ReadWS_File.
 */
public final class F0311_ReadWS_File {

    private F0311_ReadWS_File() {
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
                    default:
                        throw new IllegalStateException("Invalid block in ReadWS_File");
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
        v[4] = LibC.call(m, "fread", new long[]{v[1], v[2], 1L, v[3]});
        v[5] = v[4] == 1L ? 1L : 0L;
        v[6] = v[5] != 0 ? 0L : 4294967194L;
        v[7] = v[6];
        return -1;
    }
}
