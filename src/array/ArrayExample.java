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
		System.out.println("============Type1===================");
		//type-1
		int numbers[]=new int[6];	
		
		numbers[0]=10;
		numbers[1]=12;
		numbers[2]=13;
		numbers[3]=14;
		numbers[4]=15;
		numbers[5]=16;
		//numbers[6]=17;
//		numbers[6]=17; not possible in run time
		//numbers[5]=16.25f;
		
         //Testcase-1
		
		int[] totalNumbers=new int[150];
		totalNumbers[0]=20;
		totalNumbers[1]=30;
		totalNumbers[2]=40;
		
		

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
		
		
		System.out.println("============Type1===================");
		//type-2
		int nos[]= {10,12,13,14,15,16};
		
		System.out.println("=========ForEach============");
		
		for(int no:nos) {
			
			System.out.println(no);
		}
		
	}
	
	

}
