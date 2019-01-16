package com.company.Hoofdstuk2;//Voorbeeld 2.2

import java.applet.Applet;
import java.awt.*;

public class Opdracht21 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Sami Jamal", 50, 60 );
    }
}