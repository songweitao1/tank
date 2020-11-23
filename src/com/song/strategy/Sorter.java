package com.song.strategy;

public class Sorter {
    public static void sort(CompareAble[] a){
        for (int i = 0; i <a.length -1 ; i++) {
            int maolio = i;
            for (int j = i+1; j <a.length ; j++) {
                maolio = a[j].compareTo(a[maolio]) == -1?j:maolio;

            }
            swap(a,i,maolio);

        }

    }

    private static void swap(CompareAble[] a, int i, int j) {
        CompareAble men = a[i];
        a[i] = a[j];
        a[j] = men;
    }
}
