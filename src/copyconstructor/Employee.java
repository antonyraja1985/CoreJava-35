package copyconstructor;

public class Employee {

	String employeeName;
	int employeePhone;
	
	public Employee(){
		
	}
	public Employee(String employeeName, int employeePhone) {

		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
	}

	
    public Employee(Employee e){
	   
	   this.employeeName=e.employeeName;
	   this.employeeName=e.employeeName;
	}

	public static void main(String[] args) {

	Employee e = new Employee("Antony", 12345);//original
		
	System.out.println(e.employeeName);
	
	//sudo code
	Employee e1=new Employee(new Employee("Antony", 12345));
	
    
	
	
		

	}
}
