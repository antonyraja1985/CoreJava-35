package typecasting;

public class TypeCastingExample {
	
	public static void main(String[] args) {
		
		byte x=50;
		int i=45;
		
		i=x;//up-casting
		
		
		int y=160;
		System.out.println(i);
		
		byte b1=(byte)y; //down-casting
		
		
		int z=128;
		
		byte z1=(byte)z;
		
		System.out.println(z1);
		
		
		long l=4512356434567834567L;
		
		int i1=(int)l;
		
		System.out.println(l);
		
		double d1=23.45236;
		float f1=(float)d1;
		d1=f1;
		
	}

}
