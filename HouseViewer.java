import javax.swing.JFrame;

public class HouseViewer {

	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setSize(600,500);
		frame.setTitle("My House");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		HouseComponent component= new HouseComponent();//to be used after HouseComponent class created
		frame.add(component);      //to be used after HouseComponent class created
		
		
		
	}//Close main method

}//Close HouseViewer class
