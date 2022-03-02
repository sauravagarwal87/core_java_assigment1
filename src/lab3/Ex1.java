package lab3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the String seprated by commas:");
		
		String input = sc.nextLine();
		
		System.out.println(input);
		
		StringTokenizer tokenizer = new StringTokenizer(input, ",");
		
		System.out.println(input);
		
		int num = 0,sum = 0;
		
		while(tokenizer.hasMoreTokens()) {//for loop
			String str = tokenizer.nextToken();//give u next next value
			num =Integer.parseInt(str);
			System.out.println(num);
			sum=num+sum;
		}
		System.out.println("Sum:");
		System.out.println(sum);
		
		sc.close();
	}

}
