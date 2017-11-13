import edu.bsu.college.resource.Person;
import edu.bsu.college.resource.people.Staff;
import edu.bsu.college.resource.people.Student;
import edu.bsu.college.resource.people.Teacher;

public class PersonTester     {
   public static void main(String[] args)
   {
                   Person s = new Student("Nancy", 1992, "310-16-1234","Computer Science");
	      System.out.println(s);
	      System.out.println(s.getName());
	      System.out.println(s.getSSN());
	      Student s2=new Student("Lewis", 1993, "123-45-0987", "Business");
	      System.out.println(s2);
	      s2.changeMajor("Math");
	      System.out.println(s2);
	      System.out.println(s2.getName());
	      System.out.println(s2.getSSN());
	      System.out.println();
	      Teacher t = new Teacher("Tom", 1955, "310-15-7654", "Associate Professor");
	      System.out.println(t);
	      System.out.println(t.getName());
	      System.out.println(t.getSSN());
	      t.changeRanking("Professor");
	      System.out.println(t);
	      System.out.println();
	      Staff staf1=new Staff("George", 1958, "310-14-2345", " Associate director of Admission");
	      System.out.println(staf1);
	      staf1.changeTitle("Director of Admission");
	      System.out.println(staf1);
       }//ending main method
}//ending  PersonTester  class
