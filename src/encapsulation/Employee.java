package encapsulation;

public class Employee {

	private String employeeName;
	private int employeeId;
	private String employeeAddress;
	
	public Employee() {

	}

	public Employee(String employeeName, int employeeId, String employeeAddress) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeAddress = employeeAddress;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	

	
	
	

}
