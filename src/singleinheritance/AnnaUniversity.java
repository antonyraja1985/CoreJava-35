package singleinheritance;

//super class
//parent class
//base class
public class AnnaUniversity {
	String UniverName="Anna";  
	
	public void notification() {
		System.out.println("exam starts on june 1st");
	}
	
	public static void main(String[] args) {
		
		AnnaUniversity au=new AnnaUniversity();
		System.out.println(au.UniverName);
		au.notification();
		
	}

}
