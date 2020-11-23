package com.song.tank;

import com.song.abstracatfactory.DefaultFactoryImpl;
import com.song.abstracatfactory.GameFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Main {
    static GameFactory gf = new DefaultFactoryImpl();
    public static void main(String[] args) throws InterruptedException {

        System.out.println(1);
        TankFrame t = new TankFrame();
        System.out.println(1);
        for (int i = 0; i <5 ; i++) {
            t.tanks.add(gf.createTank(200+i*200,400, EmunDir.DOWN, Group.BAD,t));
        }
        while (true) {
            Thread.sleep(50);
            t.repaint();
        }

    }

    public static class SourceImages {
        public static BufferedImage goodtankD,goodtankU,goodtankL,goodtankR;
        public static  BufferedImage badtankD,badtankU,badtankL,badtankR;
        public static BufferedImage bullentD,bullentU,bullentL,bullentR;
        public static BufferedImage[] explodes =new BufferedImage[16];
        static {
            try {
                badtankU = ImageIO.read(SourceImages.class.getClassLoader().getResourceAsStream("images/BadTank1.png"));
                badtankL = ImageUtil.rotateImage(badtankU, -90);
                badtankR = ImageUtil.rotateImage(badtankU, 90);
                badtankD = ImageUtil.rotateImage(badtankU, 180);
                goodtankU = ImageIO.read(SourceImages.class.getClassLoader().getResourceAsStream("images/GoodTank1.png"));
                goodtankL = ImageUtil.rotateImage(goodtankU, -90);
                goodtankR = ImageUtil.rotateImage(goodtankU, 90);
                goodtankD = ImageUtil.rotateImage(goodtankU, 180);
                bullentU = ImageIO.read(SourceImages.class.getClassLoader().getResourceAsStream("images/bulletU.png"));
                bullentL = ImageUtil.rotateImage(bullentU, -90);
                bullentR = ImageUtil.rotateImage(bullentU, 90);
                bullentD = ImageUtil.rotateImage(bullentU, 180);
                for (int i = 0; i <16 ; i++) {
                    explodes[i] = ImageIO.read(SourceImages.class.getClassLoader().getResourceAsStream("images/e"+(i+1)+".gif"));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
