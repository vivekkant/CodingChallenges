package hackerrank.java;
import java.util.Arrays;
import java.util.Scanner;

public class WalkOrJump {

	public static void main(String[] args) {
		
    	Scanner in = new Scanner(System.in);
    	int t = in.nextInt();
    	System.out.println("Test cases " +  t);
    	    	
    	for(int i = 0; i < t; i++) {
    		int n = in.nextInt();
    		int m = in.nextInt();
    		System.out.println("Test case " + i + " length " + n + " jump " + m );
    		
    		int[] a = new int[n];
    		boolean[] steps = new boolean[n];
    		for ( int j = 0; j < n; j++) {
    			a[j] = in.nextInt();
    		}
    		System.out.println(Arrays.toString(a));
    		
    		// Search for paths
    		boolean solveable = isSolvable(m, a, 0) ;
    		
    		if (solveable) {
    			System.out.println("YES");
    		} else {
    			System.out.println("NO");
    		}
    	}

	}
	
	private static boolean isSolvable(int m, int[] arr, int i) {
	    if (i < 0 || arr[i] == 1) return false;
	    if ((i == arr.length - 1) || i + m > arr.length - 1) return true;

	    arr[i] = 1;
	    return isSolvable(m, arr, i + 1) || isSolvable(m, arr, i - 1) || isSolvable(m, arr, i + m);
	}

}
