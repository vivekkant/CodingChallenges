package hackerrank.algorithm.string;

import java.util.Scanner;

public class SherlockAndAnagrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		while (t-- > 0) {
			String s = in.next();
			int n = s.length();
			int count = 0;
			
			for (int l = 1; l < n; l++) {
				for (int i = 0; i < (n - l); i++) {
					for (int j = i + 1; j < (n - l + 1); j++) {
						if (i != j) {
							String s1 = s.substring(i, i + l);
							String s2 = s.substring(j, j + l);
							if (isAnagram(s1, s2)) count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	
	public static boolean isAnagram(String s1, String s2) {
		int[] s1f = new int[26];
		int[] s2f = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			s1f[s1.charAt(i) - 'a']++;
			s2f[s2.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (s1f[i] != s2f[i]) return false;
		}
		
		return true;
	}
}
