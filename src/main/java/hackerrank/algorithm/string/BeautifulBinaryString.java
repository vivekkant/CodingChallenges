package hackerrank.algorithm.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BeautifulBinaryString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] s = in.next().toCharArray();
		Set<Integer> defaulters = new TreeSet<Integer>();
		List<Integer> all = new ArrayList<Integer>();
		for (int i = 0; i < n - 2; i++) {
			if (s[i] == '0' && s[i + 1] == '1' && s[i + 2] == '0') {
				defaulters.add(i);
				all.add(i);
			}
		}
		int count = 0;
		for (int i : all) {
			if (defaulters.contains(i - 2)) {
				defaulters.remove(i);
			} else {
				count++;
			}
		}
		System.out.println(count);
	}

}
