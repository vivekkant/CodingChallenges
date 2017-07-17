package hackerrank.algorithm.implementation;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixRotation {
	
	public static Scanner in;
	
	public static void main(String[] args) {
		
		in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int k = in.nextInt();
		
		int[][] original = read(m, n);
		int[][] rotated = new int[m][n];
		
		int rings = Math.min(m, n) / 2;
		for (int i = 0; i < rings; i++) {
			rotate(original, rotated, i, k);
		}
		
		print(rotated);
		
	}
	
	public static int[][] read(int m, int n) {
		
		int[][] values = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				values[i][j] = in.nextInt();
			}
		}
		
		return values;
	}
	
	public static void print(int[][] values) {
		for (int i = 0; i < values.length; i++) {
			for (int j = 0; j < values[i].length; j++) {
				System.out.print(values[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void rotate(int[][] original, int[][] rotated, int ring, int k) {

		int[] flat = ringToFlat(original, ring);
		
		int[] rflat = new int[flat.length];
		for (int i = 0; i < flat.length; i++) {
			rflat[(i + k) % flat.length] = flat[i];
		}
		
		flatToRing(rflat, rotated, ring);
		
//		System.out.println("flat-> " + ring + " " + Arrays.toString(flat));
//		System.out.println("rflat-> " + ring + " " + Arrays.toString(rflat));
	}
	
	public static int[] ringToFlat(int[][] source, int ring) {
		
		int h = source.length - (2 * ring);
		int w = source[0].length - (2 * ring);
		int length = (2 * w) + 2 * (h - 2);
		
		int[] flat = new int[length];
		int t = 0;
		int i = 0;
		int j = 0;
		while (i < (h - 1)) { //down
			flat[t] = source[ring + i][ring + j];
			i++;
			t++;
		}
		while (j < (w - 1)) { //right
			flat[t] = source[ring + i][ring + j];
			j++;
			t++;
		}
		while (i > 0) { //up
			flat[t] = source[ring + i][ring + j];
			i--;
			t++;
		}
		while (j > 0) { //left
			flat[t] = source[ring + i][ring + j];
			j--;
			t++;
		}
		
		return flat;
	}
	
	public static void flatToRing(int[] flat, int[][] destination, int ring) {
		
		int h = destination.length - (2 * ring);
		int w = destination[0].length - (2 * ring);
		
		int t = 0;
		int i = 0;
		int j = 0;
		while (i < (h - 1)) { //down
			destination[ring + i][ring + j] = flat[t];
			i++;
			t++;
		}
		while (j < (w - 1)) { //right
			destination[ring + i][ring + j] = flat[t];
			j++;
			t++;
		}
		while (i > 0) { //up
			destination[ring + i][ring + j] = flat[t];
			i--;
			t++;
		}
		while (j > 0) { //left
			destination[ring + i][ring + j] = flat[t];
			j--;
			t++;
		}
	}

}
