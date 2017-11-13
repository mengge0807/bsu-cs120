
public class CurrencyConverter {
	public static final double ExchangeRate=0.723955694;  //one U.S. dollar = 0.723955694 Euros
	private    double   dollarAmount;   // instance variable
	
    public CurrencyConverter (double iniDollarAmount)
    {
         dollarAmount=iniDollarAmount;
        }

   //Part 3: Method
    public double ShowConversion(){  //Start method
       double  euroAmount   =   dollarAmount  *  ExchangeRate;
        return euroAmount;
   }//close method 

}
