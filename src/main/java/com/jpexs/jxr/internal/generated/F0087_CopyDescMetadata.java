package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: CopyDescMetadata.
 */
public final class F0087_CopyDescMetadata {

    private F0087_CopyDescMetadata() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[31];
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
                    default:
                        throw new IllegalStateException("Invalid block in CopyDescMetadata");
                }
                previous = old;
                if (pc < 0) {
                    return v[30];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = m.load(v[1], 4);
        m.store(v[0], v[2], 4);
        switch ((int) v[2]) {
            case 30:
                return 1;
            case 31:
                return 3;
            case 18:
                return 5;
            case 19:
                return 6;
            case 0:
                return 7;
            default:
                return 8;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        m.store(v[0], 30L, 4);
        v[3] = (v[1] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = LibC.call(m, "strlen", new long[]{v[4]});
        v[6] = ((v[5] + 1L)) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[8] = F0030_PKAlloc.run(m, v[7], v[6]);
        v[9] = Heap.s(v[8], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 8 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = m.load(v[7], 4);
        v[11] = LibC.call(m, "memcpy", new long[]{v[10], v[4], v[6]});
        return 8;
    }

    private static int b3(Heap m, long[] v, int previous) {
        m.store(v[0], 31L, 4);
        v[12] = (v[1] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[13] = m.load(v[12], 4);
        v[14] = LibC.call(m, "wcslen", new long[]{v[13]});
        v[15] = ((v[14] << 1L)) & 4294967295L;
        v[16] = ((v[15] + 2L)) & 4294967295L;
        v[17] = (v[0] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[18] = F0030_PKAlloc.run(m, v[17], v[16]);
        v[19] = Heap.s(v[18], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[19] != 0 ? 8 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[20] = m.load(v[17], 4);
        v[21] = LibC.call(m, "memcpy", new long[]{v[20], v[13], v[16]});
        return 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[22] = (v[1] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[23] = m.load(v[22], 2);
        v[24] = (v[0] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        m.store(v[24], v[23], 2);
        return 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[25] = (v[1] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = (v[0] + (Heap.s(0L, 32) * 8L) + 4L) & 4294967295L;
        m.store(v[27], v[26], 4);
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[28] = LibC.call(m, "memset", new long[]{v[0], 0L, 8L});
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi29 = (previous == 7 ? 0L : (previous == 6 ? 0L : (previous == 5 ? 0L : (previous == 4 ? v[18] : (previous == 2 ? v[8] : (previous == 1 ? v[8] : (previous == 3 ? v[18] : 4294967294L)))))));
        v[29] = phi29;
        v[30] = v[29];
        return -1;
    }
}
