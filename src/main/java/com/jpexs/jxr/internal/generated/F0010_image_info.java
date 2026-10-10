package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: image_info.
 */
public final class F0010_image_info {

    private F0010_image_info() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[46];
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
                    case 11:
                        pc = b11(m, v, previous);
                        break;
                    case 12:
                        pc = b12(m, v, previous);
                        break;
                    case 13:
                        pc = b13(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in image_info");
                }
                previous = old;
                if (pc < 0) {
                    return v[45];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(40L * 1L, 4);
        v[4] = m.stack(16L * 1L, 4);
        v[5] = (v[0] + (Heap.s(0L, 32) * 66224L) + 8L) & 4294967295L;
        v[6] = m.load(v[5], 4);
        v[7] = (v[1] + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[8] = Dispatch.call(m, v[6], new long[]{v[0], v[1], v[7]});
        v[9] = Heap.s(v[8], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[9] != 0 ? 13 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[10] = m.load(v[1], 4);
        v[11] = Heap.s(v[10], 32) < Heap.s(1L, 32) ? 1L : 0L;
        return v[11] != 0 ? 13 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[12] = m.load(v[7], 4);
        v[13] = Heap.s(v[12], 32) < Heap.s(1L, 32) ? 1L : 0L;
        return v[13] != 0 ? 13 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[14] = Heap.db(Heap.s(v[10], 32));
        v[15] = Heap.db(Heap.s(v[12], 32));
        v[16] = Heap.db((Heap.d(v[14]) * Heap.d(v[15])));
        v[17] = Heap.fcmp("ogt", Heap.d(v[16]), Heap.d(4724276009111650304L));
        return v[17] != 0 ? 13 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[18] = (v[0] + (Heap.s(0L, 32) * 66224L) + 4L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        v[20] = Dispatch.call(m, v[19], new long[]{v[0], v[4]});
        v[21] = Heap.s(v[20], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[21] != 0 ? 13 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[22] = LibC.call(m, "memset", new long[]{v[3], 0L, 40L});
        m.store(v[3], v[4], 4);
        v[23] = F0037_PixelFormatLookup.run(m, v[3], 0L);
        v[24] = Heap.s(v[23], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[24] != 0 ? 13 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[25] = (v[3] + (Heap.s(0L, 32) * 40L) + 20L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = ((v[26] & 16L)) & 4294967295L;
        v[28] = v[27] == 0L ? 1L : 0L;
        return v[28] != 0 ? 7 : 9;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[29] = (v[3] + (Heap.s(0L, 32) * 40L) + 8L) & 4294967295L;
        v[30] = m.load(v[29], 4);
        v[31] = v[30] == 0L ? 1L : 0L;
        v[32] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        return v[31] != 0 ? 8 : 12;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[33] = (v[3] + (Heap.s(0L, 32) * 40L) + 16L) & 4294967295L;
        v[34] = m.load(v[33], 4);
        v[35] = v[34] == 1L ? 1L : 0L;
        v[36] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        return v[35] != 0 ? 11 : 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[37] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[37], 1L, 4);
        v[38] = (v[3] + (Heap.s(0L, 32) * 40L) + 16L) & 4294967295L;
        v[39] = m.load(v[38], 4);
        v[40] = (v[1] + (Heap.s(3L, 32) * 4L)) & 4294967295L;
        m.store(v[40], v[39], 4);
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[2], 8656L, 16L, 0L});
        return 13;
    }

    private static int b10(Heap m, long[] v, int previous) {
        m.store(v[36], 2L, 4);
        m.store(v[32], v[34], 4);
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[2], 9648L, 16L, 0L});
        return 13;
    }

    private static int b11(Heap m, long[] v, int previous) {
        m.store(v[36], 3L, 4);
        m.store(v[32], 1L, 4);
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[2], 10000L, 16L, 0L});
        return 13;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[41] = (v[1] + (Heap.s(2L, 32) * 4L)) & 4294967295L;
        m.store(v[41], 0L, 4);
        v[42] = (v[3] + (Heap.s(0L, 32) * 40L) + 16L) & 4294967295L;
        v[43] = m.load(v[42], 4);
        m.store(v[32], v[43], 4);
        LibC.call(m, "llvm.memcpy.p0.p0.i32", new long[]{v[2], 8560L, 16L, 0L});
        return 13;
    }

    private static int b13(Heap m, long[] v, int previous) {
        long phi44 = (previous == 9 ? v[23] : (previous == 10 ? v[23] : (previous == 11 ? v[23] : (previous == 12 ? v[23] : (previous == 0 ? v[8] : (previous == 3 ? 4294967190L : (previous == 4 ? v[20] : (previous == 5 ? v[23] : (previous == 1 ? 4294967190L : 4294967190L)))))))));
        v[44] = phi44;
        v[45] = v[44];
        return -1;
    }
}
