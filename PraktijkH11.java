
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class PraktijkH11 extends Applet {

    int teller;
    String[]tafel1 = {"1", "2", "3","4"};
    int a;
    int b;
    int c;
    double getal;

    String input;
    String input1;
    double som;
    double uitkomst;
    Label label;

    TextField tekstvak;



    public void init() {

        tekstvak = new TextField("", 10);

        tekstvak.addActionListener( new TekstvakListener() );

        add(tekstvak);

        label = new Label("");
        // add(label);



    }

    public void paint (Graphics g){
        setBackground(Color.white);
        // g.drawString("" + uitkomst , 70, 50);
        g.drawString(a + " x 1 = " + (1 * a), 10, 20);
        g.drawString(a + "x 2 = " + (2 * a), 10, 40);
        g.drawString(a + "x 3 = " + (3 * a), 10, 60);
        g.drawString(a + "x 4 = " + (4 * a), 10, 80);
        g.drawString(a + "x 5 = " + (5 * a), 10, 100);
        g.drawString(a + "x 6 = " + (6 * a), 10, 120);
        g.drawString(a + "x 7 = " + (7 * a), 10, 140);
        g.drawString(a + "x 8 = " + (8 * a), 10, 160);
        g.drawString(a + "x 9 = " + (9 * a), 10, 180);
        g.drawString(a + "x 10 = " + (10 * a), 10, 200);
//        g.drawString("1x2 = 2", 10, 40);
//        g.drawString("1x3 = 3", 10, 60);
//        g.drawString("1x4 = 4", 10, 80);
    }

    void test10 (){}



    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            System.out.println("test");
            input = tekstvak.getText ();
            a = Integer.parseInt(input);

//            som = (double) (a * 1);
//            teller++;
//            uitkomst = som;
//
//            setLayout(null);
//            tekstvak.setText("" + uitkomst);


            repaint();
        }

    }
}