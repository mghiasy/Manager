package lab2.prog2_3;

import java.time.LocalDate;

public class Employee {
	// FOR ENCAPLSULATION --> ALL THE VARIABLES SHOULD BE DEFINED IN PRIVATE ACCESS
	// MODIFIRE AND GETTER AND SETTER METHODS SHOULD BE PUBLIC
	// IF WE DONOT HAVE ANY GETTER AND SETTER FOR A VARIABLE THEY SHOULD BE DEFINED "PROTECTED"
	
	private String name;
	private double salary;
	private LocalDate hireDate;

	public Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		this.name = aName;
		this.salary = aSalary;
		this.hireDate = LocalDate.of(aYear, aMonth, aDay);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate geHireDate() {
		return hireDate;
	}

	public double raiseSalary(double byPercent) {
		salary += (salary * byPercent) / 100;
		return salary;
	}
}
