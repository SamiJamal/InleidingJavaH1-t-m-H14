
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Opdracht51 extends Applet {

    int hoogte;
    int breedte;

    public void init() {

        hoogte = 50;
        breedte = 80;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(20, 20, breedte, hoogte);
        g.setColor(Color.black);
        g.drawString("Lijn", 210, 169 );
        g.drawLine(170,  150, 290,    150);
        g.drawString("Rechthoek", 50, 90 );
        g.setColor(Color.magenta);
        g.drawRect(140, 50, breedte, hoogte);
        g.fillRect(140, 50, breedte, hoogte);
        g.setColor(Color.black);
        g.drawString("gevulde rechthoek met ovaal", 120, 110 );
        g.setColor(Color.black);
        g.drawOval(140, 50, breedte, hoogte);
        g.drawString("Cirkel", 50, 220 );
        g.drawOval(140, 200, breedte, hoogte);
        g.setColor(Color.magenta);
        g.fillOval(141, 201,    breedte, hoogte);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 140, 270 );
        g.setColor(Color.black);
        g.drawString("afgeronde rechthoek", 230, 300 );
        g.drawOval(40, 150,    breedte, hoogte);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 100, 369 );
        g.drawRect(20, 250, breedte, hoogte);
        g.drawArc(100, 300, breedte, hoogte, 90, 45);
        g.fillArc(100,   300,    breedte,    hoogte, 90, 45);

        g.drawOval(100, 300,    breedte, hoogte);
        g.drawRoundRect(240, 240, breedte, hoogte, breedte, hoogte);





    }
}




