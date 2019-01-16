package com.company.Hoofdstuk4;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Opdracht47 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(150, 20, 100, 100);
        g.drawOval(160, 30, 25, 25);
        g.fillOval(160, 30, 25, 25);
        g.drawOval(160, 80, 25, 25);
        g.fillOval(160, 80, 25, 25);
        g.drawOval(210, 30, 25, 25);
        g.fillOval(210, 30, 25, 25);
        g.drawOval(210, 80, 25, 25);
        g.fillOval(210, 80, 25, 25);

    }
}

