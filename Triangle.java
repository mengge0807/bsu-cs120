import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JComponent;



	public class Triangle extends JComponent{
		private int x1,y1,x2,y2,x3,y3;
	public Triangle(){
		x1=0;
		y1=0;
		x2=0;
		y2=0;
		x3=0;
		y3=0;
	}
	
    public Triangle (int inix1,int iniy1,int inix2,int iniy2,int inix3,int iniy3){
    	x1=inix1;y1=iniy1;x2=inix2;y2=iniy2;x3=inix3;y3=iniy3;
    }
    public void paintComponent (Graphics g){//start a method_1
		Graphics2D g2 = (Graphics2D) g;
		int [] xPoints={x1, x2,x3};
		int [] yPoints={y1,y2,y3};
		
		Polygon p=new Polygon(xPoints, yPoints, 3);
                        g2.setColor(Color.red);
		g2.draw(p);
    }
    public double getSide1(){
    	double side1;
    	side1=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    	return side1;
    }
    public double getSide2(){
    	double side2;
    	side2=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
    	return side2;
    }
    public double getSide3(){
        double side3;
        side3=Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
        return side3;
    	}
    public double getCircumference(){
    	double circumference=0;
		circumference=getSide1()+getSide2()+getSide3();
    	return circumference;
    	}
    
    	public double getArea(){
    		double area=0;
    		double s=0;
    		s=getCircumference()/2.0;
    		area=Math.sqrt(s*(s-getSide1())*(s-getSide2())*(s-getSide3()));
    		return area;
    	}  

		
    	
	}
