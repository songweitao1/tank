package com.song.abstracatfactory;





import com.song.tank.Main;
import com.song.tank.TankFrame;

import java.awt.*;

public class RectExplode extends BaseExplode{
    private int x,y;
    public static int exloWith = Main.SourceImages.explodes[0].getWidth();
    public static int expHeigh = Main.SourceImages.explodes[0].getHeight();
    private boolean live=true;
    TankFrame tf = null;
    private int step = 0;
    public RectExplode(int x, int y, TankFrame tf) {
        this.x = x;
        this.y = y;
        this.tf = tf;
    }

    public void paint(Graphics g) {
        Color color = g.getColor();
        g.setColor(Color.RED);
        g.fillRect(x,y,10*step,10*step);
        step++;
        if(step >= 5) tf.explodes.remove(this);
        g.setColor(color);
    }
}
