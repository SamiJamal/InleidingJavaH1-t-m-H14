//Voorbeeld 6.3

import java.awt.*;
import java.applet.*;


public class Opdracht63 extends Applet {
    int GrootGetal;
    int KleinGetal;
    int Max;


    public void init() {
        GrootGetal = 2147483000;
        KleinGetal = 4000;
        Max = 2147483647 ;
    }

    public void paint(Graphics g) {
        g.drawString("Negatief: : " + (GrootGetal + KleinGetal), 20, 20);
        g.drawString("Max: : " + (Max), 20, 40);
    }
}