package constructor;

public class ParameterConstructor {
	//variable defenition
	String course="JavaScript";//tightly coupling
	//variable declartion
	String courseOne;//loosely coupling null
	
	
   
	public void m1(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		ParameterConstructor p=new ParameterConstructor();
		
		System.out.println(p.course);
		ParameterConstructor p1=new ParameterConstructor();
		System.out.println(p1.course);
		ParameterConstructor p2=new ParameterConstructor();
		System.out.println(p2.course);
		ParameterConstructor p3=new ParameterConstructor();
		System.out.println(p3.course);
		
		System.out.println(p.courseOne);
		
		p.m1(20);
		
		p.m1(30);
		p.m1(40);
		p.m1(60);
		p.m1(80);
	}
	
}
