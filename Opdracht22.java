package com.company.Hoofdstuk2;//Voorbeeld 2.2

import java.applet.Applet;
import java.awt.*;

public class Opdracht22 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Sami", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Jamal", 50, 75 );


    }
}