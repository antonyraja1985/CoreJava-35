
public class SblackVsIsBlock {
	
	//instance
	{
		System.out.println("instance block executed.......");
		
	}
 
	
	public void m1() {
		
		System.out.println("m1 method calling");
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("main executed...........");
		
		SblackVsIsBlock s=new SblackVsIsBlock();
		s.m1();
		System.out.println(s.hashCode());
		
		SblackVsIsBlock s1=new SblackVsIsBlock();
		System.out.println(s1.hashCode());
		SblackVsIsBlock s2=new SblackVsIsBlock();
		System.out.println(s2.hashCode());
		SblackVsIsBlock s3=new SblackVsIsBlock();
		SblackVsIsBlock s4=new SblackVsIsBlock();
		SblackVsIsBlock s5=new SblackVsIsBlock();
		
	}
	
	
	//instance
	static {
		System.out.println("static block excuted.....");
		SblackVsIsBlock s3=new SblackVsIsBlock();
		System.out.println("m1 calling from static block");
		s3.m1();
	}
	
	
}
