package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3lab3 {
	
	static int[] getSort(int[] a) {
		int []b =new int [a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--) {
			b[j++]=a[i];	
		}
		Arrays.sort(b);
		return b;
		
	}
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n= sc.nextInt();
		int []arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Collections.re
		//Arrays.sort(arr);
		int []ans = Ex3lab3.getSort(arr);
		
		for(int a: ans) {
			System.out.println(a);
		}
		
		sc.close();
		
	}

}
