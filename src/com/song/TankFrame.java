package com.song;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

public class TankFrame extends Frame {
    EmunDir dir;
    Bullent bullent = new Bullent(20,20,EmunDir.DOWN,this);
    public Tank myTank = new Tank(200, 200, EmunDir.DOWN,this);
   List<Bullent> bullents = new ArrayList<>();
    static final  int width=800,height = 600;
    public TankFrame() {
        this.setSize(width,height);
        this.setResizable(false);
        this.setTitle("Tank War");
        this.setVisible(true);
        this.addKeyListener(new MyKeyListener());
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
    private Image offScreenImage = null;
    public void update(Graphics g) {
        if(offScreenImage == null) {
            offScreenImage = this.createImage(width, height);//这是游戏窗口的宽度和高度
        }
        Graphics gOff = offScreenImage.getGraphics();
        Color c = g.getColor();
        gOff.setColor(Color.BLACK);
        gOff.fillRect(0,0,width,height);
        gOff.setColor(c);
        paint(gOff);
        g.drawImage(offScreenImage, 0, 0, null);
    }
    @Override
    public void paint(Graphics g) {
        Color color = g.getColor();
        g.setColor(Color.WHITE);
        g.drawString("打出了"+ bullents.size()+"子弹",20,60);
        g.setColor(color);
        myTank.paint(g);
        for (int i = 0;i<bullents.size();i++) {
            bullents.get(i).paint(g);

        }
    }
    class MyKeyListener extends KeyAdapter {
        boolean bL = false;
        boolean bR = false;
        boolean bU = false;
        boolean bD = false;

        @Override
        public void keyPressed(KeyEvent e) {
            myTank.setMoving(true);
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = true;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = true;
                    break;
                case KeyEvent.VK_UP:
                    bU = true;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = true;
                    break;

                default:
                    break;
            }
            TankMainSetDir();

        }
        @Override
        public void keyReleased(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode) {
                case KeyEvent.VK_LEFT:
                    bL = false;
                    break;
                case KeyEvent.VK_RIGHT:
                    bR = false;
                    break;
                case KeyEvent.VK_UP:
                    bU = false;
                    break;
                case KeyEvent.VK_DOWN:
                    bD = false;
                    break;
                case KeyEvent.VK_CONTROL:
                    myTank.fire();
                    break;
                default:
                    break;
            }
            TankMainSetDir();
        }
        private void TankMainSetDir() {
            if (!bL && !bR && !bU && !bD) myTank.setMoving(false);
            else {
                myTank.setMoving(true);
                if (bL) myTank.setDir(dir.LEFT);
                if (bR) myTank.setDir(dir.RIGHT);
                if (bU) myTank.setDir(dir.UP);
                if (bD) myTank.setDir(dir.DOWN);
            }

        }

    }

}


