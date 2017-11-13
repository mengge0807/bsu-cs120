import javax.swing.JOptionPane;


public class SeasonTester {

	
	public static void main(String[] args) {
		String    monthString=JOptionPane.showInputDialog("Please enter a number for month:  ");
		int    monthInteger =Integer.parseInt(monthString);
			String    dayString=JOptionPane.showInputDialog("Please enter a number for day ");
			int    dayInteger=Integer.parseInt(dayString);
			String   yearString=JOptionPane.showInputDialog("Please enter a number for year");
			int    yearInteger=Integer.parseInt(yearString);
			Season     findSeason=new Season (monthInteger,   dayInteger,   yearInteger);
			JOptionPane.showMessageDialog (null, "The season is "+ findSeason.getDescription());
;

	}

}
