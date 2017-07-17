package hackerrank.contests._101hack48;

import java.util.Scanner;

public class TightArrays {

    static int shortestTightArray(int a, int b, int c){
        
    	int left = Math.abs(a - b);
    	int right = Math.abs(b - c);
    	return left + right + 1;
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result = shortestTightArray(a, b, c);
        System.out.println(result);
    }
}
