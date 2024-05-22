
public class TaskOne {

	// global variable
	// instance variable
	String name = "antony";
	String city = "chennai";
	//static variable
	static int phone = 123456;

	// instance method
	// object - instance
	public void m1() {
		System.out.println("calling m1 method");
		
	
	}

	// static method
	public static void m2() {

		System.out.println("calling m2 static method ");
	}

	public static void main(String[] args) {

		TaskOne t = new TaskOne();// object-instance
		// new TaskOne() =1101288798

		t.m1();

		m2();
		main();

		System.out.println(t.name);
		
		System.out.println(phone);

	}

	public static void main() {

		System.out.println("duplicate main method");
	}

}
