package hackerrank.contests._10DaysStats;

import java.util.Scanner;

public class WeightedMean {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = in.nextInt();
		}
		
		int sum = 0;
		int wSum = 0;
		for (int i = 0; i < n; i++) {
			int weight = in.nextInt();
			sum += nums[i] * weight;
			wSum += weight;
		}
		
		double wMean = (sum * 1.0d) / wSum;
		
		System.out.printf("%.1f\n", wMean);

	}

}
