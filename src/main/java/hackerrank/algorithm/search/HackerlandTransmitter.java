package hackerrank.algorithm.search;

import java.util.Arrays;
import java.util.Scanner;

public class HackerlandTransmitter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[] houses = new int[n];
		for (int i = 0; i < n; i++) {
			houses[i] = in.nextInt();
		}
		Arrays.sort(houses);
		
		int numOfTransmitters = 0;
		int i = 0;
		while (i < n) {
		    numOfTransmitters++;
		    int loc = houses[i] + k;
		    while (i < n && houses[i] <= loc) i++;
		    loc = houses[--i] + k;
		    while (i < n && houses[i] <= loc) i++;
		}
		System.out.println(numOfTransmitters);
	}
	
}
