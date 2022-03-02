package lab1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		System.out.println("Enter the choice.");
		System.out.println("1.red ,2.yellow,3.green");
		Scanner sc =new Scanner(System.in);
		int Choice=sc.nextInt();
		switch(Choice) {
		case 1:
			System.out.println("Stop!");
			break;
		case 2:
			System.out.println("Redy");
			break;
		case 3:
			System.out.println("Go");
			break;
		default:
			System.out.println("Wrong Input");
		}
		
	sc.close();	
	}
	
}
