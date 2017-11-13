
public class Student {
    private String name;
    private String major;
    private double totalTestScore;
    private int testCount;
    
    public Student(){
    	name=null;
    	major=null;
    	totalTestScore=0.0;
    	testCount=0;
    }
    
    public Student(String iniName, String initialMajor){
    	name=iniName;         
    	major=initialMajor; 
    	totalTestScore=0; 
    	testCount=0;
    	
    }
    public String getName(){
    	return name;
    }
    public String getMajor(){
    	return major;
    }
    
    public void addTestScore(double score){
    	totalTestScore+=score;
    	testCount+=1;
    }
    public double getTotalTestScore(){
    	return totalTestScore;
    }
    public double getAverageTestScore(){
    	double ave=0;
    	ave=totalTestScore/testCount;
    	return ave;
    }
    public void changeMajor(String newMajor){
    
    	major=newMajor;
    }
    public void raiseTotalTestScore(double percent){
    	double newTotalTestScore;
    	newTotalTestScore=getTotalTestScore()+(percent/100)*getTotalTestScore();
    	totalTestScore=newTotalTestScore;
    }
    
}
