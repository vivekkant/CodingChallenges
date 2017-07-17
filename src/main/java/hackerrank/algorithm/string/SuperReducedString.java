package hackerrank.algorithm.string;

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {
    
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Stack<Character> box = new Stack<Character>();
        
        for(char c : s.toCharArray()) {
        	if(!box.isEmpty() && box.peek() == c) {
        		box.pop();
        	} else {
        		box.push(c);
        	}
        }
        if (box.size() == 0) System.out.println("Empty String");
        else {
            for (int i = 0; i < box.size(); i++) {
            	System.out.print(box.get(i));
            }
            System.out.println();        	
        }
    }
}
