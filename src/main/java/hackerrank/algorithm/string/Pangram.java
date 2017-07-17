package hackerrank.algorithm.string;

import java.util.BitSet;
import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        char[] s = in.nextLine().toLowerCase().toCharArray();

        BitSet alphabets = new BitSet(26);
        for (char c : s) {
        	if (c != ' ') {
        		alphabets.set(c - 'a');
        		if (alphabets.cardinality() == 26) break;
        	}
        }
        if (alphabets.cardinality() == 26) {
        	System.out.println("pangram");
        } else {
        	System.out.println("not pangram");
        }
	}

}
