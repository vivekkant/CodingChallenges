package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class NonDivisibleSubset {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] count = new int[k];
		for (int i = 0; i < n; i++) {
			int value = in.nextInt();
			count[value % k]++;
		}
		
		count[0] = (count[0] > 1) ? 1 : count[0];
		
		int counts = count[0];
		for (int i = 1; i < k/2+1; i++) { 
			if (i != k - i) {
				counts += count[i] > count[k-i] ? count[i] : count[k-i];
			}
		}
		if (k % 2 == 0 || counts == 0) counts++;
		
		System.out.println(counts);
	}

}
