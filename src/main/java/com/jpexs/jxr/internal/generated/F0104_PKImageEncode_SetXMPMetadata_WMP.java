package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: PKImageEncode_SetXMPMetadata_WMP.
 */
public final class F0104_PKImageEncode_SetXMPMetadata_WMP {

    private F0104_PKImageEncode_SetXMPMetadata_WMP() {
    }

    public static long run(Heap m, long a0, long a1, long a2) {
        long[] v = new long[54];
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
                    default:
                        throw new IllegalStateException("Invalid block in PKImageEncode_SetXMPMetadata_WMP");
                }
                previous = old;
                if (pc < 0) {
                    return v[53];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[3] = m.stack(4L * 1L, 4);
        m.store(v[3], 0L, 4);
        v[4] = (v[0] + (Heap.s(0L, 32) * 66276L) + 108L) & 4294967295L;
        v[5] = m.load(v[4], 4);
        v[6] = v[5] == 0L ? 1L : 0L;
        return v[6] != 0 ? 1 : 8;
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[7] = (v[0] + (Heap.s(0L, 32) * 66276L) + 152L) & 4294967295L;
        v[8] = F0032_PKFree.run(m, v[7]);
        v[9] = (v[0] + (Heap.s(0L, 32) * 66276L) + 156L) & 4294967295L;
        m.store(v[9], 0L, 4);
        v[10] = ((v[2] + 65L)) & 4294967295L;
        v[11] = F0030_PKAlloc.run(m, v[3], v[10]);
        v[12] = Heap.s(v[11], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[12] != 0 ? 8 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[13] = m.load(v[3], 4);
        v[14] = LibC.call(m, "memcpy", new long[]{v[13], v[1], v[2]});
        v[15] = m.load(v[3], 4);
        v[16] = (v[15] + (Heap.s(v[2], 32) * 1L)) & 4294967295L;
        m.store(v[16], 0L, 1);
        v[17] = m.load(v[3], 4);
        v[18] = LibC.call(m, "strlen", new long[]{v[17]});
        v[19] = m.load(v[3], 4);
        v[20] = LibC.call(m, "strstr", new long[]{v[19], 8368L});
        v[21] = v[20] == 0L ? 1L : 0L;
        return v[21] != 0 ? 7 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[22] = LibC.call(m, "strstr", new long[]{v[20], 8384L});
        v[23] = v[22] == 0L ? 1L : 0L;
        return v[23] != 0 ? 8 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[24] = (v[20] + (Heap.s(11L, 32) * 1L)) & 4294967295L;
        v[25] = LibC.call(m, "strchr", new long[]{v[24], 60L});
        v[26] = v[25] == v[22] ? 1L : 0L;
        return v[26] != 0 ? 5 : 8;
    }

    private static int b5(Heap m, long[] v, int previous) {
        v[27] = (v[20]) & 4294967295L;
        v[28] = m.load(v[3], 4);
        v[29] = (v[28]) & 4294967295L;
        v[30] = ((v[10] - v[27])) & 4294967295L;
        v[31] = ((v[30] + v[29])) & 4294967295L;
        v[32] = LibC.call(m, "strncpy", new long[]{v[20], 8400L, v[31]});
        v[33] = v[32] == v[20] ? 1L : 0L;
        return v[33] != 0 ? 6 : 8;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[34] = (v[22] + (Heap.s(12L, 32) * 1L)) & 4294967295L;
        v[35] = (v[34]) & 4294967295L;
        v[36] = ((v[18] + 41L)) & 4294967295L;
        v[37] = ((v[36] + v[27])) & 4294967295L;
        v[38] = ((v[37] - v[35])) & 4294967295L;
        v[39] = (v[20] + (Heap.s(41L, 32) * 1L)) & 4294967295L;
        v[40] = m.load(v[3], 4);
        v[41] = (v[40]) & 4294967295L;
        v[42] = ((v[35] - v[41])) & 4294967295L;
        v[43] = (v[1] + (Heap.s(v[42], 32) * 1L)) & 4294967295L;
        v[44] = ((v[18] - v[42])) & 4294967295L;
        v[45] = LibC.call(m, "memcpy", new long[]{v[39], v[43], v[44]});
        return 7;
    }

    private static int b7(Heap m, long[] v, int previous) {
        long phi46 = (previous == 6 ? v[38] : v[18]);
        long phi47 = (previous == 6 ? 0L : v[11]);
        v[46] = phi46;
        v[47] = phi47;
        v[48] = m.load(v[3], 4);
        m.store(v[7], v[48], 4);
        m.store(v[9], v[46], 4);
        return 9;
    }

    private static int b8(Heap m, long[] v, int previous) {
        long phi49 = (previous == 0 ? 4294967187L : (previous == 1 ? v[11] : (previous == 5 ? 4294967193L : (previous == 4 ? 4294967295L : 4294967295L))));
        v[49] = phi49;
        v[50] = F0032_PKFree.run(m, v[3]);
        v[51] = (v[0] + (Heap.s(0L, 32) * 66276L) + 156L) & 4294967295L;
        m.store(v[51], 0L, 4);
        return 9;
    }

    private static int b9(Heap m, long[] v, int previous) {
        long phi52 = (previous == 8 ? v[49] : v[47]);
        v[52] = phi52;
        v[53] = v[52];
        return -1;
    }
}
