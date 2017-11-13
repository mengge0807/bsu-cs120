import javax.swing.JOptionPane;

public class TableArray {
	private int[][] dataTable;
	
	public TableArray (int row, int col){
		 dataTable = new int [row][col];
	}
         
    public void loadNumbers(){
		for(int row=0; row<dataTable.length;row++){
			for(int col=0;col<dataTable.length;col++){
			String data=JOptionPane.showInputDialog("Please enter a positive integer number an index: "+row+col);
			dataTable[row][col]=Integer.parseInt(data);
		}
		}
	}
    
	public void printNumbers() {
		String str1="";
		for(int row=0; row<dataTable.length;row++){
			for(int col=0;col<dataTable[0].length;col++){
			   str1=str1+String.format("%5d",dataTable[row][col]);
		}
			str1=str1+"\n";
		}
		JOptionPane.showMessageDialog(null,str1);
		}//close method
	
	public int rowSum(int row){
		int rowSum=0;
		for(int col=0;col<dataTable[row].length;col++){
			rowSum+=dataTable[row][col];
		}
		return rowSum;
	}
		
	public int colSum(int col){
		int colSum=0;
		for(int row=0;row<dataTable[col].length;row++){
			colSum+=dataTable[row][col];
		}
		return colSum;
	}
	
}//close class
