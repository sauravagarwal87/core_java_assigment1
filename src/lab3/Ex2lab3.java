package lab3;

import java.util.Scanner;

public class Ex2lab3 {
	public static String getImage(String str) {
		String revstr = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			revstr=ch+revstr;
		}
		String newStr = str +"|"+ revstr;
		return newStr;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = getImage(str);
		System.out.println(ans);
		sc.close();
		
		
	}

}

//using Buffer or building method

/*
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb);
		
		sb = sb.reverse();
		
		System.out.println(sb);
*/