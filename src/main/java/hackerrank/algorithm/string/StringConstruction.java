package hackerrank.algorithm.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringConstruction {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();		
		while (n-- > 0) {
			System.out.println(getCharCount(in.next()).size());
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
