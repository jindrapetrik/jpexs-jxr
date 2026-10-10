package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: FreeDescMetadata.
 */
public final class F0088_FreeDescMetadata {

    private F0088_FreeDescMetadata() {
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
                        throw new IllegalStateException("Invalid block in FreeDescMetadata");
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
        v[2] = ((v[1] & 4294967294L)) & 4294967295L;
        v[3] = v[2] == 30L ? 1L : 0L;
        return v[3] != 0 ? 1 : 2;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[5] = F0032_PKFree.run(m, v[4]);
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return -1;
    }
}
