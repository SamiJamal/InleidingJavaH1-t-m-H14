package com.company.Hoofdstuk13;
import java.applet.Applet;
import java.awt.*;

public class opdracht132 extends Applet {




public void init() {
    setSize(500,300);
}

public void paint (Graphics g)
{
    int pattern=0;
    g.setColor(Color.red);
    for(int y=0;y<300;y+=24)
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