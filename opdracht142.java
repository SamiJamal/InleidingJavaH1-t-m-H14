package Hoofdstuk14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;



public class opdracht142 extends Applet {

    public void init() {
        super.init();

        Button button1 = new Button("verdeel kaarten");
        button1.addActionListener(new rollCardsFourPlayers());
        add(button1);
    }

    private void roll13Cards(Graphics g, int x, int y) {


        int counter2 = 0;

        String[] cardColor = new String[4];
        cardColor[0] = "Schoppen";
        cardColor[1] = "Klaver";
        cardColor[2] = "Harten";
        cardColor[3] = "Ruiten";

        String[] cardNumber = new String[13];
        cardNumber[0] = "2";
        cardNumber[1] = "3";
        cardNumber[2] = "4";
        cardNumber[3] = "5";
        cardNumber[4] = "6";
        cardNumber[5] = "7";
        cardNumber[6] = "8";
        cardNumber[7] = "9";
        cardNumber[8] = "10";
        cardNumber[9] = "Boer";
        cardNumber[10] = "Vrouw";
        cardNumber[11] = "Heer";
        cardNumber[12] = "Aas";

        Collections.shuffle(Arrays.asList(cardColor));
        Collections.shuffle(Arrays.asList(cardNumber));

        for (int counter = 0; counter < 13; counter++) {
            y += 20;
            if (counter2 == 3) {
                counter2 = 0;
                Collections.shuffle(Arrays.asList(cardColor));
            }
            counter2++;
            g.drawString("" + (cardColor[counter2]) + " " + (cardNumber[counter]), x, y);
        }
    }

    class rollCardsFourPlayers implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            int x = 0;
            Graphics g = getGraphics();
            g.clearRect(0, 0, getWidth(), getHeight());
            g.drawString("speler 1", 150, 30);
            g.drawString("speler 2", 300, 30);
            g.drawString("speler 3", 450, 30);
            g.drawString("speler 4", 600, 30);
            for (int counter = 0; counter < 4; counter++) {
                x += 150;
                roll13Cards(g, x, 90);
            }

        }
    }
}