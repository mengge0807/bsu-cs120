
//Task 1
//Project name:Lab2
//Programmer:Mengge Li
//Date:05/15/13
import java.util.StringTokenizer;
public class UsingString {//Start class
	
	
	public static void main(String[] args) {//Start main method
		//Create task 2 to task 9 inside main method
	    //Task 2: Convert a string to all lowercase
		String str1 ="BALL STATE UNIVERSITY";
		String str2 =str1.toLowerCase();
		System.out.println(str2);
		
		//Task 3:Convert a string to all uppercase
		String str3 ="ball state university";
		String str4 =str3.toUpperCase();
		System.out.println(str4);
		
		//Task 4:Find out a string's length
		String str5 ="I love Ball State";
		System.out.println(str5.length());
		
		//Task 5:Letter replacement
		String str6 ="Mississippi";
		String str7 =str6.replace("issipp","our");
		System.out.println(str7);
		
		//Task 6:Trim your string
		String str8 ="    Uni    ";
		String str9 ="versity      ";
		String str10 =str8.trim()+str9.trim();
		System.out.println(str10);
		
		//Task 7:Using substring method
		String str11 ="Muncie,Indiana.";
		System.out.println(str11.substring(7, 14));
		
		//Task 8:Use StringToKenizer class
		/*3
		 * Ball
		 * State
		 * University
		 **/
		String str14 ="Ball State University";
		StringTokenizer str14Test=new StringTokenizer(str14);
		System.out.println(str14Test.countTokens());
		System.out.println(str14Test.nextToken());
		System.out.println(str14Test.nextToken());
		System.out.println(str14Test.nextToken());
		
		//Task 9:Combining tasks
		String str15 ="Meng Ge Li";
		String str16 ="@bsu.edu";
		String str17 =str15.toLowerCase();
		StringTokenizer str17Test=new StringTokenizer(str17);
		String str18 =str17Test.nextToken().substring(0, 1)+str17Test.nextToken().substring(0, 1)+str17Test.nextToken()+str16;
		System.out.println(str18);
		
		
	}//close main method
	
	

}//Close UsingString class
