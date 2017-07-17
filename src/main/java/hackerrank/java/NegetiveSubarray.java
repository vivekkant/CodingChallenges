package hackerrank.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NegetiveSubarray {

    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	
    	int[] a = new int[n];
    	for(int i = 0; i < n; i++) {
    		a[i] = in.nextInt();
    	}
    	
    	int neg = 0;
    	for(int l = 1; l <= n; l++) {
    		for(int s = 0; s < n - l + 1; s++ ) {
    			int sum = 0;
    			for(int i = 0; i < l; i++) {
    				sum = sum + a[s+i] ;
    				System.out.print(a[s+i] + " ");
    			}
    			System.out.println( " s=" + sum );
    			if (sum < 0) neg++ ;
    		}
    	}
    	
    	System.out.println("Negetive Array = " + neg);
    	
    }
}