package constructor;

public class ZeroPMConstrucctor {
	
	String instituteName="IIT";
	String course;
	int fees;
	
	public  ZeroPMConstrucctor() {
		
	}
	
	public 	ZeroPMConstrucctor(String course,int fees){
		this.course=course;
		this.fees=fees;
		
		System.out.println("parameter");
	}
	
	
	public static void main(String[] args) {
		
		
		ZeroPMConstrucctor zm=new ZeroPMConstrucctor("java", 5000);
		System.out.println(zm.course);
		System.out.println(zm.fees);
		System.out.println(zm.instituteName);
		
		ZeroPMConstrucctor zm1=new ZeroPMConstrucctor("java script", 500);
		System.out.println(zm1.course);
		System.out.println(zm1.fees);
		System.out.println(zm1.instituteName);
		
		
		ZeroPMConstrucctor zm2=new ZeroPMConstrucctor();
		
		System.out.println(zm2.instituteName);
		System.out.println(zm2.course);
		
		
		
	}

}
