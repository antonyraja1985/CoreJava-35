package constructor;

public class PMConstructor {
	
	String course;
	int fees;
	
	public PMConstructor(String course, int fees){
		
	    this.course=course;
	    this.fees=fees;
		System.out.println("paramater constructor");
	}

 
	
	public static void main(String[] args) {
		
		PMConstructor pm=new PMConstructor("Java",5000);
		System.out.println(pm.course);
		System.out.println(pm.fees);
		PMConstructor pm1=new PMConstructor("Java Script",500);
		System.out.println(pm1.course);
		System.out.println(pm1.fees);
		
	}
}
