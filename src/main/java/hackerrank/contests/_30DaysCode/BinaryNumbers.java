package hackerrank.contests._30DaysCode;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int max = 0;
        int current = 0;
        while (n > 0) {
        	int b = n % 2;
        	if (b == 0) {
        		max = (current > max) ? current : max;
        		current = 0;
        	}
        	else {
        		current++;
        	}
        	n = n / 2;
        }
        max = (current > max) ? current : max;
        System.out.println(max);
	}

}
