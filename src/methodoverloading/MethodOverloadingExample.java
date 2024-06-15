package methodoverloading;

public class MethodOverloadingExample {
	
	public void add(int a, int b) {
		
		int c=a+b;
		System.out.println(c);
	}
	
  
	
   public final void add(int a, float b) {
		
		float c=a+b;
		System.out.println(c);
	}

   public static void add(int a, int b, int c) {
		
		int x=a+b+c;
		System.out.println(x);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloadingExample mo=new MethodOverloadingExample();
		mo.add(10, 10);
		add(10, 20, 30);
	}

}
