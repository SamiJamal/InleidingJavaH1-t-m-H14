import java.awt.*;
import java.applet.*;

public class opdracht116 extends Applet {
    int teller;
    int x;
    int y;
    int width;
    int height;

    public void init() {
    }

    public void paint(Graphics g) {
        int x = 300;
        int y = 300;
        int width = 10;
        int height = 10;
        for (int i = 0; i < 5; i++) {
            setBackground(Color.white);
            g.setColor(Color.black);
            g.drawOval(x, y, width, height);
            x -=5;
            y -=5;
            width += 10;
            height += 10;
        }

    }
}