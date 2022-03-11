package lab6;

import java.util.HashMap;
import java.util.Map;

public class Ex2lab6 {
	public static Map<Character, Integer> countChar(char[] arr) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : arr) {
			if (m.containsKey(c)) {

				// If char is present in charCountMap,
				// incrementing it's count by 1
				m.put(c, m.get(c) + 1);
			} else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				m.put(c, 1);
			}
		}

		return m;

	}

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'a', 'b', 'c' };
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		m = countChar(arr);
		m.forEach((k, v) -> System.out.println(k + " " + v));

	}
}