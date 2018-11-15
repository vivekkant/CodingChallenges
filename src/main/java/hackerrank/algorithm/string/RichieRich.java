package hackerrank.algorithm.string;

import java.util.Scanner;

public class RichieRich {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		
		char[] s = in.next().toCharArray();
		
		System.out.println(solve(s, k));

	}
	
	public static String solve(char[] s, int k) {
		String ans = "-1";
		
		int n = s.length;
		
		if (n == 1) return "9";
		
		int a = asymmetricDigits(s);
		
		if (k < a) return ans;

		int e = k - a;
		
		for (int i = 0; i < (n / 2); i++) {
			if (s[i] != s[n - 1 - i]) { // asymmetric 
				s[i] = (s[i] > s[n - 1 - i]) ? s[i] : s[n - 1 - i];
				s[n - 1 - i] = s[i];
				if (e > 0 && s[i] != '9') {
					s[i] = '9';
					s[n - 1 - i] = '9';
					e -= 1;					
				}
			} else if (e > 1 && s[i] != '9') { // symmetric but can make both 9
				s[i] = '9';
				s[n - 1 - i] = '9';
				e -= 2;
			}
		}
		
		if (n % 2 == 1 && e > 0) {
			s[n / 2] = '9';
		}
		
		
		return new String(s);
	}
	
	public static int asymmetricDigits(char[] s) {
		int a = 0;
		int n = s.length;
		
		for (int i = 0; i < (n / 2); i++) 
			if (s[i] != s[n - 1 - i]) a++;
		
		return a;
	}

}
