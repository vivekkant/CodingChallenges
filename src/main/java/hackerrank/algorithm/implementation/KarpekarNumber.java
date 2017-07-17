package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class KarpekarNumber {
	
	public static void main(String[] args) {
		
    	Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int count = 0;
        for (int i = start; i <= end; i++) {
        	if (isKarpekarNumber(i)) {
        		System.out.print(i + " ");
        		count++;
        	}
        }
        if (count == 0) {
        	System.out.print("INVALID RANGE");
        }
	}
	
	public static boolean isKarpekarNumber(long number) {
		
		if (number == 1) return true; if (number * number < 10) return false;
		boolean result = false;
		
		String square = String.valueOf(number * number);
		int index = square.length() / 2;
		long left = Long.parseLong(square.substring(0, index));
		long right = Long.parseLong(square.substring(index));
		if (left + right == number && right > 0) {
			result = true;
			//System.out.println("square " + square + " left " + left + " right " + right);
		}
		
		return result;
	}

}
