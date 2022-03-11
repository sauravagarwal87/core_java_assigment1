package lab6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Ex6lab6 {

	public static List<Integer> votersList(HashMap<Integer, Integer> hm) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			int key = itr.next();
			int value = hm.get(key);
			if(value>=18)
				list.add(key);
		}
		return list;
		
		
	}
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(101, 13);
		hm.put(102, 22);
		hm.put(109, 12);
		hm.put(104, 15);
		hm.put(105, 19);
		hm.put(106, 25);
		List<Integer> list = new ArrayList<Integer>();
		list = votersList(hm);
		list.forEach(e->System.out.println(e));
		
	}
}
