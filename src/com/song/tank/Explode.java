package com.song.tank;

import com.song.abstracatfactory.BaseExplode;

import java.awt.*;

public class Explode extends BaseExplode {
    private int x,y;
    public static int exloWith = Main.SourceImages.explodes[0].getWidth();
    public static int expHeigh = Main.SourceImages.explodes[0].getHeight();
    private boolean live=true;
    TankFrame tf = null;
    private int step = 0;
    public Explode(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;
    }

    public void paint(Graphics g) {
        g.drawImage(Main.SourceImages.explodes[step++],x,y,null);
        if(step >= Main.SourceImages.explodes.length) tf.explodes.remove(this);

        }

}
