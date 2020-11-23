package com.song.tank;

import com.song.abstracatfactory.BaseTank;

import java.awt.*;
import java.util.Random;

public class Tank extends BaseTank {
    private  int x;
    private  int y;
    private boolean liveing = true;
    public static int tankWith = Main.SourceImages.goodtankU.getWidth();
    public static int tankHeigth = Main.SourceImages.goodtankU.getHeight();
    private static final int SPEED = 10;
    private EmunDir dir;
    TankFrame tf = null;
    private boolean moving = true;
    private Random random = new Random();
    Group group;
    Bullent bullent;
    public Rectangle rect = new Rectangle();
    FireStrategy fs;

    public Tank(int x, int y, EmunDir dir, Group group, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
        this.group = group;
        rect.x = x;
        rect.y = y;
        rect.width = tankWith;
        rect.height = tankHeigth;
    }

    public  int getX() {
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

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }


    public EmunDir getDir() {
        return dir;
    }

    public void setDir(EmunDir dir) {
        this.dir = dir;
    }
    @Override
    public void paint(Graphics g) {
        if (!liveing) {
            tf.tanks.remove(this);
        }
        switch (dir) {
            case UP:
                g.drawImage(this.group == Group.GOOD ? Main.SourceImages.goodtankU : Main.SourceImages.badtankU, this.x, this.y, null);
                break;
            case DOWN:
                g.drawImage(this.group == Group.GOOD ? Main.SourceImages.goodtankD : Main.SourceImages.badtankD, this.x, this.y, null);
                break;
            case LEFT:
                g.drawImage(this.group == Group.GOOD ? Main.SourceImages.goodtankL : Main.SourceImages.badtankL, this.x, this.y, null);
                break;
            case RIGHT:
                g.drawImage(this.group == Group.GOOD ? Main.SourceImages.goodtankR : Main.SourceImages.badtankR, this.x, this.y, null);
                break;
        }
        move();
        setDir();
    }

    private void setDir() {
        if (this.group == group.BAD && random.nextInt(100) > 95) {
            dir = EmunDir.values()[random.nextInt(4)];
        }
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
        bondCheck();
        if (this.group == group.BAD && random.nextInt(100)>90)
            this.fire();

        if(this.group == Group.BAD && random.nextInt(100) > 95)
            setDir();
    }
    public void fire() {
        if(this.group == Group.BAD) fs = new DefualtFire();
        else fs = new FourFireStrategy();
        fs.fire(this);
    }

    private void bondCheck() {
        if (this.x < 2) x = 2;
        if (this.y > TankFrame.height - Tank.tankHeigth) y = TankFrame.height - Tank.tankHeigth;
        if (this.x > TankFrame.width - Tank.tankWith) x = TankFrame.width - Tank.tankWith;
        if (this.y < Tank.tankHeigth) y = Tank.tankHeigth;
        rect.x = x;
        rect.y = y;
    }


    public void die() {
        this.liveing = false;
//        System.out.println(liveing);
    }
}
