package constructor;

public class MultiplePMConstructor {
	
	String course;
	int fees;
	
	MultiplePMConstructor(String course, int fees){
		
	    this.course=course;
	    this.fees=fees;
		System.out.println("Course+fess constructor");
	}

   MultiplePMConstructor(String course){
		
	    this.course=course;
	   
		System.out.println("Course constructor");
	}
	
	public static void main(String[] args) {
		
		MultiplePMConstructor pm=new MultiplePMConstructor("Java",5000);
		System.out.println(pm.course);
		System.out.println(pm.fees);
		MultiplePMConstructor pm1=new MultiplePMConstructor("Java Script",500);
		System.out.println(pm1.course);
		System.out.println(pm1.fees);
		
		MultiplePMConstructor course=new MultiplePMConstructor("Java");
		
		System.out.println(course);
		
	}
}
