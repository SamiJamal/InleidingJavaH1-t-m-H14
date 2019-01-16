package com.company.Hoofdstuk14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht141 extends Applet {

    Button speelKaart;
    String[] kaart;
    String[] soortKaart;
    double random;
    double random2;

    int teller;
    int teller2;

    public void init () {

        speelKaart = new Button("Speel kaart.");
        speelKaart.addActionListener(new speelKaartListener());
        add(speelKaart);

        kaart = new String[13];

        for(int i = 0; i < 9; i++) {
            kaart[i] = "" + (i = i + 2);
            i -= 2;
        }

        kaart[9] = "boer";
        kaart[10] = "vrouw";
        kaart[11] = "heer";
        kaart[12] = "aas";

        soortKaart = new String[4];

        soortKaart[0] = "Harten";
        soortKaart[1] = "Ruiten";
        soortKaart[2] = "Klaveren";
        soortKaart[3] = "Schoppen";
    }

    public void paint (Graphics g) {
        g.drawString(soortKaart[teller2] + " " + kaart[teller], 60, 40);

    }
    class speelKaartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            random = (Math.random() * 12 + 0);
            teller = (int) random;

            random2 = (Math.random() * 3 + 0);
            teller2 = (int) random2;

            repaint();


        }
    }


}
