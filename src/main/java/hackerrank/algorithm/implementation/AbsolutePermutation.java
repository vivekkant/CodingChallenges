package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class AbsolutePermutation {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int t = in.nextInt();

	    for(int a0 = 0; a0 < t; a0++){
	        int n = in.nextInt();
	        int k = in.nextInt();
	        
	        int[] result = permutation(n,k);
	        for(int i = 0 ; i < result.length ; ++i) {
	            System.out.print(result[i]);
	            if( i != result.length) System.out.print(" ");
	        }
	        System.out.println();
	    }
	}
	public static int[] permutation(int n, int k) {
	    
		int[] result = new int[n];
	    
		if (k == 0) {
	        for(int i = 0 ; i < n ; ++i) {
	            result[i] = i + 1;
	        }
	        return result;
	    }
	    
		if (n%2 == 1) 
			return new int[]{-1};

	    if (n%k == 0 && (n/k)%2 == 0) {
	        for(int i = 0 ; i < n ; ++i) {
	        	if ((i/k)%2 == 0) {
	        		result[i] = i + k + 1;
	        	} else {
	        		result[i] = i - k + 1;
	        	}
	        }
	    }
	    else {
	        return new int[]{-1};
	    }
	    return result;
	}

}
