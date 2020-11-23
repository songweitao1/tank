package com.song.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int a[] = {2,3,5,1,6,3,11,10,22,21,28,24,2,2,2,7,5};
        CompareAble[] c = {new Cat(1,2),new Cat(3,3),new Cat(5,5),new Cat(2,2)};
        Sorter sorter = new Sorter();
        sorter.sort(c);
        System.out.println(Arrays.toString(c));
    }
}
