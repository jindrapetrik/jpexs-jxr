package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Generated Java translation of jxrlib: ParsePFDEntry.
 */
public final class F0121_ParsePFDEntry {

    private F0121_ParsePFDEntry() {
    }

    public static long run(Heap m, long a0, long a1, long a2, long a3, long a4) {
        long[] v = new long[108];
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
                    case 20:
                        pc = b20(m, v, previous);
                        break;
                    case 21:
                        pc = b21(m, v, previous);
                        break;
                    case 22:
                        pc = b22(m, v, previous);
                        break;
                    case 23:
                        pc = b23(m, v, previous);
                        break;
                    case 24:
                        pc = b24(m, v, previous);
                        break;
                    case 25:
                        pc = b25(m, v, previous);
                        break;
                    case 26:
                        pc = b26(m, v, previous);
                        break;
                    case 27:
                        pc = b27(m, v, previous);
                        break;
                    case 28:
                        pc = b28(m, v, previous);
                        break;
                    case 29:
                        pc = b29(m, v, previous);
                        break;
                    case 30:
                        pc = b30(m, v, previous);
                        break;
                    case 31:
                        pc = b31(m, v, previous);
                        break;
                    case 32:
                        pc = b32(m, v, previous);
                        break;
                    case 33:
                        pc = b33(m, v, previous);
                        break;
                    case 34:
                        pc = b34(m, v, previous);
                        break;
                    case 35:
                        pc = b35(m, v, previous);
                        break;
                    case 36:
                        pc = b36(m, v, previous);
                        break;
                    case 37:
                        pc = b37(m, v, previous);
                        break;
                    case 38:
                        pc = b38(m, v, previous);
                        break;
                    case 39:
                        pc = b39(m, v, previous);
                        break;
                    case 40:
                        pc = b40(m, v, previous);
                        break;
                    case 41:
                        pc = b41(m, v, previous);
                        break;
                    case 42:
                        pc = b42(m, v, previous);
                        break;
                    case 43:
                        pc = b43(m, v, previous);
                        break;
                    default:
                        throw new IllegalStateException("Invalid block in ParsePFDEntry");
                }
                previous = old;
                if (pc < 0) {
                    return v[107];
                }
            }
        } finally {
            m.restoreStack(frame);
        }
    }

    private static int b0(Heap m, long[] v, int previous) {
        v[5] = m.stack(40L * 1L, 4);
        v[6] = (v[0] + (Heap.s(0L, 32) * 66224L) + 44L) & 4294967295L;
        v[7] = m.load(v[6], 4);
        switch ((int) v[1]) {
            case 48129:
                return 1;
            case 48130:
                return 6;
            case 48256:
                return 8;
            case 48257:
                return 9;
            case 48320:
                return 10;
            case 48321:
                return 12;
            case 48322:
                return 14;
            case 48323:
                return 16;
            case 48258:
                return 18;
            case 48259:
                return 20;
            case 34675:
                return 22;
            case 700:
                return 23;
            case 34665:
                return 24;
            case 34853:
                return 25;
            case 33723:
                return 26;
            case 34377:
                return 27;
            case 48131:
                return 43;
            case 48132:
                return 43;
            case 48324:
                return 43;
            case 48325:
                return 43;
            case 270:
                return 28;
            case 271:
                return 29;
            case 272:
                return 30;
            case 305:
                return 31;
            case 306:
                return 32;
            case 315:
                return 33;
            case 33432:
                return 34;
            case 18246:
                return 35;
            case 18249:
                return 36;
            case 40091:
                return 37;
            case 269:
                return 38;
            case 285:
                return 39;
            case 297:
                return 40;
            case 316:
                return 41;
            default:
                return 42;
        }
    }

    private static int b1(Heap m, long[] v, int previous) {
        v[8] = (v[0] + (Heap.s(0L, 32) * 66224L) + 56L) & 4294967295L;
        v[9] = F0239_GetULong.run(m, v[7], v[4], v[8]);
        v[10] = Heap.s(v[9], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[10] != 0 ? 43 : 2;
    }

    private static int b2(Heap m, long[] v, int previous) {
        v[11] = ((v[4] + 4L)) & 4294967295L;
        v[12] = (v[0] + (Heap.s(0L, 32) * 66224L) + 56L + 4L) & 4294967295L;
        v[13] = F0238_GetUShort.run(m, v[7], v[11], v[12]);
        v[14] = Heap.s(v[13], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[14] != 0 ? 43 : 3;
    }

    private static int b3(Heap m, long[] v, int previous) {
        v[15] = ((v[4] + 6L)) & 4294967295L;
        v[16] = (v[0] + (Heap.s(0L, 32) * 66224L) + 56L + 6L) & 4294967295L;
        v[17] = F0238_GetUShort.run(m, v[7], v[15], v[16]);
        v[18] = Heap.s(v[17], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[18] != 0 ? 43 : 4;
    }

    private static int b4(Heap m, long[] v, int previous) {
        v[19] = (v[7] + (Heap.s(0L, 32) * 44L) + 28L) & 4294967295L;
        v[20] = m.load(v[19], 4);
        v[21] = (v[0] + (Heap.s(0L, 32) * 66224L) + 56L + 8L) & 4294967295L;
        v[22] = Dispatch.call(m, v[20], new long[]{v[7], v[21], 8L});
        v[23] = Heap.s(v[22], 32) < Heap.s(0L, 32) ? 1L : 0L;
        return v[23] != 0 ? 43 : 5;
    }

    private static int b5(Heap m, long[] v, int previous) {
        m.store(v[5], v[8], 4);
        v[24] = F0037_PixelFormatLookup.run(m, v[5], 0L);
        v[25] = (v[5] + (Heap.s(0L, 32) * 40L) + 20L) & 4294967295L;
        v[26] = m.load(v[25], 4);
        v[27] = ((v[26] >>> 4L)) & 4294967295L;
        v[28] = ((v[27] & 1L)) & 4294967295L;
        v[29] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 65960L) & 4294967295L;
        m.store(v[29], v[28], 4);
        v[30] = (v[5] + (Heap.s(0L, 32) * 40L) + 16L) & 4294967295L;
        v[31] = m.load(v[30], 4);
        v[32] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 16L) & 4294967295L;
        m.store(v[32], v[31], 4);
        v[33] = ((v[26] >>> 6L)) & 4294967295L;
        v[34] = ((v[33] & 1L)) & 4294967295L;
        v[35] = ((v[34] ^ 1L)) & 4294967295L;
        v[36] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 88L + 24L) & 4294967295L;
        m.store(v[36], v[35], 4);
        return 43;
    }

    private static int b6(Heap m, long[] v, int previous) {
        v[37] = v[3] == 1L ? 1L : 0L;
        return v[37] != 0 ? 7 : 43;
    }

    private static int b7(Heap m, long[] v, int previous) {
        v[38] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66008L) & 4294967295L;
        m.store(v[38], 1L, 4);
        v[39] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66012L) & 4294967295L;
        m.store(v[39], v[4], 4);
        return 43;
    }

    private static int b8(Heap m, long[] v, int previous) {
        v[40] = v[4] == 0L ? 1L : 0L;
        v[41] = v[40] != 0 ? 4294967190L : 0L;
        return 43;
    }

    private static int b9(Heap m, long[] v, int previous) {
        v[42] = v[4] == 0L ? 1L : 0L;
        v[43] = v[42] != 0 ? 4294967190L : 0L;
        return 43;
    }

    private static int b10(Heap m, long[] v, int previous) {
        v[44] = v[3] == 1L ? 1L : 0L;
        return v[44] != 0 ? 11 : 43;
    }

    private static int b11(Heap m, long[] v, int previous) {
        v[45] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L) & 4294967295L;
        m.store(v[45], v[4], 4);
        return 43;
    }

    private static int b12(Heap m, long[] v, int previous) {
        v[46] = v[3] == 1L ? 1L : 0L;
        return v[46] != 0 ? 13 : 43;
    }

    private static int b13(Heap m, long[] v, int previous) {
        v[47] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 4L) & 4294967295L;
        m.store(v[47], v[4], 4);
        return 43;
    }

    private static int b14(Heap m, long[] v, int previous) {
        v[48] = v[3] == 1L ? 1L : 0L;
        return v[48] != 0 ? 15 : 43;
    }

    private static int b15(Heap m, long[] v, int previous) {
        v[49] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 8L) & 4294967295L;
        m.store(v[49], v[4], 4);
        return 43;
    }

    private static int b16(Heap m, long[] v, int previous) {
        v[50] = v[3] == 1L ? 1L : 0L;
        return v[50] != 0 ? 17 : 43;
    }

    private static int b17(Heap m, long[] v, int previous) {
        v[51] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 12L) & 4294967295L;
        m.store(v[51], v[4], 4);
        return 43;
    }

    private static int b18(Heap m, long[] v, int previous) {
        v[52] = v[3] == 1L ? 1L : 0L;
        return v[52] != 0 ? 19 : 43;
    }

    private static int b19(Heap m, long[] v, int previous) {
        v[53] = (v[0] + (Heap.s(0L, 32) * 66224L) + 84L) & 4294967295L;
        m.store(v[53], v[4], 4);
        return 43;
    }

    private static int b20(Heap m, long[] v, int previous) {
        v[54] = v[3] == 1L ? 1L : 0L;
        return v[54] != 0 ? 21 : 43;
    }

    private static int b21(Heap m, long[] v, int previous) {
        v[55] = (v[0] + (Heap.s(0L, 32) * 66224L) + 88L) & 4294967295L;
        m.store(v[55], v[4], 4);
        return 43;
    }

    private static int b22(Heap m, long[] v, int previous) {
        v[56] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 36L) & 4294967295L;
        m.store(v[56], v[3], 4);
        v[57] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 32L) & 4294967295L;
        m.store(v[57], v[4], 4);
        return 43;
    }

    private static int b23(Heap m, long[] v, int previous) {
        v[58] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 44L) & 4294967295L;
        m.store(v[58], v[3], 4);
        v[59] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 40L) & 4294967295L;
        m.store(v[59], v[4], 4);
        return 43;
    }

    private static int b24(Heap m, long[] v, int previous) {
        v[60] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 48L) & 4294967295L;
        m.store(v[60], v[4], 4);
        v[61] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 52L) & 4294967295L;
        v[62] = F0237_StreamCalcIFDSize.run(m, v[7], v[4], v[61]);
        return 43;
    }

    private static int b25(Heap m, long[] v, int previous) {
        v[63] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 56L) & 4294967295L;
        m.store(v[63], v[4], 4);
        v[64] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 60L) & 4294967295L;
        v[65] = F0237_StreamCalcIFDSize.run(m, v[7], v[4], v[64]);
        return 43;
    }

    private static int b26(Heap m, long[] v, int previous) {
        v[66] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 68L) & 4294967295L;
        m.store(v[66], v[3], 4);
        v[67] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 64L) & 4294967295L;
        m.store(v[67], v[4], 4);
        return 43;
    }

    private static int b27(Heap m, long[] v, int previous) {
        v[68] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 76L) & 4294967295L;
        m.store(v[68], v[3], 4);
        v[69] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 0L + 72L) & 4294967295L;
        m.store(v[69], v[4], 4);
        return 43;
    }

    private static int b28(Heap m, long[] v, int previous) {
        v[70] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L) & 4294967295L;
        v[71] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[70]);
        return 43;
    }

    private static int b29(Heap m, long[] v, int previous) {
        v[72] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 8L) & 4294967295L;
        v[73] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[72]);
        return 43;
    }

    private static int b30(Heap m, long[] v, int previous) {
        v[74] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 16L) & 4294967295L;
        v[75] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[74]);
        return 43;
    }

    private static int b31(Heap m, long[] v, int previous) {
        v[76] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 24L) & 4294967295L;
        v[77] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[76]);
        return 43;
    }

    private static int b32(Heap m, long[] v, int previous) {
        v[78] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 32L) & 4294967295L;
        v[79] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[78]);
        return 43;
    }

    private static int b33(Heap m, long[] v, int previous) {
        v[80] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 40L) & 4294967295L;
        v[81] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[80]);
        return 43;
    }

    private static int b34(Heap m, long[] v, int previous) {
        v[82] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 48L) & 4294967295L;
        v[83] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[82]);
        return 43;
    }

    private static int b35(Heap m, long[] v, int previous) {
        v[84] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 56L) & 4294967295L;
        v[85] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[84]);
        return 43;
    }

    private static int b36(Heap m, long[] v, int previous) {
        v[86] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 64L) & 4294967295L;
        v[87] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[86]);
        return 43;
    }

    private static int b37(Heap m, long[] v, int previous) {
        v[88] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 72L) & 4294967295L;
        v[89] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[88]);
        v[90] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 72L + 4L) & 4294967295L;
        v[91] = m.load(v[90], 4);
        v[92] = ((v[3] >>> 1L)) & 4294967295L;
        v[93] = (v[91] + (Heap.s(v[92], 32) * 2L)) & 4294967295L;
        m.store(v[93], 0L, 2);
        m.store(v[88], 31L, 4);
        return 43;
    }

    private static int b38(Heap m, long[] v, int previous) {
        v[94] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 80L) & 4294967295L;
        v[95] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[94]);
        return 43;
    }

    private static int b39(Heap m, long[] v, int previous) {
        v[96] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 88L) & 4294967295L;
        v[97] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[96]);
        return 43;
    }

    private static int b40(Heap m, long[] v, int previous) {
        v[98] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 96L) & 4294967295L;
        v[99] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[98]);
        return 43;
    }

    private static int b41(Heap m, long[] v, int previous) {
        v[100] = (v[0] + (Heap.s(0L, 32) * 66224L) + 96L + 66016L + 104L) & 4294967295L;
        v[101] = F0245_ReadPropvar.run(m, v[7], v[2], v[3], v[4], v[100]);
        return 43;
    }

    private static int b42(Heap m, long[] v, int previous) {
        v[102] = (v[1]) & 4294967295L;
        v[103] = m.load(8448L, 4);
        v[104] = (v[2]) & 4294967295L;
        v[105] = LibC.call(m, "fprintf", new long[]{v[103], 8464L, v[102], v[102], v[104], v[3], v[4]});
        return 43;
    }

    private static int b43(Heap m, long[] v, int previous) {
        long phi106 = (previous == 42 ? 0L : (previous == 37 ? 0L : (previous == 0 ? 0L : (previous == 0 ? 0L : (previous == 0 ? 0L : (previous == 0 ? 0L : (previous == 27 ? 0L : (previous == 26 ? 0L : (previous == 23 ? 0L : (previous == 22 ? 0L : (previous == 21 ? 0L : (previous == 19 ? 0L : (previous == 17 ? 0L : (previous == 15 ? 0L : (previous == 13 ? 0L : (previous == 11 ? 0L : (previous == 7 ? 0L : (previous == 5 ? v[22] : (previous == 1 ? v[9] : (previous == 2 ? v[13] : (previous == 3 ? v[17] : (previous == 4 ? v[22] : (previous == 6 ? 4294967190L : (previous == 8 ? v[41] : (previous == 9 ? v[43] : (previous == 10 ? 4294967190L : (previous == 12 ? 4294967190L : (previous == 14 ? 4294967190L : (previous == 16 ? 4294967190L : (previous == 18 ? 4294967190L : (previous == 20 ? 4294967190L : (previous == 24 ? 0L : (previous == 25 ? 0L : (previous == 28 ? 0L : (previous == 29 ? 0L : (previous == 30 ? 0L : (previous == 31 ? 0L : (previous == 32 ? 0L : (previous == 33 ? 0L : (previous == 34 ? 0L : (previous == 35 ? 0L : (previous == 36 ? 0L : (previous == 38 ? 0L : (previous == 39 ? 0L : (previous == 40 ? 0L : 0L)))))))))))))))))))))))))))))))))))))))))))));
        v[106] = phi106;
        v[107] = v[106];
        return -1;
    }
}
