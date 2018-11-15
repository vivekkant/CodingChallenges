package hackerrank.algorithm.implementation;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Scanner;

public class FlatlandSpaceStation {
    
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        
        int[] spacestations = new int[m];
        for (int i = 0; i < m; i++) {
        	spacestations[i] = in.nextInt();
        }
        Arrays.sort(spacestations);
        
        int max = spacestations[0];
        for (int i = 0; i < m; i++) {
        	int distance;
        	if ((i == m - 1)) {
        		distance = (n - 1) - spacestations[m - 1];
        	} else {
        		int space = spacestations[i + 1] - spacestations[i];
        		if (space == 1) {
        			distance = 0;
        		} else {
        			distance = space / 2;
        		}
        	}
        	
        	max = distance > max ? distance : max;
        }        
        
        System.out.println(max);
	}
}
