package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageDecode_Initialize_WMP.
 */
public final class F0125_PKImageDecode_Initialize_WMP {

    private F0125_PKImageDecode_Initialize_WMP() {
    }

    public static long run(Heap m, long a0, long a1) {
        long[] v = new long[29];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageDecode_Initialize_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[28];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[2] = F0070_PKImageDecode_Initialize.run(m, v[0], v[1]);
        v[3] = Heap.s(v[2], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[3] != 0 ? 6 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[4] = F0124_ReadContainer.run(m, v[0]);
        v[5] = Heap.s(v[4], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[5] != 0 ? 6 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[6] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L) & 4294967295L;
        v[7] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 160L + 48L) & 4294967295L;
        m.store(v[7], v[1], 4);
        v[8] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65984L) & 4294967295L;
        m.store(v[8], 0L, 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65996L) & 4294967295L;
        m.store(v[9], 0L, 4);
        v[10] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66000L) & 4294967295L;
        m.store(v[10], 0L, 4);
        v[11] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66004L) & 4294967295L;
        m.store(v[11], 0L, 4);
        v[12] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L) & 4294967295L;
        v[13] = F0399_ImageStrDecGetInfo.run(m, v[12], v[6]);
        v[14] = v[13] == 0L ? 1L : 0L;
        return v[14] != 0 ? 3 : 6;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[15] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66008L) & 4294967295L;
        v[16] = m.load(v[15], 4);
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 5 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[18] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66012L) & 4294967295L;
        v[19] = m.load(v[18], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi20 = (previous == 4 ? v[19] : 0L);
        v[20] = phi20;
        v[21] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 60L) & 4294967295L;
        m.store(v[21], v[20], 4);
        v[22] = m.load(v[12], 4);
        v[23] = (v[0] + (Heap.s(0L, 32) * 66224L) + 72L) & 4294967295L;
        m.store(v[23], v[22], 4);
        v[24] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 4L) & 4294967295L;
        v[25] = m.load(v[24], 4);
        v[26] = (v[0] + (Heap.s(0L, 32) * 66224L) + 76L) & 4294967295L;
        m.store(v[26], v[25], 4);
        return 6;
    }

    private static int b6(Heap m, long[] v, int previous) {
        long phi27 = (previous == 5 ? 0L : (previous == 0 ? v[2] : (previous == 1 ? v[4] : 4294967295L)));
        v[27] = phi27;
        v[28] = v[27];
        return -1;
    }
}
