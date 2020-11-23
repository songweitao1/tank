package com.song.abstracatfactory;

import com.song.tank.EmunDir;
import com.song.tank.Group;
import com.song.tank.Tank;
import com.song.tank.TankFrame;

public abstract class GameFactory {
    public abstract Tank createTank(int x, int y, EmunDir dir, Group group, TankFrame tf);
    public abstract BaseExplode createExplode(int x, int y, TankFrame tankFrame);
    public abstract BaseBullent createBullent(int x, int y, EmunDir dir, Group group, TankFrame tf);
    public abstract RectExplode createRectExplode(int x, int y, TankFrame tankFrame);
}
