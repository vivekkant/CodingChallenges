package hackerrank.algorithm.string;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<Character> gems = null;
		while(n-- > 0) {
			String s = in.next();
			Set<Character> stone = new HashSet<Character>();
			for (char c : s.toCharArray()) {
				stone.add(c);
			}
			if (gems == null) {
				gems = stone;
			} else {
				gems.retainAll(stone);
			}
		}
		System.out.println(gems.size());
	}

}
