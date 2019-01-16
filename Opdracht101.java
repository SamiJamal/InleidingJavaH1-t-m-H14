import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht101 extends Applet {

    int input;
    int hoogsteinput;


    Button knop1;
    TextField tekstvak;


    public void init() {
        knop1 = new Button("Oké");
        tekstvak = new TextField("", 20);
        add(tekstvak);
        knop1.addActionListener(new knop1listener());
        add(knop1);

    }
    public void paint (Graphics g) {

        g.drawString("" + hoogsteinput, 20,20);


    }
    class knop1listener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            input = Integer.parseInt(s);
            if (input > hoogsteinput) {
                hoogsteinput = input;
            }
            repaint();


        }
    }


}



