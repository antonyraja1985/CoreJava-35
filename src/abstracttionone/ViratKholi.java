package abstracttionone;

public class ViratKholi extends BCCI {
    
	
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
		
		v.bio();
		v.country();
		v.jersy();
		v.score();
		v.salary();
		
	}
}
