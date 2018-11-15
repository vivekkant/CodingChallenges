package hackerrank.algorithm.string;

import java.util.Scanner;

public class MorganAndAString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while (t-- > 0) {
			String s1 = in.next();
			String s2 = in.next();
			int i1 = 0;
			int i2 = 0;
			while (i1 < s1.length() || i2 < s2.length()) {
				if (i1 < s1.length() && i2 < s2.length()) {
					if (s1.charAt(i1) < s2.charAt(i2)) {
						System.out.print(s1.charAt(i1++));
					} else {
						System.out.print(s2.charAt(i2++));
					}
				} else if (i1 < s1.length()) {
					System.out.print(s1.charAt(i1++));
				} else {
					System.out.print(s2.charAt(i2++));
				}
			}
			System.out.println();
		}
	}
}
