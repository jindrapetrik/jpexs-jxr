package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_SetDescriptiveMetadata.
 */
public final class F0059_PKImageEncode_SetDescriptiveMetadata {

    private F0059_PKImageEncode_SetDescriptiveMetadata() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[3];
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
                        throw new IllegalStateException("Invalid block in PKImageEncode_SetDescriptiveMetadata");
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
        v[2] = 4294967294L;
        return -1;
    }
}
