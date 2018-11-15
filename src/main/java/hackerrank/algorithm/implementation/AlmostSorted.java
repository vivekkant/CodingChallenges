package hackerrank.algorithm.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		//Scanner in = new Scanner(new FileInputStream("d:\\temp\\hackerrank-aglo-almost-sorted-input-14.txt"));
		int n = in.nextInt();
		
		int[] original = new int[n];
		int[] sorted = new int[n];
		for (int i = 0; i < n; i++) {
			original[i] = in.nextInt();
			sorted[i] = original[i];
		}
		Arrays.sort(sorted);
		
		int first = n;
		int last = -1;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (original[i] != sorted[i]) {
				first = (i < first) ? i : first;
				last = (i > last) ? i : last;
				count++;
			}
		}
		
		if (count == 0) {
			System.out.println("yes");
		} else if (count == 1) {
			System.out.println("no");
		} else if (count == 2) {
			System.out.println("yes");
			System.out.println("swap " + (first + 1) + " " + (last + 1));
		} else {
			boolean possible = true;
			for (int i = first; i < last; i++) {
				if ((original[i + 1] > original[i])) {
					possible = false;
				}
			}
			if (possible) {
				System.out.println("yes");
				System.out.println("reverse " + (first + 1) + " " + (last + 1));
			} else {
				System.out.println("no");
			}
		}
	}
	
}
