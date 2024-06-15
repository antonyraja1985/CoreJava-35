package methodoverriding;

public  class A {
	
	public final void m1() {
		System.out.println("A-m1 calling");
	}
	
	public static void m2(int a, int b) {
	
		int x=10;
		int c=a+b+x;
		System.out.println("B-m1 calling"+c);
	}

}
