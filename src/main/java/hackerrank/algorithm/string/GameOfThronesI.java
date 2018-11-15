package hackerrank.algorithm.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GameOfThronesI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Map<Character, Integer> charCount = getCharCount(s);
		
		int oddCount = 0;
		for (char c : charCount.keySet()) {
			if (charCount.get(c) % 2 == 1) oddCount++;
		}
		oddCount -= s.length() % 2;
		System.out.println((oddCount <= 0) ? "YES" : "NO");

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
