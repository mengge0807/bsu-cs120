//Author: Mengge Li
//Project 2
//2013/5/26
public class PayCheck {
	public static final double FEDERAL_TAX=0.22;
	public static final double STATE_TAX=0.04;
	public static final double SOCIAL_SECUITY_TAX=0.05;
	public static final double MEDICARE_TAX=0.02;
	public static final double LOCAL_TAX=0.012;
	
	private String employeeName;
	private String employeeID;
	private double hourlyWage;
	private double totalHours;
	
	public PayCheck(){
		employeeName=null;
		employeeID=null;
		hourlyWage=0.0;
		totalHours=0.0;
		}

		public PayCheck(String ininame,String iniID,double inihourlyWage,double initotalHours){
		employeeName=ininame;
		employeeID=iniID;
		hourlyWage=inihourlyWage;
		totalHours=initotalHours;
		}
	
		public double getGrossPay(){
			double grossPay;
			if (totalHours<=40)
			{grossPay=totalHours*hourlyWage;}
			else{
				grossPay=40*hourlyWage+(totalHours-40)*(1.5*hourlyWage);}
			return grossPay;
			}
		public double getFedTax(){
		    return getGrossPay()*FEDERAL_TAX;
			}

		public double getSocialSecTax(){
			return getGrossPay()*SOCIAL_SECUITY_TAX;
			}
		public double getMedicareTax(){
			return getGrossPay()*MEDICARE_TAX;
			}

		public double getStateTax(){
			return getGrossPay()*STATE_TAX;
			}

		public double getLocalTax(){
			return getGrossPay()*LOCAL_TAX;
			}
		public double getNetPay(){
			double netPay;
			netPay=getGrossPay()-getFedTax()-getSocialSecTax()-getMedicareTax()-getStateTax()-getLocalTax();
			return netPay;
			}

		public String getName(){
			return employeeName;
			}

		public String getID(){
			return employeeID;
			}

		public void raiseWage(double byPercent){
			double newWage;
			newWage=(1+byPercent/100)*hourlyWage;
			hourlyWage=newWage;
			}
		
}

