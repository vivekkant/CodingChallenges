package hackerrank.algorithm.constructive;

import java.util.Scanner;

public class FlippingTheMatrix {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			
			int n = in.nextInt();
			int[][] a = new int[2 * n][2 * n];
			for (int i = 0; i < (2 * n); i++) {
				for (int j = 0; j < (2 * n); j++) {
					a[i][j] = in.nextInt();
				}
			}
			System.out.println(matrixMaxSum(a));
		}
	}
	
	public static int matrixMaxSum(int[][] a) {
		int sum = 0;
		int n = a.length / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int a1 = a[i][j];
				int a2 = a[i][(2 * n) - 1 -j];
				int a3 = a[(2 * n) - 1 - i][j];
				int a4 = a[(2 * n) - 1 - i][(2 * n) - 1 -j];
				sum += max(a1, a2, a3, a4);
			}
		}
		
		return sum;
	}
	
	public static int max(int... a) {
		int max = 0;
		for (int i : a) {
			max = max > i ? max : i;
		}
		
		return max;
	}
}
