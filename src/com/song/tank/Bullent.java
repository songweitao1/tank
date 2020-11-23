package com.song.tank;

import com.song.abstracatfactory.BaseBullent;
import com.song.abstracatfactory.BaseTank;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;

import java.awt.*;

public class Bullent extends BaseBullent {
    int x,y;
    public static int bullentHeight = Main.SourceImages.bullentU.getHeight();
    public static int bullentwith = Main.SourceImages.bullentU.getWidth();
    Group group;
    boolean live=true;
    private final int SPEED = 20;
    EmunDir dir;
    TankFrame tf;
    Rectangle rect = new Rectangle();

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
    public Bullent(int x, int y, EmunDir dir, Group group, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.tf = tf;
        this.group = group;
        rect.x = x;
        rect.y = y;
        rect.width = bullentwith;
        rect.height = bullentHeight;
        tf.bullents.add(this);
    }
    @Override
    public void paint(Graphics g) {
        if(!live){
            tf.bullents.remove(this);
        }
        switch (dir){
            case UP:
                g.drawImage(Main.SourceImages.bullentU,this.x,this.y,null);
                break;
            case DOWN:
                g.drawImage(Main.SourceImages.bullentD,this.x,this.y,null);
                break;
            case LEFT:
                g.drawImage(Main.SourceImages.bullentL,this.x,this.y,null);
                break;
            case RIGHT:
                g.drawImage(Main.SourceImages.bullentR,this.x,this.y,null);
                break;
        }
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
        rect.x = x;
        rect.y = y;
        if(x<0||x>tf.getWidth()||y<0||y>tf.getHeight()){
            live=false;
        }

    }
    @Override
    public void clloneWith(Tank tank) {
        if(this.group == tank.getGroup()) return;
//        Rectangle reg2 = new Retangle(tank.getX(),tank.getY(),tank.tankWith,tank.tankHeigth);
//        Rectangle reg1 = new Rectangle(this.x,this.y,bullentwith,bullentHeight);

//        System.out.println("子弹" + reg1);
//        System.out.println("坦克" + reg2);
        if(this.rect.intersects(tank.rect)){
            tank.die();
            this.die();
            int eX = this.x + tank.tankWith/2 - Explode.exloWith/2;
            int eY = this.y + tank.tankHeigth/2 - Explode.expHeigh/2;
            tf.explodes.add(Main.gf.createRectExplode(eX,eY,tf));
        }
    }

    public void die() {
        this.live = false;
    }
}
