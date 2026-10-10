package com.jpexs.jxr;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.*;
import java.util.Iterator;
import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;

/**
 * Convenience API. The plugin itself is also usable directly through ImageIO.
 */
public final class Jxr {

    private Jxr() {
    }

    public static BufferedImage read(File file) throws IOException {
        BufferedImage image = ImageIO.read(file);
        if (image == null) {
            throw new IOException("Unsupported image: " + file);
        }
        return image;
    }

    public static void write(BufferedImage image, File file) throws IOException {
        write(image, file, new JxrImageWriteParam());
    }

    /**
     * Encodes to a sibling temporary file before replacing the target.
     */
    public static void write(BufferedImage image, File file, JxrImageWriteParam param) throws IOException {
        if (image == null || file == null || param == null) {
            throw new IllegalArgumentException("Null argument");
        }
        Path target = file.toPath().toAbsolutePath();
        Path temporary = Files.createTempFile(target.getParent(), ".jjxr-", ".jxr");
        try {
            Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jxr");
            if (!writers.hasNext()) {
                throw new IOException("JXR ImageIO writer is not registered");
            }
            ImageWriter writer = writers.next();
            try (ImageOutputStream out = ImageIO.createImageOutputStream(temporary.toFile())) {
                if (out == null) {
                    throw new IOException("Cannot create output stream");
                }
                writer.setOutput(out);
                writer.write(null, new IIOImage(image, null, null), param);
            } finally {
                writer.dispose();
            }
            try {
                Files.move(temporary, target, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            } catch (AtomicMoveNotSupportedException e) {
                Files.move(temporary, target, StandardCopyOption.REPLACE_EXISTING);
            }
        } finally {
            Files.deleteIfExists(temporary);
        }
    }

    public static void main(String[] args) throws IOException {
        if (args.length < 2 || args.length > 3) {
            System.err.println("Usage: java -cp jjxr.jar com.jpexs.jxr.Jxr input.jxr output.png\n       java -cp jjxr.jar com.jpexs.jxr.Jxr input.png output.jxr [quality 0..1]");
            return;
        }
        BufferedImage image = read(new File(args[0]));
        String name = args[1];
        int dot = name.lastIndexOf('.');
        if (dot < 0) {
            throw new IOException("Output filename needs an extension");
        }
        String format = name.substring(dot + 1);
        if (format.equalsIgnoreCase("jxr")) {
            JxrImageWriteParam param = new JxrImageWriteParam();
            if (args.length == 3) {
                param.setCompressionQuality(Float.parseFloat(args[2]));
            }
            write(image, new File(name), param);
        } else if (!ImageIO.write(image, format, new File(name))) {
            throw new IOException("No writer for " + format);
        }
    }
}
