import java.awt.*;
import java.applet.*;


public class opdracht112 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 10;
        int y = 0;
        int eind = 5;


        while(teller < 21) {
            y += 20;

            g.drawString("" + teller, 100, y );
            teller++;

        }
    }
}