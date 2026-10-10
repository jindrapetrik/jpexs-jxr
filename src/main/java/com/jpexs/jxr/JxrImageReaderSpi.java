package com.jpexs.jxr;

import java.io.IOException;
import java.util.Locale;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

public final class JxrImageReaderSpi extends ImageReaderSpi {

    public JxrImageReaderSpi() {
        super("jjxr", "1.0", new String[]{"JXR", "jxr", "JPEG XR", "WDP", "HDP"},
                new String[]{"jxr", "wdp", "hdp"}, new String[]{"image/jxr", "image/vnd.ms-photo"},
                JxrImageReader.class.getName(), new Class<?>[]{ImageInputStream.class},
                new String[]{JxrImageWriterSpi.class.getName()},
                false, null, null, null, null, false, null, null, null, null);
    }

    @Override
    public boolean canDecodeInput(Object input) throws IOException {
        if (!(input instanceof ImageInputStream)) {
            return false;
        }
        ImageInputStream in = (ImageInputStream) input;
        long position = in.getStreamPosition();
        try {
            return in.read() == 0x49 && in.read() == 0x49 && in.read() == 0xbc && in.read() == 1;
        } finally {
            in.seek(position);
        }
    }

    @Override
    public ImageReader createReaderInstance(Object extension) {
        return new JxrImageReader(this);
    }

    @Override
    public String getDescription(Locale locale) {
        return "JPEG XR / HD Photo (jxrlib)";
    }
}
