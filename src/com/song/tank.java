package com.song;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class tank extends Frame {
    int x = 200;
    int y = 200;

    public tank() {
        this.setSize(800, 600);
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

    @Override
    public void paint(Graphics g) {
        g.fillRect(x,y,20,20);
//        x+=10;
//        y+=10;
    }
    class MyKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            x+=10;
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

}
