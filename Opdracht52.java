//Voorbeeld 4.1

import java.applet.Applet;
import java.awt.*;

public class Opdracht52 extends Applet {

    int hoogte1;
    int y1;

    int hoogte2;
    int y2;

    int hoogte3;
    int y3;

    public void init() {


        hoogte1 = 24;
        y1 = 62;

        hoogte2 = 47;
        y2 = 40;

        hoogte3 = 57;
        y3 = 30;
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






        g.drawRect(135, y1, 10, hoogte1);
        g.fillRect(135, y1, 10, hoogte1);
        g.setColor(Color.black);
        g.drawString("Valerie", 115, 110 );


        g.setColor(Color.blue);
        g.drawRect(165, y2, 10, hoogte2);
        g.fillRect(165, y2, 10, hoogte2);
        g.drawString("Hans", 155, 110 );
        g.setColor(Color.green);
        g.drawRect(195, y3, 10, hoogte3);
        g.fillRect(195, y3, 10, hoogte3);
        g.drawString("Jeroen", 185, 110 );
        g.setColor(Color.black);
        g.drawLine(150, 60, 150,    60);



    }
}