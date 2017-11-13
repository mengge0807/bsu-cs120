import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

public class HouseComponent extends JComponent{
	public void paintComponent (Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		
		//Task 1:Draw Basic house structure
		Rectangle box=new Rectangle(120,150,360,200);
		g2.setColor(Color.green);
		g2.fill(box);
		g2.setColor(Color.black);
		g2.draw(box);
		
		//Task 2:Draw two windows
		Rectangle box1=new Rectangle(150,190,60,40);
		g2.setColor(Color.yellow);
		g2.fill(box1);
		g2.setColor(Color.black);
		g2.draw(box1);
		
		box1.translate(240, 0);
		g2.draw(box1);
		g2.setColor(Color.yellow);
		g2.fill(box1);
		g2.setColor(Color.black);
		g2.draw(box1);
		
		Line2D.Double verticalLine=new Line2D.Double(180,190,180,230);
		g2.setColor(Color.black);
		g2.draw(verticalLine);
		Line2D.Double horizontalLine=new Line2D.Double(150,210,210,210);
		g2.setColor(Color.black);
		g2.draw(horizontalLine);
		
		Line2D.Double verticalLine1=new Line2D.Double(420,190,420,230);
		g2.setColor(Color.black);
		g2.draw(verticalLine1);
		Line2D.Double horizontalLine1=new Line2D.Double(390,210,450,210);
		g2.setColor(Color.black);
		g2.draw(horizontalLine1);
		
		//Task 3:Draw a door
		Rectangle box2=new Rectangle(240,250,120,100);
		g2.setColor(Color.black);
		g2.fill(box2);
		g2.draw(box2);
		g2.setColor(Color.white);
		g2.drawString("339 Robert",270,280);
		
		
		//Task 4:Draw a Doorknob
		Ellipse2D circle=new Ellipse2D.Double(245,300,15,15);
        g2.setColor(Color.red);
        g2.fill(circle);
        g2.draw(circle);
		
		//Task 5:Draw roof
		Line2D.Double verticalLine2=new Line2D.Double(120,150,300,75);
		g2.setColor(Color.black);
		g2.draw(verticalLine2);
		Line2D.Double verticalLine3=new Line2D.Double(300,75,480,150);
		g2.setColor(Color.black);
		g2.draw(verticalLine3);
		
		//Task 6:Draw words
		g2.setColor(Color.blue);
		g2.drawString("Mengge's House",265,113);
		
		//Task 7:sun
		Ellipse2D circle1=new Ellipse2D.Double(450,25,35,35);
        g2.setColor(Color.yellow);
        g2.fill(circle1);
        g2.draw(circle1);
		
	}

}
