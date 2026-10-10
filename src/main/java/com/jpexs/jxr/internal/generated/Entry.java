package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

public final class Entry {

    private Entry() {
    }
    public static final int GLOBAL_SIZE = 14320;

    public static long port_probe(Heap m, long a0, long a1, long a2) {
        return F0007_port_probe.run(m, a0, a1, a2);
    }

    public static long port_decode(Heap m, long a0, long a1) {
        return F0013_port_decode.run(m, a0, a1);
    }

    public static long port_encode(Heap m, long a0, long a1, long a2, long a3, long a4, long a5, long a6, long a7, long a8) {
        return F0016_port_encode.run(m, a0, a1, a2, a3, a4, a5, a6, a7, a8);
    }

    public static long port_error(Heap m) {
        return F0006_port_error.run(m);
    }
}
