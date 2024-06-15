package methodoverriding;

public class B extends A {
	
	public void m1() {
		System.out.println("B-m1 calling");
	}
	
	public static void m2(int a, int b) {
		int c=a+b;
		System.out.println("B-m1 calling"+c);
	}
	
	
	public static void main(String[] args) {
		
		B b=new B();
		b.m1();
		b.m2(10, 20);
	}

}
