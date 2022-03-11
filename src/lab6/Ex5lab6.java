package lab6;

import java.util.ArrayList;

import java.util.Collections;

public class Ex5lab6 {

	public static int getSecondSmallest(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int a : arr) {
			list.add(a);
		}
		Collections.sort(list);

//		int[] arr1 = new int[list.size()];
//		int i=0;
//		for(int a: list) {
//			arr1[i]=list.get(a);
//			i++;
//		}
		return list.get(1);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 30, 40 };
		System.out.println(getSecondSmallest(arr));
	}
}
