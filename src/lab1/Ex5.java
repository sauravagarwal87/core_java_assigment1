package lab1;

import java.util.Scanner;

public class Ex5 {
	
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0)
				sum=sum+i;
			else if(i%5==0)
				sum=sum+i;
			
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int ans=Ex5.calculateSum(n);
		System.out.println(ans);
		sc.close();
	}
}
