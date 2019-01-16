package com.company.Hoofdstuk4;
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class PraktijkOpdracht1 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20, 20, 100, 50);
        g.setColor(Color.black);
        g.drawString("Lijn", 210, 169 );
        g.drawLine(170,  150, 290,    150);
        g.drawString("Rechthoek", 50, 90 );
        g.setColor(Color.magenta);
        g.drawRect(140, 50, 80, 50);
        g.fillRect(140, 50, 80, 50);
        g.setColor(Color.black);
        g.drawString("gevulde rechthoek met ovaal", 120, 110 );
        g.setColor(Color.black);
        g.drawOval(140, 50, 80, 50);
        g.drawString("Cirkel", 50, 220 );
        g.drawOval(140, 200, 80, 60);
        g.setColor(Color.magenta);
        g.fillOval(141, 201,    79, 59);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 140, 270 );
        g.setColor(Color.black);
        g.drawString("afgeronde rechthoek", 230, 300 );
        g.drawOval(40, 150,    60, 60);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 100, 369 );
        g.drawRect(20, 250, 100, 50);
        g.drawArc(100, 300, 100, 50, 90, 45);
        g.fillArc(100,   300,    100,    50, 90, 45);

        g.drawOval(100, 300,    100, 50);
        g.drawRoundRect(240, 240, 100, 50, 10, 10);





    }
}




