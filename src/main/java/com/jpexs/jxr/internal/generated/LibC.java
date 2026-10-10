package com.jpexs.jxr.internal.generated;

import com.jpexs.jxr.internal.Heap;

/**
 * Java replacements for scalar intrinsics and the small C runtime used by
 * jxrlib. Temporary C FILE streams are byte arrays; no native code or processes
 * are used.
 */
public strictfp final class LibC {

    private LibC() {
    }

    public static long call(Heap m, String name, long[] a) {
        long x = a.length > 0 ? a[0] : 0, y = a.length > 1 ? a[1] : 0, z = a.length > 2 ? a[2] : 0;
        switch (name) {
            case "malloc":
                return m.malloc(x);
            case "calloc": {
                long p = m.malloc(x * y);
                m.fill(p, 0, x * y);
                return p;
            }
            case "free":
                m.free(x);
                return 0;
            case "memcpy":
            case "memmove":
                m.copy(x, y, z);
                return x;
            case "llvm.memcpy.p0.p0.i32":
            case "llvm.memmove.p0.p0.i32":
                m.copy(x, y, z);
                return 0;
            case "memset":
                m.fill(x, y, z);
                return x;
            case "llvm.memset.p0.i32":
                m.fill(x, y, z);
                return 0;
            case "memcmp":
                for (long n = 0; n < z; n++) {
                    long d = m.load(x + n, 1) - m.load(y + n, 1);
                    if (d != 0) {
                        return d & 0xffffffffL;
                    }
                }
                return 0;
            case "strlen": {
                long n = 0;
                while (m.load(x + n, 1) != 0) {
                    n++;
                }
                return n;
            }
            case "wcslen": {
                long n = 0;
                while (m.load(x + 4 * n, 4) != 0) {
                    n++;
                }
                return n;
            }
            case "tolower":
                return x >= 'A' && x <= 'Z' ? x + 32 : x;
            case "strchr":
            case "strrchr": {
                long found = 0;
                for (long p = x;; p++) {
                    long c = m.load(p, 1);
                    if (c == (y & 255)) {
                        found = p;
                        if (name.equals("strchr")) {
                            return found;
                        }
                    }
                    if (c == 0) {
                        return found;
                    }
                }
            }
            case "strstr": {
                String src = m.string(x), needle = m.string(y);
                int n = src.indexOf(needle);
                return n < 0 ? 0 : x + n;
            }
            case "strcpy": {
                long n = 0, c;
                do {
                    c = m.load(y + n, 1);
                    m.store(x + n, c, 1);
                    n++;
                } while (c != 0);
                return x;
            }
            case "strncpy": {
                boolean done = false;
                for (long n = 0; n < z; n++) {
                    long c = done ? 0 : m.load(y + n, 1);
                    m.store(x + n, c, 1);
                    if (c == 0) {
                        done = true;
                    }
                }
                return x;
            }
            case "printf":
            case "fprintf":
                return 0;
            case "abs":
                return Math.abs((int) x) & 0xffffffffL;
            case "rand":
                m.random = m.random * 1103515245 + 12345;
                return (m.random >>> 16) & 32767;
            case "pow":
                return Heap.db(Math.pow(Heap.d(x), Heap.d(y)));
            case "ldexp":
                return Heap.db(Math.scalb(Heap.d(x), (int) y));
            case "frexp": {
                double d = Heap.d(x);
                int e = d == 0 || Double.isInfinite(d) || Double.isNaN(d) ? 0 : Math.getExponent(d) + 1;
                if (d != 0 && Math.abs(d) < Double.MIN_NORMAL) {
                    e = Math.getExponent(Math.scalb(d, 54)) + 1 - 54;
                }
                m.store(y, e, 4);
                return Heap.db(Math.scalb(d, -e));
            }
            case "llvm.fmuladd.f32":
                return Heap.fb(Heap.f(x) * Heap.f(y) + Heap.f(z));
            case "llvm.smin.i32":
                return Math.min((int) x, (int) y) & 0xffffffffL;
            case "llvm.smax.i32":
                return Math.max((int) x, (int) y) & 0xffffffffL;
            case "llvm.umin.i32":
            case "llvm.umin.i8":
                return Math.min(x, y);
            case "llvm.umax.i32":
            case "llvm.umax.i8":
                return Math.max(x, y);
            case "llvm.usub.sat.i32":
                return x < y ? 0 : x - y;
            case "llvm.bswap.i32":
                return Integer.reverseBytes((int) x) & 0xffffffffL;
            case "llvm.fshl.i32": {
                int shift = (int) z & 31;
                return (shift == 0 ? (int) x : ((int) x << shift) | ((int) y >>> (32 - shift))) & 0xffffffffL;
            }
            case "tmpnam": {
                long p = m.string("jjxr-temp-" + m.nextFile);
                if (x != 0) {
                    m.copy(x, p, m.string(p).length() + 1);
                    return x;
                }
                return p;
            }
            case "fopen": {
                String path = m.string(x), mode = m.string(y);
                Heap.MemoryFile f = mode.startsWith("w") ? new Heap.MemoryFile() : m.namedFiles.get(path);
                if (f == null) {
                    return 0;
                }
                f.position = 0;
                m.namedFiles.put(path, f);
                int id = m.nextFile++;
                m.files.put(id, f);
                return id;
            }
            case "fclose":
                m.files.remove((int) x);
                return 0;
            case "remove":
                return m.namedFiles.remove(m.string(x)) == null ? 0xffffffffL : 0;
            case "ftell":
                return file(m, x).position;
            case "feof": {
                Heap.MemoryFile f = file(m, x);
                return f.position >= f.length ? 1 : 0;
            }
            case "fseek": {
                Heap.MemoryFile f = file(m, x);
                long p = (z == 0 ? 0 : z == 1 ? f.position : f.length) + (int) y;
                if (p < 0 || p > 256 * 1024 * 1024) {
                    return 0xffffffffL;
                }
                f.position = (int) p;
                return 0;
            }
            case "fwrite": {
                Heap.MemoryFile f = file(m, a[3]);
                long count = y * z;
                if (count > Integer.MAX_VALUE) {
                    throw new IllegalArgumentException("JXR stream too large");
                }
                byte[] bytes = m.bytes(x, (int) count);
                f.ensure(f.position + bytes.length);
                System.arraycopy(bytes, 0, f.data, f.position, bytes.length);
                f.position += bytes.length;
                f.length = Math.max(f.length, f.position);
                return z;
            }
            case "fread": {
                Heap.MemoryFile f = file(m, a[3]);
                if (y == 0) {
                    return 0;
                }
                int count = (int) Math.min(y * z, Math.max(0, f.length - f.position));
                for (int n = 0; n < count; n++) {
                    m.store(x + n, f.data[f.position + n] & 255, 1);
                }
                f.position += count;
                return count / y;
            }
            default:
                throw new IllegalArgumentException("Unsupported C runtime operation: " + name);
        }
    }

    private static Heap.MemoryFile file(Heap m, long id) {
        Heap.MemoryFile f = m.files.get((int) id);
        if (f == null) {
            throw new IllegalArgumentException("Invalid JXR stream");
        }
        return f;
    }
}
