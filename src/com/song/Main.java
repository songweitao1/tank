package com.song;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TankFrame t = new TankFrame();
        while (true) {
            Thread.sleep(50);
            t.repaint();

        }
    }
}
