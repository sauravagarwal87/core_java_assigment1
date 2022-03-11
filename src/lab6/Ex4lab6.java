package lab6;

import java.util.HashMap;
import java.util.Iterator;

public class Ex4lab6 {
	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hm) {
		HashMap<Integer, String> hm1 = new HashMap<>();
		Iterator<Integer> itr = hm.keySet().iterator();
		while (itr.hasNext()) {
			int key = itr.next();
			int value = hm.get(key);
		
			if (value >= 90)
				hm1.put(key, "Gold");
			else if (value >= 80 && value < 90)
				hm1.put(key, "Silver");
			else if (value >= 70 && value < 80)
				hm1.put(key, "Bronze");
			else
				hm1.put(key, "Not good");
		}

		return hm1;

	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(101, 99);
		hm.put(104, 84);
		hm.put(106, 95);
		hm.put(107, 69);
		hm.put(108, 79);

		HashMap<Integer, String> hm2 = getStudents(hm);
		hm2.forEach((k, v) -> System.out.println(k + " " + v));

	}

}
