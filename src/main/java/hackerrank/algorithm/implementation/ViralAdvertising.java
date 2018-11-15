package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class ViralAdvertising {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num = 2;
		int total = num;
		for (int i = 0; i < n - 1; i++) {
			num = (num * 3) / 2;
			total += num ;
		}
		System.out.println(total);
	}

}
