package hackerrank.algorithm.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MakingAnagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		String b = in.next();
		Map<Character, Integer> charCountA = getCharCount(a);
		Map<Character, Integer> charCountB = getCharCount(b);
		
		Set<Character> commonChars = charCountA.keySet();
		commonChars.retainAll(charCountB.keySet());
		
		int retained = 0;
		for (char c : commonChars) {
			retained += (2 * Math.min(charCountA.get(c), charCountB.get(c)));
		}
		
		int deleted = (a.length() + b.length()) - retained;
		System.out.println(deleted);
		
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
