package hackerrank.algorithm.implementation;

import java.util.Scanner;

public class AppendAndDelete {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String s = in.next();
	    String t = in.next();
	    int k = in.nextInt();
	    
	    int i = 0;
	    for (;i < s.length() && i < t.length(); i++) {
	    	if (s.charAt(i) != t.charAt(i)) break;
	    }
	    
	    int delete = t.length() - i;
	    int append = s.length() - i;
	    
	    int operations = delete + append;
	    
	    int difference = k - operations;
	    
	    if (difference < 0) {
	    	System.out.println("No");
	    } else if (difference % 2 == 0) {
	    	System.out.println("Yes");
	    } else if (k > t.length() + s.length()) {
	    	System.out.println("Yes");
	    } else {
	    	System.out.println("No");
	    }
	}
	
}
