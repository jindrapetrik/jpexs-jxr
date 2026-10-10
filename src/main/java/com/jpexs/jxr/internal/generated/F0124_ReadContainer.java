package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ReadContainer.
 */
public final class F0124_ReadContainer {

    private F0124_ReadContainer() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[53];
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
                    default:
                        throw new IllegalStateException("Invalid block in ReadContainer");
                }
                previous = old;
                if (pc < 0) {
                    return v[52];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[1] = m.stack(4L * 1L, 4);
        v[2] = m.stack(2L * 1L, 1);
        v[3] = m.stack(2L * 1L, 2);
        v[4] = m.stack(4L * 1L, 4);
        v[5] = m.stack(2L * 1L, 2);
        v[6] = (v[0] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        m.store(v[1], 0L, 4);
        m.store(v[2], 0L, 2);
        m.store(v[3], 0L, 2);
        m.store(v[4], 0L, 4);
        m.store(v[5], 0L, 2);
        v[8] = (v[7] + (Heap.s(0L, 32) * 44L) + 40L) & 4294967295L;
        v[9] = m.load(v[8], 4);
        v[10] = Dispatch.call(m, v[9], new long[]{v[7], v[1]});
        v[11] = Heap.s(v[10], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[11] != 0 ? 12 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[12] = m.load(v[1], 4);
        v[13] = v[12] == 0L ? 1L : 0L;
        return v[13] != 0 ? 2 : 12;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[14] = (v[7] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[15] = m.load(v[14], 4);
        v[16] = Dispatch.call(m, v[15], new long[]{v[7], v[2], 2L});
        v[17] = Heap.s(v[16], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[17] != 0 ? 12 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[18] = m.load(v[1], 4);
        v[19] = ((v[18] + 2L)) & 4294967295L;
        m.store(v[1], v[19], 4);
        v[20] = LibC.call(m, "strstr", new long[]{v[2], 8512L});
        v[21] = v[2] == v[20] ? 1L : 0L;
        return v[21] != 0 ? 4 : 12;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[22] = m.load(v[1], 4);
        v[23] = F0238_GetUShort.run(m, v[7], v[22], v[3]);
        v[24] = Heap.s(v[23], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[24] != 0 ? 12 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[25] = m.load(v[1], 4);
        v[26] = ((v[25] + 2L)) & 4294967295L;
        m.store(v[1], v[26], 4);
        v[27] = m.load(v[3], 2);
        v[28] = ((v[27] & 255L)) & 65535L;
        v[29] = v[28] == 188L ? 1L : 0L;
        return v[29] != 0 ? 6 : 12;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[30] = v[27] > 255L ? 1L : 0L;
        v[31] = ((v[27] & 65280L)) & 65535L;
        v[32] = v[31] != 256L ? 1L : 0L;
        v[33] = ((v[30] & v[32])) & 1L;
        return v[33] != 0 ? 12 : 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[34] = F0239_GetULong.run(m, v[7], v[26], v[4]);
        v[35] = Heap.s(v[34], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[35] != 0 ? 12 : 8;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[36] = m.load(v[4], 4);
        m.store(v[1], v[36], 4);
        v[37] = F0238_GetUShort.run(m, v[7], v[36], v[5]);
        v[38] = Heap.s(v[37], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[38] != 0 ? 12 : 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[39] = m.load(v[1], 4);
        v[40] = ((v[39] + 2L)) & 4294967295L;
        m.store(v[1], v[40], 4);
        v[41] = m.load(v[5], 2);
        v[42] = ((v[41] + 1L)) & 65535L;
        v[43] = v[42] < 2L ? 1L : 0L;
        return v[43] != 0 ? 12 : 10;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[44] = F0123_ParsePFD.run(m, v[0], v[40], v[41]);
        v[45] = Heap.s(v[44], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[45] != 0 ? 12 : 11;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[46] = (v[7] + (Heap.s(0L, 32) * 44L) + 36L) & 4294967295L;
        v[47] = m.load(v[46], 4);
        v[48] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L) & 4294967295L;
        v[49] = m.load(v[48], 4);
        v[50] = Dispatch.call(m, v[47], new long[]{v[7], v[49]});
        return 12;
    }

    private static int b12(Heap m, long[] v, int previous) {
        long phi51 = (previous == 0 ? v[10] : (previous == 1 ? 4294967190L : (previous == 2 ? v[16] : (previous == 3 ? 4294967190L : (previous == 4 ? v[23] : (previous == 5 ? 4294967190L : (previous == 6 ? 4294967190L : (previous == 7 ? v[34] : (previous == 8 ? v[37] : (previous == 9 ? 4294967190L : (previous == 10 ? v[44] : v[50])))))))))));
        v[51] = phi51;
        v[52] = v[51];
        return -1;
    }
}
