package com.song;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        tank t = new tank();
        while (true) {
            Thread.sleep(50);
            t.repaint();
        }
    }
}
