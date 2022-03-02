package lab2;

import java.util.Scanner;

public class Ex2 {
	static void rvereseArray(int arr[]){
		int temp;
		int start=0;
		int end=arr.length-1;
  
		while (start < end)
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
}    
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Ex2.rvereseArray(arr);
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
		sc.close();
	}

}
