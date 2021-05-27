//Applet
import java.applet.Applet;
import java.awt.*;
public class Graphicsdemo extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.pink);
//g.drawString("Graphics demo",50,50);
//g.drawLine(200,30,20,30);
//g.drawRect(170,100,300,300);
//g.fillRect(170,100,300,300);
//g.drawOval(70,200,300,300);
//g.fillOval(70,200,300,300);
g.drawArc(90,150,300,300,360,270);
g.fillArc(90,150,300,300,360,270);
}
}