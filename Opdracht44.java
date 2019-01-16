package com.company.Hoofdstuk4;//Voorbeeld 4.1

import java.applet.Applet;
import java.awt.*;

public class Opdracht44 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(110, 15, 110,    88);
        g.drawString("0", 99, 90 );
        g.drawString("20", 95, 80 );
        g.drawString("40", 95, 70 );
        g.drawString("60", 95, 60 );
        g.drawString("80", 95, 50 );
        g.drawString("100", 90, 40 );






        g.drawRect(135, 62, 10, 24);
        g.fillRect(135, 62, 10, 24);
        g.setColor(Color.black);
        g.drawString("Valerie", 115, 110 );


        g.setColor(Color.blue);
        g.drawRect(165, 40, 10, 47);
        g.fillRect(165, 40, 10, 47);
        g.drawString("Hans", 155, 110 );
        g.setColor(Color.green);
        g.drawRect(195, 30, 10, 57);
        g.fillRect(195, 30, 10, 57);
        g.drawString("Jeroen", 185, 110 );
        g.setColor(Color.black);
        g.drawLine(150, 60, 150,    60);



    }
}