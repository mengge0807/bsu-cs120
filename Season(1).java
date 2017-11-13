import  javax.swing.JOptionPane;
public class Season {
	private int month;       
	private int day;
	private  int  year;
	
	public Season(int  iniMonth,   int iniDay,   int iniYear){
	    month = iniMonth;
	    day = iniDay;
	    year=iniYear;
	   }

    
    public String getDescription ()  {
    	String season=null;
    	switch (month) {
    	case 1:
    	case 2:
    	case 3:
    		season="Winter";
    	break;
    	case 4:
    	case 5:
    	case 6:
    		season="Spring";
    	break;
    	case 7:
    	case 8:
    	case 9:
    		season="Summer";
    	break;
    	case 10:
    	case 11:
    	case 12:
    		season="Fall";
    	default:
    		JOptionPane.showMessageDialog(null,"Invalid month input");
    	break;
    	}
    	
    	if((month==4||month==6||month==9||month==11)&&day>30){
    		JOptionPane.showMessageDialog(null,"Invalid day input");
    		System.exit(0);
    	}
   
    	if(day<=0 ||day>31){
    		JOptionPane.showMessageDialog(null,"Invalid day input");
    		System.exit(0);
    	}
    	
		if(month==2 && isLeapYear()==true && day>29){
			JOptionPane.showMessageDialog(null,"Invalid day input");
    		System.exit(0);
		}
		
		if(month==2 && isLeapYear()==false && day>28){
			JOptionPane.showMessageDialog(null,"Invalid day input");
    		System.exit(0);
		}
		
    	if(year<=0){
    		JOptionPane.showMessageDialog(null,"Invalid day year");
    		System.exit(0);
    	}
    	
    	if(month%3==0 && day>=21){
    		if(season.equalsIgnoreCase("Winter")){
    			season="Spring";
    		}
    		else if (season.equalsIgnoreCase("Spring")){
    			season="Summer";
    		}
    		else if (season.equalsIgnoreCase("Summer")){
    			season="Fall";
    		}
    		else{
    			season="Winter";
    		}
    	}
    	return season;
 }  //ending getDescription method
    
    public boolean isLeapYear(){
    	boolean leapyear;
		if(year%400==0){
		  leapyear = true;
		}
		else if(year%100==0){
			leapyear = false;
		}
		else if (year%4==0){
			leapyear = true;
		}
		else {leapyear=false;}
		return leapyear;
    }
}


