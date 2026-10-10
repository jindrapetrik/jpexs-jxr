package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_EncodeAlpha_Encode.
 */
public final class F0100_PKImageEncode_EncodeAlpha_Encode {

    private F0100_PKImageEncode_EncodeAlpha_Encode() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[25];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_EncodeAlpha_Encode");
                }
                previous = old;
                if (pc < 0) {
                    return v[24];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = m.stack(24L * 1L, 4);
        v[5] = v[1] == 0L ? 1L : 0L;
        return v[5] != 0 ? 4 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[6] = (v[4] + (Heap.s(0L, 32) * 24L) + 4L) & 4294967295L;
        v[7] = (v[4] + (Heap.s(0L, 32) * 24L) + 8L) & 4294967295L;
        v[8] = (v[0] + (Heap.s(0L, 32) * 66276L) + 284L + 65956L) & 4294967295L;
        v[9] = (v[4] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        return 3;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = ((v[12] + 16L)) & 4294967295L;
        v[11] = v[10] < v[1] ? 1L : 0L;
        return v[11] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi12 = (previous == 1 ? 0L : v[10]);
        v[12] = phi12;
        LibC.call(m, "llvm.memset.p0.i32", new long[]{v[9], 0L, 12L, 0L});
        v[13] = ((v[12] * v[3])) & 4294967295L;
        v[14] = (v[2] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        m.store(v[4], v[14], 4);
        v[15] = ((v[1] - v[12])) & 4294967295L;
        v[16] = LibC.call(m, "llvm.umin.i32", new long[]{v[15], 16L});
        m.store(v[6], v[16], 4);
        m.store(v[7], v[3], 4);
        v[17] = m.load(v[8], 4);
        v[18] = F0432_ImageStrEncEncode.run(m, v[17], v[4]);
        v[19] = v[18] == 0L ? 1L : 0L;
        return v[19] != 0 ? 2 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[20] = (v[0] + (Heap.s(0L, 32) * 66276L) + 92L) & 4294967295L;
        v[21] = m.load(v[20], 4);
        v[22] = ((v[21] + v[1])) & 4294967295L;
        m.store(v[20], v[22], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi23 = (previous == 4 ? 0L : 4294967295L);
        v[23] = phi23;
        v[24] = v[23];
        return -1;
    }
}
