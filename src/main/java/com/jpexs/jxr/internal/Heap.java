package com.jpexs.jxr.internal;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import com.jpexs.jxr.internal.generated.Entry;

/**
 * Checked Java storage for the C port's byte-addressed data structures. Each
 * image operation has its own heap, tables, stack and temporary streams.
 */
public strictfp final class Heap {

    private static final int STACK_BASE = 0x60000000;
    private static final int LIMIT = 512 * 1024 * 1024;
    private byte[] data = new byte[65536], stack = new byte[65536];
    private int end = Entry.GLOBAL_SIZE, sp;
    private final Map<Integer, Integer> allocations = new HashMap<>();
    private final TreeMap<Integer, ArrayDeque<Integer>> available = new TreeMap<>();
    public final Map<Integer, MemoryFile> files = new HashMap<>();
    public final Map<String, MemoryFile> namedFiles = new HashMap<>();
    public int nextFile = 0x71000000, random = 1;

    public Heap() {
        try (InputStream in = Heap.class.getResourceAsStream("globals.bin")) {
            if (in == null) {
                throw new IllegalStateException("Missing JXR tables");
            }
            grow(false, end);
            int p = 0, n;
            while (p < end && (n = in.read(data, p, end - p)) > 0) {
                p += n;
            }
            if (p != end) {
                throw new IllegalStateException("Truncated JXR tables");
            }
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    private void grow(boolean isStack, int needed) {
        byte[] a = isStack ? stack : data;
        if (needed < 0 || needed > LIMIT) {
            throw new IllegalArgumentException("JXR working memory exceeds 512 MiB");
        }
        if (needed <= a.length) {
            return;
        }
        int capacity = (int) Math.min(LIMIT, Math.max((long) needed, a.length + (long) a.length / 2));
        if (isStack) {
            stack = Arrays.copyOf(a, capacity);
        } else {
            data = Arrays.copyOf(a, capacity);
        }
    }

    public long malloc(long bytes) {
        if (bytes < 0 || bytes > LIMIT - 32) {
            throw new IllegalArgumentException("Invalid JXR allocation: " + bytes);
        }
        int count = ((int) Math.max(bytes, 1) + 15) & ~15;
        Map.Entry<Integer, ArrayDeque<Integer>> block = available.ceilingEntry(count);
        int address;
        if (block != null) {
            count = block.getKey();
            address = block.getValue().removeFirst();
            if (block.getValue().isEmpty()) {
                available.remove(count);
            }
        } else {
            address = (end + 15) & ~15;
            if ((long) address + count > LIMIT) {
                throw new IllegalArgumentException("JXR working memory exceeds 512 MiB");
            }
            end = address + count;
            grow(false, end);
        }
        allocations.put(address, count);
        return address;
    }

    public void free(long address) {
        if (address == 0) {
            return;
        }
        Integer count = allocations.remove((int) address);
        if (count == null) {
            throw new IllegalArgumentException("Invalid JXR free: " + address);
        }
        available.computeIfAbsent(count, k -> new ArrayDeque<>()).add((int) address);
    }

    public int stackPosition() {
        return sp;
    }

    public void restoreStack(int frame) {
        sp = frame;
    }

    public long stack(long bytes, int alignment) {
        if (bytes < 0 || bytes > LIMIT) {
            throw new IllegalArgumentException("Invalid JXR stack allocation");
        }
        int at = (sp + alignment - 1) & -alignment;
        if ((long) at + bytes > LIMIT) {
            throw new IllegalArgumentException("JXR stack overflow");
        }
        sp = at + (int) bytes;
        grow(true, sp);
        return STACK_BASE + (long) at;
    }

    private byte[] memory(long pointer, long count) {
        if (pointer >= STACK_BASE && pointer < STACK_BASE + (long) LIMIT) {
            if (count < 0 || pointer - STACK_BASE + count > sp) {
                throw new IndexOutOfBoundsException("JXR stack access: " + pointer + ", " + count);
            }
            return stack;
        }
        if (pointer < 16 || count < 0 || pointer + count > end) {
            throw new IndexOutOfBoundsException("JXR heap access: " + pointer + ", " + count);
        }
        return data;
    }

    private static int offset(long pointer) {
        return (int) (pointer >= STACK_BASE ? pointer - STACK_BASE : pointer);
    }

    public long load(long pointer, int bytes) {
        byte[] a = memory(pointer, bytes);
        int p = offset(pointer);
        long value = 0;
        for (int n = 0; n < bytes; n++) {
            value |= (a[p + n] & 255L) << (n * 8);
        }
        return value;
    }

    public void store(long pointer, long value, int bytes) {
        byte[] a = memory(pointer, bytes);
        int p = offset(pointer);
        for (int n = 0; n < bytes; n++) {
            a[p + n] = (byte) (value >>> (n * 8));
        }
    }

    public void fill(long pointer, long value, long bytes) {
        byte[] a = memory(pointer, bytes);
        int p = offset(pointer);
        Arrays.fill(a, p, p + (int) bytes, (byte) value);
    }

    public void copy(long destination, long source, long bytes) {
        byte[] src = memory(source, bytes), dst = memory(destination, bytes);
        System.arraycopy(src, offset(source), dst, offset(destination), (int) bytes);
    }

    public void put(long destination, byte[] bytes) {
        byte[] dst = memory(destination, bytes.length);
        System.arraycopy(bytes, 0, dst, offset(destination), bytes.length);
    }

    public byte[] bytes(long pointer, int size) {
        byte[] src = memory(pointer, size);
        return Arrays.copyOfRange(src, offset(pointer), offset(pointer) + size);
    }

    public String string(long pointer) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (long p = pointer;; p++) {
            int b = (int) load(p, 1);
            if (b == 0) {
                break;
            }
            out.write(b);
        }
        return new String(out.toByteArray(), StandardCharsets.UTF_8);
    }

    public long string(String text) {
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        long p = malloc(bytes.length + 1);
        put(p, bytes);
        store(p + bytes.length, 0, 1);
        return p;
    }

    public static long s(long value, int bits) {
        return bits == 64 ? value : value << (64 - bits) >> (64 - bits);
    }

    public static float f(long bits) {
        return Float.intBitsToFloat((int) bits);
    }

    public static double d(long bits) {
        return Double.longBitsToDouble(bits);
    }

    public static long fb(double value) {
        return Float.floatToRawIntBits((float) value) & 0xffffffffL;
    }

    public static long db(double value) {
        return Double.doubleToRawLongBits(value);
    }

    public static long fcmp(String op, double a, double b) {
        boolean unordered = Double.isNaN(a) || Double.isNaN(b), result;
        switch (op) {
            case "ord":
                return unordered ? 0 : 1;
            case "uno":
                return unordered ? 1 : 0;
            case "false":
                return 0;
            case "true":
                return 1;
            default:
                String relation = op.substring(1);
                switch (relation) {
                    case "eq":
                        result = a == b;
                        break;
                    case "ne":
                        result = a != b;
                        break;
                    case "lt":
                        result = a < b;
                        break;
                    case "le":
                        result = a <= b;
                        break;
                    case "gt":
                        result = a > b;
                        break;
                    case "ge":
                        result = a >= b;
                        break;
                    default:
                        throw new IllegalArgumentException(op);
                }
                return (op.charAt(0) == 'u' ? unordered || result : !unordered && result) ? 1 : 0;
        }
    }

    public static final class MemoryFile {

        public byte[] data = new byte[8192];
        public int length, position;

        public void ensure(int size) {
            if (size < 0 || size > 256 * 1024 * 1024) {
                throw new IllegalArgumentException("JXR temporary stream exceeds 256 MiB");
            }
            if (size > data.length) {
                data = Arrays.copyOf(data, Math.max(size, data.length + data.length / 2));
            }
        }
    }
}
