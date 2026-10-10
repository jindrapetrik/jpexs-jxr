package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: predCBPC422Dec.
 */
public final class F0479_predCBPC422Dec {

    private F0479_predCBPC422Dec() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[78];
        v[0] = a0;
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
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
                    case 14:
                        pc = b14(m, v, previous);
                        break;
                    case 15:
                        pc = b15(m, v, previous);
                        break;
                    case 16:
                        pc = b16(m, v, previous);
                        break;
                    case 17:
                        pc = b17(m, v, previous);
                        break;
                    case 18:
                        pc = b18(m, v, previous);
                        break;
                    case 19:
                        pc = b19(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in predCBPC422Dec");
                }
                previous = old;
                if (pc < 0) {
                    return v[77];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = (v[4] + (Heap.s(0L, 32) * 24L) + 16L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[6] = m.load(v[5], 4);
        switch ((int) v[6]) {
            case 0:
                return 1;
            case 2:
                return 7;
            default:
                return 8;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34276L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = v[8] == 0L ? 1L : 0L;
        return v[9] != 0 ? 5 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[10] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34280L) & 4294967295L;
        v[11] = m.load(v[10], 4);
        v[12] = v[11] == 0L ? 1L : 0L;
        return v[12] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[13] = ((v[1] ^ 1L)) & 4294967295L;
        return 6;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34852L + (Heap.s(v[3], 32) * 4L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[15] + (Heap.s(v[2], 32) * 40L) + 4L) & 4294967295L;
        v[17] = m.load(v[16], 4);
        v[18] = ((v[17] >>> 6L)) & 4294967295L;
        v[19] = ((v[18] & 1L)) & 4294967295L;
        v[20] = ((v[19] ^ v[1])) & 4294967295L;
        return 6;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[21] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34788L + (Heap.s(v[3], 32) * 4L)) & 4294967295L;
        v[22] = m.load(v[21], 4);
        v[23] = (v[22] + (Heap.s(v[2], 32) * 40L)) & 4294967295L;
        v[24] = (v[23] + (Heap.s(4294967295L, 32) * 40L) + 4L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = ((v[25] >>> 1L)) & 4294967295L;
        v[27] = ((v[26] & 1L)) & 4294967295L;
        v[28] = ((v[27] ^ v[1])) & 4294967295L;
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi29 = (previous == 3 ? v[13] : (previous == 4 ? v[20] : v[28]));
        v[29] = phi29;
        v[30] = ((v[29] << 1L)) & 4294967295L;
        v[31] = ((v[30] & 2L)) & 4294967295L;
        v[32] = ((v[31] ^ v[29])) & 4294967295L;
        v[33] = ((v[32] << 2L)) & 4294967295L;
        v[34] = ((v[33] & 12L)) & 4294967295L;
        v[35] = ((v[34] ^ v[32])) & 4294967295L;
        v[36] = ((v[35] << 2L)) & 4294967295L;
        v[37] = ((v[36] & 48L)) & 4294967295L;
        v[38] = ((v[37] ^ v[35])) & 4294967295L;
        v[39] = ((v[38] << 2L)) & 4294967295L;
        v[40] = ((v[39] & 192L)) & 4294967295L;
        v[41] = ((v[40] ^ v[38])) & 4294967295L;
        return 8;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[42] = ((v[1] ^ 255L)) & 4294967295L;
        return 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi43 = (previous == 6 ? v[41] : (previous == 7 ? v[42] : v[1]));
        v[43] = phi43;
        v[44] = ((v[43] & 65535L)) & 4294967295L;
        v[45] = v[44] == 0L ? 1L : 0L;
        return v[45] != 0 ? 11 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi46 = (previous == 9 ? v[51] : 0L);
        long phi47 = (previous == 9 ? v[52] : v[44]);
        v[46] = phi46;
        v[47] = phi47;
        v[48] = ((v[47] & 15L)) & 4294967295L;
        v[49] = (13888L + (Heap.s(0L, 32) * 64L) + (Heap.s(v[48], 32) * 4L)) & 4294967295L;
        v[50] = m.load(v[49], 4);
        v[51] = ((v[50] + v[46])) & 4294967295L;
        v[52] = ((v[47] >>> 4L)) & 4294967295L;
        v[53] = v[47] < 16L ? 1L : 0L;
        return v[53] != 0 ? 10 : 9;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[54] = ((v[51] << 1L)) & 4294967295L;
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        long phi55 = (previous == 8 ? 0L : v[54]);
        v[55] = phi55;
        v[56] = ((v[55] + 4294967293L)) & 4294967295L;
        v[57] = (v[4] + (Heap.s(0L, 32) * 8L) + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[58] = m.load(v[57], 4);
        v[59] = ((v[56] + v[58])) & 4294967295L;
        v[60] = LibC.call(m, "llvm.smax.i32", new long[]{v[59], 4294967280L});
        v[61] = LibC.call(m, "llvm.smin.i32", new long[]{v[60], 15L});
        m.store(v[57], v[61], 4);
        v[62] = (v[4] + (Heap.s(0L, 32) * 24L) + 8L + (Heap.s(1L, 32) * 4L)) & 4294967295L;
        v[63] = m.load(v[62], 4);
        v[64] = ((v[63] - v[55])) & 4294967295L;
        v[65] = ((v[64] + 13L)) & 4294967295L;
        m.store(v[62], v[65], 4);
        v[66] = ((v[64] + 4294967293L)) & 4294967295L;
        v[67] = v[66] < 4294967264L ? 1L : 0L;
        return v[67] != 0 ? 12 : 14;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[68] = Heap.s(v[65], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[68] != 0 ? 13 : 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        m.store(v[62], 4294967280L, 4);
        return 14;
    }

    private static int b14(Heap m, long[] v, int previous) {
        long phi69 = (previous == 13 ? 4294967280L : v[65]);
        v[69] = phi69;
        v[70] = Heap.s(v[59], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[70] != 0 ? 16 : 17;
    }

    private static int b15(Heap m, long[] v, int previous) {
        m.store(v[62], 15L, 4);
        v[71] = Heap.s(v[59], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[71] != 0 ? 16 : 18;
    }

    private static int b16(Heap m, long[] v, int previous) {
        long phi72 = (previous == 15 ? 15L : v[69]);
        v[72] = phi72;
        v[73] = Heap.s(v[61], 32) < Heap.s(v[72], 32) ? 1L : 0L;
        v[74] = v[73] != 0 ? 1L : 2L;
        return 19;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[75] = Heap.s(v[69], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[75] != 0 ? 19 : 18;
    }

    private static int b18(Heap m, long[] v, int previous) {
        return 19;
    }

    private static int b19(Heap m, long[] v, int previous) {
        long phi76 = (previous == 18 ? 0L : (previous == 16 ? v[74] : 2L));
        v[76] = phi76;
        m.store(v[5], v[76], 4);
        v[77] = v[43];
        return -1;
    }
}
