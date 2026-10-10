package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: _byteswap_ulong.
 */
public final class F0340__byteswap_ulong {

    private F0340__byteswap_ulong() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[3];
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
                        throw new IllegalStateException("Invalid block in _byteswap_ulong");
                }
                previous = old;
                if (pc < 0) {
                    return v[2];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = LibC.call(m, "llvm.bswap.i32", new long[]{v[0]});
        v[2] = v[1];
        return -1;
    }
}
