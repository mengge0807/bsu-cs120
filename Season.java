
public class Season {
	private int month;       
	private int day;
	
    public Season(int inimonth, int iniDay)
	   {
	   month=inimonth;
	   day=iniDay;
	   }
    
    public String getDescription ()  {
    	String season=null;
    	if (month>=1&& month<=3){
    		season="Winter";
    	}
   
    	else if (month>=4&& month<=6){
    		season="Spring";

    	}
    	else if (month>=7&& month<=9){
    		season="Summer";
    	}
    	else {
    		season="Fall";
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

}

