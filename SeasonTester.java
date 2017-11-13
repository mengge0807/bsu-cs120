import javax.swing.JOptionPane;


public class SeasonTester {

	
	public static void main(String[] args) {
		String   monthString=JOptionPane.showInputDialog("Please enter a number for month between 1 and 12");
		int    monthInteger =Integer.parseInt(monthString);
		String    dayString=JOptionPane.showInputDialog("Please enter a number for day between 1 and 31");
		int    dayInteger=Integer.parseInt(dayString);
		Season    findSeason=new Season (monthInteger, dayInteger);
		System.out.println("The season is "+ findSeason.getDescription());

	}

}
