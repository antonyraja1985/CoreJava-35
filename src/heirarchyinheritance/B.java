package heirarchyinheritance;

public class B extends A {

	
	public void b1() {
		System.out.println("b1 method calling");
	}
	
	public void a1() {
		System.out.println("B-a1 method calling");
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.b1();
		b.a1();
		
	}
}
