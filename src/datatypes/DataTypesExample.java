package datatypes;

public class DataTypesExample {
	byte b=127;
	short s=50;
	int i=1234;
	long l=4523564567894523L;
	float f=45.2545257586584f;
	double d=45.2545257586584;
	boolean bb=true;
	char c='A';
	
	public void m1() {
		byte b=45;
		short s=50;
		int i=1234;
		long l=4523564567894523L;
		float f=45.25f;
		double d=42.25;
		boolean bb=true;
		char c='A';	
		
		
		
	}
	
	public static void main(String[] args) {
		
		DataTypesExample dt=new DataTypesExample();
		
		String name="java";
		System.out.println(dt.f);
		System.out.println(dt.d);
		
		byte b=127;
		System.out.println("============="+b);
		int i=47;
		
		i=b;//up -casting
		
		System.out.println(i);
		
		
		
	}

}
