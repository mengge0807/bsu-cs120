import javax.swing.JOptionPane;


public class TableArrayTester {

	public static void main(String[] args) {
		String strRow=JOptionPane.showInputDialog("Please enter a row number for the two dimensional array");
		
		String strCol=JOptionPane.showInputDialog("Please enter a column number for the two dimensional array");
		int intRow=Integer.parseInt(strRow);
			int intCol=Integer.parseInt(strCol);
			TableArray ta=new TableArray(intRow, intCol);
			ta.loadNumbers();
			ta.printNumbers();

			JOptionPane.showMessageDialog(null, "The sum of the first row is: "+ ta.rowSum(0));
			JOptionPane.showMessageDialog(null, "The sum of the second row is: "+ ta.rowSum(1));
			JOptionPane.showMessageDialog(null, "The sum of the first column is: "+ ta.colSum(0));
			JOptionPane.showMessageDialog(null, "The sum of the second column is: "+ ta.colSum(1));   

	}

}
