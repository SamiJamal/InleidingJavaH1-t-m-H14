package Hoofdstuk14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;


public class praktijkH14 extends Applet {
    private int smileys;
    private int smileys2;
    private int tfInput;

    private boolean validNumber = false;
    private boolean botWin = false;
    private TextField tf;
    private Image afbeelding;

    public void init() {
        // Aantal smileys
        smileys = 23;
        this.setSize(620, 675);

        Button play = new Button("Play");
        Button reset = new Button("Reset");
        tf = new TextField("", 20);
        play.addActionListener(new playButton());
        reset.addActionListener(new resetButton());
        add(tf);
        add(play);
        add(reset);

        //Image's
        URL pad = praktijkH14.class.getResource("/resources/");
        afbeelding = getImage(pad, "smiley-icon-1.png");
    }

    class playButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (tf.getText().equals("")) {
                tf.setText("Foute invoer!");
            }

            tfInput = Integer.parseInt(tf.getText());
            textInput();
            moveAI();
            repaint();
            tf.setText("");
        }
    }

    class resetButton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            smileys = 23;
            smileys2 = 0;
            botWin = false;
            repaint();
        }
    }

    private void textInput() {
        if (tfInput > 3 || tfInput < 1) {
            validNumber = false;
            tf.setText("Foute invoer!");
        } else {
            smileys -= tfInput;
            validNumber = true;
        }
    }

    private void moveAI() {
        smileys2 = smileys;
        if (validNumber) {
            if (smileys % 4 == 0) {
                smileys -= 3;
                botWin = true;
            } else if (smileys % 4 == 1) {
                double r = Math.random();
                int random = (int) (r * 3 + 1);
                smileys -= random;
            } else if (smileys % 4 == 2) {
                smileys -= 1;
                botWin = true;
            } else if (smileys % 4 == 3) {
                smileys -= 2;
                botWin = true;
            }
            smileys2 -= smileys;
        }
        if (!validNumber) {
            smileys2 = 0;
        }
    }

    private void winLose(Graphics g) {
        if (botWin && smileys <= 0) {
            g.clearRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.RED);
            g.drawString("You've lost!", 100, 60);
        } else if (!botWin && smileys <= 0) {
            g.clearRect(0, 0, getWidth(), getHeight());
            g.setColor(Color.GREEN);
            g.drawString("You've won!", 100, 60);
        }
    }

    public void paint(Graphics g) {
        g.drawString("Amount of smileys: " + smileys, 100, 60);
        g.setColor(Color.RED);
        g.drawString("The bot took " + smileys2 + " smileys", 100, 80);
        winLose(g);

        int x = 40;
        int y = 100;
        int repeatCounter = 0;

        for (int counter = 0; counter < smileys; counter++) {
            if (repeatCounter == 5) {
                repeatCounter = 0;
                x = 40;
                y += 110;
            }
            g.drawImage(afbeelding, x, y, 100, 100, this);
            repeatCounter++;
            x += 110;
        }
    }
}