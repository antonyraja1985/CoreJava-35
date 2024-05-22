
public class Demo {

	

	static {
		System.out.println("hello");
		
		Demo d=new Demo();
		System.out.println(d.hashCode());
	}
	{
		System.out.println("instance");
	}
	
	public static void main(String[] args) {
		
		System.out.println("test");
		Demo d=new Demo();
	}

}
