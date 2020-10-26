package com.song;

import java.awt.*;

public class Bullent {
    private int x,y;
    private boolean live=true;

    public boolean isLive() {
        return live;
    }

    public void setLive(boolean live) {
        this.live = live;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    private final int SPEED = 4;
    private EmunDir dir;
    TankFrame tf = null;

    public Bullent(int x, int y,EmunDir dir,TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;

    }

    public void paint(Graphics g) {
        if(!live){
            tf.bullents.remove(this);
        }
        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 20, 20);
        g.setColor(c);
        move();
    }
    private void move() {
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
        if(x<0||x>tf.getWidth()||y<0||y>tf.getHeight()){
            live=false;
        }
    }

}
