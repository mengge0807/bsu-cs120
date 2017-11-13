//Author: Mengge Li
//Project 2
//2013/5/26
import java.util.Scanner;
import javax.swing.JOptionPane;
public class PayCheckerTester {

	private static String employeeName;

	public static void main(String[] args) {
		Scanner keyBoard=new Scanner(System.in);
		System.out.println("Please enter first employee's name: ");
		String employeeName=keyBoard.nextLine();
    
		System.out.println("Please enter first employee's ID: ");
		String employeeID=keyBoard.nextLine();
		
		System.out.println("Please enter first employee's hourly wage:  ");
		double hourlyWage=keyBoard.nextDouble();
		
		System.out.println("Please enter first employee's hours worked for last week: ");
		double totalHours=keyBoard.nextDouble();
		
		PayCheck p1=new PayCheck(employeeName, employeeID,hourlyWage, totalHours );
		
		System.out.println("Employee's ID: "+p1.getID()+", Employee's Name:"+p1.getName());
		System.out.printf("Gross pay is:%.2f\n",p1.getGrossPay());
		System.out.printf("Federal tax withheld is:%.2f\n ",p1.getFedTax());
		System.out.printf("State tax withheld is: %.2f\n",p1.getStateTax());
		System.out.printf("Local tax withheld is:%.2f\n ",p1.getLocalTax());
		System.out.printf("Social security tax withheld is:%.2f\n ",p1.getSocialSecTax());
		System.out.printf("Medicare tax withheld is:%.2f\n ",p1.getMedicareTax());
		System.out.printf("Net Pay is:%.2f \n",p1.getNetPay());
		System.out.println("Please enter 10% raise for employee1: ");
		double byPercent=keyBoard.nextDouble();
		p1.raiseWage(byPercent);
		System.out.printf(p1.getName()+"new gross pay after raise is:%.1f\n ",p1.getGrossPay());
		System.out.printf(p1.getName()+"new net pay after raise is: %.1f\n",p1.getNetPay());

		
		String Name1=JOptionPane.showInputDialog("Please enter second employee's name: ");
		String ID1=JOptionPane.showInputDialog("Please enter second employee's ID: ");
		String Wage1=JOptionPane.showInputDialog("Please enter second employee's hourly wage: ");
		double hourlyWage1=Double.parseDouble(Wage1);
	    String Hour1=JOptionPane.showInputDialog("Please enter second employee's hours worked for last week: ");
		double totalHours1=Double.parseDouble(Hour1);
		
		PayCheck p2=new PayCheck(Name1,ID1,hourlyWage1,totalHours1);
		
		JOptionPane.showMessageDialog(null,"Employee's ID is:"+p2.getID()+", Employee's name is: "+ p2.getName());

		JOptionPane.showMessageDialog(null,"Gross Pay is:"+String.format("%.2f",p2.getGrossPay()));

		JOptionPane.showMessageDialog(null,"Federal Tax withheld is:"+String.format("%.2f",p2.getFedTax()));

		JOptionPane.showMessageDialog(null,"State Tax withheld is:"+String.format("%.2f",p2.getStateTax()));
		
		JOptionPane.showMessageDialog(null,"Local Tax withheld is:"+String.format("%.2f",p2.getLocalTax()));
		
		JOptionPane.showMessageDialog(null,"Social Security Tax withheld is:"+String.format("%.2f",p2.getSocialSecTax()));
		
		JOptionPane.showMessageDialog(null,"Medicare Tax withheld is:"+String.format("%.2f",p2.getMedicareTax()));
		
		JOptionPane.showMessageDialog(null,"Net pay is:"+String.format("%.2f",p2.getNetPay()));
		
		String Percent1=JOptionPane.showInputDialog("please enter 20% raise for employee2: ");
		double byPercent1=Double.parseDouble(Percent1);
		p2.raiseWage(byPercent1);
		JOptionPane.showMessageDialog(null,p2.getName()+"new gross pay after raise is:"+String.format("%.2f",p2.getGrossPay()));
		JOptionPane.showMessageDialog(null,p2.getName()+"new net pay after raise is:"+String.format("%.2f",p2.getNetPay()));
	}
}


