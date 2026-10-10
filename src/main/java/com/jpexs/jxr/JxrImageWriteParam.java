package com.jpexs.jxr;

import javax.imageio.ImageWriteParam;
import java.util.Locale;

/**
 * Quality 1.0 with 4:4:4 is lossless; alpha quality is independent.
 */
public final class JxrImageWriteParam extends ImageWriteParam {

    public enum Chroma {
        YUV444, YUV422, YUV420
    }

    public enum Overlap {
        AUTO, NONE, ONE, TWO
    }
    private float alphaQuality = 1.0f;
    private Chroma chroma = Chroma.YUV444;
    private Overlap overlap = Overlap.AUTO;

    public JxrImageWriteParam() {
        this(null);
    }

    public JxrImageWriteParam(Locale locale) {
        super(locale);
        canWriteCompressed = true;
        compressionTypes = new String[]{"JPEG XR"};
        compressionMode = MODE_EXPLICIT;
        compressionType = compressionTypes[0];
        compressionQuality = 1.0f;
    }

    public float getAlphaQuality() {
        return alphaQuality;
    }

    public void setAlphaQuality(float quality) {
        if (Float.isNaN(quality) || quality < 0 || quality > 1) {
            throw new IllegalArgumentException("Alpha quality must be in [0, 1]");
        }
        alphaQuality = quality;
    }

    @Override
    public void setCompressionQuality(float quality) {
        if (Float.isNaN(quality)) {
            throw new IllegalArgumentException("Quality is NaN");
        }
        super.setCompressionQuality(quality);
    }

    public Chroma getChroma() {
        return chroma;
    }

    public void setChroma(Chroma chroma) {
        if (chroma == null) {
            throw new IllegalArgumentException("Chroma is null");
        }
        this.chroma = chroma;
    }

    public Overlap getOverlap() {
        return overlap;
    }

    @Override
    public boolean isCompressionLossless() {
        if (compressionMode != MODE_EXPLICIT) {
            throw new IllegalStateException("Compression mode must be explicit");
        }
        return compressionQuality == 1f && alphaQuality == 1f && chroma == Chroma.YUV444;
    }

    public void setOverlap(Overlap overlap) {
        if (overlap == null) {
            throw new IllegalArgumentException("Overlap is null");
        }
        this.overlap = overlap;
    }
}
