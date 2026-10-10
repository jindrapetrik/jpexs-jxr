package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKCodecFactory_CreateCodec.
 */
public final class F0047_PKCodecFactory_CreateCodec {

    private F0047_PKCodecFactory_CreateCodec() {
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
                    case 3:
                        pc = b3(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKCodecFactory_CreateCodec");
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
        switch ((int) v[2]) {
            case 101:
                return 1;
            case 201:
                return 2;
            default:
                return 3;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[3] = F0120_PKImageEncode_Create_WMP.run(m, v[1]);
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[4] = F0138_PKImageDecode_Create_WMP.run(m, v[1]);
        return 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi5 = (previous == 1 ? v[3] : (previous == 2 ? v[4] : 4294967190L));
        v[5] = phi5;
        v[6] = v[5];
        return -1;
    }
}
