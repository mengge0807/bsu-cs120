
public class CashRegister {
	private double purchase;
    private double payment;
    private int itemSold;
    
	double DOLLAR_VALUE=1.00;
	double QUARTER_VALUE=0.25;
	double DIME_VALUE=0.1;
	double NICKEL_VALUE=0.05;
	double PENNY_VALUE=0.01;

    public void CashRegister(){
    	purchase=0.0;         
    	payment=0.0; 
    	itemSold=0;
    }
    public void recordPurchase(double amount) {
    	purchase = purchase+amount;
    	itemSold+=1;
    }
    public void enterPayment(int dollars,  int quarters,  int dimes,  int nickels,  int pennies){
    	payment = dollars*DOLLAR_VALUE+quarters*QUARTER_VALUE+dimes*DIME_VALUE+nickels*NICKEL_VALUE+pennies*PENNY_VALUE;
    }
    public double giveChange(){
    	double change=payment-purchase;
    	purchase=0.0;         
    	payment=0.0; 
    	itemSold=0;
    	return change;
    	
    }
    public double getItemsold(){
    	return itemSold;
    }
}
