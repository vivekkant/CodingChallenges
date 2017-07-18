package hackerrank.datastructure.arrays;

import java.util.Scanner;

public class Crush {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		long[] array = new long[n];

		while (m-- > 0) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			
			array[a - 1] += k;
			if (b < n)
				array[b] -= k;
		}
		
		long max = 0;
		long sum = 0;
		for (long p : array) {
			sum += p;
			max = sum > max ? sum : max;
		}
		
		System.out.println(max);
	}

}
