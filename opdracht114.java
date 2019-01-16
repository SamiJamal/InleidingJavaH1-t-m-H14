package com.company.Hoofdstuk11;

import java.applet.Applet;
import java.awt.*;

public class opdracht114 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawString("1 x 3 = 3", 50, 50 );
        g.drawString("2 x 3 = 6", 50, 65 );
        g.drawString("3 x 3 = 9", 50, 80 );
        g.drawString("4 x 3 = 12", 50, 95 );
        g.drawString("5 x 3 = 15", 50, 110 );
        g.drawString("6 x 3 = 18", 50, 125 );
        g.drawString("7 x 3 = 21", 50, 140 );
        g.drawString("8 x 3 = 24", 50, 155 );
        g.drawString("9 x 3 = 27", 50, 170 );
        g.drawString("10 x 3 = 30", 50, 185 );
}

}