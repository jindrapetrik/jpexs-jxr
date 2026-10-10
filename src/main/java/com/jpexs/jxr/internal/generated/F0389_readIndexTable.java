package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: readIndexTable.
 */
public final class F0389_readIndexTable {

    private F0389_readIndexTable() {
    }

    public static long run(Heap m, long a0) {
        long[] v = new long[31];
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
                    default:
                        throw new IllegalStateException("Invalid block in readIndexTable");
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
        v[1] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34248L) & 4294967295L;
        v[2] = m.load(v[1], 4);
        v[3] = F0363_readIS.run(m, v[0], v[2]);
        v[4] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34300L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 4 : 1;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34264L) & 4294967295L;
        v[8] = m.load(v[7], 4);
        v[9] = (v[0] + (Heap.s(0L, 32) * 35064L) + 76L + 16444L) & 4294967295L;
        v[10] = m.load(v[9], 4);
        v[11] = ((v[10] + 1L)) & 4294967295L;
        v[12] = ((v[11] * v[5])) & 4294967295L;
        v[13] = F0357_getBit32.run(m, v[2], 16L);
        v[14] = v[13] == 1L ? 1L : 0L;
        return v[14] != 0 ? 2 : 5;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[15] = v[12] == 0L ? 1L : 0L;
        return v[15] != 0 ? 4 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        long phi16 = (previous == 3 ? v[20] : 0L);
        v[16] = phi16;
        v[17] = F0363_readIS.run(m, v[0], v[2]);
        v[18] = F0390_GetVLWordEsc.run(m, v[2]);
        v[19] = (v[8] + (Heap.s(v[16], 32) * 4L)) & 4294967295L;
        m.store(v[19], v[18], 4);
        v[20] = ((v[16] + 1L)) & 4294967295L;
        v[21] = v[20] == v[12] ? 1L : 0L;
        return v[21] != 0 ? 4 : 3;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[22] = F0390_GetVLWordEsc.run(m, v[2]);
        v[23] = (v[0] + (Heap.s(0L, 32) * 35064L) + 34304L) & 4294967295L;
        m.store(v[23], v[22], 4);
        v[24] = F0358_flushToByte.run(m, v[2]);
        v[25] = m.load(v[1], 4);
        v[26] = F0368_getPosRead.run(m, v[25]);
        v[27] = m.load(v[23], 4);
        v[28] = ((v[27] + v[26])) & 4294967295L;
        m.store(v[23], v[28], 4);
        return 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        long phi29 = (previous == 4 ? 0L : 4294967295L);
        v[29] = phi29;
        v[30] = v[29];
        return -1;
    }
}
