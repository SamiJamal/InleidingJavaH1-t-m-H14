import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdracht104 extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    Label label;
    String s, tekst, tekst2;
    int dag;
    int jaartal;

    public void init() {
        tekstvak = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        label = new Label("Type het maandnummer in en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak2.addActionListener( new Tekstvak2Listener());
        tekst = "";
        add(label);
        add(tekstvak);
        add(tekstvak2);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 100 );
        g.drawString(tekst2, 50, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt(s);
            switch (dag) {
                case 1:
                    tekst = "januari heeft 31 dagen";
                    break;
                case 2:
                    tekst = "februari heeft 28 dagen";
                    tekst2 = "februari heeft 29 dagen";
                    break;
                case 3:
                    tekst = "maart heeft 31 dagen";
                    break;
                case 4:
                    tekst = "april heeft 30 dagen";
                    break;
                case 5:
                    tekst = "mei heeft 31 dagen";
                    break;
                case 6:
                    tekst = "Juni heeft 30 dagen";
                    break;
                case 7:
                    tekst = "Juli heeft 31 dagen";
                    break;
                case 8:
                    tekst = "Augustus heeft 31 dagen";
                    break;
                case 9:
                    tekst = "September heeft 30 dagen";
                    break;
                case 10:
                    tekst = "Oktober heeft 31 dagen";
                    break;
                case 11:
                    tekst = "November heeft 30 dagen";
                    break;
                case 12:
                    tekst = "December heeft 31 dagen";
                    break;
                default:
                    tekst = "U hebt een verkeerd nummer ingetikt ..!";
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
                            jaartal % 400 == 0) {

                        tekst = "" + jaartal + " is een schrikkeljaar";
                    } else {
                        tekst2 = "" + jaartal + " is geen schrikkeljaar";
                    }
                    repaint();
                }
            }


        }