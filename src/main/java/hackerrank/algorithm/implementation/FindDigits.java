package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int p = n;
            int count = 0;
            while (p > 0) {
            	int digit = p % 10;
            	p = p / 10;
            	if (digit != 0 && n % digit == 0) count++;
            }
            System.out.println(count);
        }
    }
}
