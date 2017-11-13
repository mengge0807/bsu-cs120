import java.util.Scanner;


public class ExchangeTester1 {

	public static void main(String[] args) {
		Scanner keyBoard=new Scanner(System.in);
		
		
        while(true){
        	System.out.println("Enter US dollar amount(Q or q to quit):");
        	String dollar=keyBoard.nextLine();
    		
        
            if(dollar.equalsIgnoreCase("q")){
            	System.out.println("You jest exited from the exchange system!");
            	break;
            }
            
            double dollarAmount=Double.parseDouble(dollar);
            CurrencyConverter c1= new CurrencyConverter(dollarAmount);
    		double euro=c1.ShowConversion();
			System.out.println(dollarAmount+" US dollar="+String.format("%5.2f",euro)+" euro");
         
        	
        	
        }
        	
       
        }
	
	}
