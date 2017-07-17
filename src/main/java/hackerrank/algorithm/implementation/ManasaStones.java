package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class ManasaStones {
	
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++) {
        	int n = in.nextInt() - 1;
        	int a = in.nextInt();    	
        	int b = in.nextInt();
        	
        	if (a > b) {
        		int temp = b;
        		b = a;
        		a = temp;
        	}
        	
        	for (int j = 0; j <= n; j++) {
        		int last = a * (n - j) + b * j;
        		System.out.print(last + " ");
        		if (a == b) break ;
        	}
        	System.out.println();
        }
    }
}
