package com.song.kkb;

import java.io.*;
import java.util.stream.Stream;

class IOTest {
    public static void main(String[] args) throws IOException {
//        write();
//        write();
//        read();
        Stream<String> stream= Stream.of("IIIIII", "love", "you", "too");
        stream.sorted((str1, str2) -> str1.length()-str2.length())
                .forEach(str -> System.out.println(str));
    }

    public static void write() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new FileOutputStream("d:\\file.txt", true));
        pw.println("你好");
        pw.close();
    }

    public static void read() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:\\file.txt"));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}