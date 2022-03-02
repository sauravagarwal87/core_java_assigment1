package lab1;

import java.util.Scanner;

public class Ex6 {
	public static int calculateDifference(int n) {
		int l, sum1, sum,squre;
	    l = (n * (n + 1) * (2 * n + 1)) / 6;
	     
	    sum1 = (n * (n + 1)) / 2;
	    squre=sum1*sum1;
	 
	    sum = Math.abs(l - squre);
	     
	    return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		
		int ans=Ex6.calculateDifference(n);
		System.out.println(ans);
		
		sc.close();
	}

}
