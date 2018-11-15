package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class LisasWorkbook {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		int page = 0;
		int special = 0;
		for (int i = 0; i < n; i++) {
			int t = in.nextInt();
			page++;
			for (int j = 1; j <= t; j++) {
				if (j == page)  {
					special++;
					//System.out.println("page " + page + " chapter " + j);
				}
				if (j % k == 0 && j != t) page++;
			}
		}
		System.out.println(special);
	}

}
