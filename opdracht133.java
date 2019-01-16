package com.company.Hoofdstuk13;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdracht133 extends Applet {
    Button knop1;
    Button knop2;

    public void init() {
        knop1 = new Button("Rood");
        knop2 = new Button("Grijs");
        knop1.addActionListener(new Knop1Listerner());
        knop2.addActionListener(new Knop2Listerner());
        add(knop1);
        add(knop2);

    }

    public void paint(Graphics g) {


    }

    class Knop1Listerner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Graphics g = getGraphics();
            setSize(500, 300);
            int pattern = 0;
            g.setColor(Color.red);
            for (int y = 0; y < 300; y += 24) {
                for (int x = 0; x < 500; x += 74) {

                    if (pattern == 0) g.fillRect(x, y, 70, 20);
                    else g.fillRect(x, y, 70, 20);


                    if (pattern == 0) g.fillRect(x, y, 70, 20);
                    else g.fillRect(x-6, y, 70, 20);

                }
                if (pattern == 0) pattern = 1;
                else pattern = 0;


            }
        }
    }

    class Knop2Listerner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
         Graphics g = getGraphics();
            setSize(600, 400);
            int pattern=0;
            g.setColor(Color.gray);
            for(int y=0;y<400;y+=24)
            {
                for (int x=0;x<500;x+=74)
                {

                    if (pattern==0)  g.fillRect(x, y, 70, 20);
                    else g.fillRect(x, y, 70, 20);


                    if (pattern==0) g.fillRect(x, y, 70, 20);
                    else g.fillRect(x-8, y, 70, 20);

                }
                if (pattern==0)pattern=1;
                else pattern=0;



        }
    }


}
}

