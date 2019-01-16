package com.company.Hoofdstuk4;//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Opdracht46 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.setColor(Color.black);
        g.drawRect(165, 40, 10, 47);
        g.fillRect(165, 40, 10, 47);
        g.drawRect(165, 30, 10, 275);
        g.fillRect(165, 30, 10, 275);
        g.drawRect(145, 30, 50, 150);
        g.fillRect(145, 30, 50, 150);
        g.drawOval(145, 30, 50,50);
        g.setColor(Color.red);
        g.fillOval(145, 30, 50, 50);
        g.setColor(Color.orange);
        g.drawOval(145, 80, 50,50);
        g.fillOval(145, 80, 50, 50);
        g.setColor(Color.green);
        g.drawOval(145, 130,50, 50);
        g.fillOval(145, 130,    50, 50);



    }
}


