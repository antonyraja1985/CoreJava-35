
public class LIvsEI {
	
	int phone=12456;//lazy intialization
	static String name="antony";//eager intialization
	
	
	public static void main(String[] args) {
		
		System.out.println(name);
		LIvsEI l=new LIvsEI();
		System.out.println(l.phone);
		
	}

}
