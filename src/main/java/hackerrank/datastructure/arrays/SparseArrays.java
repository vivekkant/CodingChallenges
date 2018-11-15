package hackerrank.datastructure.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		Map<String, Integer> count = new HashMap<String, Integer>();
		while (n-- > 0) {
			String str = in.next();
			if (count.containsKey(str)) {
				count.put(str, count.get(str) + 1);
			} else {
				count.put(str, 1);
			}
		}
		
		int q = in.nextInt();
		while (q-- > 0) {
			String str = in.next();
			if (count.containsKey(str)) {
				System.out.println(count.get(str));
			} else {
				System.out.println(0);
			}
		}
	}

}
