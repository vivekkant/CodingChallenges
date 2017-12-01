package hackerrank.contests._30DaysCode;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		int div = 2;
		while((div*div) <= n) {
			if (n % div == 0) return false;
			div++;
		}
		return true;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            boolean result = isPrime(in.nextInt());
            System.out.println(result ? "Prime" : "Not prime");
        }
    }

}
