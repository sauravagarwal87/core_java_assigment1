package lab3;

import java.util.Scanner;

public class Ex5lab3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int line=0,new_words=0; 
		StringBuffer sb = new StringBuffer();//create string buffer
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch!=' ' && ch!='\n')
				sb.append(ch);
			if(ch=='\n')
				line++;
			else if(ch==' ')
				new_words++;
		}
		System.out.println(line);
		System.out.println(new_words);
		System.out.println(sb.length());
		
		sc.close();
	}

}
