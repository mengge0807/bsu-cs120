import javax.swing.JOptionPane;
public class CashRegisterTester {

	
	public static void main(String[] args) {
		String item1=JOptionPane.showInputDialog("Please enter 1st item's price");
		double purchase1=Double.parseDouble(item1);
		String item2=JOptionPane.showInputDialog("Please enter 2nd item's price");
		double purchase2=Double.parseDouble(item2);
		String item3=JOptionPane.showInputDialog("Please enter 3rd item's price");
		double purchase3=Double.parseDouble(item3);
		String item4=JOptionPane.showInputDialog("Please enter 4th item's price");
		double purchase4=Double.parseDouble(item4);
 
		CashRegister register=new CashRegister();
		register.recordPurchase(purchase1);
		register.recordPurchase(purchase2);
		register.recordPurchase(purchase3);
		register.recordPurchase(purchase4);
		
		String amount1=JOptionPane.showInputDialog("Please enter dollar amount");
		int dollaramount=Integer.parseInt(amount1);
		String amount2=JOptionPane.showInputDialog("Please enter quarter amount");
		int quarteramount=Integer.parseInt(amount2);
		String amount3=JOptionPane.showInputDialog("Please enter dim amount");
		int dimamout=Integer.parseInt(amount3);
		String amount4=JOptionPane.showInputDialog("Please enter nickel amount");
		int nickelamount=Integer.parseInt(amount4);
		String amount5=JOptionPane.showInputDialog("Please enter penny amount");
		int pennyamount=Integer.parseInt(amount5);
		
		register.enterPayment(dollaramount,quarteramount,dimamout,nickelamount,pennyamount);
		
		
		JOptionPane.showMessageDialog(null,"Total of items is:"+register.getItemsold());
		JOptionPane.showMessageDialog(null,"The change is given:"+String.format("%.2f",register.giveChange()));
	
	}

}
