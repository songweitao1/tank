package com.song.strategy;

public class Cat implements CompareAble {
    int weigth;
    int heigth;

    public Cat(int weigth, int heigth) {
        this.weigth = weigth;
        this.heigth = heigth;
    }

    @Override
    public int compareTo(Object o) {
        Cat cat = (Cat)o;
        if(this.weigth < cat.weigth && this.heigth < cat.heigth) return -1;
        if(this.weigth > cat.weigth && this.heigth > cat.weigth) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weigth=" + weigth +
                ", heigth=" + heigth +
                '}';
    }
}
