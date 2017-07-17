package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long t = in.nextLong();

		long n = 1;
		while (geometricProgression(3, 2, n) < t) n++;
		
		long counter = 3 * pow(2, n - 1);
		counter -=  (t - geometricProgression(3, 2, n - 1)) + 1;
		System.out.println(counter);
	}
	
	public static long geometricProgression(long a, long r, long n) {
		return  a * ((pow(r, n) - 1) / (r - 1));
	}

	public static long pow(long base, long exponent) {
		if (exponent == 0) return 1L;
		else return base * pow(base, exponent - 1);

	}
	

}
