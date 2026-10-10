package com.jpexs.jxr;

import java.util.Locale;
import javax.imageio.*;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.ImageOutputStream;

public final class JxrImageWriterSpi extends ImageWriterSpi {

    public JxrImageWriterSpi() {
        super("jjxr", "1.0", new String[]{"JXR", "jxr", "JPEG XR"},
                new String[]{"jxr"}, new String[]{"image/jxr"},
                JxrImageWriter.class.getName(), new Class<?>[]{ImageOutputStream.class},
                new String[]{JxrImageReaderSpi.class.getName()},
                false, null, null, null, null, false, null, null, null, null);
    }

    @Override
    public boolean canEncodeImage(ImageTypeSpecifier type) {
        return type != null && type.getColorModel().getNumColorComponents() >= 1
                && type.getColorModel().getNumColorComponents() <= 4;
    }

    @Override
    public ImageWriter createWriterInstance(Object extension) {
        return new JxrImageWriter(this);
    }

    @Override
    public String getDescription(Locale locale) {
        return "JPEG XR (jxrlib)";
    }
}
