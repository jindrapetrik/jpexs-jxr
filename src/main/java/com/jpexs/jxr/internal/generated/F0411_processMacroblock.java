package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: processMacroblock.
 */
public final class F0411_processMacroblock {

    private F0411_processMacroblock() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[75];
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
                    default:
                        throw new IllegalStateException("Invalid block in processMacroblock");
                }
                previous = old;
                if (pc < 0) {
                    return v[74];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = v[2] == 0L ? 1L : 0L;
        return v[3] != 0 ? 2 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi7 = (previous == 0 ? 1L : v[6]);
        v[7] = phi7;
        v[8] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = v[9] != 0L ? 1L : 0L;
        F0444_transformMacroblock.run(m, v[0]);
        return v[7] != 0 ? 6 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[11] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[12] = m.load(v[11], 4);
        v[13] = ((v[12] + 4294967295L)) & 4294967295L;
        v[14] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = ((v[15] + 4294967295L)) & 4294967295L;
        F0300_getTilePos.run(m, v[0], v[13], v[16]);
        return v[10] != 0 ? 4 : 5;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[17] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[18] = m.load(v[17], 4);
        v[19] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = (v[20] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        m.store(v[21], v[18], 4);
        v[22] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[23] = m.load(v[22], 4);
        v[24] = (v[20] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        m.store(v[24], v[23], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = m.load(v[11], 4);
        v[26] = ((v[25] + 4294967295L)) & 4294967295L;
        v[27] = m.load(v[14], 4);
        v[28] = ((v[27] + 4294967295L)) & 4294967295L;
        v[29] = F0410_encodeMB.run(m, v[0], v[26], v[28]);
        v[30] = v[29] == 0L ? 1L : 0L;
        v[31] = v[30] != 0 ? v[10] : 0L;
        v[32] = ((v[30] ^ 1L)) & 1L;
        v[33] = (Heap.s(v[32], 1)) & 4294967295L;
        return v[31] != 0 ? 7 : 15;
    }

    private static int b6(Heap m, long[] v, int previous) {
        return v[10] != 0 ? 7 : 15;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[34] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[35] = m.load(v[34], 4);
        v[36] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[37] = m.load(v[36], 4);
        v[38] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        m.store(v[38], v[35], 4);
        v[39] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[40] = m.load(v[39], 4);
        v[41] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        m.store(v[41], v[40], 4);
        return v[10] != 0 ? 8 : 15;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[42] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        v[43] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[44] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        v[45] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[46] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        v[47] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        v[48] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34928L) & 4294967295L;
        v[49] = (v[37] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        F0444_transformMacroblock.run(m, v[37]);
        return v[7] != 0 ? 12 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[50] = m.load(v[42], 4);
        v[51] = ((v[50] + 4294967295L)) & 4294967295L;
        v[52] = m.load(v[43], 4);
        v[53] = ((v[52] + 4294967295L)) & 4294967295L;
        F0300_getTilePos.run(m, v[37], v[51], v[53]);
        return v[10] != 0 ? 10 : 11;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[54] = m.load(v[44], 4);
        v[55] = m.load(v[45], 4);
        v[56] = (v[55] + (Heap.s(0L, 32) * 35064L) + 34268L) & 4294967295L;
        m.store(v[56], v[54], 4);
        v[57] = m.load(v[46], 4);
        v[58] = (v[55] + (Heap.s(0L, 32) * 35064L) + 34272L) & 4294967295L;
        m.store(v[58], v[57], 4);
        return 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[59] = m.load(v[42], 4);
        v[60] = ((v[59] + 4294967295L)) & 4294967295L;
        v[61] = m.load(v[43], 4);
        v[62] = ((v[61] + 4294967295L)) & 4294967295L;
        v[63] = F0410_encodeMB.run(m, v[37], v[60], v[62]);
        v[64] = v[63] == 0L ? 1L : 0L;
        v[65] = v[64] != 0 ? v[10] : 0L;
        return v[65] != 0 ? 13 : 14;
    }

    private static int b12(Heap m, long[] v, int previous) {
        return v[10] != 0 ? 13 : 15;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[66] = m.load(v[47], 4);
        v[67] = m.load(v[48], 4);
        v[68] = (v[67] + (Heap.s(0L, 32) * 35064L) + 34324L) & 4294967295L;
        m.store(v[68], v[66], 4);
        v[69] = m.load(v[49], 4);
        v[70] = (v[67] + (Heap.s(0L, 32) * 35064L) + 34328L) & 4294967295L;
        m.store(v[70], v[69], 4);
        return 15;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[71] = ((v[64] ^ 1L)) & 1L;
        v[72] = (Heap.s(v[71], 1)) & 4294967295L;
        return 15;
    }

    private static int b15(Heap m, long[] v, int previous) {
        long phi73 = (previous == 5 ? v[33] : (previous == 6 ? 0L : (previous == 7 ? 0L : (previous == 13 ? 0L : (previous == 14 ? v[72] : 0L)))));
        v[73] = phi73;
        v[74] = v[73];
        return -1;
    }
}
