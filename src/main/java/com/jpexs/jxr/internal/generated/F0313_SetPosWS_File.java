package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: SetPosWS_File.
 */
public final class F0313_SetPosWS_File {

    private F0313_SetPosWS_File() {
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
                    default:
                        throw new IllegalStateException("Invalid block in SetPosWS_File");
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
        v[3] = LibC.call(m, "fseek", new long[]{v[2], v[1], 0L});
        v[4] = v[3] == 0L ? 1L : 0L;
        v[5] = v[4] != 0 ? 0L : 4294967194L;
        v[6] = v[5];
        return -1;
    }
}
