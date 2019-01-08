package codechef;

import java.util.Scanner;

public class MatchedBrackets {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int depth = 0;
		int maxDepth = 0;
		int maxDepthPos = -1;
		
		int size = 0;
		int maxSize = 0;
		int maxSizePos = -1;
		
		for (int i = 1; i <= n; i++) {
			depth = (in.nextInt() == 1) ? depth + 1 : depth - 1;
			if (depth > maxDepth) {
				maxDepth = depth;
				maxDepthPos = i;
			}
		}
		
		System.out.println(maxDepth + " " + maxDepthPos);
		
		in.close();
	}

}
