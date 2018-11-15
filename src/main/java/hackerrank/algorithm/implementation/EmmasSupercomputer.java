package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class EmmasSupercomputer {
	
	static boolean[][] good;

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		 good = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			String s = in.next();
			for(int j = 0; j < m; j++) {
				good[i][j] = s.charAt(j) == 'G';
			}
		}
		int s = 0;
		for(int a = 0; a < n; a++) {
			for(int b = 0; b < m; b++) {
				for(int c = 0; a - c >= 0 && a + c < n && b - c >= 0 && b + c < m; c++) {
					for(int x = 0; x < n; x++) {
						for(int y = 0; y < m; y++) {
							for(int z = 0; x - z >= 0 && x + z < n && y - z >= 0 && y + z < m; z++) {
								if(valid(a, b, c, x, y, z)) {
									s = Math.max(s, (4 * c + 1) * (4 * z + 1));
								}
							}
						}
					}
				}
			}
		}
		System.out.println(s);
	}
    
	public static boolean valid(int a, int b, int c, int x, int y, int z) {
		boolean[][] cp = new boolean[good.length][good[0].length];
		for(int i = 0; i < good.length; i++) {
			for(int j = 0 ; j < good[0].length; j++) {
				cp[i][j] = good[i][j];
			}
		}
		if(!cp[a][b]) {
			return false;
		}
		cp[a][b] = false;
		for(int i = 1; i <= c; i++) {
			if(!cp[a - i][b] || !cp[a][b - i] || !cp[a + i][b] || !cp[a][b + i]) {
				return false;
			}
			cp[a - i][b] = false;
			cp[a + i][b] = false;
			cp[a][b - i] = false;
			cp[a][b + i] = false;
		}
		if(!cp[x][y]) {
			return false;
		}
		cp[x][y] = false;
		for(int i = 1; i <= z; i++) {
			if(!cp[x - i][y] || !cp[x][y - i] || !cp[x + i][y] || !cp[x][y + i]) {
				return false;
			}
			cp[x - i][y] = false;
			cp[x + i][y] = false;
			cp[x][y - i] = false;
			cp[x][y + i] = false;
		}
		return true;
	}
}
