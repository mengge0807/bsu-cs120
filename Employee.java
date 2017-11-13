
public class Employee {


		private String name;
		public double salary;
		//part 2: constructors
		public Employee (){
			name=null; //" ";
			salary=0.0;
			
		}
		public Employee( String iniName, double iniSalary){
			name=iniName; salary=iniSalary;
			
		}
		//create 
		public String getName(){
			return name;
		}
		public double getSalary(){
			return salary;	
		}
		public void rasieSalary(double rate){
			double newSalary;
			newSalary=(1+rate/100)*getSalary();
			salary=newSalary;
					
		}

	}

	

