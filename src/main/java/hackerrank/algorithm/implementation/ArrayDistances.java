package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class ArrayDistances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
        	for (int j = i + 1; j < n; j++) {
        		if (A[i] == A[j]) {
        			distance = (j - i) < distance ? j - i : distance;
        		}
        	}
        }
        System.out.println(distance);
    }
}
