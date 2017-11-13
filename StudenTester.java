import java.util.Scanner;


public class StudenTester {

	public static void main(String[] args) {
		Scanner keyBoard=new Scanner(System.in);
		System.out.println("Please enter a student's name:");
		String name=keyBoard.nextLine();
	
		System.out.println("Please enter a student's major:");
		String major=keyBoard.nextLine();
		Student t1=new Student(name,major);
		System.out.println("Please enter a student's test 1 score:");
		t1.addTestScore(keyBoard.nextDouble());
		System.out.println("Please enter a student's test 2 score:");
		t1.addTestScore(keyBoard.nextDouble());
		System.out.println("Please enter a student's test 3 score:");
		t1.addTestScore(keyBoard.nextDouble());
	
	
		System.out.println("The student name is "+t1.getName());
		System.out.println("The student major is "+t1.getMajor());
		System.out.println("The total score is "+t1.getTotalTestScore());
		System.out.println("The average test score is "+t1.getAverageTestScore());
		
	
		Scanner keyBoard1=new Scanner(System.in);
		System.out.println("Please enter a student's new major:");
		t1.changeMajor(keyBoard1.nextLine());
		
		System.out.println("Please enter a percentage like 10 for raise total test score for 10%:");
		t1.raiseTotalTestScore(keyBoard1.nextDouble());
		
		System.out.println("The student name is "+t1.getName());
		System.out.println("The student new major is "+t1.getMajor());
		System.out.println("The total score is "+t1.getTotalTestScore());
		System.out.println("The average test score is "+t1.getAverageTestScore());
		
	}

}
