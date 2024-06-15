package interfaceexample;

public class RhoitSharma extends BCCII  implements BCCI, CovidRule {
	
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
	
	public void vaccine() {
		System.out.println("vaccine-No");
	}
	
	public static void main(String[] args) {
		
		
		RhoitSharma r=new RhoitSharma();
		
		r.country();
	    r.jersy();
		r.bio();		
		r.salary();
		r.score();
		r.vaccine();
		
	}

	
	

}
