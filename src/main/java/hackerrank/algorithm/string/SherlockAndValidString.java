package hackerrank.algorithm.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SherlockAndValidString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		
		Map<Character, Integer> charCount = getCharCount(s);
		int countOne = 0;
		for (int i : charCount.values())
			if (i == 1) countOne++;
		Set<Integer> countSet = new HashSet<>(charCount.values());
		Integer[] counts = new Integer[countSet.size()];
		countSet.toArray(counts);
		
		boolean alreadyValid  = (counts.length == 1);
		boolean singleCharInvalid = (counts.length == 2 && countOne == 1);

		boolean singleCharDelete = false;
		if (counts.length == 2) {
			int minCount = Math.min(counts[0], counts[1]);
			int deletions = 0;
			for (int count : charCount.values()) {
				deletions += (count - minCount);
			}
			singleCharDelete = (deletions == 1);
		}
		
		boolean solvable = alreadyValid || singleCharInvalid || singleCharDelete;
		System.out.println(solvable ? "YES" : "NO");
		
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
