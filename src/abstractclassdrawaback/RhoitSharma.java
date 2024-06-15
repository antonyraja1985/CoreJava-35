package abstractclassdrawaback;

public class RhoitSharma  extends BCCI , CovidRule{
	
	public void salary() {
		System.out.println("RhoitSharma salar is 2.5 core");
		
	}


	public void bio() {
		// TODO Auto-generated method stub
		System.out.println("RhoitSharma  is from mumbai");
	}

	
	public void score() {
		System.out.println("RhoitSharma  runs 10000");
		
	}
	
	public static void main(String[] args) {
		
		
		RhoitSharma r=new RhoitSharma();
		r.bio();
		r.country();
		r.jersy();
		r.score();
		r.salary();
	}

	
	

}
