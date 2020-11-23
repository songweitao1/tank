package com.song.abstracatfactory;


import com.song.tank.*;

public class DefaultFactoryImpl extends GameFactory {
    @Override
    public Tank createTank(int x, int y, EmunDir dir, Group group, TankFrame tf) {
        return new Tank(x,y,dir,group,tf);
    }

    @Override
    public BaseExplode createExplode(int x, int y, TankFrame tankFrame) {
        return new Explode(x,y,tankFrame);
    }

    @Override
    public BaseBullent createBullent(int x, int y, EmunDir dir, Group group, TankFrame tf) {
        return new Bullent(x,y,dir,group,tf);
    }

    @Override
    public RectExplode createRectExplode(int x, int y, TankFrame tankFrame) {
        return new RectExplode(x,y,tankFrame);
    }

}
