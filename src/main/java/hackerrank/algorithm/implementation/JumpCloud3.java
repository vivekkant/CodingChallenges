package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class JumpCloud3 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int i=0; i < n; i++){
            c[i] = in.nextInt();
        }

        int jumps = 0;
        int position = 0;
        while (position < n - 1) {
        	int leap = (position + 2 >= n - 1 || c[position + 2] == 0) ? 2 : 1;
        	position += leap;
        	jumps++;
        	System.out.println("pos " + position);
        }
        System.out.println(jumps);
	}

}
