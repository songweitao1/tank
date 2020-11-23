package com.song.kkb;
import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;
import java.io.*;
import java.util.ArrayList;
public class HomeIO  {
    public static void main(String[] args) throws IOException {
//        InputStream resourceAsStream = HomeIO.class.getClassLoader().getResourceAsStream("tangshi");
//        BufferedInputStream bi = new BufferedInputStream(resourceAsStream);

        StringBuffer stringBuffer = new StringBuffer();
        BufferedInputStream bi = new BufferedInputStream(new FileInputStream("D:\\tangshi.txt"));

        byte[] size = new byte[1024];
        int len = 0;
        while((len = bi.read(size)) !=-1){
           stringBuffer.append(new String(size, 0, len, "utf-8"));
        }
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("D:\\tangshi.txt"));
        String string = stringBuffer.reverse().toString();
        System.out.println(string);
        bo.write(string.getBytes("UTF-8"));
        bo.flush();
        }

    }


