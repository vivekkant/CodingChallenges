package hackerrank.algorithm.string;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		while (t-- > 0) {
			String a = in.next();
			String b = in.next();
			char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
			boolean common = false;
			for (char c : alphabets)
				if (a.indexOf(c) != -1 && b.indexOf(c) != -1) {
					common = true;
					break;
				}
			System.out.println(common ? "YES" : "NO");
		}
	}

}
