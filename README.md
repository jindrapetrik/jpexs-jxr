# JPEXS JXR – JPEG XR in pure Java 8

Read, display, and write JPEG XR (`.jxr`) images using standard `ImageIO`.
HD Photo / Windows Media Photo files (`.wdp`, `.hdp`) can also be read.
The library has no external runtime dependencies. 

The implementation is based on the sources of
[Microsoft jxrlib](https://github.com/4creators/jxrlib).

## Building

You need JDK 8 or later.

Build with Maven:

```text
mvn package
```

## Using ImageIO

Add the JAR to your classpath. Providers are registered automatically through
`META-INF/services`; preserve these entries when building a fat JAR.

```java
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

BufferedImage image = ImageIO.read(new File("input.jxr"));
if (image == null) throw new IllegalArgumentException("Unknown format");
if (!ImageIO.write(image, "jxr", new File("output.jxr"))) {
    throw new IllegalStateException("JXR writer is not registered");
}
```

Encoding is lossless by default, with an independently lossless alpha channel.
Supported output formats are RGB, RGBA, 8-bit grayscale, and 1-bit black and
white. Indexed images with other palettes are converted to RGB/RGBA.
Premultiplied pixels are converted using Java's `ColorModel` before encoding.

Configure lossy compression and safely replace an output file:

```java
import com.jpexs.jxr.Jxr;
import com.jpexs.jxr.JxrImageWriteParam;

JxrImageWriteParam param = new JxrImageWriteParam();
param.setCompressionQuality(0.85f);
param.setAlphaQuality(1.0f);
param.setChroma(JxrImageWriteParam.Chroma.YUV444);
param.setOverlap(JxrImageWriteParam.Overlap.AUTO);
Jxr.write(image, new File("output.jxr"), param);
```

`Jxr.write` first finishes writing a temporary file in the same directory, then
replaces the destination file. `ImageIO.write` follows standard ImageIO behavior.
Quality ranges from 0 to 1, in increments of 0.01. A value of 1 uses lossless
quantization and requires 4:4:4 for color images. Lower values are mapped to the
quantization index `2 + (100 - qualityPercent)`; this scale differs from the
GIMP plugin's optimized quality scale. Alpha quality is independent.

## Viewer and conversion

```text
java -jar target/jpexs-jxr-1.0.0.jar
java -jar target/jpexs-jxr-1.0.0.jar input.jxr
java -cp target/jpexs-jxr-1.0.0.jar com.jpexs.jxr.Jxr input.jxr output.png
java -cp target/jpexs-jxr-1.0.0.jar com.jpexs.jxr.Jxr input.png output.jxr 0.85
```

The viewer displays the image at its original size with scrollbars and lets
you save it as JXR with a selectable quality. Reading and writing run outside
the Swing event dispatch thread.

## Scope and limitations

- One image is read from the JXR container. Container orientation is applied.
- Display and output use 8 bits per channel. Higher bit depths and HDR are
  converted using jxrlib's reference conversions; unsupported conversions
  throw `IOException`. HDR data is not preserved during conversion.
- ICC, XMP, EXIF, and original DPI are neither exported nor applied. Output DPI is 96.
- Reading supports cropping, subsampling, and a destination offset; the entire
  image is decoded. Individual band selection is not implemented. Writing
  supports cropping and subsampling.
- Input and output are limited to 256 MiB, images to 64 million pixels, and
  the codec's working Java heap to 512 MiB. The actual processable image size
  also depends on available JVM memory and the pixel format.
- The generated port prioritizes fidelity to the reference implementation
  over performance and readability of the algorithmic core. It does not yet
  include performance optimizations for large images.
