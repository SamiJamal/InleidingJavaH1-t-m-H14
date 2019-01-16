package com.company.Hoofdstuk4;//Voorbeeld 4.1

import java.applet.Applet;
import java.awt.*;

public class Opdracht41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(150,  50, 275,    200);
        g.drawLine(275,  50, 150,    200);
        g.drawLine(275,  200, 150,    200);
        g.setColor(Color.blue);




    }
}