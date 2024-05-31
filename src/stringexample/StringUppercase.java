package stringexample;

import java.util.Calendar;
import java.util.Date;

public class StringUppercase {

	public void m1() {

		System.out.println("m1 method");
	}

	public int m2() {
        int a=10;
		return a;
	}

	public static void main(String[] args) {

		StringUppercase ss=new StringUppercase();
		
		String s = new String();
		s = "ggfgjklggffflffffklklfffffffffff";
		System.out.println(s.toLowerCase());

		char c = s.charAt(3);

		System.out.println(s.charAt(3));
		System.out.println(ss.m2());
		System.out.println(ss.wait());
	}

}
