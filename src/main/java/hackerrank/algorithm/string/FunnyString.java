package hackerrank.algorithm.string;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			String s = in.next();
			boolean funny = true;
			for (int i = 1; i < s.length(); i++) {
				if (Math.abs((int)(s.charAt(i) - s.charAt(i - 1))) !=
				Math.abs((int)(s.charAt(s.length() - i) - s.charAt(s.length() - i - 1)))) {
					funny = false;
					break;
				}
			}
			System.out.println((funny)? "Funny" : "Not Funny");
		}
	}

}
