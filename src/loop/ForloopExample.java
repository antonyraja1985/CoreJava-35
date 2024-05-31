package loop;

import java.time.LocalDate;
import java.util.Calendar;

import com.antony.Calculator;

public class ForloopExample {
	
	public static void main(String[] args) {
		
	Calculator c=new Calculator();

     int add = c.add(10, 20);
     System.out.println(add);
     
     

		
		int a=10;
		a++;//post increment
		
		System.out.println(a);
		
		for(int i=0;i<5;i++) {
			System.out.println(i);
			
		}
	}

}
