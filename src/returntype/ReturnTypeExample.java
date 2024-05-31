package returntype;

public class ReturnTypeExample {
	
	public int m1() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	
		return c;
	}
	
	public void m2() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	
		return c;
	}
	public int m3() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);	
		
		return c;
		int x=10;
	}
	
	public static void main(String[] args) {
		
		ReturnTypeExample r=new ReturnTypeExample();
		
	    int c = r.m1();		
		int x=100;		
		int y=c;
				
		int z=x*y;
		System.out.println(z);
		
		int d=10;
		Integer f=20;
		
		
	}

}
