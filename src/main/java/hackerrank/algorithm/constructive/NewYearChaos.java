package hackerrank.algorithm.constructive;

import java.util.Scanner;

public class NewYearChaos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			
			int bribes = numBribes(a);
			System.out.println(bribes < 0 ? "Too chaotic" : bribes);
		}
	}
	
	public static int numBribes(int[] a) {

		int bribes = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] - (i + 1) > 2) return -1;
			for (int j = Math.max(0, a[i] - 2); j < i; j++) {
				if (a[j] > a[i]) bribes++;
			}
		}
				
		return bribes;
	}

}
