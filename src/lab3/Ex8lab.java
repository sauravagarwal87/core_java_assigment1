package lab3;

import java.util.Scanner;

public class Ex8lab {
	
	static boolean check(String str) {
		for (int i=0;i<str.length()-1;i++) {
			char ch= str.charAt(i);
			char ch1 = str.charAt(i+1);
			int num = Character.getNumericValue(ch);
			int num1 = Character.getNumericValue(ch1);
			if(num1<num) {
				return false;
			}
		}
		return true;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(Ex8lab.check(str));
		
		sc.close();
	}

}
