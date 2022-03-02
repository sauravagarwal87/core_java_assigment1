package lab3;

import java.util.Scanner;

public class Ex3lab3 {
	
	public static boolean isVowel(char ch) {
		if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'&& ch != 'u') {
	            return false;
	        }
	        return true;
	}
	
	public static void alterString(String str) {
		char[] s= str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(!isVowel(s[i])) {
				
				if(s[i]=='Z') {
					s[i]='b';
				}
			
				else {
				s[i] = (char)(s[i]+1);
				
				 if (isVowel(s[i]))
                     s[i] = (char)(s[i] + 1);
			}
		}
	}
		System.out.println(s);
		//return String.valueOf(s);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		          
		 alterString(str);
	//	System.out.println(ans);
		sc.close();
	}
}
