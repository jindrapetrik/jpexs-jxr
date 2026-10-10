package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: port_error.
 */
public final class F0006_port_error {

    private F0006_port_error() {
    }

    public static long run(Heap m) {
        long[] v = new long[2];
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
                        throw new IllegalStateException("Invalid block in port_error");
                }
                previous = old;
                if (pc < 0) {
                    return v[1];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[0] = m.load(3584L, 4);
        v[1] = v[0];
        return -1;
    }
}
