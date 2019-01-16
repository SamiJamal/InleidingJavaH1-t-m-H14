package com.company.Hoofdstuk12;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class opdracht123 extends Applet
{
    TextField tekstvak1, tekstvak2,tekstvak3, tekstvak4, tekstvak5;
    int getal1,getal2,getal3,getal4,getal5;
    int waarde;
    int x;


    public void init()
    {
        tekstvak1 = new TextField(10);
        tekstvak2 = new TextField(10);
        tekstvak3 = new TextField(10);
        tekstvak4 = new TextField(10);
        tekstvak5 = new TextField(10);
        tekstvak5.addActionListener(new invoervak3Handler());

        add(tekstvak1);add(tekstvak2);add(tekstvak3);add(tekstvak4);add(tekstvak5);
    }


    public void paint( Graphics g)
    {
        g.drawString(" " + getal1 + "  " + getal2 + "  " + getal3 + "  " + getal4 +  "  " + getal5, 60,90 );
    }

    class invoervak3Handler implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String invoerstring=tekstvak1.getText();
            getal1 = Integer.parseInt(invoerstring);
            String invoerstring2=tekstvak2.getText();
            getal2 = Integer.parseInt(invoerstring2);
            String invoerstring3=tekstvak3.getText();
            getal3 = Integer.parseInt(invoerstring3);
            String invoerstring4=tekstvak4.getText();
            getal4 = Integer.parseInt(invoerstring4);
            String invoerstring5=tekstvak5.getText();
            getal5 = Integer.parseInt(invoerstring5);



            int[] array = {getal1,getal2,getal3,getal4,getal5};

            for(int i=0;i<array.length-1;i++) {

                for(x = 0;x<=array.length-2;x++)
                {
                    if(array[x] > array[x+1]){
                        waarde = array[x];
                        array[x] = array[x+1];
                        array[x+1] = waarde;
                        x=0;
                    }
                }

            }

            getal1 = array[0];
            getal2 = array[1];
            getal3 = array[2];
            getal4 = array[3];
            getal5 = array[4];

            repaint();
        }
    }
}