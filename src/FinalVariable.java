
public class FinalVariable {

	final int accountNo = 34567;
	int phoneNo = 12345;
//	accountNo = 45236;
	
	final static int speed=45;

	public void m1() {

		System.out.println(accountNo);
		System.out.println(speed);
	}
	
	public static void m2() {

		//System.out.println(accountNo);
		System.out.println(speed);
	}

	public static void main(String[] args) {

		FinalVariable f = new FinalVariable();

	}
}
