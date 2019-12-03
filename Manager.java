package lab2.prog2_3;

public class Manager extends Employee{

	private double bonus;
	public Manager(String name, double salary, int year, int month, int day) {
		//INVOKE SUPPER CLASS CONSTRUCTOR
		super(name, salary, year, month, day);
		
		//NO NEED TO BE REAPED IN SUB CLASS
		//this.name=name;
		//this.salary=salary;
		//this.hireDate= LocalDate.of(year, month, day);
	}
	public double getSalary() {
		//return salary+ bonus;
		
		//TO ACCESS A METHOD IN SUPPER CLASS :super.METHOD_NAME()
		return super.getSalary()+ bonus;	
	}
	public void setBonus(double b) {
		this.bonus=b;
	}

}
