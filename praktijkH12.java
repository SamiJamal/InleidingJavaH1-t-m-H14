import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class praktijkH12 extends Applet {
    TextField tekstvak1;
    TextField tekstvak2;
    Label label;
    Label label2;
    String s, tekst, tekst2;
    int dag;
    int jaartal;


    public void init() {
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField(10);
        label = new Label("Type het contactnummer in");
        label2 = new Label("Typ telefoonnummer in");
        tekstvak1.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener(new Tekstvak2Listener());
        tekst = "";
        add(label);
        add(label2);
        add(tekstvak1);
        add(tekstvak2);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
        g.drawString(tekst2, 50, 80);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak1.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Jan";
                    break;
                case 2:
                    tekst = "Frank";
                    break;
                case 3:
                    tekst = "Sam";
                    break;
                case 4:
                    tekst = "Tim";
                    break;
                case 5:
                    tekst = "Max";
                    break;
                case 6:
                    tekst = "Samir";
                    break;
                case 7:
                    tekst = "Henkie";
                    break;
                case 8:
                    tekst = "Jemairo";
                    break;
                case 9:
                    tekst = "Niels";
                    break;
                case 10:
                    tekst = "Hugo";
                    break;
                default:
                    tekst = "Jan, Frank, Sam, Tim, Max, Samir, Henkie, Jemairo, Niels, Hugo";
                    break;
            }
            repaint();
        }
    }
    class Tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak2.getText();
            jaartal = Integer.parseInt(s);
            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                    jaartal % 400 == 06) {

                tekst = "" + jaartal + " is het telefoonnummer";
            } else {
                tekst2 = "" + jaartal + " is het telefoonnummer";
            }
            repaint();
        }
    }




}