
public class Test {
	
	public void m1() {
		
		System.out.println("m1 method calling");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Test Class");
		System.out.println("modified");
		System.out.println("new modification");
		Test t=new Test();
		
		t.m1();//interpretor
		t.m1();//interpretor
		t.m1();
		t.m1();
	}

}
