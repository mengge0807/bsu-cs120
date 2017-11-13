
public class EmployeeTester {

	public static void main(String[] args) {
		Employee e1=new Employee("Robert Muller", 50000.00);
		System.out.println("Emlpyee Name: "+e1.getName());
		System.out.println("Emlpyee Salary: "+e1.getSalary());
		e1.rasieSalary(10);
		System.out.println("the new Salary is: "+e1.getSalary());


	}

}
