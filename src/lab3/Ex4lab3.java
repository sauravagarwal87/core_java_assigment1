package lab3;

import java.util.Scanner;

public class Ex4lab3 {
	
	static int modifyNumber(int num) {
		StringBuffer sb = new StringBuffer();//create string buffer
		String str = Integer.toString(num);//Integer to string
		for(int i=0;i<str.length()-1;i++) {
			char ch = str.charAt(i);
			char ch2  = str.charAt(i+1);
			int a=Character.getNumericValue(ch);
			int b=Character.getNumericValue(ch2);
			int c=Math.abs(a-b);
			sb.append(c);
			
		}
		sb.append(str.charAt(str.length()-1));
		String Strnew = sb.toString();//String Buffer to String
		int ans = Integer.parseInt(Strnew);//String to integer
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int ans = modifyNumber(num);
		System.out.println(ans);
		
		
		sc.close();
	}
}
