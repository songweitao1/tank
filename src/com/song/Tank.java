package com.song;

import java.awt.*;

public class Tank {
    private int x, y;
    private static final int SPEED = 10;
    private EmunDir dir;
    private TankFrame tf;
    private boolean moving = false;

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }

    public Tank(int x, int y, EmunDir dir,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
    }

    public EmunDir getDir() {
        return dir;
    }

    public void setDir(EmunDir dir) {
        this.dir = dir;
    }

    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 40, 40);
        g.setColor(c);
        move();
    }
    private void move() {
        if (!moving) return;
        switch (dir) {
            case LEFT:
                x -= SPEED;
                break;
            case RIGHT:
                x += SPEED;
                break;
            case UP:
                y -= SPEED;
                break;
            case DOWN:
                y += SPEED;
                break;
            default:
                break;
        }

    }

    public void fire() {
        tf.bullents.add(new Bullent(this.x,this.y,this.dir,tf));

    }
}
