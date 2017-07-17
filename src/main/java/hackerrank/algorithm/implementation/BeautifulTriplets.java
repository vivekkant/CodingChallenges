package hackerrank.algorithm.implementation;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BeautifulTriplets {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        
        int count = 0;
        Set<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < n; i++) {
        	int value = in.nextInt();
        	set.add(value);
        	if (set.contains(value - d) && set.contains(value - (2 * d))) {
        		count++;
        	}
        }
        System.out.println(count);
	}

}
