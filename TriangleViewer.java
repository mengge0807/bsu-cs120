import javax.swing.JFrame;

public class TriangleViewer {

	public static void main(String[] args) {
        JFrame frame= new JFrame();
        frame.setSize(640, 480);
        frame.setTitle("My Triangle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Triangle t1=new Triangle(40,60,40,210,160,120);
        System.out.println("The side 1 of t1 is:"+t1.getSide1());
        System.out.println("The side 2 of t1 is:"+t1.getSide2());
        System.out.println("The side 3 of t1 is:"+t1.getSide3());
        System.out.println("The area of t1 is:"+t1.getArea());
        System.out.println("The Perimeter of t1 is:"+t1.getCircumference());
        
        Triangle t2=new Triangle(250,50,400,80,250,400);
        System.out.println("The side 1 of t2 is:"+t2.getSide1());
        System.out.println("The side 2 of t2 is:"+t2.getSide2());
        System.out.println("The side 3 of t2 is:"+t2.getSide3());
        System.out.println("The area of t2 is:"+t2.getArea());
        System.out.println("The Perimeter of t2 is:"+t2.getCircumference());
        
        frame.add(t1);
        frame.setVisible(true);
        frame.add(t2);
        frame.setVisible(true);

	}

}
