package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class SherlockSquares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
        	int a = in.nextInt();
        	int b = in.nextInt();
        	
        	double start = Math.sqrt(a);
        	int num = (int) Math.floor(start);
        	int numsq = num * num;
        	int count = 0;
        	while (numsq <= b) {
        		if (numsq >= a) count++;
        		num++;
        		numsq = num * num;
        	}
        	System.out.println(count);
        }
    }
}
