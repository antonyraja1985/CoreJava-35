package multilevelinheritance;

public class C  extends B{
	public void c1() {
		System.out.println("C1 method calling");
	}
	
	public static void main(String[] args) {
		C c=new C();
		c.c1();
		c.b1();
		c.a1();
	}
}
