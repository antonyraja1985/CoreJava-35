
public class Welcome {
	
	//How to create normal method
	
		//demo-method name
		//()-method signature
		//{}-method body it is used to implement bussiness logic
	
	
	   

	
	
	public static void main(String[] args) {
		
		
		System.out.println("welcome");
		
		Welcome w=new Welcome();
		
		new Welcome().demo();

        new Welcome().demo1();

	
	 } 
	
	   public void demo() {
		   int a=15;
	    	System.out.println("normal method");	
	    	System.out.println(a);
	    	
		}
		
	    
	    public void demo1() {
	    	
	    	int b=25;
	    	
	    	System.out.println("demo1 method");
	    	System.out.println(b);
	    }
	
	
}



