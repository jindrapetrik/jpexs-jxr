package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: Gray32Float_Gray16Half.
 */
public final class F0182_Gray32Float_Gray16Half {

    private F0182_Gray32Float_Gray16Half() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3) {
        long[] v = new long[43];
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
                        throw new IllegalStateException("Invalid block in Gray32Float_Gray16Half");
                }
                previous = old;
                if (pc < 0) {
                    return v[42];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[4] = (v[1] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = (v[1] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        v[8] = Heap.s(v[5], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return v[8] != 0 ? 1 : 12;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[9] = Heap.s(v[7], 32) > Heap.s(0L, 32) ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi10 = (previous == 1 ? 0L : v[40]);
        v[10] = phi10;
        v[11] = ((v[10] * v[3])) & 4294967295L;
        v[12] = (v[2] + (Heap.s(v[11], 32) * 1L)) & 4294967295L;
        return v[9] != 0 ? 3 : 11;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi13 = (previous == 10 ? v[38] : 0L);
        v[13] = phi13;
        v[14] = (v[12] + (Heap.s(v[13], 32) * 4L)) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = (v[15]) & 4294967295L;
        v[17] = Heap.fcmp("uno", Heap.f(v[15]), Heap.f(0L));
        return v[17] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[18] = (v[16]) & 65535L;
        v[19] = ((v[18] | 32767L)) & 65535L;
        return 10;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[20] = Heap.fcmp("olt", Heap.f(v[15]), Heap.f(3347046400L));
        return v[20] != 0 ? 10 : 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[21] = Heap.fcmp("ogt", Heap.f(v[15]), Heap.f(1199562752L));
        return v[21] != 0 ? 10 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[22] = Heap.fcmp("ogt", Heap.f(v[15]), Heap.f(3095396352L));
        v[23] = Heap.fcmp("olt", Heap.f(v[15]), Heap.f(947912704L));
        v[24] = ((v[22] & v[23])) & 1L;
        v[25] = ((v[16] >>> 16L)) & 4294967295L;
        return v[24] != 0 ? 8 : 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[26] = (v[25]) & 65535L;
        v[27] = ((v[26] & 32768L)) & 65535L;
        return 10;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[28] = ((v[25] & 32768L)) & 4294967295L;
        v[29] = ((v[16] >>> 13L)) & 4294967295L;
        v[30] = ((v[29] & 64512L)) & 4294967295L;
        v[31] = ((v[30] + 16384L)) & 4294967295L;
        v[32] = ((v[29] & 1023L)) & 4294967295L;
        v[33] = ((v[32] | v[28])) & 4294967295L;
        v[34] = ((v[33] | v[31])) & 4294967295L;
        v[35] = (v[34]) & 65535L;
        return 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        long phi36 = (previous == 4 ? v[19] : (previous == 8 ? v[27] : (previous == 9 ? v[35] : (previous == 5 ? 64511L : 31743L))));
        v[36] = phi36;
        v[37] = (v[12] + (Heap.s(v[13], 32) * 2L)) & 4294967295L;
        m.store(v[37], v[36], 2);
        v[38] = ((v[13] + 1L)) & 4294967295L;
        v[39] = v[38] == v[7] ? 1L : 0L;
        return v[39] != 0 ? 11 : 3;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[40] = ((v[10] + 1L)) & 4294967295L;
        v[41] = v[40] == v[5] ? 1L : 0L;
        return v[41] != 0 ? 12 : 2;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[42] = 0L;
        return -1;
    }
}
