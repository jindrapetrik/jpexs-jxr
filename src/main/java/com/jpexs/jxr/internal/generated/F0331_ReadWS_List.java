package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ReadWS_List.
 */
public final class F0331_ReadWS_List {

    private F0331_ReadWS_List() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[41];
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
                    default:
                        throw new IllegalStateException("Invalid block in ReadWS_List");
                }
                previous = old;
                if (pc < 0) {
                    return v[40];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = (v[0] + (Heap.s(0L, 32) * 16L) + 8L) & 4294967295L;
        v[4] = m.load(v[3], 4);
        v[5] = ((v[4] ^ 4294967295L)) & 4294967295L;
        v[6] = v[5] < v[2] ? 1L : 0L;
        return v[6] != 0 ? 5 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 16L) + 4L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 16L) + 12L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((v[10] << 12L)) & 4294967295L;
        v[12] = ((v[11] + v[4])) & 4294967295L;
        v[13] = ((v[12] + v[2])) & 4294967295L;
        v[14] = v[8] < v[13] ? 1L : 0L;
        v[15] = ((v[8] - v[12])) & 4294967295L;
        v[16] = v[14] != 0 ? v[15] : v[2];
        v[17] = v[16] == 0L ? 1L : 0L;
        return v[17] != 0 ? 5 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        long phi18 = (previous == 4 ? v[37] : v[4]);
        long phi19 = (previous == 4 ? v[29] : v[16]);
        long phi20 = (previous == 4 ? v[28] : v[1]);
        v[18] = phi18;
        v[19] = phi19;
        v[20] = phi20;
        v[21] = ((4096L - v[18])) & 4294967295L;
        v[22] = LibC.call(m, "llvm.umin.i32", new long[]{v[21], v[19]});
        v[23] = m.load(v[0], 4);
        v[24] = (v[23] + (Heap.s(v[18], 32) * 1L)) & 4294967295L;
        v[25] = LibC.call(m, "memcpy", new long[]{v[20], v[24], v[22]});
        v[26] = m.load(v[3], 4);
        v[27] = ((v[26] + v[22])) & 4294967295L;
        m.store(v[3], v[27], 4);
        v[28] = (v[20] + (Heap.s(v[22], 32) * 1L)) & 4294967295L;
        v[29] = ((v[19] - v[22])) & 4294967295L;
        v[30] = v[27] == 4096L ? 1L : 0L;
        return v[30] != 0 ? 3 : 4;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[31] = m.load(v[0], 4);
        v[32] = (v[31] + (Heap.s(4294967292L, 32) * 1L)) & 4294967295L;
        v[33] = m.load(v[32], 4);
        v[34] = (v[33] + (Heap.s(4L, 32) * 1L)) & 4294967295L;
        m.store(v[0], v[34], 4);
        m.store(v[3], 0L, 4);
        v[35] = m.load(v[9], 4);
        v[36] = ((v[35] + 1L)) & 4294967295L;
        m.store(v[9], v[36], 4);
        return 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        long phi37 = (previous == 3 ? 0L : v[27]);
        v[37] = phi37;
        v[38] = v[29] == 0L ? 1L : 0L;
        return v[38] != 0 ? 5 : 2;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi39 = (previous == 0 ? 4294967193L : (previous == 1 ? 0L : 0L));
        v[39] = phi39;
        v[40] = v[39];
        return -1;
    }
}
