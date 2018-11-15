package hackerrank.contests._10DaysStats;

import java.util.Scanner;

public class StandardDeviation {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = in.nextInt();
		
		double sum = 0;
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
			sum += nums[i];
		}
		
		double mean = (sum * 1.0) / n;
		double ssum = 0;
		for (int i = 0; i < n; i++) {
			ssum += (nums[i] - mean) * (nums[i] - mean);
		}
		double sd = Math.sqrt(ssum / n);
		
		System.out.printf("%.1f\n", sd);
	}

}
