package org.generation.classes;

public class Employee extends Person implements Pagable{
	private String department;
	private double salary;
	
	public Employee(String name, int age, String email, String rfc, 
					String address, String department, double salary) {
		super(name, age, email, rfc, address);
		this.department = department;
		this.salary = salary;
	}//constructor
	
	public String calculateSalary(int days) {
		double total=0.0;
		total= (this.salary*days)* 1.16;
		return String.format("%.2f", total);
	}//calculateSlary

	public String getDepartment() {
		return department;
	}//getDepartment

	public void setDepartment(String department) {
		this.department = department;
	}//setDeparment

	public double getSalary() {
		return salary;
	}// getSalary

	public void setSalary(double salary) {
		this.salary = salary;
	}// setSalary

	@Override  // Anotaciones 
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + ", getEmail()=" + getEmail()
				+ ", getAge()=" + getAge() + ", getName()=" + getName() + ", getRfc()=" + getRfc() + ", getAddress()="
				+ getAddress() + "]";
	}//toString
	

	
}//class Employee
