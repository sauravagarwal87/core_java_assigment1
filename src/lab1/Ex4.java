package lab1;

import java.util.Scanner;

public class Ex4 {
	
	public static boolean isPrime(int n)
	{
	if (n <= 1)
	    return false;
	
	for (int i = 2; i < n; i++)
	    if (n % i == 0)
	        return false;
	 
	return true;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		Ex4.isPrime(n);
		for(int i=2;i<=n;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
		sc.close();	
	}
	
}
