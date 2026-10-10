package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readPacketHeader.
 */
public final class F0375_readPacketHeader {

    private F0375_readPacketHeader() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[12];
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
                    case 3:
                        pc = b3(m, v, previous);
                        break;
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in readPacketHeader");
                }
                previous = old;
                if (pc < 0) {
                    return v[11];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = F0299_getBit16.run(m, v[0], 8L);
        v[4] = v[3] == 0L ? 1L : 0L;
        return v[4] != 0 ? 1 : 4;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[5] = F0299_getBit16.run(m, v[0], 8L);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 2 : 4;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[7] = F0299_getBit16.run(m, v[0], 8L);
        v[8] = v[7] == 1L ? 1L : 0L;
        return v[8] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[9] = F0299_getBit16.run(m, v[0], 8L);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi10 = (previous == 3 ? 0L : (previous == 2 ? 4294967295L : (previous == 1 ? 4294967295L : 4294967295L)));
        v[10] = phi10;
        v[11] = v[10];
        return -1;
    }
}
