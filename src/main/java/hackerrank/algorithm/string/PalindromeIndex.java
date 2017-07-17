package hackerrank.algorithm.string;

import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			char[] s = in.next().toCharArray();
			int index = -1;
			int n = s.length;
			for (int i = 0; i < (n / 2); i++) {
				if (s[i] != s[n - 1 - i]) {
					if ((s[i + 1] == s[n - 1 - i]) && (s[i + 2] == s[n - 1 - i - 1])) index = i;
					else if ((s[i] == s[n - 1 - i - 1]) && (s[i + 1] == s [n - 1 - i - 2])) index = n - 1 - i;
					break;
				}
			}
			System.out.println(index);
		}
	}

}
