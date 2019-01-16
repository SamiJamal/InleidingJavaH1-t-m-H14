//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class PraktijkOpdrachtH6 extends Applet {
    double gem;


    public void init() {
        gem = (5.9 + 6.3 + 6.9) / 3;
        gem= (int) (gem * 10);
        gem = gem / 10;

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + gem , 20, 20);
    }
}