package interfaceexample;

public class ViratKholi extends BCCII implements BCCI {
    
	
	public void salary() {
		System.out.println("ViratKholi salary is 2cr");
	}
	
	public void bio() {
		System.out.println("ViratKholi salary is from delhi");
	}
	
	public void score() {
		System.out.println("ViratKholi runs 15000");
	}	
	
	
	public static void main(String[] args) {
		
		ViratKholi v=new ViratKholi();
		v.country();
		v.jersy();
		v.bio();		
		v.salary();
		v.score();
		int code = BCCI.CountryCode;
		
		System.out.println(code);
		
	}
}
