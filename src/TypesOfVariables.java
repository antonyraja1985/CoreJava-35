
public class TypesOfVariables {
	
	int phone=12345;
	
	static String name="antony";
	final int accountNo=456123;

	public void m1() {
		
		int a=10;

		System.out.println("m1 intance method calling");
		System.out.println(a);
	    System.out.println(phone);
	    System.out.println(name);
	    System.out.println(accountNo);
	}

	//ctrl+shift+f
	public static void m2() {
		int b=20;
        
        System.out.println(name);
		System.out.println("m2 static method calling");
		
	}

	public static void main(String[] args) {

		System.out.println("main method executed");
		
		TypesOfVariables t=new TypesOfVariables();
		t.m1();
		
		m2();
	}

}
