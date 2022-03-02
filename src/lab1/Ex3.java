package lab1;

import java.util.Scanner;

public class Ex3 {
	
	public static void fab(int n) {
		int n1=1,n2=1,n3,i;
		System.out.print(n1+" "+n2);
		for(i=2;i<n;++i)    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}
	public static int fab1(int n) {
		if(n<=1)
			return n;
		return fab1(n-1)+fab1(n-2);
	}
	
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Non-Recursive:");
		Ex3.fab(n);
		System.out.println("\nRecursive:");
		int ans=Ex3.fab1(n);
		System.out.println(ans);
		sc.close();
	}

}
