import java.util.Random;


public class ArrayRandomnumb {
	public static void main(String[] args) {
		int[]data=new int[20];
		Random generator=new Random();
		
		for(int i=0;i<data.length;i++){
			data[i]=generator.nextInt(50)+1;
		}
		
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+" ");
		}
		
		double average=findAverage(data);
		System.out.println("\n"+"The average of 20 number is "+average);
		  
		int maxNumber=findMaxNumber(data);
		System.out.println("The maximum number is "+maxNumber);
		
		int minimumNumb=findMiniNumber(data);
		System.out.println("The minimum number is "+minimumNumb);
	}	

		public static double findAverage(int data[]){
		double total=0;
		for(int i=0;i<data.length;i++){
			total+=data[i];
		}
		return total/data.length;
	}
		
		public static int findMaxNumber(int data[]){
			int max=0;
			for(int i=0;i<data.length;i++){
				if(data[i]>max){
					max=data[i];
				}
				}
				return max;
			}
			
		public static int findMiniNumber(int data[]){
			int min=data[0];
			for(int i=0;i<data.length;i++){
				if(data[i]<min){
					min=data[i];
				}
			}
			return min;
			
		}
		}
