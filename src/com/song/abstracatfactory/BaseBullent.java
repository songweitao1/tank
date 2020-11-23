package com.song.abstracatfactory;

import com.song.tank.Tank;

import java.awt.*;

public abstract class BaseBullent {
//    public Rectangle rect;
    public abstract void paint(Graphics g);
    public abstract void clloneWith(Tank tank);
}
