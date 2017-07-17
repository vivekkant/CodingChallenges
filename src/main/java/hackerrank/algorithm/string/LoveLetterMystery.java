package hackerrank.algorithm.string;

import java.util.Scanner;

public class LoveLetterMystery {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			char[] s = in.next().toCharArray();
			int count = 0;
			int n = s.length;
			for (int i = 0; i < (n / 2); i++) {
				int ops = Math.abs((int)(s[i] - s[n - 1 - i]));
				count += ops;
			}
			System.out.println(count);
		}
	}

}
