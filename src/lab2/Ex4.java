package lab2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex4 {
	public static int[] modifyArray(int a[], int n)
    {
		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < a.length; i++)
        set.add(a[i]);
		
		int[] arr  =new int[set.size()];
		int j=0;
		for(Integer i: set) {
			arr[j++] = i;
		}
		return arr;
    }

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		 int []ans = Ex4.modifyArray(arr, n);
		 for(int i=0;i<ans.length;i++) {
			 System.out.println(ans[i]);
		 }
		
		sc.close();
	}
}
