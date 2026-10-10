package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: RGB96Float_RGB48Half.
 */
public final class F0180_RGB96Float_RGB48Half {

    private F0180_RGB96Float_RGB48Half() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[45];
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
                    default:
                        throw new IllegalStateException("Invalid block in RGB96Float_RGB48Half");
                }
                previous = old;
                if (pc < 0) {
                    return v[44];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[6] != 0 ? 1 : 12;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = ((v[8] * 3L)) & 4294967295L;
        v[10] = Heap.s(v[8], 32) > Heap.s(0L, 32) ? 1L : 0L;
        v[11] = LibC.call(m, "llvm.smax.i32", new long[]{v[9], 1L});
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi12 = (previous == 1 ? 0L : v[42]);
        v[12] = phi12;
        v[13] = ((v[12] * v[3])) & 4294967295L;
        v[14] = (v[2] + (Heap.s(v[13], 32) * 1L)) & 4294967295L;
        return v[10] != 0 ? 3 : 11;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi15 = (previous == 10 ? v[40] : 0L);
        v[15] = phi15;
        v[16] = (v[14] + (Heap.s(v[15], 32) * 4L)) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = (v[17]) & 4294967295L;
        v[19] = Heap.fcmp("uno", Heap.f(v[17]), Heap.f(0L));
        return v[19] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[20] = (v[18]) & 65535L;
        v[21] = ((v[20] | 32767L)) & 65535L;
        return 10;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[22] = Heap.fcmp("olt", Heap.f(v[17]), Heap.f(3347046400L));
        return v[22] != 0 ? 10 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[23] = Heap.fcmp("ogt", Heap.f(v[17]), Heap.f(1199562752L));
        return v[23] != 0 ? 10 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[24] = Heap.fcmp("ogt", Heap.f(v[17]), Heap.f(3095396352L));
        v[25] = Heap.fcmp("olt", Heap.f(v[17]), Heap.f(947912704L));
        v[26] = ((v[24] & v[25])) & 1L;
        v[27] = ((v[18] >>> 16L)) & 4294967295L;
        return v[26] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[28] = (v[27]) & 65535L;
        v[29] = ((v[28] & 32768L)) & 65535L;
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[30] = ((v[27] & 32768L)) & 4294967295L;
        v[31] = ((v[18] >>> 13L)) & 4294967295L;
        v[32] = ((v[31] & 64512L)) & 4294967295L;
        v[33] = ((v[32] + 16384L)) & 4294967295L;
        v[34] = ((v[31] & 1023L)) & 4294967295L;
        v[35] = ((v[34] | v[30])) & 4294967295L;
        v[36] = ((v[35] | v[33])) & 4294967295L;
        v[37] = (v[36]) & 65535L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi38 = (previous == 4 ? v[21] : (previous == 8 ? v[29] : (previous == 9 ? v[37] : (previous == 5 ? 64511L : 31743L))));
        v[38] = phi38;
        v[39] = (v[14] + (Heap.s(v[15], 32) * 2L)) & 4294967295L;
        m.store(v[39], v[38], 2);
        v[40] = ((v[15] + 1L)) & 4294967295L;
        v[41] = v[40] == v[11] ? 1L : 0L;
        return v[41] != 0 ? 11 : 3;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[42] = ((v[12] + 1L)) & 4294967295L;
        v[43] = v[42] == v[5] ? 1L : 0L;
        return v[43] != 0 ? 12 : 2;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[44] = 0L;
        return -1;
    }
}
