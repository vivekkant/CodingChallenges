package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class FairRations {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] rations = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			rations[i] = in.nextInt();
			sum += rations[i];
		}

		if (sum % 2 == 1) {
			System.out.println("NO");
		} else {
			int count = 0;
			for (int i = 0; i < n - 1; i++) {
				if (rations[i] % 2 == 1) {
					rations[i] += 1;
					rations[i + 1] += 1;
					count += 2;
				}
			}
			System.out.println(count);
		}
	}

}
