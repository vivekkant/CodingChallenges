package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		int shifts = insertionSortPart2(ar);
		System.out.println(shifts);
	}
	
    public static int insertionSortPart2(int[] ar) {
    	int shifts = 0;
    	int n = ar.length;
    	for (int i = 1; i < n; i++) {
    		for (int j = i; j >= 1; j--) {
    			if (ar[j] < ar[j - 1]) {
    				int temp = ar[j];
    				ar[j] = ar[j - 1];
    				ar[j - 1] = temp;
    				shifts++;
    			}
    		}
    		
    		//printArray(ar);
    	}
    	return shifts;
    }
	
	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
