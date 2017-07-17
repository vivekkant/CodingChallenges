package hackerrank.algorithm.string;

import java.util.Scanner;

public class CommonChild {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		
		int[][] matrix = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[i].length; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					matrix[i][j] = matrix[i - 1][j - 1] + 1;
				} else {
					matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
				}
			}
		}
		System.out.println(matrix[s1.length()][s2.length()]);
	}

}
