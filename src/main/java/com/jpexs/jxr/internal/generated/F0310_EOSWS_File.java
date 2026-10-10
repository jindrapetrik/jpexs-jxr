package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: EOSWS_File.
 */
public final class F0310_EOSWS_File {

    private F0310_EOSWS_File() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[4];
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
                    default:
                        throw new IllegalStateException("Invalid block in EOSWS_File");
                }
                previous = old;
                if (pc < 0) {
                    return v[3];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.load(v[0], 4);
        v[2] = LibC.call(m, "feof", new long[]{v[1]});
        v[3] = v[2];
        return -1;
    }
}
