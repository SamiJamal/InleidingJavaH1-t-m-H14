//Voorbeeld 6.1

import java.awt.*;
import java.applet.*;


public class Opdracht61 extends Applet {
    int gemiddelde;
    int getal1;

    public void init() {
        getal1 = 113;
        gemiddelde = getal1 / 4;


    }

    public void paint(Graphics g) {
        g.drawString("totaal bedrag verdiend "+ getal1,25, 20);
        g.drawString("Jan krijgt: "+gemiddelde,  25, 40);
        g.drawString("Ali krijgt "+gemiddelde,  25, 60);
        g.drawString("Jeannette krijgt "+gemiddelde,  25, 80);
        g.drawString("Sami krijgt "+gemiddelde,  25, 100);

    }
}