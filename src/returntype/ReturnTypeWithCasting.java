package returntype;

public class ReturnTypeWithCasting {

	public int m1() {

		int a = 10;
		return a;
	}

	public static void main(String[] args) {
		
		ReturnTypeWithCasting r=new ReturnTypeWithCasting();
		
		r.m1();
		
		//upcasting
		
		int a1=r.m1();
		long  m1 =a1;
			
		//downcasting
		
	   byte b=(byte)r.m1();
	    
	   int b1=r.m1();
	   
	   byte b2=(byte)b1;
	
	}

}
