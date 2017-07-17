package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class GridSearch {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int testCases = in.nextInt();
		for (int t = 0; t < testCases; t++) {
			int R = in.nextInt();
			int C = in.nextInt();
			char[][] grid = read2DCharArray(in, R, C);
			
			int r = in.nextInt();
			int c = in.nextInt();
			char[][] pattern = read2DCharArray(in, r, c);
			
			String result = (searchPatternInGrid(grid, pattern)) ? "YES" : "NO";
			System.out.println(result);
		}
	}
	
	public static char[][] read2DCharArray(Scanner in, int rows, int cols) {

		char[][] grid = new char[rows][cols];
		for (int i = 0; i < rows ; i++) {
			String line = in.next();
			grid[i] = line.toCharArray();
		}
		
		return grid;
	}
	
	public static boolean searchPatternInGrid(char[][] grid, char[][] pattern) {
		
		for (int i = 0; i <= grid.length - pattern.length; i++) {
			for (int j = 0; j <= grid[0].length - pattern[0].length; j++) {
				if (searchPatternInGridAtIndex(grid, pattern, i, j)) {
					//System.out.println("Match at : " + i + " " + j);
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static boolean searchPatternInGridAtIndex(char[][] grid, char[][] pattern, int r, int c) {
		
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < pattern[i].length; j++) {
				if (grid[r + i][c + j] != pattern[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}

}
