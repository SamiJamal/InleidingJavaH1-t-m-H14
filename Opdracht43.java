package com.company.Hoofdstuk4;//Voorbeeld 4.1

import java.applet.Applet;
import java.awt.*;

public class Opdracht43 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.drawRect(165, 30, 150, 100);
        g.setColor(Color.red);
        g.fillRect(165, 30, 150, 33);
        g.setColor(Color.blue);
        g.fillRect(165, 98, 150,    33);
        g.setColor(Color.black);
        g.drawRect(165, 40, 10, 47);
        g.fillRect(165, 40, 10, 47);
        g.drawRect(165, 30, 10, 275);
        g.fillRect(165, 30, 10, 275);



    }
}








