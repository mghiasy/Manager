package lab2.prog2_3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee("Bob",85000.0,2019,1,1);
		Employee e2= new Employee("Harry",50000.0,2018,1,1);
		Manager m1= new Manager("Steve",40000.0,2017,1,1);
		
		
		Employee[] staff = new Employee[] {e1,e2,m1};
		printStaffData(staff);
		//printStaffData(staff);
	}
	public static void printStaffData(Employee[] e) {
		String result ="";
		for (Employee employee : e) {
			//USE GETTER METHOD INSTEAD OF VARIABLE TO ACCESS FIELDS
			//String result = "name = "+ employee.name + " ,salary = "+ employee.salary;
			 result += "name = "+ employee.getName() + " ,salary = "+ employee.getSalary() +"\n";

		}
		System.out.println(result);
		
	}

}
