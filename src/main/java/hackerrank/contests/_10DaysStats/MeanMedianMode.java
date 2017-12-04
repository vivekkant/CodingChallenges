package hackerrank.contests._10DaysStats;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MeanMedianMode {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		Map<Integer, Integer> count = new TreeMap<Integer, Integer>();
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			numbers[i] = num;
			sum += numbers[i];
			if (count.get(num) == null) {
				count.put(num, 1);
			}
			else {
				count.put(num, count.get(num) + 1);
			}
		}
		
		double mean = (sum * 1.0d) / n;
		
		Arrays.sort(numbers);
		double median = (n % 2 == 0) ? 
					(numbers[(n/2) - 1] + numbers[n/2]) * 1.0d / 2 :
					 numbers[(n - 1) / 2];
					
		int maxCount = 0;
		int mode = 0;
		for (int key : count.keySet()) {
			if (count.get(key) > maxCount) {
				mode = key;
				maxCount = count.get(key);
			}
		}
		
		System.out.printf("%.1f\n",mean);
		System.out.printf("%.1f\n",median);
		System.out.println(mode);
	}

}
