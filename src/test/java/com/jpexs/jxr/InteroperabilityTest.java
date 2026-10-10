package com.jpexs.jxr;

import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.*;
import java.nio.file.*;
import javax.imageio.ImageIO;

/** Compares outputs produced by the independent C sample applications. */
public final class InteroperabilityTest {
    private static int checks;
    private static void check(boolean value,String message){checks++;if(!value)throw new AssertionError(message);}
    private static void equal(BufferedImage a,BufferedImage b){
        check(a.getWidth()==b.getWidth()&&a.getHeight()==b.getHeight(),"Dimensions");
        for(int y=0;y<a.getHeight();y++)for(int x=0;x<a.getWidth();x++)check(a.getRGB(x,y)==b.getRGB(x,y),"Pixel "+x+","+y);
    }
    public static void main(String[] args)throws Exception{
        Path p=Paths.get("src/test/resources/reference");
        for(String name:new String[]{"rgb","rgba","gray"}){
            int type=name.equals("rgb")?1:name.equals("rgba")?2:10;
            BufferedImage expected=ImageIO.read(p.resolve("type-"+type+".png").toFile());
            byte[] raw=Files.readAllBytes(p.resolve("reference-"+name+".bmp"));ByteBuffer b=ByteBuffer.wrap(raw).order(ByteOrder.LITTLE_ENDIAN);
            int offset=b.getInt(10),w=b.getInt(18),h=b.getInt(22),bits=b.getShort(28),stride=((w*bits+31)/32)*4;
            check(w==expected.getWidth()&&h==expected.getHeight(),"Native dimensions");
            for(int y=0;y<h;y++)for(int x=0;x<w;x++){
                int n=offset+(h-1-y)*stride+x*(bits/8);
                if(bits==8)check((raw[n]&255)==expected.getRaster().getSample(x,y,0),"Native gray sample");
                else{int argb=(bits==32?(raw[n+3]&255):255)<<24|(raw[n+2]&255)<<16|(raw[n+1]&255)<<8|(raw[n]&255);check(argb==expected.getRGB(x,y),"Native "+name+" pixel");}
            }
            equal(expected,Jxr.read(p.resolve("native-"+name+".jxr").toFile()));
        }
        equal(ImageIO.read(p.resolve("type-12.png").toFile()),Jxr.read(p.resolve("native-binary.jxr").toFile()));
        equal(ImageIO.read(p.resolve("native-lossy.bmp").toFile()),Jxr.read(p.resolve("native-lossy.jxr").toFile()));
        equal(ImageIO.read(p.resolve("type-2.png").toFile()),Jxr.read(p.resolve("native-interleaved.jxr").toFile()));
        BufferedImage gray16=Jxr.read(p.resolve("native-gray16.jxr").toFile());
        int width16=19,height16=17;
        check(gray16.getWidth()==width16&&gray16.getHeight()==height16,"16-bit converted dimensions");
        for(int y=0;y<height16;y++)for(int x=0;x<width16;x++)check(gray16.getRaster().getSample(x,y,0)==(((x*1237+y*1456)&65535)>>>8),"16-bit conversion sample "+x+","+y);
        System.out.println("PASS: "+checks+" independent C interoperability checks; Java "+System.getProperty("java.version"));
    }
}
