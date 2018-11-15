package hackerrank.contests._10DaysStats;

import java.util.Arrays;
import java.util.Scanner;

public class Quartiles {
	
	public static int median(int[] numbers) {
		Arrays.sort(numbers);
		return (numbers.length % 2 == 0) ? 
					(numbers[(numbers.length/2) - 1] + numbers[numbers.length/2]) / 2 :
					 numbers[(numbers.length - 1) / 2];
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		
		for (int i = 0; i < n; i++) {
			int num = in.nextInt();
			numbers[i] = num;
		}	
		
		int q1, q2, q3 = 0;
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
		
		System.out.println(q1);
		System.out.println(q2);
		System.out.println(q3);
	}

}
