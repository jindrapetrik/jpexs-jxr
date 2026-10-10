package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKCodecFactory_CreateDecoderFromFile.
 */
public final class F0048_PKCodecFactory_CreateDecoderFromFile {

    private F0048_PKCodecFactory_CreateDecoderFromFile() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[26];
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
                    case 4:
                        pc = b4(m, v, previous);
                        break;
                    case 5:
                        pc = b5(m, v, previous);
                        break;
                    case 6:
                        pc = b6(m, v, previous);
                        break;
                    case 7:
                        pc = b7(m, v, previous);
                        break;
                    case 8:
                        pc = b8(m, v, previous);
                        break;
                    case 9:
                        pc = b9(m, v, previous);
                        break;
                    case 10:
                        pc = b10(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in PKCodecFactory_CreateDecoderFromFile");
                }
                previous = old;
                if (pc < 0) {
                    return v[25];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.stack(4L * 1L, 4);
        v[3] = m.stack(4L * 1L, 4);
        m.store(v[3], 0L, 4);
        v[4] = LibC.call(m, "strrchr", new long[]{v[0], 46L});
        v[5] = v[4] == 0L ? 1L : 0L;
        return v[5] != 0 ? 10 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[2], 0L, 4);
        v[6] = F0041_GetIIDInfo.run(m, v[4], v[2]);
        v[7] = Heap.s(v[6], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[7] != 0 ? 2 : 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        return 10;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[8] = m.load(v[2], 4);
        v[9] = (v[8] + (Heap.s(0L, 32) * 12L) + 8L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = F0308_CreateWS_File.run(m, v[3], v[0], 7888L);
        v[12] = Heap.s(v[11], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[12] != 0 ? 10 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[13] = m.load(v[10], 4);
        switch ((int) v[13]) {
            case 101:
                return 5;
            case 201:
                return 6;
            default:
                return 10;
        }
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[14] = F0120_PKImageEncode_Create_WMP.run(m, v[1]);
        return 7;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[15] = F0138_PKImageDecode_Create_WMP.run(m, v[1]);
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi16 = (previous == 5 ? v[14] : v[15]);
        v[16] = phi16;
        v[17] = Heap.s(v[16], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[17] != 0 ? 10 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[18] = m.load(v[1], 4);
        v[19] = m.load(v[18], 4);
        v[20] = m.load(v[3], 4);
        v[21] = Dispatch.call(m, v[19], new long[]{v[18], v[20]});
        v[22] = Heap.s(v[21], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[22] != 0 ? 10 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[23] = (v[18] + (Heap.s(0L, 32) * 66224L) + 48L) & 4294967295L;
        m.store(v[23], 1L, 4);
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi24 = (previous == 9 ? v[21] : (previous == 0 ? 4294967190L : (previous == 3 ? v[11] : (previous == 7 ? v[16] : (previous == 8 ? v[21] : (previous == 2 ? v[6] : 4294967190L))))));
        v[24] = phi24;
        v[25] = v[24];
        return -1;
    }
}
