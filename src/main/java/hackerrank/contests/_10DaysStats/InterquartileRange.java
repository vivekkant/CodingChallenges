package hackerrank.contests._10DaysStats;

import java.util.Arrays;
import java.util.Scanner;

public class InterquartileRange {
	
	public static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		int t = in.nextInt();
		
		int[] freq = new int[t];
		
		int[] elem = new int[t];
		for (int i = 0; i < t; i++) {
			elem[i] = in.nextInt();
		}
		
		int n = 0;
		for (int i = 0; i < t; i++) {
			freq[i] = in.nextInt();
			n += freq[i];
		}
		
		int[] numbers = new int[n];
		int k = 0;
		for (int i = 0; i < t; i++) {
			for(int j = 0; j < freq[i]; j++) {
				numbers[k] = elem[i];
				k++;
			}
		}
		
		double q1, q2, q3 = 0;
		Arrays.sort(numbers);
		
		if (n % 2 == 0) {
			q2 = (numbers[(n/2) - 1] + numbers[n/2]) / 2;
			int[] lower = Arrays.copyOfRange(numbers, 0, n / 2);
			int[] upper = Arrays.copyOfRange(numbers, n / 2, n);
			q1 = median(lower);
			q3 = median(upper);
		}
		else {
			q2 = numbers[(n - 1) / 2];
			int[] lower = Arrays.copyOfRange(numbers, 0, (n - 1) / 2);
			int[] upper = Arrays.copyOfRange(numbers, ((n - 1) / 2) + 1, n);
			q1 = median(lower);
			q3 = median(upper);		
		}
		
		System.out.println(q3 - q1);
	}
	
	public static double median(int[] numbers) {
		Arrays.sort(numbers);
		return (numbers.length % 2 == 0) ? 
					((numbers[(numbers.length/2) - 1] + numbers[numbers.length/2]) * 1.0) / 2 :
					 numbers[(numbers.length - 1) / 2];
	}

}
