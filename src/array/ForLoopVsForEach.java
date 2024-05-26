package array;

public class ForLoopVsForEach {
	
	public static void main(String[] args) {
		
		int nos[]= {10,12,13,14,15,16, 45, 66};
		
		//return
	   int size=nos.length;
	   System.out.println(size);
	   System.out.println("=================ForEach=======================");
	   //for Each
	   for(int no:nos) {
		   
		   System.out.println(no);
	   }
		
	   //for loop
	   System.out.println("=================Forloop=======================");
	   for(int i=3;i<=5;i++) {
		   
		   System.out.println( nos[i]);
	   }
	   
		
	}

}
