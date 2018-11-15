package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {
		
		char[][] cavityMap = getCavityMap();
		markCavitiesInMap(cavityMap);
		printCavityMap(cavityMap);
	}
	
	public static char[][] getCavityMap() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		char[][] cavityMap = new char[n][n];
		for (int i = 0; i < n ; i++) {
			String line = in.next();
			cavityMap[i] = line.toCharArray();
		}
		
		return cavityMap;
	}
	
	public static void markCavitiesInMap(char[][] cm) {
		for (int i = 1; i < cm.length - 1; i++) {
			for (int j = 1; j < cm[i].length - 1; j++) {
				if (cm[i - 1][j] != 'X' && cm[i][j] > cm[i - 1][j] &&
				    cm[i + 1][j] != 'X' && cm[i][j] > cm[i + 1][j] &&
				    cm[i][j - 1] != 'X' && cm[i][j] > cm[i][j - 1] &&
				    cm[i][j + 1] != 'X' && cm[i][j] > cm[i][j + 1]) {
					
					cm[i][j] = 'X';
				}
			}
		}
	}
	
	public static void printCavityMap(char[][] cavityMap) {
		for (char[] line : cavityMap) {
			System.out.println(new String(line));
		}
	}

}
