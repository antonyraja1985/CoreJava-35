package superkeyword;

public class B extends A {
	String name="raja";
	public void m1() {
		super.m1();
		
		System.out.println("B-m1 method calling");
		
	}
	
	public void getName() {
		System.out.println(super.name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		B b=new B();
		b.m1();
		b.getName();
	}
	
}
