import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class opdracht105 extends Applet{

    //Declare variables:
    TextField tekstvak1;
    TextField tekstvak2;
    TextField tekstvak3;
    TextField tekstvak4;
    TextField tekstvak5;
    TextField tekstvak6;
    double getal1;
    double getal2;
    double getal3;
    double getal4;
    double getal5;
    double getal6;
    double totaal;
    Button knop;
    String tekst;

    //Give value to the variables:
    public void init(){
        setSize(600,150);


        knop = new Button("OK");
        KnopListener kl = new KnopListener();
        knop.addActionListener( kl );
        add(knop);

        tekstvak1 = new TextField("1", 5);
        tekstvak1.addActionListener( new Tekstvak1Listener() );
        add(tekstvak1);

        tekstvak2 = new TextField("2", 5);
        tekstvak2.addActionListener( new Tekstvak2Listener() );
        add(tekstvak2);

        tekstvak3 = new TextField("3", 5);
        tekstvak3.addActionListener( new Tekstvak3Listener() );
        add(tekstvak3);

        tekstvak4 = new TextField("4", 5);
        tekstvak4.addActionListener( new Tekstvak4Listener() );
        add(tekstvak4);

        tekstvak5 = new TextField("5", 5);
        tekstvak5.addActionListener( new Tekstvak5Listener() );
        add(tekstvak5);

        tekstvak6 = new TextField("6", 5);
        tekstvak6.addActionListener( new Tekstvak6Listener() );
        add(tekstvak6);

    }
    //Write code:
    public void paint(Graphics g){
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawString("Uw gemiddelde is: " , 50, 100);

        if (totaal > 5.5) {
            g.setColor(Color.green);
            g.drawString("U bent geslaagd!",50,120);
        }
        else {
            g.setColor(Color.red);
            g.drawString("U bent gezakt.",50,120);
        }
        g.drawString("" + totaal , 200, 100);

    }

    class Tekstvak1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(tekstvak1.getText());

        }
    }
    class Tekstvak2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal2 = Double.parseDouble(tekstvak2.getText());

        }
    }
    class Tekstvak3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal3 = Double.parseDouble(tekstvak3.getText());

        }
    }
    class Tekstvak4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal4 = Double.parseDouble(tekstvak4.getText());

        }
    }
    class Tekstvak5Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal5 = Double.parseDouble(tekstvak5.getText());
        }
    }
    class Tekstvak6Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal6 = Double.parseDouble(tekstvak6.getText());

        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed( ActionEvent e ) {

            getal1 = Double.parseDouble(tekstvak1.getText());
            getal2 = Double.parseDouble(tekstvak2.getText());
            getal3 = Double.parseDouble(tekstvak3.getText());
            getal4 = Double.parseDouble(tekstvak4.getText());
            getal5 = Double.parseDouble(tekstvak5.getText());
            getal6 = Double.parseDouble(tekstvak6.getText());
            totaal = (getal1 + getal2 +getal3 +getal4 + getal5 + getal6)/6;
            repaint();

        }
    }

}
