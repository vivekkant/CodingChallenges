package hackerrank.algorithm.string;

import java.util.Scanner;

public class MarsExploration {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char[] sos = {'S','O','S'};
		
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != sos[i % 3]) count++;
		}
		
		System.out.println(count);
	}

}
