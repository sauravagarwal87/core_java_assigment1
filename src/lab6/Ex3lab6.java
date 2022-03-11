package lab6;

import java.util.HashMap;


public class Ex3lab6 {

	public static HashMap<Integer, Integer> countChar(int[] arr){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int a :arr) {
			hm.put(a, a*a);
		}
		
		
		return hm;
		
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		HashMap<Integer, Integer> hm = countChar(arr);
		hm.forEach((k,v)->System.out.println(k+" "+v));
		
	}
}
