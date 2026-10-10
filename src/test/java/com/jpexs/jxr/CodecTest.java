package com.jpexs.jxr;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import javax.imageio.*;
import javax.imageio.stream.*;

/** Integration checks executed against the packaged JAR, without native libraries. */
public final class CodecTest {
    private static int checks;
    private static void check(boolean value,String message) { checks++;if(!value)throw new AssertionError(message); }
    private static BufferedImage fixture(int type,int w,int h) {
        BufferedImage image=new BufferedImage(w,h,type);
        Random r=new Random(1223);
        for(int y=0;y<h;y++)for(int x=0;x<w;x++) {
            if(type==BufferedImage.TYPE_BYTE_GRAY) image.getRaster().setSample(x,y,0,r.nextInt(256));
            else if(type==BufferedImage.TYPE_BYTE_BINARY) image.getRaster().setSample(x,y,0,(x+y)%2);
            else image.setRGB(x,y,(type==BufferedImage.TYPE_INT_ARGB?r.nextInt(256):255)<<24|r.nextInt(0x1000000));
        }
        return image;
    }
    private static byte[] encode(BufferedImage image,JxrImageWriteParam param)throws IOException {
        ByteArrayOutputStream bytes=new ByteArrayOutputStream();
        ImageWriter writer=ImageIO.getImageWritersByFormatName("jxr").next();
        try(ImageOutputStream stream=new MemoryCacheImageOutputStream(bytes)) {
            writer.setOutput(stream);writer.write(null,new IIOImage(image,null,null),param);
        }finally{writer.dispose();}
        return bytes.toByteArray();
    }
    private static void equal(BufferedImage a,BufferedImage b) {
        check(a.getWidth()==b.getWidth()&&a.getHeight()==b.getHeight(),"Dimensions");
        for(int y=0;y<a.getHeight();y++)for(int x=0;x<a.getWidth();x++)check(a.getRGB(x,y)==b.getRGB(x,y),"Pixel "+x+","+y+": "+Integer.toHexString(a.getRGB(x,y))+" != "+Integer.toHexString(b.getRGB(x,y)));
    }
    public static void main(String[] args)throws Exception {
        check(ImageIO.getImageReadersByFormatName("jxr").hasNext(),"Reader registration");
        check(ImageIO.getImageWritersByFormatName("jxr").hasNext(),"Writer registration");
        Path artifacts=Paths.get("target/test-output");Files.createDirectories(artifacts);
        for(int type:new int[]{BufferedImage.TYPE_INT_RGB,BufferedImage.TYPE_INT_ARGB,BufferedImage.TYPE_BYTE_GRAY,BufferedImage.TYPE_BYTE_BINARY}) {
            BufferedImage src=fixture(type,19,17);byte[] encoded=encode(src,new JxrImageWriteParam());
            check(encoded[0]==0x49&&encoded[1]==0x49&&(encoded[2]&255)==0xbc&&encoded[3]==1,"JXR signature");
            Files.write(artifacts.resolve("type-"+type+".jxr"),encoded);ImageIO.write(src,"png",artifacts.resolve("type-"+type+".png").toFile());
            equal(src,ImageIO.read(new ByteArrayInputStream(encoded)));
            System.out.println("Lossless type "+type+": "+encoded.length+" bytes OK");
        }
        for(int[] size:new int[][]{{1,1},{16,16},{32,48},{3,2}}) {
            BufferedImage src=fixture(BufferedImage.TYPE_INT_ARGB,size[0],size[1]);equal(src,ImageIO.read(new ByteArrayInputStream(encode(src,new JxrImageWriteParam()))));
        }
        BufferedImage src=fixture(BufferedImage.TYPE_INT_RGB,65,49);
        for(JxrImageWriteParam.Chroma chroma:JxrImageWriteParam.Chroma.values()) {
            JxrImageWriteParam param=new JxrImageWriteParam();param.setCompressionQuality(.8f);param.setChroma(chroma);
            BufferedImage decoded=ImageIO.read(new ByteArrayInputStream(encode(src,param)));check(decoded.getWidth()==65&&decoded.getHeight()==49,"Lossy dimensions");
        }
        byte[] encoded=encode(src,new JxrImageWriteParam());
        for(int orientation=0;orientation<8;orientation++) {
            byte[] oriented=encoded.clone();java.nio.ByteBuffer header=java.nio.ByteBuffer.wrap(oriented).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            int ifd=header.getInt(4),count=header.getShort(ifd)&65535;
            for(int n=0;n<count;n++){int at=ifd+2+12*n;if((header.getShort(at)&65535)==0xbc02)header.putInt(at+8,orientation);}
            BufferedImage rotated=ImageIO.read(new ByteArrayInputStream(oriented));
            int ow=(orientation&4)!=0?src.getHeight():src.getWidth(),oh=(orientation&4)!=0?src.getWidth():src.getHeight();
            check(rotated.getWidth()==ow&&rotated.getHeight()==oh,"Oriented dimensions");
            for(int y=0;y<src.getHeight();y++)for(int x=0;x<src.getWidth();x++){
                int dx=(orientation&4)!=0?src.getHeight()-1-y:x,dy=(orientation&4)!=0?x:y;
                if((orientation&2)!=0)dx=ow-1-dx;if((orientation&1)!=0)dy=oh-1-dy;
                check(src.getRGB(x,y)==rotated.getRGB(dx,dy),"Orientation "+orientation);
            }
        }
        ImageReader reader=ImageIO.getImageReadersByFormatName("jxr").next();
        try(ImageInputStream stream=new MemoryCacheImageInputStream(new ByteArrayInputStream(encoded))) {
            long p=stream.getStreamPosition();check(new JxrImageReaderSpi().canDecodeInput(stream),"Signature detection");check(stream.getStreamPosition()==p,"Detection preserves position");
            reader.setInput(stream);check(reader.getWidth(0)==65&&reader.getHeight(0)==49,"Header dimensions");
            ImageReadParam rp=reader.getDefaultReadParam();rp.setSourceRegion(new Rectangle(3,4,17,15));rp.setSourceSubsampling(2,3,0,0);
            BufferedImage crop=reader.read(0,rp);check(crop.getWidth()==9&&crop.getHeight()==5,"Read crop/subsampling");
            for(int y=0;y<5;y++)for(int x=0;x<9;x++)check(crop.getRGB(x,y)==src.getRGB(3+x*2,4+y*3),"Cropped pixel");
        }finally{reader.dispose();}
        JxrImageWriteParam wp=new JxrImageWriteParam();wp.setSourceRegion(new Rectangle(3,4,17,15));wp.setSourceSubsampling(2,3,0,0);
        BufferedImage cropped=ImageIO.read(new ByteArrayInputStream(encode(src,wp)));check(cropped.getWidth()==9&&cropped.getHeight()==5,"Write crop");
        for(int y=0;y<5;y++)for(int x=0;x<9;x++)check(cropped.getRGB(x,y)==src.getRGB(3+x*2,4+y*3),"Write cropped pixel");
        for(int length:new int[]{0,3,8,encoded.length/2,encoded.length-10}) {
            try { com.jpexs.jxr.internal.PureCodec.decode(Arrays.copyOf(encoded,length));throw new AssertionError("Accepted truncated file "+length); }
            catch(IOException expected){checks++;}
        }
        try{wp.setCompressionQuality(Float.NaN);throw new AssertionError("NaN quality");}catch(IllegalArgumentException expected){checks++;}
        File unicode=artifacts.resolve("žluťoučký obrázek.jxr").toFile();Jxr.write(src,unicode);equal(src,Jxr.read(unicode));
        System.out.println("PASS: "+checks+" checks; Java "+System.getProperty("java.version")+"; pure Java codec");
    }
}
