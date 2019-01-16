package com.company.Hoofdstuk13;
import java.awt.*;
import java.applet.Applet;

public class praktijkH13 extends Applet {

    int x = 10;
    int x2 = 0;
    int x3 = 20;
    int x4= 10;

public void init (){

}

public void paint (Graphics g){
for (int i =0; i < 5; i++){
    x += 50;
    x2 += 50;
    g.setColor(Color.black);
    g.fillRect(x, 40, 10, 40);
    g.setColor(Color.green);
    g.fillOval(x2, 6,40, 40);



}
    for (int x =0; x < 5; x++){
    x3 += 50;
    x4 += 50;
    g.setColor(Color.black);
    g.fillRect(x3, 160, 10, 40);
    g.setColor(Color.green);
    g.fillOval(x4, 132,40, 40);


}



}


}