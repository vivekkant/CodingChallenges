package hackerrank.algorithm.string;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while(n-- > 0) {
			String s = in.next();
			int count = 0;
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) == s.charAt(i - 1)) count++;
			}
			System.out.println(count);
		}
	}

}
