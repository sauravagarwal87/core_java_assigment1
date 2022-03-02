package lab1;

import java.util.Scanner;

public class Ex1 {
	
	public static void SumOfCubes(int n) {
		double sum= Math.pow(n*(n+1)/2,2);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		Ex1.SumOfCubes(n);
		sc.close();
	}

}
