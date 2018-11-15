package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class ServiceLane {

	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int i=0; i < n; i++){
            width[i] = in.nextInt();
        }
        for(int tc = 0; tc < t; tc++){
            int i = in.nextInt();
            int j = in.nextInt();
            
            int min = 3;
            for (int p = i; p <= j; p++) {
            	min = (width[p] < min) ? width[p] : min;
            }
            System.out.println(min);
        }
    }
}
