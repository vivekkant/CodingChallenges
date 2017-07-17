package hackerrank.algorithm.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			String s = in.next();
			if (s.length() % 2 != 0) {
				System.out.println(-1);
				continue;
			}
			
			Map<Character, Integer> left = getCharCount(s.substring(0, s.length() / 2));
			Map<Character, Integer> right = getCharCount(s.substring(s.length() / 2));
			
			int count = 0;
			for (char c : left.keySet()) {
				int countLeft = left.get(c);
				int countRight = (right.get(c) != null) ? right.get(c) : 0;
				if (countLeft > countRight) {
					count += (countLeft - countRight);
				}
			}
			System.out.println(count);
		}
	}
	
	public static Map<Character, Integer> getCharCount(String s) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			if (charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		
		return charCount;
	}

}
