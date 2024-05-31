package constructor;

public class Test {
	
	Test(){
		System.out.println("default constructor");
	}
	
	public static  void m1() {
		System.out.println("m1 method");
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();//constructor calling
		
		Test t1=new Test();//constructor calling
	
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		//how to verfiy object creation
//		1.hashcode
//		2.debug
//		3.constructor execution
		m1();//method calling
	}

}
