package array;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		int number1=10;
		int number2=12;
		int number3=13;
		int number4=14;
		int number5=15;
		int number6=16;
		
		//How to create array
		
		//type-1
		int numbers[]=new int[7];
		//type-2
		int nos[]= {10,12,13,14,15,16};
		
		numbers[0]=10;
		numbers[1]=12;
		numbers[2]=13;
		numbers[3]=14;
		numbers[4]=15;
		numbers[5]=16;
		numbers[6]=17;
//		numbers[6]=17; not possible in run time
		//numbers[5]=16.25f;
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		
		//how fetch fetch data from array
		   //1.for-loop
		   //2.for-each
		
     int size = numbers.length;//return type
		
		System.out.println("=====================");
		
		for(int i=0;i<size;i++) {
			
			System.out.println(numbers[i]);
		}
		
		
	}

}
