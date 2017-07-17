package hackerrank.algorithm.sorting;

import java.util.Scanner;

public class InsertionSort1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);

	}
	
    public static void insertIntoSorted(int[] ar) {
    	int n = ar.length;
		int i = ar[n - 1];
		for (int j = n - 1; j >= 0; j-- ) {
			if (j > 0 && ar[j - 1] > i) {
				ar[j] = ar[j - 1];
				printArray(ar);
			} else {
				ar[j] = i;
				printArray(ar);
				break;
			}
		} 
    }
	
	public static void printArray(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
