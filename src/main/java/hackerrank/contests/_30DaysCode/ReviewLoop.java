package hackerrank.contests._30DaysCode;

import java.util.Scanner;

public class ReviewLoop {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        while (t-- > 0) {
        	String s = in.next();
        	StringBuilder s1 = new StringBuilder();
        	StringBuilder s2 = new StringBuilder();
        	for (int i = 0; i < s.length(); i++) {
        		if (i % 2 == 0) {
        			s1.append(s.charAt(i));
        		}
        		else {
        			s2.append(s.charAt(i));
        		}
        	}
        	System.out.println(s1 + " " + s2);
        }
	}

}
