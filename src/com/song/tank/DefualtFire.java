package com.song.tank;

import com.song.abstracatfactory.BaseTank;

public class DefualtFire implements FireStrategy {
    @Override
    public void fire(Tank tank) {
        int bX = tank.getX() + tank.tankWith/2 - Bullent.bullentwith/2;
        int bY = tank.getY() + tank.tankHeigth/2 - Bullent.bullentHeight/2;
         Main.gf.createBullent(bX, bY, tank.getDir(),tank.group,tank.tf);
    }
}
