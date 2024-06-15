package array;

public class FindArrayMax {

	public static void main(String[] args) {
		int nos[]= {100,12,13,76,14,15,16, 45,102, 66};
		int max=nos[0];
		
		for(int i=0; i<nos.length;i++) {
			
			if(nos[i]<max) {
				max=nos[i];
			}
			
		}
		
		System.out.println(max);
	}
}
