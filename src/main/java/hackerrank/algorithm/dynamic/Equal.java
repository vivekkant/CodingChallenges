package hackerrank.algorithm.dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class Equal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testcases = in.nextInt();
		
		for (int t = 0; t < testcases; t++) {
			
			int n = in.nextInt();
			
			int min = Integer.MAX_VALUE;
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
				min = (a[i] < min) ? a[i] : min;
			}
			
			int sum[] = new int[6];
			
			for (int j = 0; j < 6; j++ ) {
				sum[j] = 0;
				for (int i = 0; i < n; i++) {
					int diff = a[i] - (min - j);
					sum[j] += getOps(diff);
				}
			}
			
			int minops = Integer.MAX_VALUE;
			for (int j = 0; j < 6; j++ ) {
				minops = (sum[j] < minops) ? sum[j] : minops;
			}
			
			System.out.println(minops);
		}
		
		
	}
	
	private static int getOps(int diff) {
		int ops = diff / 5;

		diff = diff % 5;
		ops += diff / 2;
		
		diff = diff % 2;
		ops += diff;
		
		return ops;
	}

}
