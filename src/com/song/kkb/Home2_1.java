package com.song.kkb;
import java.io.*;
public class Home2_1 {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Home2_1.class.getClassLoader().getResourceAsStream("com\\song\\kkb\\images\\tupian.jpg");
        BufferedInputStream bs = new BufferedInputStream(resourceAsStream);
        BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(
                "src\\com\\song\\kkb\\images\\tupian2.jpg"));
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bs.read(bytes)) !=-1){
                bo.write(bytes,0,len);
        }
        bs.close();
        bo.flush();
        bo.close();
    }

}
