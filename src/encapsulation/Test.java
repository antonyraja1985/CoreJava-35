package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmployeeName("Raja");
		e.setEmployeeId(1000);
		System.out.println(e.getEmployeeName());
		System.out.println(e.getEmployeeId());
		Employee e1=new Employee("antony",1001,"chennai");
		System.out.println(e1.getEmployeeName());
		System.out.println(e1.getEmployeeId());
	}

}
