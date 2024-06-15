package thiskeyword;

public class Employee {

	String employeeName;
	int phone;

	Employee() {
		System.out.println("default constuctor");		
	}

	public Employee(String employeeName, int phone) {
		
		this.employeeName = employeeName;
		this.phone = phone;
		System.out.println("paramter constructor");

	}

	public void m1() {
		System.out.println("m1 method calling");
		this.m2();
	}

	public void m2() {
		System.out.println("m2 method calling");
		this.m3();
	}

	public void m3() {
		System.out.println("m2 method calling");
	}

	public static void main(String[] args) {

		Employee e = new Employee("antony", 5000);

		e.m1();
	}

}
